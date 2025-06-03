package s4;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class h$a
  implements ThreadFactory
{
  public final AtomicInteger a = new AtomicInteger(1);
  
  public Thread newThread(Runnable paramRunnable)
  {
    return new Thread(paramRunnable, String.format("firebase-installations-executor-%d", new Object[] { Integer.valueOf(a.getAndIncrement()) }));
  }
}

/* Location:
 * Qualified Name:     s4.h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */