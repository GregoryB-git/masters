package m;

import f;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class d$a
  implements ThreadFactory
{
  public final AtomicInteger a = new AtomicInteger(0);
  
  public final Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = new Thread(paramRunnable);
    StringBuilder localStringBuilder = f.l("arch_disk_io_");
    localStringBuilder.append(a.getAndIncrement());
    paramRunnable.setName(localStringBuilder.toString());
    return paramRunnable;
  }
}

/* Location:
 * Qualified Name:     m.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */