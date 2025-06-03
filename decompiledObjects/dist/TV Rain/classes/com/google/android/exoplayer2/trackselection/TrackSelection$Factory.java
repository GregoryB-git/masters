package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.upstream.BandwidthMeter;

public abstract interface TrackSelection$Factory
{
  public abstract TrackSelection createTrackSelection(TrackGroup paramTrackGroup, BandwidthMeter paramBandwidthMeter, int... paramVarArgs);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.trackselection.TrackSelection.Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */