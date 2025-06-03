package T3;

import U3.a.b;
import V2.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class n
  implements b.a, h
{
  public static long H;
  public String A;
  public long B = 0L;
  public int C = 0;
  public int D = 0;
  public ScheduledFuture E = null;
  public long F;
  public boolean G;
  public final h.a a;
  public final f b;
  public String c;
  public HashSet d = new HashSet();
  public boolean e = true;
  public long f;
  public b g;
  public k h = k.o;
  public long i = 0L;
  public long j = 0L;
  public long k = 0L;
  public Map l;
  public List m;
  public Map n;
  public Map o;
  public Map p;
  public String q;
  public boolean r;
  public String s;
  public boolean t;
  public final c u;
  public final d v;
  public final d w;
  public final ScheduledExecutorService x;
  public final c4.c y;
  public final U3.a z;
  
  public n(c paramc, f paramf, h.a parama)
  {
    a = parama;
    u = paramc;
    parama = paramc.e();
    x = parama;
    v = paramc.c();
    w = paramc.a();
    b = paramf;
    p = new HashMap();
    l = new HashMap();
    n = new HashMap();
    o = new ConcurrentHashMap();
    m = new ArrayList();
    z = new a.b(parama, paramc.f(), "ConnectionRetryHelper").d(1000L).e(1.3D).c(30000L).b(0.7D).a();
    long l1 = H;
    H = 1L + l1;
    paramf = paramc.f();
    paramc = new StringBuilder();
    paramc.append("pc_");
    paramc.append(l1);
    y = new c4.c(paramf, "PersistentConnection", paramc.toString());
    A = null;
    U();
  }
  
  public final void A0(String paramString, List paramList, Object paramObject, final p paramp)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("p", e.d(paramList));
    localHashMap.put("d", paramObject);
    t0(paramString, localHashMap, new c(paramp));
  }
  
  public final void B0(final long paramLong)
  {
    e.b(R(), "sendPut called when we can't send writes (we're disconnected or writes are paused).", new Object[0]);
    o localo = (o)n.get(Long.valueOf(paramLong));
    final p localp = localo.c();
    final String str = localo.b();
    localo.e();
    t0(str, localo.d(), new e(str, paramLong, localo, localp));
  }
  
  public final void C0(String paramString, boolean paramBoolean, Map paramMap, j paramj)
  {
    long l1 = h0();
    HashMap localHashMap = new HashMap();
    localHashMap.put("r", Long.valueOf(l1));
    localHashMap.put("a", paramString);
    localHashMap.put("b", paramMap);
    g.m(localHashMap, paramBoolean);
    l.put(Long.valueOf(l1), paramj);
  }
  
  public final void D0(Map paramMap)
  {
    if (!paramMap.isEmpty())
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("c", paramMap);
      t0("s", localHashMap, new h());
    }
    else if (y.f())
    {
      y.b("Not sending stats because stats are empty", new Object[0]);
    }
  }
  
  public final void E0(n paramn)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("p", e.d(p.a(n.a(paramn))));
    Long localLong = paramn.e();
    if (localLong != null)
    {
      localHashMap.put("q", p.b(paramn.d()));
      localHashMap.put("t", localLong);
    }
    t0("n", localHashMap, null);
  }
  
  public boolean F0()
  {
    boolean bool;
    if (d.size() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void G0()
  {
    if (F0())
    {
      k localk = h;
      if (localk == k.o) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      e.b(bool1, "Not in disconnected state: %s", new Object[] { localk });
      boolean bool1 = r;
      boolean bool2 = t;
      y.b("Scheduling connection attempt", new Object[0]);
      r = false;
      t = false;
      z.c(new i(this, bool1, bool2));
    }
  }
  
  public final void H0(List paramList, p paramp)
  {
    if (paramList.contains("no_index"))
    {
      paramList = new StringBuilder();
      paramList.append("\".indexOn\": \"");
      paramList.append(p.b(paramp).get("i"));
      paramList.append('"');
      paramList = paramList.toString();
      c4.c localc = y;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Using an unspecified index. Your data will be downloaded and filtered on the client. Consider adding '");
      localStringBuilder.append(paramList);
      localStringBuilder.append("' at ");
      localStringBuilder.append(e.d(p.a(paramp)));
      localStringBuilder.append(" to your security and Firebase Database rules for better performance");
      localc.i(localStringBuilder.toString());
    }
  }
  
  public final boolean Q()
  {
    boolean bool;
    if (h == k.s) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean R()
  {
    boolean bool;
    if (h == k.s) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void S()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = n.entrySet().iterator();
    while (localIterator.hasNext())
    {
      localObject = (o)((Map.Entry)localIterator.next()).getValue();
      if ((((o)localObject).d().containsKey("h")) && (((o)localObject).f()))
      {
        localArrayList.add(localObject);
        localIterator.remove();
      }
    }
    Object localObject = localArrayList.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((o)((Iterator)localObject).next()).c().a("disconnected", null);
    }
  }
  
  public final boolean T()
  {
    k localk = h;
    boolean bool;
    if ((localk != k.r) && (localk != k.s)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final void U()
  {
    if (a0())
    {
      ScheduledFuture localScheduledFuture = E;
      if (localScheduledFuture != null) {
        localScheduledFuture.cancel(false);
      }
      E = x.schedule(new i(), 60000L, TimeUnit.MILLISECONDS);
    }
    else if (b0("connection_idle"))
    {
      e.a(a0() ^ true);
      p("connection_idle");
    }
  }
  
  public final V2.j V(boolean paramBoolean)
  {
    final k localk = new k();
    y.b("Trying to fetch app check token", new Object[0]);
    w.a(paramBoolean, new b(localk));
    return localk.a();
  }
  
  public final V2.j W(boolean paramBoolean)
  {
    final k localk = new k();
    y.b("Trying to fetch auth token", new Object[0]);
    v.a(paramBoolean, new a(localk));
    return localk.a();
  }
  
  public final Map X(List paramList, Object paramObject, String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("p", e.d(paramList));
    localHashMap.put("d", paramObject);
    if (paramString != null) {
      localHashMap.put("h", paramString);
    }
    return localHashMap;
  }
  
  public final void Y(long paramLong)
  {
    if (y.f()) {
      y.b("handling timestamp", new Object[0]);
    }
    long l1 = System.currentTimeMillis();
    HashMap localHashMap = new HashMap();
    localHashMap.put("serverTimeOffset", Long.valueOf(paramLong - l1));
    a.b(localHashMap);
  }
  
  public final boolean Z()
  {
    long l1 = System.currentTimeMillis();
    boolean bool;
    if ((a0()) && (l1 > F + 60000L)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void a()
  {
    G0();
  }
  
  public final boolean a0()
  {
    boolean bool;
    if ((p.isEmpty()) && (o.isEmpty()) && (l.isEmpty()) && (!G) && (n.isEmpty())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void b(List paramList, Map paramMap, p paramp)
  {
    G = true;
    if (R()) {
      A0("om", paramList, paramMap, paramp);
    } else {
      m.add(new l("om", paramList, paramMap, paramp, null));
    }
    U();
  }
  
  public boolean b0(String paramString)
  {
    return d.contains(paramString);
  }
  
  public void c(long paramLong, String paramString)
  {
    if (y.f()) {
      y.b("onReady", new Object[0]);
    }
    f = System.currentTimeMillis();
    Y(paramLong);
    if (e) {
      x0();
    }
    s0();
    e = false;
    A = paramString;
    a.a();
  }
  
  public V2.j d(List paramList, Map paramMap)
  {
    p localp = new p(paramList, paramMap);
    paramList = new k();
    long l1 = j;
    j = (1L + l1);
    paramMap = new HashMap();
    paramMap.put("p", e.d(p.a(localp)));
    paramMap.put("q", p.b(localp));
    paramMap = new m("g", paramMap, new j(paramList), null);
    o.put(Long.valueOf(l1), paramMap);
    if (Q()) {
      y0(Long.valueOf(l1));
    }
    U();
    return paramList.a();
  }
  
  public void e()
  {
    Iterator localIterator = n.values().iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (o)localIterator.next();
      if (o.a((o)localObject) != null) {
        o.a((o)localObject).a("write_canceled", null);
      }
    }
    localIterator = m.iterator();
    while (localIterator.hasNext())
    {
      localObject = (l)localIterator.next();
      if (l.a((l)localObject) != null) {
        l.a((l)localObject).a("write_canceled", null);
      }
    }
    n.clear();
    m.clear();
    if (!T()) {
      G = false;
    }
    U();
  }
  
  public void f(List paramList, Map paramMap, p paramp)
  {
    o0("m", paramList, paramMap, null, paramp);
  }
  
  public void g(b.b paramb)
  {
    boolean bool = y.f();
    int i1 = 0;
    if (bool)
    {
      c4.c localc = y;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Got on disconnect due to ");
      localStringBuilder.append(paramb.name());
      localc.b(localStringBuilder.toString(), new Object[0]);
    }
    h = k.o;
    g = null;
    G = false;
    l.clear();
    S();
    if (F0())
    {
      long l1 = System.currentTimeMillis();
      long l2 = f;
      int i2 = i1;
      if (l2 > 0L)
      {
        i2 = i1;
        if (l1 - l2 > 30000L) {
          i2 = 1;
        }
      }
      if ((paramb == b.b.o) || (i2 != 0)) {
        z.e();
      }
      G0();
    }
    f = 0L;
    a.d();
  }
  
  public void h(List paramList, Object paramObject, p paramp)
  {
    G = true;
    if (R()) {
      A0("o", paramList, paramObject, paramp);
    } else {
      m.add(new l("o", paramList, paramObject, paramp, null));
    }
    U();
  }
  
  public final long h0()
  {
    long l1 = k;
    k = (1L + l1);
    return l1;
  }
  
  public void i(Map paramMap)
  {
    Object localObject;
    if (paramMap.containsKey("r"))
    {
      long l1 = ((Integer)paramMap.get("r")).intValue();
      localObject = (j)l.remove(Long.valueOf(l1));
      if (localObject != null) {
        ((j)localObject).a((Map)paramMap.get("b"));
      }
    }
    else if (!paramMap.containsKey("error"))
    {
      if (paramMap.containsKey("a"))
      {
        k0((String)paramMap.get("a"), (Map)paramMap.get("b"));
      }
      else if (y.f())
      {
        localObject = y;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Ignoring unknown message: ");
        localStringBuilder.append(paramMap);
        ((c4.c)localObject).b(localStringBuilder.toString(), new Object[0]);
      }
    }
  }
  
  public final void i0(String paramString1, String paramString2)
  {
    c4.c localc = y;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("App check token revoked: ");
    localStringBuilder.append(paramString1);
    localStringBuilder.append(" (");
    localStringBuilder.append(paramString2);
    localStringBuilder.append(")");
    localc.b(localStringBuilder.toString(), new Object[0]);
    s = null;
    t = true;
  }
  
  public void j(String paramString)
  {
    if (y.f())
    {
      c4.c localc = y;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Connection interrupted for: ");
      localStringBuilder.append(paramString);
      localc.b(localStringBuilder.toString(), new Object[0]);
    }
    d.add(paramString);
    paramString = g;
    if (paramString != null)
    {
      paramString.c();
      g = null;
    }
    else
    {
      z.b();
      h = k.o;
    }
    z.e();
  }
  
  public final void j0(String paramString1, String paramString2)
  {
    c4.c localc = y;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Auth token revoked: ");
    localStringBuilder.append(paramString1);
    localStringBuilder.append(" (");
    localStringBuilder.append(paramString2);
    localStringBuilder.append(")");
    localc.b(localStringBuilder.toString(), new Object[0]);
    q = null;
    r = true;
    a.e(false);
    g.c();
  }
  
  public void k(List paramList, Map paramMap, g paramg, Long paramLong, p paramp)
  {
    paramList = new p(paramList, paramMap);
    Object localObject;
    if (y.f())
    {
      paramMap = y;
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Listening on ");
      ((StringBuilder)localObject).append(paramList);
      paramMap.b(((StringBuilder)localObject).toString(), new Object[0]);
    }
    e.b(p.containsKey(paramList) ^ true, "listen() called twice for same QuerySpec.", new Object[0]);
    if (y.f())
    {
      localObject = y;
      paramMap = new StringBuilder();
      paramMap.append("Adding listen query: ");
      paramMap.append(paramList);
      ((c4.c)localObject).b(paramMap.toString(), new Object[0]);
    }
    paramMap = new n(paramp, paramList, paramLong, paramg, null);
    p.put(paramList, paramMap);
    if (T()) {
      z0(paramMap);
    }
    U();
  }
  
  public final void k0(String paramString, Map paramMap)
  {
    Object localObject1;
    Object localObject2;
    if (y.f())
    {
      localObject1 = y;
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("handleServerMessage: ");
      ((StringBuilder)localObject2).append(paramString);
      ((StringBuilder)localObject2).append(" ");
      ((StringBuilder)localObject2).append(paramMap);
      ((c4.c)localObject1).b(((StringBuilder)localObject2).toString(), new Object[0]);
    }
    if ((!paramString.equals("d")) && (!paramString.equals("m")))
    {
      if (paramString.equals("rm"))
      {
        localObject2 = (String)paramMap.get("p");
        localObject1 = e.e((String)localObject2);
        paramString = paramMap.get("d");
        Long localLong = e.c(paramMap.get("t"));
        paramString = (List)paramString;
        ArrayList localArrayList = new ArrayList();
        Iterator localIterator = paramString.iterator();
        while (localIterator.hasNext())
        {
          Map localMap = (Map)localIterator.next();
          paramString = (String)localMap.get("s");
          String str = (String)localMap.get("e");
          paramMap = null;
          if (paramString != null) {
            paramString = e.e(paramString);
          } else {
            paramString = null;
          }
          if (str != null) {
            paramMap = e.e(str);
          }
          localArrayList.add(new o(paramString, paramMap, localMap.get("m")));
        }
        if (localArrayList.isEmpty())
        {
          if (y.f())
          {
            paramMap = y;
            paramString = new StringBuilder();
            paramString.append("Ignoring empty range merge for path ");
            paramString.append((String)localObject2);
            paramMap.b(paramString.toString(), new Object[0]);
          }
        }
        else {
          a.f((List)localObject1, localArrayList, localLong);
        }
      }
      else if (paramString.equals("c"))
      {
        l0(e.e((String)paramMap.get("p")));
      }
      else if (paramString.equals("ac"))
      {
        j0((String)paramMap.get("s"), (String)paramMap.get("d"));
      }
      else if (paramString.equals("apc"))
      {
        i0((String)paramMap.get("s"), (String)paramMap.get("d"));
      }
      else if (paramString.equals("sd"))
      {
        m0(paramMap);
      }
      else if (y.f())
      {
        localObject2 = y;
        paramMap = new StringBuilder();
        paramMap.append("Unrecognized action from server: ");
        paramMap.append(paramString);
        ((c4.c)localObject2).b(paramMap.toString(), new Object[0]);
      }
    }
    else
    {
      boolean bool = paramString.equals("m");
      paramString = (String)paramMap.get("p");
      localObject2 = paramMap.get("d");
      paramMap = e.c(paramMap.get("t"));
      if ((bool) && ((localObject2 instanceof Map)) && (((Map)localObject2).size() == 0))
      {
        if (y.f())
        {
          paramMap = y;
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("ignoring empty merge for path ");
          ((StringBuilder)localObject2).append(paramString);
          paramMap.b(((StringBuilder)localObject2).toString(), new Object[0]);
        }
      }
      else
      {
        paramString = e.e(paramString);
        a.c(paramString, localObject2, bool, paramMap);
      }
    }
  }
  
  public void l(List paramList, Map paramMap)
  {
    p localp = new p(paramList, paramMap);
    if (y.f())
    {
      paramMap = y;
      paramList = new StringBuilder();
      paramList.append("unlistening on ");
      paramList.append(localp);
      paramMap.b(paramList.toString(), new Object[0]);
    }
    paramList = p0(localp);
    if ((paramList != null) && (T())) {
      E0(paramList);
    }
    U();
  }
  
  public final void l0(List paramList)
  {
    paramList = q0(paramList);
    if (paramList != null)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext()) {
        n.b((n)paramList.next()).a("permission_denied", null);
      }
    }
  }
  
  public void m(List paramList, p paramp)
  {
    if (R()) {
      A0("oc", paramList, null, paramp);
    } else {
      m.add(new l("oc", paramList, null, paramp, null));
    }
    U();
  }
  
  public final void m0(Map paramMap)
  {
    y.e((String)paramMap.get("msg"));
  }
  
  public void n(List paramList, Object paramObject, String paramString, p paramp)
  {
    o0("p", paramList, paramObject, paramString, paramp);
  }
  
  public void n0(String paramString1, String paramString2)
  {
    k localk = h;
    boolean bool;
    if (localk == k.p) {
      bool = true;
    } else {
      bool = false;
    }
    e.b(bool, "Trying to open network connection while in the wrong state: %s", new Object[] { localk });
    if (paramString1 == null) {
      a.e(false);
    }
    q = paramString1;
    s = paramString2;
    h = k.q;
    paramString1 = new b(u, b, c, this, A, paramString2);
    g = paramString1;
    paramString1.k();
  }
  
  public void o(String paramString)
  {
    c = paramString;
  }
  
  public final void o0(String paramString1, List paramList, Object paramObject, String paramString2, p paramp)
  {
    paramList = X(paramList, paramObject, paramString2);
    long l1 = i;
    i = (1L + l1);
    n.put(Long.valueOf(l1), new o(paramString1, paramList, paramp, null));
    if (R()) {
      B0(l1);
    }
    F = System.currentTimeMillis();
    U();
  }
  
  public void p(String paramString)
  {
    if (y.f())
    {
      c4.c localc = y;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Connection no longer interrupted for: ");
      localStringBuilder.append(paramString);
      localc.b(localStringBuilder.toString(), new Object[0]);
    }
    d.remove(paramString);
    if ((F0()) && (h == k.o)) {
      G0();
    }
  }
  
  public final n p0(p paramp)
  {
    StringBuilder localStringBuilder;
    if (y.f())
    {
      localObject = y;
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("removing query ");
      localStringBuilder.append(paramp);
      ((c4.c)localObject).b(localStringBuilder.toString(), new Object[0]);
    }
    if (!p.containsKey(paramp))
    {
      if (y.f())
      {
        localObject = y;
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("Trying to remove listener for QuerySpec ");
        localStringBuilder.append(paramp);
        localStringBuilder.append(" but no listener exists.");
        ((c4.c)localObject).b(localStringBuilder.toString(), new Object[0]);
      }
      return null;
    }
    Object localObject = (n)p.get(paramp);
    p.remove(paramp);
    U();
    return (n)localObject;
  }
  
  public void q(String paramString)
  {
    if (paramString.equals("Invalid appcheck token"))
    {
      int i1 = D;
      if (i1 < 3L)
      {
        D = (i1 + 1);
        localc = y;
        paramString = new StringBuilder();
        paramString.append("Detected invalid AppCheck token. Reconnecting (");
        paramString.append(3L - D);
        paramString.append(" attempts remaining)");
        localc.i(paramString.toString());
        return;
      }
    }
    c4.c localc = y;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Firebase Database connection was forcefully killed by the server. Will not attempt reconnect. Reason: ");
    localStringBuilder.append(paramString);
    localc.i(localStringBuilder.toString());
    j("server_kill");
  }
  
  public final Collection q0(List paramList)
  {
    if (y.f())
    {
      localObject1 = y;
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("removing all listens at path ");
      ((StringBuilder)localObject2).append(paramList);
      ((c4.c)localObject1).b(((StringBuilder)localObject2).toString(), new Object[0]);
    }
    Object localObject2 = new ArrayList();
    Iterator localIterator = p.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject3 = (Map.Entry)localIterator.next();
      localObject1 = (p)((Map.Entry)localObject3).getKey();
      localObject3 = (n)((Map.Entry)localObject3).getValue();
      if (p.a((p)localObject1).equals(paramList)) {
        ((List)localObject2).add(localObject3);
      }
    }
    Object localObject1 = ((List)localObject2).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      paramList = (n)((Iterator)localObject1).next();
      p.remove(paramList.d());
    }
    U();
    return (Collection)localObject2;
  }
  
  public void r(List paramList, Object paramObject, p paramp)
  {
    o0("p", paramList, paramObject, null, paramp);
  }
  
  public final void r0()
  {
    Object localObject1 = h;
    boolean bool;
    if (localObject1 == k.s) {
      bool = true;
    } else {
      bool = false;
    }
    e.b(bool, "Should be connected if we're restoring state, but we are: %s", new Object[] { localObject1 });
    if (y.f()) {
      y.b("Restoring outstanding listens", new Object[0]);
    }
    Object localObject2 = p.values().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (n)((Iterator)localObject2).next();
      if (y.f())
      {
        c4.c localc = y;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Restoring listen ");
        localStringBuilder.append(((n)localObject1).d());
        localc.b(localStringBuilder.toString(), new Object[0]);
      }
      z0((n)localObject1);
    }
    if (y.f()) {
      y.b("Restoring writes.", new Object[0]);
    }
    localObject1 = new ArrayList(n.keySet());
    Collections.sort((List)localObject1);
    localObject1 = ((ArrayList)localObject1).iterator();
    while (((Iterator)localObject1).hasNext()) {
      B0(((Long)((Iterator)localObject1).next()).longValue());
    }
    localObject1 = m.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (l)((Iterator)localObject1).next();
      A0(((l)localObject2).b(), ((l)localObject2).e(), ((l)localObject2).c(), ((l)localObject2).d());
    }
    m.clear();
    if (y.f()) {
      y.b("Restoring reads.", new Object[0]);
    }
    localObject1 = new ArrayList(o.keySet());
    Collections.sort((List)localObject1);
    localObject1 = ((ArrayList)localObject1).iterator();
    while (((Iterator)localObject1).hasNext()) {
      y0((Long)((Iterator)localObject1).next());
    }
  }
  
  public final void s0()
  {
    if (y.f()) {
      y.b("calling restore tokens", new Object[0]);
    }
    k localk = h;
    boolean bool;
    if (localk == k.q) {
      bool = true;
    } else {
      bool = false;
    }
    e.b(bool, "Wanted to restore tokens, but was in wrong state: %s", new Object[] { localk });
    if (q != null)
    {
      if (y.f()) {
        y.b("Restoring auth.", new Object[0]);
      }
      h = k.r;
      v0();
    }
    else
    {
      if (y.f()) {
        y.b("Not restoring auth because auth token is null.", new Object[0]);
      }
      h = k.s;
      u0(true);
    }
  }
  
  public final void t0(String paramString, Map paramMap, j paramj)
  {
    C0(paramString, false, paramMap, paramj);
  }
  
  public final void u0(boolean paramBoolean)
  {
    if (s == null)
    {
      r0();
      return;
    }
    e.b(T(), "Must be connected to send auth, but was: %s", new Object[] { h });
    if (y.f()) {
      y.b("Sending app check.", new Object[0]);
    }
    m localm = new m(this, paramBoolean);
    HashMap localHashMap = new HashMap();
    if (s != null) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    e.b(paramBoolean, "App check token must be set!", new Object[0]);
    localHashMap.put("token", s);
    C0("appcheck", true, localHashMap, localm);
  }
  
  public final void v0()
  {
    w0(true);
  }
  
  public final void w0(final boolean paramBoolean)
  {
    e.b(T(), "Must be connected to send auth, but was: %s", new Object[] { h });
    if (y.f()) {
      y.b("Sending auth.", new Object[0]);
    }
    d locald = new d(paramBoolean);
    HashMap localHashMap = new HashMap();
    Object localObject = f4.a.c(q);
    if (localObject != null)
    {
      localHashMap.put("cred", ((f4.a)localObject).b());
      if (((f4.a)localObject).a() != null) {
        localHashMap.put("authvar", ((f4.a)localObject).a());
      }
    }
    for (localObject = "gauth";; localObject = "auth")
    {
      C0((String)localObject, true, localHashMap, locald);
      break;
      localHashMap.put("cred", q);
    }
  }
  
  public final void x0()
  {
    HashMap localHashMap = new HashMap();
    boolean bool = u.i();
    Integer localInteger = Integer.valueOf(1);
    if (bool) {
      localHashMap.put("persistence.android.enabled", localInteger);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("sdk.android.");
    localStringBuilder.append(u.d().replace('.', '-'));
    localHashMap.put(localStringBuilder.toString(), localInteger);
    if (y.f()) {
      y.b("Sending first connection stats", new Object[0]);
    }
    D0(localHashMap);
  }
  
  public final void y0(final Long paramLong)
  {
    e.b(Q(), "sendGet called when we can't send gets", new Object[0]);
    final Object localObject = (m)o.get(paramLong);
    if ((!m.a((m)localObject)) && (y.f()))
    {
      c4.c localc = y;
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("get");
      ((StringBuilder)localObject).append(paramLong);
      ((StringBuilder)localObject).append(" cancelled, ignoring.");
      localc.b(((StringBuilder)localObject).toString(), new Object[0]);
      return;
    }
    t0("g", m.b((m)localObject), new f(paramLong, (m)localObject));
  }
  
  public final void z0(final n paramn)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("p", e.d(p.a(paramn.d())));
    Object localObject1 = paramn.e();
    if (localObject1 != null)
    {
      localHashMap.put("q", p.b(n.a(paramn)));
      localHashMap.put("t", localObject1);
    }
    localObject1 = paramn.c();
    localHashMap.put("h", ((g)localObject1).d());
    if (((g)localObject1).c())
    {
      a locala = ((g)localObject1).b();
      localObject1 = new ArrayList();
      Object localObject2 = locala.b().iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((List)localObject1).add(e.d((List)((Iterator)localObject2).next()));
      }
      localObject2 = new HashMap();
      ((Map)localObject2).put("hs", locala.a());
      ((Map)localObject2).put("ps", localObject1);
      localHashMap.put("ch", localObject2);
    }
    t0("q", localHashMap, new g(paramn));
  }
  
  public class a
    implements d.a
  {
    public a(k paramk) {}
    
    public void a(String paramString)
    {
      localk.c(paramString);
    }
  }
  
  public class b
    implements d.a
  {
    public b(k paramk) {}
    
    public void a(String paramString)
    {
      localk.c(paramString);
    }
  }
  
  public class c
    implements n.j
  {
    public c(p paramp) {}
    
    public void a(Map paramMap)
    {
      Object localObject1 = (String)paramMap.get("s");
      if (!((String)localObject1).equals("ok"))
      {
        localObject2 = (String)paramMap.get("d");
        paramMap = (Map)localObject1;
        localObject1 = localObject2;
      }
      else
      {
        paramMap = null;
        localObject1 = null;
      }
      Object localObject2 = paramp;
      if (localObject2 != null) {
        ((p)localObject2).a(paramMap, (String)localObject1);
      }
    }
  }
  
  public class d
    implements n.j
  {
    public d(boolean paramBoolean) {}
    
    public void a(Map paramMap)
    {
      String str1 = (String)paramMap.get("s");
      if (str1.equals("ok"))
      {
        n.P(n.this, n.k.s);
        n.y(n.this, 0);
        n.A(n.this, paramBoolean);
      }
      else
      {
        n.B(n.this, null);
        n.C(n.this, true);
        n.D(n.this).e(false);
        String str2 = (String)paramMap.get("d");
        c4.c localc = n.E(n.this);
        paramMap = new StringBuilder();
        paramMap.append("Authentication failed: ");
        paramMap.append(str1);
        paramMap.append(" (");
        paramMap.append(str2);
        paramMap.append(")");
        localc.b(paramMap.toString(), new Object[0]);
        n.F(n.this).c();
        if (str1.equals("invalid_token"))
        {
          n.z(n.this);
          if (n.x(n.this) >= 3L)
          {
            n.G(n.this).d();
            n.E(n.this).i("Provided authentication credentials are invalid. This usually indicates your FirebaseApp instance was not initialized correctly. Make sure your google-services.json file has the correct firebase_url and api_key. You can re-download google-services.json from https://console.firebase.google.com/.");
          }
        }
      }
    }
  }
  
  public class e
    implements n.j
  {
    public e(String paramString, long paramLong, n.o paramo, p paramp) {}
    
    public void a(Map paramMap)
    {
      Object localObject;
      if (n.E(n.this).f())
      {
        localObject = n.E(n.this);
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(str);
        localStringBuilder.append(" response: ");
        localStringBuilder.append(paramMap);
        ((c4.c)localObject).b(localStringBuilder.toString(), new Object[0]);
      }
      if ((n.o)n.H(n.this).get(Long.valueOf(paramLong)) == localp)
      {
        n.H(n.this).remove(Long.valueOf(paramLong));
        if (d != null)
        {
          localObject = (String)paramMap.get("s");
          if (((String)localObject).equals("ok"))
          {
            d.a(null, null);
          }
          else
          {
            paramMap = (String)paramMap.get("d");
            d.a((String)localObject, paramMap);
          }
        }
      }
      else if (n.E(n.this).f())
      {
        localObject = n.E(n.this);
        paramMap = new StringBuilder();
        paramMap.append("Ignoring on complete for put ");
        paramMap.append(paramLong);
        paramMap.append(" because it was removed already.");
        ((c4.c)localObject).b(paramMap.toString(), new Object[0]);
      }
      n.I(n.this);
    }
  }
  
  public class f
    implements n.j
  {
    public f(Long paramLong, n.m paramm) {}
    
    public void a(Map paramMap)
    {
      if ((n.m)n.J(n.this).get(paramLong) == localObject)
      {
        n.J(n.this).remove(paramLong);
        n.m.c(localObject).a(paramMap);
      }
      else if (n.E(n.this).f())
      {
        paramMap = n.E(n.this);
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Ignoring on complete for get ");
        localStringBuilder.append(paramLong);
        localStringBuilder.append(" because it was removed already.");
        paramMap.b(localStringBuilder.toString(), new Object[0]);
      }
    }
  }
  
  public class g
    implements n.j
  {
    public g(n.n paramn) {}
    
    public void a(Map paramMap)
    {
      String str = (String)paramMap.get("s");
      if (str.equals("ok"))
      {
        Object localObject = (Map)paramMap.get("d");
        if (((Map)localObject).containsKey("w"))
        {
          localObject = (List)((Map)localObject).get("w");
          n.K(n.this, (List)localObject, n.n.a(paramn));
        }
      }
      if ((n.n)n.L(n.this).get(paramn.d()) == paramn) {
        if (!str.equals("ok"))
        {
          n.M(n.this, paramn.d());
          paramMap = (String)paramMap.get("d");
          n.n.b(paramn).a(str, paramMap);
        }
        else
        {
          n.n.b(paramn).a(null, null);
        }
      }
    }
  }
  
  public class h
    implements n.j
  {
    public h() {}
    
    public void a(Map paramMap)
    {
      String str = (String)paramMap.get("s");
      if (!str.equals("ok"))
      {
        paramMap = (String)paramMap.get("d");
        if (n.E(n.this).f())
        {
          c4.c localc = n.E(n.this);
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Failed to send stats: ");
          localStringBuilder.append(str);
          localStringBuilder.append(" (message: ");
          localStringBuilder.append(paramMap);
          localStringBuilder.append(")");
          localc.b(localStringBuilder.toString(), new Object[0]);
        }
      }
    }
  }
  
  public class i
    implements Runnable
  {
    public i() {}
    
    public void run()
    {
      n.N(n.this, null);
      if (n.O(n.this)) {
        j("connection_idle");
      } else {
        n.I(n.this);
      }
    }
  }
  
  public static abstract interface j
  {
    public abstract void a(Map paramMap);
  }
  
  public static enum k
  {
    static
    {
      k localk1 = new k("Disconnected", 0);
      o = localk1;
      k localk2 = new k("GettingToken", 1);
      p = localk2;
      k localk3 = new k("Connecting", 2);
      q = localk3;
      k localk4 = new k("Authenticating", 3);
      r = localk4;
      k localk5 = new k("Connected", 4);
      s = localk5;
      t = new k[] { localk1, localk2, localk3, localk4, localk5 };
    }
  }
  
  public static class l
  {
    public final String a;
    public final List b;
    public final Object c;
    public final p d;
    
    public l(String paramString, List paramList, Object paramObject, p paramp)
    {
      a = paramString;
      b = paramList;
      c = paramObject;
      d = paramp;
    }
    
    public String b()
    {
      return a;
    }
    
    public Object c()
    {
      return c;
    }
    
    public p d()
    {
      return d;
    }
    
    public List e()
    {
      return b;
    }
  }
  
  public static class m
  {
    public final Map a;
    public final n.j b;
    public boolean c;
    
    public m(String paramString, Map paramMap, n.j paramj)
    {
      a = paramMap;
      b = paramj;
      c = false;
    }
    
    public final n.j d()
    {
      return b;
    }
    
    public final Map e()
    {
      return a;
    }
    
    public final boolean f()
    {
      if (c) {
        return false;
      }
      c = true;
      return true;
    }
  }
  
  public static class n
  {
    public final p a;
    public final n.p b;
    public final g c;
    public final Long d;
    
    public n(p paramp, n.p paramp1, Long paramLong, g paramg)
    {
      a = paramp;
      b = paramp1;
      c = paramg;
      d = paramLong;
    }
    
    public g c()
    {
      return c;
    }
    
    public n.p d()
    {
      return b;
    }
    
    public Long e()
    {
      return d;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(b.toString());
      localStringBuilder.append(" (Tag: ");
      localStringBuilder.append(d);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static class o
  {
    public String a;
    public Map b;
    public p c;
    public boolean d;
    
    public o(String paramString, Map paramMap, p paramp)
    {
      a = paramString;
      b = paramMap;
      c = paramp;
    }
    
    public String b()
    {
      return a;
    }
    
    public p c()
    {
      return c;
    }
    
    public Map d()
    {
      return b;
    }
    
    public void e()
    {
      d = true;
    }
    
    public boolean f()
    {
      return d;
    }
  }
  
  public static class p
  {
    public final List a;
    public final Map b;
    
    public p(List paramList, Map paramMap)
    {
      a = paramList;
      b = paramMap;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof p)) {
        return false;
      }
      paramObject = (p)paramObject;
      if (!a.equals(a)) {
        return false;
      }
      return b.equals(b);
    }
    
    public int hashCode()
    {
      return a.hashCode() * 31 + b.hashCode();
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(e.d(a));
      localStringBuilder.append(" (params: ");
      localStringBuilder.append(b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     T3.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */