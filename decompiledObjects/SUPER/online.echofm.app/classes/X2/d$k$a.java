package X2;

import java.util.AbstractCollection;
import java.util.List;
import java.util.ListIterator;

public class d$k$a
  extends d.j.a
  implements ListIterator
{
  public d$k$a(d.k paramk)
  {
    super(paramk);
  }
  
  public d$k$a(d.k paramk, int paramInt)
  {
    super(paramk, paramk.q().listIterator(paramInt));
  }
  
  public void add(Object paramObject)
  {
    boolean bool = r.isEmpty();
    e().add(paramObject);
    d.j(r.t);
    if (bool) {
      r.a();
    }
  }
  
  public final ListIterator e()
  {
    return (ListIterator)b();
  }
  
  public boolean hasPrevious()
  {
    return e().hasPrevious();
  }
  
  public int nextIndex()
  {
    return e().nextIndex();
  }
  
  public Object previous()
  {
    return e().previous();
  }
  
  public int previousIndex()
  {
    return e().previousIndex();
  }
  
  public void set(Object paramObject)
  {
    e().set(paramObject);
  }
}

/* Location:
 * Qualified Name:     X2.d.k.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */