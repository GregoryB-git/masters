package com.google.ads.interactivemedia.v3.internal;

final class it
{
  private final gi a;
  private long b;
  private boolean c;
  private int d;
  private long e;
  private boolean f;
  private boolean g;
  private boolean h;
  private boolean i;
  private boolean j;
  private long k;
  private long l;
  private boolean m;
  
  public it(gi paramgi)
  {
    a = paramgi;
  }
  
  private final void a(int paramInt)
  {
    int n = m;
    int i1 = (int)(b - k);
    a.a(l, n, i1, paramInt, null);
  }
  
  public final void a()
  {
    f = false;
    g = false;
    h = false;
    i = false;
    j = false;
  }
  
  public final void a(long paramLong, int paramInt)
  {
    if ((j) && (g))
    {
      m = c;
      j = false;
      return;
    }
    if ((h) || (g))
    {
      if (i) {
        a(paramInt + (int)(paramLong - b));
      }
      k = b;
      l = e;
      i = true;
      m = c;
    }
  }
  
  public final void a(long paramLong1, int paramInt1, int paramInt2, long paramLong2)
  {
    boolean bool1 = false;
    g = false;
    h = false;
    e = paramLong2;
    d = 0;
    b = paramLong1;
    if (paramInt2 >= 32)
    {
      if ((!j) && (i))
      {
        a(paramInt1);
        i = false;
      }
      if (paramInt2 <= 34)
      {
        h = (j ^ true);
        j = true;
      }
    }
    boolean bool2;
    if ((paramInt2 >= 16) && (paramInt2 <= 21)) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    c = bool2;
    if (!bool2)
    {
      bool2 = bool1;
      if (paramInt2 > 9) {}
    }
    else
    {
      bool2 = true;
    }
    f = bool2;
  }
  
  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (f)
    {
      int n = d;
      int i1 = paramInt1 + 2 - n;
      if (i1 < paramInt2)
      {
        boolean bool;
        if ((paramArrayOfByte[i1] & 0x80) != 0) {
          bool = true;
        } else {
          bool = false;
        }
        g = bool;
        f = false;
        return;
      }
      d = (paramInt2 - paramInt1 + n);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.it
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */