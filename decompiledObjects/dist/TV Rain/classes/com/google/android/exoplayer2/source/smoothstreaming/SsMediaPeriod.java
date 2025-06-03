package com.google.android.exoplayer2.source.smoothstreaming;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaPeriod.Callback;
import com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.SequenceableLoader.Callback;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.chunk.ChunkSampleStream;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.ProtectionElement;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.StreamElement;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.util.ArrayList;

final class SsMediaPeriod
  implements MediaPeriod, SequenceableLoader.Callback<ChunkSampleStream<SsChunkSource>>
{
  private static final int INITIALIZATION_VECTOR_SIZE = 8;
  private final Allocator allocator;
  @Nullable
  private MediaPeriod.Callback callback;
  private final SsChunkSource.Factory chunkSourceFactory;
  private SequenceableLoader compositeSequenceableLoader;
  private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
  private final MediaSourceEventListener.EventDispatcher eventDispatcher;
  private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
  private SsManifest manifest;
  private final LoaderErrorThrower manifestLoaderErrorThrower;
  private boolean notifiedReadingStarted;
  private ChunkSampleStream<SsChunkSource>[] sampleStreams;
  private final TrackEncryptionBox[] trackEncryptionBoxes;
  private final TrackGroupArray trackGroups;
  @Nullable
  private final TransferListener transferListener;
  
  public SsMediaPeriod(SsManifest paramSsManifest, SsChunkSource.Factory paramFactory, @Nullable TransferListener paramTransferListener, CompositeSequenceableLoaderFactory paramCompositeSequenceableLoaderFactory, LoadErrorHandlingPolicy paramLoadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher paramEventDispatcher, LoaderErrorThrower paramLoaderErrorThrower, Allocator paramAllocator)
  {
    chunkSourceFactory = paramFactory;
    transferListener = paramTransferListener;
    manifestLoaderErrorThrower = paramLoaderErrorThrower;
    loadErrorHandlingPolicy = paramLoadErrorHandlingPolicy;
    eventDispatcher = paramEventDispatcher;
    allocator = paramAllocator;
    compositeSequenceableLoaderFactory = paramCompositeSequenceableLoaderFactory;
    trackGroups = buildTrackGroups(paramSsManifest);
    paramFactory = protectionElement;
    if (paramFactory != null) {
      trackEncryptionBoxes = new TrackEncryptionBox[] { new TrackEncryptionBox(true, null, 8, getProtectionElementKeyId(data), 0, 0, null) };
    } else {
      trackEncryptionBoxes = null;
    }
    manifest = paramSsManifest;
    paramSsManifest = newSampleStreamArray(0);
    sampleStreams = paramSsManifest;
    compositeSequenceableLoader = paramCompositeSequenceableLoaderFactory.createCompositeSequenceableLoader(paramSsManifest);
    paramEventDispatcher.mediaPeriodCreated();
  }
  
  private ChunkSampleStream<SsChunkSource> buildSampleStream(TrackSelection paramTrackSelection, long paramLong)
  {
    int i = trackGroups.indexOf(paramTrackSelection.getTrackGroup());
    paramTrackSelection = chunkSourceFactory.createChunkSource(manifestLoaderErrorThrower, manifest, i, paramTrackSelection, trackEncryptionBoxes, transferListener);
    return new ChunkSampleStream(manifest.streamElements[i].type, null, null, paramTrackSelection, this, allocator, paramLong, loadErrorHandlingPolicy, eventDispatcher);
  }
  
  private static TrackGroupArray buildTrackGroups(SsManifest paramSsManifest)
  {
    TrackGroup[] arrayOfTrackGroup = new TrackGroup[streamElements.length];
    for (int i = 0; i < streamElements.length; i++) {
      arrayOfTrackGroup[i] = new TrackGroup(streamElements[i].formats);
    }
    return new TrackGroupArray(arrayOfTrackGroup);
  }
  
  private static byte[] getProtectionElementKeyId(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramArrayOfByte.length; i += 2) {
      localStringBuilder.append((char)paramArrayOfByte[i]);
    }
    paramArrayOfByte = localStringBuilder.toString();
    paramArrayOfByte = Base64.decode(paramArrayOfByte.substring(paramArrayOfByte.indexOf("<KID>") + 5, paramArrayOfByte.indexOf("</KID>")), 0);
    swap(paramArrayOfByte, 0, 3);
    swap(paramArrayOfByte, 1, 2);
    swap(paramArrayOfByte, 4, 5);
    swap(paramArrayOfByte, 6, 7);
    return paramArrayOfByte;
  }
  
  private static ChunkSampleStream<SsChunkSource>[] newSampleStreamArray(int paramInt)
  {
    return new ChunkSampleStream[paramInt];
  }
  
  private static void swap(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfByte[paramInt1];
    paramArrayOfByte[paramInt1] = ((byte)paramArrayOfByte[paramInt2]);
    paramArrayOfByte[paramInt2] = ((byte)i);
  }
  
  public boolean continueLoading(long paramLong)
  {
    return compositeSequenceableLoader.continueLoading(paramLong);
  }
  
  public void discardBuffer(long paramLong, boolean paramBoolean)
  {
    ChunkSampleStream[] arrayOfChunkSampleStream = sampleStreams;
    int i = arrayOfChunkSampleStream.length;
    for (int j = 0; j < i; j++) {
      arrayOfChunkSampleStream[j].discardBuffer(paramLong, paramBoolean);
    }
  }
  
  public long getAdjustedSeekPositionUs(long paramLong, SeekParameters paramSeekParameters)
  {
    for (ChunkSampleStream localChunkSampleStream : sampleStreams) {
      if (primaryTrackType == 2) {
        return localChunkSampleStream.getAdjustedSeekPositionUs(paramLong, paramSeekParameters);
      }
    }
    return paramLong;
  }
  
  public long getBufferedPositionUs()
  {
    return compositeSequenceableLoader.getBufferedPositionUs();
  }
  
  public long getNextLoadPositionUs()
  {
    return compositeSequenceableLoader.getNextLoadPositionUs();
  }
  
  public TrackGroupArray getTrackGroups()
  {
    return trackGroups;
  }
  
  public void maybeThrowPrepareError()
    throws IOException
  {
    manifestLoaderErrorThrower.maybeThrowError();
  }
  
  public void onContinueLoadingRequested(ChunkSampleStream<SsChunkSource> paramChunkSampleStream)
  {
    callback.onContinueLoadingRequested(this);
  }
  
  public void prepare(MediaPeriod.Callback paramCallback, long paramLong)
  {
    callback = paramCallback;
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
  
  public void reevaluateBuffer(long paramLong)
  {
    compositeSequenceableLoader.reevaluateBuffer(paramLong);
  }
  
  public void release()
  {
    ChunkSampleStream[] arrayOfChunkSampleStream = sampleStreams;
    int i = arrayOfChunkSampleStream.length;
    for (int j = 0; j < i; j++) {
      arrayOfChunkSampleStream[j].release();
    }
    callback = null;
    eventDispatcher.mediaPeriodReleased();
  }
  
  public long seekToUs(long paramLong)
  {
    ChunkSampleStream[] arrayOfChunkSampleStream = sampleStreams;
    int i = arrayOfChunkSampleStream.length;
    for (int j = 0; j < i; j++) {
      arrayOfChunkSampleStream[j].seekToUs(paramLong);
    }
    return paramLong;
  }
  
  public long selectTracks(TrackSelection[] paramArrayOfTrackSelection, boolean[] paramArrayOfBoolean1, SampleStream[] paramArrayOfSampleStream, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramArrayOfTrackSelection.length; i++)
    {
      Object localObject = paramArrayOfSampleStream[i];
      if (localObject != null)
      {
        localObject = (ChunkSampleStream)localObject;
        if ((paramArrayOfTrackSelection[i] != null) && (paramArrayOfBoolean1[i] != 0))
        {
          localArrayList.add(localObject);
        }
        else
        {
          ((ChunkSampleStream)localObject).release();
          paramArrayOfSampleStream[i] = null;
        }
      }
      if (paramArrayOfSampleStream[i] == null)
      {
        localObject = paramArrayOfTrackSelection[i];
        if (localObject != null)
        {
          localObject = buildSampleStream((TrackSelection)localObject, paramLong);
          localArrayList.add(localObject);
          paramArrayOfSampleStream[i] = localObject;
          paramArrayOfBoolean2[i] = true;
        }
      }
    }
    paramArrayOfTrackSelection = newSampleStreamArray(localArrayList.size());
    sampleStreams = paramArrayOfTrackSelection;
    localArrayList.toArray(paramArrayOfTrackSelection);
    compositeSequenceableLoader = compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(sampleStreams);
    return paramLong;
  }
  
  public void updateManifest(SsManifest paramSsManifest)
  {
    manifest = paramSsManifest;
    ChunkSampleStream[] arrayOfChunkSampleStream = sampleStreams;
    int i = arrayOfChunkSampleStream.length;
    for (int j = 0; j < i; j++) {
      ((SsChunkSource)arrayOfChunkSampleStream[j].getChunkSource()).updateManifest(paramSsManifest);
    }
    callback.onContinueLoadingRequested(this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.smoothstreaming.SsMediaPeriod
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */