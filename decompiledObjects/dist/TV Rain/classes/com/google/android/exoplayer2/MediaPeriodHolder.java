package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.ClippingMediaPeriod;
import com.google.android.exoplayer2.source.EmptySampleStream;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;

final class MediaPeriodHolder
{
  private static final String TAG = "MediaPeriodHolder";
  public boolean hasEnabledTracks;
  public MediaPeriodInfo info;
  public final boolean[] mayRetainStreamFlags;
  public final MediaPeriod mediaPeriod;
  private final MediaSource mediaSource;
  public MediaPeriodHolder next;
  private TrackSelectorResult periodTrackSelectorResult;
  public boolean prepared;
  private final RendererCapabilities[] rendererCapabilities;
  private long rendererPositionOffsetUs;
  public final SampleStream[] sampleStreams;
  public TrackGroupArray trackGroups;
  private final TrackSelector trackSelector;
  public TrackSelectorResult trackSelectorResult;
  public final Object uid;
  
  public MediaPeriodHolder(RendererCapabilities[] paramArrayOfRendererCapabilities, long paramLong, TrackSelector paramTrackSelector, Allocator paramAllocator, MediaSource paramMediaSource, MediaPeriodInfo paramMediaPeriodInfo)
  {
    rendererCapabilities = paramArrayOfRendererCapabilities;
    rendererPositionOffsetUs = (paramLong - startPositionUs);
    trackSelector = paramTrackSelector;
    mediaSource = paramMediaSource;
    uid = Assertions.checkNotNull(id.periodUid);
    info = paramMediaPeriodInfo;
    sampleStreams = new SampleStream[paramArrayOfRendererCapabilities.length];
    mayRetainStreamFlags = new boolean[paramArrayOfRendererCapabilities.length];
    paramTrackSelector = paramMediaSource.createPeriod(id, paramAllocator);
    paramLong = id.endPositionUs;
    paramArrayOfRendererCapabilities = paramTrackSelector;
    if (paramLong != Long.MIN_VALUE) {
      paramArrayOfRendererCapabilities = new ClippingMediaPeriod(paramTrackSelector, true, 0L, paramLong);
    }
    mediaPeriod = paramArrayOfRendererCapabilities;
  }
  
  private void associateNoSampleRenderersWithEmptySampleStream(SampleStream[] paramArrayOfSampleStream)
  {
    for (int i = 0;; i++)
    {
      RendererCapabilities[] arrayOfRendererCapabilities = rendererCapabilities;
      if (i >= arrayOfRendererCapabilities.length) {
        break;
      }
      if ((arrayOfRendererCapabilities[i].getTrackType() == 6) && (trackSelectorResult.isRendererEnabled(i))) {
        paramArrayOfSampleStream[i] = new EmptySampleStream();
      }
    }
  }
  
  private void disableTrackSelectionsInResult(TrackSelectorResult paramTrackSelectorResult)
  {
    for (int i = 0; i < length; i++)
    {
      boolean bool = paramTrackSelectorResult.isRendererEnabled(i);
      TrackSelection localTrackSelection = selections.get(i);
      if ((bool) && (localTrackSelection != null)) {
        localTrackSelection.disable();
      }
    }
  }
  
  private void disassociateNoSampleRenderersWithEmptySampleStream(SampleStream[] paramArrayOfSampleStream)
  {
    for (int i = 0;; i++)
    {
      RendererCapabilities[] arrayOfRendererCapabilities = rendererCapabilities;
      if (i >= arrayOfRendererCapabilities.length) {
        break;
      }
      if (arrayOfRendererCapabilities[i].getTrackType() == 6) {
        paramArrayOfSampleStream[i] = null;
      }
    }
  }
  
  private void enableTrackSelectionsInResult(TrackSelectorResult paramTrackSelectorResult)
  {
    for (int i = 0; i < length; i++)
    {
      boolean bool = paramTrackSelectorResult.isRendererEnabled(i);
      TrackSelection localTrackSelection = selections.get(i);
      if ((bool) && (localTrackSelection != null)) {
        localTrackSelection.enable();
      }
    }
  }
  
  private void updatePeriodTrackSelectorResult(TrackSelectorResult paramTrackSelectorResult)
  {
    TrackSelectorResult localTrackSelectorResult = periodTrackSelectorResult;
    if (localTrackSelectorResult != null) {
      disableTrackSelectionsInResult(localTrackSelectorResult);
    }
    periodTrackSelectorResult = paramTrackSelectorResult;
    if (paramTrackSelectorResult != null) {
      enableTrackSelectionsInResult(paramTrackSelectorResult);
    }
  }
  
  public long applyTrackSelection(long paramLong, boolean paramBoolean)
  {
    return applyTrackSelection(paramLong, paramBoolean, new boolean[rendererCapabilities.length]);
  }
  
  public long applyTrackSelection(long paramLong, boolean paramBoolean, boolean[] paramArrayOfBoolean)
  {
    for (int i = 0;; i++)
    {
      localObject = trackSelectorResult;
      int j = length;
      int k = 1;
      if (i >= j) {
        break;
      }
      boolean[] arrayOfBoolean = mayRetainStreamFlags;
      if ((paramBoolean) || (!((TrackSelectorResult)localObject).isEquivalent(periodTrackSelectorResult, i))) {
        k = 0;
      }
      arrayOfBoolean[i] = k;
    }
    disassociateNoSampleRenderersWithEmptySampleStream(sampleStreams);
    updatePeriodTrackSelectorResult(trackSelectorResult);
    Object localObject = trackSelectorResult.selections;
    paramLong = mediaPeriod.selectTracks(((TrackSelectionArray)localObject).getAll(), mayRetainStreamFlags, sampleStreams, paramArrayOfBoolean, paramLong);
    associateNoSampleRenderersWithEmptySampleStream(sampleStreams);
    hasEnabledTracks = false;
    for (i = 0;; i++)
    {
      paramArrayOfBoolean = sampleStreams;
      if (i >= paramArrayOfBoolean.length) {
        break;
      }
      if (paramArrayOfBoolean[i] != null)
      {
        Assertions.checkState(trackSelectorResult.isRendererEnabled(i));
        if (rendererCapabilities[i].getTrackType() != 6) {
          hasEnabledTracks = true;
        }
      }
      else
      {
        if (((TrackSelectionArray)localObject).get(i) == null) {
          paramBoolean = true;
        } else {
          paramBoolean = false;
        }
        Assertions.checkState(paramBoolean);
      }
    }
    return paramLong;
  }
  
  public void continueLoading(long paramLong)
  {
    paramLong = toPeriodTime(paramLong);
    mediaPeriod.continueLoading(paramLong);
  }
  
  public long getBufferedPositionUs()
  {
    if (!prepared) {
      return info.startPositionUs;
    }
    long l1;
    if (hasEnabledTracks) {
      l1 = mediaPeriod.getBufferedPositionUs();
    } else {
      l1 = Long.MIN_VALUE;
    }
    long l2 = l1;
    if (l1 == Long.MIN_VALUE) {
      l2 = info.durationUs;
    }
    return l2;
  }
  
  public long getDurationUs()
  {
    return info.durationUs;
  }
  
  public long getNextLoadPositionUs()
  {
    long l;
    if (!prepared) {
      l = 0L;
    } else {
      l = mediaPeriod.getNextLoadPositionUs();
    }
    return l;
  }
  
  public long getRendererOffset()
  {
    return rendererPositionOffsetUs;
  }
  
  public long getStartPositionRendererTime()
  {
    return info.startPositionUs + rendererPositionOffsetUs;
  }
  
  public void handlePrepared(float paramFloat)
    throws ExoPlaybackException
  {
    prepared = true;
    trackGroups = mediaPeriod.getTrackGroups();
    selectTracks(paramFloat);
    long l1 = applyTrackSelection(info.startPositionUs, false);
    long l2 = rendererPositionOffsetUs;
    MediaPeriodInfo localMediaPeriodInfo = info;
    rendererPositionOffsetUs = (startPositionUs - l1 + l2);
    info = localMediaPeriodInfo.copyWithStartPositionUs(l1);
  }
  
  public boolean isFullyBuffered()
  {
    boolean bool;
    if ((prepared) && ((!hasEnabledTracks) || (mediaPeriod.getBufferedPositionUs() == Long.MIN_VALUE))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void reevaluateBuffer(long paramLong)
  {
    if (prepared) {
      mediaPeriod.reevaluateBuffer(toPeriodTime(paramLong));
    }
  }
  
  public void release()
  {
    updatePeriodTrackSelectorResult(null);
    try
    {
      if (info.id.endPositionUs != Long.MIN_VALUE) {
        mediaSource.releasePeriod(mediaPeriod).mediaPeriod);
      } else {
        mediaSource.releasePeriod(mediaPeriod);
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      Log.e("MediaPeriodHolder", "Period release failed.", localRuntimeException);
    }
  }
  
  public boolean selectTracks(float paramFloat)
    throws ExoPlaybackException
  {
    Object localObject1 = trackSelector.selectTracks(rendererCapabilities, trackGroups);
    boolean bool = ((TrackSelectorResult)localObject1).isEquivalent(periodTrackSelectorResult);
    int i = 0;
    if (bool) {
      return false;
    }
    trackSelectorResult = ((TrackSelectorResult)localObject1);
    localObject1 = selections.getAll();
    int j = localObject1.length;
    while (i < j)
    {
      Object localObject2 = localObject1[i];
      if (localObject2 != null) {
        ((TrackSelection)localObject2).onPlaybackSpeed(paramFloat);
      }
      i++;
    }
    return true;
  }
  
  public long toPeriodTime(long paramLong)
  {
    return paramLong - getRendererOffset();
  }
  
  public long toRendererTime(long paramLong)
  {
    return paramLong + getRendererOffset();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.MediaPeriodHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */