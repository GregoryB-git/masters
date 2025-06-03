package t3;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import w3.a.c;

public class c
{
  public final r4.b a;
  public final String b;
  public Integer c;
  
  public c(Context paramContext, r4.b paramb, String paramString)
  {
    a = paramb;
    b = paramString;
    c = null;
  }
  
  public static List c(List paramList)
  {
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(b.b((Map)paramList.next()));
    }
    return localArrayList;
  }
  
  public final void a(a.c paramc)
  {
    ((w3.a)a.get()).b(paramc);
  }
  
  public final void b(List paramList)
  {
    ArrayDeque localArrayDeque = new ArrayDeque(f());
    int i = i();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Object localObject = (b)paramList.next();
      while (localArrayDeque.size() >= i) {
        k(pollFirstb);
      }
      localObject = ((b)localObject).f(b);
      a((a.c)localObject);
      localArrayDeque.offer(localObject);
    }
  }
  
  public final boolean d(List paramList, b paramb)
  {
    String str = paramb.c();
    paramb = paramb.e();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (b)localIterator.next();
      if ((paramList.c().equals(str)) && (paramList.e().equals(paramb))) {
        return true;
      }
    }
    return false;
  }
  
  public List e()
  {
    o();
    Object localObject = f();
    ArrayList localArrayList = new ArrayList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      localArrayList.add(b.a((a.c)((Iterator)localObject).next()));
    }
    return localArrayList;
  }
  
  public final List f()
  {
    return ((w3.a)a.get()).c(b, "");
  }
  
  public final ArrayList g(List paramList1, List paramList2)
  {
    ArrayList localArrayList = new ArrayList();
    paramList1 = paramList1.iterator();
    while (paramList1.hasNext())
    {
      b localb = (b)paramList1.next();
      if (!d(paramList2, localb)) {
        localArrayList.add(localb);
      }
    }
    return localArrayList;
  }
  
  public final ArrayList h(List paramList1, List paramList2)
  {
    ArrayList localArrayList = new ArrayList();
    paramList1 = paramList1.iterator();
    while (paramList1.hasNext())
    {
      b localb = (b)paramList1.next();
      if (!d(paramList2, localb)) {
        localArrayList.add(localb.f(b));
      }
    }
    return localArrayList;
  }
  
  public final int i()
  {
    if (c == null) {
      c = Integer.valueOf(((w3.a)a.get()).f(b));
    }
    return c.intValue();
  }
  
  public void j()
  {
    o();
    l(f());
  }
  
  public final void k(String paramString)
  {
    ((w3.a)a.get()).clearConditionalUserProperty(paramString, null, null);
  }
  
  public final void l(Collection paramCollection)
  {
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      k(nextb);
    }
  }
  
  public void m(List paramList)
  {
    o();
    if (paramList != null)
    {
      n(c(paramList));
      return;
    }
    throw new IllegalArgumentException("The replacementExperiments list is null.");
  }
  
  public final void n(List paramList)
  {
    if (paramList.isEmpty())
    {
      j();
      return;
    }
    List localList = e();
    l(h(localList, paramList));
    b(g(paramList, localList));
  }
  
  public final void o()
  {
    if (a.get() != null) {
      return;
    }
    throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
  }
}

/* Location:
 * Qualified Name:     t3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */