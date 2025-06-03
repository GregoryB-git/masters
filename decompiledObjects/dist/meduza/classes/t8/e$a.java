package t8;

import java.util.Iterator;
import java.util.Map.Entry;

public final class e$a<T>
  implements Iterator<T>
{
  public final Iterator<Map.Entry<T, Void>> a;
  
  public e$a(Iterator<Map.Entry<T, Void>> paramIterator)
  {
    a = paramIterator;
  }
  
  public final boolean hasNext()
  {
    return a.hasNext();
  }
  
  public final T next()
  {
    return (T)((Map.Entry)a.next()).getKey();
  }
  
  public final void remove()
  {
    a.remove();
  }
}

/* Location:
 * Qualified Name:     t8.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */