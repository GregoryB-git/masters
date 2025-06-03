package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.mp4.Track;
import com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.chunk.BaseMediaChunkIterator;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.ChunkExtractorWrapper;
import com.google.android.exoplayer2.source.chunk.ChunkHolder;
import com.google.android.exoplayer2.source.chunk.ContainerMediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.StreamElement;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.List;

public class DefaultSsChunkSource
  implements SsChunkSource
{
  private int currentManifestChunkOffset;
  private final DataSource dataSource;
  private final ChunkExtractorWrapper[] extractorWrappers;
  private IOException fatalError;
  private SsManifest manifest;
  private final LoaderErrorThrower manifestLoaderErrorThrower;
  private final int streamElementIndex;
  private final TrackSelection trackSelection;
  
  public DefaultSsChunkSource(LoaderErrorThrower paramLoaderErrorThrower, SsManifest paramSsManifest, int paramInt, TrackSelection paramTrackSelection, DataSource paramDataSource, TrackEncryptionBox[] paramArrayOfTrackEncryptionBox)
  {
    manifestLoaderErrorThrower = paramLoaderErrorThrower;
    manifest = paramSsManifest;
    streamElementIndex = paramInt;
    trackSelection = paramTrackSelection;
    dataSource = paramDataSource;
    paramLoaderErrorThrower = streamElements[paramInt];
    extractorWrappers = new ChunkExtractorWrapper[paramTrackSelection.length()];
    for (paramInt = 0; paramInt < extractorWrappers.length; paramInt++)
    {
      int i = paramTrackSelection.getIndexInTrackGroup(paramInt);
      Format localFormat = formats[i];
      int j = type;
      int k;
      if (j == 2) {
        k = 4;
      } else {
        k = 0;
      }
      paramDataSource = new FragmentedMp4Extractor(3, null, new Track(i, j, timescale, -9223372036854775807L, durationUs, localFormat, 0, paramArrayOfTrackEncryptionBox, k, null, null), null);
      extractorWrappers[paramInt] = new ChunkExtractorWrapper(paramDataSource, type, localFormat);
    }
  }
  
  private static MediaChunk newMediaChunk(Format paramFormat, DataSource paramDataSource, Uri paramUri, String paramString, int paramInt1, long paramLong1, long paramLong2, long paramLong3, int paramInt2, Object paramObject, ChunkExtractorWrapper paramChunkExtractorWrapper)
  {
    return new ContainerMediaChunk(paramDataSource, new DataSpec(paramUri, 0L, -1L, paramString), paramFormat, paramInt2, paramObject, paramLong1, paramLong2, paramLong3, -9223372036854775807L, paramInt1, 1, paramLong1, paramChunkExtractorWrapper);
  }
  
  private long resolveTimeToLiveEdgeUs(long paramLong)
  {
    Object localObject = manifest;
    if (!isLive) {
      return -9223372036854775807L;
    }
    localObject = streamElements[streamElementIndex];
    int i = chunkCount - 1;
    long l = ((SsManifest.StreamElement)localObject).getStartTimeUs(i);
    return ((SsManifest.StreamElement)localObject).getChunkDurationUs(i) + l - paramLong;
  }
  
  public long getAdjustedSeekPositionUs(long paramLong, SeekParameters paramSeekParameters)
  {
    SsManifest.StreamElement localStreamElement = manifest.streamElements[streamElementIndex];
    int i = localStreamElement.getChunkIndex(paramLong);
    long l1 = localStreamElement.getStartTimeUs(i);
    long l2;
    if ((l1 < paramLong) && (i < chunkCount - 1)) {
      l2 = localStreamElement.getStartTimeUs(i + 1);
    } else {
      l2 = l1;
    }
    return Util.resolveSeekPositionUs(paramLong, paramSeekParameters, l1, l2);
  }
  
  public final void getNextChunk(long paramLong1, long paramLong2, List<? extends MediaChunk> paramList, ChunkHolder paramChunkHolder)
  {
    if (fatalError != null) {
      return;
    }
    Object localObject1 = manifest;
    Object localObject2 = streamElements[streamElementIndex];
    if (chunkCount == 0)
    {
      endOfStream = (isLive ^ true);
      return;
    }
    int i;
    if (paramList.isEmpty())
    {
      i = ((SsManifest.StreamElement)localObject2).getChunkIndex(paramLong2);
    }
    else
    {
      j = (int)(((MediaChunk)paramList.get(paramList.size() - 1)).getNextChunkIndex() - currentManifestChunkOffset);
      i = j;
      if (j < 0)
      {
        fatalError = new BehindLiveWindowException();
        return;
      }
    }
    if (i >= chunkCount)
    {
      endOfStream = (manifest.isLive ^ true);
      return;
    }
    long l = resolveTimeToLiveEdgeUs(paramLong1);
    int k = trackSelection.length();
    localObject1 = new MediaChunkIterator[k];
    for (int j = 0; j < k; j++) {
      localObject1[j] = new StreamElementIterator((SsManifest.StreamElement)localObject2, trackSelection.getIndexInTrackGroup(j), i);
    }
    trackSelection.updateSelectedTrack(paramLong1, paramLong2 - paramLong1, l, paramList, (MediaChunkIterator[])localObject1);
    paramLong1 = ((SsManifest.StreamElement)localObject2).getStartTimeUs(i);
    l = ((SsManifest.StreamElement)localObject2).getChunkDurationUs(i);
    if (!paramList.isEmpty()) {
      paramLong2 = -9223372036854775807L;
    }
    k = currentManifestChunkOffset;
    j = trackSelection.getSelectedIndex();
    paramList = extractorWrappers[j];
    localObject2 = ((SsManifest.StreamElement)localObject2).buildRequestUri(trackSelection.getIndexInTrackGroup(j), i);
    chunk = newMediaChunk(trackSelection.getSelectedFormat(), dataSource, (Uri)localObject2, null, i + k, paramLong1, l + paramLong1, paramLong2, trackSelection.getSelectionReason(), trackSelection.getSelectionData(), paramList);
  }
  
  public int getPreferredQueueSize(long paramLong, List<? extends MediaChunk> paramList)
  {
    if ((fatalError == null) && (trackSelection.length() >= 2)) {
      return trackSelection.evaluateQueueSize(paramLong, paramList);
    }
    return paramList.size();
  }
  
  public void maybeThrowError()
    throws IOException
  {
    IOException localIOException = fatalError;
    if (localIOException == null)
    {
      manifestLoaderErrorThrower.maybeThrowError();
      return;
    }
    throw localIOException;
  }
  
  public void onChunkLoadCompleted(Chunk paramChunk) {}
  
  public boolean onChunkLoadError(Chunk paramChunk, boolean paramBoolean, Exception paramException, long paramLong)
  {
    if ((paramBoolean) && (paramLong != -9223372036854775807L))
    {
      paramException = trackSelection;
      if (paramException.blacklist(paramException.indexOf(trackFormat), paramLong)) {
        return true;
      }
    }
    paramBoolean = false;
    return paramBoolean;
  }
  
  public void updateManifest(SsManifest paramSsManifest)
  {
    Object localObject1 = manifest.streamElements;
    int i = streamElementIndex;
    Object localObject2 = localObject1[i];
    int j = chunkCount;
    localObject1 = streamElements[i];
    if ((j != 0) && (chunkCount != 0))
    {
      i = j - 1;
      long l1 = ((SsManifest.StreamElement)localObject2).getStartTimeUs(i);
      long l2 = ((SsManifest.StreamElement)localObject2).getChunkDurationUs(i);
      long l3 = ((SsManifest.StreamElement)localObject1).getStartTimeUs(0);
      if (l2 + l1 <= l3)
      {
        currentManifestChunkOffset += j;
      }
      else
      {
        j = currentManifestChunkOffset;
        currentManifestChunkOffset = (((SsManifest.StreamElement)localObject2).getChunkIndex(l3) + j);
      }
    }
    else
    {
      currentManifestChunkOffset += j;
    }
    manifest = paramSsManifest;
  }
  
  public static final class Factory
    implements SsChunkSource.Factory
  {
    private final DataSource.Factory dataSourceFactory;
    
    public Factory(DataSource.Factory paramFactory)
    {
      dataSourceFactory = paramFactory;
    }
    
    public SsChunkSource createChunkSource(LoaderErrorThrower paramLoaderErrorThrower, SsManifest paramSsManifest, int paramInt, TrackSelection paramTrackSelection, TrackEncryptionBox[] paramArrayOfTrackEncryptionBox, @Nullable TransferListener paramTransferListener)
    {
      DataSource localDataSource = dataSourceFactory.createDataSource();
      if (paramTransferListener != null) {
        localDataSource.addTransferListener(paramTransferListener);
      }
      return new DefaultSsChunkSource(paramLoaderErrorThrower, paramSsManifest, paramInt, paramTrackSelection, localDataSource, paramArrayOfTrackEncryptionBox);
    }
  }
  
  public static final class StreamElementIterator
    extends BaseMediaChunkIterator
  {
    private final SsManifest.StreamElement streamElement;
    private final int trackIndex;
    
    public StreamElementIterator(SsManifest.StreamElement paramStreamElement, int paramInt1, int paramInt2)
    {
      super(chunkCount - 1);
      streamElement = paramStreamElement;
      trackIndex = paramInt1;
    }
    
    public long getChunkEndTimeUs()
    {
      long l = getChunkStartTimeUs();
      return streamElement.getChunkDurationUs((int)getCurrentIndex()) + l;
    }
    
    public long getChunkStartTimeUs()
    {
      checkInBounds();
      return streamElement.getStartTimeUs((int)getCurrentIndex());
    }
    
    public DataSpec getDataSpec()
    {
      checkInBounds();
      return new DataSpec(streamElement.buildRequestUri(trackIndex, (int)getCurrentIndex()));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.smoothstreaming.DefaultSsChunkSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */