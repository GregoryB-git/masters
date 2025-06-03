package com.google.android.exoplayer2.source.dash.manifest;

import java.util.List;

public class SegmentBase$SegmentList
  extends SegmentBase.MultiSegmentBase
{
  public final List<RangedUri> mediaSegments;
  
  public SegmentBase$SegmentList(RangedUri paramRangedUri, long paramLong1, long paramLong2, long paramLong3, long paramLong4, List<SegmentBase.SegmentTimelineElement> paramList, List<RangedUri> paramList1)
  {
    super(paramRangedUri, paramLong1, paramLong2, paramLong3, paramLong4, paramList);
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

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SegmentList
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */