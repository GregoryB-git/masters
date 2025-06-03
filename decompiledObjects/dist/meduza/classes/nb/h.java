package nb;

import eb.a.b;
import eb.e1;
import eb.k0;
import eb.k0.d;
import eb.k0.e;
import eb.k0.f;
import eb.k0.h;
import eb.k0.j;
import eb.l0;
import eb.n;
import eb.u;
import f;
import gb.r2;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import o7.t;

public abstract class h
  extends k0
{
  public static final Logger k = Logger.getLogger(h.class.getName());
  public final LinkedHashMap f = new LinkedHashMap();
  public final k0.e g;
  public boolean h;
  public final r2 i = new r2();
  public n j;
  
  public h(k0.e parame)
  {
    x6.b.y(parame, "helper");
    g = parame;
    k.log(Level.FINE, "Created");
  }
  
  public final e1 a(k0.h paramh)
  {
    try
    {
      h = true;
      a locala = g(paramh);
      if (!a.e())
      {
        paramh = a;
        return paramh;
      }
      i();
      Iterator localIterator = b.iterator();
      while (localIterator.hasNext())
      {
        paramh = (b)localIterator.next();
        c.f();
        e = n.e;
        k.log(Level.FINE, "Child balancer {0} deleted", a);
      }
      paramh = a;
      return paramh;
    }
    finally
    {
      h = false;
    }
  }
  
  public final void c(e1 parame1)
  {
    if (j != n.b) {
      g.f(n.c, new k0.d(k0.f.a(parame1)));
    }
  }
  
  public final void f()
  {
    k.log(Level.FINE, "Shutdown");
    Iterator localIterator = f.values().iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      c.f();
      e = n.e;
      k.log(Level.FINE, "Child balancer {0} deleted", a);
    }
    f.clear();
  }
  
  public final a g(k0.h paramh)
  {
    k.log(Level.FINE, "Received resolution result: {0}", paramh);
    HashMap localHashMap = new HashMap();
    Iterator localIterator = a.iterator();
    Object localObject1;
    while (localIterator.hasNext())
    {
      localObject1 = new c((u)localIterator.next());
      localObject2 = (b)f.get(localObject1);
      if (localObject2 == null)
      {
        localObject2 = new k0.d(k0.f.e);
        localObject2 = new b((c)localObject1, i, (k0.d)localObject2);
      }
      localHashMap.put(localObject1, localObject2);
    }
    if (localHashMap.isEmpty())
    {
      localObject1 = e1.n;
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("NameResolver returned no usable address. ");
      ((StringBuilder)localObject2).append(paramh);
      paramh = ((e1)localObject1).g(((StringBuilder)localObject2).toString());
      c(paramh);
      return new a(paramh, null);
    }
    localIterator = localHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      localObject2 = (Map.Entry)localIterator.next();
      Object localObject3 = ((Map.Entry)localObject2).getKey();
      localObject1 = getValued;
      Object localObject4 = getValueb;
      if (!f.containsKey(localObject3))
      {
        f.put(localObject3, (b)((Map.Entry)localObject2).getValue());
      }
      else
      {
        localObject2 = (b)f.get(localObject3);
        if (g) {
          g = false;
        }
      }
      b localb = (b)f.get(localObject3);
      if ((localObject3 instanceof u))
      {
        localObject2 = new c((u)localObject3);
      }
      else
      {
        x6.b.s("key is wrong type", localObject3 instanceof c);
        localObject2 = (c)localObject3;
      }
      Object localObject5 = a.iterator();
      while (((Iterator)localObject5).hasNext())
      {
        localObject1 = (u)((Iterator)localObject5).next();
        if (((c)localObject2).equals(new c((u)localObject1)))
        {
          localObject2 = localObject1;
          break label436;
        }
      }
      localObject2 = null;
      label436:
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append(localObject3);
      ((StringBuilder)localObject1).append(" no longer present in load balancer children");
      x6.b.y(localObject2, ((StringBuilder)localObject1).toString());
      localObject1 = eb.a.b;
      localObject2 = Collections.singletonList(localObject2);
      eb.a locala = eb.a.b;
      localObject5 = k0.e;
      Object localObject6 = Boolean.TRUE;
      localObject1 = new IdentityHashMap(1);
      ((IdentityHashMap)localObject1).put(localObject5, localObject6);
      localObject5 = a.entrySet().iterator();
      while (((Iterator)localObject5).hasNext())
      {
        localObject6 = (Map.Entry)((Iterator)localObject5).next();
        if (!((IdentityHashMap)localObject1).containsKey(((Map.Entry)localObject6).getKey())) {
          ((IdentityHashMap)localObject1).put((a.b)((Map.Entry)localObject6).getKey(), ((Map.Entry)localObject6).getValue());
        }
      }
      localObject2 = new k0.h((List)localObject2, new eb.a((IdentityHashMap)localObject1), localObject4);
      ((b)f.get(localObject3)).getClass();
      if (!g) {
        c.d((k0.h)localObject2);
      }
    }
    Object localObject2 = new ArrayList();
    paramh = t.p(f.keySet()).r(0);
    while (paramh.hasNext())
    {
      localObject1 = paramh.next();
      if (!localHashMap.containsKey(localObject1))
      {
        localObject1 = (b)f.get(localObject1);
        if (!g)
        {
          h.f.remove(a);
          g = true;
          k.log(Level.FINE, "Child balancer {0} deactivated", a);
        }
        ((ArrayList)localObject2).add(localObject1);
      }
    }
    return new a(e1.e, (ArrayList)localObject2);
  }
  
  public abstract k0.j h();
  
  public void i()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = f.values().iterator();
    Object localObject1 = null;
    while (localIterator.hasNext())
    {
      Object localObject2 = (b)localIterator.next();
      if (!g)
      {
        localHashMap.put(a, f);
        n localn1 = e;
        if (localObject1 == null)
        {
          localObject1 = localn1;
        }
        else
        {
          n localn2 = n.b;
          localObject2 = localn2;
          if (localObject1 != localn2) {
            if (localn1 == localn2)
            {
              localObject2 = localn2;
            }
            else
            {
              localn2 = n.a;
              localObject2 = localn2;
              if (localObject1 != localn2) {
                if (localn1 == localn2)
                {
                  localObject2 = localn2;
                }
                else
                {
                  localn2 = n.d;
                  localObject2 = localn2;
                  if (localObject1 != localn2)
                  {
                    if (localn1 != localn2) {
                      continue;
                    }
                    localObject2 = localn2;
                  }
                }
              }
            }
          }
          localObject1 = localObject2;
        }
      }
    }
    if (localObject1 != null)
    {
      g.f((n)localObject1, h());
      j = ((n)localObject1);
    }
  }
  
  public static final class a
  {
    public final e1 a;
    public final List<h.b> b;
    
    public a(e1 parame1, ArrayList paramArrayList)
    {
      a = parame1;
      b = paramArrayList;
    }
  }
  
  public final class b
  {
    public final Object a;
    public final Object b;
    public final e c;
    public final l0 d;
    public n e;
    public k0.j f;
    public boolean g;
    
    public b(h.c paramc, r2 paramr2, k0.d paramd)
    {
      a = paramc;
      d = paramr2;
      g = false;
      f = paramd;
      b = null;
      this$1 = new e(new a());
      c = h.this;
      e = n.a;
      i(paramr2);
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("Address = ");
      localStringBuilder.append(a);
      localStringBuilder.append(", state = ");
      localStringBuilder.append(e);
      localStringBuilder.append(", picker type: ");
      localStringBuilder.append(f.getClass());
      localStringBuilder.append(", lb: ");
      localStringBuilder.append(c.g().getClass());
      String str;
      if (g) {
        str = ", deactivated";
      } else {
        str = "";
      }
      localStringBuilder.append(str);
      return localStringBuilder.toString();
    }
    
    public final class a
      extends c
    {
      public a() {}
      
      public final void f(n paramn, k0.j paramj)
      {
        h.b localb = h.b.this;
        if (!h.f.containsKey(a)) {
          return;
        }
        localb = h.b.this;
        e = paramn;
        f = paramj;
        if ((!g) && (!h.h))
        {
          if (paramn == n.d) {
            c.e();
          }
          i();
        }
      }
      
      public final k0.e g()
      {
        return g;
      }
    }
  }
  
  public static final class c
  {
    public final String[] a;
    public final int b;
    
    public c(u paramu)
    {
      x6.b.y(paramu, "eag");
      a = new String[a.size()];
      paramu = a.iterator();
      for (int i = 0; paramu.hasNext(); i++)
      {
        SocketAddress localSocketAddress = (SocketAddress)paramu.next();
        a[i] = localSocketAddress.toString();
      }
      Arrays.sort(a);
      b = Arrays.hashCode(a);
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (paramObject == null) {
        return false;
      }
      if (!(paramObject instanceof c)) {
        return false;
      }
      paramObject = (c)paramObject;
      if (b == b)
      {
        String[] arrayOfString = a;
        int i = arrayOfString.length;
        paramObject = a;
        if (i == paramObject.length) {
          return Arrays.equals(arrayOfString, (Object[])paramObject);
        }
      }
      return false;
    }
    
    public final int hashCode()
    {
      return b;
    }
    
    public final String toString()
    {
      return Arrays.toString(a);
    }
  }
}

/* Location:
 * Qualified Name:     nb.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */