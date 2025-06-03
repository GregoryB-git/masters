package z4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class b$b
  implements a
{
  public ExecutorService a(ThreadFactory paramThreadFactory, c paramc)
  {
    return b(1, paramThreadFactory, paramc);
  }
  
  public ExecutorService b(int paramInt, ThreadFactory paramThreadFactory, c paramc)
  {
    paramThreadFactory = new ThreadPoolExecutor(paramInt, paramInt, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), paramThreadFactory);
    paramThreadFactory.allowCoreThreadTimeOut(true);
    return Executors.unconfigurableExecutorService(paramThreadFactory);
  }
}

/* Location:
 * Qualified Name:     z4.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */