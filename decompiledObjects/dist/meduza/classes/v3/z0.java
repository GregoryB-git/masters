package v3;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import p2.v;
import t5.l0;
import v5.k;
import w3.a0;
import x0.d;
import x0.f;
import z4.e0.a;
import z4.l;
import z4.n;
import z4.p;
import z4.p.a;
import z4.q;
import z4.r;
import z4.t;
import z4.t.b;
import z4.t.c;
import z4.w;

public final class z0
{
  public final a0 a;
  public final ArrayList b;
  public final IdentityHashMap<r, c> c;
  public final HashMap d;
  public final d e;
  public final HashMap<c, b> f;
  public final HashSet g;
  public final w3.a h;
  public final k i;
  public z4.e0 j;
  public boolean k;
  public l0 l;
  
  public z0(d paramd, w3.a parama, k paramk, a0 parama0)
  {
    a = parama0;
    e = paramd;
    j = new e0.a();
    c = new IdentityHashMap();
    d = new HashMap();
    b = new ArrayList();
    h = parama;
    i = paramk;
    f = new HashMap();
    g = new HashSet();
  }
  
  public final r1 a(int paramInt, List<c> paramList, z4.e0 parame0)
  {
    if (!paramList.isEmpty())
    {
      j = parame0;
      for (int m = paramInt; m < paramList.size() + paramInt; m++)
      {
        c localc = (c)paramList.get(m - paramInt);
        p.a locala;
        int n;
        if (m > 0)
        {
          parame0 = (c)b.get(m - 1);
          locala = a.w;
          n = d;
        }
        for (d = (locala.o() + n);; d = 0)
        {
          e = false;
          c.clear();
          break;
        }
        b(m, a.w.o());
        b.add(m, localc);
        d.put(b, localc);
        if (k)
        {
          f(localc);
          if (c.isEmpty())
          {
            g.add(localc);
          }
          else
          {
            parame0 = (b)f.get(localc);
            if (parame0 != null) {
              a.l(b);
            }
          }
        }
      }
    }
    return c();
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    while (paramInt1 < b.size())
    {
      c localc = (c)b.get(paramInt1);
      d += paramInt2;
      paramInt1++;
    }
  }
  
  public final r1 c()
  {
    if (b.isEmpty()) {
      return r1.a;
    }
    int m = 0;
    int n = 0;
    while (m < b.size())
    {
      c localc = (c)b.get(m);
      d = n;
      n += a.w.o();
      m++;
    }
    return new h1(b, j);
  }
  
  public final void d()
  {
    Iterator localIterator = g.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (c)localIterator.next();
      if (c.isEmpty())
      {
        localObject = (b)f.get(localObject);
        if (localObject != null) {
          a.l(b);
        }
        localIterator.remove();
      }
    }
  }
  
  public final void e(c paramc)
  {
    if ((e) && (c.isEmpty()))
    {
      b localb = (b)f.remove(paramc);
      localb.getClass();
      a.a(b);
      a.m(c);
      a.c(c);
      g.remove(paramc);
    }
  }
  
  public final void f(c paramc)
  {
    p localp = a;
    u0 localu0 = new u0(this);
    a locala = new a(paramc);
    f.put(paramc, new b(localp, localu0, locala));
    int m = v5.e0.a;
    paramc = Looper.myLooper();
    if (paramc == null) {
      paramc = Looper.getMainLooper();
    }
    localp.n(new Handler(paramc, null), locala);
    paramc = Looper.myLooper();
    if (paramc == null) {
      paramc = Looper.getMainLooper();
    }
    localp.d(new Handler(paramc, null), locala);
    localp.e(localu0, l, a);
  }
  
  public final void g(int paramInt1, int paramInt2)
  {
    
    while (paramInt2 >= paramInt1)
    {
      c localc = (c)b.remove(paramInt2);
      d.remove(b);
      b(paramInt2, -a.w.o());
      e = true;
      if (k) {
        e(localc);
      }
      paramInt2--;
    }
  }
  
  public final class a
    implements w, a4.g
  {
    public final z0.c a;
    
    public a(z0.c paramc)
    {
      a = paramc;
    }
    
    public final void E(int paramInt, t.b paramb)
    {
      paramb = b(paramInt, paramb);
      if (paramb != null) {
        i.e(new f(7, this, paramb));
      }
    }
    
    public final void H(int paramInt, t.b paramb)
    {
      paramb = b(paramInt, paramb);
      if (paramb != null) {
        i.e(new y0(this, paramb, 0));
      }
    }
    
    public final void M(int paramInt, t.b paramb, n paramn, q paramq)
    {
      paramb = b(paramInt, paramb);
      if (paramb != null) {
        i.e(new v(this, paramb, paramn, paramq, 1));
      }
    }
    
    public final void O(int paramInt, t.b paramb)
    {
      paramb = b(paramInt, paramb);
      if (paramb != null) {
        i.e(new w.g(7, this, paramb));
      }
    }
    
    public final void P(int paramInt, t.b paramb, Exception paramException)
    {
      paramb = b(paramInt, paramb);
      if (paramb != null) {
        i.e(new d(this, paramb, paramException, 2));
      }
    }
    
    public final void U(int paramInt1, t.b paramb, int paramInt2)
    {
      paramb = b(paramInt1, paramb);
      if (paramb != null) {
        i.e(new p.s(this, paramb, paramInt2, 2));
      }
    }
    
    public final void V(int paramInt, t.b paramb, q paramq)
    {
      paramb = b(paramInt, paramb);
      if (paramb != null) {
        i.e(new x0.g(this, paramb, paramq, 3));
      }
    }
    
    public final Pair<Integer, t.b> b(int paramInt, t.b paramb)
    {
      Object localObject1 = null;
      if (paramb != null)
      {
        Object localObject2 = a;
        for (int i = 0; i < c.size(); i++) {
          if (c.get(i)).d == d)
          {
            localObject1 = a;
            localObject2 = b;
            i = a.e;
            paramb = paramb.b(Pair.create(localObject2, localObject1));
            break label91;
          }
        }
        paramb = null;
        label91:
        if (paramb == null) {
          return null;
        }
        localObject1 = paramb;
      }
      return Pair.create(Integer.valueOf(paramInt + a.d), localObject1);
    }
    
    public final void f0(int paramInt, t.b paramb, n paramn, q paramq, IOException paramIOException, boolean paramBoolean)
    {
      paramb = b(paramInt, paramb);
      if (paramb != null) {
        i.e(new w0(this, paramb, paramn, paramq, paramIOException, paramBoolean));
      }
    }
    
    public final void h0(int paramInt, t.b paramb, n paramn, q paramq)
    {
      paramb = b(paramInt, paramb);
      if (paramb != null) {
        i.e(new v0(this, paramb, paramn, paramq, 0));
      }
    }
    
    public final void j0(int paramInt, t.b paramb)
    {
      paramb = b(paramInt, paramb);
      if (paramb != null) {
        i.e(new y0(this, paramb, 1));
      }
    }
    
    public final void n0(int paramInt, t.b paramb, n paramn, q paramq)
    {
      paramb = b(paramInt, paramb);
      if (paramb != null) {
        i.e(new v0(this, paramb, paramn, paramq, 1));
      }
    }
    
    public final void o0(int paramInt, t.b paramb, q paramq)
    {
      paramb = b(paramInt, paramb);
      if (paramb != null) {
        i.e(new x0(this, paramb, paramq, 0));
      }
    }
  }
  
  public static final class b
  {
    public final t a;
    public final t.c b;
    public final z0.a c;
    
    public b(p paramp, u0 paramu0, z0.a parama)
    {
      a = paramp;
      b = paramu0;
      c = parama;
    }
  }
  
  public static final class c
    implements t0
  {
    public final p a;
    public final Object b;
    public final ArrayList c;
    public int d;
    public boolean e;
    
    public c(t paramt, boolean paramBoolean)
    {
      a = new p(paramt, paramBoolean);
      c = new ArrayList();
      b = new Object();
    }
    
    public final Object a()
    {
      return b;
    }
    
    public final r1 b()
    {
      return a.w;
    }
  }
  
  public static abstract interface d {}
}

/* Location:
 * Qualified Name:     v3.z0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */