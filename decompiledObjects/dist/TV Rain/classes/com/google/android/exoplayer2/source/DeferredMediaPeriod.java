package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import java.io.IOException;

public final class DeferredMediaPeriod
  implements MediaPeriod, MediaPeriod.Callback
{
  private final Allocator allocator;
  private MediaPeriod.Callback callback;
  public final MediaSource.MediaPeriodId id;
  @Nullable
  private PrepareErrorListener listener;
  private MediaPeriod mediaPeriod;
  public final MediaSource mediaSource;
  private boolean notifiedPrepareError;
  private long preparePositionOverrideUs;
  private long preparePositionUs;
  
  public DeferredMediaPeriod(MediaSource paramMediaSource, MediaSource.MediaPeriodId paramMediaPeriodId, Allocator paramAllocator)
  {
    id = paramMediaPeriodId;
    allocator = paramAllocator;
    mediaSource = paramMediaSource;
    preparePositionOverrideUs = -9223372036854775807L;
  }
  
  public boolean continueLoading(long paramLong)
  {
    MediaPeriod localMediaPeriod = mediaPeriod;
    boolean bool;
    if ((localMediaPeriod != null) && (localMediaPeriod.continueLoading(paramLong))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void createPeriod(MediaSource.MediaPeriodId paramMediaPeriodId)
  {
    paramMediaPeriodId = mediaSource.createPeriod(paramMediaPeriodId, allocator);
    mediaPeriod = paramMediaPeriodId;
    if (callback != null)
    {
      long l = preparePositionOverrideUs;
      if (l == -9223372036854775807L) {
        l = preparePositionUs;
      }
      paramMediaPeriodId.prepare(this, l);
    }
  }
  
  public void discardBuffer(long paramLong, boolean paramBoolean)
  {
    mediaPeriod.discardBuffer(paramLong, paramBoolean);
  }
  
  public long getAdjustedSeekPositionUs(long paramLong, SeekParameters paramSeekParameters)
  {
    return mediaPeriod.getAdjustedSeekPositionUs(paramLong, paramSeekParameters);
  }
  
  public long getBufferedPositionUs()
  {
    return mediaPeriod.getBufferedPositionUs();
  }
  
  public long getNextLoadPositionUs()
  {
    return mediaPeriod.getNextLoadPositionUs();
  }
  
  public long getPreparePositionUs()
  {
    return preparePositionUs;
  }
  
  public TrackGroupArray getTrackGroups()
  {
    return mediaPeriod.getTrackGroups();
  }
  
  public void maybeThrowPrepareError()
    throws IOException
  {
    PrepareErrorListener localPrepareErrorListener;
    try
    {
      MediaPeriod localMediaPeriod = mediaPeriod;
      if (localMediaPeriod != null) {
        localMediaPeriod.maybeThrowPrepareError();
      } else {
        mediaSource.maybeThrowSourceInfoRefreshError();
      }
    }
    catch (IOException localIOException)
    {
      localPrepareErrorListener = listener;
      if (localPrepareErrorListener == null) {
        break label64;
      }
    }
    if (!notifiedPrepareError)
    {
      notifiedPrepareError = true;
      localPrepareErrorListener.onPrepareError(id, localIOException);
    }
    return;
    label64:
    throw localIOException;
  }
  
  public void onContinueLoadingRequested(MediaPeriod paramMediaPeriod)
  {
    callback.onContinueLoadingRequested(this);
  }
  
  public void onPrepared(MediaPeriod paramMediaPeriod)
  {
    callback.onPrepared(this);
  }
  
  public void overridePreparePositionUs(long paramLong)
  {
    preparePositionOverrideUs = paramLong;
  }
  
  public void prepare(MediaPeriod.Callback paramCallback, long paramLong)
  {
    callback = paramCallback;
    preparePositionUs = paramLong;
    paramCallback = mediaPeriod;
    if (paramCallback != null) {
      paramCallback.prepare(this, paramLong);
    }
  }
  
  public long readDiscontinuity()
  {
    return mediaPeriod.readDiscontinuity();
  }
  
  public void reevaluateBuffer(long paramLong)
  {
    mediaPeriod.reevaluateBuffer(paramLong);
  }
  
  public void releasePeriod()
  {
    MediaPeriod localMediaPeriod = mediaPeriod;
    if (localMediaPeriod != null) {
      mediaSource.releasePeriod(localMediaPeriod);
    }
  }
  
  public long seekToUs(long paramLong)
  {
    return mediaPeriod.seekToUs(paramLong);
  }
  
  public long selectTracks(TrackSelection[] paramArrayOfTrackSelection, boolean[] paramArrayOfBoolean1, SampleStream[] paramArrayOfSampleStream, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    long l = preparePositionOverrideUs;
    if ((l != -9223372036854775807L) && (paramLong == preparePositionUs))
    {
      preparePositionOverrideUs = -9223372036854775807L;
      paramLong = l;
    }
    return mediaPeriod.selectTracks(paramArrayOfTrackSelection, paramArrayOfBoolean1, paramArrayOfSampleStream, paramArrayOfBoolean2, paramLong);
  }
  
  public void setPrepareErrorListener(PrepareErrorListener paramPrepareErrorListener)
  {
    listener = paramPrepareErrorListener;
  }
  
  public static abstract interface PrepareErrorListener
  {
    public abstract void onPrepareError(MediaSource.MediaPeriodId paramMediaPeriodId, IOException paramIOException);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.DeferredMediaPeriod
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */