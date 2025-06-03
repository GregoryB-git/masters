package com.google.android.exoplayer2.source.dash.manifest;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import java.util.List;

public class Representation$MultiSegmentRepresentation
  extends Representation
  implements DashSegmentIndex
{
  private final SegmentBase.MultiSegmentBase segmentBase;
  
  public Representation$MultiSegmentRepresentation(String paramString1, long paramLong, Format paramFormat, String paramString2, SegmentBase.MultiSegmentBase paramMultiSegmentBase, List<Descriptor> paramList)
  {
    super(paramString1, paramLong, paramFormat, paramString2, paramMultiSegmentBase, paramList, null);
    segmentBase = paramMultiSegmentBase;
  }
  
  public String getCacheKey()
  {
    return null;
  }
  
  public long getDurationUs(long paramLong1, long paramLong2)
  {
    return segmentBase.getSegmentDurationUs(paramLong1, paramLong2);
  }
  
  public long getFirstSegmentNum()
  {
    return segmentBase.getFirstSegmentNum();
  }
  
  public DashSegmentIndex getIndex()
  {
    return this;
  }
  
  public RangedUri getIndexUri()
  {
    return null;
  }
  
  public int getSegmentCount(long paramLong)
  {
    return segmentBase.getSegmentCount(paramLong);
  }
  
  public long getSegmentNum(long paramLong1, long paramLong2)
  {
    return segmentBase.getSegmentNum(paramLong1, paramLong2);
  }
  
  public RangedUri getSegmentUrl(long paramLong)
  {
    return segmentBase.getSegmentUrl(this, paramLong);
  }
  
  public long getTimeUs(long paramLong)
  {
    return segmentBase.getSegmentTimeUs(paramLong);
  }
  
  public boolean isExplicit()
  {
    return segmentBase.isExplicit();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.manifest.Representation.MultiSegmentRepresentation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */