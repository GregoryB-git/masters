package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;

public abstract interface Player$EventListener
{
  public void onLoadingChanged(boolean paramBoolean) {}
  
  public void onPlaybackParametersChanged(PlaybackParameters paramPlaybackParameters) {}
  
  public void onPlayerError(ExoPlaybackException paramExoPlaybackException) {}
  
  public void onPlayerStateChanged(boolean paramBoolean, int paramInt) {}
  
  public void onPositionDiscontinuity(int paramInt) {}
  
  public void onRepeatModeChanged(int paramInt) {}
  
  public void onSeekProcessed() {}
  
  public void onShuffleModeEnabledChanged(boolean paramBoolean) {}
  
  public void onTimelineChanged(Timeline paramTimeline, @Nullable Object paramObject, int paramInt) {}
  
  public void onTracksChanged(TrackGroupArray paramTrackGroupArray, TrackSelectionArray paramTrackSelectionArray) {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.Player.EventListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */