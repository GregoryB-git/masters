package m4;

import c4.v;
import java.util.Collections;
import v3.a1;
import v3.i0;
import v3.i0.a;
import v5.t;
import v5.u;
import x3.a;
import x3.a.a;
import x6.b;

public final class p
  implements j
{
  public final String a;
  public final u b;
  public final t c;
  public v d;
  public String e;
  public i0 f;
  public int g;
  public int h;
  public int i;
  public int j;
  public long k;
  public boolean l;
  public int m;
  public int n;
  public int o;
  public boolean p;
  public long q;
  public int r;
  public long s;
  public int t;
  public String u;
  
  public p(String paramString)
  {
    a = paramString;
    paramString = new u(1024);
    b = paramString;
    paramString = a;
    c = new t(paramString, paramString.length);
    k = -9223372036854775807L;
  }
  
  public final void a(u paramu)
  {
    b.K(d);
    for (;;)
    {
      int i1 = c - b;
      if (i1 <= 0) {
        break;
      }
      int i2 = g;
      if (i2 != 0)
      {
        if (i2 != 1)
        {
          Object localObject1;
          Object localObject2;
          if (i2 != 2)
          {
            if (i2 == 3)
            {
              i2 = Math.min(i1, i - h);
              paramu.d(c.a, h, i2);
              i2 = h + i2;
              h = i2;
              if (i2 != i) {
                continue;
              }
              c.k(0);
              localObject1 = c;
              if (!((t)localObject1).f())
              {
                l = true;
                i1 = ((t)localObject1).g(1);
                if (i1 == 1) {
                  i2 = ((t)localObject1).g(1);
                } else {
                  i2 = 0;
                }
                m = i2;
                if (i2 == 0)
                {
                  if (i1 == 1) {
                    ((t)localObject1).g((((t)localObject1).g(2) + 1) * 8);
                  }
                  if (((t)localObject1).f())
                  {
                    n = ((t)localObject1).g(6);
                    int i3 = ((t)localObject1).g(4);
                    i2 = ((t)localObject1).g(3);
                    if ((i3 == 0) && (i2 == 0))
                    {
                      if (i1 == 0)
                      {
                        i2 = ((t)localObject1).e();
                        i3 = ((t)localObject1).b();
                        localObject2 = a.c((t)localObject1, true);
                        u = c;
                        r = a;
                        t = b;
                        i3 -= ((t)localObject1).b();
                        ((t)localObject1).k(i2);
                        byte[] arrayOfByte = new byte[(i3 + 7) / 8];
                        ((t)localObject1).h(arrayOfByte, i3);
                        localObject2 = new i0.a();
                        a = e;
                        k = "audio/mp4a-latm";
                        h = u;
                        x = t;
                        y = r;
                        m = Collections.singletonList(arrayOfByte);
                        c = a;
                        localObject2 = new i0((i0.a)localObject2);
                        if (!((i0)localObject2).equals(f))
                        {
                          f = ((i0)localObject2);
                          s = (1024000000L / H);
                          d.d((i0)localObject2);
                        }
                      }
                      else
                      {
                        i2 = (int)((t)localObject1).g((((t)localObject1).g(2) + 1) * 8);
                        i3 = ((t)localObject1).b();
                        localObject2 = a.c((t)localObject1, true);
                        u = c;
                        r = a;
                        t = b;
                        ((t)localObject1).m(i2 - (i3 - ((t)localObject1).b()));
                      }
                      i2 = ((t)localObject1).g(3);
                      o = i2;
                      if (i2 != 0)
                      {
                        if (i2 != 1)
                        {
                          if ((i2 != 3) && (i2 != 4) && (i2 != 5))
                          {
                            if ((i2 != 6) && (i2 != 7)) {
                              throw new IllegalStateException();
                            }
                            ((t)localObject1).m(1);
                            break label602;
                          }
                          i2 = 6;
                        }
                        else
                        {
                          i2 = 9;
                        }
                      }
                      else {
                        i2 = 8;
                      }
                      ((t)localObject1).m(i2);
                      label602:
                      boolean bool = ((t)localObject1).f();
                      p = bool;
                      q = 0L;
                      if (bool) {
                        if (i1 == 1) {
                          q = ((t)localObject1).g((((t)localObject1).g(2) + 1) * 8);
                        } else {
                          do
                          {
                            bool = ((t)localObject1).f();
                            q = ((q << 8) + ((t)localObject1).g(8));
                          } while (bool);
                        }
                      }
                      if (((t)localObject1).f()) {
                        ((t)localObject1).m(8);
                      }
                    }
                    else
                    {
                      throw a1.a(null, null);
                    }
                  }
                  else
                  {
                    throw a1.a(null, null);
                  }
                }
                else
                {
                  throw a1.a(null, null);
                }
              }
              else
              {
                if (!l) {
                  break label1053;
                }
              }
              if (m == 0)
              {
                if (n == 0)
                {
                  if (o == 0)
                  {
                    i2 = 0;
                    for (;;)
                    {
                      i1 = ((t)localObject1).g(8);
                      i2 += i1;
                      if (i1 != 255)
                      {
                        i1 = ((t)localObject1).e();
                        if ((i1 & 0x7) == 0)
                        {
                          b.G(i1 >> 3);
                        }
                        else
                        {
                          ((t)localObject1).h(b.a, i2 * 8);
                          b.G(0);
                        }
                        d.b(i2, b);
                        long l1 = k;
                        if (l1 != -9223372036854775807L)
                        {
                          d.c(l1, 1, i2, 0, null);
                          k += s;
                        }
                        if (!p) {
                          break;
                        }
                        ((t)localObject1).m((int)q);
                        break;
                      }
                    }
                  }
                  throw a1.a(null, null);
                }
                throw a1.a(null, null);
              }
              throw a1.a(null, null);
            }
            else
            {
              throw new IllegalStateException();
            }
          }
          else
          {
            i2 = (j & 0xFF1F) << 8 | paramu.v();
            i = i2;
            localObject1 = b;
            if (i2 > a.length)
            {
              ((u)localObject1).D(i2);
              localObject1 = c;
              localObject2 = b.a;
              localObject1.getClass();
              ((t)localObject1).j((byte[])localObject2, localObject2.length);
            }
            h = 0;
            g = 3;
          }
        }
        else
        {
          i2 = paramu.v();
          if ((i2 & 0xE0) == 224)
          {
            j = i2;
            g = 2;
            continue;
          }
          if (i2 == 86) {
            continue;
          }
        }
        label1053:
        g = 0;
      }
      else if (paramu.v() == 86)
      {
        g = 1;
      }
    }
  }
  
  public final void b()
  {
    g = 0;
    k = -9223372036854775807L;
    l = false;
  }
  
  public final void c() {}
  
  public final void d(int paramInt, long paramLong)
  {
    if (paramLong != -9223372036854775807L) {
      k = paramLong;
    }
  }
  
  public final void e(c4.j paramj, d0.d paramd)
  {
    paramd.a();
    paramd.b();
    d = paramj.r(d, 1);
    paramd.b();
    e = e;
  }
}

/* Location:
 * Qualified Name:     m4.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */