package com.google.android.exoplayer2.source.dash.manifest;

public class SegmentBase$SingleSegmentBase
  extends SegmentBase
{
  public final long indexLength;
  public final long indexStart;
  
  public SegmentBase$SingleSegmentBase()
  {
    this(null, 1L, 0L, 0L, 0L);
  }
  
  public SegmentBase$SingleSegmentBase(RangedUri paramRangedUri, long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    super(paramRangedUri, paramLong1, paramLong2);
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

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.manifest.SegmentBase.SingleSegmentBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */