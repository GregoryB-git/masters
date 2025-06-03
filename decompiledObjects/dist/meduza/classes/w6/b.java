package w6;

import i6.q;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class b
  implements ThreadFactory
{
  public final String a = "GAC_Transform";
  public final AtomicInteger b = new AtomicInteger();
  public final ThreadFactory c = Executors.defaultThreadFactory();
  
  public final Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = new q(paramRunnable);
    Thread localThread = c.newThread(paramRunnable);
    int i = b.getAndIncrement();
    paramRunnable = new StringBuilder();
    paramRunnable.append(a);
    paramRunnable.append("[");
    paramRunnable.append(i);
    paramRunnable.append("]");
    localThread.setName(paramRunnable.toString());
    return localThread;
  }
}

/* Location:
 * Qualified Name:     w6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */