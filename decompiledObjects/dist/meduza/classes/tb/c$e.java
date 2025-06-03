package tb;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class c$e<K, V>
  extends c.d<K, V>
  implements Iterator<K>
{
  public c$e(c<K, V> paramc)
  {
    super(paramc);
  }
  
  public final K next()
  {
    a();
    int i = b;
    Object localObject = a;
    if (i < f)
    {
      b = (i + 1);
      c = i;
      localObject = a[i];
      b();
      return (K)localObject;
    }
    throw new NoSuchElementException();
  }
}

/* Location:
 * Qualified Name:     tb.c.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */