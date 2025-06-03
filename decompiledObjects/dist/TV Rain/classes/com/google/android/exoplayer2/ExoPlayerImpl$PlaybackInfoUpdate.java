package com.google.android.exoplayer2;

import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import java.util.Iterator;
import java.util.Set;

final class ExoPlayerImpl$PlaybackInfoUpdate
{
  private final boolean isLoadingChanged;
  private final Set<Player.EventListener> listeners;
  private final boolean playWhenReady;
  private final PlaybackInfo playbackInfo;
  private final boolean playbackStateOrPlayWhenReadyChanged;
  private final boolean positionDiscontinuity;
  private final int positionDiscontinuityReason;
  private final boolean seekProcessed;
  private final int timelineChangeReason;
  private final boolean timelineOrManifestChanged;
  private final TrackSelector trackSelector;
  private final boolean trackSelectorResultChanged;
  
  public ExoPlayerImpl$PlaybackInfoUpdate(PlaybackInfo paramPlaybackInfo1, PlaybackInfo paramPlaybackInfo2, Set<Player.EventListener> paramSet, TrackSelector paramTrackSelector, boolean paramBoolean1, int paramInt1, int paramInt2, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    playbackInfo = paramPlaybackInfo1;
    listeners = paramSet;
    trackSelector = paramTrackSelector;
    positionDiscontinuity = paramBoolean1;
    positionDiscontinuityReason = paramInt1;
    timelineChangeReason = paramInt2;
    seekProcessed = paramBoolean2;
    playWhenReady = paramBoolean3;
    paramBoolean2 = false;
    if ((!paramBoolean4) && (playbackState == playbackState)) {
      paramBoolean1 = false;
    } else {
      paramBoolean1 = true;
    }
    playbackStateOrPlayWhenReadyChanged = paramBoolean1;
    if ((timeline == timeline) && (manifest == manifest)) {
      paramBoolean1 = false;
    } else {
      paramBoolean1 = true;
    }
    timelineOrManifestChanged = paramBoolean1;
    if (isLoading != isLoading) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    isLoadingChanged = paramBoolean1;
    paramBoolean1 = paramBoolean2;
    if (trackSelectorResult != trackSelectorResult) {
      paramBoolean1 = true;
    }
    trackSelectorResultChanged = paramBoolean1;
  }
  
  public void notifyListeners()
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if ((timelineOrManifestChanged) || (timelineChangeReason == 0))
    {
      localObject1 = listeners.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Player.EventListener)((Iterator)localObject1).next();
        localObject3 = playbackInfo;
        ((Player.EventListener)localObject2).onTimelineChanged(timeline, manifest, timelineChangeReason);
      }
    }
    if (positionDiscontinuity)
    {
      localObject2 = listeners.iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((Player.EventListener)((Iterator)localObject2).next()).onPositionDiscontinuity(positionDiscontinuityReason);
      }
    }
    if (trackSelectorResultChanged)
    {
      trackSelector.onSelectionActivated(playbackInfo.trackSelectorResult.info);
      localObject3 = listeners.iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject2 = (Player.EventListener)((Iterator)localObject3).next();
        localObject1 = playbackInfo;
        ((Player.EventListener)localObject2).onTracksChanged(trackGroups, trackSelectorResult.selections);
      }
    }
    if (isLoadingChanged)
    {
      localObject2 = listeners.iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((Player.EventListener)((Iterator)localObject2).next()).onLoadingChanged(playbackInfo.isLoading);
      }
    }
    if (playbackStateOrPlayWhenReadyChanged)
    {
      localObject2 = listeners.iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((Player.EventListener)((Iterator)localObject2).next()).onPlayerStateChanged(playWhenReady, playbackInfo.playbackState);
      }
    }
    if (seekProcessed)
    {
      localObject2 = listeners.iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((Player.EventListener)((Iterator)localObject2).next()).onSeekProcessed();
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.ExoPlayerImpl.PlaybackInfoUpdate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */