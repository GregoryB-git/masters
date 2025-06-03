package com.google.android.exoplayer2.source.dash.manifest;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Util;
import java.util.List;

public class SegmentBase$SegmentTemplate
  extends SegmentBase.MultiSegmentBase
{
  public final UrlTemplate initializationTemplate;
  public final UrlTemplate mediaTemplate;
  
  public SegmentBase$SegmentTemplate(RangedUri paramRangedUri, long paramLong1, long paramLong2, long paramLong3, long paramLong4, List<SegmentBase.SegmentTimelineElement> paramList, UrlTemplate paramUrlTemplate1, UrlTemplate paramUrlTemplate2)
  {
    super(paramRangedUri, paramLong1, paramLong2, paramLong3, paramLong4, paramList);
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

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentTemplate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */