package n9;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadFactory;
import x6.b;

public final class a$b$b
  implements Runnable, ThreadFactory
{
  public final CountDownLatch a = new CountDownLatch(1);
  public Runnable b;
  
  public a$b$b(a.b paramb) {}
  
  public final Thread newThread(Runnable paramRunnable)
  {
    boolean bool;
    if (b == null) {
      bool = true;
    } else {
      bool = false;
    }
    b.Z("Only one thread may be created in an AsyncQueue.", bool, new Object[0]);
    b = paramRunnable;
    a.countDown();
    return c.c;
  }
  
  public final void run()
  {
    try
    {
      a.await();
    }
    catch (InterruptedException localInterruptedException)
    {
      Thread.currentThread().interrupt();
    }
    b.run();
  }
}

/* Location:
 * Qualified Name:     n9.a.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */