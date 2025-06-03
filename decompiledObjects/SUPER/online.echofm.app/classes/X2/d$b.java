package X2;

import W2.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

public class d$b
  extends G.f
{
  public final transient Map q;
  
  public d$b(d paramd, Map paramMap)
  {
    q = paramMap;
  }
  
  public Set a()
  {
    return new a();
  }
  
  public Collection c(Object paramObject)
  {
    Collection localCollection = (Collection)G.i(q, paramObject);
    if (localCollection == null) {
      return null;
    }
    return r.x(paramObject, localCollection);
  }
  
  public void clear()
  {
    if (q == d.h(r)) {
      r.clear();
    } else {
      C.c(new b());
    }
  }
  
  public boolean containsKey(Object paramObject)
  {
    return G.h(q, paramObject);
  }
  
  public Collection d(Object paramObject)
  {
    Collection localCollection = (Collection)q.remove(paramObject);
    if (localCollection == null) {
      return null;
    }
    paramObject = r.p();
    ((Collection)paramObject).addAll(localCollection);
    d.m(r, localCollection.size());
    localCollection.clear();
    return (Collection)paramObject;
  }
  
  public Map.Entry e(Map.Entry paramEntry)
  {
    Object localObject = paramEntry.getKey();
    return G.d(localObject, r.x(localObject, (Collection)paramEntry.getValue()));
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if ((this != paramObject) && (!q.equals(paramObject))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return q.hashCode();
  }
  
  public Set keySet()
  {
    return r.f();
  }
  
  public int size()
  {
    return q.size();
  }
  
  public String toString()
  {
    return q.toString();
  }
  
  public class a
    extends G.c
  {
    public a() {}
    
    public Map a()
    {
      return d.b.this;
    }
    
    public boolean contains(Object paramObject)
    {
      return j.c(q.entrySet(), paramObject);
    }
    
    public Iterator iterator()
    {
      return new d.b.b(d.b.this);
    }
    
    public boolean remove(Object paramObject)
    {
      if (!contains(paramObject)) {
        return false;
      }
      paramObject = (Map.Entry)paramObject;
      Objects.requireNonNull(paramObject);
      paramObject = (Map.Entry)paramObject;
      d.n(r, ((Map.Entry)paramObject).getKey());
      return true;
    }
  }
  
  public class b
    implements Iterator
  {
    public final Iterator o = q.entrySet().iterator();
    public Collection p;
    
    public b() {}
    
    public Map.Entry b()
    {
      Map.Entry localEntry = (Map.Entry)o.next();
      p = ((Collection)localEntry.getValue());
      return e(localEntry);
    }
    
    public boolean hasNext()
    {
      return o.hasNext();
    }
    
    public void remove()
    {
      boolean bool;
      if (p != null) {
        bool = true;
      } else {
        bool = false;
      }
      m.p(bool, "no calls to next() since the last call to remove()");
      o.remove();
      d.m(r, p.size());
      p.clear();
      p = null;
    }
  }
}

/* Location:
 * Qualified Name:     X2.d.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */