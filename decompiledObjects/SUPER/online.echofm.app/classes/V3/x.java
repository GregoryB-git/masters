package V3;

import Q3.p;
import S3.h.b;
import Y3.d.c;
import a4.e.a;
import a4.j;
import d4.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;

public class x
{
  public Y3.d a = Y3.d.d();
  public final F b = new F();
  public final Map c = new HashMap();
  public final Map d = new HashMap();
  public final Set e = new HashSet();
  public final s f;
  public final X3.e g;
  public final c4.c h;
  public long i = 1L;
  
  public x(f paramf, X3.e parame, s params)
  {
    f = params;
    g = parame;
    h = paramf.q("SyncTree");
  }
  
  public List A(final k paramk, final n paramn)
  {
    return (List)g.g(new k(paramk, paramn));
  }
  
  public List B(k paramk, List paramList)
  {
    Object localObject = (v)a.s(paramk);
    if (localObject == null) {
      return Collections.emptyList();
    }
    localObject = ((v)localObject).e();
    if (localObject != null)
    {
      localObject = ((j)localObject).i();
      Iterator localIterator = paramList.iterator();
      for (paramList = (List)localObject; localIterator.hasNext(); paramList = ((d4.s)localIterator.next()).a(paramList)) {}
      return A(paramk, paramList);
    }
    return Collections.emptyList();
  }
  
  public List C(final y paramy)
  {
    return (List)g.g(new n(paramy));
  }
  
  public final List D(a4.i parami, W3.d paramd)
  {
    parami = parami.e();
    v localv = (v)a.s(parami);
    boolean bool;
    if (localv != null) {
      bool = true;
    } else {
      bool = false;
    }
    Y3.m.g(bool, "Missing sync point for query tag that we're tracking");
    return localv.b(paramd, b.h(parami), null);
  }
  
  public List E(final k paramk, final Map paramMap, final y paramy)
  {
    return (List)g.g(new a(paramy, paramk, paramMap));
  }
  
  public List F(final k paramk, final n paramn, final y paramy)
  {
    return (List)g.g(new o(paramy, paramk, paramn));
  }
  
  public List G(k paramk, List paramList, y paramy)
  {
    Object localObject1 = S(paramy);
    if (localObject1 != null)
    {
      Y3.m.f(paramk.equals(((a4.i)localObject1).e()));
      Object localObject2 = (v)a.s(((a4.i)localObject1).e());
      boolean bool1 = false;
      if (localObject2 != null) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      Y3.m.g(bool2, "Missing sync point for query tag that we're tracking");
      localObject2 = ((v)localObject2).l((a4.i)localObject1);
      boolean bool2 = bool1;
      if (localObject2 != null) {
        bool2 = true;
      }
      Y3.m.g(bool2, "Missing view for query tag that we're tracking");
      localObject2 = ((j)localObject2).i();
      localObject1 = paramList.iterator();
      for (paramList = (List)localObject2; ((Iterator)localObject1).hasNext(); paramList = ((d4.s)((Iterator)localObject1).next()).a(paramList)) {}
      return F(paramk, paramList, paramy);
    }
    return Collections.emptyList();
  }
  
  public List H(final k paramk, final b paramb1, b paramb2, final long paramLong, final boolean paramBoolean)
  {
    return (List)g.g(new h(paramBoolean, paramk, paramb1, paramLong, paramb2));
  }
  
  public List I(final k paramk, final n paramn1, n paramn2, final long paramLong, final boolean paramBoolean1, final boolean paramBoolean2)
  {
    boolean bool;
    if ((!paramBoolean1) && (paramBoolean2)) {
      bool = false;
    } else {
      bool = true;
    }
    Y3.m.g(bool, "We shouldn't be persisting non-visible writes.");
    return (List)g.g(new g(paramBoolean2, paramk, paramn1, paramLong, paramn2, paramBoolean1));
  }
  
  public n J(k paramk, List paramList)
  {
    Y3.d locald = a;
    Object localObject1 = (v)locald.getValue();
    k localk1 = k.Y();
    localObject1 = null;
    k localk2 = paramk;
    Object localObject2;
    do
    {
      localObject2 = localk2.Z();
      localk2 = localk2.c0();
      localk1 = localk1.U((d4.b)localObject2);
      k localk3 = k.b0(localk1, paramk);
      if (localObject2 != null) {
        locald = locald.D((d4.b)localObject2);
      } else {
        locald = Y3.d.d();
      }
      v localv = (v)locald.getValue();
      localObject2 = localObject1;
      if (localv != null) {
        localObject2 = localv.d(localk3);
      }
      if (localk2.isEmpty()) {
        break;
      }
      localObject1 = localObject2;
    } while (localObject2 == null);
    return b.d(paramk, (n)localObject2, paramList, true);
  }
  
  public final List K(Y3.d paramd)
  {
    ArrayList localArrayList = new ArrayList();
    L(paramd, localArrayList);
    return localArrayList;
  }
  
  public final void L(Y3.d paramd, List paramList)
  {
    v localv = (v)paramd.getValue();
    if ((localv != null) && (localv.h()))
    {
      paramList.add(localv.e());
    }
    else
    {
      if (localv != null) {
        paramList.addAll(localv.f());
      }
      paramd = paramd.M().iterator();
      while (paramd.hasNext()) {
        L((Y3.d)((Map.Entry)paramd.next()).getValue(), paramList);
      }
    }
  }
  
  public final y M()
  {
    long l = i;
    i = (1L + l);
    return new y(l);
  }
  
  public n N(a4.i parami)
  {
    return (n)g.g(new w(this, parami));
  }
  
  public void O(a4.i parami, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramBoolean1) && (!e.contains(parami)))
    {
      u(new q(parami), paramBoolean2);
      e.add(parami);
    }
    else if ((!paramBoolean1) && (e.contains(parami)))
    {
      W(new q(parami), paramBoolean2);
      e.remove(parami);
    }
  }
  
  public Q3.b Q(p paramp)
  {
    return Q3.k.a(paramp.t(), g.k(paramp.u()).a());
  }
  
  public final a4.i R(a4.i parami)
  {
    a4.i locali = parami;
    if (parami.g())
    {
      locali = parami;
      if (!parami.f()) {
        locali = a4.i.a(parami.e());
      }
    }
    return locali;
  }
  
  public final a4.i S(y paramy)
  {
    return (a4.i)c.get(paramy);
  }
  
  public List T(a4.i parami, Q3.c paramc)
  {
    return X(parami, null, paramc, false);
  }
  
  public List U()
  {
    return (List)g.g(new j());
  }
  
  public List V(h paramh)
  {
    return X(paramh.e(), paramh, null, false);
  }
  
  public List W(h paramh, boolean paramBoolean)
  {
    return X(paramh.e(), paramh, null, paramBoolean);
  }
  
  public final List X(final a4.i parami, final h paramh, final Q3.c paramc, final boolean paramBoolean)
  {
    return (List)g.g(new d(parami, paramh, paramc, paramBoolean));
  }
  
  public final void Y(List paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      a4.i locali = (a4.i)paramList.next();
      if (!locali.g())
      {
        y localy = b0(locali);
        boolean bool;
        if (localy != null) {
          bool = true;
        } else {
          bool = false;
        }
        Y3.m.f(bool);
        d.remove(locali);
        c.remove(localy);
      }
    }
  }
  
  public void Z(final a4.i parami)
  {
    g.g(new b(parami));
  }
  
  public final void a0(a4.i parami, j paramj)
  {
    k localk = parami.e();
    y localy = b0(parami);
    paramj = new r(paramj);
    f.b(R(parami), localy, paramj, paramj);
    parami = a.Y(localk);
    if (localy != null) {
      Y3.m.g(((v)parami.getValue()).h() ^ true, "If we're adding a query, it shouldn't be shadowed");
    } else {
      parami.q(new e());
    }
  }
  
  public y b0(a4.i parami)
  {
    return (y)d.get(parami);
  }
  
  public List s(final long paramLong, boolean paramBoolean1, final boolean paramBoolean2, final Y3.a parama)
  {
    return (List)g.g(new i(paramBoolean2, paramLong, paramBoolean1, parama));
  }
  
  public List t(h paramh)
  {
    return u(paramh, false);
  }
  
  public List u(final h paramh, final boolean paramBoolean)
  {
    return (List)g.g(new c(paramh, paramBoolean));
  }
  
  public List v(final k paramk)
  {
    return (List)g.g(new m(paramk));
  }
  
  public final List w(final W3.d paramd, Y3.d paramd1, final n paramn, final G paramG)
  {
    v localv = (v)paramd1.getValue();
    final n localn = paramn;
    if (paramn == null)
    {
      localn = paramn;
      if (localv != null) {
        localn = localv.d(k.Y());
      }
    }
    paramn = new ArrayList();
    paramd1.M().q(new f(localn, paramG, paramd, paramn));
    if (localv != null) {
      paramn.addAll(localv.b(paramd, paramG, localn));
    }
    return paramn;
  }
  
  public final List x(W3.d paramd, Y3.d paramd1, n paramn, G paramG)
  {
    if (paramd.a().isEmpty()) {
      return w(paramd, paramd1, paramn, paramG);
    }
    v localv = (v)paramd1.getValue();
    n localn = paramn;
    if (paramn == null)
    {
      localn = paramn;
      if (localv != null) {
        localn = localv.d(k.Y());
      }
    }
    ArrayList localArrayList = new ArrayList();
    d4.b localb = paramd.a().Z();
    paramn = paramd.d(localb);
    Y3.d locald = (Y3.d)paramd1.M().d(localb);
    if ((locald != null) && (paramn != null))
    {
      if (localn != null) {
        paramd1 = localn.v(localb);
      } else {
        paramd1 = null;
      }
      localArrayList.addAll(x(paramn, locald, paramd1, paramG.h(localb)));
    }
    if (localv != null) {
      localArrayList.addAll(localv.b(paramd, paramG, localn));
    }
    return localArrayList;
  }
  
  public final List y(W3.d paramd)
  {
    return x(paramd, a, null, b.h(k.Y()));
  }
  
  public List z(final k paramk, final Map paramMap)
  {
    return (List)g.g(new l(paramMap, paramk));
  }
  
  public class a
    implements Callable
  {
    public a(y paramy, k paramk, Map paramMap) {}
    
    public List a()
    {
      a4.i locali = x.l(x.this, paramy);
      if (locali != null)
      {
        k localk = k.b0(locali.e(), paramk);
        Object localObject = b.D(paramMap);
        x.c(x.this).f(paramk, (b)localObject);
        localObject = new W3.c(W3.e.a(locali.d()), localk, (b)localObject);
        return x.m(x.this, locali, (W3.d)localObject);
      }
      return Collections.emptyList();
    }
  }
  
  public class b
    implements Callable
  {
    public b(a4.i parami) {}
    
    public Void a()
    {
      x.c(x.this).m(parami);
      return null;
    }
  }
  
  public class c
    implements Callable
  {
    public c(h paramh, boolean paramBoolean) {}
    
    public List a()
    {
      a4.i locali = paramh.e();
      k localk = locali.e();
      Object localObject1 = x.n(x.this);
      Object localObject2 = null;
      Object localObject3 = localk;
      Object localObject4;
      Object localObject5;
      int j;
      for (int i = 0; !((Y3.d)localObject1).isEmpty(); i = j)
      {
        localObject4 = (v)((Y3.d)localObject1).getValue();
        localObject5 = localObject2;
        j = i;
        if (localObject4 != null)
        {
          if (localObject2 == null) {
            localObject2 = ((v)localObject4).d((k)localObject3);
          }
          if ((i == 0) && (!((v)localObject4).h()))
          {
            j = 0;
            localObject5 = localObject2;
          }
          else
          {
            j = 1;
            localObject5 = localObject2;
          }
        }
        if (((k)localObject3).isEmpty()) {
          localObject2 = d4.b.j("");
        } else {
          localObject2 = ((k)localObject3).Z();
        }
        localObject1 = ((Y3.d)localObject1).D((d4.b)localObject2);
        localObject3 = ((k)localObject3).c0();
        localObject2 = localObject5;
      }
      localObject3 = (v)x.n(x.this).s(localk);
      if (localObject3 == null)
      {
        localObject3 = new v(x.c(x.this));
        localObject1 = x.this;
        x.o((x)localObject1, x.n((x)localObject1).W(localk, localObject3));
        j = i;
      }
      else
      {
        if ((i == 0) && (!((v)localObject3).h())) {
          j = 0;
        } else {
          j = 1;
        }
        if (localObject2 == null) {
          localObject2 = ((v)localObject3).d(k.Y());
        }
      }
      x.c(x.this).m(locali);
      if (localObject2 != null)
      {
        localObject2 = new a4.a(d4.i.f((n)localObject2, locali.c()), true, false);
      }
      else
      {
        localObject1 = x.c(x.this).k(locali);
        if (((a4.a)localObject1).f())
        {
          localObject2 = localObject1;
        }
        else
        {
          localObject2 = d4.g.W();
          localObject5 = x.n(x.this).Y(localk).M().iterator();
          while (((Iterator)localObject5).hasNext())
          {
            localObject4 = (Map.Entry)((Iterator)localObject5).next();
            Object localObject6 = (v)((Y3.d)((Map.Entry)localObject4).getValue()).getValue();
            if (localObject6 != null)
            {
              localObject6 = ((v)localObject6).d(k.Y());
              if (localObject6 != null) {
                localObject2 = ((n)localObject2).N((d4.b)((Map.Entry)localObject4).getKey(), (n)localObject6);
              }
            }
          }
          localObject1 = ((a4.a)localObject1).b().iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject5 = (d4.m)((Iterator)localObject1).next();
            if (!((n)localObject2).Q(((d4.m)localObject5).c())) {
              localObject2 = ((n)localObject2).N(((d4.m)localObject5).c(), ((d4.m)localObject5).d());
            }
          }
          localObject2 = new a4.a(d4.i.f((n)localObject2, locali.c()), false, false);
        }
      }
      boolean bool = ((v)localObject3).k(locali);
      if ((!bool) && (!locali.g()))
      {
        Y3.m.g(x.p(x.this).containsKey(locali) ^ true, "View does not exist but we have a tag");
        localObject1 = x.q(x.this);
        x.p(x.this).put(locali, localObject1);
        x.r(x.this).put(localObject1, locali);
      }
      localObject1 = x.j(x.this).h(localk);
      localObject2 = ((v)localObject3).a(paramh, (G)localObject1, (a4.a)localObject2);
      if ((!bool) && (j == 0) && (!paramBoolean))
      {
        localObject3 = ((v)localObject3).l(locali);
        x.d(x.this, locali, (j)localObject3);
      }
      return (List)localObject2;
    }
  }
  
  public class d
    implements Callable
  {
    public d(a4.i parami, h paramh, Q3.c paramc, boolean paramBoolean) {}
    
    public List a()
    {
      Object localObject1 = parami.e();
      Object localObject2 = (v)x.n(x.this).s((k)localObject1);
      Object localObject3 = new ArrayList();
      Object localObject4 = localObject3;
      if (localObject2 != null) {
        if (!parami.f())
        {
          localObject4 = localObject3;
          if (!((v)localObject2).k(parami)) {}
        }
        else
        {
          localObject4 = ((v)localObject2).j(parami, paramh, paramc);
          if (((v)localObject2).i())
          {
            localObject3 = x.this;
            x.o((x)localObject3, x.n((x)localObject3).U((k)localObject1));
          }
          List localList = (List)((Y3.g)localObject4).a();
          localObject3 = (List)((Y3.g)localObject4).b();
          localObject2 = localList.iterator();
          for (int i = 0;; i = 1)
          {
            if (!((Iterator)localObject2).hasNext()) {
              break label190;
            }
            localObject4 = (a4.i)((Iterator)localObject2).next();
            x.c(x.this).i(parami);
            if ((i == 0) && (!((a4.i)localObject4).g())) {
              break;
            }
          }
          label190:
          if (paramBoolean) {
            return null;
          }
          localObject4 = x.n(x.this);
          int j;
          if ((((Y3.d)localObject4).getValue() != null) && (((v)((Y3.d)localObject4).getValue()).h())) {
            j = 1;
          } else {
            j = 0;
          }
          Iterator localIterator = ((k)localObject1).iterator();
          int m;
          do
          {
            k = j;
            if (!localIterator.hasNext()) {
              break;
            }
            localObject2 = ((Y3.d)localObject4).D((d4.b)localIterator.next());
            if ((j == 0) && ((((Y3.d)localObject2).getValue() == null) || (!((v)((Y3.d)localObject2).getValue()).h()))) {
              m = 0;
            } else {
              m = 1;
            }
            k = m;
            if (m != 0) {
              break;
            }
            localObject4 = localObject2;
            j = m;
          } while (!((Y3.d)localObject2).isEmpty());
          int k = m;
          if ((i != 0) && (k == 0))
          {
            localObject4 = x.n(x.this).Y((k)localObject1);
            if (!((Y3.d)localObject4).isEmpty())
            {
              localObject2 = x.e(x.this, (Y3.d)localObject4).iterator();
              while (((Iterator)localObject2).hasNext())
              {
                localObject1 = (j)((Iterator)localObject2).next();
                localObject4 = new x.r(x.this, (j)localObject1);
                localObject1 = ((j)localObject1).h();
                x.g(x.this).b(x.f(x.this, (a4.i)localObject1), x.r.e((x.r)localObject4), (T3.g)localObject4, (x.p)localObject4);
              }
            }
          }
          if ((k == 0) && (!localList.isEmpty()) && (paramc == null)) {
            if (i != 0)
            {
              x.g(x.this).a(x.f(x.this, parami), null);
            }
            else
            {
              localObject4 = localList.iterator();
              while (((Iterator)localObject4).hasNext())
              {
                localObject1 = (a4.i)((Iterator)localObject4).next();
                localObject2 = b0((a4.i)localObject1);
                boolean bool;
                if (localObject2 != null) {
                  bool = true;
                } else {
                  bool = false;
                }
                Y3.m.f(bool);
                x.g(x.this).a(x.f(x.this, (a4.i)localObject1), (y)localObject2);
              }
            }
          }
          x.h(x.this, localList);
          localObject4 = localObject3;
        }
      }
      return (List)localObject4;
    }
  }
  
  public class e
    implements d.c
  {
    public e() {}
    
    public Void b(k paramk, v paramv, Void paramVoid)
    {
      if ((!paramk.isEmpty()) && (paramv.h()))
      {
        paramk = paramv.e().h();
        x.g(x.this).a(x.f(x.this, paramk), b0(paramk));
      }
      else
      {
        paramv = paramv.f().iterator();
        while (paramv.hasNext())
        {
          paramk = ((j)paramv.next()).h();
          x.g(x.this).a(x.f(x.this, paramk), b0(paramk));
        }
      }
      return null;
    }
  }
  
  public class f
    extends h.b
  {
    public f(n paramn, G paramG, W3.d paramd, List paramList) {}
    
    public void b(d4.b paramb, Y3.d paramd)
    {
      n localn = localn;
      if (localn != null) {
        localn = localn.v(paramb);
      } else {
        localn = null;
      }
      G localG = paramG.h(paramb);
      paramb = paramd.d(paramb);
      if (paramb != null) {
        paramn.addAll(x.i(x.this, paramb, paramd, localn, localG));
      }
    }
  }
  
  public class g
    implements Callable
  {
    public g(boolean paramBoolean1, k paramk, n paramn1, long paramLong, n paramn2, boolean paramBoolean2) {}
    
    public List a()
    {
      if (paramBoolean2) {
        x.c(x.this).e(paramk, paramn1, paramLong);
      }
      x.j(x.this).b(paramk, paramBoolean1, Long.valueOf(paramLong), t);
      if (!t) {
        return Collections.emptyList();
      }
      return x.k(x.this, new W3.f(W3.e.d, paramk, paramBoolean1));
    }
  }
  
  public class h
    implements Callable
  {
    public h(boolean paramBoolean, k paramk, b paramb1, long paramLong, b paramb2) {}
    
    public List a()
    {
      if (paramBoolean) {
        x.c(x.this).c(paramk, paramb1, paramLong);
      }
      x.j(x.this).a(paramk, s, Long.valueOf(paramLong));
      return x.k(x.this, new W3.c(W3.e.d, paramk, s));
    }
  }
  
  public class i
    implements Callable
  {
    public i(boolean paramBoolean1, long paramLong, boolean paramBoolean2, Y3.a parama) {}
    
    public List a()
    {
      if (paramBoolean2) {
        x.c(x.this).b(paramLong);
      }
      B localB = x.j(x.this).i(paramLong);
      boolean bool = x.j(x.this).m(paramLong);
      if ((localB.f()) && (!parama))
      {
        localObject1 = s.c(r);
        if (localB.e())
        {
          localObject1 = s.g(localB.b(), x.this, localB.c(), (Map)localObject1);
          x.c(x.this).n(localB.c(), (n)localObject1);
        }
        else
        {
          localObject1 = s.f(localB.a(), x.this, localB.c(), (Map)localObject1);
          x.c(x.this).h(localB.c(), (b)localObject1);
        }
      }
      if (!bool) {
        return Collections.emptyList();
      }
      Object localObject1 = Y3.d.d();
      Object localObject2;
      if (localB.e())
      {
        localObject2 = ((Y3.d)localObject1).W(k.Y(), Boolean.TRUE);
      }
      else
      {
        Iterator localIterator = localB.a().iterator();
        for (;;)
        {
          localObject2 = localObject1;
          if (!localIterator.hasNext()) {
            break;
          }
          localObject1 = ((Y3.d)localObject1).W((k)((Map.Entry)localIterator.next()).getKey(), Boolean.TRUE);
        }
      }
      return x.k(x.this, new W3.a(localB.c(), (Y3.d)localObject2, parama));
    }
  }
  
  public class j
    implements Callable
  {
    public j() {}
    
    public List a()
    {
      x.c(x.this).a();
      if (x.j(x.this).k().isEmpty()) {
        return Collections.emptyList();
      }
      Y3.d locald = new Y3.d(Boolean.TRUE);
      return x.k(x.this, new W3.a(k.Y(), locald, true));
    }
  }
  
  public class k
    implements Callable
  {
    public k(k paramk, n paramn) {}
    
    public List a()
    {
      x.c(x.this).j(a4.i.a(paramk), paramn);
      return x.k(x.this, new W3.f(W3.e.e, paramk, paramn));
    }
  }
  
  public class l
    implements Callable
  {
    public l(Map paramMap, k paramk) {}
    
    public List a()
    {
      b localb = b.D(paramMap);
      x.c(x.this).f(paramk, localb);
      return x.k(x.this, new W3.c(W3.e.e, paramk, localb));
    }
  }
  
  public class m
    implements Callable
  {
    public m(k paramk) {}
    
    public List a()
    {
      x.c(x.this).p(a4.i.a(paramk));
      return x.k(x.this, new W3.b(W3.e.e, paramk));
    }
  }
  
  public class n
    implements Callable
  {
    public n(y paramy) {}
    
    public List a()
    {
      a4.i locali = x.l(x.this, paramy);
      if (locali != null)
      {
        x.c(x.this).p(locali);
        W3.b localb = new W3.b(W3.e.a(locali.d()), k.Y());
        return x.m(x.this, locali, localb);
      }
      return Collections.emptyList();
    }
  }
  
  public class o
    implements Callable
  {
    public o(y paramy, k paramk, n paramn) {}
    
    public List a()
    {
      a4.i locali = x.l(x.this, paramy);
      if (locali != null)
      {
        k localk = k.b0(locali.e(), paramk);
        if (localk.isEmpty()) {
          localObject = locali;
        } else {
          localObject = a4.i.a(paramk);
        }
        x.c(x.this).j((a4.i)localObject, paramn);
        Object localObject = new W3.f(W3.e.a(locali.d()), localk, paramn);
        return x.m(x.this, locali, (W3.d)localObject);
      }
      return Collections.emptyList();
    }
  }
  
  public static abstract interface p
  {
    public abstract List a(Q3.c paramc);
  }
  
  public static class q
    extends h
  {
    public a4.i d;
    
    public q(a4.i parami)
    {
      d = parami;
    }
    
    public h a(a4.i parami)
    {
      return new q(parami);
    }
    
    public a4.d b(a4.c paramc, a4.i parami)
    {
      return null;
    }
    
    public void c(Q3.c paramc) {}
    
    public void d(a4.d paramd) {}
    
    public a4.i e()
    {
      return d;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool;
      if (((paramObject instanceof q)) && (d.equals(d))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean f(h paramh)
    {
      return paramh instanceof q;
    }
    
    public int hashCode()
    {
      return d.hashCode();
    }
    
    public boolean i(e.a parama)
    {
      return false;
    }
  }
  
  public class r
    implements T3.g, x.p
  {
    public final j a;
    public final y b;
    
    public r(j paramj)
    {
      a = paramj;
      b = b0(paramj.h());
    }
    
    public List a(Q3.c paramc)
    {
      if (paramc == null)
      {
        paramc = a.h();
        localObject = b;
        if (localObject != null) {
          return C((y)localObject);
        }
        return v(paramc.e());
      }
      c4.c localc = x.b(x.this);
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Listen at ");
      ((StringBuilder)localObject).append(a.h().e());
      ((StringBuilder)localObject).append(" failed: ");
      ((StringBuilder)localObject).append(paramc.toString());
      localc.i(((StringBuilder)localObject).toString());
      return T(a.h(), paramc);
    }
    
    public T3.a b()
    {
      d4.d locald = d4.d.b(a.i());
      Object localObject = locald.e();
      ArrayList localArrayList = new ArrayList(((List)localObject).size());
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        localArrayList.add(((k)((Iterator)localObject).next()).S());
      }
      return new T3.a(localArrayList, locald.d());
    }
    
    public boolean c()
    {
      boolean bool;
      if (Y3.e.b(a.i()) > 1024L) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public String d()
    {
      return a.i().R();
    }
  }
  
  public static abstract interface s
  {
    public abstract void a(a4.i parami, y paramy);
    
    public abstract void b(a4.i parami, y paramy, T3.g paramg, x.p paramp);
  }
}

/* Location:
 * Qualified Name:     V3.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */