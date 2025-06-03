package com.google.ads.interactivemedia.v3.internal;

final class pd
{
  public final int[] a;
  public final int b;
  public final int c;
  public final int d;
  public final int e;
  public final int f;
  public final int g;
  
  private pd(int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    b = paramInt1;
    a = paramArrayOfInt;
    c = paramInt2;
    e = paramInt3;
    f = paramInt4;
    g = paramInt5;
    d = paramInt6;
  }
  
  public static pd a(int paramInt)
  {
    return new pd(4, 2, new int[0], -1, -1, -1, paramInt);
  }
  
  public static pd a(int paramInt1, int[] paramArrayOfInt, int paramInt2, int paramInt3, int paramInt4)
  {
    return new pd(paramInt1, 0, paramArrayOfInt, paramInt2, paramInt3, paramInt4, -1);
  }
  
  public static pd a(int[] paramArrayOfInt, int paramInt)
  {
    return new pd(4, 1, paramArrayOfInt, paramInt, -1, -1, -1);
  }
  
  public static pd b(int[] paramArrayOfInt, int paramInt)
  {
    return new pd(3, 1, paramArrayOfInt, paramInt, -1, -1, -1);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.pd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */