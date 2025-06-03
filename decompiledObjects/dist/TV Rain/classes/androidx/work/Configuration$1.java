package androidx.work;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import z2;

class Configuration$1
  implements ThreadFactory
{
  private final AtomicInteger mThreadCount = new AtomicInteger(0);
  
  public Configuration$1(Configuration paramConfiguration, boolean paramBoolean) {}
  
  public Thread newThread(Runnable paramRunnable)
  {
    if (val$isTaskExecutor) {
      localObject = "WM.task-";
    } else {
      localObject = "androidx.work-";
    }
    Object localObject = z2.t((String)localObject);
    ((StringBuilder)localObject).append(mThreadCount.incrementAndGet());
    return new Thread(paramRunnable, ((StringBuilder)localObject).toString());
  }
}

/* Location:
 * Qualified Name:     androidx.work.Configuration.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */