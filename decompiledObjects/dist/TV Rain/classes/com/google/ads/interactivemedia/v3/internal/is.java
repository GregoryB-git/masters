package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;

public final class is
  implements ik
{
  private final vy a = new vy(10);
  private gi b;
  private boolean c;
  private long d;
  private int e;
  private int f;
  
  public final void a()
  {
    c = false;
  }
  
  public final void a(long paramLong, int paramInt)
  {
    if ((paramInt & 0x4) == 0) {
      return;
    }
    c = true;
    d = paramLong;
    e = 0;
    f = 0;
  }
  
  public final void a(fy paramfy, jn paramjn)
  {
    paramjn.a();
    paramfy = paramfy.a(paramjn.b(), 4);
    b = paramfy;
    paramfy.a(bw.a(paramjn.c(), "application/id3", null, -1, null));
  }
  
  public final void a(vy paramvy)
  {
    if (!c) {
      return;
    }
    int i = paramvy.b();
    int j = f;
    if (j < 10)
    {
      j = Math.min(i, 10 - j);
      System.arraycopy(a, paramvy.d(), a.a, f, j);
      if (f + j == 10)
      {
        a.c(0);
        if ((73 == a.e()) && (68 == a.e()) && (51 == a.e()))
        {
          a.d(3);
          e = (a.o() + 10);
        }
        else
        {
          Log.w("Id3Reader", "Discarding invalid ID3 tag");
          c = false;
          return;
        }
      }
    }
    i = Math.min(i, e - f);
    b.a(paramvy, i);
    f += i;
  }
  
  public final void b()
  {
    if (c)
    {
      int i = e;
      if ((i != 0) && (f == i))
      {
        b.a(d, 1, i, 0, null);
        c = false;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.is
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */