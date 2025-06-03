package j8;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class x
  implements ThreadFactory
{
  public x(AtomicLong paramAtomicLong) {}
  
  public final Thread newThread(Runnable paramRunnable)
  {
    Thread localThread = Executors.defaultThreadFactory().newThread(new a(paramRunnable));
    paramRunnable = new StringBuilder();
    paramRunnable.append(a);
    paramRunnable.append(b.getAndIncrement());
    localThread.setName(paramRunnable.toString());
    return localThread;
  }
  
  public final class a
    extends d
  {
    public a() {}
    
    public final void a()
    {
      run();
    }
  }
}

/* Location:
 * Qualified Name:     j8.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */