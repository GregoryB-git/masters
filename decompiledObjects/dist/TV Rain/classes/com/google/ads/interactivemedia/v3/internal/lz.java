package com.google.ads.interactivemedia.v3.internal;

public final class lz
  implements nz
{
  private final nz[] a;
  
  public lz(nz[] paramArrayOfnz)
  {
    a = paramArrayOfnz;
  }
  
  public final void a(long paramLong)
  {
    nz[] arrayOfnz = a;
    int i = arrayOfnz.length;
    for (int j = 0; j < i; j++) {
      arrayOfnz[j].a(paramLong);
    }
  }
  
  public final boolean c(long paramLong)
  {
    int i = 0;
    int m;
    int i3;
    do
    {
      long l1 = e();
      if (l1 == Long.MIN_VALUE) {
        break;
      }
      nz[] arrayOfnz = a;
      int j = arrayOfnz.length;
      int k = 0;
      int i2;
      for (m = k; k < j; m = i2)
      {
        nz localnz = arrayOfnz[k];
        long l2 = localnz.e();
        int n;
        if ((l2 != Long.MIN_VALUE) && (l2 <= paramLong)) {
          n = 1;
        } else {
          n = 0;
        }
        if (l2 != l1)
        {
          int i1 = m;
          if (n == 0) {}
        }
        else
        {
          i2 = m | localnz.c(paramLong);
        }
        k++;
      }
      i3 = i | m;
      i = i3;
    } while (m != 0);
    i = i3;
    return i;
  }
  
  public final long d()
  {
    nz[] arrayOfnz = a;
    int i = arrayOfnz.length;
    int j = 0;
    long l3;
    for (long l1 = Long.MAX_VALUE; j < i; l1 = l3)
    {
      long l2 = arrayOfnz[j].d();
      l3 = l1;
      if (l2 != Long.MIN_VALUE) {
        l3 = Math.min(l1, l2);
      }
      j++;
    }
    if (l1 == Long.MAX_VALUE) {
      return Long.MIN_VALUE;
    }
    return l1;
  }
  
  public final long e()
  {
    nz[] arrayOfnz = a;
    int i = arrayOfnz.length;
    int j = 0;
    long l3;
    for (long l1 = Long.MAX_VALUE; j < i; l1 = l3)
    {
      long l2 = arrayOfnz[j].e();
      l3 = l1;
      if (l2 != Long.MIN_VALUE) {
        l3 = Math.min(l1, l2);
      }
      j++;
    }
    if (l1 == Long.MAX_VALUE) {
      return Long.MIN_VALUE;
    }
    return l1;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.lz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */