package com.google.android.exoplayer2.analytics;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Timeline.Period;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import java.util.ArrayList;
import java.util.HashMap;

final class AnalyticsCollector$MediaPeriodQueueTracker
{
  private boolean isSeeking;
  @Nullable
  private AnalyticsCollector.MediaPeriodInfo lastReportedPlayingMediaPeriod;
  private final HashMap<MediaSource.MediaPeriodId, AnalyticsCollector.MediaPeriodInfo> mediaPeriodIdToInfo = new HashMap();
  private final ArrayList<AnalyticsCollector.MediaPeriodInfo> mediaPeriodInfoQueue = new ArrayList();
  private final Timeline.Period period = new Timeline.Period();
  @Nullable
  private AnalyticsCollector.MediaPeriodInfo readingMediaPeriod;
  private Timeline timeline = Timeline.EMPTY;
  
  private void updateLastReportedPlayingMediaPeriod()
  {
    if (!mediaPeriodInfoQueue.isEmpty()) {
      lastReportedPlayingMediaPeriod = ((AnalyticsCollector.MediaPeriodInfo)mediaPeriodInfoQueue.get(0));
    }
  }
  
  private AnalyticsCollector.MediaPeriodInfo updateMediaPeriodInfoToNewTimeline(AnalyticsCollector.MediaPeriodInfo paramMediaPeriodInfo, Timeline paramTimeline)
  {
    int i = paramTimeline.getIndexOfPeriod(mediaPeriodId.periodUid);
    if (i == -1) {
      return paramMediaPeriodInfo;
    }
    i = getPeriodperiod).windowIndex;
    return new AnalyticsCollector.MediaPeriodInfo(mediaPeriodId, paramTimeline, i);
  }
  
  @Nullable
  public AnalyticsCollector.MediaPeriodInfo getLastReportedPlayingMediaPeriod()
  {
    return lastReportedPlayingMediaPeriod;
  }
  
  @Nullable
  public AnalyticsCollector.MediaPeriodInfo getLoadingMediaPeriod()
  {
    Object localObject;
    if (mediaPeriodInfoQueue.isEmpty())
    {
      localObject = null;
    }
    else
    {
      localObject = mediaPeriodInfoQueue;
      localObject = (AnalyticsCollector.MediaPeriodInfo)((ArrayList)localObject).get(((ArrayList)localObject).size() - 1);
    }
    return (AnalyticsCollector.MediaPeriodInfo)localObject;
  }
  
  @Nullable
  public AnalyticsCollector.MediaPeriodInfo getMediaPeriodInfo(MediaSource.MediaPeriodId paramMediaPeriodId)
  {
    return (AnalyticsCollector.MediaPeriodInfo)mediaPeriodIdToInfo.get(paramMediaPeriodId);
  }
  
  @Nullable
  public AnalyticsCollector.MediaPeriodInfo getPlayingMediaPeriod()
  {
    AnalyticsCollector.MediaPeriodInfo localMediaPeriodInfo;
    if ((!mediaPeriodInfoQueue.isEmpty()) && (!timeline.isEmpty()) && (!isSeeking)) {
      localMediaPeriodInfo = (AnalyticsCollector.MediaPeriodInfo)mediaPeriodInfoQueue.get(0);
    } else {
      localMediaPeriodInfo = null;
    }
    return localMediaPeriodInfo;
  }
  
  @Nullable
  public AnalyticsCollector.MediaPeriodInfo getReadingMediaPeriod()
  {
    return readingMediaPeriod;
  }
  
  public boolean isSeeking()
  {
    return isSeeking;
  }
  
  public void onMediaPeriodCreated(int paramInt, MediaSource.MediaPeriodId paramMediaPeriodId)
  {
    int i;
    if (timeline.getIndexOfPeriod(periodUid) != -1) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      localObject = timeline;
    } else {
      localObject = Timeline.EMPTY;
    }
    Object localObject = new AnalyticsCollector.MediaPeriodInfo(paramMediaPeriodId, (Timeline)localObject, paramInt);
    mediaPeriodInfoQueue.add(localObject);
    mediaPeriodIdToInfo.put(paramMediaPeriodId, localObject);
    if ((mediaPeriodInfoQueue.size() == 1) && (!timeline.isEmpty())) {
      updateLastReportedPlayingMediaPeriod();
    }
  }
  
  public boolean onMediaPeriodReleased(MediaSource.MediaPeriodId paramMediaPeriodId)
  {
    AnalyticsCollector.MediaPeriodInfo localMediaPeriodInfo = (AnalyticsCollector.MediaPeriodInfo)mediaPeriodIdToInfo.remove(paramMediaPeriodId);
    if (localMediaPeriodInfo == null) {
      return false;
    }
    mediaPeriodInfoQueue.remove(localMediaPeriodInfo);
    localMediaPeriodInfo = readingMediaPeriod;
    if ((localMediaPeriodInfo != null) && (paramMediaPeriodId.equals(mediaPeriodId)))
    {
      if (mediaPeriodInfoQueue.isEmpty()) {
        paramMediaPeriodId = null;
      } else {
        paramMediaPeriodId = (AnalyticsCollector.MediaPeriodInfo)mediaPeriodInfoQueue.get(0);
      }
      readingMediaPeriod = paramMediaPeriodId;
    }
    return true;
  }
  
  public void onPositionDiscontinuity(int paramInt)
  {
    updateLastReportedPlayingMediaPeriod();
  }
  
  public void onReadingStarted(MediaSource.MediaPeriodId paramMediaPeriodId)
  {
    readingMediaPeriod = ((AnalyticsCollector.MediaPeriodInfo)mediaPeriodIdToInfo.get(paramMediaPeriodId));
  }
  
  public void onSeekProcessed()
  {
    isSeeking = false;
    updateLastReportedPlayingMediaPeriod();
  }
  
  public void onSeekStarted()
  {
    isSeeking = true;
  }
  
  public void onTimelineChanged(Timeline paramTimeline)
  {
    for (int i = 0; i < mediaPeriodInfoQueue.size(); i++)
    {
      localMediaPeriodInfo = updateMediaPeriodInfoToNewTimeline((AnalyticsCollector.MediaPeriodInfo)mediaPeriodInfoQueue.get(i), paramTimeline);
      mediaPeriodInfoQueue.set(i, localMediaPeriodInfo);
      mediaPeriodIdToInfo.put(mediaPeriodId, localMediaPeriodInfo);
    }
    AnalyticsCollector.MediaPeriodInfo localMediaPeriodInfo = readingMediaPeriod;
    if (localMediaPeriodInfo != null) {
      readingMediaPeriod = updateMediaPeriodInfoToNewTimeline(localMediaPeriodInfo, paramTimeline);
    }
    timeline = paramTimeline;
    updateLastReportedPlayingMediaPeriod();
  }
  
  @Nullable
  public AnalyticsCollector.MediaPeriodInfo tryResolveWindowIndex(int paramInt)
  {
    int i = 0;
    Object localObject2;
    for (Object localObject1 = null; i < mediaPeriodInfoQueue.size(); localObject1 = localObject2)
    {
      AnalyticsCollector.MediaPeriodInfo localMediaPeriodInfo = (AnalyticsCollector.MediaPeriodInfo)mediaPeriodInfoQueue.get(i);
      int j = timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
      localObject2 = localObject1;
      if (j != -1)
      {
        localObject2 = localObject1;
        if (timeline.getPeriod(j, period).windowIndex == paramInt)
        {
          if (localObject1 != null) {
            return null;
          }
          localObject2 = localMediaPeriodInfo;
        }
      }
      i++;
    }
    return (AnalyticsCollector.MediaPeriodInfo)localObject1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.analytics.AnalyticsCollector.MediaPeriodQueueTracker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */