package o7;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class d$k
  extends d<K, V>.j
  implements List<V>
{
  public d$k(K paramK, List<V> paramList, d<K, V>.j paramd)
  {
    super(paramK, paramList, paramd, localj);
  }
  
  public final void add(int paramInt, V paramV)
  {
    h();
    boolean bool = b.isEmpty();
    ((List)b).add(paramInt, paramV);
    paramV = f;
    e += 1;
    if (bool) {
      a();
    }
  }
  
  public final boolean addAll(int paramInt, Collection<? extends V> paramCollection)
  {
    if (paramCollection.isEmpty()) {
      return false;
    }
    int i = size();
    boolean bool = ((List)b).addAll(paramInt, paramCollection);
    if (bool)
    {
      paramInt = b.size();
      paramCollection = f;
      e += paramInt - i;
      if (i == 0) {
        a();
      }
    }
    return bool;
  }
  
  public final V get(int paramInt)
  {
    h();
    return (V)((List)b).get(paramInt);
  }
  
  public final int indexOf(Object paramObject)
  {
    h();
    return ((List)b).indexOf(paramObject);
  }
  
  public final int lastIndexOf(Object paramObject)
  {
    h();
    return ((List)b).lastIndexOf(paramObject);
  }
  
  public final ListIterator<V> listIterator()
  {
    h();
    return new a();
  }
  
  public final ListIterator<V> listIterator(int paramInt)
  {
    h();
    return new a(paramInt);
  }
  
  public final V remove(int paramInt)
  {
    h();
    Object localObject = ((List)b).remove(paramInt);
    d locald = f;
    e -= 1;
    i();
    return (V)localObject;
  }
  
  public final V set(int paramInt, V paramV)
  {
    h();
    return (V)((List)b).set(paramInt, paramV);
  }
  
  public final List<V> subList(int paramInt1, int paramInt2)
  {
    h();
    d locald = f;
    Object localObject1 = a;
    List localList = ((List)b).subList(paramInt1, paramInt2);
    d.j localj = c;
    Object localObject2 = localj;
    if (localj == null) {
      localObject2 = this;
    }
    locald.getClass();
    if ((localList instanceof RandomAccess)) {
      localObject2 = new d.g(locald, localObject1, localList, (d.j)localObject2);
    } else {
      localObject2 = new k(locald, localObject1, localList, (d.j)localObject2);
    }
    return (List<V>)localObject2;
  }
  
  public final class a
    extends d<K, V>.j.a
    implements ListIterator<V>
  {
    public a()
    {
      super();
    }
    
    public a(int paramInt)
    {
      super(((List)b).listIterator(paramInt));
    }
    
    public final void add(V paramV)
    {
      boolean bool = isEmpty();
      b().add(paramV);
      d.k localk = d.k.this;
      paramV = f;
      e += 1;
      if (bool) {
        localk.a();
      }
    }
    
    public final ListIterator<V> b()
    {
      a();
      return (ListIterator)a;
    }
    
    public final boolean hasPrevious()
    {
      return b().hasPrevious();
    }
    
    public final int nextIndex()
    {
      return b().nextIndex();
    }
    
    public final V previous()
    {
      return (V)b().previous();
    }
    
    public final int previousIndex()
    {
      return b().previousIndex();
    }
    
    public final void set(V paramV)
    {
      b().set(paramV);
    }
  }
}

/* Location:
 * Qualified Name:     o7.d.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */