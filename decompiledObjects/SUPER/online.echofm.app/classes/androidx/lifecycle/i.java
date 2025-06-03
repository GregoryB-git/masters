package androidx.lifecycle;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import n.b;
import n.b.d;

public class i
  extends d
{
  public n.a b = new n.a();
  public d.c c;
  public final WeakReference d;
  public int e = 0;
  public boolean f = false;
  public boolean g = false;
  public ArrayList h = new ArrayList();
  public final boolean i;
  
  public i(h paramh)
  {
    this(paramh, true);
  }
  
  public i(h paramh, boolean paramBoolean)
  {
    d = new WeakReference(paramh);
    c = d.c.p;
    i = paramBoolean;
  }
  
  public static d.c k(d.c paramc1, d.c paramc2)
  {
    d.c localc = paramc1;
    if (paramc2 != null)
    {
      localc = paramc1;
      if (paramc2.compareTo(paramc1) < 0) {
        localc = paramc2;
      }
    }
    return localc;
  }
  
  public void a(g paramg)
  {
    f("addObserver");
    Object localObject1 = c;
    Object localObject2 = d.c.o;
    if (localObject1 != localObject2) {
      localObject2 = d.c.p;
    }
    localObject1 = new a(paramg, (d.c)localObject2);
    if ((a)b.k(paramg, localObject1) != null) {
      return;
    }
    h localh = (h)d.get();
    if (localh == null) {
      return;
    }
    int j;
    if ((e == 0) && (!f)) {
      j = 0;
    } else {
      j = 1;
    }
    localObject2 = e(paramg);
    e += 1;
    while ((a.compareTo((Enum)localObject2) < 0) && (b.contains(paramg)))
    {
      n(a);
      localObject2 = d.b.h(a);
      if (localObject2 != null)
      {
        ((a)localObject1).a(localh, (d.b)localObject2);
        m();
        localObject2 = e(paramg);
      }
      else
      {
        paramg = new StringBuilder();
        paramg.append("no event up from ");
        paramg.append(a);
        throw new IllegalStateException(paramg.toString());
      }
    }
    if (j == 0) {
      p();
    }
    e -= 1;
  }
  
  public d.c b()
  {
    return c;
  }
  
  public void c(g paramg)
  {
    f("removeObserver");
    b.q(paramg);
  }
  
  public final void d(h paramh)
  {
    Iterator localIterator = b.descendingIterator();
    while ((localIterator.hasNext()) && (!g))
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      a locala = (a)localEntry.getValue();
      while ((a.compareTo(c) > 0) && (!g) && (b.contains(localEntry.getKey())))
      {
        d.b localb = d.b.c(a);
        if (localb == null) {
          break label122;
        }
        n(localb.e());
        locala.a(paramh, localb);
        m();
      }
      continue;
      label122:
      paramh = new StringBuilder();
      paramh.append("no event down from ");
      paramh.append(a);
      throw new IllegalStateException(paramh.toString());
    }
  }
  
  public final d.c e(g paramg)
  {
    paramg = b.s(paramg);
    Object localObject = null;
    if (paramg != null) {
      paramg = getValuea;
    } else {
      paramg = null;
    }
    if (!h.isEmpty())
    {
      localObject = h;
      localObject = (d.c)((ArrayList)localObject).get(((ArrayList)localObject).size() - 1);
    }
    return k(k(c, paramg), (d.c)localObject);
  }
  
  public final void f(String paramString)
  {
    if ((i) && (!m.a.d().b()))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Method ");
      localStringBuilder.append(paramString);
      localStringBuilder.append(" must be called on the main thread");
      throw new IllegalStateException(localStringBuilder.toString());
    }
  }
  
  public final void g(h paramh)
  {
    b.d locald = b.f();
    while ((locald.hasNext()) && (!g))
    {
      Map.Entry localEntry = (Map.Entry)locald.next();
      a locala = (a)localEntry.getValue();
      while ((a.compareTo(c) < 0) && (!g) && (b.contains(localEntry.getKey())))
      {
        n(a);
        d.b localb = d.b.h(a);
        if (localb == null) {
          break label122;
        }
        locala.a(paramh, localb);
        m();
      }
      continue;
      label122:
      paramh = new StringBuilder();
      paramh.append("no event up from ");
      paramh.append(a);
      throw new IllegalStateException(paramh.toString());
    }
  }
  
  public void h(d.b paramb)
  {
    f("handleLifecycleEvent");
    l(paramb.e());
  }
  
  public final boolean i()
  {
    int j = b.size();
    boolean bool = true;
    if (j == 0) {
      return true;
    }
    d.c localc1 = b.a().getValue()).a;
    d.c localc2 = b.g().getValue()).a;
    if ((localc1 != localc2) || (c != localc2)) {
      bool = false;
    }
    return bool;
  }
  
  public void j(d.c paramc)
  {
    f("markState");
    o(paramc);
  }
  
  public final void l(d.c paramc)
  {
    if (c == paramc) {
      return;
    }
    c = paramc;
    if ((!f) && (e == 0))
    {
      f = true;
      p();
      f = false;
      return;
    }
    g = true;
  }
  
  public final void m()
  {
    ArrayList localArrayList = h;
    localArrayList.remove(localArrayList.size() - 1);
  }
  
  public final void n(d.c paramc)
  {
    h.add(paramc);
  }
  
  public void o(d.c paramc)
  {
    f("setCurrentState");
    l(paramc);
  }
  
  public final void p()
  {
    h localh = (h)d.get();
    if (localh != null)
    {
      for (;;)
      {
        boolean bool = i();
        g = false;
        if (bool) {
          break;
        }
        if (c.compareTo(b.a().getValue()).a) < 0) {
          d(localh);
        }
        Map.Entry localEntry = b.g();
        if ((!g) && (localEntry != null) && (c.compareTo(getValuea) > 0)) {
          g(localh);
        }
      }
      return;
    }
    throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
  }
  
  public static class a
  {
    public d.c a;
    public f b;
    
    public a(g paramg, d.c paramc)
    {
      b = j.f(paramg);
      a = paramc;
    }
    
    public void a(h paramh, d.b paramb)
    {
      d.c localc = paramb.e();
      a = i.k(a, localc);
      b.a(paramh, paramb);
      a = localc;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */