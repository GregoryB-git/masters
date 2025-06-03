package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

public final class lt
  implements mo, mr
{
  public final mo a;
  public long b;
  public long c;
  private mr d;
  private ls[] e;
  private long f;
  
  public lt(mo parammo, boolean paramBoolean, long paramLong1, long paramLong2)
  {
    a = parammo;
    e = new ls[0];
    f = 0L;
    b = 0L;
    c = paramLong2;
  }
  
  public final long a(long paramLong, cn paramcn)
  {
    long l1 = b;
    if (paramLong == l1) {
      return l1;
    }
    long l2 = wl.a(c, 0L, paramLong - l1);
    long l3 = d;
    l1 = c;
    if (l1 == Long.MIN_VALUE) {
      l1 = Long.MAX_VALUE;
    } else {
      l1 -= paramLong;
    }
    l1 = wl.a(l3, 0L, l1);
    if ((l2 != c) || (l1 != d)) {
      paramcn = new cn(l2, l1);
    }
    return a.a(paramLong, paramcn);
  }
  
  public final long a(sy[] paramArrayOfsy, boolean[] paramArrayOfBoolean1, nw[] paramArrayOfnw, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    e = new ls[paramArrayOfnw.length];
    nw[] arrayOfnw = new nw[paramArrayOfnw.length];
    int i = 0;
    int k;
    for (int j = 0;; j++)
    {
      k = paramArrayOfnw.length;
      nw localnw = null;
      if (j >= k) {
        break;
      }
      ls[] arrayOfls = e;
      ls localls = (ls)paramArrayOfnw[j];
      arrayOfls[j] = localls;
      if (localls != null) {
        localnw = a;
      }
      arrayOfnw[j] = localnw;
    }
    long l1 = a.a(paramArrayOfsy, paramArrayOfBoolean1, arrayOfnw, paramArrayOfBoolean2, paramLong);
    boolean bool1 = f();
    boolean bool2 = true;
    if (bool1)
    {
      l2 = b;
      if (paramLong == l2)
      {
        if (l2 != 0L)
        {
          k = paramArrayOfsy.length;
          for (j = 0; j < k; j++)
          {
            paramArrayOfBoolean1 = paramArrayOfsy[j];
            if ((paramArrayOfBoolean1 != null) && (!vs.a(hi)))
            {
              j = 1;
              break label190;
            }
          }
        }
        j = 0;
        label190:
        if (j != 0)
        {
          l2 = l1;
          break label207;
        }
      }
    }
    long l2 = -9223372036854775807L;
    label207:
    f = l2;
    bool1 = bool2;
    if (l1 != paramLong)
    {
      if (l1 >= b)
      {
        paramLong = c;
        bool1 = bool2;
        if (paramLong == Long.MIN_VALUE) {
          break label272;
        }
        if (l1 <= paramLong)
        {
          bool1 = bool2;
          break label272;
        }
      }
      bool1 = false;
    }
    label272:
    rp.c(bool1);
    for (j = i; j < paramArrayOfnw.length; j++)
    {
      paramArrayOfBoolean2 = arrayOfnw[j];
      if (paramArrayOfBoolean2 == null)
      {
        e[j] = null;
      }
      else
      {
        paramArrayOfsy = e;
        paramArrayOfBoolean1 = paramArrayOfsy[j];
        if ((paramArrayOfBoolean1 == null) || (a != paramArrayOfBoolean2)) {
          paramArrayOfsy[j] = new ls(this, paramArrayOfBoolean2);
        }
      }
      paramArrayOfnw[j] = e[j];
    }
    return l1;
  }
  
  public final void a(long paramLong)
  {
    a.a(paramLong);
  }
  
  public final void a(long paramLong, boolean paramBoolean)
  {
    a.a(paramLong, paramBoolean);
  }
  
  public final void a(mo parammo)
  {
    ((mr)rp.a(d)).a(this);
  }
  
  public final void a(mr parammr, long paramLong)
  {
    d = parammr;
    a.a(this, paramLong);
  }
  
  public final void a_()
    throws IOException
  {
    a.a_();
  }
  
  public final long b(long paramLong)
  {
    f = -9223372036854775807L;
    ls[] arrayOfls = e;
    int i = arrayOfls.length;
    boolean bool1 = false;
    for (int j = 0; j < i; j++)
    {
      ls localls = arrayOfls[j];
      if (localls != null) {
        localls.a();
      }
    }
    long l = a.b(paramLong);
    if (l != paramLong)
    {
      bool2 = bool1;
      if (l < b) {
        break label111;
      }
      paramLong = c;
      if (paramLong != Long.MIN_VALUE)
      {
        bool2 = bool1;
        if (l > paramLong) {
          break label111;
        }
      }
    }
    boolean bool2 = true;
    label111:
    rp.c(bool2);
    return l;
  }
  
  public final of b()
  {
    return a.b();
  }
  
  public final long c()
  {
    if (f())
    {
      l1 = f;
      f = -9223372036854775807L;
      l2 = c();
      if (l2 != -9223372036854775807L) {
        return l2;
      }
      return l1;
    }
    long l2 = a.c();
    if (l2 == -9223372036854775807L) {
      return -9223372036854775807L;
    }
    long l1 = b;
    boolean bool1 = true;
    if (l2 >= l1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    rp.c(bool2);
    l1 = c;
    boolean bool2 = bool1;
    if (l1 != Long.MIN_VALUE) {
      if (l2 <= l1) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    rp.c(bool2);
    return l2;
  }
  
  public final boolean c(long paramLong)
  {
    return a.c(paramLong);
  }
  
  public final long d()
  {
    long l1 = a.d();
    if (l1 != Long.MIN_VALUE)
    {
      long l2 = c;
      if ((l2 == Long.MIN_VALUE) || (l1 < l2)) {
        return l1;
      }
    }
    return Long.MIN_VALUE;
  }
  
  public final long e()
  {
    long l1 = a.e();
    if (l1 != Long.MIN_VALUE)
    {
      long l2 = c;
      if ((l2 == Long.MIN_VALUE) || (l1 < l2)) {
        return l1;
      }
    }
    return Long.MIN_VALUE;
  }
  
  public final boolean f()
  {
    return f != -9223372036854775807L;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.lt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */