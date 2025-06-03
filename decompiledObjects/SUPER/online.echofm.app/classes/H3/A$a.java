package H3;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public class A$a
  implements ThreadFactory
{
  public A$a(String paramString, AtomicLong paramAtomicLong) {}
  
  public Thread newThread(final Runnable paramRunnable)
  {
    Thread localThread = Executors.defaultThreadFactory().newThread(new a(paramRunnable));
    paramRunnable = new StringBuilder();
    paramRunnable.append(a);
    paramRunnable.append(b.getAndIncrement());
    localThread.setName(paramRunnable.toString());
    return localThread;
  }
  
  public class a
    extends d
  {
    public a(Runnable paramRunnable) {}
    
    public void a()
    {
      paramRunnable.run();
    }
  }
}

/* Location:
 * Qualified Name:     H3.A.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */