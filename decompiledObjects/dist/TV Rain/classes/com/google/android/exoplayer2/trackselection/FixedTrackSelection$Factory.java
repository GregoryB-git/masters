package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;

@Deprecated
public final class FixedTrackSelection$Factory
  implements TrackSelection.Factory
{
  @Nullable
  private final Object data;
  private final int reason;
  
  public FixedTrackSelection$Factory()
  {
    reason = 0;
    data = null;
  }
  
  public FixedTrackSelection$Factory(int paramInt, @Nullable Object paramObject)
  {
    reason = paramInt;
    data = paramObject;
  }
  
  public FixedTrackSelection createTrackSelection(TrackGroup paramTrackGroup, BandwidthMeter paramBandwidthMeter, int... paramVarArgs)
  {
    int i = paramVarArgs.length;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    Assertions.checkArgument(bool);
    return new FixedTrackSelection(paramTrackGroup, paramVarArgs[0], reason, data);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.trackselection.FixedTrackSelection.Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */