package nb;

import eb.a.b;
import eb.d.a;
import eb.e1;
import eb.h;
import eb.h.a;
import eb.h.b;
import eb.h1;
import eb.h1.b;
import eb.h1.c;
import eb.i1;
import eb.k0;
import eb.k0.b;
import eb.k0.b.a;
import eb.k0.e;
import eb.k0.f;
import eb.k0.g;
import eb.k0.h;
import eb.k0.i;
import eb.k0.j;
import eb.k0.k;
import eb.n;
import eb.o;
import eb.s0;
import eb.u;
import f;
import gb.g3.b;
import gb.o3;
import gb.o3.a;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import o7.p;
import o7.t;
import o7.t.a;

public final class i
  extends k0
{
  public static final a.b<a> n = new a.b("addressTrackerKey");
  public final b f;
  public final h1 g;
  public final e h;
  public o3 i;
  public final ScheduledExecutorService j;
  public h1.c k;
  public Long l;
  public final eb.d m;
  
  public i(k0.e parame)
  {
    eb.d locald = parame.b();
    m = locald;
    h = new e(new c(parame));
    f = new b();
    h1 localh1 = parame.d();
    x6.b.y(localh1, "syncContext");
    g = localh1;
    parame = parame.c();
    x6.b.y(parame, "timeService");
    j = parame;
    i = locala;
    locald.a(d.a.a, "OutlierDetection lb created.");
  }
  
  public static boolean g(List paramList)
  {
    paramList = paramList.iterator();
    boolean bool = false;
    int i1 = 0;
    while (paramList.hasNext())
    {
      int i2 = i1 + nexta.size();
      i1 = i2;
      if (i2 > 1) {
        return bool;
      }
    }
    bool = true;
    return bool;
  }
  
  public static ArrayList h(b paramb, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramb.values().iterator();
    while (localIterator.hasNext())
    {
      paramb = (a)localIterator.next();
      if (paramb.c() >= paramInt) {
        localArrayList.add(paramb);
      }
    }
    return localArrayList;
  }
  
  public final e1 a(k0.h paramh)
  {
    Object localObject1 = m;
    Object localObject2 = d.a.a;
    int i1 = 1;
    ((eb.d)localObject1).b((d.a)localObject2, "Received resolution result: {0}", new Object[] { paramh });
    localObject1 = (f)c;
    Object localObject3 = new ArrayList();
    localObject2 = a.iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((ArrayList)localObject3).addAll(nexta);
    }
    f.keySet().retainAll((Collection)localObject3);
    localObject2 = f.a.values().iterator();
    while (((Iterator)localObject2).hasNext()) {
      nexta = ((f)localObject1);
    }
    localObject2 = f;
    localObject2.getClass();
    Object localObject4 = ((ArrayList)localObject3).iterator();
    while (((Iterator)localObject4).hasNext())
    {
      localObject3 = (SocketAddress)((Iterator)localObject4).next();
      if (!a.containsKey(localObject3)) {
        a.put(localObject3, new a((f)localObject1));
      }
    }
    h.i(g.a);
    int i2 = i1;
    if (e == null) {
      if (f != null) {
        i2 = i1;
      } else {
        i2 = 0;
      }
    }
    if (i2 != 0)
    {
      if (l == null) {
        localObject2 = a;
      } else {
        localObject2 = Long.valueOf(Math.max(0L, a.longValue() - (i.a() - l.longValue())));
      }
      localObject3 = k;
      if (localObject3 != null)
      {
        ((h1.c)localObject3).a();
        localObject3 = f.a.values().iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject4 = (a)((Iterator)localObject3).next();
          localObject5 = b;
          a.set(0L);
          b.set(0L);
          localObject4 = c;
          a.set(0L);
          b.set(0L);
        }
      }
      localObject3 = g;
      localObject4 = new d((f)localObject1, m);
      long l1 = ((Long)localObject2).longValue();
      long l2 = a.longValue();
      localObject2 = TimeUnit.NANOSECONDS;
      ScheduledExecutorService localScheduledExecutorService = j;
      localObject3.getClass();
      Object localObject5 = new h1.b((Runnable)localObject4);
      k = new h1.c((h1.b)localObject5, localScheduledExecutorService.scheduleWithFixedDelay(new i1((h1)localObject3, (h1.b)localObject5, (d)localObject4, l2), l1, l2, (TimeUnit)localObject2));
    }
    else
    {
      localObject2 = k;
      if (localObject2 != null)
      {
        ((h1.c)localObject2).a();
        l = null;
        localObject3 = f.a.values().iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject2 = (a)((Iterator)localObject3).next();
          if (((a)localObject2).d()) {
            ((a)localObject2).e();
          }
          e = 0;
        }
      }
    }
    localObject2 = h;
    localObject3 = eb.a.b;
    ((b)localObject2).d(new k0.h(a, b, g.b));
    return e1.e;
  }
  
  public final void c(e1 parame1)
  {
    h.c(parame1);
  }
  
  public final void f()
  {
    h.f();
  }
  
  public static final class a
  {
    public i.f a;
    public volatile a b = new a();
    public a c = new a();
    public Long d;
    public int e;
    public final HashSet f = new HashSet();
    
    public a(i.f paramf)
    {
      a = paramf;
    }
    
    public final void a(i.h paramh)
    {
      if ((d()) && (!c))
      {
        paramh.k();
      }
      else if ((!d()) && (c))
      {
        c = false;
        o localo = d;
        if (localo != null)
        {
          e.a(localo);
          f.b(d.a.b, "Subchannel unejected: {0}", new Object[] { paramh });
        }
      }
      b = this;
      f.add(paramh);
    }
    
    public final void b(long paramLong)
    {
      d = Long.valueOf(paramLong);
      e += 1;
      Iterator localIterator = f.iterator();
      while (localIterator.hasNext()) {
        ((i.h)localIterator.next()).k();
      }
    }
    
    public final long c()
    {
      long l = c.a.get();
      return c.b.get() + l;
    }
    
    public final boolean d()
    {
      boolean bool;
      if (d != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final void e()
    {
      boolean bool;
      if (d != null) {
        bool = true;
      } else {
        bool = false;
      }
      x6.b.I(bool, "not currently ejected");
      d = null;
      Iterator localIterator = f.iterator();
      while (localIterator.hasNext())
      {
        i.h localh = (i.h)localIterator.next();
        c = false;
        o localo = d;
        if (localo != null)
        {
          e.a(localo);
          f.b(d.a.b, "Subchannel unejected: {0}", new Object[] { localh });
        }
      }
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("AddressTracker{subchannels=");
      localStringBuilder.append(f);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
    
    public static final class a
    {
      public AtomicLong a = new AtomicLong();
      public AtomicLong b = new AtomicLong();
    }
  }
  
  public static final class b
    extends p<SocketAddress, i.a>
  {
    public final HashMap a = new HashMap();
    
    public final Object b()
    {
      return a;
    }
    
    public final Map<SocketAddress, i.a> c()
    {
      return a;
    }
    
    public final double d()
    {
      if (a.isEmpty()) {
        return 0.0D;
      }
      Iterator localIterator = a.values().iterator();
      int i = 0;
      int j = 0;
      while (localIterator.hasNext())
      {
        i.a locala = (i.a)localIterator.next();
        int k = j + 1;
        j = k;
        if (locala.d())
        {
          i++;
          j = k;
        }
      }
      return i / j * 100.0D;
    }
  }
  
  public final class c
    extends c
  {
    public g a;
    
    public c(k0.e parame)
    {
      a = new g(parame);
    }
    
    public final k0.i a(k0.b paramb)
    {
      i.h localh = new i.h(i.this, paramb, a);
      paramb = a;
      if ((i.g(paramb)) && (f.containsKey(get0a.get(0))))
      {
        paramb = (i.a)f.get(get0a.get(0));
        paramb.a(localh);
        if (d != null) {
          localh.k();
        }
      }
      return localh;
    }
    
    public final void f(n paramn, k0.j paramj)
    {
      a.f(paramn, new i.g(paramj));
    }
    
    public final k0.e g()
    {
      return a;
    }
  }
  
  public final class d
    implements Runnable
  {
    public i.f a;
    public eb.d b;
    
    public d(i.f paramf, eb.d paramd)
    {
      a = paramf;
      b = paramd;
    }
    
    public final void run()
    {
      Object localObject1 = i.this;
      l = Long.valueOf(i.a());
      localObject1 = f.a.values().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (i.a)((Iterator)localObject1).next();
        localObject3 = c;
        a.set(0L);
        b.set(0L);
        localObject3 = b;
        b = c;
        c = ((i.a.a)localObject3);
      }
      Object localObject2 = a;
      localObject1 = b;
      Object localObject3 = t.b;
      localObject3 = new t.a();
      if (e != null) {
        ((t.a)localObject3).c(new i.j((i.f)localObject2, (eb.d)localObject1));
      }
      if (f != null) {
        ((t.a)localObject3).c(new i.e((i.f)localObject2, (eb.d)localObject1));
      }
      localObject2 = ((t.a)localObject3).e().r(0);
      while (((o7.a)localObject2).hasNext())
      {
        localObject1 = (i.i)((o7.a)localObject2).next();
        localObject3 = i.this;
        ((i.i)localObject1).a(f, l.longValue());
      }
      localObject1 = i.this;
      localObject2 = f;
      localObject1 = l;
      localObject3 = a.values().iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject2 = (i.a)((Iterator)localObject3).next();
        int i;
        if (!((i.a)localObject2).d())
        {
          i = e;
          if (i == 0) {
            i = 0;
          } else {
            i--;
          }
          e = i;
        }
        if (((i.a)localObject2).d())
        {
          long l1 = ((Long)localObject1).longValue();
          long l2 = Math.max(a.b.longValue(), a.c.longValue());
          long l3 = d.longValue();
          if (l1 > Math.min(a.b.longValue() * e, l2) + l3) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0) {
            ((i.a)localObject2).e();
          }
        }
      }
    }
  }
  
  public static final class e
    implements i.i
  {
    public final i.f a;
    public final eb.d b;
    
    public e(i.f paramf, eb.d paramd)
    {
      a = paramf;
      b = paramd;
    }
    
    public final void a(i.b paramb, long paramLong)
    {
      Object localObject = i.h(paramb, a.f.d.intValue());
      if ((((ArrayList)localObject).size() >= a.f.c.intValue()) && (((ArrayList)localObject).size() != 0))
      {
        localObject = ((ArrayList)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          i.a locala = (i.a)((Iterator)localObject).next();
          if (paramb.d() >= a.d.intValue()) {
            return;
          }
          if (locala.c() >= a.f.d.intValue())
          {
            double d = a.f.a.intValue() / 100.0D;
            if (c.b.get() / locala.c() > d)
            {
              b.b(d.a.a, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", new Object[] { locala, Double.valueOf(c.b.get() / locala.c()) });
              if (new Random().nextInt(100) < a.f.b.intValue()) {
                locala.b(paramLong);
              }
            }
          }
        }
      }
    }
  }
  
  public static final class f
  {
    public final Long a;
    public final Long b;
    public final Long c;
    public final Integer d;
    public final b e;
    public final a f;
    public final g3.b g;
    
    public f(Long paramLong1, Long paramLong2, Long paramLong3, Integer paramInteger, b paramb, a parama, g3.b paramb1)
    {
      a = paramLong1;
      b = paramLong2;
      c = paramLong3;
      d = paramInteger;
      e = paramb;
      f = parama;
      g = paramb1;
    }
    
    public static final class a
    {
      public final Integer a;
      public final Integer b;
      public final Integer c;
      public final Integer d;
      
      public a(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, Integer paramInteger4)
      {
        a = paramInteger1;
        b = paramInteger2;
        c = paramInteger3;
        d = paramInteger4;
      }
    }
    
    public static final class b
    {
      public final Integer a;
      public final Integer b;
      public final Integer c;
      public final Integer d;
      
      public b(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, Integer paramInteger4)
      {
        a = paramInteger1;
        b = paramInteger2;
        c = paramInteger3;
        d = paramInteger4;
      }
    }
  }
  
  public final class g
    extends k0.j
  {
    public g() {}
    
    public final k0.f a(k0.g paramg)
    {
      k0.f localf = i.this.a(paramg);
      k0.i locali = a;
      paramg = localf;
      if (locali != null) {
        paramg = k0.f.b(locali, new a((i.a)locali.c().a(i.n), b));
      }
      return paramg;
    }
    
    public final class a
      extends h.a
    {
      public final h.a b;
      
      public a(h.a parama)
      {
        b = parama;
      }
      
      public final h a(h.b paramb, s0 params0)
      {
        h.a locala = b;
        if (locala != null) {
          return new a(locala.a(paramb, params0));
        }
        return new b();
      }
      
      public final class a
        extends a
      {
        public a(h paramh) {}
        
        public final void o(e1 parame1)
        {
          i.a locala = i.g.this;
          boolean bool = parame1.e();
          Object localObject = a;
          if ((e != null) || (f != null))
          {
            localObject = b;
            if (bool) {
              localObject = a;
            } else {
              localObject = b;
            }
            ((AtomicLong)localObject).getAndIncrement();
          }
          c.o(parame1);
        }
      }
      
      public final class b
        extends h
      {
        public b() {}
        
        public final void o(e1 parame1)
        {
          i.a locala = i.g.this;
          boolean bool = parame1.e();
          parame1 = a;
          if ((e != null) || (f != null))
          {
            if (bool) {
              parame1 = b.a;
            } else {
              parame1 = b.b;
            }
            parame1.getAndIncrement();
          }
        }
      }
    }
  }
  
  public final class h
    extends d
  {
    public final k0.i a;
    public i.a b;
    public boolean c;
    public o d;
    public k0.k e;
    public final eb.d f;
    
    public h(k0.b paramb, g paramg)
    {
      this$1 = k0.b;
      Object localObject1 = (k0.k)paramb.a();
      this$1 = paramb;
      if (localObject1 != null)
      {
        e = ((k0.k)localObject1);
        localObject1 = new a((k0.k)localObject1);
        this$1 = new k0.b.a();
        b(a);
        Object localObject2 = b;
        x6.b.y(localObject2, "attrs");
        b = ((eb.a)localObject2);
        paramb = c;
        localObject2 = new Object[paramb.length][2];
        c = ((Object[][])localObject2);
        System.arraycopy(paramb, 0, localObject2, 0, paramb.length);
        a((k0.k)localObject1);
        this$1 = new k0.b(a, b, c);
      }
      this$1 = paramg.a(i.this);
      a = i.this;
      f = d();
    }
    
    public final eb.a c()
    {
      if (b != null)
      {
        Object localObject1 = a.c();
        localObject1.getClass();
        a.b localb = i.n;
        Object localObject2 = b;
        IdentityHashMap localIdentityHashMap = new IdentityHashMap(1);
        localIdentityHashMap.put(localb, localObject2);
        localObject1 = a.entrySet().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (Map.Entry)((Iterator)localObject1).next();
          if (!localIdentityHashMap.containsKey(((Map.Entry)localObject2).getKey())) {
            localIdentityHashMap.put((a.b)((Map.Entry)localObject2).getKey(), ((Map.Entry)localObject2).getValue());
          }
        }
        return new eb.a(localIdentityHashMap);
      }
      return a.c();
    }
    
    public final void g()
    {
      i.a locala = b;
      if (locala != null)
      {
        b = null;
        f.remove(this);
      }
      super.g();
    }
    
    public final void h(k0.k paramk)
    {
      if (e != null)
      {
        j().h(paramk);
      }
      else
      {
        e = paramk;
        paramk = new a(paramk);
        j().h(paramk);
      }
    }
    
    public final void i(List<u> paramList)
    {
      Object localObject;
      if ((i.g(b())) && (i.g(paramList)))
      {
        if (f.containsValue(b))
        {
          localObject = b;
          localObject.getClass();
          b = null;
          f.remove(this);
        }
        localObject = (SocketAddress)get0a.get(0);
        if (!f.containsKey(localObject)) {
          break label304;
        }
      }
      else
      {
        if ((i.g(b())) && (!i.g(paramList)))
        {
          if (!f.containsKey(aa.get(0))) {
            break label304;
          }
          i.a locala = (i.a)f.get(aa.get(0));
          locala.getClass();
          b = null;
          f.remove(this);
          localObject = b;
          a.set(0L);
          b.set(0L);
          localObject = c;
          a.set(0L);
          b.set(0L);
          break label304;
        }
        if ((i.g(b())) || (!i.g(paramList))) {
          break label304;
        }
        localObject = (SocketAddress)get0a.get(0);
        if (!f.containsKey(localObject)) {
          break label304;
        }
      }
      ((i.a)f.get(localObject)).a(this);
      label304:
      a.i(paramList);
    }
    
    public final k0.i j()
    {
      return a;
    }
    
    public final void k()
    {
      c = true;
      k0.k localk = e;
      e1 locale1 = e1.n;
      x6.b.s("The error status must not be OK", locale1.e() ^ true);
      localk.a(new o(n.c, locale1));
      f.b(d.a.b, "Subchannel ejected: {0}", new Object[] { this });
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("OutlierDetectionSubchannel{addresses=");
      localStringBuilder.append(a.b());
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
    
    public final class a
      implements k0.k
    {
      public final k0.k a;
      
      public a(k0.k paramk)
      {
        a = paramk;
      }
      
      public final void a(o paramo)
      {
        i.h localh = i.h.this;
        d = paramo;
        if (!c) {
          a.a(paramo);
        }
      }
    }
  }
  
  public static abstract interface i
  {
    public abstract void a(i.b paramb, long paramLong);
  }
  
  public static final class j
    implements i.i
  {
    public final i.f a;
    public final eb.d b;
    
    public j(i.f paramf, eb.d paramd)
    {
      boolean bool;
      if (e != null) {
        bool = true;
      } else {
        bool = false;
      }
      x6.b.s("success rate ejection config is null", bool);
      a = paramf;
      b = paramd;
    }
    
    public final void a(i.b paramb, long paramLong)
    {
      Object localObject1 = i.h(paramb, a.e.d.intValue());
      if ((((ArrayList)localObject1).size() >= a.e.c.intValue()) && (((ArrayList)localObject1).size() != 0))
      {
        Object localObject2 = new ArrayList();
        Iterator localIterator = ((ArrayList)localObject1).iterator();
        while (localIterator.hasNext())
        {
          localObject3 = (i.a)localIterator.next();
          ((ArrayList)localObject2).add(Double.valueOf(c.a.get() / ((i.a)localObject3).c()));
        }
        Object localObject3 = ((ArrayList)localObject2).iterator();
        double d1 = 0.0D;
        for (double d2 = 0.0D; ((Iterator)localObject3).hasNext(); d2 += ((Double)((Iterator)localObject3).next()).doubleValue()) {}
        double d3 = d2 / ((ArrayList)localObject2).size();
        localObject3 = ((ArrayList)localObject2).iterator();
        for (d2 = d1; ((Iterator)localObject3).hasNext(); d2 += d1 * d1) {
          d1 = ((Double)((Iterator)localObject3).next()).doubleValue() - d3;
        }
        d1 = Math.sqrt(d2 / ((ArrayList)localObject2).size());
        d2 = d3 - a.e.a.intValue() / 1000.0F * d1;
        localObject1 = ((ArrayList)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (i.a)((Iterator)localObject1).next();
          if (paramb.d() >= a.d.intValue()) {
            return;
          }
          if (c.a.get() / ((i.a)localObject2).c() < d2)
          {
            b.b(d.a.a, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", new Object[] { localObject2, Double.valueOf(c.a.get() / ((i.a)localObject2).c()), Double.valueOf(d3), Double.valueOf(d1), Double.valueOf(d2) });
            if (new Random().nextInt(100) < a.e.b.intValue()) {
              ((i.a)localObject2).b(paramLong);
            }
          }
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     nb.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */