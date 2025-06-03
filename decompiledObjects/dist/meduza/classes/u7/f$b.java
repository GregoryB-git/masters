package u7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l6.b.a;
import r.b;

public final class f$b
  implements b.a
{
  public static AtomicReference<b> a = new AtomicReference();
  
  public final void a(boolean paramBoolean)
  {
    synchronized (f.k)
    {
      Object localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>(f.l.values());
      localObject2 = ((ArrayList)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        f localf = (f)((Iterator)localObject2).next();
        if (e.get()) {
          localf.l(paramBoolean);
        }
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     u7.f.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */