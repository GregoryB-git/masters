package com.google.android.exoplayer2.util;

public final class NalUnitUtil$SpsData
{
  public final int constraintsFlagsAndReservedZero2Bits;
  public final boolean deltaPicOrderAlwaysZeroFlag;
  public final boolean frameMbsOnlyFlag;
  public final int frameNumLength;
  public final int height;
  public final int levelIdc;
  public final int picOrderCntLsbLength;
  public final int picOrderCountType;
  public final float pixelWidthAspectRatio;
  public final int profileIdc;
  public final boolean separateColorPlaneFlag;
  public final int seqParameterSetId;
  public final int width;
  
  public NalUnitUtil$SpsData(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, float paramFloat, boolean paramBoolean1, boolean paramBoolean2, int paramInt7, int paramInt8, int paramInt9, boolean paramBoolean3)
  {
    profileIdc = paramInt1;
    constraintsFlagsAndReservedZero2Bits = paramInt2;
    levelIdc = paramInt3;
    seqParameterSetId = paramInt4;
    width = paramInt5;
    height = paramInt6;
    pixelWidthAspectRatio = paramFloat;
    separateColorPlaneFlag = paramBoolean1;
    frameMbsOnlyFlag = paramBoolean2;
    frameNumLength = paramInt7;
    picOrderCountType = paramInt8;
    picOrderCntLsbLength = paramInt9;
    deltaPicOrderAlwaysZeroFlag = paramBoolean3;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.NalUnitUtil.SpsData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */