package gb;

import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final class v0$c
  implements h3.c<ScheduledExecutorService>
{
  public final Object a()
  {
    ScheduledExecutorService localScheduledExecutorService = Executors.newScheduledThreadPool(1, v0.d("grpc-timer-%d"));
    try
    {
      try
      {
        localScheduledExecutorService.getClass().getMethod("setRemoveOnCancelPolicy", new Class[] { Boolean.TYPE }).invoke(localScheduledExecutorService, new Object[] { Boolean.TRUE });
      }
      catch (Exception localException)
      {
        throw new RuntimeException(localException);
      }
      catch (RuntimeException localRuntimeException)
      {
        throw localRuntimeException;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
    return Executors.unconfigurableScheduledExecutorService(localRuntimeException);
  }
  
  public final void b(Object paramObject)
  {
    ((ScheduledExecutorService)paramObject).shutdown();
  }
}

/* Location:
 * Qualified Name:     gb.v0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */