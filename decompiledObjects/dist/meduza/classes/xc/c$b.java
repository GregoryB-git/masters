package xc;

import java.util.concurrent.locks.ReentrantLock;
import rb.h;

public final class c$b
  extends Thread
{
  public c$b()
  {
    super("Okio Watchdog");
    setDaemon(true);
  }
  
  public final void run()
  {
    try
    {
      for (;;)
      {
        ReentrantLock localReentrantLock = c.h;
        localReentrantLock.lock();
        try
        {
          c localc = c.a.a();
          if (localc == c.l)
          {
            c.l = null;
            return;
          }
          h localh = h.a;
          localReentrantLock.unlock();
          if (localc != null) {
            localc.k();
          }
        }
        finally
        {
          localReentrantLock.unlock();
        }
      }
    }
    catch (InterruptedException localInterruptedException) {}
  }
}

/* Location:
 * Qualified Name:     xc.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */