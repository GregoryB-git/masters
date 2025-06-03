package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.Buffer;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.Loader.Callback;
import com.google.android.exoplayer2.upstream.Loader.LoadErrorAction;
import com.google.android.exoplayer2.upstream.Loader.Loadable;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

final class SingleSampleMediaPeriod
  implements MediaPeriod, Loader.Callback<SourceLoadable>
{
  private static final int INITIAL_SAMPLE_SIZE = 1024;
  private final DataSource.Factory dataSourceFactory;
  private final DataSpec dataSpec;
  private final long durationUs;
  private final MediaSourceEventListener.EventDispatcher eventDispatcher;
  public final Format format;
  private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
  public final Loader loader;
  public boolean loadingFinished;
  public boolean loadingSucceeded;
  public boolean notifiedReadingStarted;
  public byte[] sampleData;
  public int sampleSize;
  private final ArrayList<SampleStreamImpl> sampleStreams;
  private final TrackGroupArray tracks;
  @Nullable
  private final TransferListener transferListener;
  public final boolean treatLoadErrorsAsEndOfStream;
  
  public SingleSampleMediaPeriod(DataSpec paramDataSpec, DataSource.Factory paramFactory, @Nullable TransferListener paramTransferListener, Format paramFormat, long paramLong, LoadErrorHandlingPolicy paramLoadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher paramEventDispatcher, boolean paramBoolean)
  {
    dataSpec = paramDataSpec;
    dataSourceFactory = paramFactory;
    transferListener = paramTransferListener;
    format = paramFormat;
    durationUs = paramLong;
    loadErrorHandlingPolicy = paramLoadErrorHandlingPolicy;
    eventDispatcher = paramEventDispatcher;
    treatLoadErrorsAsEndOfStream = paramBoolean;
    tracks = new TrackGroupArray(new TrackGroup[] { new TrackGroup(new Format[] { paramFormat }) });
    sampleStreams = new ArrayList();
    loader = new Loader("Loader:SingleSampleMediaPeriod");
    paramEventDispatcher.mediaPeriodCreated();
  }
  
  public boolean continueLoading(long paramLong)
  {
    if ((!loadingFinished) && (!loader.isLoading()))
    {
      DataSource localDataSource = dataSourceFactory.createDataSource();
      TransferListener localTransferListener = transferListener;
      if (localTransferListener != null) {
        localDataSource.addTransferListener(localTransferListener);
      }
      paramLong = loader.startLoading(new SourceLoadable(dataSpec, localDataSource), this, loadErrorHandlingPolicy.getMinimumLoadableRetryCount(1));
      eventDispatcher.loadStarted(dataSpec, 1, -1, format, 0, null, 0L, durationUs, paramLong);
      return true;
    }
    return false;
  }
  
  public void discardBuffer(long paramLong, boolean paramBoolean) {}
  
  public long getAdjustedSeekPositionUs(long paramLong, SeekParameters paramSeekParameters)
  {
    return paramLong;
  }
  
  public long getBufferedPositionUs()
  {
    long l;
    if (loadingFinished) {
      l = Long.MIN_VALUE;
    } else {
      l = 0L;
    }
    return l;
  }
  
  public long getNextLoadPositionUs()
  {
    long l;
    if ((!loadingFinished) && (!loader.isLoading())) {
      l = 0L;
    } else {
      l = Long.MIN_VALUE;
    }
    return l;
  }
  
  public TrackGroupArray getTrackGroups()
  {
    return tracks;
  }
  
  public void maybeThrowPrepareError()
    throws IOException
  {}
  
  public void onLoadCanceled(SourceLoadable paramSourceLoadable, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    eventDispatcher.loadCanceled(dataSpec, SourceLoadable.access$100(paramSourceLoadable).getLastOpenedUri(), SourceLoadable.access$100(paramSourceLoadable).getLastResponseHeaders(), 1, -1, null, 0, null, 0L, durationUs, paramLong1, paramLong2, SourceLoadable.access$100(paramSourceLoadable).getBytesRead());
  }
  
  public void onLoadCompleted(SourceLoadable paramSourceLoadable, long paramLong1, long paramLong2)
  {
    sampleSize = ((int)SourceLoadable.access$100(paramSourceLoadable).getBytesRead());
    sampleData = SourceLoadable.access$200(paramSourceLoadable);
    loadingFinished = true;
    loadingSucceeded = true;
    eventDispatcher.loadCompleted(dataSpec, SourceLoadable.access$100(paramSourceLoadable).getLastOpenedUri(), SourceLoadable.access$100(paramSourceLoadable).getLastResponseHeaders(), 1, -1, format, 0, null, 0L, durationUs, paramLong1, paramLong2, sampleSize);
  }
  
  public Loader.LoadErrorAction onLoadError(SourceLoadable paramSourceLoadable, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
  {
    long l = loadErrorHandlingPolicy.getRetryDelayMsFor(1, durationUs, paramIOException, paramInt);
    boolean bool = l < -9223372036854775807L;
    if ((bool) && (paramInt < loadErrorHandlingPolicy.getMinimumLoadableRetryCount(1))) {
      paramInt = 0;
    } else {
      paramInt = 1;
    }
    Loader.LoadErrorAction localLoadErrorAction;
    if ((treatLoadErrorsAsEndOfStream) && (paramInt != 0))
    {
      loadingFinished = true;
      localLoadErrorAction = Loader.DONT_RETRY;
    }
    else if (bool)
    {
      localLoadErrorAction = Loader.createRetryAction(false, l);
    }
    else
    {
      localLoadErrorAction = Loader.DONT_RETRY_FATAL;
    }
    eventDispatcher.loadError(dataSpec, SourceLoadable.access$100(paramSourceLoadable).getLastOpenedUri(), SourceLoadable.access$100(paramSourceLoadable).getLastResponseHeaders(), 1, -1, format, 0, null, 0L, durationUs, paramLong1, paramLong2, SourceLoadable.access$100(paramSourceLoadable).getBytesRead(), paramIOException, localLoadErrorAction.isRetry() ^ true);
    return localLoadErrorAction;
  }
  
  public void prepare(MediaPeriod.Callback paramCallback, long paramLong)
  {
    paramCallback.onPrepared(this);
  }
  
  public long readDiscontinuity()
  {
    if (!notifiedReadingStarted)
    {
      eventDispatcher.readingStarted();
      notifiedReadingStarted = true;
    }
    return -9223372036854775807L;
  }
  
  public void reevaluateBuffer(long paramLong) {}
  
  public void release()
  {
    loader.release();
    eventDispatcher.mediaPeriodReleased();
  }
  
  public long seekToUs(long paramLong)
  {
    for (int i = 0; i < sampleStreams.size(); i++) {
      ((SampleStreamImpl)sampleStreams.get(i)).reset();
    }
    return paramLong;
  }
  
  public long selectTracks(TrackSelection[] paramArrayOfTrackSelection, boolean[] paramArrayOfBoolean1, SampleStream[] paramArrayOfSampleStream, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    for (int i = 0; i < paramArrayOfTrackSelection.length; i++)
    {
      Object localObject = paramArrayOfSampleStream[i];
      if ((localObject != null) && ((paramArrayOfTrackSelection[i] == null) || (paramArrayOfBoolean1[i] == 0)))
      {
        sampleStreams.remove(localObject);
        paramArrayOfSampleStream[i] = null;
      }
      if ((paramArrayOfSampleStream[i] == null) && (paramArrayOfTrackSelection[i] != null))
      {
        localObject = new SampleStreamImpl(null);
        sampleStreams.add(localObject);
        paramArrayOfSampleStream[i] = localObject;
        paramArrayOfBoolean2[i] = true;
      }
    }
    return paramLong;
  }
  
  public final class SampleStreamImpl
    implements SampleStream
  {
    private static final int STREAM_STATE_END_OF_STREAM = 2;
    private static final int STREAM_STATE_SEND_FORMAT = 0;
    private static final int STREAM_STATE_SEND_SAMPLE = 1;
    private boolean notifiedDownstreamFormat;
    private int streamState;
    
    private SampleStreamImpl() {}
    
    private void maybeNotifyDownstreamFormat()
    {
      if (!notifiedDownstreamFormat)
      {
        SingleSampleMediaPeriod.access$300(SingleSampleMediaPeriod.this).downstreamFormatChanged(MimeTypes.getTrackType(format.sampleMimeType), format, 0, null, 0L);
        notifiedDownstreamFormat = true;
      }
    }
    
    public boolean isReady()
    {
      return loadingFinished;
    }
    
    public void maybeThrowError()
      throws IOException
    {
      SingleSampleMediaPeriod localSingleSampleMediaPeriod = SingleSampleMediaPeriod.this;
      if (!treatLoadErrorsAsEndOfStream) {
        loader.maybeThrowError();
      }
    }
    
    public int readData(FormatHolder paramFormatHolder, DecoderInputBuffer paramDecoderInputBuffer, boolean paramBoolean)
    {
      maybeNotifyDownstreamFormat();
      int i = streamState;
      if (i == 2)
      {
        paramDecoderInputBuffer.addFlag(4);
        return -4;
      }
      if ((!paramBoolean) && (i != 0))
      {
        paramFormatHolder = SingleSampleMediaPeriod.this;
        if (loadingFinished)
        {
          if (loadingSucceeded)
          {
            timeUs = 0L;
            paramDecoderInputBuffer.addFlag(1);
            paramDecoderInputBuffer.ensureSpaceForWrite(sampleSize);
            paramFormatHolder = data;
            paramDecoderInputBuffer = SingleSampleMediaPeriod.this;
            paramFormatHolder.put(sampleData, 0, sampleSize);
          }
          else
          {
            paramDecoderInputBuffer.addFlag(4);
          }
          streamState = 2;
          return -4;
        }
        return -3;
      }
      format = format;
      streamState = 1;
      return -5;
    }
    
    public void reset()
    {
      if (streamState == 2) {
        streamState = 1;
      }
    }
    
    public int skipData(long paramLong)
    {
      maybeNotifyDownstreamFormat();
      if ((paramLong > 0L) && (streamState != 2))
      {
        streamState = 2;
        return 1;
      }
      return 0;
    }
  }
  
  public static final class SourceLoadable
    implements Loader.Loadable
  {
    private final StatsDataSource dataSource;
    public final DataSpec dataSpec;
    private byte[] sampleData;
    
    public SourceLoadable(DataSpec paramDataSpec, DataSource paramDataSource)
    {
      dataSpec = paramDataSpec;
      dataSource = new StatsDataSource(paramDataSource);
    }
    
    public void cancelLoad() {}
    
    public void load()
      throws IOException, InterruptedException
    {
      dataSource.resetBytesRead();
      try
      {
        dataSource.open(dataSpec);
        byte[] arrayOfByte;
        StatsDataSource localStatsDataSource;
        for (int i = 0; i != -1; i = localStatsDataSource.read(arrayOfByte, i, arrayOfByte.length - i))
        {
          i = (int)dataSource.getBytesRead();
          arrayOfByte = sampleData;
          if (arrayOfByte == null) {
            sampleData = new byte['Ѐ'];
          } else if (i == arrayOfByte.length) {
            sampleData = Arrays.copyOf(arrayOfByte, arrayOfByte.length * 2);
          }
          localStatsDataSource = dataSource;
          arrayOfByte = sampleData;
        }
        return;
      }
      finally
      {
        Util.closeQuietly(dataSource);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.SingleSampleMediaPeriod
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */