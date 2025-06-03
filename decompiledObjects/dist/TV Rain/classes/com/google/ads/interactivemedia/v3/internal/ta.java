package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;

public class ta
{
  private final tm a = null;
  private final int b;
  private final int c;
  private final int d;
  private final float e;
  private final float f;
  private final long g;
  private final vh h;
  
  public ta()
  {
    this(10000, 25000, 25000, 0.75F, 0.75F, 2000L, vh.a);
  }
  
  public ta(int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, long paramLong, vh paramvh)
  {
    this(null, 10000, 25000, 25000, 0.75F, 0.75F, 2000L, paramvh);
  }
  
  @Deprecated
  public ta(tm paramtm, int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, long paramLong, vh paramvh)
  {
    b = paramInt1;
    c = paramInt2;
    d = paramInt3;
    e = paramFloat1;
    f = paramFloat2;
    g = paramLong;
    h = paramvh;
  }
  
  public sl a(od paramod, tm paramtm, int[] paramArrayOfInt, int paramInt)
  {
    return new sl(paramod, paramArrayOfInt, new so(paramtm, e, paramInt), b, c, d, f, g, h, (byte)0);
  }
  
  public sy[] a(tb[] paramArrayOftb, tm paramtm)
  {
    Object localObject1 = a;
    if (localObject1 != null) {
      paramtm = (tm)localObject1;
    }
    localObject1 = new sy[paramArrayOftb.length];
    int i = 0;
    int j = 0;
    Object localObject2;
    int m;
    for (int k = j; j < paramArrayOftb.length; k = m)
    {
      localObject2 = paramArrayOftb[j];
      m = k;
      if (localObject2 != null)
      {
        localObject3 = b;
        m = k;
        if (localObject3.length == 1)
        {
          localObject1[j] = new sw(a, localObject3[0], c, d);
          int n = a.a(b[0]).e;
          m = k;
          if (n != -1) {
            m = k + n;
          }
        }
      }
      j++;
    }
    Object localObject3 = new ArrayList();
    for (j = 0; j < paramArrayOftb.length; j++)
    {
      localObject2 = paramArrayOftb[j];
      if (localObject2 != null)
      {
        int[] arrayOfInt = b;
        if (arrayOfInt.length > 1)
        {
          localObject2 = a(a, paramtm, arrayOfInt, k);
          ((ArrayList)localObject3).add(localObject2);
          localObject1[j] = localObject2;
        }
      }
    }
    if (((ArrayList)localObject3).size() > 1)
    {
      paramArrayOftb = new long[((ArrayList)localObject3).size()][];
      for (k = 0; k < ((ArrayList)localObject3).size(); k++)
      {
        paramtm = (sl)((ArrayList)localObject3).get(k);
        paramArrayOftb[k] = new long[b.length];
        for (j = 0;; j++)
        {
          localObject2 = b;
          if (j >= localObject2.length) {
            break;
          }
          paramArrayOftb[k][j] = alength1e;
        }
      }
      paramArrayOftb = sl.b(paramArrayOftb);
      for (k = i; k < ((ArrayList)localObject3).size(); k++) {
        ((sl)((ArrayList)localObject3).get(k)).a(paramArrayOftb[k]);
      }
    }
    return (sy[])localObject1;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ta
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */