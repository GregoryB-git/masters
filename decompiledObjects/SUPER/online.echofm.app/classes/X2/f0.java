package X2;

import java.util.ListIterator;

public abstract class f0
  extends e0
  implements ListIterator
{
  public f0(ListIterator paramListIterator)
  {
    super(paramListIterator);
  }
  
  public void add(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  public final ListIterator d()
  {
    return (ListIterator)o;
  }
  
  public final boolean hasPrevious()
  {
    return d().hasPrevious();
  }
  
  public final int nextIndex()
  {
    return d().nextIndex();
  }
  
  public final Object previous()
  {
    return b(d().previous());
  }
  
  public final int previousIndex()
  {
    return d().previousIndex();
  }
  
  public void set(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     X2.f0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */