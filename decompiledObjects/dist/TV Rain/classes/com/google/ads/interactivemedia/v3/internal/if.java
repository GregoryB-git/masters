package com.google.ads.interactivemedia.v3.internal;

public final class if
  implements ik
{
  private final vz a;
  private final vy b;
  private final String c;
  private String d;
  private gi e;
  private int f;
  private int g;
  private boolean h;
  private long i;
  private bw j;
  private int k;
  private long l;
  
  public if()
  {
    this(null);
  }
  
  public if(String paramString)
  {
    vz localvz = new vz(new byte['']);
    a = localvz;
    b = new vy(a);
    f = 0;
    c = paramString;
  }
  
  public final void a()
  {
    f = 0;
    g = 0;
    h = false;
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
      Object localObject;
      if (m != 0)
      {
        if (m != 1)
        {
          if (m == 2)
          {
            m = Math.min(paramvy.b(), k - g);
            e.a(paramvy, m);
            m = g + m;
            g = m;
            int n = k;
            if (m == n)
            {
              e.a(l, 1, n, 0, null);
              l += i;
              f = 0;
            }
          }
        }
        else
        {
          localObject = b.a;
          m = Math.min(paramvy.b(), 128 - g);
          paramvy.a((byte[])localObject, g, m);
          m = g + m;
          g = m;
          if (m == 128)
          {
            a.a(0);
            localObject = dc.a(a);
            bw localbw = j;
            if ((localbw == null) || (c != t) || (b != u) || (a != i))
            {
              localbw = bw.a(d, a, null, -1, -1, c, b, null, null, 0, c);
              j = localbw;
              e.a(localbw);
            }
            k = d;
            i = (e * 1000000L / j.u);
            b.c(0);
            e.a(b, 128);
            f = 2;
          }
        }
      }
      else
      {
        while (paramvy.b() > 0)
        {
          boolean bool;
          if (!h)
          {
            if (paramvy.e() == 11) {
              bool = true;
            } else {
              bool = false;
            }
            h = bool;
          }
          else
          {
            m = paramvy.e();
            if (m == 119)
            {
              h = false;
              m = 1;
              break label442;
            }
            if (m == 11) {
              bool = true;
            } else {
              bool = false;
            }
            h = bool;
          }
        }
        m = 0;
        label442:
        if (m != 0)
        {
          f = 1;
          localObject = b.a;
          localObject[0] = ((byte)11);
          localObject[1] = ((byte)119);
          g = 2;
        }
      }
    }
  }
  
  public final void b() {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.if
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */