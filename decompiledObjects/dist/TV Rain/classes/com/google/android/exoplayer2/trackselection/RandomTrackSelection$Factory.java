package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import java.util.Random;

public final class RandomTrackSelection$Factory
  implements TrackSelection.Factory
{
  private final Random random;
  
  public RandomTrackSelection$Factory()
  {
    random = new Random();
  }
  
  public RandomTrackSelection$Factory(int paramInt)
  {
    random = new Random(paramInt);
  }
  
  public RandomTrackSelection createTrackSelection(TrackGroup paramTrackGroup, BandwidthMeter paramBandwidthMeter, int... paramVarArgs)
  {
    return new RandomTrackSelection(paramTrackGroup, paramVarArgs, random);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.trackselection.RandomTrackSelection.Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */