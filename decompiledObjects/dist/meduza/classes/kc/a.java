package kc;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class a<T>
  implements b<T>
{
  public final AtomicReference<b<T>> a;
  
  public a(f paramf)
  {
    a = new AtomicReference(paramf);
  }
  
  public final Iterator<T> iterator()
  {
    b localb = (b)a.getAndSet(null);
    if (localb != null) {
      return localb.iterator();
    }
    throw new IllegalStateException("This sequence can be consumed only once.");
  }
}

/* Location:
 * Qualified Name:     kc.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */