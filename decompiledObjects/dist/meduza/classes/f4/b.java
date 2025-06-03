package f4;

import c4.e;
import c4.h;
import c4.i;
import c4.j;
import c4.l;
import c4.l.a;
import c4.m;
import c4.n;
import c4.o;
import c4.q;
import c4.s;
import c4.t.b;
import c4.v;
import c4.y;
import c4.y.a;
import java.util.Arrays;
import p4.a.b;
import u4.g;
import u4.g.a;
import v3.a1;
import v5.e0;
import v5.u;

public final class b
  implements h
{
  public final byte[] a = new byte[42];
  public final u b = new u(new byte[32768], 0);
  public final boolean c = false;
  public final l.a d = new l.a();
  public j e;
  public v f;
  public int g = 0;
  public p4.a h;
  public o i;
  public int j;
  public int k;
  public a l;
  public int m;
  public long n;
  
  public final void b(j paramj)
  {
    e = paramj;
    f = paramj.r(0, 1);
    paramj.m();
  }
  
  public final int d(i parami, s params)
  {
    int i1 = g;
    Object localObject1 = null;
    int i2 = 1;
    int i3 = 1;
    int i4 = 0;
    if (i1 != 0)
    {
      if (i1 != 1)
      {
        if (i1 != 2)
        {
          if (i1 != 3)
          {
            l1 = 0L;
            long l2;
            if (i1 != 4)
            {
              if (i1 == 5)
              {
                f.getClass();
                i.getClass();
                localObject1 = l;
                if (localObject1 != null)
                {
                  if (c != null) {
                    i1 = 1;
                  } else {
                    i1 = 0;
                  }
                  if (i1 != 0)
                  {
                    i1 = ((c4.a)localObject1).a(parami, params);
                    break label873;
                  }
                }
                int i5;
                if (n == -1L)
                {
                  params = i;
                  parami.i();
                  parami.e(1);
                  localObject1 = new byte[1];
                  parami.m((byte[])localObject1, 0, 1);
                  if ((localObject1[0] & 0x1) == 1) {
                    i1 = 1;
                  } else {
                    i1 = 0;
                  }
                  parami.e(2);
                  if (i1 != 0) {
                    i2 = 7;
                  } else {
                    i2 = 6;
                  }
                  localObject1 = new u(i2);
                  localObject2 = a;
                  i5 = 0;
                  while (i5 < i2)
                  {
                    int i6 = parami.g((byte[])localObject2, 0 + i5, i2 - i5);
                    if (i6 == -1) {
                      break;
                    }
                    i5 += i6;
                  }
                  ((u)localObject1).F(i5);
                  parami.i();
                  try
                  {
                    l2 = ((u)localObject1).B();
                    if (i1 != 0) {
                      l1 = l2;
                    } else {
                      l1 = l2 * b;
                    }
                    i1 = i3;
                  }
                  catch (NumberFormatException parami)
                  {
                    i1 = 0;
                  }
                  if (i1 != 0)
                  {
                    n = l1;
                    i1 = i4;
                  }
                  else
                  {
                    throw a1.a(null, null);
                  }
                }
                else
                {
                  params = b;
                  i3 = c;
                  if (i3 < 32768)
                  {
                    i5 = parami.read(a, i3, 32768 - i3);
                    if (i5 == -1) {
                      i1 = i2;
                    } else {
                      i1 = 0;
                    }
                    if (i1 == 0)
                    {
                      b.F(i3 + i5);
                      i2 = i1;
                    }
                    else
                    {
                      parami = b;
                      i2 = i1;
                      if (c - b == 0)
                      {
                        l1 = n;
                        parami = i;
                        i1 = e0.a;
                        l1 = l1 * 1000000L / e;
                        f.c(l1, 1, m, 0, null);
                        i1 = -1;
                        break label873;
                      }
                    }
                  }
                  else
                  {
                    i2 = 0;
                  }
                  parami = b;
                  i5 = b;
                  i1 = m;
                  i3 = j;
                  if (i1 < i3) {
                    parami.H(Math.min(i3 - i1, c - i5));
                  }
                  parami = b;
                  i.getClass();
                  for (i1 = b; i1 <= c - 16; i1++)
                  {
                    parami.G(i1);
                    if (l.a(parami, i, k, d)) {
                      break label654;
                    }
                  }
                  if (i2 != 0)
                  {
                    for (;;)
                    {
                      i2 = c;
                      if (i1 > i2 - j) {
                        break;
                      }
                      parami.G(i1);
                      try
                      {
                        bool = l.a(parami, i, k, d);
                      }
                      catch (IndexOutOfBoundsException params)
                      {
                        bool = false;
                      }
                      if (b > c) {
                        bool = false;
                      }
                      if (bool)
                      {
                        label654:
                        parami.G(i1);
                        l1 = d.a;
                        break label696;
                      }
                      i1++;
                    }
                    parami.G(i2);
                  }
                  else
                  {
                    parami.G(i1);
                  }
                  l1 = -1L;
                  label696:
                  parami = b;
                  i1 = b - i5;
                  parami.G(i5);
                  f.b(i1, b);
                  i1 = m + i1;
                  m = i1;
                  if (l1 != -1L)
                  {
                    l2 = n;
                    parami = i;
                    i2 = e0.a;
                    l2 = l2 * 1000000L / e;
                    f.c(l2, 1, i1, 0, null);
                    m = 0;
                    n = l1;
                  }
                  parami = b;
                  i1 = c;
                  i2 = b;
                  i5 = i1 - i2;
                  i1 = i4;
                  if (i5 < 16)
                  {
                    parami = a;
                    System.arraycopy(parami, i2, parami, 0, i5);
                    b.G(0);
                    b.F(i5);
                    i1 = i4;
                  }
                }
                label873:
                return i1;
              }
              throw new IllegalStateException();
            }
            parami.i();
            params = new u(2);
            parami.m(a, 0, 2);
            i1 = params.A();
            parami.i();
            if (i1 >> 2 == 16382)
            {
              k = i1;
              params = e;
              i1 = e0.a;
              l1 = parami.getPosition();
              l2 = parami.getLength();
              i.getClass();
              parami = i;
              if (k != null)
              {
                parami = new n(parami, l1);
              }
              else if ((l2 != -1L) && (j > 0L))
              {
                parami = new a(parami, k, l1, l2);
                l = parami;
                parami = a;
              }
              else
              {
                parami = new t.b(parami.b());
              }
              params.t(parami);
              g = 5;
              return 0;
            }
            throw a1.a("First frame does not start with sync code.", null);
          }
          localObject1 = i;
          bool = false;
          while (!bool)
          {
            parami.i();
            params = new v5.t(new byte[4], 4);
            parami.m(a, 0, 4);
            bool = params.f();
            i2 = params.g(7);
            i1 = params.g(24) + 4;
            if (i2 == 0)
            {
              params = new byte[38];
              parami.readFully(params, 0, 38);
              params = new o(params, 4);
            }
            else
            {
              if (localObject1 == null) {
                break label1694;
              }
              if (i2 == 3)
              {
                params = new u(i1);
                parami.readFully(a, 0, i1);
                params = m.a(params);
                params = new o(a, b, c, d, e, g, h, j, params, l);
              }
              else
              {
                Object[] arrayOfObject;
                if (i2 == 4)
                {
                  params = new u(i1);
                  parami.readFully(a, 0, i1);
                  params.H(4);
                  localObject2 = y.a(Arrays.asList(ba));
                  params = l;
                  if (params == null) {
                    params = (s)localObject2;
                  }
                  for (;;)
                  {
                    break;
                    if (localObject2 != null)
                    {
                      localObject2 = a;
                      if (localObject2.length == 0) {}
                    }
                    else
                    {
                      l1 = b;
                      params = a;
                      i1 = e0.a;
                      arrayOfObject = Arrays.copyOf(params, params.length + localObject2.length);
                      System.arraycopy(localObject2, 0, arrayOfObject, params.length, localObject2.length);
                      params = new p4.a(l1, (a.b[])arrayOfObject);
                    }
                  }
                  params = new o(a, b, c, d, e, g, h, j, k, params);
                }
                else
                {
                  if (i2 != 6) {
                    break label1669;
                  }
                  params = new u(i1);
                  parami.readFully(a, 0, i1);
                  params.H(4);
                  localObject2 = new p4.a(o7.t.t(s4.a.a(params)));
                  params = l;
                  if (params == null) {
                    params = (s)localObject2;
                  }
                  for (;;)
                  {
                    break;
                    localObject2 = a;
                    if (localObject2.length != 0)
                    {
                      l1 = b;
                      params = a;
                      i1 = e0.a;
                      arrayOfObject = Arrays.copyOf(params, params.length + localObject2.length);
                      System.arraycopy(localObject2, 0, arrayOfObject, params.length, localObject2.length);
                      params = new p4.a(l1, (a.b[])arrayOfObject);
                    }
                  }
                  params = new o(a, b, c, d, e, g, h, j, k, params);
                }
              }
              break label1679;
              label1669:
              parami.j(i1);
              params = (s)localObject1;
            }
            label1679:
            i1 = e0.a;
            i = params;
            localObject1 = params;
            continue;
            label1694:
            throw new IllegalArgumentException();
          }
          i.getClass();
          j = Math.max(i.c, 6);
          parami = f;
          i1 = e0.a;
          parami.d(i.c(a, h));
          g = 4;
          return 0;
        }
        params = new u(4);
        parami.readFully(a, 0, 4);
        if (params.w() == 1716281667L)
        {
          g = 3;
          return 0;
        }
        throw a1.a("Failed to read FLAC stream marker.", null);
      }
      params = a;
      parami.m(params, 0, params.length);
      parami.i();
      g = 2;
      return 0;
    }
    boolean bool = c;
    parami.i();
    long l1 = parami.d();
    if ((bool ^ true)) {
      params = null;
    } else {
      params = g.c;
    }
    Object localObject2 = new q().a(parami, params);
    params = (s)localObject1;
    if (localObject2 != null) {
      if (a.length == 0) {
        params = (s)localObject1;
      } else {
        params = (s)localObject2;
      }
    }
    parami.j((int)(parami.d() - l1));
    h = params;
    g = 1;
    return 0;
  }
  
  public final void f(long paramLong1, long paramLong2)
  {
    long l1 = 0L;
    if (paramLong1 == 0L)
    {
      g = 0;
    }
    else
    {
      a locala = l;
      if (locala != null) {
        locala.c(paramLong2);
      }
    }
    if (paramLong2 == 0L) {
      paramLong1 = l1;
    } else {
      paramLong1 = -1L;
    }
    n = paramLong1;
    m = 0;
    b.D(0);
  }
  
  public final boolean i(i parami)
  {
    Object localObject = g.c;
    localObject = new q().a(parami, (g.a)localObject);
    if (localObject != null) {
      int i1 = a.length;
    }
    u localu = new u(4);
    localObject = a;
    parami = (e)parami;
    boolean bool = false;
    parami.c((byte[])localObject, 0, 4, false);
    if (localu.w() == 1716281667L) {
      bool = true;
    }
    return bool;
  }
  
  public final void release() {}
}

/* Location:
 * Qualified Name:     f4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */