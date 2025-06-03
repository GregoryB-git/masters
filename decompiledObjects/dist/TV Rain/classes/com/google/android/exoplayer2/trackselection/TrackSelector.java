package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;

public abstract class TrackSelector
{
  @Nullable
  private BandwidthMeter bandwidthMeter;
  @Nullable
  private InvalidationListener listener;
  
  public final BandwidthMeter getBandwidthMeter()
  {
    return (BandwidthMeter)Assertions.checkNotNull(bandwidthMeter);
  }
  
  public final void init(InvalidationListener paramInvalidationListener, BandwidthMeter paramBandwidthMeter)
  {
    listener = paramInvalidationListener;
    bandwidthMeter = paramBandwidthMeter;
  }
  
  public final void invalidate()
  {
    InvalidationListener localInvalidationListener = listener;
    if (localInvalidationListener != null) {
      localInvalidationListener.onTrackSelectionsInvalidated();
    }
  }
  
  public abstract void onSelectionActivated(Object paramObject);
  
  public abstract TrackSelectorResult selectTracks(RendererCapabilities[] paramArrayOfRendererCapabilities, TrackGroupArray paramTrackGroupArray)
    throws ExoPlaybackException;
  
  public static abstract interface InvalidationListener
  {
    public abstract void onTrackSelectionsInvalidated();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.trackselection.TrackSelector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */