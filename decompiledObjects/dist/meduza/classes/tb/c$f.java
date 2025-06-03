package tb;

import ec.i;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class c$f<K, V>
  extends c.d<K, V>
  implements Iterator<V>
{
  public c$f(c<K, V> paramc)
  {
    super(paramc);
  }
  
  public final V next()
  {
    a();
    int i = b;
    Object localObject = a;
    if (i < f)
    {
      b = (i + 1);
      c = i;
      localObject = b;
      i.b(localObject);
      localObject = localObject[c];
      b();
      return (V)localObject;
    }
    throw new NoSuchElementException();
  }
}

/* Location:
 * Qualified Name:     tb.c.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */