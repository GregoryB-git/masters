package s0;

import java.util.List;
import java.util.ListIterator;

public final class k1$a
  implements ListIterator<String>
{
  public ListIterator<String> a;
  
  public k1$a(k1 paramk1, int paramInt)
  {
    a = a.listIterator(paramInt);
  }
  
  public final void add(Object paramObject)
  {
    paramObject = (String)paramObject;
    throw new UnsupportedOperationException();
  }
  
  public final boolean hasNext()
  {
    return a.hasNext();
  }
  
  public final boolean hasPrevious()
  {
    return a.hasPrevious();
  }
  
  public final Object next()
  {
    return (String)a.next();
  }
  
  public final int nextIndex()
  {
    return a.nextIndex();
  }
  
  public final Object previous()
  {
    return (String)a.previous();
  }
  
  public final int previousIndex()
  {
    return a.previousIndex();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
  
  public final void set(Object paramObject)
  {
    paramObject = (String)paramObject;
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     s0.k1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */