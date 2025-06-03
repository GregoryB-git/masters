package n;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public class b
  implements Iterable
{
  public c o;
  public c p;
  public WeakHashMap q = new WeakHashMap();
  public int r = 0;
  
  public Map.Entry a()
  {
    return o;
  }
  
  public c d(Object paramObject)
  {
    for (c localc = o; (localc != null) && (!o.equals(paramObject)); localc = q) {}
    return localc;
  }
  
  public Iterator descendingIterator()
  {
    b localb = new b(p, o);
    q.put(localb, Boolean.FALSE);
    return localb;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    Object localObject1 = (b)paramObject;
    if (size() != ((b)localObject1).size()) {
      return false;
    }
    paramObject = iterator();
    localObject1 = ((b)localObject1).iterator();
    while ((((Iterator)paramObject).hasNext()) && (((Iterator)localObject1).hasNext()))
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)paramObject).next();
      Object localObject2 = ((Iterator)localObject1).next();
      if (((localEntry == null) && (localObject2 != null)) || ((localEntry != null) && (!localEntry.equals(localObject2)))) {
        return false;
      }
    }
    if ((((Iterator)paramObject).hasNext()) || (((Iterator)localObject1).hasNext())) {
      bool = false;
    }
    return bool;
  }
  
  public d f()
  {
    d locald = new d();
    q.put(locald, Boolean.FALSE);
    return locald;
  }
  
  public Map.Entry g()
  {
    return p;
  }
  
  public int hashCode()
  {
    Iterator localIterator = iterator();
    int i = 0;
    while (localIterator.hasNext()) {
      i += ((Map.Entry)localIterator.next()).hashCode();
    }
    return i;
  }
  
  public c i(Object paramObject1, Object paramObject2)
  {
    paramObject2 = new c(paramObject1, paramObject2);
    r += 1;
    paramObject1 = p;
    if (paramObject1 == null) {
      o = ((c)paramObject2);
    }
    for (;;)
    {
      p = ((c)paramObject2);
      return (c)paramObject2;
      q = ((c)paramObject2);
      r = ((c)paramObject1);
    }
  }
  
  public Iterator iterator()
  {
    a locala = new a(o, p);
    q.put(locala, Boolean.FALSE);
    return locala;
  }
  
  public Object k(Object paramObject1, Object paramObject2)
  {
    c localc = d(paramObject1);
    if (localc != null) {
      return p;
    }
    i(paramObject1, paramObject2);
    return null;
  }
  
  public Object q(Object paramObject)
  {
    paramObject = d(paramObject);
    if (paramObject == null) {
      return null;
    }
    r -= 1;
    if (!q.isEmpty())
    {
      localObject = q.keySet().iterator();
      while (((Iterator)localObject).hasNext()) {
        ((f)((Iterator)localObject).next()).b((c)paramObject);
      }
    }
    Object localObject = r;
    c localc = q;
    if (localObject != null) {
      q = localc;
    } else {
      o = localc;
    }
    localc = q;
    if (localc != null) {
      r = ((c)localObject);
    } else {
      p = ((c)localObject);
    }
    q = null;
    r = null;
    return p;
  }
  
  public int size()
  {
    return r;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      localStringBuilder.append(((Map.Entry)localIterator.next()).toString());
      if (localIterator.hasNext()) {
        localStringBuilder.append(", ");
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public static class a
    extends b.e
  {
    public a(b.c paramc1, b.c paramc2)
    {
      super(paramc2);
    }
    
    public b.c d(b.c paramc)
    {
      return r;
    }
    
    public b.c e(b.c paramc)
    {
      return q;
    }
  }
  
  public static class b
    extends b.e
  {
    public b(b.c paramc1, b.c paramc2)
    {
      super(paramc2);
    }
    
    public b.c d(b.c paramc)
    {
      return q;
    }
    
    public b.c e(b.c paramc)
    {
      return r;
    }
  }
  
  public static class c
    implements Map.Entry
  {
    public final Object o;
    public final Object p;
    public c q;
    public c r;
    
    public c(Object paramObject1, Object paramObject2)
    {
      o = paramObject1;
      p = paramObject2;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (paramObject == this) {
        return true;
      }
      if (!(paramObject instanceof c)) {
        return false;
      }
      paramObject = (c)paramObject;
      if ((!o.equals(o)) || (!p.equals(p))) {
        bool = false;
      }
      return bool;
    }
    
    public Object getKey()
    {
      return o;
    }
    
    public Object getValue()
    {
      return p;
    }
    
    public int hashCode()
    {
      return o.hashCode() ^ p.hashCode();
    }
    
    public Object setValue(Object paramObject)
    {
      throw new UnsupportedOperationException("An entry modification is not supported");
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(o);
      localStringBuilder.append("=");
      localStringBuilder.append(p);
      return localStringBuilder.toString();
    }
  }
  
  public class d
    implements Iterator, b.f
  {
    public b.c o;
    public boolean p = true;
    
    public d() {}
    
    public void b(b.c paramc)
    {
      b.c localc = o;
      if (paramc == localc)
      {
        paramc = r;
        o = paramc;
        boolean bool;
        if (paramc == null) {
          bool = true;
        } else {
          bool = false;
        }
        p = bool;
      }
    }
    
    public Map.Entry d()
    {
      b.c localc;
      if (p)
      {
        p = false;
        localc = o;
      }
      for (;;)
      {
        o = localc;
        break;
        localc = o;
        if (localc != null) {
          localc = q;
        } else {
          localc = null;
        }
      }
      return o;
    }
    
    public boolean hasNext()
    {
      boolean bool1 = p;
      boolean bool2 = false;
      boolean bool3 = false;
      if (bool1)
      {
        if (o != null) {
          bool3 = true;
        }
        return bool3;
      }
      b.c localc = o;
      bool3 = bool2;
      if (localc != null)
      {
        bool3 = bool2;
        if (q != null) {
          bool3 = true;
        }
      }
      return bool3;
    }
  }
  
  public static abstract class e
    implements Iterator, b.f
  {
    public b.c o;
    public b.c p;
    
    public e(b.c paramc1, b.c paramc2)
    {
      o = paramc2;
      p = paramc1;
    }
    
    public void b(b.c paramc)
    {
      if ((o == paramc) && (paramc == p))
      {
        p = null;
        o = null;
      }
      b.c localc = o;
      if (localc == paramc) {
        o = d(localc);
      }
      if (p == paramc) {
        p = g();
      }
    }
    
    public abstract b.c d(b.c paramc);
    
    public abstract b.c e(b.c paramc);
    
    public Map.Entry f()
    {
      b.c localc = p;
      p = g();
      return localc;
    }
    
    public final b.c g()
    {
      b.c localc1 = p;
      b.c localc2 = o;
      if ((localc1 != localc2) && (localc2 != null)) {
        return e(localc1);
      }
      return null;
    }
    
    public boolean hasNext()
    {
      boolean bool;
      if (p != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public static abstract interface f
  {
    public abstract void b(b.c paramc);
  }
}

/* Location:
 * Qualified Name:     n.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */