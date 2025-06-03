package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

final class pk
{
  public final boolean a;
  public final long b;
  public final long c;
  
  private pk(boolean paramBoolean, long paramLong1, long paramLong2)
  {
    a = paramBoolean;
    b = paramLong1;
    c = paramLong2;
  }
  
  public static pk a(qb paramqb, long paramLong)
  {
    int i = c.size();
    int j = 0;
    while (j < i)
    {
      m = c.get(j)).b;
      if ((m != 1) && (m != 2))
      {
        j++;
      }
      else
      {
        m = 1;
        break label68;
      }
    }
    int m = 0;
    label68:
    long l1 = Long.MAX_VALUE;
    int n = 0;
    j = n;
    int i1 = j;
    long l2 = 0L;
    int i2 = m;
    int k;
    while (n < i)
    {
      Object localObject = (wa)c.get(n);
      if (i2 != 0)
      {
        m = j;
        if (b != 3) {}
      }
      int i3;
      do
      {
        j = m;
        break;
        localObject = ((qc)c.get(0)).e();
        if (localObject == null) {
          return new pk(true, 0L, paramLong);
        }
        j |= ((pp)localObject).b();
        i3 = ((pp)localObject).c(paramLong);
        if (i3 == 0)
        {
          l1 = 0L;
          l2 = 0L;
          i1 = 1;
          break;
        }
        m = k;
      } while (i1 != 0);
      long l3 = ((pp)localObject).a();
      l2 = Math.max(l2, ((pp)localObject).a(l3));
      if (i3 != -1)
      {
        l3 = l3 + i3 - 1L;
        long l4 = ((pp)localObject).a(l3);
        l1 = Math.min(l1, ((pp)localObject).b(l3, paramLong) + l4);
      }
      n++;
    }
    return new pk(k, l2, l1);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.pk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */