package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public final class hs
  implements fw, ge
{
  private final int a = 0;
  private final vy b = new vy(vu.a);
  private final vy c = new vy(4);
  private final vy d = new vy();
  private final vy e = new vy(16);
  private final ArrayDeque<hd> f = new ArrayDeque();
  private int g;
  private int h;
  private long i;
  private int j;
  private vy k;
  private int l = -1;
  private int m;
  private int n;
  private boolean o;
  private fy p;
  private hv[] q;
  private long[][] r;
  private int s;
  private long t;
  private boolean u;
  
  public hs()
  {
    this(0);
  }
  
  private hs(int paramInt) {}
  
  private static int a(ia paramia, long paramLong)
  {
    int i1 = paramia.a(paramLong);
    int i2 = i1;
    if (i1 == -1) {
      i2 = paramia.b(paramLong);
    }
    return i2;
  }
  
  private static long a(ia paramia, long paramLong1, long paramLong2)
  {
    int i1 = a(paramia, paramLong1);
    if (i1 == -1) {
      return paramLong2;
    }
    return Math.min(c[i1], paramLong2);
  }
  
  private final void b(long paramLong)
    throws ce
  {
    while ((!f.isEmpty()) && (f.peek()).b == paramLong))
    {
      Object localObject1 = (hd)f.pop();
      if (a == 1836019574)
      {
        Object localObject2 = new ArrayList();
        Object localObject3 = new ga();
        Object localObject4 = ((hd)localObject1).c(1969517665);
        Object localObject5 = null;
        if (localObject4 != null)
        {
          localObject4 = hf.a((hc)localObject4, u);
          localObject6 = localObject4;
          if (localObject4 != null)
          {
            ((ga)localObject3).a((kd)localObject4);
            localObject6 = localObject4;
          }
        }
        else
        {
          localObject6 = null;
        }
        localObject4 = ((hd)localObject1).d(1835365473);
        if (localObject4 != null) {
          localObject5 = hf.a((hd)localObject4);
        }
        boolean bool;
        if ((a & 0x1) != 0) {
          bool = true;
        } else {
          bool = false;
        }
        localObject4 = new ArrayList();
        hz localhz;
        for (int i1 = 0; i1 < d.size(); i1++)
        {
          localObject7 = (hd)d.get(i1);
          if (a == 1953653099)
          {
            localhz = hf.a((hd)localObject7, ((hd)localObject1).c(1836476516), -9223372036854775807L, null, bool, u);
            if (localhz != null)
            {
              localObject7 = hf.a(localhz, ((hd)localObject7).d(1835297121).d(1835626086).d(1937007212), (ga)localObject3);
              if (b != 0) {
                ((ArrayList)localObject4).add(localObject7);
              }
            }
          }
        }
        i1 = ((ArrayList)localObject4).size();
        long l1 = -9223372036854775807L;
        int i2 = 0;
        int i4;
        for (int i3 = -1; i2 < i1; i3 = i4)
        {
          ia localia = (ia)((ArrayList)localObject4).get(i2);
          localhz = a;
          l2 = e;
          if (l2 == -9223372036854775807L) {
            l2 = h;
          }
          l1 = Math.max(l1, l2);
          hv localhv = new hv(localhz, localia, p.a(i2, b));
          i4 = e;
          localObject7 = f.a(i4 + 30);
          localObject1 = localObject7;
          if (b == 2)
          {
            localObject1 = localObject7;
            if (l2 > 0L)
            {
              i4 = b;
              localObject1 = localObject7;
              if (i4 > 1) {
                localObject1 = ((bw)localObject7).a(i4 / ((float)l2 / 1000000.0F));
              }
            }
          }
          localObject1 = ht.a(b, (bw)localObject1, (kd)localObject6, (kd)localObject5, (ga)localObject3);
          c.a((bw)localObject1);
          if (b == 2)
          {
            i4 = i3;
            if (i3 == -1) {
              i4 = ((ArrayList)localObject2).size();
            }
          }
          else
          {
            i4 = i3;
          }
          ((ArrayList)localObject2).add(localhv);
          i2++;
        }
        long l2 = 0L;
        s = i3;
        t = l1;
        localObject3 = (hv[])((ArrayList)localObject2).toArray(new hv[0]);
        q = ((hv[])localObject3);
        localObject2 = new long[localObject3.length][];
        localObject5 = new int[localObject3.length];
        Object localObject6 = new long[localObject3.length];
        Object localObject7 = new boolean[localObject3.length];
        for (i1 = 0; i1 < localObject3.length; i1++)
        {
          localObject2[i1] = new long[b.b];
          localObject6[i1] = b.f[0];
        }
        i2 = 0;
        l1 = l2;
        while (i2 < localObject3.length)
        {
          long l3 = Long.MAX_VALUE;
          i3 = -1;
          i1 = 0;
          while (i1 < localObject3.length)
          {
            l2 = l3;
            i4 = i3;
            if (localObject7[i1] == 0)
            {
              long l4 = localObject6[i1];
              l2 = l3;
              i4 = i3;
              if (l4 <= l3)
              {
                i4 = i1;
                l2 = l4;
              }
            }
            i1++;
            l3 = l2;
            i3 = i4;
          }
          i1 = localObject5[i3];
          localObject1 = localObject2[i3];
          localObject1[i1] = l1;
          localObject4 = b;
          l1 += d[i1];
          i1++;
          localObject5[i3] = i1;
          if (i1 < localObject1.length)
          {
            localObject6[i3] = f[i1];
          }
          else
          {
            localObject7[i3] = 1;
            i2++;
          }
        }
        r = ((long[][])localObject2);
        p.a();
        p.a(this);
        f.clear();
        g = 2;
      }
      else if (!f.isEmpty())
      {
        ((hd)f.peek()).a((hd)localObject1);
      }
    }
    if (g != 2) {
      d();
    }
  }
  
  private final void d()
  {
    g = 0;
    j = 0;
  }
  
  public final int a(fz paramfz, gf paramgf)
    throws IOException, InterruptedException
  {
    int i1;
    label394:
    label1063:
    label1134:
    label1147:
    do
    {
      int i3;
      long l3;
      long l4;
      Object localObject;
      int i6;
      boolean bool;
      do
      {
        i1 = g;
        if (i1 == 0) {
          break;
        }
        if (i1 != 1)
        {
          if (i1 == 2)
          {
            long l1 = paramfz.c();
            int i2;
            int i4;
            if (l == -1)
            {
              i2 = -1;
              i3 = i2;
              i4 = 1;
              int i5 = i4;
              long l2 = Long.MAX_VALUE;
              l3 = l2;
              l4 = l3;
              i1 = 0;
              for (;;)
              {
                localObject = q;
                if (i1 >= localObject.length) {
                  break;
                }
                localObject = localObject[i1];
                i6 = d;
                localObject = b;
                int i7 = i4;
                long l5 = l2;
                int i8 = i5;
                long l6 = l3;
                int i9 = i2;
                int i10 = i3;
                long l7 = l4;
                if (i6 != b)
                {
                  long l8 = c[i6];
                  long l9 = r[i1][i6];
                  l7 = l8 - l1;
                  if ((l7 >= 0L) && (l7 < 262144L)) {
                    i6 = 0;
                  } else {
                    i6 = 1;
                  }
                  int i11;
                  long l10;
                  int i12;
                  if ((i6 != 0) || (i4 == 0))
                  {
                    i11 = i4;
                    l10 = l3;
                    i12 = i3;
                    l8 = l4;
                    if (i6 == i4)
                    {
                      i11 = i4;
                      l10 = l3;
                      i12 = i3;
                      l8 = l4;
                      if (l7 >= l4) {}
                    }
                  }
                  else
                  {
                    i12 = i1;
                    i11 = i6;
                    l8 = l7;
                    l10 = l9;
                  }
                  i7 = i11;
                  l5 = l2;
                  i8 = i5;
                  l6 = l10;
                  i9 = i2;
                  i10 = i12;
                  l7 = l8;
                  if (l9 < l2)
                  {
                    i9 = i1;
                    l7 = l8;
                    i10 = i12;
                    l6 = l10;
                    i8 = i6;
                    l5 = l9;
                    i7 = i11;
                  }
                }
                i1++;
                i4 = i7;
                l2 = l5;
                i5 = i8;
                l3 = l6;
                i2 = i9;
                i3 = i10;
                l4 = l7;
              }
              if ((l2 != Long.MAX_VALUE) && (i5 != 0) && (l3 >= l2 + 10485760L)) {
                break label394;
              }
              i2 = i3;
              l = i2;
              if (i2 == -1) {
                return -1;
              }
              o = "audio/ac4".equals(a.f.i);
            }
            hv localhv = q[l];
            localObject = c;
            i6 = d;
            ia localia = b;
            l4 = c[i6];
            i3 = d[i6];
            l3 = l4 - l1 + m;
            if ((l3 >= 0L) && (l3 < 262144L))
            {
              l4 = l3;
              i1 = i3;
              if (a.g == 1)
              {
                l4 = l3 + 8L;
                i1 = i3 - 8;
              }
              paramfz.b((int)l4);
              i2 = a.j;
              if (i2 != 0)
              {
                paramgf = c.a;
                paramgf[0] = ((byte)0);
                paramgf[1] = ((byte)0);
                paramgf[2] = ((byte)0);
                i4 = 4 - i2;
                for (;;)
                {
                  i3 = i1;
                  if (m >= i1) {
                    break;
                  }
                  i3 = n;
                  if (i3 == 0)
                  {
                    paramfz.b(paramgf, i4, i2);
                    c.c(0);
                    i3 = c.l();
                    if (i3 >= 0)
                    {
                      n = i3;
                      b.c(0);
                      ((gi)localObject).a(b, 4);
                      m += 4;
                      i1 += i4;
                    }
                    else
                    {
                      throw new ce("Invalid NAL length");
                    }
                  }
                  else
                  {
                    i3 = ((gi)localObject).a(paramfz, i3, false);
                    m += i3;
                    n -= i3;
                  }
                }
              }
              i3 = i1;
              if (o)
              {
                de.a(i1, d);
                i3 = d.c();
                ((gi)localObject).a(d, i3);
                i1 += i3;
                m += i3;
                o = false;
              }
              for (;;)
              {
                i1 = i3;
                i2 = m;
                i3 = i1;
                if (i2 >= i1) {
                  break;
                }
                i3 = ((gi)localObject).a(paramfz, i1 - i2, false);
                m += i3;
                n -= i3;
                i3 = i1;
              }
              paramfz = b;
              ((gi)localObject).a(f[i6], g[i6], i3, 0, null);
              d += 1;
              l = -1;
              m = 0;
              n = 0;
              return 0;
            }
            a = l4;
            return 1;
          }
          throw new IllegalStateException();
        }
        l3 = i - j;
        l4 = paramfz.c();
        localObject = k;
        if (localObject != null)
        {
          paramfz.b(a, j, (int)l3);
          if (h == 1718909296)
          {
            localObject = k;
            ((vy)localObject).c(8);
            if (((vy)localObject).l() == 1903435808) {}
            for (;;)
            {
              bool = true;
              break label1063;
              ((vy)localObject).d(4);
              do
              {
                if (((vy)localObject).b() <= 0) {
                  break;
                }
              } while (((vy)localObject).l() != 1903435808);
            }
            bool = false;
            u = bool;
          }
          else if (!f.isEmpty())
          {
            ((hd)f.peek()).a(new hc(h, k));
          }
        }
        else
        {
          if (l3 >= 262144L) {
            break label1134;
          }
          paramfz.b((int)l3);
        }
        i1 = 0;
        break label1147;
        a = (paramfz.c() + l3);
        i1 = 1;
        b(l4 + l3);
        if ((i1 != 0) && (g != 2)) {
          i1 = 1;
        } else {
          i1 = 0;
        }
      } while (i1 == 0);
      return 1;
      if (j == 0)
      {
        if (!paramfz.a(e.a, 0, 8, true))
        {
          i1 = 0;
        }
        else
        {
          j = 8;
          e.c(0);
          i = e.j();
          h = e.l();
        }
      }
      else
      {
        l4 = i;
        if (l4 == 1L)
        {
          paramfz.b(e.a, 8, 8);
          j += 8;
          i = e.q();
        }
        else if (l4 == 0L)
        {
          l3 = paramfz.d();
          l4 = l3;
          if (l3 == -1L)
          {
            l4 = l3;
            if (!f.isEmpty()) {
              l4 = f.peek()).b;
            }
          }
          if (l4 != -1L) {
            i = (l4 - paramfz.c() + j);
          }
        }
        l4 = i;
        i3 = j;
        if (l4 < i3) {
          break;
        }
        i6 = h;
        if ((i6 != 1836019574) && (i6 != 1953653099) && (i6 != 1835297121) && (i6 != 1835626086) && (i6 != 1937007212) && (i6 != 1701082227) && (i6 != 1835365473)) {
          i1 = 0;
        } else {
          i1 = 1;
        }
        if (i1 != 0)
        {
          l4 = paramfz.c() + i - j;
          f.push(new hd(h, l4));
          if (i == j) {
            b(l4);
          }
          for (;;)
          {
            break;
            if (h == 1835365473)
            {
              d.a(8);
              paramfz.c(d.a, 0, 8);
              d.d(4);
              if (d.l() == 1751411826) {
                paramfz.a();
              } else {
                paramfz.b(4);
              }
            }
            d();
          }
        }
        if ((i6 != 1835296868) && (i6 != 1836476516) && (i6 != 1751411826) && (i6 != 1937011556) && (i6 != 1937011827) && (i6 != 1937011571) && (i6 != 1668576371) && (i6 != 1701606260) && (i6 != 1937011555) && (i6 != 1937011578) && (i6 != 1937013298) && (i6 != 1937007471) && (i6 != 1668232756) && (i6 != 1953196132) && (i6 != 1718909296) && (i6 != 1969517665) && (i6 != 1801812339) && (i6 != 1768715124)) {
          i1 = 0;
        } else {
          i1 = 1;
        }
        if (i1 != 0)
        {
          if (i3 == 8) {
            bool = true;
          } else {
            bool = false;
          }
          rp.c(bool);
          if (i <= 2147483647L) {
            bool = true;
          } else {
            bool = false;
          }
          rp.c(bool);
          localObject = new vy((int)i);
          k = ((vy)localObject);
          System.arraycopy(e.a, 0, a, 0, 8);
          g = 1;
        }
        else
        {
          k = null;
          g = 1;
        }
        i1 = 1;
      }
    } while (i1 != 0);
    return -1;
    throw new ce("Atom size less than header length (unsupported).");
  }
  
  public final gh a(long paramLong)
  {
    Object localObject = q;
    if (localObject.length == 0) {
      return new gh(gj.a);
    }
    int i1 = s;
    long l1;
    long l2;
    long l3;
    label150:
    long l4;
    if (i1 != -1)
    {
      localObject = b;
      int i2 = a((ia)localObject, paramLong);
      if (i2 == -1) {
        return new gh(gj.a);
      }
      l1 = f[i2];
      l2 = c[i2];
      if ((l1 < paramLong) && (i2 < b - 1))
      {
        i1 = ((ia)localObject).b(paramLong);
        if ((i1 != -1) && (i1 != i2))
        {
          paramLong = f[i1];
          l3 = c[i1];
          break label150;
        }
      }
      l3 = -1L;
      paramLong = -9223372036854775807L;
      l4 = paramLong;
      paramLong = l3;
      l3 = l2;
    }
    else
    {
      l3 = Long.MAX_VALUE;
      l2 = -1L;
      l4 = -9223372036854775807L;
      l1 = paramLong;
      paramLong = l2;
    }
    i1 = 0;
    for (;;)
    {
      localObject = q;
      if (i1 >= localObject.length) {
        break;
      }
      long l5 = paramLong;
      l2 = l3;
      if (i1 != s)
      {
        localObject = b;
        l2 = a((ia)localObject, l1, l3);
        l3 = paramLong;
        if (l4 != -9223372036854775807L) {
          l3 = a((ia)localObject, l4, paramLong);
        }
        l5 = l3;
      }
      i1++;
      paramLong = l5;
      l3 = l2;
    }
    localObject = new gj(l1, l3);
    if (l4 == -9223372036854775807L) {
      return new gh((gj)localObject);
    }
    return new gh((gj)localObject, new gj(l4, paramLong));
  }
  
  public final void a(long paramLong1, long paramLong2)
  {
    f.clear();
    int i1 = 0;
    j = 0;
    l = -1;
    m = 0;
    n = 0;
    o = false;
    if (paramLong1 == 0L)
    {
      d();
      return;
    }
    hv[] arrayOfhv = q;
    if (arrayOfhv != null)
    {
      int i2 = arrayOfhv.length;
      while (i1 < i2)
      {
        hv localhv = arrayOfhv[i1];
        ia localia = b;
        int i3 = localia.a(paramLong2);
        int i4 = i3;
        if (i3 == -1) {
          i4 = localia.b(paramLong2);
        }
        d = i4;
        i1++;
      }
    }
  }
  
  public final void a(fy paramfy)
  {
    p = paramfy;
  }
  
  public final boolean a()
  {
    return true;
  }
  
  public final boolean a(fz paramfz)
    throws IOException, InterruptedException
  {
    return hw.b(paramfz);
  }
  
  public final long b()
  {
    return t;
  }
  
  public final void c() {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.hs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */