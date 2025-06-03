package X2;

import W2.m;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

public abstract class d$j
  extends AbstractCollection
{
  public final Object o;
  public Collection p;
  public final j q;
  public final Collection r;
  
  public d$j(d paramd, Object paramObject, Collection paramCollection, j paramj)
  {
    o = paramObject;
    p = paramCollection;
    q = paramj;
    if (paramj == null) {
      paramd = null;
    } else {
      paramd = paramj.f();
    }
    r = paramd;
  }
  
  public void a()
  {
    j localj = q;
    if (localj != null) {
      localj.a();
    } else {
      d.h(s).put(o, p);
    }
  }
  
  public boolean add(Object paramObject)
  {
    i();
    boolean bool1 = p.isEmpty();
    boolean bool2 = p.add(paramObject);
    if (bool2)
    {
      d.j(s);
      if (bool1) {
        a();
      }
    }
    return bool2;
  }
  
  public boolean addAll(Collection paramCollection)
  {
    if (paramCollection.isEmpty()) {
      return false;
    }
    int i = size();
    boolean bool = p.addAll(paramCollection);
    if (bool)
    {
      int j = p.size();
      d.l(s, j - i);
      if (i == 0) {
        a();
      }
    }
    return bool;
  }
  
  public void clear()
  {
    int i = size();
    if (i == 0) {
      return;
    }
    p.clear();
    d.m(s, i);
    k();
  }
  
  public boolean contains(Object paramObject)
  {
    i();
    return p.contains(paramObject);
  }
  
  public boolean containsAll(Collection paramCollection)
  {
    i();
    return p.containsAll(paramCollection);
  }
  
  public j d()
  {
    return q;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    i();
    return p.equals(paramObject);
  }
  
  public Collection f()
  {
    return p;
  }
  
  public Object g()
  {
    return o;
  }
  
  public int hashCode()
  {
    i();
    return p.hashCode();
  }
  
  public void i()
  {
    Object localObject = q;
    if (localObject != null)
    {
      ((j)localObject).i();
      if (q.f() != r) {
        throw new ConcurrentModificationException();
      }
    }
    else if (p.isEmpty())
    {
      localObject = (Collection)d.h(s).get(o);
      if (localObject != null) {
        p = ((Collection)localObject);
      }
    }
  }
  
  public Iterator iterator()
  {
    i();
    return new a();
  }
  
  public void k()
  {
    j localj = q;
    if (localj != null) {
      localj.k();
    } else if (p.isEmpty()) {
      d.h(s).remove(o);
    }
  }
  
  public boolean remove(Object paramObject)
  {
    i();
    boolean bool = p.remove(paramObject);
    if (bool)
    {
      d.k(s);
      k();
    }
    return bool;
  }
  
  public boolean removeAll(Collection paramCollection)
  {
    if (paramCollection.isEmpty()) {
      return false;
    }
    int i = size();
    boolean bool = p.removeAll(paramCollection);
    if (bool)
    {
      int j = p.size();
      d.l(s, j - i);
      k();
    }
    return bool;
  }
  
  public boolean retainAll(Collection paramCollection)
  {
    m.j(paramCollection);
    int i = size();
    boolean bool = p.retainAll(paramCollection);
    if (bool)
    {
      int j = p.size();
      d.l(s, j - i);
      k();
    }
    return bool;
  }
  
  public int size()
  {
    i();
    return p.size();
  }
  
  public String toString()
  {
    i();
    return p.toString();
  }
  
  public class a
    implements Iterator
  {
    public final Iterator o;
    public final Collection p;
    
    public a()
    {
      this$1 = p;
      p = d.j.this;
      o = d.i(d.j.this);
    }
    
    public a(Iterator paramIterator)
    {
      p = p;
      o = paramIterator;
    }
    
    public Iterator b()
    {
      d();
      return o;
    }
    
    public void d()
    {
      i();
      if (p == p) {
        return;
      }
      throw new ConcurrentModificationException();
    }
    
    public boolean hasNext()
    {
      d();
      return o.hasNext();
    }
    
    public Object next()
    {
      d();
      return o.next();
    }
    
    public void remove()
    {
      o.remove();
      d.k(s);
      k();
    }
  }
}

/* Location:
 * Qualified Name:     X2.d.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */