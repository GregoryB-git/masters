package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;

final class AnalyticsCollector$MediaPeriodInfo
{
  public final MediaSource.MediaPeriodId mediaPeriodId;
  public final Timeline timeline;
  public final int windowIndex;
  
  public AnalyticsCollector$MediaPeriodInfo(MediaSource.MediaPeriodId paramMediaPeriodId, Timeline paramTimeline, int paramInt)
  {
    mediaPeriodId = paramMediaPeriodId;
    timeline = paramTimeline;
    windowIndex = paramInt;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.analytics.AnalyticsCollector.MediaPeriodInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */