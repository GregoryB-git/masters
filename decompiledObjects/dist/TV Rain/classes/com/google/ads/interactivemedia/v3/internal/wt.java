package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.List;

public final class wt
{
  public final List<byte[]> a;
  public final int b;
  
  private wt(List<byte[]> paramList, int paramInt)
  {
    a = paramList;
    b = paramInt;
  }
  
  public static wt a(vy paramvy)
    throws ce
  {
    try
    {
      paramvy.d(21);
      int i = paramvy.e();
      int j = paramvy.e();
      int k = paramvy.d();
      int m = 0;
      int n = m;
      int i1;
      int i2;
      int i3;
      while (m < j)
      {
        paramvy.d(1);
        i1 = paramvy.f();
        for (i2 = 0; i2 < i1; i2++)
        {
          i3 = paramvy.f();
          n += i3 + 4;
          paramvy.d(i3);
        }
        m++;
      }
      paramvy.c(k);
      byte[] arrayOfByte1 = new byte[n];
      m = 0;
      k = m;
      while (m < j)
      {
        paramvy.d(1);
        i1 = paramvy.f();
        for (i2 = 0; i2 < i1; i2++)
        {
          i3 = paramvy.f();
          byte[] arrayOfByte2 = vu.a;
          System.arraycopy(arrayOfByte2, 0, arrayOfByte1, k, arrayOfByte2.length);
          k += arrayOfByte2.length;
          System.arraycopy(a, paramvy.d(), arrayOfByte1, k, i3);
          k += i3;
          paramvy.d(i3);
        }
        m++;
      }
      if (n == 0) {
        paramvy = null;
      } else {
        paramvy = Collections.singletonList(arrayOfByte1);
      }
      paramvy = new wt(paramvy, (i & 0x3) + 1);
      return paramvy;
    }
    catch (ArrayIndexOutOfBoundsException paramvy)
    {
      throw new ce("Error parsing HEVC config", paramvy);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.wt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */