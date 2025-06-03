package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

public class fp
{
  private final fo a;
  private final fs b;
  private fr c;
  private final int d;
  
  public fp(fq paramfq, fs paramfs, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt)
  {
    b = paramfs;
    d = 940;
    a = new fo(paramfq, paramLong1, 0L, paramLong3, 0L, paramLong5, 188L);
  }
  
  private static int a(fz paramfz, long paramLong, gf paramgf)
  {
    if (paramLong == paramfz.c()) {
      return 0;
    }
    a = paramLong;
    return 1;
  }
  
  private final void a(boolean paramBoolean, long paramLong)
  {
    c = null;
    b.a();
  }
  
  private static boolean a(fz paramfz, long paramLong)
    throws IOException, InterruptedException
  {
    paramLong -= paramfz.c();
    if ((paramLong >= 0L) && (paramLong <= 262144L))
    {
      paramfz.b((int)paramLong);
      return true;
    }
    return false;
  }
  
  public final int a(fz paramfz, gf paramgf, h paramh)
    throws InterruptedException, IOException
  {
    fs localfs = (fs)rp.a(b);
    long l3;
    for (;;)
    {
      fr localfr = (fr)rp.a(c);
      long l1 = fr.b(localfr);
      long l2 = fr.c(localfr);
      l3 = fr.d(localfr);
      if (l2 - l1 <= d)
      {
        a(false, l1);
        return a(paramfz, l1, paramgf);
      }
      if (!a(paramfz, l3)) {
        return a(paramfz, l3, paramgf);
      }
      paramfz.a();
      paramh = localfs.a(paramfz, fr.e(localfr));
      int i = ft.a(paramh);
      if (i == -3) {
        break;
      }
      if (i != -2)
      {
        if (i != -1)
        {
          if (i == 0)
          {
            a(true, ft.c(paramh));
            a(paramfz, ft.c(paramh));
            return a(paramfz, ft.c(paramh), paramgf);
          }
          throw new IllegalStateException("Invalid case");
        }
        fr.a(localfr, ft.b(paramh), ft.c(paramh));
      }
      else
      {
        fr.b(localfr, ft.b(paramh), ft.c(paramh));
      }
    }
    a(false, l3);
    return a(paramfz, l3, paramgf);
  }
  
  public final ge a()
  {
    return a;
  }
  
  public final void a(long paramLong)
  {
    fr localfr = c;
    if ((localfr != null) && (fr.a(localfr) == paramLong)) {
      return;
    }
    c = new fr(paramLong, a.b(paramLong), fo.a(a), fo.b(a), fo.c(a), fo.d(a), fo.e(a));
  }
  
  public final boolean b()
  {
    return c != null;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.fp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */