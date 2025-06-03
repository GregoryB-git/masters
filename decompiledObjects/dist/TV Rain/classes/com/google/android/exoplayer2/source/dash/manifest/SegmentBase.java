package com.google.android.exoplayer2.source.dash.manifest;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Util;
import java.util.List;

public abstract class SegmentBase
{
  public final RangedUri initialization;
  public final long presentationTimeOffset;
  public final long timescale;
  
  public SegmentBase(RangedUri paramRangedUri, long paramLong1, long paramLong2)
  {
    initialization = paramRangedUri;
    timescale = paramLong1;
    presentationTimeOffset = paramLong2;
  }
  
  public RangedUri getInitialization(Representation paramRepresentation)
  {
    return initialization;
  }
  
  public long getPresentationTimeOffsetUs()
  {
    return Util.scaleLargeTimestamp(presentationTimeOffset, 1000000L, timescale);
  }
  
  public static abstract class MultiSegmentBase
    extends SegmentBase
  {
    public final long duration;
    public final List<SegmentBase.SegmentTimelineElement> segmentTimeline;
    public final long startNumber;
    
    public MultiSegmentBase(RangedUri paramRangedUri, long paramLong1, long paramLong2, long paramLong3, long paramLong4, List<SegmentBase.SegmentTimelineElement> paramList)
    {
      super(paramLong1, paramLong2);
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
  
  public static class SegmentList
    extends SegmentBase.MultiSegmentBase
  {
    public final List<RangedUri> mediaSegments;
    
    public SegmentList(RangedUri paramRangedUri, long paramLong1, long paramLong2, long paramLong3, long paramLong4, List<SegmentBase.SegmentTimelineElement> paramList, List<RangedUri> paramList1)
    {
      super(paramLong1, paramLong2, paramLong3, paramLong4, paramList);
      mediaSegments = paramList1;
    }
    
    public int getSegmentCount(long paramLong)
    {
      return mediaSegments.size();
    }
    
    public RangedUri getSegmentUrl(Representation paramRepresentation, long paramLong)
    {
      return (RangedUri)mediaSegments.get((int)(paramLong - startNumber));
    }
    
    public boolean isExplicit()
    {
      return true;
    }
  }
  
  public static class SegmentTemplate
    extends SegmentBase.MultiSegmentBase
  {
    public final UrlTemplate initializationTemplate;
    public final UrlTemplate mediaTemplate;
    
    public SegmentTemplate(RangedUri paramRangedUri, long paramLong1, long paramLong2, long paramLong3, long paramLong4, List<SegmentBase.SegmentTimelineElement> paramList, UrlTemplate paramUrlTemplate1, UrlTemplate paramUrlTemplate2)
    {
      super(paramLong1, paramLong2, paramLong3, paramLong4, paramList);
      initializationTemplate = paramUrlTemplate1;
      mediaTemplate = paramUrlTemplate2;
    }
    
    public RangedUri getInitialization(Representation paramRepresentation)
    {
      UrlTemplate localUrlTemplate = initializationTemplate;
      if (localUrlTemplate != null)
      {
        paramRepresentation = format;
        return new RangedUri(localUrlTemplate.buildUri(id, 0L, bitrate, 0L), 0L, -1L);
      }
      return super.getInitialization(paramRepresentation);
    }
    
    public int getSegmentCount(long paramLong)
    {
      List localList = segmentTimeline;
      if (localList != null) {
        return localList.size();
      }
      if (paramLong != -9223372036854775807L) {
        return (int)Util.ceilDivide(paramLong, duration * 1000000L / timescale);
      }
      return -1;
    }
    
    public RangedUri getSegmentUrl(Representation paramRepresentation, long paramLong)
    {
      Object localObject = segmentTimeline;
      long l;
      if (localObject != null) {
        l = getstartNumber))).startTime;
      } else {
        l = (paramLong - startNumber) * duration;
      }
      localObject = mediaTemplate;
      paramRepresentation = format;
      return new RangedUri(((UrlTemplate)localObject).buildUri(id, paramLong, bitrate, l), 0L, -1L);
    }
  }
  
  public static class SegmentTimelineElement
  {
    public final long duration;
    public final long startTime;
    
    public SegmentTimelineElement(long paramLong1, long paramLong2)
    {
      startTime = paramLong1;
      duration = paramLong2;
    }
  }
  
  public static class SingleSegmentBase
    extends SegmentBase
  {
    public final long indexLength;
    public final long indexStart;
    
    public SingleSegmentBase()
    {
      this(null, 1L, 0L, 0L, 0L);
    }
    
    public SingleSegmentBase(RangedUri paramRangedUri, long paramLong1, long paramLong2, long paramLong3, long paramLong4)
    {
      super(paramLong1, paramLong2);
      indexStart = paramLong3;
      indexLength = paramLong4;
    }
    
    public RangedUri getIndex()
    {
      long l = indexLength;
      RangedUri localRangedUri;
      if (l <= 0L) {
        localRangedUri = null;
      } else {
        localRangedUri = new RangedUri(null, indexStart, l);
      }
      return localRangedUri;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.manifest.SegmentBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */