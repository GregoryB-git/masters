package o7;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class f<K, V>
  implements f0<K, V>
{
  public transient Set<K> a;
  public transient Collection<V> b;
  public transient Map<K, Collection<V>> c;
  
  public abstract Map<K, Collection<V>> a();
  
  public boolean b(Object paramObject)
  {
    Iterator localIterator = a().values().iterator();
    while (localIterator.hasNext()) {
      if (((Collection)localIterator.next()).contains(paramObject)) {
        return true;
      }
    }
    return false;
  }
  
  public abstract Map<K, Collection<V>> c();
  
  public abstract Set<K> d();
  
  public abstract Iterator<V> e();
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (paramObject == this)
    {
      bool = true;
    }
    else if ((paramObject instanceof f0))
    {
      paramObject = (f0)paramObject;
      bool = a().equals(((f0)paramObject).a());
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    return a().hashCode();
  }
  
  public final String toString()
  {
    return a().toString();
  }
  
  public final class a
    extends AbstractCollection<V>
  {
    public a() {}
    
    public final void clear()
    {
      f.this.clear();
    }
    
    public final boolean contains(Object paramObject)
    {
      return b(paramObject);
    }
    
    public final Iterator<V> iterator()
    {
      return e();
    }
    
    public final int size()
    {
      return f.this.size();
    }
  }
}

/* Location:
 * Qualified Name:     o7.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */