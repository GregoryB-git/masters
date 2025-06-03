package tb;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

public final class c$b<K, V>
  extends c.d<K, V>
  implements Iterator<Map.Entry<K, V>>
{
  public c$b(c<K, V> paramc)
  {
    super(paramc);
  }
  
  public final Object next()
  {
    a();
    int i = b;
    Object localObject = a;
    if (i < f)
    {
      b = (i + 1);
      c = i;
      localObject = new c.c((c)localObject, i);
      b();
      return localObject;
    }
    throw new NoSuchElementException();
  }
}

/* Location:
 * Qualified Name:     tb.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */