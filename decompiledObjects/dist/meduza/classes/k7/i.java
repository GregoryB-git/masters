package k7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

public final class i
  extends e
{
  public i(n paramn) {}
  
  public final void a()
  {
    synchronized (b.f)
    {
      if ((b.k.get() > 0) && (b.k.decrementAndGet() > 0))
      {
        b.b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
        return;
      }
      n localn = b;
      if (m != null)
      {
        b.a("Unbind from service.", new Object[0]);
        localn = b;
        a.unbindService(l);
        localn = b;
        g = false;
        m = null;
        l = null;
      }
    }
    b.c();
    return;
    throw ((Throwable)localObject2);
  }
}

/* Location:
 * Qualified Name:     k7.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */