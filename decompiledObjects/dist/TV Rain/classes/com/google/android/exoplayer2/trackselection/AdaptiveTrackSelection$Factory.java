package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Clock;

public final class AdaptiveTrackSelection$Factory
  implements TrackSelection.Factory
{
  private final float bandwidthFraction;
  @Nullable
  private final BandwidthMeter bandwidthMeter;
  private final float bufferedFractionToLiveEdgeForQualityIncrease;
  private final Clock clock;
  private final int maxDurationForQualityDecreaseMs;
  private final int minDurationForQualityIncreaseMs;
  private final int minDurationToRetainAfterDiscardMs;
  private final long minTimeBetweenBufferReevaluationMs;
  
  public AdaptiveTrackSelection$Factory()
  {
    this(10000, 25000, 25000, 0.75F, 0.75F, 2000L, Clock.DEFAULT);
  }
  
  public AdaptiveTrackSelection$Factory(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    this(paramInt1, paramInt2, paramInt3, paramFloat, 0.75F, 2000L, Clock.DEFAULT);
  }
  
  public AdaptiveTrackSelection$Factory(int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, long paramLong, Clock paramClock)
  {
    this(null, paramInt1, paramInt2, paramInt3, paramFloat1, paramFloat2, paramLong, paramClock);
  }
  
  @Deprecated
  public AdaptiveTrackSelection$Factory(BandwidthMeter paramBandwidthMeter)
  {
    this(paramBandwidthMeter, 10000, 25000, 25000, 0.75F, 0.75F, 2000L, Clock.DEFAULT);
  }
  
  @Deprecated
  public AdaptiveTrackSelection$Factory(BandwidthMeter paramBandwidthMeter, int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    this(paramBandwidthMeter, paramInt1, paramInt2, paramInt3, paramFloat, 0.75F, 2000L, Clock.DEFAULT);
  }
  
  @Deprecated
  public AdaptiveTrackSelection$Factory(@Nullable BandwidthMeter paramBandwidthMeter, int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, long paramLong, Clock paramClock)
  {
    bandwidthMeter = paramBandwidthMeter;
    minDurationForQualityIncreaseMs = paramInt1;
    maxDurationForQualityDecreaseMs = paramInt2;
    minDurationToRetainAfterDiscardMs = paramInt3;
    bandwidthFraction = paramFloat1;
    bufferedFractionToLiveEdgeForQualityIncrease = paramFloat2;
    minTimeBetweenBufferReevaluationMs = paramLong;
    clock = paramClock;
  }
  
  public AdaptiveTrackSelection createTrackSelection(TrackGroup paramTrackGroup, BandwidthMeter paramBandwidthMeter, int... paramVarArgs)
  {
    BandwidthMeter localBandwidthMeter = bandwidthMeter;
    if (localBandwidthMeter != null) {
      paramBandwidthMeter = localBandwidthMeter;
    }
    return new AdaptiveTrackSelection(paramTrackGroup, paramVarArgs, paramBandwidthMeter, minDurationForQualityIncreaseMs, maxDurationForQualityDecreaseMs, minDurationToRetainAfterDiscardMs, bandwidthFraction, bufferedFractionToLiveEdgeForQualityIncrease, minTimeBetweenBufferReevaluationMs, clock);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */