package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.nio.ByteBuffer;

final class pt
  implements nw
{
  private final bw a;
  private final ki b;
  private long[] c;
  private boolean d;
  private py e;
  private boolean f;
  private int g;
  private long h;
  
  public pt(py parampy, bw parambw, boolean paramBoolean)
  {
    a = parambw;
    e = parampy;
    b = new ki();
    h = -9223372036854775807L;
    c = b;
    a(parampy, paramBoolean);
  }
  
  public final int a(by paramby, ez paramez, boolean paramBoolean)
  {
    if ((!paramBoolean) && (f))
    {
      int i = g;
      if (i == c.length)
      {
        if (!d)
        {
          paramez.a(4);
          return -4;
        }
        return -3;
      }
      g = (i + 1);
      paramby = b.a(e.a[i]);
      if (paramby != null)
      {
        paramez.d(paramby.length);
        b.put(paramby);
        c = c[i];
        paramez.a(1);
        return -4;
      }
      return -3;
    }
    c = a;
    f = true;
    return -5;
  }
  
  public final String a()
  {
    return e.a();
  }
  
  public final void a(py parampy, boolean paramBoolean)
  {
    int i = g;
    long l1;
    if (i == 0) {
      l1 = -9223372036854775807L;
    } else {
      l1 = c[(i - 1)];
    }
    d = paramBoolean;
    e = parampy;
    parampy = b;
    c = parampy;
    long l2 = h;
    if (l2 != -9223372036854775807L)
    {
      b(l2);
      return;
    }
    if (l1 != -9223372036854775807L) {
      g = wl.b(parampy, l1, false, false);
    }
  }
  
  public final void b(long paramLong)
  {
    long[] arrayOfLong = c;
    int i = 1;
    int j = wl.b(arrayOfLong, paramLong, true, false);
    g = j;
    if ((!d) || (j != c.length)) {
      i = 0;
    }
    if (i == 0) {
      paramLong = -9223372036854775807L;
    }
    h = paramLong;
  }
  
  public final boolean b()
  {
    return true;
  }
  
  public final int b_(long paramLong)
  {
    int i = Math.max(g, wl.b(c, paramLong, true, false));
    int j = g;
    g = i;
    return i - j;
  }
  
  public final void c()
    throws IOException
  {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.pt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */