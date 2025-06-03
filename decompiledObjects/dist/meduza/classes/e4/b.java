package e4;

import c4.i;
import c4.j;
import c4.s;
import c4.t.a;
import c4.t.b;
import c4.v;
import java.util.ArrayList;
import java.util.Arrays;
import p2.m0;
import v3.a1;
import v3.i0;
import v3.i0.a;
import v5.e0;
import v5.m;
import v5.p;

public final class b
  implements c4.h
{
  public final v5.u a = new v5.u(12);
  public final b b = new b();
  public int c;
  public j d = new m0();
  public c e;
  public long f = -9223372036854775807L;
  public e[] g = new e[0];
  public long h;
  public e i;
  public int j = -1;
  public long k = -1L;
  public long l = -1L;
  public int m;
  public boolean n;
  
  public final e a(int paramInt)
  {
    for (e locale : g)
    {
      int i3;
      if ((b != paramInt) && (c != paramInt)) {
        i3 = 0;
      } else {
        i3 = 1;
      }
      if (i3 != 0) {
        return locale;
      }
    }
    return null;
  }
  
  public final void b(j paramj)
  {
    c = 0;
    d = paramj;
    h = -1L;
  }
  
  public final int d(i parami, s params)
  {
    long l1 = h;
    int i1 = 0;
    long l2;
    if (l1 != -1L)
    {
      l2 = parami.getPosition();
      l1 = h;
      if ((l1 >= l2) && (l1 <= 262144L + l2))
      {
        parami.j((int)(l1 - l2));
      }
      else
      {
        a = l1;
        i2 = 1;
        break label78;
      }
    }
    int i2 = 0;
    label78:
    h = -1L;
    if (i2 != 0) {
      return 1;
    }
    int i3 = c;
    i2 = 12;
    label530:
    label551:
    Object localObject1;
    switch (i3)
    {
    default: 
      throw new AssertionError();
    case 6: 
      if (parami.getPosition() >= l)
      {
        i3 = -1;
      }
      else
      {
        params = i;
        if (params != null)
        {
          i2 = g;
          i2 -= a.e(parami, i2, false);
          g = i2;
          if (i2 == 0) {
            i2 = 1;
          } else {
            i2 = 0;
          }
          if (i2 != 0)
          {
            if (f > 0)
            {
              parami = a;
              i3 = h;
              l1 = d * i3 / e;
              if (Arrays.binarySearch(l, i3) >= 0) {
                i3 = 1;
              } else {
                i3 = 0;
              }
              parami.c(l1, i3, f, 0, null);
            }
            h += 1;
          }
          i3 = i1;
          if (i2 != 0)
          {
            i = null;
            i3 = i1;
          }
        }
        else
        {
          if ((parami.getPosition() & 1L) == 1L) {
            parami.j(1);
          }
          parami.m(a.a, 0, 12);
          a.G(0);
          i3 = a.i();
          if (i3 == 1414744396)
          {
            a.G(8);
            if (a.i() != 1769369453) {
              i2 = 8;
            }
            parami.j(i2);
            parami.i();
            i3 = i1;
          }
          else
          {
            i2 = a.i();
            if (i3 == 1263424842)
            {
              l1 = parami.getPosition() + i2;
              l2 = 8L;
            }
            else
            {
              parami.j(8);
              parami.i();
              params = a(i3);
              if (params != null) {
                break label530;
              }
              l1 = parami.getPosition();
              l2 = i2;
            }
            h = (l1 + l2);
            i3 = i1;
            break label551;
            f = i2;
            g = i2;
            i = params;
            i3 = i1;
          }
        }
      }
      return i3;
    case 5: 
      params = new v5.u(m);
      parami.readFully(a, 0, m);
      i3 = c;
      i2 = b;
      if (i3 - i2 < 16)
      {
        l1 = 0L;
      }
      else
      {
        params.H(8);
        l2 = params.i();
        l1 = k;
        if (l2 > l1) {
          l1 = 0L;
        } else {
          l1 += 8L;
        }
        params.G(i2);
      }
      while (c - b >= 16)
      {
        i3 = params.i();
        i2 = params.i();
        l2 = params.i();
        params.i();
        parami = a(i3);
        if (parami != null)
        {
          if ((i2 & 0x10) == 16)
          {
            if (j == l.length)
            {
              localObject1 = k;
              k = Arrays.copyOf((long[])localObject1, localObject1.length * 3 / 2);
              localObject1 = l;
              l = Arrays.copyOf((int[])localObject1, localObject1.length * 3 / 2);
            }
            localObject1 = k;
            i2 = j;
            localObject1[i2] = (l2 + l1);
            l[i2] = i;
            j = (i2 + 1);
          }
          i += 1;
        }
      }
      for (parami : g)
      {
        k = Arrays.copyOf(k, j);
        l = Arrays.copyOf(l, j);
      }
      n = true;
      d.t(new a(f));
      c = 6;
      h = k;
      return 0;
    case 4: 
      parami.readFully(a.a, 0, 8);
      a.G(0);
      i2 = a.i();
      i3 = a.i();
      if (i2 == 829973609)
      {
        c = 5;
        m = i3;
      }
      else
      {
        h = (parami.getPosition() + i3);
      }
      return 0;
    case 3: 
      if (k != -1L)
      {
        l2 = parami.getPosition();
        l1 = k;
        if (l2 != l1)
        {
          h = l1;
          return 0;
        }
      }
      parami.m(a.a, 0, 12);
      parami.i();
      a.G(0);
      params = b;
      localObject1 = a;
      params.getClass();
      a = ((v5.u)localObject1).i();
      b = ((v5.u)localObject1).i();
      c = 0;
      i2 = a.i();
      i3 = b.a;
      if (i3 == 1179011410)
      {
        parami.j(12);
        return 0;
      }
      if ((i3 == 1414744396) && (i2 == 1769369453))
      {
        l1 = parami.getPosition();
        k = l1;
        l = (l1 + b.b + 8L);
        if (!n)
        {
          params = e;
          params.getClass();
          if ((b & 0x10) == 16) {
            i2 = 1;
          } else {
            i2 = 0;
          }
          if (i2 != 0)
          {
            c = 4;
            h = l;
          }
          else
          {
            d.t(new t.b(f));
            n = true;
          }
        }
        else
        {
          h = (parami.getPosition() + 12L);
          c = 6;
          return 0;
        }
      }
      else
      {
        h = (parami.getPosition() + b.b + 8L);
        return 0;
      }
      break;
    case 2: 
      i2 = j - 4;
      params = new v5.u(i2);
      parami.readFully(a, 0, i2);
      parami = f.b(1819436136, params);
      if (b == 1819436136)
      {
        params = (c)parami.a(c.class);
        if (params != null)
        {
          e = params;
          f = (c * a);
          params = new ArrayList();
          localObject1 = a.r(0);
          i2 = 0;
          while (((o7.a)localObject1).hasNext())
          {
            parami = (a)((o7.a)localObject1).next();
            if (parami.getType() == 1819440243)
            {
              Object localObject2 = (f)parami;
              parami = (d)((f)localObject2).a(d.class);
              Object localObject3 = (g)((f)localObject2).a(g.class);
              if (parami == null)
              {
                parami = "Missing Stream Header";
              }
              else
              {
                if (localObject3 != null) {
                  break label1508;
                }
                parami = "Missing Stream Format";
              }
              m.f("AviExtractor", parami);
              break label1633;
              l1 = e0.O(d, b * 1000000L, c);
              Object localObject4 = a;
              localObject4.getClass();
              localObject3 = new i0.a((i0)localObject4);
              ((i0.a)localObject3).b(i2);
              i3 = e;
              if (i3 != 0) {
                l = i3;
              }
              localObject2 = (h)((f)localObject2).a(h.class);
              if (localObject2 != null) {
                b = a;
              }
              i3 = p.i(t);
              if ((i3 != 1) && (i3 != 2))
              {
                parami = null;
              }
              else
              {
                localObject4 = d.r(i2, i3);
                ((v)localObject4).d(new i0((i0.a)localObject3));
                parami = new e(i2, i3, l1, d, (v)localObject4);
                f = l1;
              }
              if (parami != null) {
                params.add(parami);
              }
              i2++;
            }
          }
          g = ((e[])params.toArray(new e[0]));
          d.m();
          c = 3;
          return 0;
        }
        throw a1.a("AviHeader not found", null);
      }
      params = f.l("Unexpected header list type ");
      params.append(b);
      throw a1.a(params.toString(), null);
    case 1: 
      parami.readFully(a.a, 0, 12);
      a.G(0);
      parami = b;
      params = a;
      parami.getClass();
      a = params.i();
      b = params.i();
      c = 0;
      if (a == 1414744396)
      {
        c = params.i();
        parami = b;
        if (c == 1819436136)
        {
          j = b;
          c = 2;
        }
        else
        {
          parami = f.l("hdrl expected, found: ");
          parami.append(b.c);
          throw a1.a(parami.toString(), null);
        }
      }
      else
      {
        params = f.l("LIST expected, found: ");
        params.append(a);
        throw a1.a(params.toString(), null);
      }
      break;
    case 0: 
      label1508:
      label1633:
      if (!i(parami)) {
        break label1956;
      }
      parami.j(12);
      c = 1;
    }
    return 0;
    label1956:
    throw a1.a("AVI Header List not found", null);
  }
  
  public final void f(long paramLong1, long paramLong2)
  {
    h = -1L;
    i = null;
    for (e locale : g)
    {
      int i3;
      if (j == 0)
      {
        i3 = 0;
      }
      else
      {
        i3 = e0.f(k, paramLong1, true);
        i3 = l[i3];
      }
      h = i3;
    }
    if (paramLong1 == 0L)
    {
      if (g.length == 0) {
        c = 0;
      } else {
        c = 3;
      }
      return;
    }
    c = 6;
  }
  
  public final boolean i(i parami)
  {
    byte[] arrayOfByte = a.a;
    boolean bool = false;
    parami.m(arrayOfByte, 0, 12);
    a.G(0);
    if (a.i() != 1179011410) {
      return false;
    }
    a.H(4);
    if (a.i() == 541677121) {
      bool = true;
    }
    return bool;
  }
  
  public final void release() {}
  
  public final class a
    implements c4.t
  {
    public final long a;
    
    public a(long paramLong)
    {
      a = paramLong;
    }
    
    public final boolean e()
    {
      return true;
    }
    
    public final t.a g(long paramLong)
    {
      Object localObject1 = g[0].b(paramLong);
      int i = 1;
      for (;;)
      {
        Object localObject2 = g;
        if (i >= localObject2.length) {
          break;
        }
        t.a locala = localObject2[i].b(paramLong);
        localObject2 = localObject1;
        if (a.b < a.b) {
          localObject2 = locala;
        }
        i++;
        localObject1 = localObject2;
      }
      return (t.a)localObject1;
    }
    
    public final long h()
    {
      return a;
    }
  }
  
  public static final class b
  {
    public int a;
    public int b;
    public int c;
  }
}

/* Location:
 * Qualified Name:     e4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */