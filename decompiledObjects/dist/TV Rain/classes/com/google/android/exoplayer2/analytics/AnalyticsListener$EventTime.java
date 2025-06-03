package com.google.android.exoplayer2.analytics;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;

public final class AnalyticsListener$EventTime
{
  public final long currentPlaybackPositionMs;
  public final long eventPlaybackPositionMs;
  @Nullable
  public final MediaSource.MediaPeriodId mediaPeriodId;
  public final long realtimeMs;
  public final Timeline timeline;
  public final long totalBufferedDurationMs;
  public final int windowIndex;
  
  public AnalyticsListener$EventTime(long paramLong1, Timeline paramTimeline, int paramInt, @Nullable MediaSource.MediaPeriodId paramMediaPeriodId, long paramLong2, long paramLong3, long paramLong4)
  {
    realtimeMs = paramLong1;
    timeline = paramTimeline;
    windowIndex = paramInt;
    mediaPeriodId = paramMediaPeriodId;
    eventPlaybackPositionMs = paramLong2;
    currentPlaybackPositionMs = paramLong3;
    totalBufferedDurationMs = paramLong4;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */