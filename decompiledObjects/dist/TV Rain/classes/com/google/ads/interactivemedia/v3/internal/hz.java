package com.google.ads.interactivemedia.v3.internal;

public final class hz
{
  public final int a;
  public final int b;
  public final long c;
  public final long d;
  public final long e;
  public final bw f;
  public final int g;
  public final long[] h;
  public final long[] i;
  public final int j;
  private final hy[] k;
  
  public hz(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, bw parambw, int paramInt3, hy[] paramArrayOfhy, int paramInt4, long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramLong1;
    d = paramLong2;
    e = paramLong3;
    f = parambw;
    g = paramInt3;
    k = paramArrayOfhy;
    j = paramInt4;
    h = paramArrayOfLong1;
    i = paramArrayOfLong2;
  }
  
  public final hy a(int paramInt)
  {
    hy[] arrayOfhy = k;
    if (arrayOfhy == null) {
      return null;
    }
    return arrayOfhy[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.hz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */