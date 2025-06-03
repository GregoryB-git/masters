package n6;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class a
  implements b
{
  public final AtomicReference a;
  
  public a(b paramb)
  {
    a = new AtomicReference(paramb);
  }
  
  public Iterator iterator()
  {
    b localb = (b)a.getAndSet(null);
    if (localb != null) {
      return localb.iterator();
    }
    throw new IllegalStateException("This sequence can be consumed only once.");
  }
}

/* Location:
 * Qualified Name:     n6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */