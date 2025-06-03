package com.google.android.exoplayer2.text.dvb;

final class DvbParser$RegionObject
{
  public final int backgroundPixelCode;
  public final int foregroundPixelCode;
  public final int horizontalPosition;
  public final int provider;
  public final int type;
  public final int verticalPosition;
  
  public DvbParser$RegionObject(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    type = paramInt1;
    provider = paramInt2;
    horizontalPosition = paramInt3;
    verticalPosition = paramInt4;
    foregroundPixelCode = paramInt5;
    backgroundPixelCode = paramInt6;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.dvb.DvbParser.RegionObject
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */