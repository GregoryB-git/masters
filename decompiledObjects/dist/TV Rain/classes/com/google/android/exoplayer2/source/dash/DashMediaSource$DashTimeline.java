package com.google.android.exoplayer2.source.dash;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Timeline.Period;
import com.google.android.exoplayer2.Timeline.Window;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.util.Assertions;
import java.util.List;

final class DashMediaSource$DashTimeline
  extends Timeline
{
  private final int firstPeriodId;
  private final DashManifest manifest;
  private final long offsetInFirstPeriodUs;
  private final long presentationStartTimeMs;
  private final long windowDefaultStartPositionUs;
  private final long windowDurationUs;
  private final long windowStartTimeMs;
  @Nullable
  private final Object windowTag;
  
  public DashMediaSource$DashTimeline(long paramLong1, long paramLong2, int paramInt, long paramLong3, long paramLong4, long paramLong5, DashManifest paramDashManifest, @Nullable Object paramObject)
  {
    presentationStartTimeMs = paramLong1;
    windowStartTimeMs = paramLong2;
    firstPeriodId = paramInt;
    offsetInFirstPeriodUs = paramLong3;
    windowDurationUs = paramLong4;
    windowDefaultStartPositionUs = paramLong5;
    manifest = paramDashManifest;
    windowTag = paramObject;
  }
  
  private long getAdjustedWindowDefaultStartPositionUs(long paramLong)
  {
    long l1 = windowDefaultStartPositionUs;
    Object localObject = manifest;
    if (!dynamic) {
      return l1;
    }
    long l2 = l1;
    if (paramLong > 0L)
    {
      paramLong = l1 + paramLong;
      l2 = paramLong;
      if (paramLong > windowDurationUs) {
        return -9223372036854775807L;
      }
    }
    paramLong = offsetInFirstPeriodUs + l2;
    l1 = ((DashManifest)localObject).getPeriodDurationUs(0);
    int i = 0;
    while ((i < manifest.getPeriodCount() - 1) && (paramLong >= l1))
    {
      paramLong -= l1;
      i++;
      l1 = manifest.getPeriodDurationUs(i);
    }
    localObject = manifest.getPeriod(i);
    i = ((Period)localObject).getAdaptationSetIndex(2);
    if (i == -1) {
      return l2;
    }
    localObject = ((Representation)adaptationSets.get(i)).representations.get(0)).getIndex();
    if ((localObject != null) && (((DashSegmentIndex)localObject).getSegmentCount(l1) != 0)) {
      return ((DashSegmentIndex)localObject).getTimeUs(((DashSegmentIndex)localObject).getSegmentNum(paramLong, l1)) + l2 - paramLong;
    }
    return l2;
  }
  
  public int getIndexOfPeriod(Object paramObject)
  {
    boolean bool = paramObject instanceof Integer;
    int i = -1;
    if (!bool) {
      return -1;
    }
    int j = ((Integer)paramObject).intValue() - firstPeriodId;
    int k = i;
    if (j >= 0) {
      if (j >= getPeriodCount()) {
        k = i;
      } else {
        k = j;
      }
    }
    return k;
  }
  
  public Timeline.Period getPeriod(int paramInt, Timeline.Period paramPeriod, boolean paramBoolean)
  {
    Assertions.checkIndex(paramInt, 0, getPeriodCount());
    Integer localInteger = null;
    String str;
    if (paramBoolean) {
      str = manifest.getPeriod(paramInt).id;
    } else {
      str = null;
    }
    if (paramBoolean) {
      localInteger = Integer.valueOf(firstPeriodId + paramInt);
    }
    return paramPeriod.set(str, localInteger, 0, manifest.getPeriodDurationUs(paramInt), C.msToUs(manifest.getPeriod(paramInt).startMs - manifest.getPeriod(0).startMs) - offsetInFirstPeriodUs);
  }
  
  public int getPeriodCount()
  {
    return manifest.getPeriodCount();
  }
  
  public Object getUidOfPeriod(int paramInt)
  {
    Assertions.checkIndex(paramInt, 0, getPeriodCount());
    return Integer.valueOf(firstPeriodId + paramInt);
  }
  
  public Timeline.Window getWindow(int paramInt, Timeline.Window paramWindow, boolean paramBoolean, long paramLong)
  {
    Assertions.checkIndex(paramInt, 0, 1);
    paramLong = getAdjustedWindowDefaultStartPositionUs(paramLong);
    Object localObject;
    if (paramBoolean) {
      localObject = windowTag;
    } else {
      localObject = null;
    }
    return paramWindow.set(localObject, presentationStartTimeMs, windowStartTimeMs, true, manifest.dynamic, paramLong, windowDurationUs, 0, getPeriodCount() - 1, offsetInFirstPeriodUs);
  }
  
  public int getWindowCount()
  {
    return 1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.DashMediaSource.DashTimeline
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */