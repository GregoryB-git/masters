package m4;

import android.util.SparseArray;
import c4.a;
import c4.e;
import c4.h;
import c4.i;
import c4.s;
import c4.t.b;
import f;
import v5.c0;
import v5.m;

public final class w
  implements h
{
  public final c0 a;
  public final SparseArray<a> b;
  public final v5.u c;
  public final v d;
  public boolean e;
  public boolean f;
  public boolean g;
  public long h;
  public u i;
  public c4.j j;
  public boolean k;
  
  public w()
  {
    a = localc0;
    c = new v5.u(4096);
    b = new SparseArray();
    d = new v();
  }
  
  public final void b(c4.j paramj)
  {
    j = paramj;
  }
  
  public final int d(i parami, s params)
  {
    x6.b.K(j);
    long l1 = parami.getLength();
    boolean bool = l1 < -1L;
    int n = 0;
    if (bool) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    long l2 = -9223372036854775807L;
    int m;
    long l3;
    if (i1 != 0)
    {
      localObject1 = d;
      if (!c)
      {
        if (!e)
        {
          l1 = parami.getLength();
          i1 = (int)Math.min(20000L, l1);
          l1 -= i1;
          if (parami.getPosition() != l1)
          {
            a = l1;
          }
          else
          {
            b.D(i1);
            parami.i();
            parami.m(b.a, 0, i1);
            parami = b;
            m = b;
            for (i1 = c - 4;; i1--)
            {
              l1 = l2;
              if (i1 < m) {
                break;
              }
              if (v.b(a, i1) == 442)
              {
                parami.G(i1 + 4);
                l1 = v.c(parami);
                if (l1 != -9223372036854775807L) {
                  break;
                }
              }
            }
            g = l1;
            e = true;
            i1 = n;
            break label546;
          }
        }
        else
        {
          if (g == -9223372036854775807L) {
            break label536;
          }
          if (d) {
            break label433;
          }
          i1 = (int)Math.min(20000L, parami.getLength());
          l3 = parami.getPosition();
          l1 = 0;
          if (l3 == l1) {
            break label306;
          }
          a = l1;
        }
        i1 = 1;
        break label546;
        label306:
        b.D(i1);
        parami.i();
        parami.m(b.a, 0, i1);
        parami = b;
        i1 = b;
        m = c;
        for (;;)
        {
          l1 = l2;
          if (i1 >= m - 3) {
            break;
          }
          if (v.b(a, i1) == 442)
          {
            parami.G(i1 + 4);
            l1 = v.c(parami);
            if (l1 != -9223372036854775807L) {
              break;
            }
          }
          i1++;
        }
        f = l1;
        d = true;
        i1 = n;
        break label546;
        label433:
        l2 = f;
        if (l2 != -9223372036854775807L)
        {
          l2 = a.b(l2);
          l2 = a.b(g) - l2;
          h = l2;
          if (l2 < 0L)
          {
            params = f.l("Invalid duration: ");
            params.append(h);
            params.append(". Using TIME_UNSET instead.");
            m.f("PsDurationReader", params.toString());
            h = -9223372036854775807L;
          }
        }
        label536:
        ((v)localObject1).a(parami);
        i1 = n;
        label546:
        return i1;
      }
    }
    if (!k)
    {
      k = true;
      localObject1 = d;
      l2 = h;
      if (l2 != -9223372036854775807L)
      {
        localObject1 = new u(a, l2, l1);
        i = ((u)localObject1);
        localObject2 = j;
        localObject1 = a;
      }
      else
      {
        localObject2 = j;
        localObject1 = new t.b(l2);
      }
      ((c4.j)localObject2).t((c4.t)localObject1);
    }
    Object localObject1 = i;
    if (localObject1 != null)
    {
      if (c != null) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if (i1 != 0) {
        return ((a)localObject1).a(parami, params);
      }
    }
    parami.i();
    if (m != 0) {
      l2 = l1 - parami.d();
    } else {
      l2 = -1L;
    }
    if ((l2 != -1L) && (l2 < 4L)) {
      return -1;
    }
    if (!parami.c(c.a, 0, 4, true)) {
      return -1;
    }
    c.G(0);
    int i1 = c.f();
    if (i1 == 441) {
      return -1;
    }
    if (i1 == 442)
    {
      parami.m(c.a, 0, 10);
      c.G(9);
      i1 = (c.v() & 0x7) + 14;
    }
    else
    {
      if (i1 != 443) {
        break label890;
      }
      parami.m(c.a, 0, 2);
      c.G(0);
      i1 = c.A() + 6;
    }
    parami.j(i1);
    return 0;
    label890:
    if ((i1 & 0xFF00) >> 8 != 1)
    {
      parami.j(1);
      return 0;
    }
    i1 &= 0xFF;
    localObject1 = (a)b.get(i1);
    Object localObject2 = localObject1;
    if (!e)
    {
      params = (s)localObject1;
      if (localObject1 == null)
      {
        localObject2 = null;
        if (i1 == 189)
        {
          params = new b(null);
        }
        else
        {
          if ((i1 & 0xE0) != 192) {
            break label1005;
          }
          params = new q(null);
        }
        f = true;
        for (;;)
        {
          break;
          label1005:
          if ((i1 & 0xF0) != 224) {
            break label1047;
          }
          params = new k(null);
          g = true;
        }
        h = parami.getPosition();
        localObject2 = params;
        label1047:
        params = (s)localObject1;
        if (localObject2 != null)
        {
          params = new d0.d(i1, 256);
          ((j)localObject2).e(j, params);
          params = new a((j)localObject2, a);
          b.put(i1, params);
        }
      }
      if ((f) && (g)) {
        l2 = h + 8192L;
      } else {
        l2 = 1048576L;
      }
      localObject2 = params;
      if (parami.getPosition() > l2)
      {
        e = true;
        j.m();
        localObject2 = params;
      }
    }
    parami.m(c.a, 0, 2);
    c.G(0);
    i1 = c.A() + 6;
    if (localObject2 == null)
    {
      parami.j(i1);
    }
    else
    {
      c.D(i1);
      parami.readFully(c.a, 0, i1);
      c.G(6);
      parami = c;
      parami.d(c.a, 0, 3);
      c.k(0);
      c.m(8);
      d = c.f();
      e = c.f();
      c.m(6);
      i1 = c.g(8);
      parami.d(c.a, 0, i1);
      c.k(0);
      g = 0L;
      if (d)
      {
        c.m(4);
        l2 = c.g(3);
        c.m(1);
        l3 = c.g(15) << 15;
        c.m(1);
        long l4 = c.g(15);
        c.m(1);
        if ((!f) && (e))
        {
          c.m(4);
          long l5 = c.g(3);
          c.m(1);
          l1 = c.g(15) << 15;
          c.m(1);
          long l6 = c.g(15);
          c.m(1);
          b.b(l6 | l5 << 30 | l1);
          f = true;
        }
        g = b.b(l2 << 30 | l3 | l4);
      }
      a.d(4, g);
      a.a(parami);
      a.c();
      parami = c;
      parami.F(a.length);
    }
    return 0;
  }
  
  public final void f(long paramLong1, long paramLong2)
  {
    synchronized (a)
    {
      paramLong1 = b;
      int m = 1;
      if (paramLong1 == -9223372036854775807L) {
        n = 1;
      } else {
        n = 0;
      }
      int i1 = n;
      if (n == 0)
      {
        paramLong1 = a.c();
        if ((paramLong1 != -9223372036854775807L) && (paramLong1 != 0L) && (paramLong1 != paramLong2)) {
          n = m;
        } else {
          n = 0;
        }
        i1 = n;
      }
      if (i1 != 0) {
        a.d(paramLong2);
      }
      Object localObject1 = i;
      if (localObject1 != null) {
        ((a)localObject1).c(paramLong2);
      }
      for (int n = 0; n < b.size(); n++)
      {
        localObject1 = (a)b.valueAt(n);
        f = false;
        a.b();
      }
      return;
    }
  }
  
  public final boolean i(i parami)
  {
    byte[] arrayOfByte = new byte[14];
    parami = (e)parami;
    boolean bool = false;
    parami.c(arrayOfByte, 0, 14, false);
    if (442 != ((arrayOfByte[0] & 0xFF) << 24 | (arrayOfByte[1] & 0xFF) << 16 | (arrayOfByte[2] & 0xFF) << 8 | arrayOfByte[3] & 0xFF)) {
      return false;
    }
    if ((arrayOfByte[4] & 0xC4) != 68) {
      return false;
    }
    if ((arrayOfByte[6] & 0x4) != 4) {
      return false;
    }
    if ((arrayOfByte[8] & 0x4) != 4) {
      return false;
    }
    if ((arrayOfByte[9] & 0x1) != 1) {
      return false;
    }
    if ((arrayOfByte[12] & 0x3) != 3) {
      return false;
    }
    parami.k(arrayOfByte[13] & 0x7, false);
    parami.c(arrayOfByte, 0, 3, false);
    if (1 == ((arrayOfByte[0] & 0xFF) << 16 | (arrayOfByte[1] & 0xFF) << 8 | arrayOfByte[2] & 0xFF)) {
      bool = true;
    }
    return bool;
  }
  
  public final void release() {}
  
  public static final class a
  {
    public final j a;
    public final c0 b;
    public final v5.t c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    
    public a(j paramj, c0 paramc0)
    {
      a = paramj;
      b = paramc0;
      c = new v5.t(new byte[64], 64);
    }
  }
}

/* Location:
 * Qualified Name:     m4.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */