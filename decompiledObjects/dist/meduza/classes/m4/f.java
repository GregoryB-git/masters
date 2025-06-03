package m4;

import c4.g;
import c4.v;
import java.util.Arrays;
import java.util.Collections;
import v3.i0;
import v3.i0.a;
import v5.e0;
import v5.m;
import v5.t;
import v5.u;
import x3.a;
import x3.a.a;

public final class f
  implements j
{
  public static final byte[] v = { 73, 68, 51 };
  public final boolean a;
  public final t b = new t(new byte[7], 7);
  public final u c = new u(Arrays.copyOf(v, 10));
  public final String d;
  public String e;
  public v f;
  public v g;
  public int h = 0;
  public int i = 0;
  public int j = 256;
  public boolean k;
  public boolean l;
  public int m = -1;
  public int n = -1;
  public int o;
  public boolean p;
  public long q = -9223372036854775807L;
  public int r;
  public long s = -9223372036854775807L;
  public v t;
  public long u;
  
  public f(String paramString, boolean paramBoolean)
  {
    a = paramBoolean;
    d = paramString;
  }
  
  public final void a(u paramu)
  {
    f.getClass();
    int i1 = e0.a;
    for (;;)
    {
      int i2 = c;
      int i3 = b;
      int i4 = i2 - i3;
      if (i4 <= 0) {
        break;
      }
      int i5 = h;
      i1 = -1;
      int i6 = 7;
      Object localObject1;
      Object localObject2;
      if (i5 != 0)
      {
        if (i5 != 1)
        {
          if (i5 != 2)
          {
            long l1;
            if (i5 != 3)
            {
              if (i5 == 4)
              {
                i1 = Math.min(i4, r - i);
                t.b(i1, paramu);
                i1 = i + i1;
                i = i1;
                i3 = r;
                if (i1 == i3)
                {
                  l1 = s;
                  if (l1 != -9223372036854775807L)
                  {
                    t.c(l1, 1, i3, 0, null);
                    s += u;
                  }
                  h = 0;
                  i = 0;
                  j = 256;
                }
              }
              else
              {
                throw new IllegalStateException();
              }
            }
            else
            {
              if (k) {
                i1 = i6;
              } else {
                i1 = 5;
              }
              if (f(i1, paramu, b.a))
              {
                b.k(0);
                if (!p)
                {
                  i3 = b.g(2) + 1;
                  i1 = i3;
                  if (i3 != 2)
                  {
                    localObject1 = new StringBuilder();
                    ((StringBuilder)localObject1).append("Detected audio object type: ");
                    ((StringBuilder)localObject1).append(i3);
                    ((StringBuilder)localObject1).append(", but assuming AAC LC.");
                    m.f("AdtsReader", ((StringBuilder)localObject1).toString());
                    i1 = 2;
                  }
                  b.m(5);
                  i3 = b.g(3);
                  byte[] arrayOfByte = a.a(i1, n, i3);
                  localObject1 = a.c(new t(arrayOfByte, 2), false);
                  localObject2 = new i0.a();
                  a = e;
                  k = "audio/mp4a-latm";
                  h = c;
                  x = b;
                  y = a;
                  m = Collections.singletonList(arrayOfByte);
                  c = d;
                  localObject1 = new i0((i0.a)localObject2);
                  q = (1024000000L / H);
                  f.d((i0)localObject1);
                  p = true;
                }
                else
                {
                  b.m(10);
                }
                b.m(4);
                i3 = b.g(13) - 2 - 5;
                i1 = i3;
                if (k) {
                  i1 = i3 - 2;
                }
                localObject1 = f;
                l1 = q;
                h = 4;
                i = 0;
                t = ((v)localObject1);
                u = l1;
                r = i1;
              }
            }
          }
          else if (f(10, paramu, c.a))
          {
            g.b(10, c);
            c.G(6);
            localObject1 = g;
            i1 = c.u();
            h = 4;
            i = 10;
            t = ((v)localObject1);
            u = 0L;
            r = (i1 + 10);
          }
        }
        else if (i4 != 0)
        {
          localObject1 = b;
          a[0] = ((byte)a[i3]);
          ((t)localObject1).k(2);
          i3 = b.g(4);
          i1 = n;
          if ((i1 != -1) && (i3 != i1))
          {
            l = false;
            h = 0;
            i = 0;
            j = 256;
          }
          else
          {
            if (!l)
            {
              l = true;
              m = o;
              n = i3;
            }
            h = 3;
            i = 0;
          }
        }
      }
      else
      {
        localObject1 = a;
        label1111:
        label1299:
        label1307:
        label1310:
        label1476:
        label1506:
        label1512:
        label1516:
        for (;;)
        {
          if (i3 >= i2) {
            break label1519;
          }
          i6 = i3 + 1;
          i5 = localObject1[i3] & 0xFF;
          if (j == 512)
          {
            if ((((byte)i5 & 0xFF | 0xFF00) & 0xFFF6) == 65520) {
              i3 = 1;
            } else {
              i3 = 0;
            }
            if (i3 != 0) {
              if (!l)
              {
                i4 = i6 - 2;
                paramu.G(i4 + 1);
                localObject2 = b.a;
                if (c - b < 1)
                {
                  i3 = 0;
                }
                else
                {
                  paramu.d((byte[])localObject2, 0, 1);
                  i3 = 1;
                }
                if (i3 != 0)
                {
                  int i7;
                  do
                  {
                    b.k(4);
                    i7 = b.g(1);
                    i3 = m;
                  } while ((i3 != i1) && (i7 != i3));
                  if (n != i1)
                  {
                    localObject2 = b.a;
                    if (c - b < 1)
                    {
                      i1 = 0;
                    }
                    else
                    {
                      paramu.d((byte[])localObject2, 0, 1);
                      i1 = 1;
                    }
                    if (i1 != 0)
                    {
                      b.k(2);
                      if (b.g(4) != n) {
                        break label1111;
                      }
                      paramu.G(i4 + 2);
                    }
                  }
                  else
                  {
                    localObject2 = b.a;
                    if (c - b < 4)
                    {
                      i1 = 0;
                    }
                    else
                    {
                      paramu.d((byte[])localObject2, 0, 4);
                      i1 = 1;
                    }
                    if (i1 == 0) {
                      break label1299;
                    }
                  }
                  do
                  {
                    b.k(14);
                    i3 = b.g(13);
                    if (i3 < 7)
                    {
                      i1 = -1;
                      break;
                    }
                    localObject2 = a;
                    i1 = c;
                    i3 = i4 + i3;
                  } while (i3 >= i1);
                  int i8 = localObject2[i3];
                  i4 = -1;
                  if (i8 == -1)
                  {
                    i3++;
                    if (i3 != i1)
                    {
                      i8 = localObject2[i3];
                      if (((i8 & 0xFF | 0xFF00) & 0xFFF6) == 65520) {
                        i3 = 1;
                      } else {
                        i3 = 0;
                      }
                      i1 = i4;
                      if (i3 == 0) {
                        break label1307;
                      }
                      i1 = i4;
                      if ((i8 & 0x8) >> 3 != i7) {
                        break label1307;
                      }
                    }
                  }
                  else
                  {
                    if (i8 != 73)
                    {
                      i1 = i4;
                      break label1307;
                    }
                    i7 = i3 + 1;
                    if (i7 != i1)
                    {
                      if (localObject2[i7] != 68)
                      {
                        i1 = i4;
                        break label1307;
                      }
                      i3 += 2;
                      if (i3 != i1)
                      {
                        i1 = i4;
                        if (localObject2[i3] != 51) {
                          break label1307;
                        }
                      }
                    }
                  }
                  i1 = -1;
                  i3 = 1;
                  break label1310;
                }
                i3 = 0;
                if (i3 == 0) {}
              }
              else
              {
                o = ((i5 & 0x8) >> 3);
                boolean bool;
                if ((i5 & 0x1) == 0) {
                  bool = true;
                } else {
                  bool = false;
                }
                k = bool;
                if (!l)
                {
                  h = 1;
                  i = 0;
                  break label1476;
                }
                h = 3;
                i = 0;
                break label1476;
              }
            }
          }
          i3 = j;
          i4 = i5 | i3;
          if (i4 != 329)
          {
            if (i4 != 511)
            {
              if (i4 != 836)
              {
                if (i4 != 1075)
                {
                  if (i3 != 256)
                  {
                    j = 256;
                    i3 = i6 - 1;
                    break label1516;
                  }
                  break label1512;
                }
                h = 2;
                i = 3;
                r = 0;
                c.G(0);
                paramu.G(i6);
                break;
              }
              i3 = 1024;
              break label1506;
            }
            i3 = 512;
            break label1506;
          }
          i3 = 768;
          j = i3;
          i3 = i6;
        }
        label1519:
        paramu.G(i3);
      }
    }
  }
  
  public final void b()
  {
    s = -9223372036854775807L;
    l = false;
    h = 0;
    i = 0;
    j = 256;
  }
  
  public final void c() {}
  
  public final void d(int paramInt, long paramLong)
  {
    if (paramLong != -9223372036854775807L) {
      s = paramLong;
    }
  }
  
  public final void e(c4.j paramj, d0.d paramd)
  {
    paramd.a();
    paramd.b();
    e = e;
    paramd.b();
    Object localObject = paramj.r(d, 1);
    f = ((v)localObject);
    t = ((v)localObject);
    if (a)
    {
      paramd.a();
      paramd.b();
      paramj = paramj.r(d, 5);
      g = paramj;
      localObject = new i0.a();
      paramd.b();
      a = e;
      k = "application/id3";
      paramj.d(new i0((i0.a)localObject));
    }
    else
    {
      g = new g();
    }
  }
  
  public final boolean f(int paramInt, u paramu, byte[] paramArrayOfByte)
  {
    int i1 = Math.min(c - b, paramInt - i);
    paramu.d(paramArrayOfByte, i, i1);
    i1 = i + i1;
    i = i1;
    boolean bool;
    if (i1 == paramInt) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     m4.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */