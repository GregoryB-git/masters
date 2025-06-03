package com.google.android.exoplayer2.source.dash.manifest;

import com.google.android.exoplayer2.util.Util;
import java.util.List;

public abstract class SegmentBase$MultiSegmentBase
  extends SegmentBase
{
  public final long duration;
  public final List<SegmentBase.SegmentTimelineElement> segmentTimeline;
  public final long startNumber;
  
  public SegmentBase$MultiSegmentBase(RangedUri paramRangedUri, long paramLong1, long paramLong2, long paramLong3, long paramLong4, List<SegmentBase.SegmentTimelineElement> paramList)
  {
    super(paramRangedUri, paramLong1, paramLong2);
    startNumber = paramLong3;
    duration = paramLong4;
    segmentTimeline = paramList;
  }
  
  public long getFirstSegmentNum()
  {
    return startNumber;
  }
  
  public abstract int getSegmentCount(long paramLong);
  
  public final long getSegmentDurationUs(long paramLong1, long paramLong2)
  {
    List localList = segmentTimeline;
    if (localList != null) {
      return getstartNumber))).duration * 1000000L / timescale;
    }
    int i = getSegmentCount(paramLong2);
    if ((i != -1) && (paramLong1 == getFirstSegmentNum() + i - 1L)) {
      paramLong1 = paramLong2 - getSegmentTimeUs(paramLong1);
    } else {
      paramLong1 = duration * 1000000L / timescale;
    }
    return paramLong1;
  }
  
  public long getSegmentNum(long paramLong1, long paramLong2)
  {
    long l1 = getFirstSegmentNum();
    paramLong2 = getSegmentCount(paramLong2);
    if (paramLong2 == 0L) {
      return l1;
    }
    long l2;
    if (segmentTimeline == null)
    {
      l2 = duration * 1000000L / timescale;
      l3 = startNumber;
      paramLong1 = paramLong1 / l2 + l3;
      if (paramLong1 < l1) {
        paramLong1 = l1;
      } else if (paramLong2 != -1L) {
        paramLong1 = Math.min(paramLong1, l1 + paramLong2 - 1L);
      }
      return paramLong1;
    }
    paramLong2 = paramLong2 + l1 - 1L;
    long l3 = l1;
    while (l3 <= paramLong2)
    {
      l2 = (paramLong2 - l3) / 2L + l3;
      boolean bool = getSegmentTimeUs(l2) < paramLong1;
      if (bool) {
        l3 = l2 + 1L;
      } else if (bool) {
        paramLong2 = l2 - 1L;
      } else {
        return l2;
      }
    }
    if (l3 == l1) {
      paramLong2 = l3;
    }
    return paramLong2;
  }
  
  public final long getSegmentTimeUs(long paramLong)
  {
    List localList = segmentTimeline;
    if (localList != null) {
      paramLong = getstartNumber))).startTime - presentationTimeOffset;
    } else {
      paramLong = (paramLong - startNumber) * duration;
    }
    return Util.scaleLargeTimestamp(paramLong, 1000000L, timescale);
  }
  
  public abstract RangedUri getSegmentUrl(Representation paramRepresentation, long paramLong);
  
  public boolean isExplicit()
  {
    boolean bool;
    if (segmentTimeline != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */