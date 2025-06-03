package g9;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.f;
import e9.a;
import eb.e1;
import eb.e1.a;
import i9.e0;
import i9.m1;
import j9.m;
import j9.q;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import m9.h0.a;
import m9.k0;
import p2.m0;
import t8.e.a;
import v3.y;

public final class j0
  implements h0.a
{
  public final i9.n a;
  public final m9.h0 b;
  public final HashMap c;
  public final HashMap d;
  public final int e;
  public final LinkedHashSet<j9.i> f;
  public final HashMap g;
  public final HashMap h;
  public final l3.l i;
  public final HashMap j;
  public final HashMap k;
  public final l0 l;
  public e9.e m;
  public b n;
  
  public j0(i9.n paramn, m9.h0 paramh0, e9.e parame, int paramInt)
  {
    a = paramn;
    b = paramh0;
    e = paramInt;
    c = new HashMap();
    d = new HashMap();
    f = new LinkedHashSet();
    g = new HashMap();
    h = new HashMap();
    i = new l3.l(6);
    j = new HashMap();
    l = new l0(1, 1);
    m = parame;
    k = new HashMap();
  }
  
  public static void j(e1 parame1, String paramString, Object... paramVarArgs)
  {
    e1.a locala = a;
    String str = b;
    if (str == null) {
      str = "";
    }
    int i1;
    if (((locala == e1.a.t) && (str.contains("requires an index"))) || (locala == e1.a.r)) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (i1 != 0) {
      m0.y(2, "Firestore", "%s: %s", new Object[] { String.format(paramString, paramVarArgs), parame1 });
    }
  }
  
  public final void a(k9.h paramh)
  {
    g("handleSuccessfulWrite");
    k(a.a, null);
    o(a.a);
    i9.n localn = a;
    h((t8.c)a.x("Acknowledge batch", new r3.l(6, localn, paramh)), null);
  }
  
  public final void b(d0 paramd0)
  {
    g("handleOnlineStateChange");
    Object localObject1 = new ArrayList();
    Iterator localIterator1 = c.entrySet().iterator();
    Object localObject2;
    while (localIterator1.hasNext())
    {
      localObject2 = nextgetValuec;
      if ((c) && (paramd0 == d0.c))
      {
        c = false;
        localObject2 = ((r0)localObject2).a(new r0.a(d, new j(), g, false), null, false);
      }
      else
      {
        localObject2 = new d5.n(2, null, Collections.emptyList());
      }
      x6.b.Z("OnlineState should not affect limbo documents.", ((List)c).isEmpty(), new Object[0]);
      localObject2 = (s0)b;
      if (localObject2 != null) {
        ((ArrayList)localObject1).add(localObject2);
      }
    }
    ((k)n).a((List)localObject1);
    localObject1 = (k)n;
    d = paramd0;
    Iterator localIterator2 = b.values().iterator();
    int i1 = 0;
    if (localIterator2.hasNext())
    {
      localIterator1 = nexta.iterator();
      int i2 = i1;
      for (;;)
      {
        i1 = i2;
        if (!localIterator1.hasNext()) {
          break;
        }
        localObject2 = (g0)localIterator1.next();
        e = paramd0;
        s0 locals0 = f;
        if ((locals0 != null) && (!d) && (((g0)localObject2).d(locals0, paramd0)))
        {
          ((g0)localObject2).c(f);
          i1 = 1;
        }
        else
        {
          i1 = 0;
        }
        if (i1 != 0) {
          i2 = 1;
        }
      }
    }
    if (i1 != 0) {
      ((k)localObject1).b();
    }
  }
  
  public final void c(m9.d0 paramd0)
  {
    g("handleRemoteEvent");
    Object localObject1 = ((Map)b).entrySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
      localObject3 = (Integer)((Map.Entry)localObject2).getKey();
      localObject2 = (k0)((Map.Entry)localObject2).getValue();
      localObject3 = (a)h.get(localObject3);
      if (localObject3 != null)
      {
        int i1 = c.size();
        int i2 = d.size();
        boolean bool;
        if (e.size() + (i2 + i1) <= 1) {
          bool = true;
        } else {
          bool = false;
        }
        x6.b.Z("Limbo resolution for single document contains multiple changes.", bool, new Object[0]);
        if (c.size() > 0)
        {
          b = true;
        }
        else if (d.size() > 0)
        {
          x6.b.Z("Received change for limbo target document without add.", b, new Object[0]);
        }
        else if (e.size() > 0)
        {
          x6.b.Z("Received remove for limbo target document without add.", b, new Object[0]);
          b = false;
        }
      }
    }
    localObject1 = a;
    localObject1.getClass();
    Object localObject3 = (q)a;
    h((t8.c)a.x("Apply remote event", new p3.b(localObject1, paramd0, localObject3)), paramd0);
  }
  
  public final t8.e<j9.i> d(int paramInt)
  {
    Object localObject1 = (a)h.get(Integer.valueOf(paramInt));
    if ((localObject1 != null) && (b)) {
      return j9.i.c.a(a);
    }
    localObject1 = j9.i.c;
    Object localObject2 = localObject1;
    if (d.containsKey(Integer.valueOf(paramInt)))
    {
      Iterator localIterator = ((List)d.get(Integer.valueOf(paramInt))).iterator();
      for (;;)
      {
        localObject2 = localObject1;
        if (!localIterator.hasNext()) {
          break;
        }
        localObject2 = (f0)localIterator.next();
        if (c.containsKey(localObject2))
        {
          localObject2 = c.get(localObject2)).c.e;
          Object localObject3;
          if (((t8.e)localObject1).size() < ((t8.e)localObject2).size())
          {
            localObject3 = localObject1;
            localObject1 = localObject2;
          }
          else
          {
            localObject3 = localObject2;
          }
          localObject2 = ((t8.e)localObject3).iterator();
          for (;;)
          {
            localObject3 = (e.a)localObject2;
            if (!((e.a)localObject3).hasNext()) {
              break;
            }
            localObject1 = ((t8.e)localObject1).a(((e.a)localObject3).next());
          }
        }
      }
    }
    return (t8.e<j9.i>)localObject2;
  }
  
  public final void e(int paramInt, e1 parame1)
  {
    g("handleRejectedListen");
    Object localObject = (a)h.get(Integer.valueOf(paramInt));
    if (localObject != null) {
      localObject = a;
    } else {
      localObject = null;
    }
    if (localObject != null)
    {
      g.remove(localObject);
      h.remove(Integer.valueOf(paramInt));
      l();
      q localq = q.b;
      parame1 = Collections.singletonMap(localObject, m.n((j9.i)localObject, localq));
      localObject = Collections.singleton(localObject);
      c(new m9.d0(localq, Collections.emptyMap(), Collections.emptyMap(), parame1, (Set)localObject));
    }
    else
    {
      localObject = a;
      a.y("Release target", new i9.k((i9.n)localObject, paramInt));
      m(paramInt, parame1);
    }
  }
  
  public final void f(int paramInt, e1 parame1)
  {
    g("handleRejectedWrite");
    Object localObject = a;
    localObject = (t8.c)a.x("Reject batch", new y(localObject, paramInt, 2));
    if (!((t8.c)localObject).isEmpty()) {
      j(parame1, "Write failed at %s", new Object[] { la });
    }
    k(paramInt, parame1);
    o(paramInt);
    h((t8.c)localObject, null);
  }
  
  public final void g(String paramString)
  {
    boolean bool;
    if (n != null) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.Z("Trying to call %s before setting callback", bool, new Object[] { paramString });
  }
  
  public final void h(t8.c<j9.i, j9.g> paramc, m9.d0 paramd0)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator = c.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = (h0)((Map.Entry)localIterator.next()).getValue();
      Object localObject2 = c;
      Object localObject3 = null;
      Object localObject4 = ((r0)localObject2).c(paramc, null);
      boolean bool1 = c;
      boolean bool2 = false;
      Object localObject5 = localObject4;
      if (bool1) {
        localObject5 = ((r0)localObject2).c((t8.c)a.b(a, false).b, (r0.a)localObject4);
      }
      if (paramd0 != null) {
        localObject3 = (k0)((Map)b).get(Integer.valueOf(b));
      }
      bool1 = bool2;
      if (paramd0 != null)
      {
        bool1 = bool2;
        if (((Map)c).get(Integer.valueOf(b)) != null) {
          bool1 = true;
        }
      }
      localObject5 = c.a((r0.a)localObject5, (k0)localObject3, bool1);
      localObject3 = (List)c;
      q(b, (List)localObject3);
      localObject3 = (s0)b;
      if (localObject3 != null)
      {
        localArrayList1.add(localObject3);
        int i1 = b;
        localObject4 = (s0)b;
        localObject3 = new ArrayList();
        localObject5 = j9.i.b;
        localObject3 = new t8.e((List)localObject3, (Comparator)localObject5);
        localObject5 = new t8.e(new ArrayList(), (Comparator)localObject5);
        localObject1 = d.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (i)((Iterator)localObject1).next();
          int i2 = a.ordinal();
          if (i2 != 0)
          {
            if (i2 == 1) {
              localObject3 = ((t8.e)localObject3).a(b.getKey());
            }
          }
          else {
            localObject5 = ((t8.e)localObject5).a(b.getKey());
          }
        }
        localArrayList2.add(new i9.o(i1, e, (t8.e)localObject3, (t8.e)localObject5));
      }
    }
    ((k)n).a(localArrayList1);
    paramc = a;
    a.y("notifyLocalViewChanges", new w.g(19, paramc, localArrayList2));
  }
  
  public final int i(f0 paramf0, boolean paramBoolean)
  {
    g("listen");
    x6.b.Z("We already listen to query: %s", c.containsKey(paramf0) ^ true, new Object[] { paramf0 });
    m1 localm1 = a.a(paramf0.i());
    int i1 = b;
    Object localObject1 = g;
    Object localObject2 = a.b(paramf0, true);
    int i2;
    if (d.get(Integer.valueOf(i1)) != null)
    {
      localObject3 = (f0)((List)d.get(Integer.valueOf(i1))).get(0);
      i2 = c.get(localObject3)).c.b;
    }
    else
    {
      i2 = 1;
    }
    boolean bool;
    if (i2 == 3) {
      bool = true;
    } else {
      bool = false;
    }
    Object localObject3 = j9.i.c;
    localObject3 = new k0((ma.h)localObject1, bool, (t8.e)localObject3, (t8.e)localObject3, (t8.e)localObject3);
    localObject1 = new r0(paramf0, (t8.e)c);
    localObject2 = ((r0)localObject1).a(((r0)localObject1).c((t8.c)b, null), (k0)localObject3, false);
    q(i1, (List)c);
    localObject1 = new h0(paramf0, i1, (r0)localObject1);
    c.put(paramf0, localObject1);
    if (!d.containsKey(Integer.valueOf(i1))) {
      d.put(Integer.valueOf(i1), new ArrayList(1));
    }
    ((List)d.get(Integer.valueOf(i1))).add(paramf0);
    localObject2 = (s0)b;
    paramf0 = n;
    localObject2 = Collections.singletonList(localObject2);
    ((k)paramf0).a((List)localObject2);
    if (paramBoolean) {
      b.d(localm1);
    }
    return b;
  }
  
  public final void k(int paramInt, e1 parame1)
  {
    Map localMap = (Map)j.get(m);
    if (localMap != null)
    {
      Integer localInteger = Integer.valueOf(paramInt);
      TaskCompletionSource localTaskCompletionSource = (TaskCompletionSource)localMap.get(localInteger);
      if (localTaskCompletionSource != null)
      {
        if (parame1 != null) {
          localTaskCompletionSource.setException(n9.o.g(parame1));
        } else {
          localTaskCompletionSource.setResult(null);
        }
        localMap.remove(localInteger);
      }
    }
  }
  
  public final void l()
  {
    while ((!f.isEmpty()) && (g.size() < e))
    {
      Object localObject = f.iterator();
      j9.i locali = (j9.i)((Iterator)localObject).next();
      ((Iterator)localObject).remove();
      localObject = l;
      int i1 = a;
      a = (i1 + 2);
      h.put(Integer.valueOf(i1), new a(locali));
      g.put(locali, Integer.valueOf(i1));
      b.d(new m1(new f0(a, null).i(), i1, -1L, e0.d));
    }
  }
  
  public final void m(int paramInt, e1 parame1)
  {
    Object localObject1 = ((List)d.get(Integer.valueOf(paramInt))).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      f0 localf0 = (f0)((Iterator)localObject1).next();
      c.remove(localf0);
      if (!parame1.e())
      {
        k localk = (k)n;
        Object localObject2 = (k.b)b.get(localf0);
        if (localObject2 != null)
        {
          localObject2 = a.iterator();
          while (((Iterator)localObject2).hasNext())
          {
            g0 localg0 = (g0)((Iterator)localObject2).next();
            f localf = n9.o.g(parame1);
            c.a(null, localf);
          }
        }
        b.remove(localf0);
        j(parame1, "Listen for %s failed", new Object[] { localf0 });
      }
    }
    d.remove(Integer.valueOf(paramInt));
    parame1 = i.c(paramInt);
    i.d(paramInt);
    parame1 = parame1.iterator();
    for (;;)
    {
      localObject1 = (e.a)parame1;
      if (!((e.a)localObject1).hasNext()) {
        break;
      }
      localObject1 = (j9.i)((e.a)localObject1).next();
      if (!i.a((j9.i)localObject1)) {
        n((j9.i)localObject1);
      }
    }
  }
  
  public final void n(j9.i parami)
  {
    f.remove(parami);
    Integer localInteger = (Integer)g.get(parami);
    if (localInteger != null)
    {
      b.j(localInteger.intValue());
      g.remove(parami);
      h.remove(localInteger);
      l();
    }
  }
  
  public final void o(int paramInt)
  {
    if (k.containsKey(Integer.valueOf(paramInt)))
    {
      Iterator localIterator = ((List)k.get(Integer.valueOf(paramInt))).iterator();
      while (localIterator.hasNext()) {
        ((TaskCompletionSource)localIterator.next()).setResult(null);
      }
      k.remove(Integer.valueOf(paramInt));
    }
  }
  
  public final void p(f0 paramf0, boolean paramBoolean)
  {
    g("stopListening");
    Object localObject = (h0)c.get(paramf0);
    boolean bool;
    if (localObject != null) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.Z("Trying to stop listening to a query not found", bool, new Object[0]);
    c.remove(paramf0);
    int i1 = b;
    localObject = (List)d.get(Integer.valueOf(i1));
    ((List)localObject).remove(paramf0);
    if (((List)localObject).isEmpty())
    {
      paramf0 = a;
      a.y("Release target", new i9.k(paramf0, i1));
      if (paramBoolean) {
        b.j(i1);
      }
      m(i1, e1.e);
    }
  }
  
  public final void q(int paramInt, List paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Object localObject1 = (z)paramList.next();
      int i1 = a.ordinal();
      l3.l locall;
      Object localObject2;
      if (i1 != 0)
      {
        if (i1 == 1)
        {
          m0.y(1, "j0", "Document no longer in limbo: %s", new Object[] { b });
          localObject1 = b;
          locall = i;
          locall.getClass();
          localObject2 = new i9.c(paramInt, (j9.i)localObject1);
          a = ((t8.e)a).i(localObject2);
          b = ((t8.e)b).i(localObject2);
          if (!i.a((j9.i)localObject1)) {
            n((j9.i)localObject1);
          }
        }
        else
        {
          x6.b.T("Unknown limbo change type: %s", new Object[] { a });
          throw null;
        }
      }
      else
      {
        locall = i;
        localObject2 = b;
        locall.getClass();
        localObject2 = new i9.c(paramInt, (j9.i)localObject2);
        a = ((t8.e)a).a(localObject2);
        b = ((t8.e)b).a(localObject2);
        localObject1 = b;
        if ((!g.containsKey(localObject1)) && (!f.contains(localObject1)))
        {
          m0.y(1, "j0", "New document in limbo: %s", new Object[] { localObject1 });
          f.add(localObject1);
          l();
        }
      }
    }
  }
  
  public static final class a
  {
    public final j9.i a;
    public boolean b;
    
    public a(j9.i parami)
    {
      a = parami;
    }
  }
  
  public static abstract interface b {}
}

/* Location:
 * Qualified Name:     g9.j0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */