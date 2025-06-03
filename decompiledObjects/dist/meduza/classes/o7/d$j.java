package o7;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class d$j
  extends AbstractCollection<V>
{
  public final K a;
  public Collection<V> b;
  public final d<K, V>.j c;
  public final Collection<V> d;
  
  public d$j(K paramK, Collection<V> paramCollection, d<K, V>.j paramd)
  {
    a = paramCollection;
    b = paramd;
    j localj;
    c = localj;
    if (localj == null) {
      paramK = null;
    } else {
      paramK = b;
    }
    d = paramK;
  }
  
  public final void a()
  {
    j localj = c;
    if (localj != null) {
      localj.a();
    } else {
      e.d.put(a, b);
    }
  }
  
  public final boolean add(V paramV)
  {
    h();
    boolean bool1 = b.isEmpty();
    boolean bool2 = b.add(paramV);
    if (bool2)
    {
      paramV = e;
      e += 1;
      if (bool1) {
        a();
      }
    }
    return bool2;
  }
  
  public final boolean addAll(Collection<? extends V> paramCollection)
  {
    if (paramCollection.isEmpty()) {
      return false;
    }
    int i = size();
    boolean bool = b.addAll(paramCollection);
    if (bool)
    {
      int j = b.size();
      paramCollection = e;
      e += j - i;
      if (i == 0) {
        a();
      }
    }
    return bool;
  }
  
  public final void clear()
  {
    int i = size();
    if (i == 0) {
      return;
    }
    b.clear();
    d locald = e;
    e -= i;
    i();
  }
  
  public final boolean contains(Object paramObject)
  {
    h();
    return b.contains(paramObject);
  }
  
  public final boolean containsAll(Collection<?> paramCollection)
  {
    h();
    return b.containsAll(paramCollection);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    h();
    return b.equals(paramObject);
  }
  
  public final void h()
  {
    Object localObject = c;
    if (localObject != null)
    {
      ((j)localObject).h();
      if (c.b != d) {
        throw new ConcurrentModificationException();
      }
    }
    else if (b.isEmpty())
    {
      localObject = (Collection)e.d.get(a);
      if (localObject != null) {
        b = ((Collection)localObject);
      }
    }
  }
  
  public final int hashCode()
  {
    h();
    return b.hashCode();
  }
  
  public final void i()
  {
    j localj = c;
    if (localj != null) {
      localj.i();
    } else if (b.isEmpty()) {
      e.d.remove(a);
    }
  }
  
  public final Iterator<V> iterator()
  {
    h();
    return new a();
  }
  
  public final boolean remove(Object paramObject)
  {
    h();
    boolean bool = b.remove(paramObject);
    if (bool)
    {
      paramObject = e;
      e -= 1;
      i();
    }
    return bool;
  }
  
  public final boolean removeAll(Collection<?> paramCollection)
  {
    if (paramCollection.isEmpty()) {
      return false;
    }
    int i = size();
    boolean bool = b.removeAll(paramCollection);
    if (bool)
    {
      int j = b.size();
      paramCollection = e;
      e += j - i;
      i();
    }
    return bool;
  }
  
  public final boolean retainAll(Collection<?> paramCollection)
  {
    paramCollection.getClass();
    int i = size();
    boolean bool = b.retainAll(paramCollection);
    if (bool)
    {
      int j = b.size();
      paramCollection = e;
      e += j - i;
      i();
    }
    return bool;
  }
  
  public final int size()
  {
    h();
    return b.size();
  }
  
  public final String toString()
  {
    h();
    return b.toString();
  }
  
  public class a
    implements Iterator<V>
  {
    public final Iterator<V> a;
    public final Collection<V> b;
    
    public a()
    {
      this$1 = b;
      b = d.j.this;
      if ((d.j.this instanceof List)) {
        this$1 = ((List)d.j.this).listIterator();
      } else {
        this$1 = iterator();
      }
      a = d.j.this;
    }
    
    public a(ListIterator paramListIterator)
    {
      b = b;
      a = paramListIterator;
    }
    
    public final void a()
    {
      h();
      if (b == b) {
        return;
      }
      throw new ConcurrentModificationException();
    }
    
    public final boolean hasNext()
    {
      a();
      return a.hasNext();
    }
    
    public final V next()
    {
      a();
      return (V)a.next();
    }
    
    public final void remove()
    {
      a.remove();
      d.j localj = d.j.this;
      d locald = e;
      e -= 1;
      localj.i();
    }
  }
}

/* Location:
 * Qualified Name:     o7.d.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */