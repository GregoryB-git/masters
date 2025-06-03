package l4;

import c4.j;
import c4.s;
import c4.v;
import c4.y;
import java.util.Arrays;
import v3.a1;
import v3.i0;
import v5.e0;
import v5.u;

public final class c
  implements c4.h
{
  public j a;
  public h b;
  public boolean c;
  
  public final boolean a(c4.i parami)
  {
    Object localObject = new e();
    if ((((e)localObject).a(parami, true)) && ((a & 0x2) == 2))
    {
      int i = Math.min(e, 8);
      localObject = new u(i);
      parami.m(a, 0, i);
      ((u)localObject).G(0);
      if ((c - b >= 5) && (((u)localObject).v() == 127) && (((u)localObject).w() == 1179402563L)) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        parami = new b();
      }
      else
      {
        ((u)localObject).G(0);
        boolean bool;
        try
        {
          bool = y.c(1, (u)localObject, true);
        }
        catch (a1 parami)
        {
          bool = false;
        }
        if (bool)
        {
          parami = new i();
        }
        else
        {
          ((u)localObject).G(0);
          if (!g.e((u)localObject, g.o)) {
            break label187;
          }
          parami = new g();
        }
      }
      b = parami;
      return true;
    }
    label187:
    return false;
  }
  
  public final void b(j paramj)
  {
    a = paramj;
  }
  
  public final int d(c4.i parami, s params)
  {
    x6.b.K(a);
    if (b == null) {
      if (a(parami)) {
        parami.i();
      } else {
        throw a1.a("Failed to determine bitstream type", null);
      }
    }
    boolean bool = c;
    int i = 0;
    if (!bool)
    {
      v localv = a.r(0, 1);
      a.m();
      localObject = b;
      c = a;
      b = localv;
      ((h)localObject).d(true);
      c = true;
    }
    Object localObject = b;
    x6.b.K(b);
    int j = e0.a;
    j = h;
    long l1;
    long l2;
    if (j != 0)
    {
      if (j != 1)
      {
        if (j != 2)
        {
          if (j != 3) {
            throw new IllegalStateException();
          }
        }
        else
        {
          l1 = d.b(parami);
          if (l1 >= 0L)
          {
            a = l1;
            j = 1;
            break label768;
          }
          if (l1 < -1L) {
            ((h)localObject).a(-(l1 + 2L));
          }
          if (!l)
          {
            params = d.a();
            x6.b.K(params);
            c.t(params);
            l = true;
          }
          if ((k <= 0L) && (!a.a(parami)))
          {
            h = 3;
          }
          else
          {
            k = 0L;
            parami = a.b;
            l1 = ((h)localObject).b(parami);
            if (l1 >= 0L)
            {
              l2 = g;
              if (l2 + l1 >= e)
              {
                l2 = l2 * 1000000L / i;
                b.b(c, parami);
                b.c(l2, 1, c, 0, null);
                e = -1L;
              }
            }
            g += l1;
            j = i;
            break label768;
          }
        }
      }
      else
      {
        parami.j((int)f);
        h = 2;
        j = i;
        break label768;
      }
    }
    else
    {
      for (;;)
      {
        if (!a.a(parami))
        {
          h = 3;
          j = 0;
          break label534;
        }
        l1 = parami.getPosition();
        l2 = f;
        k = (l1 - l2);
        if (!((h)localObject).c(a.b, l2, j)) {
          break;
        }
        f = parami.getPosition();
      }
      j = 1;
      label534:
      if (j != 0) {
        break label545;
      }
    }
    j = -1;
    break label768;
    label545:
    params = j.a;
    i = H;
    if (!m)
    {
      b.d(params);
      m = true;
    }
    params = j.b;
    if (params != null)
    {
      parami = params;
    }
    else
    {
      if (parami.getLength() != -1L) {
        break label636;
      }
      parami = new h.b();
    }
    d = parami;
    break label701;
    label636:
    params = a.a;
    if ((a & 0x4) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    d = new a((h)localObject, f, parami.getLength(), d + e, b, bool);
    label701:
    h = 2;
    parami = a;
    params = b;
    localObject = a;
    if (localObject.length == 65025)
    {
      j = i;
    }
    else
    {
      params.E(Arrays.copyOf((byte[])localObject, Math.max(65025, c)), b.c);
      j = i;
    }
    label768:
    return j;
  }
  
  public final void f(long paramLong1, long paramLong2)
  {
    h localh = b;
    if (localh != null)
    {
      d locald = a;
      Object localObject = a;
      a = 0;
      b = 0L;
      c = 0;
      d = 0;
      e = 0;
      b.D(0);
      c = -1;
      e = false;
      if (paramLong1 == 0L)
      {
        localh.d(l ^ true);
      }
      else if (h != 0)
      {
        paramLong1 = i * paramLong2 / 1000000L;
        e = paramLong1;
        localObject = d;
        int i = e0.a;
        ((f)localObject).c(paramLong1);
        h = 2;
      }
    }
  }
  
  public final boolean i(c4.i parami)
  {
    try
    {
      boolean bool = a(parami);
      return bool;
    }
    catch (a1 parami) {}
    return false;
  }
  
  public final void release() {}
}

/* Location:
 * Qualified Name:     l4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */