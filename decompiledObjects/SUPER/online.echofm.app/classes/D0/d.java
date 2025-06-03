package D0;

import W2.s;
import X2.v;
import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import d0.N;
import d0.N.a;
import d0.O;
import d0.P;
import d0.h.b;
import d0.n;
import d0.q.b;
import d0.r.b;
import g0.A;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import k0.u;

public final class d
  implements G, O
{
  public static final Executor n = new b();
  public final Context a;
  public final h b;
  public final q c;
  public final t d;
  public final d0.F.a e;
  public final g0.c f;
  public final CopyOnWriteArraySet g;
  public d0.q h;
  public p i;
  public g0.k j;
  public Pair k;
  public int l;
  public int m;
  
  public d(b paramb)
  {
    Object localObject = b.a(paramb);
    a = ((Context)localObject);
    h localh = new h((Context)localObject);
    b = localh;
    g0.c localc = b.b(paramb);
    f = localc;
    localObject = b.c(paramb);
    c = ((q)localObject);
    ((q)localObject).o(localc);
    d = new t(new c(null), (q)localObject);
    e = ((d0.F.a)g0.a.h(b.d(paramb)));
    g = new CopyOnWriteArraySet();
    m = 0;
    u(localh);
  }
  
  public static d0.h y(d0.h paramh)
  {
    if ((paramh != null) && (paramh.g())) {
      return paramh;
    }
    return d0.h.h;
  }
  
  public final N A(d0.q paramq)
  {
    boolean bool;
    if (m == 0) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.f(bool);
    Object localObject1 = y(A);
    Object localObject2 = localObject1;
    if (c == 7)
    {
      localObject2 = localObject1;
      if (g0.M.a < 34) {
        localObject2 = ((d0.h)localObject1).a().e(6).a();
      }
    }
    g0.k localk = f.e((Looper)g0.a.h(Looper.myLooper()), null);
    j = localk;
    try
    {
      d0.F.a locala = e;
      localObject1 = a;
      d0.k localk1 = d0.k.a;
      Objects.requireNonNull(localk);
      a locala1 = new D0/a;
      locala1.<init>(localk);
      locala.a((Context)localObject1, (d0.h)localObject2, localk1, this, locala1, v.Y(), 0L);
      localObject1 = k;
      if (localObject1 != null)
      {
        localObject2 = (Surface)first;
        localObject1 = (A)second;
        E((Surface)localObject2, ((A)localObject1).b(), ((A)localObject1).a());
      }
    }
    catch (d0.M localM)
    {
      break label194;
    }
    throw null;
    label194:
    throw new F.b(localM, paramq);
  }
  
  public final boolean B()
  {
    int i1 = m;
    boolean bool = true;
    if (i1 != 1) {
      bool = false;
    }
    return bool;
  }
  
  public final boolean C()
  {
    boolean bool;
    if ((l == 0) && (d.e())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void E(Surface paramSurface, int paramInt1, int paramInt2) {}
  
  public void F()
  {
    if (m == 2) {
      return;
    }
    g0.k localk = j;
    if (localk != null) {
      localk.h(null);
    }
    k = null;
    m = 2;
  }
  
  public void G(long paramLong1, long paramLong2)
  {
    if (l == 0) {
      d.h(paramLong1, paramLong2);
    }
  }
  
  public void H(Surface paramSurface, A paramA)
  {
    Pair localPair = k;
    if ((localPair != null) && (((Surface)first).equals(paramSurface)) && (((A)k.second).equals(paramA))) {
      return;
    }
    k = Pair.create(paramSurface, paramA);
    E(paramSurface, paramA.b(), paramA.a());
  }
  
  public final void I(float paramFloat)
  {
    d.j(paramFloat);
  }
  
  public final void J(p paramp)
  {
    i = paramp;
  }
  
  public q a()
  {
    return c;
  }
  
  public F b()
  {
    return b;
  }
  
  public void u(d paramd)
  {
    g.add(paramd);
  }
  
  public void v()
  {
    A localA = A.c;
    E(null, localA.b(), localA.a());
    k = null;
  }
  
  public final void w()
  {
    if (!B()) {
      return;
    }
    l += 1;
    d.b();
    ((g0.k)g0.a.h(j)).j(new c(this));
  }
  
  public final void x()
  {
    int i1 = l - 1;
    l = i1;
    if (i1 > 0) {
      return;
    }
    if (i1 >= 0)
    {
      d.b();
      return;
    }
    throw new IllegalStateException(String.valueOf(l));
  }
  
  public final boolean z(long paramLong)
  {
    boolean bool;
    if ((l == 0) && (d.d(paramLong))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static final class b
  {
    public final Context a;
    public final q b;
    public N.a c;
    public d0.F.a d;
    public g0.c e;
    public boolean f;
    
    public b(Context paramContext, q paramq)
    {
      a = paramContext.getApplicationContext();
      b = paramq;
      e = g0.c.a;
    }
    
    public d e()
    {
      g0.a.f(f ^ true);
      if (d == null)
      {
        if (c == null) {
          c = new d.e(null);
        }
        d = new d.f(c);
      }
      d locald = new d(this, null);
      f = true;
      return locald;
    }
    
    public b f(g0.c paramc)
    {
      e = paramc;
      return this;
    }
  }
  
  public final class c
    implements t.a
  {
    public c() {}
    
    public void b(P paramP)
    {
      d.l(d.this, new q.b().v0(a).Y(b).o0("video/raw").K());
      Iterator localIterator = d.m(d.this).iterator();
      while (localIterator.hasNext()) {
        ((d.d)localIterator.next()).b(d.this, paramP);
      }
    }
    
    public void c(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean)
    {
      Object localObject;
      if ((paramBoolean) && (d.n(d.this) != null))
      {
        localObject = d.m(d.this).iterator();
        while (((Iterator)localObject).hasNext()) {
          ((d.d)((Iterator)localObject).next()).d(d.this);
        }
      }
      if (d.o(d.this) != null)
      {
        if (d.k(d.this) == null) {}
        for (localObject = new q.b().K();; localObject = d.k(d.this)) {
          break;
        }
        d.o(d.this).k(paramLong2, d.p(d.this).c(), (d0.q)localObject, null);
      }
      d.q(d.this);
      android.support.v4.media.a.a(g0.a.h(null));
      throw null;
    }
    
    public void d()
    {
      Iterator localIterator = d.m(d.this).iterator();
      while (localIterator.hasNext()) {
        ((d.d)localIterator.next()).a(d.this);
      }
      d.q(d.this);
      android.support.v4.media.a.a(g0.a.h(null));
      throw null;
    }
  }
  
  public static abstract interface d
  {
    public abstract void a(d paramd);
    
    public abstract void b(d paramd, P paramP);
    
    public abstract void d(d paramd);
  }
  
  public static final class e
    implements N.a
  {
    public static final s a = W2.t.a(new e());
  }
  
  public static final class f
    implements d0.F.a
  {
    public final N.a a;
    
    public f(N.a parama)
    {
      a = parama;
    }
    
    public d0.F a(Context paramContext, d0.h paramh, d0.k paramk, O paramO, Executor paramExecutor, List paramList, long paramLong)
    {
      try
      {
        Constructor localConstructor = Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(new Class[] { N.a.class });
        try
        {
          ((d0.F.a)localConstructor.newInstance(new Object[] { a })).a(paramContext, paramh, paramk, paramO, paramExecutor, paramList, paramLong);
          return null;
        }
        catch (Exception paramContext) {}
        throw d0.M.a(paramContext);
      }
      catch (Exception paramContext) {}
    }
  }
  
  public static final abstract class g
  {
    public static Constructor a;
    public static Method b;
    public static Method c;
    
    public static n a(float paramFloat)
    {
      try
      {
        b();
        Object localObject = a.newInstance(new Object[0]);
        b.invoke(localObject, new Object[] { Float.valueOf(paramFloat) });
        android.support.v4.media.a.a(g0.a.e(c.invoke(localObject, new Object[0])));
        return null;
      }
      catch (Exception localException)
      {
        throw new IllegalStateException(localException);
      }
    }
    
    public static void b()
    {
      if ((a == null) || (b == null) || (c == null))
      {
        Class localClass = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
        a = localClass.getConstructor(new Class[0]);
        b = localClass.getMethod("setRotationDegrees", new Class[] { Float.TYPE });
        c = localClass.getMethod("build", new Class[0]);
      }
    }
  }
  
  public final class h
    implements F, d.d
  {
    public final Context a;
    public final int b;
    public final ArrayList c;
    public d0.q d;
    public int e;
    public long f;
    public long g;
    public boolean h;
    public long i;
    public long j;
    public boolean k;
    public long l;
    public F.a m;
    public Executor n;
    
    public h(Context paramContext)
    {
      a = paramContext;
      b = g0.M.b0(paramContext);
      c = new ArrayList();
      i = -9223372036854775807L;
      j = -9223372036854775807L;
      m = F.a.a;
      n = d.r();
    }
    
    public void A(boolean paramBoolean)
    {
      if (!J())
      {
        k = false;
        i = -9223372036854775807L;
        j = -9223372036854775807L;
        d.e(d.this);
        if (paramBoolean) {
          d.s(d.this).m();
        }
        return;
      }
      throw null;
    }
    
    public void B()
    {
      d.s(d.this).l();
    }
    
    public void C(List paramList)
    {
      if (c.equals(paramList)) {
        return;
      }
      o(paramList);
      n();
    }
    
    public void D(long paramLong1, long paramLong2)
    {
      boolean bool1 = h;
      boolean bool2;
      if ((f == paramLong1) && (g == paramLong2)) {
        bool2 = false;
      } else {
        bool2 = true;
      }
      h = (bool1 | bool2);
      f = paramLong1;
      g = paramLong2;
    }
    
    public boolean E()
    {
      return g0.M.B0(a);
    }
    
    public void F(F.a parama, Executor paramExecutor)
    {
      m = parama;
      n = paramExecutor;
    }
    
    public void G(int paramInt, d0.q paramq)
    {
      g0.a.f(J());
      boolean bool = true;
      if ((paramInt != 1) && (paramInt != 2))
      {
        paramq = new StringBuilder();
        paramq.append("Unsupported input type ");
        paramq.append(paramInt);
        throw new UnsupportedOperationException(paramq.toString());
      }
      d.s(d.this).p(v);
      if ((paramInt == 1) && (g0.M.a < 21))
      {
        int i1 = w;
        if ((i1 != -1) && (i1 != 0)) {
          d.g.a(i1);
        }
      }
      e = paramInt;
      d = paramq;
      if (!k)
      {
        n();
        k = true;
        l = -9223372036854775807L;
      }
      else
      {
        if (j == -9223372036854775807L) {
          bool = false;
        }
        g0.a.f(bool);
        l = j;
      }
    }
    
    public void H(d0.q paramq)
    {
      g0.a.f(J() ^ true);
      d.t(d.this, paramq);
    }
    
    public void I(Surface paramSurface, A paramA)
    {
      H(paramSurface, paramA);
    }
    
    public boolean J()
    {
      return false;
    }
    
    public void K(boolean paramBoolean)
    {
      d.s(d.this).h(paramBoolean);
    }
    
    public void L()
    {
      d.s(d.this).g();
    }
    
    public void a(d paramd)
    {
      paramd = m;
      n.execute(new g(this, paramd));
    }
    
    public void b(d paramd, P paramP)
    {
      paramd = m;
      n.execute(new f(this, paramd, paramP));
    }
    
    public boolean c()
    {
      if (J())
      {
        long l1 = i;
        if ((l1 != -9223372036854775807L) && (d.g(d.this, l1))) {
          return true;
        }
      }
      boolean bool = false;
      return bool;
    }
    
    public void d(d paramd)
    {
      paramd = m;
      n.execute(new h(this, paramd));
    }
    
    public boolean e()
    {
      boolean bool;
      if ((J()) && (d.f(d.this))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void f(long paramLong1, long paramLong2)
    {
      try
      {
        G(paramLong1, paramLong2);
        return;
      }
      catch (u localu)
      {
        d0.q localq = d;
        if (localq == null) {
          localq = new q.b().K();
        }
        throw new F.b(localu, localq);
      }
    }
    
    public void j()
    {
      d.s(d.this).a();
    }
    
    public final void n()
    {
      if (d == null) {
        return;
      }
      new ArrayList().addAll(c);
      d0.q localq = (d0.q)g0.a.e(d);
      android.support.v4.media.a.a(g0.a.h(null));
      new r.b(d.j(A), t, u).b(x).a();
      throw null;
    }
    
    public void o(List paramList)
    {
      c.clear();
      c.addAll(paramList);
    }
    
    public void release()
    {
      F();
    }
    
    public void u(float paramFloat)
    {
      d.i(d.this, paramFloat);
    }
    
    public void v()
    {
      d.this.v();
    }
    
    public long w(long paramLong, boolean paramBoolean)
    {
      g0.a.f(J());
      if (b != -1) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      }
      g0.a.f(paramBoolean);
      paramLong = l;
      if (paramLong != -9223372036854775807L)
      {
        if (!d.g(d.this, paramLong)) {
          return -9223372036854775807L;
        }
        n();
        l = -9223372036854775807L;
      }
      android.support.v4.media.a.a(g0.a.h(null));
      throw null;
    }
    
    public Surface x()
    {
      g0.a.f(J());
      android.support.v4.media.a.a(g0.a.h(null));
      throw null;
    }
    
    public void y()
    {
      d.s(d.this).k();
    }
    
    public void z(p paramp)
    {
      d.h(d.this, paramp);
    }
  }
}

/* Location:
 * Qualified Name:     D0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */