package o7;

import java.util.AbstractCollection;
import java.util.List;
import java.util.ListIterator;

public final class d$k$a
  extends d<K, V>.j.a
  implements ListIterator<V>
{
  public d$k$a(d.k paramk)
  {
    super(paramk);
  }
  
  public d$k$a(d.k paramk, int paramInt)
  {
    super(paramk, ((List)b).listIterator(paramInt));
  }
  
  public final void add(V paramV)
  {
    boolean bool = d.isEmpty();
    b().add(paramV);
    d.k localk = d;
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

/* Location:
 * Qualified Name:     o7.d.k.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */