package j4;

import c4.i;
import c4.p;
import c4.q;
import c4.s;
import c4.t;
import c4.v;
import java.io.EOFException;
import java.util.List;
import u4.g.a;
import u4.l;
import v3.a1;
import v3.i0;
import v3.i0.a;
import v5.e0;
import v5.m;
import v5.n;
import v5.u;
import x3.y;
import x3.y.a;

public final class d
  implements c4.h
{
  public static final e0.d u = new e0.d(14);
  public final int a;
  public final long b;
  public final u c;
  public final y.a d;
  public final p e;
  public final q f;
  public final c4.g g;
  public c4.j h;
  public v i;
  public v j;
  public int k;
  public p4.a l;
  public long m;
  public long n;
  public long o;
  public int p;
  public e q;
  public boolean r;
  public boolean s;
  public long t;
  
  public d()
  {
    this(0);
  }
  
  public d(int paramInt)
  {
    this(paramInt, -9223372036854775807L);
  }
  
  public d(int paramInt, long paramLong)
  {
    int i1 = paramInt;
    if ((paramInt & 0x2) != 0) {
      i1 = paramInt | 0x1;
    }
    a = i1;
    b = paramLong;
    c = new u(10);
    d = new y.a();
    e = new p();
    m = -9223372036854775807L;
    f = new q();
    c4.g localg = new c4.g();
    g = localg;
    j = localg;
  }
  
  public static long c(p4.a parama)
  {
    if (parama != null)
    {
      int i1 = a.length;
      for (int i2 = 0; i2 < i1; i2++)
      {
        Object localObject = a[i2];
        if ((localObject instanceof l))
        {
          localObject = (l)localObject;
          if (a.equals("TLEN")) {
            return e0.I(Long.parseLong((String)c.get(0)));
          }
        }
      }
    }
    return -9223372036854775807L;
  }
  
  public final a a(i parami, boolean paramBoolean)
  {
    parami.m(c.a, 0, 4);
    c.G(0);
    d.a(c.f());
    return new a(parami.getLength(), parami.getPosition(), d, paramBoolean);
  }
  
  public final void b(c4.j paramj)
  {
    h = paramj;
    paramj = paramj.r(0, 1);
    i = paramj;
    j = paramj;
    h.m();
  }
  
  public final int d(i parami, s params)
  {
    x6.b.K(i);
    int i1 = e0.a;
    if (k == 0) {
      try
      {
        g(parami, false);
      }
      catch (EOFException parami)
      {
        break label2032;
      }
    }
    int i3;
    label204:
    long l1;
    long l2;
    long l3;
    Object localObject2;
    label551:
    Object localObject3;
    if (q == null)
    {
      params = new u(d.c);
      parami.m(a, 0, d.c);
      localObject1 = d;
      int i2 = a;
      i3 = 21;
      i1 = e;
      if ((i2 & 0x1) != 0)
      {
        if (i1 != 1) {
          i3 = 36;
        }
      }
      else if (i1 == 1) {
        i3 = 13;
      }
      if (c >= i3 + 4)
      {
        params.G(i3);
        i2 = params.f();
        i1 = i2;
        if (i2 == 1483304551) {
          break label204;
        }
        if (i2 == 1231971951)
        {
          i1 = i2;
          break label204;
        }
      }
      if (c >= 40)
      {
        params.G(36);
        if (params.f() == 1447187017)
        {
          i1 = 1447187017;
          break label204;
        }
      }
      i1 = 0;
      long l4;
      int i4;
      int i5;
      long l5;
      long[] arrayOfLong;
      if ((i1 != 1483304551) && (i1 != 1231971951))
      {
        if (i1 == 1447187017)
        {
          l1 = parami.getLength();
          l2 = parami.getPosition();
          localObject1 = d;
          params.H(10);
          i1 = params.f();
          if (i1 > 0)
          {
            i3 = d;
            l3 = i1;
            if (i3 >= 32000) {
              i1 = 1152;
            } else {
              i1 = 576;
            }
            l4 = e0.O(l3, i1 * 1000000L, i3);
            i3 = params.A();
            i4 = params.A();
            i5 = params.A();
            params.H(2);
            l5 = c;
            localObject1 = new long[i3];
            localObject2 = new long[i3];
            l3 = l2;
          }
          for (i2 = 0; i2 < i3; i2++)
          {
            localObject1[i2] = (i2 * l4 / i3);
            localObject2[i2] = Math.max(l3, l5 + l2);
            if (i5 != 1)
            {
              if (i5 != 2)
              {
                if (i5 != 3)
                {
                  if (i5 != 4)
                  {
                    params = null;
                    break label551;
                  }
                  i1 = params.y();
                }
                else
                {
                  i1 = params.x();
                }
              }
              else {
                i1 = params.A();
              }
            }
            else {
              i1 = params.v();
            }
            l3 += i1 * i4;
          }
          if ((l1 != -1L) && (l1 != l3))
          {
            params = new StringBuilder();
            params.append("VBRI data size mismatch: ");
            params.append(l1);
            params.append(", ");
            params.append(l3);
            m.f("VbriSeeker", params.toString());
          }
          params = new f((long[])localObject1, (long[])localObject2, l4, l3);
          parami.j(d.c);
        }
        else
        {
          parami.i();
          params = null;
        }
      }
      else
      {
        localObject3 = this;
        localObject2 = parami;
        l4 = parami.getLength();
        l3 = parami.getPosition();
        localObject1 = d;
        i2 = g;
        i4 = d;
        int i6 = params.f();
        if ((i6 & 0x1) == 1)
        {
          i5 = params.y();
          if (i5 != 0)
          {
            l5 = e0.O(i5, i2 * 1000000L, i4);
            if ((i6 & 0x6) != 6)
            {
              params = new g(l3, c, l5, -1L, null);
            }
            else
            {
              l1 = params.w();
              arrayOfLong = new long[100];
              for (i2 = 0; i2 < 100; i2++) {
                arrayOfLong[i2] = params.v();
              }
              if (l4 != -1L)
              {
                l2 = l3 + l1;
                if (l4 != l2)
                {
                  params = new StringBuilder();
                  params.append("XING data size mismatch: ");
                  params.append(l4);
                  params.append(", ");
                  params.append(l2);
                  m.f("XingSeeker", params.toString());
                }
              }
              params = new g(l3, c, l5, l1, arrayOfLong);
            }
            localObject1 = params;
            break label840;
          }
        }
        localObject1 = null;
        label840:
        if (localObject1 != null)
        {
          params = e;
          if ((a != -1) && (b != -1)) {
            i2 = 1;
          } else {
            i2 = 0;
          }
          if (i2 == 0)
          {
            parami.i();
            ((i)localObject2).e(i3 + 141);
            ((i)localObject2).m(c.a, 0, 3);
            c.G(0);
            params = e;
            i2 = c.x();
            i3 = i2 >> 12;
            i2 &= 0xFFF;
            if ((i3 <= 0) && (i2 <= 0))
            {
              params.getClass();
            }
            else
            {
              a = i3;
              b = i2;
            }
          }
        }
        ((i)localObject2).j(d.c);
        params = (s)localObject1;
        if (localObject1 != null)
        {
          params = (s)localObject1;
          if (!((g)localObject1).e())
          {
            params = (s)localObject1;
            if (i1 == 1231971951) {
              params = ((d)localObject3).a((i)localObject2, false);
            }
          }
        }
      }
      localObject2 = this;
      localObject1 = l;
      l2 = parami.getPosition();
      if (localObject1 != null)
      {
        i3 = a.length;
        for (i1 = 0; i1 < i3; i1++)
        {
          localObject3 = a[i1];
          if ((localObject3 instanceof u4.j))
          {
            localObject3 = (u4.j)localObject3;
            l1 = c((p4.a)localObject1);
            i3 = e.length;
            i1 = i3 + 1;
            localObject1 = new long[i1];
            arrayOfLong = new long[i1];
            localObject1[0] = l2;
            arrayOfLong[0] = 0L;
            i1 = 1;
            l3 = 0L;
            while (i1 <= i3)
            {
              i4 = c;
              int[] arrayOfInt = e;
              i2 = i1 - 1;
              l2 += i4 + arrayOfInt[i2];
              l3 += d + f[i2];
              localObject1[i1] = l2;
              arrayOfLong[i1] = l3;
              i1++;
            }
            localObject1 = new c((long[])localObject1, arrayOfLong, l1);
            break label1255;
          }
        }
      }
      localObject1 = null;
      label1255:
      if (r)
      {
        localObject1 = new e.a();
      }
      else
      {
        if ((a & 0x4) != 0)
        {
          if (localObject1 != null)
          {
            l3 = c;
          }
          else
          {
            if (params != null)
            {
              l2 = params.h();
              l3 = params.c();
              l1 = l2;
              l2 = l3;
              break label1350;
            }
            l3 = c(l);
          }
          l2 = -1L;
          l1 = l3;
          label1350:
          params = new b(l1, parami.getPosition(), l2);
        }
        else if (localObject1 != null)
        {
          params = (s)localObject1;
        }
        else if (params == null)
        {
          params = null;
        }
        if (params != null)
        {
          localObject1 = params;
          if (!params.e())
          {
            localObject1 = params;
            if ((a & 0x1) == 0) {}
          }
        }
        else
        {
          boolean bool;
          if ((a & 0x2) != 0) {
            bool = true;
          } else {
            bool = false;
          }
          localObject1 = ((d)localObject2).a(parami, bool);
        }
      }
      q = ((e)localObject1);
      h.t((t)localObject1);
      localObject3 = j;
      localObject1 = new i0.a();
      params = d;
      k = b;
      l = 4096;
      x = e;
      y = d;
      params = e;
      A = a;
      B = b;
      if ((a & 0x8) != 0) {
        params = null;
      } else {
        params = l;
      }
      i = params;
      ((v)localObject3).d(new i0((i0.a)localObject1));
      o = parami.getPosition();
    }
    else
    {
      params = this;
      if (o != 0L)
      {
        l3 = parami.getPosition();
        l2 = o;
        if (l3 < l2) {
          parami.j((int)(l2 - l3));
        }
      }
    }
    Object localObject1 = parami;
    params = this;
    if (p == 0)
    {
      parami.i();
      if (e(parami)) {
        break label2032;
      }
      c.G(0);
      i3 = c.f();
      l3 = k;
      if ((0xFFFE0C00 & i3) == (l3 & 0xFFFFFFFFFFFE0C00)) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if ((i1 != 0) && (y.a(i3) != -1))
      {
        d.a(i3);
        if (m == -9223372036854775807L)
        {
          m = q.a(parami.getPosition());
          if (b != -9223372036854775807L)
          {
            l2 = q.a(0L);
            l3 = m;
            m = (b - l2 + l3);
          }
        }
        localObject2 = d;
        p = c;
        localObject3 = q;
        if ((localObject3 instanceof b))
        {
          localObject3 = (b)localObject3;
          l3 = n;
          l2 = g;
          l1 = m;
          l3 = (l3 + l2) * 1000000L / d + l1;
          l1 = parami.getPosition();
          l2 = d.c;
          if (!((b)localObject3).b(l3))
          {
            b.a(l3);
            c.a(l1 + l2);
          }
          if ((s) && (((b)localObject3).b(t)))
          {
            s = false;
            j = i;
          }
        }
      }
      else
      {
        ((i)localObject1).j(1);
        k = 0;
        break label2053;
      }
    }
    i1 = j.e((t5.h)localObject1, p, true);
    if (i1 == -1)
    {
      label2032:
      i1 = -1;
    }
    else
    {
      i1 = p - i1;
      p = i1;
      if (i1 > 0)
      {
        label2053:
        i1 = 0;
      }
      else
      {
        parami = j;
        l3 = n;
        l2 = m;
        localObject1 = d;
        parami.c(l2 + l3 * 1000000L / d, 1, c, 0, null);
        n += d.g;
        p = 0;
        i1 = 0;
      }
    }
    parami = this;
    if (i1 == -1)
    {
      params = q;
      if ((params instanceof b))
      {
        l3 = n;
        l2 = m;
        l3 = l3 * 1000000L / d.d + l2;
        if (params.h() != l3)
        {
          params = q;
          d = l3;
          h.t(params);
        }
      }
    }
    return i1;
  }
  
  public final boolean e(i parami)
  {
    e locale = q;
    if (locale != null)
    {
      long l1 = locale.c();
      if ((l1 != -1L) && (parami.d() > l1 - 4L)) {
        return true;
      }
    }
    try
    {
      boolean bool = parami.c(c.a, 0, 4, true);
      return bool ^ true;
    }
    catch (EOFException parami) {}
    return true;
  }
  
  public final void f(long paramLong1, long paramLong2)
  {
    k = 0;
    m = -9223372036854775807L;
    n = 0L;
    p = 0;
    t = paramLong2;
    e locale = q;
    if (((locale instanceof b)) && (!((b)locale).b(paramLong2)))
    {
      s = true;
      j = g;
    }
  }
  
  public final boolean g(i parami, boolean paramBoolean)
  {
    int i1;
    if (paramBoolean) {
      i1 = 32768;
    } else {
      i1 = 131072;
    }
    parami.i();
    int i3;
    if (parami.getPosition() == 0L)
    {
      if ((a & 0x8) == 0) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      if (i2 != 0) {
        localObject = null;
      } else {
        localObject = u;
      }
      Object localObject = f.a(parami, (g.a)localObject);
      l = ((p4.a)localObject);
      if (localObject != null) {
        e.b((p4.a)localObject);
      }
      i2 = (int)parami.d();
      i3 = i2;
      if (!paramBoolean)
      {
        parami.j(i2);
        i3 = i2;
      }
    }
    else
    {
      i3 = 0;
    }
    int i2 = 0;
    int i4 = i2;
    int i5 = i4;
    for (;;)
    {
      int i7;
      int i8;
      if (e(parami))
      {
        if (i4 <= 0) {
          throw new EOFException();
        }
      }
      else
      {
        c.G(0);
        int i6 = c.f();
        if (i2 != 0)
        {
          long l1 = i2;
          if ((0xFFFE0C00 & i6) == (l1 & 0xFFFFFFFFFFFE0C00)) {
            i7 = 1;
          } else {
            i7 = 0;
          }
          if (i7 == 0) {}
        }
        else
        {
          i8 = y.a(i6);
          if (i8 != -1) {
            break label311;
          }
        }
        i2 = i5 + 1;
        if (i5 == i1)
        {
          if (paramBoolean) {
            return false;
          }
          throw a1.a("Searched too many bytes.", null);
        }
        if (paramBoolean)
        {
          parami.i();
          parami.e(i3 + i2);
        }
        else
        {
          parami.j(1);
        }
        i4 = 0;
        i5 = i2;
        i2 = i4;
        continue;
        label311:
        i7 = i4 + 1;
        if (i7 == 1)
        {
          d.a(i6);
          i4 = i6;
          break label382;
        }
        i4 = i2;
        if (i7 != 4) {
          break label382;
        }
      }
      if (paramBoolean) {
        parami.j(i3 + i5);
      } else {
        parami.i();
      }
      k = i2;
      return true;
      label382:
      parami.e(i8 - 4);
      i2 = i4;
      i4 = i7;
    }
  }
  
  public final boolean i(i parami)
  {
    return g(parami, true);
  }
  
  public final void release() {}
}

/* Location:
 * Qualified Name:     j4.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */