package com.google.ads.interactivemedia.v3.internal;

public final class ii
  implements ik
{
  private final vy a = new vy(new byte[18]);
  private final String b;
  private String c;
  private gi d;
  private int e = 0;
  private int f;
  private int g;
  private long h;
  private bw i;
  private int j;
  private long k;
  
  public ii(String paramString)
  {
    b = paramString;
  }
  
  public final void a()
  {
    e = 0;
    f = 0;
    g = 0;
  }
  
  public final void a(long paramLong, int paramInt)
  {
    k = paramLong;
  }
  
  public final void a(fy paramfy, jn paramjn)
  {
    paramjn.a();
    c = paramjn.c();
    d = paramfy.a(paramjn.b(), 1);
  }
  
  public final void a(vy paramvy)
  {
    while (paramvy.b() > 0)
    {
      int m = e;
      int n = 0;
      Object localObject;
      if (m != 0)
      {
        if (m != 1)
        {
          if (m == 2)
          {
            m = Math.min(paramvy.b(), j - f);
            d.a(paramvy, m);
            m = f + m;
            f = m;
            n = j;
            if (m == n)
            {
              d.a(k, 1, n, 0, null);
              k += h;
              e = 0;
            }
          }
          else
          {
            throw new IllegalStateException();
          }
        }
        else
        {
          localObject = a.a;
          m = Math.min(paramvy.b(), 18 - f);
          paramvy.a((byte[])localObject, f, m);
          m = f + m;
          f = m;
          if (m == 18)
          {
            byte[] arrayOfByte = a.a;
            if (i == null)
            {
              localObject = en.a(arrayOfByte, c, b, null);
              i = ((bw)localObject);
              d.a((bw)localObject);
            }
            j = en.b(arrayOfByte);
            h = ((int)(en.a(arrayOfByte) * 1000000L / i.u));
            a.c(0);
            d.a(a, 18);
            e = 2;
          }
        }
      }
      else
      {
        do
        {
          m = n;
          if (paramvy.b() <= 0) {
            break;
          }
          m = g << 8;
          g = m;
          m |= paramvy.e();
          g = m;
        } while (!en.a(m));
        localObject = a.a;
        m = g;
        localObject[0] = ((byte)(byte)(m >>> 24));
        localObject[1] = ((byte)(byte)(m >> 16));
        localObject[2] = ((byte)(byte)(m >> 8));
        localObject[3] = ((byte)(byte)m);
        f = 4;
        g = 0;
        m = 1;
        if (m != 0) {
          e = 1;
        }
      }
    }
  }
  
  public final void b() {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ii
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */