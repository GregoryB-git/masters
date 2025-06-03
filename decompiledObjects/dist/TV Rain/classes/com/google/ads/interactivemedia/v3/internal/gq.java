package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

final class gq
{
  private final byte[] a = new byte[10];
  private boolean b;
  private int c;
  private int d;
  private long e;
  private int f;
  
  public final void a()
  {
    b = false;
  }
  
  public final void a(fz paramfz, int paramInt1, int paramInt2)
    throws IOException, InterruptedException
  {
    if (!b)
    {
      paramfz.c(a, 0, 10);
      paramfz.a();
      if (dc.b(a) == 0) {
        return;
      }
      b = true;
      c = 0;
    }
    if (c == 0)
    {
      f = paramInt1;
      d = 0;
    }
    d += paramInt2;
  }
  
  public final void a(gr paramgr)
  {
    if ((b) && (c > 0))
    {
      U.a(e, f, d, 0, i);
      c = 0;
    }
  }
  
  public final void a(gr paramgr, long paramLong)
  {
    if (!b) {
      return;
    }
    int i = c;
    int j = i + 1;
    c = j;
    if (i == 0) {
      e = paramLong;
    }
    if (j < 16) {
      return;
    }
    U.a(e, f, d, 0, i);
    c = 0;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.gq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */