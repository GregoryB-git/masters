package z4;

import java.io.IOException;
import java.util.ArrayList;
import v3.r1;
import v3.r1.b;
import v3.r1.c;
import v5.e0;

public final class d
  extends l0
{
  public long A;
  public long B;
  public final long t;
  public final long u;
  public final boolean v;
  public final ArrayList<c> w;
  public final r1.c x;
  public a y;
  public b z;
  
  public d(t paramt, long paramLong1, long paramLong2)
  {
    super(paramt);
    boolean bool;
    if (paramLong1 >= 0L) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.q(bool);
    t = paramLong1;
    u = paramLong2;
    v = true;
    w = new ArrayList();
    x = new r1.c();
  }
  
  public final void D(r1 paramr1)
  {
    if (z != null) {
      return;
    }
    F(paramr1);
  }
  
  public final void F(r1 paramr1)
  {
    Object localObject = x;
    int i = 0;
    paramr1.m(0, (r1.c)localObject);
    long l1 = x.y;
    localObject = y;
    long l2 = Long.MIN_VALUE;
    long l3;
    long l4;
    int k;
    if ((localObject != null) && (!w.isEmpty()))
    {
      l3 = A;
      if (u != Long.MIN_VALUE) {
        l2 = B - l1;
      }
      l3 -= l1;
      l4 = l2;
    }
    else
    {
      l3 = t;
      l4 = u;
      A = (l1 + l3);
      if (l4 != Long.MIN_VALUE) {
        l2 = l1 + l4;
      }
      B = l2;
      int j = w.size();
      for (k = 0; k < j; k++)
      {
        localObject = (c)w.get(k);
        l1 = A;
        l2 = B;
        e = l1;
        f = l2;
      }
      l2 = l3;
      l3 = l2;
    }
    try
    {
      localObject = new z4/d$a;
      ((a)localObject).<init>(paramr1, l3, l4);
      y = ((a)localObject);
      v((r1)localObject);
      return;
    }
    catch (b paramr1)
    {
      z = paramr1;
      for (k = i; k < w.size(); k++) {
        w.get(k)).o = z;
      }
    }
  }
  
  public final void g(r paramr)
  {
    x6.b.H(w.remove(paramr));
    s.g(a);
    if (w.isEmpty())
    {
      paramr = y;
      paramr.getClass();
      F(b);
    }
  }
  
  public final void h()
  {
    b localb = z;
    if (localb == null)
    {
      super.h();
      return;
    }
    throw localb;
  }
  
  public final r o(t.b paramb, t5.b paramb1, long paramLong)
  {
    paramb = new c(s.o(paramb, paramb1, paramLong), v, A, B);
    w.add(paramb);
    return paramb;
  }
  
  public final void w()
  {
    super.w();
    z = null;
    y = null;
  }
  
  public static final class a
    extends l
  {
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    
    public a(r1 paramr1, long paramLong1, long paramLong2)
    {
      super();
      int i = paramr1.h();
      boolean bool2 = false;
      if (i == 1)
      {
        paramr1 = paramr1.m(0, new r1.c());
        long l1 = Math.max(0L, paramLong1);
        if ((!t) && (l1 != 0L) && (!p)) {
          throw new d.b(1);
        }
        if (paramLong2 == Long.MIN_VALUE) {
          paramLong1 = v;
        } else {
          paramLong1 = Math.max(0L, paramLong2);
        }
        long l2 = v;
        paramLong2 = paramLong1;
        if (l2 != -9223372036854775807L)
        {
          paramLong2 = paramLong1;
          if (paramLong1 > l2) {
            paramLong2 = l2;
          }
          if (l1 > paramLong2) {
            throw new d.b(2);
          }
        }
        c = l1;
        d = paramLong2;
        boolean bool1 = paramLong2 < -9223372036854775807L;
        if (!bool1) {
          paramLong1 = -9223372036854775807L;
        } else {
          paramLong1 = paramLong2 - l1;
        }
        e = paramLong1;
        boolean bool3 = bool2;
        if (q) {
          if (bool1)
          {
            bool3 = bool2;
            if (l2 != -9223372036854775807L)
            {
              bool3 = bool2;
              if (paramLong2 != l2) {}
            }
          }
          else
          {
            bool3 = true;
          }
        }
        f = bool3;
        return;
      }
      throw new d.b(0);
    }
    
    public final r1.b f(int paramInt, r1.b paramb, boolean paramBoolean)
    {
      b.f(0, paramb, paramBoolean);
      long l1 = e - c;
      long l2 = e;
      if (l2 == -9223372036854775807L) {
        l2 = -9223372036854775807L;
      } else {
        l2 -= l1;
      }
      paramb.h(a, b, 0, l2, l1, a5.a.o, false);
      return paramb;
    }
    
    public final r1.c n(int paramInt, r1.c paramc, long paramLong)
    {
      b.n(0, paramc, 0L);
      long l = y;
      paramLong = c;
      y = (l + paramLong);
      v = e;
      q = f;
      l = u;
      if (l != -9223372036854775807L)
      {
        paramLong = Math.max(l, paramLong);
        u = paramLong;
        l = d;
        if (l != -9223372036854775807L) {
          paramLong = Math.min(paramLong, l);
        }
        u = (paramLong - c);
      }
      paramLong = e0.R(c);
      l = e;
      if (l != -9223372036854775807L) {
        e = (l + paramLong);
      }
      l = f;
      if (l != -9223372036854775807L) {
        f = (l + paramLong);
      }
      return paramc;
    }
  }
  
  public static final class b
    extends IOException
  {
    public b(int paramInt)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     z4.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */