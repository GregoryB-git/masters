package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.List;

public final class wn
{
  public final List<byte[]> a;
  public final int b;
  public final float c;
  
  private wn(List<byte[]> paramList, int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    a = paramList;
    b = paramInt1;
    c = paramFloat;
  }
  
  public static wn a(vy paramvy)
    throws ce
  {
    try
    {
      paramvy.d(4);
      int i = (paramvy.e() & 0x3) + 1;
      if (i != 3)
      {
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        int j = paramvy.e() & 0x1F;
        for (int k = 0; k < j; k++) {
          localArrayList.add(b(paramvy));
        }
        int m = paramvy.e();
        for (k = 0; k < m; k++) {
          localArrayList.add(b(paramvy));
        }
        float f;
        if (j > 0)
        {
          paramvy = (byte[])localArrayList.get(0);
          paramvy = vu.a((byte[])localArrayList.get(0), i, paramvy.length);
          j = e;
          k = paramvy.f;
          f = g;
        }
        else
        {
          f = 1.0F;
          j = -1;
          k = j;
        }
        return new wn(localArrayList, i, j, k, f);
      }
      paramvy = new java/lang/IllegalStateException;
      paramvy.<init>();
      throw paramvy;
    }
    catch (ArrayIndexOutOfBoundsException paramvy)
    {
      throw new ce("Error parsing AVC config", paramvy);
    }
  }
  
  private static byte[] b(vy paramvy)
  {
    int i = paramvy.f();
    int j = paramvy.d();
    paramvy.d(i);
    return vg.a(a, j, i);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.wn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */