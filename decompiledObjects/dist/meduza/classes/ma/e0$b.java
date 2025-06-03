package ma;

import java.util.Iterator;
import java.util.Map.Entry;

public final class e0$b<K>
  implements Iterator<Map.Entry<K, Object>>
{
  public Iterator<Map.Entry<K, Object>> a;
  
  public e0$b(Iterator<Map.Entry<K, Object>> paramIterator)
  {
    a = paramIterator;
  }
  
  public final boolean hasNext()
  {
    return a.hasNext();
  }
  
  public final Object next()
  {
    Map.Entry localEntry = (Map.Entry)a.next();
    Object localObject = localEntry;
    if ((localEntry.getValue() instanceof e0)) {
      localObject = new e0.a(localEntry);
    }
    return localObject;
  }
  
  public final void remove()
  {
    a.remove();
  }
}

/* Location:
 * Qualified Name:     ma.e0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */