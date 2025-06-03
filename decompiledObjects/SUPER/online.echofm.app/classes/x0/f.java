package x0;

import B0.b;
import d0.I;
import d0.I.b;
import d0.I.c;
import g0.M;
import java.io.IOException;
import java.util.ArrayList;

public final class f
  extends b0
{
  public final long m;
  public final long n;
  public final boolean o;
  public final boolean p;
  public final boolean q;
  public final ArrayList r;
  public final I.c s;
  public a t;
  public b u;
  public long v;
  public long w;
  
  public f(x paramx, long paramLong1, long paramLong2)
  {
    this(paramx, paramLong1, paramLong2, true, false, false);
  }
  
  public f(x paramx, long paramLong1, long paramLong2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    super((x)g0.a.e(paramx));
    boolean bool;
    if (paramLong1 >= 0L) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.a(bool);
    m = paramLong1;
    n = paramLong2;
    o = paramBoolean1;
    p = paramBoolean2;
    q = paramBoolean3;
    r = new ArrayList();
    s = new I.c();
  }
  
  public void B()
  {
    super.B();
    u = null;
    t = null;
  }
  
  public void S(I paramI)
  {
    if (u != null) {
      return;
    }
    W(paramI);
  }
  
  public final void W(I paramI)
  {
    Object localObject = s;
    int i = 0;
    paramI.n(0, (I.c)localObject);
    long l1 = s.e();
    localObject = t;
    long l2 = Long.MIN_VALUE;
    long l3;
    long l4;
    int k;
    if ((localObject != null) && (!r.isEmpty()) && (!p))
    {
      l3 = v;
      if (n == Long.MIN_VALUE) {
        l4 = l2;
      } else {
        l4 = w - l1;
      }
      l3 -= l1;
    }
    else
    {
      long l5 = m;
      long l6 = n;
      l3 = l5;
      l4 = l6;
      if (q)
      {
        l4 = s.c();
        l3 = l5 + l4;
        l4 = l6 + l4;
      }
      v = (l1 + l3);
      if (n != Long.MIN_VALUE) {
        l2 = l1 + l4;
      }
      w = l2;
      int j = r.size();
      for (k = 0; k < j; k++) {
        ((e)r.get(k)).w(v, w);
      }
    }
    try
    {
      localObject = new x0/f$a;
      ((a)localObject).<init>(paramI, l3, l4);
      t = ((a)localObject);
      A((I)localObject);
      return;
    }
    catch (b paramI)
    {
      u = paramI;
      for (k = i; k < r.size(); k++) {
        ((e)r.get(k)).t(u);
      }
    }
  }
  
  public void e(v paramv)
  {
    g0.a.f(r.remove(paramv));
    k.e(o);
    if ((r.isEmpty()) && (!p)) {
      W(et)).e);
    }
  }
  
  public v f(x.b paramb, b paramb1, long paramLong)
  {
    paramb = new e(k.f(paramb, paramb1, paramLong), o, v, w);
    r.add(paramb);
    return paramb;
  }
  
  public void h()
  {
    b localb = u;
    if (localb == null)
    {
      super.h();
      return;
    }
    throw localb;
  }
  
  public static final class a
    extends p
  {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;
    
    public a(I paramI, long paramLong1, long paramLong2)
    {
      super();
      int j = paramI.i();
      boolean bool2 = false;
      if (j == 1)
      {
        paramI = paramI.n(0, new I.c());
        long l1 = Math.max(0L, paramLong1);
        if ((!k) && (l1 != 0L) && (!h)) {
          throw new f.b(1);
        }
        if (paramLong2 == Long.MIN_VALUE) {
          paramLong1 = m;
        } else {
          paramLong1 = Math.max(0L, paramLong2);
        }
        long l2 = m;
        paramLong2 = paramLong1;
        if (l2 != -9223372036854775807L)
        {
          paramLong2 = paramLong1;
          if (paramLong1 > l2) {
            paramLong2 = l2;
          }
          if (l1 > paramLong2) {
            throw new f.b(2);
          }
        }
        f = l1;
        g = paramLong2;
        boolean bool1 = paramLong2 < -9223372036854775807L;
        if (!bool1) {
          paramLong1 = -9223372036854775807L;
        } else {
          paramLong1 = paramLong2 - l1;
        }
        h = paramLong1;
        boolean bool3 = bool2;
        if (i) {
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
        i = bool3;
        return;
      }
      throw new f.b(0);
    }
    
    public I.b g(int paramInt, I.b paramb, boolean paramBoolean)
    {
      e.g(0, paramb, paramBoolean);
      long l1 = paramb.n() - f;
      long l2 = h;
      if (l2 == -9223372036854775807L) {
        l2 = -9223372036854775807L;
      } else {
        l2 -= l1;
      }
      return paramb.s(a, b, 0, l2, l1);
    }
    
    public I.c o(int paramInt, I.c paramc, long paramLong)
    {
      e.o(0, paramc, 0L);
      long l = p;
      paramLong = f;
      p = (l + paramLong);
      m = h;
      i = i;
      l = l;
      if (l != -9223372036854775807L)
      {
        paramLong = Math.max(l, paramLong);
        l = paramLong;
        l = g;
        if (l != -9223372036854775807L) {
          paramLong = Math.min(paramLong, l);
        }
        l = (paramLong - f);
      }
      paramLong = M.i1(f);
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
    public final int o;
    
    public b(int paramInt)
    {
      super();
      o = paramInt;
    }
    
    public static String a(int paramInt)
    {
      if (paramInt != 0)
      {
        if (paramInt != 1)
        {
          if (paramInt != 2) {
            return "unknown";
          }
          return "start exceeds end";
        }
        return "not seekable to start";
      }
      return "invalid period count";
    }
  }
}

/* Location:
 * Qualified Name:     x0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */