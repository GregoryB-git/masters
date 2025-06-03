package tb;

import ec.i;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import sb.e;

public final class f<V>
  extends e<V>
{
  public final c<?, V> a;
  
  public f(c<?, V> paramc)
  {
    a = paramc;
  }
  
  public final boolean add(V paramV)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean addAll(Collection<? extends V> paramCollection)
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
    return a.containsValue(paramObject);
  }
  
  public final boolean isEmpty()
  {
    return a.isEmpty();
  }
  
  public final Iterator<V> iterator()
  {
    c localc = a;
    localc.getClass();
    return new c.f(localc);
  }
  
  public final boolean remove(Object paramObject)
  {
    c localc = a;
    localc.c();
    int i = f;
    int k;
    Object[] arrayOfObject;
    do
    {
      do
      {
        int j = -1;
        k = i - 1;
        i = j;
        if (k < 0) {
          break;
        }
        i = k;
      } while (c[k] < 0);
      arrayOfObject = b;
      i.b(arrayOfObject);
      i = k;
    } while (!i.a(arrayOfObject[k], paramObject));
    i = k;
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
 * Qualified Name:     tb.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */