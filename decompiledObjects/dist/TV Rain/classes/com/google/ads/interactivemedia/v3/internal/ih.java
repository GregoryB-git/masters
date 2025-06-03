package com.google.ads.interactivemedia.v3.internal;

public final class ih
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
  private boolean i;
  private long j;
  private bw k;
  private int l;
  private long m;
  
  public ih()
  {
    this(null);
  }
  
  public ih(String paramString)
  {
    vz localvz = new vz(new byte[16]);
    a = localvz;
    b = new vy(a);
    f = 0;
    g = 0;
    h = false;
    i = false;
    c = paramString;
  }
  
  public final void a()
  {
    f = 0;
    g = 0;
    h = false;
    i = false;
  }
  
  public final void a(long paramLong, int paramInt)
  {
    m = paramLong;
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
      int n = f;
      int i1;
      Object localObject;
      if (n != 0)
      {
        if (n != 1)
        {
          if (n == 2)
          {
            n = Math.min(paramvy.b(), l - g);
            e.a(paramvy, n);
            n = g + n;
            g = n;
            i1 = l;
            if (n == i1)
            {
              e.a(m, 1, i1, 0, null);
              m += j;
              f = 0;
            }
          }
        }
        else
        {
          localObject = b.a;
          n = Math.min(paramvy.b(), 16 - g);
          paramvy.a((byte[])localObject, g, n);
          n = g + n;
          g = n;
          if (n == 16)
          {
            a.a(0);
            localObject = de.a(a);
            bw localbw = k;
            if ((localbw == null) || (b != t) || (a != u) || (!"audio/ac4".equals(i)))
            {
              localbw = bw.a(d, "audio/ac4", null, -1, -1, b, a, null, null, 0, c);
              k = localbw;
              e.a(localbw);
            }
            l = c;
            j = (d * 1000000L / k.u);
            b.c(0);
            e.a(b, 16);
            f = 2;
          }
        }
      }
      else
      {
        boolean bool;
        do
        {
          for (;;)
          {
            n = paramvy.b();
            i1 = 64;
            if (n <= 0) {
              break label460;
            }
            if (h) {
              break;
            }
            if (paramvy.e() == 172) {
              bool = true;
            } else {
              bool = false;
            }
            h = bool;
          }
          n = paramvy.e();
          if (n == 172) {
            bool = true;
          } else {
            bool = false;
          }
          h = bool;
        } while ((n != 64) && (n != 65));
        if (n == 65) {
          bool = true;
        } else {
          bool = false;
        }
        i = bool;
        n = 1;
        break label462;
        label460:
        n = 0;
        label462:
        if (n != 0)
        {
          f = 1;
          localObject = b.a;
          localObject[0] = ((byte)-84);
          n = i1;
          if (i) {
            n = 65;
          }
          localObject[1] = ((byte)(byte)n);
          g = 2;
        }
      }
    }
  }
  
  public final void b() {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ih
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */