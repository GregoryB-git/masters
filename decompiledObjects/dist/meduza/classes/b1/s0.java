package b1;

import java.io.Closeable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public final class s0
{
  public final LinkedHashMap a = new LinkedHashMap();
  
  public final void a()
  {
    Iterator localIterator1 = a.values().iterator();
    while (localIterator1.hasNext())
    {
      o0 localo0 = (o0)localIterator1.next();
      c = true;
      Object localObject3 = a;
      Iterator localIterator2;
      if (localObject3 != null) {
        try
        {
          localIterator2 = a.values().iterator();
          while (localIterator2.hasNext()) {
            o0.a(localIterator2.next());
          }
        }
        finally {}
      }
      localObject3 = b;
      if (localObject3 != null) {
        try
        {
          localIterator2 = b.iterator();
          while (localIterator2.hasNext()) {
            o0.a((Closeable)localIterator2.next());
          }
          b.clear();
        }
        finally {}
      }
      localo0.b();
    }
    a.clear();
  }
}

/* Location:
 * Qualified Name:     b1.s0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */