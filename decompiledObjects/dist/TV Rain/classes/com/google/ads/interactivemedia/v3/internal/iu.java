package com.google.ads.interactivemedia.v3.internal;

public final class iu
  implements ik
{
  private final vy a;
  private final gc b;
  private final String c;
  private String d;
  private gi e;
  private int f = 0;
  private int g;
  private boolean h;
  private boolean i;
  private long j;
  private int k;
  private long l;
  
  public iu()
  {
    this(null);
  }
  
  public iu(String paramString)
  {
    vy localvy = new vy(4);
    a = localvy;
    a[0] = ((byte)-1);
    b = new gc();
    c = paramString;
  }
  
  public final void a()
  {
    f = 0;
    g = 0;
    i = false;
  }
  
  public final void a(long paramLong, int paramInt)
  {
    l = paramLong;
  }
  
  public final void a(fy paramfy, jn paramjn)
  {
    paramjn.a();
    d = paramjn.c();
    e = paramfy.a(paramjn.b(), 1);
  }
  
  public final void a(vy paramvy)
  {
    while (paramvy.b() > 0)
    {
      int m = f;
      int n;
      Object localObject;
      if (m != 0)
      {
        if (m != 1)
        {
          if (m == 2)
          {
            m = Math.min(paramvy.b(), k - g);
            e.a(paramvy, m);
            n = g + m;
            g = n;
            m = k;
            if (n >= m)
            {
              e.a(l, 1, m, 0, null);
              l += j;
              g = 0;
              f = 0;
            }
          }
          else
          {
            throw new IllegalStateException();
          }
        }
        else
        {
          m = Math.min(paramvy.b(), 4 - g);
          paramvy.a(a.a, g, m);
          m = g + m;
          g = m;
          if (m >= 4)
          {
            a.c(0);
            if (!gc.a(a.l(), b))
            {
              g = 0;
              f = 1;
            }
            else
            {
              localObject = b;
              k = c;
              if (!h)
              {
                long l1 = g;
                m = d;
                j = (l1 * 1000000L / m);
                localObject = bw.a(d, b, null, -1, 4096, e, m, null, null, 0, c);
                e.a((bw)localObject);
                h = true;
              }
              a.c(0);
              e.a(a, 4);
              f = 2;
            }
          }
        }
      }
      else
      {
        localObject = a;
        m = paramvy.d();
        int i1 = paramvy.c();
        for (;;)
        {
          if (m >= i1) {
            break label467;
          }
          n = localObject[m];
          boolean bool;
          if ((n & 0xFF) == 255) {
            bool = true;
          } else {
            bool = false;
          }
          if ((i) && ((n & 0xE0) == 224)) {
            n = 1;
          } else {
            n = 0;
          }
          i = bool;
          if (n != 0)
          {
            paramvy.c(m + 1);
            i = false;
            a.a[1] = ((byte)localObject[m]);
            g = 2;
            f = 1;
            break;
          }
          m++;
        }
        label467:
        paramvy.c(i1);
      }
    }
  }
  
  public final void b() {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.iu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */