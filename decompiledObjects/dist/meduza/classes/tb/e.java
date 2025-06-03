package tb;

import ec.i;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import sb.g;

public final class e<E>
  extends g<E>
{
  public final c<E, ?> a;
  
  public e(c<E, ?> paramc)
  {
    a = paramc;
  }
  
  public final int a()
  {
    return a.q;
  }
  
  public final boolean add(E paramE)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean addAll(Collection<? extends E> paramCollection)
  {
    i.e(paramCollection, "elements");
    throw new UnsupportedOperationException();
  }
  
  public final void clear()
  {
    a.clear();
  }
  
  public final boolean contains(Object paramObject)
  {
    return a.containsKey(paramObject);
  }
  
  public final boolean isEmpty()
  {
    return a.isEmpty();
  }
  
  public final Iterator<E> iterator()
  {
    c localc = a;
    localc.getClass();
    return new c.e(localc);
  }
  
  public final boolean remove(Object paramObject)
  {
    c localc = a;
    localc.c();
    int i = localc.h(paramObject);
    boolean bool;
    if (i < 0)
    {
      bool = false;
    }
    else
    {
      localc.k(i);
      bool = true;
    }
    return bool;
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
 * Qualified Name:     tb.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */