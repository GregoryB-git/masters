package com.google.ads.interactivemedia.v3.internal;

final class nt
{
  private int a = 1000;
  private int[] b = new int['Ϩ'];
  private long[] c = new long['Ϩ'];
  private int[] d = new int['Ϩ'];
  private int[] e = new int['Ϩ'];
  private long[] f = new long['Ϩ'];
  private gl[] g = new gl['Ϩ'];
  private bw[] h = new bw['Ϩ'];
  private int i;
  private int j;
  private int k;
  private int l;
  private long m = Long.MIN_VALUE;
  private long n = Long.MIN_VALUE;
  private boolean o;
  private boolean p = true;
  private boolean q = true;
  private bw r;
  private bw s;
  private int t;
  
  private final int a(int paramInt1, int paramInt2, long paramLong, boolean paramBoolean)
  {
    int i1 = -1;
    int i2 = 0;
    int i3 = paramInt1;
    for (paramInt1 = i2; (paramInt1 < paramInt2) && (f[i3] <= paramLong); paramInt1++)
    {
      if ((!paramBoolean) || ((e[i3] & 0x1) != 0)) {
        i1 = paramInt1;
      }
      i2 = i3 + 1;
      i3 = i2;
      if (i2 == a) {
        i3 = 0;
      }
    }
    return i1;
  }
  
  private final long d(int paramInt)
  {
    m = Math.max(m, e(paramInt));
    int i1 = i - paramInt;
    i = i1;
    j += paramInt;
    int i2 = k + paramInt;
    k = i2;
    int i3 = a;
    if (i2 >= i3) {
      k = (i2 - i3);
    }
    paramInt = l - paramInt;
    l = paramInt;
    if (paramInt < 0) {
      l = 0;
    }
    if (i1 == 0)
    {
      paramInt = k;
      if (paramInt == 0) {
        paramInt = i3;
      }
      paramInt--;
      return c[paramInt] + d[paramInt];
    }
    return c[k];
  }
  
  private final long e(int paramInt)
  {
    long l1 = Long.MIN_VALUE;
    if (paramInt == 0) {
      return Long.MIN_VALUE;
    }
    int i1 = f(paramInt - 1);
    long l2;
    for (int i2 = 0;; i2++)
    {
      l2 = l1;
      if (i2 >= paramInt) {
        break;
      }
      l1 = Math.max(l1, f[i1]);
      l2 = l1;
      if ((e[i1] & 0x1) != 0) {
        break;
      }
      int i3 = i1 - 1;
      i1 = i3;
      if (i3 == -1) {
        i1 = a - 1;
      }
    }
    return l2;
  }
  
  private final int f(int paramInt)
  {
    int i1 = k + paramInt;
    paramInt = a;
    if (i1 < paramInt) {
      return i1;
    }
    return i1 - paramInt;
  }
  
  public final int a()
  {
    return j + i;
  }
  
  public final int a(long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      int i1 = f(l);
      if ((e()) && (paramLong >= f[i1]) && ((paramLong <= n) || (paramBoolean2)))
      {
        i1 = a(i1, i - l, paramLong, paramBoolean1);
        if (i1 == -1) {
          return -1;
        }
        l += i1;
        return i1;
      }
      return -1;
    }
    finally {}
  }
  
  public final int a(bw parambw)
  {
    try
    {
      int i1 = l;
      int i2 = i;
      if (i1 == i2) {
        return 0;
      }
      i2 = f(i1);
      bw localbw = h[i2];
      if (localbw != parambw) {
        return 1;
      }
      i2 = e[i2];
      if ((i2 & 0x40000000) != 0) {
        return 3;
      }
      return 2;
    }
    finally {}
  }
  
  public final int a(by paramby, ez paramez, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, bw parambw, ns paramns)
  {
    try
    {
      if (!e())
      {
        if ((!paramBoolean3) && (!o))
        {
          paramez = r;
          if ((paramez != null) && ((paramBoolean1) || (paramez != parambw)))
          {
            c = paramez;
            return -5;
          }
          return -3;
        }
        paramez.a(4);
        return -4;
      }
      int i1 = f(l);
      if ((!paramBoolean1) && (h[i1] == parambw))
      {
        if (paramBoolean2)
        {
          int i2 = e[i1];
          if ((i2 & 0x40000000) != 0) {
            return -3;
          }
        }
        paramez.a(e[i1]);
        c = f[i1];
        paramBoolean1 = paramez.f();
        if (paramBoolean1) {
          return -4;
        }
        a = d[i1];
        b = c[i1];
        c = g[i1];
        l += 1;
        return -4;
      }
      c = h[i1];
      return -5;
    }
    finally {}
  }
  
  public final long a(int paramInt)
  {
    paramInt = a() - paramInt;
    boolean bool1 = false;
    if ((paramInt >= 0) && (paramInt <= i - l)) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    rp.b(bool2);
    int i1 = i - paramInt;
    i = i1;
    n = Math.max(m, e(i1));
    boolean bool2 = bool1;
    if (paramInt == 0)
    {
      bool2 = bool1;
      if (o) {
        bool2 = true;
      }
    }
    o = bool2;
    paramInt = i;
    if (paramInt == 0) {
      return 0L;
    }
    paramInt = f(paramInt - 1);
    return c[paramInt] + d[paramInt];
  }
  
  public final void a(long paramLong1, int paramInt1, long paramLong2, int paramInt2, gl paramgl)
  {
    try
    {
      boolean bool = p;
      if (bool)
      {
        if ((paramInt1 & 0x1) == 0) {
          return;
        }
        p = false;
      }
      if (!q) {
        bool = true;
      } else {
        bool = false;
      }
      rp.c(bool);
      if ((0x20000000 & paramInt1) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      o = bool;
      n = Math.max(n, paramLong1);
      int i1 = f(i);
      f[i1] = paramLong1;
      long[] arrayOfLong1 = c;
      arrayOfLong1[i1] = paramLong2;
      d[i1] = paramInt2;
      e[i1] = paramInt1;
      g[i1] = paramgl;
      Object localObject = h;
      paramgl = r;
      localObject[i1] = paramgl;
      b[i1] = t;
      s = paramgl;
      paramInt1 = i + 1;
      i = paramInt1;
      paramInt2 = a;
      if (paramInt1 == paramInt2)
      {
        paramInt1 = paramInt2 + 1000;
        int[] arrayOfInt1 = new int[paramInt1];
        long[] arrayOfLong2 = new long[paramInt1];
        localObject = new long[paramInt1];
        int[] arrayOfInt2 = new int[paramInt1];
        int[] arrayOfInt3 = new int[paramInt1];
        paramgl = new gl[paramInt1];
        bw[] arrayOfbw = new bw[paramInt1];
        i1 = k;
        paramInt2 -= i1;
        System.arraycopy(arrayOfLong1, i1, arrayOfLong2, 0, paramInt2);
        System.arraycopy(f, k, localObject, 0, paramInt2);
        System.arraycopy(e, k, arrayOfInt2, 0, paramInt2);
        System.arraycopy(d, k, arrayOfInt3, 0, paramInt2);
        System.arraycopy(g, k, paramgl, 0, paramInt2);
        System.arraycopy(h, k, arrayOfbw, 0, paramInt2);
        System.arraycopy(b, k, arrayOfInt1, 0, paramInt2);
        i1 = k;
        System.arraycopy(c, 0, arrayOfLong2, paramInt2, i1);
        System.arraycopy(f, 0, localObject, paramInt2, i1);
        System.arraycopy(e, 0, arrayOfInt2, paramInt2, i1);
        System.arraycopy(d, 0, arrayOfInt3, paramInt2, i1);
        System.arraycopy(g, 0, paramgl, paramInt2, i1);
        System.arraycopy(h, 0, arrayOfbw, paramInt2, i1);
        System.arraycopy(b, 0, arrayOfInt1, paramInt2, i1);
        c = arrayOfLong2;
        f = ((long[])localObject);
        e = arrayOfInt2;
        d = arrayOfInt3;
        g = paramgl;
        h = arrayOfbw;
        b = arrayOfInt1;
        k = 0;
        i = a;
        a = paramInt1;
      }
      return;
    }
    finally {}
  }
  
  public final void a(boolean paramBoolean)
  {
    i = 0;
    j = 0;
    k = 0;
    l = 0;
    p = true;
    m = Long.MIN_VALUE;
    n = Long.MIN_VALUE;
    o = false;
    s = null;
    if (paramBoolean)
    {
      r = null;
      q = true;
    }
  }
  
  public final boolean a(long paramLong)
  {
    try
    {
      if (i == 0)
      {
        l1 = m;
        return paramLong > l1;
      }
      long l1 = Math.max(m, e(l));
      if (l1 >= paramLong) {
        return false;
      }
      int i1 = i;
      int i2 = f(i1 - 1);
      while ((i1 > l) && (f[i2] >= paramLong))
      {
        int i3 = i1 - 1;
        int i4 = i2 - 1;
        i1 = i3;
        i2 = i4;
        if (i4 == -1)
        {
          i2 = a - 1;
          i1 = i3;
        }
      }
      a(j + i1);
      return true;
    }
    finally {}
  }
  
  public final int b()
  {
    return j;
  }
  
  public final long b(long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      int i1 = i;
      if (i1 != 0)
      {
        long[] arrayOfLong = f;
        int i2 = k;
        if (paramLong >= arrayOfLong[i2])
        {
          int i3 = i1;
          if (paramBoolean2)
          {
            int i4 = l;
            i3 = i1;
            if (i4 != i1) {
              i3 = i4 + 1;
            }
          }
          i3 = a(i2, i3, paramLong, paramBoolean1);
          if (i3 == -1) {
            return -1L;
          }
          paramLong = d(i3);
          return paramLong;
        }
      }
      return -1L;
    }
    finally {}
  }
  
  public final void b(int paramInt)
  {
    t = paramInt;
  }
  
  public final boolean b(bw parambw)
  {
    if (parambw == null) {}
    try
    {
      q = true;
      return false;
    }
    finally {}
    q = false;
    boolean bool = wl.a(parambw, r);
    if (bool) {
      return false;
    }
    if (wl.a(parambw, s))
    {
      r = s;
      return true;
    }
    r = parambw;
    return true;
  }
  
  public final int c()
  {
    return j + l;
  }
  
  public final boolean c(int paramInt)
  {
    try
    {
      int i1 = j;
      if ((i1 <= paramInt) && (paramInt <= i + i1))
      {
        l = (paramInt - i1);
        return true;
      }
      return false;
    }
    finally {}
  }
  
  public final int d()
  {
    int i1 = f(l);
    if (e()) {
      return b[i1];
    }
    return t;
  }
  
  /* Error */
  public final boolean e()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 85	com/google/ads/interactivemedia/v3/internal/nt:l	I
    //   6: istore_1
    //   7: aload_0
    //   8: getfield 79	com/google/ads/interactivemedia/v3/internal/nt:i	I
    //   11: istore_2
    //   12: iload_1
    //   13: iload_2
    //   14: if_icmpeq +9 -> 23
    //   17: iconst_1
    //   18: istore_3
    //   19: aload_0
    //   20: monitorexit
    //   21: iload_3
    //   22: ireturn
    //   23: iconst_0
    //   24: istore_3
    //   25: goto -6 -> 19
    //   28: astore 4
    //   30: aload_0
    //   31: monitorexit
    //   32: aload 4
    //   34: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	35	0	this	nt
    //   6	9	1	i1	int
    //   11	4	2	i2	int
    //   18	7	3	bool	boolean
    //   28	5	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	12	28	finally
  }
  
  public final bw f()
  {
    try
    {
      boolean bool = q;
      if (bool) {
        return null;
      }
      bw localbw = r;
      return localbw;
    }
    finally {}
  }
  
  public final long g()
  {
    try
    {
      long l1 = n;
      return l1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean h()
  {
    try
    {
      boolean bool = o;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final long i()
  {
    try
    {
      int i1 = i;
      if (i1 == 0) {
        return Long.MIN_VALUE;
      }
      long l1 = f[k];
      return l1;
    }
    finally {}
  }
  
  public final void j()
  {
    try
    {
      l = 0;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int k()
  {
    try
    {
      int i1 = i;
      int i2 = l;
      l = i1;
      return i1 - i2;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final long l()
  {
    try
    {
      int i1 = l;
      if (i1 == 0) {
        return -1L;
      }
      long l1 = d(i1);
      return l1;
    }
    finally {}
  }
  
  public final long m()
  {
    try
    {
      int i1 = i;
      if (i1 == 0) {
        return -1L;
      }
      long l1 = d(i1);
      return l1;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.nt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */