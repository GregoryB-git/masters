package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;
import java.util.Collections;

public final class iv
  implements ik
{
  private final String a;
  private final vy b;
  private final vz c;
  private gi d;
  private bw e;
  private String f;
  private int g;
  private int h;
  private int i;
  private int j;
  private long k;
  private boolean l;
  private int m;
  private int n;
  private int o;
  private boolean p;
  private long q;
  private int r;
  private long s;
  private int t;
  
  public iv(String paramString)
  {
    a = paramString;
    paramString = new vy(1024);
    b = paramString;
    c = new vz(a);
  }
  
  private final int a(vz paramvz)
    throws ce
  {
    int i1 = paramvz.a();
    Pair localPair = vg.a(paramvz, true);
    r = ((Integer)first).intValue();
    t = ((Integer)second).intValue();
    return i1 - paramvz.a();
  }
  
  private static long b(vz paramvz)
  {
    return paramvz.c(paramvz.c(2) + 1 << 3);
  }
  
  public final void a()
  {
    g = 0;
    l = false;
  }
  
  public final void a(long paramLong, int paramInt)
  {
    k = paramLong;
  }
  
  public final void a(fy paramfy, jn paramjn)
  {
    paramjn.a();
    d = paramfy.a(paramjn.b(), 1);
    f = paramjn.c();
  }
  
  public final void a(vy paramvy)
    throws ce
  {
    while (paramvy.b() > 0)
    {
      int i1 = g;
      if (i1 != 0)
      {
        if (i1 != 1)
        {
          Object localObject1;
          Object localObject2;
          if (i1 != 2)
          {
            if (i1 == 3)
            {
              i1 = Math.min(paramvy.b(), i - h);
              paramvy.a(c.a, h, i1);
              i1 = h + i1;
              h = i1;
              if (i1 == i)
              {
                c.a(0);
                localObject1 = c;
                int i2;
                if (!((vz)localObject1).d())
                {
                  l = true;
                  i2 = ((vz)localObject1).c(1);
                  if (i2 == 1) {
                    i1 = ((vz)localObject1).c(1);
                  } else {
                    i1 = 0;
                  }
                  m = i1;
                  if (i1 == 0)
                  {
                    if (i2 == 1) {
                      b((vz)localObject1);
                    }
                    if (((vz)localObject1).d())
                    {
                      n = ((vz)localObject1).c(6);
                      int i3 = ((vz)localObject1).c(4);
                      i1 = ((vz)localObject1).c(3);
                      if ((i3 == 0) && (i1 == 0))
                      {
                        if (i2 == 0)
                        {
                          i3 = ((vz)localObject1).b();
                          i1 = a((vz)localObject1);
                          ((vz)localObject1).a(i3);
                          localObject2 = new byte[(i1 + 7) / 8];
                          ((vz)localObject1).a((byte[])localObject2, 0, i1);
                          localObject2 = bw.a(f, "audio/mp4a-latm", null, -1, -1, t, r, Collections.singletonList(localObject2), null, 0, a);
                          if (!((bw)localObject2).equals(e))
                          {
                            e = ((bw)localObject2);
                            s = (1024000000L / u);
                            d.a((bw)localObject2);
                          }
                        }
                        else
                        {
                          ((vz)localObject1).b((int)b((vz)localObject1) - a((vz)localObject1));
                        }
                        i1 = ((vz)localObject1).c(3);
                        o = i1;
                        if (i1 != 0)
                        {
                          if (i1 != 1)
                          {
                            if ((i1 != 3) && (i1 != 4) && (i1 != 5))
                            {
                              if ((i1 != 6) && (i1 != 7)) {
                                throw new IllegalStateException();
                              }
                              ((vz)localObject1).b(1);
                            }
                            else
                            {
                              ((vz)localObject1).b(6);
                            }
                          }
                          else {
                            ((vz)localObject1).b(9);
                          }
                        }
                        else {
                          ((vz)localObject1).b(8);
                        }
                        boolean bool = ((vz)localObject1).d();
                        p = bool;
                        q = 0L;
                        if (bool) {
                          if (i2 == 1) {
                            q = b((vz)localObject1);
                          } else {
                            do
                            {
                              bool = ((vz)localObject1).d();
                              q = ((q << 8) + ((vz)localObject1).c(8));
                            } while (bool);
                          }
                        }
                        if (((vz)localObject1).d()) {
                          ((vz)localObject1).b(8);
                        }
                      }
                      else
                      {
                        throw new ce();
                      }
                    }
                    else
                    {
                      throw new ce();
                    }
                  }
                  else
                  {
                    throw new ce();
                  }
                }
                else
                {
                  if (!l) {
                    break label719;
                  }
                }
                if (m == 0)
                {
                  if (n == 0)
                  {
                    if (o == 0)
                    {
                      i1 = 0;
                      for (;;)
                      {
                        i2 = ((vz)localObject1).c(8);
                        i1 += i2;
                        if (i2 != 255)
                        {
                          i2 = ((vz)localObject1).b();
                          if ((i2 & 0x7) == 0)
                          {
                            b.c(i2 >> 3);
                          }
                          else
                          {
                            ((vz)localObject1).a(b.a, 0, i1 << 3);
                            b.c(0);
                          }
                          d.a(b, i1);
                          d.a(k, 1, i1, 0, null);
                          k += s;
                          if (!p) {
                            break;
                          }
                          ((vz)localObject1).b((int)q);
                          break;
                        }
                      }
                    }
                    throw new ce();
                  }
                  throw new ce();
                }
                throw new ce();
                label719:
                g = 0;
              }
            }
            else
            {
              throw new IllegalStateException();
            }
          }
          else
          {
            i1 = (j & 0xFF1F) << 8 | paramvy.e();
            i = i1;
            localObject1 = b;
            if (i1 > a.length)
            {
              ((vy)localObject1).a(i1);
              localObject1 = c;
              localObject2 = b.a;
              ((vz)localObject1).a((byte[])localObject2, localObject2.length);
            }
            h = 0;
            g = 3;
          }
        }
        else
        {
          i1 = paramvy.e();
          if ((i1 & 0xE0) == 224)
          {
            j = i1;
            g = 2;
          }
          else if (i1 != 86)
          {
            g = 0;
          }
        }
      }
      else if (paramvy.e() == 86) {
        g = 1;
      }
    }
  }
  
  public final void b() {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.iv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */