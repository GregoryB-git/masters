package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.Util;
import java.util.List;

public class AdaptiveTrackSelection
  extends BaseTrackSelection
{
  public static final float DEFAULT_BANDWIDTH_FRACTION = 0.75F;
  public static final float DEFAULT_BUFFERED_FRACTION_TO_LIVE_EDGE_FOR_QUALITY_INCREASE = 0.75F;
  public static final int DEFAULT_MAX_DURATION_FOR_QUALITY_DECREASE_MS = 25000;
  public static final int DEFAULT_MIN_DURATION_FOR_QUALITY_INCREASE_MS = 10000;
  public static final int DEFAULT_MIN_DURATION_TO_RETAIN_AFTER_DISCARD_MS = 25000;
  public static final long DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS = 2000L;
  private final float bandwidthFraction;
  private final BandwidthMeter bandwidthMeter;
  private final float bufferedFractionToLiveEdgeForQualityIncrease;
  private final Clock clock;
  private long lastBufferEvaluationMs;
  private final long maxDurationForQualityDecreaseUs;
  private final long minDurationForQualityIncreaseUs;
  private final long minDurationToRetainAfterDiscardUs;
  private final long minTimeBetweenBufferReevaluationMs;
  private float playbackSpeed;
  private int reason;
  private int selectedIndex;
  
  public AdaptiveTrackSelection(TrackGroup paramTrackGroup, int[] paramArrayOfInt, BandwidthMeter paramBandwidthMeter)
  {
    this(paramTrackGroup, paramArrayOfInt, paramBandwidthMeter, 10000L, 25000L, 25000L, 0.75F, 0.75F, 2000L, Clock.DEFAULT);
  }
  
  public AdaptiveTrackSelection(TrackGroup paramTrackGroup, int[] paramArrayOfInt, BandwidthMeter paramBandwidthMeter, long paramLong1, long paramLong2, long paramLong3, float paramFloat1, float paramFloat2, long paramLong4, Clock paramClock)
  {
    super(paramTrackGroup, paramArrayOfInt);
    bandwidthMeter = paramBandwidthMeter;
    minDurationForQualityIncreaseUs = (paramLong1 * 1000L);
    maxDurationForQualityDecreaseUs = (paramLong2 * 1000L);
    minDurationToRetainAfterDiscardUs = (paramLong3 * 1000L);
    bandwidthFraction = paramFloat1;
    bufferedFractionToLiveEdgeForQualityIncrease = paramFloat2;
    minTimeBetweenBufferReevaluationMs = paramLong4;
    clock = paramClock;
    playbackSpeed = 1.0F;
    reason = 1;
    lastBufferEvaluationMs = -9223372036854775807L;
    selectedIndex = determineIdealSelectedIndex(Long.MIN_VALUE);
  }
  
  private int determineIdealSelectedIndex(long paramLong)
  {
    long l = ((float)bandwidthMeter.getBitrateEstimate() * bandwidthFraction);
    int i = 0;
    int j = 0;
    while (i < length)
    {
      if ((paramLong == Long.MIN_VALUE) || (!isBlacklisted(i, paramLong)))
      {
        if (Math.round(getFormatbitrate * playbackSpeed) <= l) {
          return i;
        }
        j = i;
      }
      i++;
    }
    return j;
  }
  
  private long minDurationForQualityIncreaseUs(long paramLong)
  {
    int i;
    if ((paramLong != -9223372036854775807L) && (paramLong <= minDurationForQualityIncreaseUs)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      paramLong = ((float)paramLong * bufferedFractionToLiveEdgeForQualityIncrease);
    } else {
      paramLong = minDurationForQualityIncreaseUs;
    }
    return paramLong;
  }
  
  public void enable()
  {
    lastBufferEvaluationMs = -9223372036854775807L;
  }
  
  public int evaluateQueueSize(long paramLong, List<? extends MediaChunk> paramList)
  {
    long l1 = clock.elapsedRealtime();
    long l2 = lastBufferEvaluationMs;
    if ((l2 != -9223372036854775807L) && (l1 - l2 < minTimeBetweenBufferReevaluationMs)) {
      return paramList.size();
    }
    lastBufferEvaluationMs = l1;
    boolean bool = paramList.isEmpty();
    int i = 0;
    if (bool) {
      return 0;
    }
    int j = paramList.size();
    if (Util.getPlayoutDurationForMediaDuration(get1startTimeUs - paramLong, playbackSpeed) < minDurationToRetainAfterDiscardUs) {
      return j;
    }
    Format localFormat1 = getFormat(determineIdealSelectedIndex(l1));
    while (i < j)
    {
      MediaChunk localMediaChunk = (MediaChunk)paramList.get(i);
      Format localFormat2 = trackFormat;
      if ((Util.getPlayoutDurationForMediaDuration(startTimeUs - paramLong, playbackSpeed) >= minDurationToRetainAfterDiscardUs) && (bitrate < bitrate))
      {
        int k = height;
        if ((k != -1) && (k < 720))
        {
          int m = width;
          if ((m != -1) && (m < 1280) && (k < height)) {
            return i;
          }
        }
      }
      i++;
    }
    return j;
  }
  
  public int getSelectedIndex()
  {
    return selectedIndex;
  }
  
  @Nullable
  public Object getSelectionData()
  {
    return null;
  }
  
  public int getSelectionReason()
  {
    return reason;
  }
  
  public void onPlaybackSpeed(float paramFloat)
  {
    playbackSpeed = paramFloat;
  }
  
  public void updateSelectedTrack(long paramLong1, long paramLong2, long paramLong3, List<? extends MediaChunk> paramList, MediaChunkIterator[] paramArrayOfMediaChunkIterator)
  {
    paramLong1 = clock.elapsedRealtime();
    int i = selectedIndex;
    int j = determineIdealSelectedIndex(paramLong1);
    selectedIndex = j;
    if (j == i) {
      return;
    }
    if (!isBlacklisted(i, paramLong1))
    {
      paramArrayOfMediaChunkIterator = getFormat(i);
      paramList = getFormat(selectedIndex);
      if ((bitrate > bitrate) && (paramLong2 < minDurationForQualityIncreaseUs(paramLong3))) {
        selectedIndex = i;
      } else if ((bitrate < bitrate) && (paramLong2 >= maxDurationForQualityDecreaseUs)) {
        selectedIndex = i;
      }
    }
    if (selectedIndex != i) {
      reason = 3;
    }
  }
  
  public static final class Factory
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
    
    public Factory()
    {
      this(10000, 25000, 25000, 0.75F, 0.75F, 2000L, Clock.DEFAULT);
    }
    
    public Factory(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
    {
      this(paramInt1, paramInt2, paramInt3, paramFloat, 0.75F, 2000L, Clock.DEFAULT);
    }
    
    public Factory(int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, long paramLong, Clock paramClock)
    {
      this(null, paramInt1, paramInt2, paramInt3, paramFloat1, paramFloat2, paramLong, paramClock);
    }
    
    @Deprecated
    public Factory(BandwidthMeter paramBandwidthMeter)
    {
      this(paramBandwidthMeter, 10000, 25000, 25000, 0.75F, 0.75F, 2000L, Clock.DEFAULT);
    }
    
    @Deprecated
    public Factory(BandwidthMeter paramBandwidthMeter, int paramInt1, int paramInt2, int paramInt3, float paramFloat)
    {
      this(paramBandwidthMeter, paramInt1, paramInt2, paramInt3, paramFloat, 0.75F, 2000L, Clock.DEFAULT);
    }
    
    @Deprecated
    public Factory(@Nullable BandwidthMeter paramBandwidthMeter, int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, long paramLong, Clock paramClock)
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
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */