package gb;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;

public final class r1$m$e$b
  implements Runnable
{
  public r1$m$e$b(r1.m.e parame) {}
  
  public final void run()
  {
    r1.m.e locale = a;
    Object localObject = o.e.C;
    if (localObject != null)
    {
      ((Collection)localObject).remove(locale);
      if (a.o.e.C.isEmpty())
      {
        localObject = a.o.e;
        b0.c(D, false);
        localObject = a.o.e;
        C = null;
        if (H.get()) {
          a.o.e.G.a(r1.h0);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     gb.r1.m.e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */