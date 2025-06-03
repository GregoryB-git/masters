package tb;

import ec.i;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

public final class d<K, V>
  extends a<Map.Entry<K, V>, K, V>
{
  public final c<K, V> a;
  
  public d(c<K, V> paramc)
  {
    a = paramc;
  }
  
  public final int a()
  {
    return a.q;
  }
  
  public final boolean add(Object paramObject)
  {
    i.e((Map.Entry)paramObject, "element");
    throw new UnsupportedOperationException();
  }
  
  public final boolean addAll(Collection<? extends Map.Entry<K, V>> paramCollection)
  {
    i.e(paramCollection, "elements");
    throw new UnsupportedOperationException();
  }
  
  public final void clear()
  {
    a.clear();
  }
  
  public final boolean containsAll(Collection<? extends Object> paramCollection)
  {
    i.e(paramCollection, "elements");
    return a.e(paramCollection);
  }
  
  public final boolean isEmpty()
  {
    return a.isEmpty();
  }
  
  public final Iterator<Map.Entry<K, V>> iterator()
  {
    c localc = a;
    localc.getClass();
    return new c.b(localc);
  }
  
  public final boolean removeAll(Collection<? extends Object> paramCollection)
  {
    i.e(paramCollection, "elements");
    a.c();
    return super.removeAll(paramCollection);
  }
  
  public final boolean retainAll(Collection<? extends Object> paramCollection)
  {
    i.e(paramCollection, "elements");
    a.c();
    return super.retainAll(paramCollection);
  }
}

/* Location:
 * Qualified Name:     tb.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */