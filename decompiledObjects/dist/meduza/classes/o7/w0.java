package o7;

import java.util.Iterator;
import java.util.Map.Entry;

public abstract class w0<F, T>
  implements Iterator<T>
{
  public final Iterator<? extends F> a;
  
  public w0(Iterator<? extends F> paramIterator)
  {
    paramIterator.getClass();
    a = paramIterator;
  }
  
  public final boolean hasNext()
  {
    return a.hasNext();
  }
  
  public final T next()
  {
    return (T)((Map.Entry)a.next()).getValue();
  }
  
  public final void remove()
  {
    a.remove();
  }
}

/* Location:
 * Qualified Name:     o7.w0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */