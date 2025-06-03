package hb;

import gb.h;
import gb.h.a;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class f
  implements Runnable
{
  public f(h.a parama) {}
  
  public final void run()
  {
    h.a locala = a;
    long l = a;
    l = Math.max(2L * l, l);
    if (b.b.compareAndSet(a, l)) {
      h.c.log(Level.WARNING, "Increased {0} to {1}", new Object[] { b.a, Long.valueOf(l) });
    }
  }
}

/* Location:
 * Qualified Name:     hb.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */