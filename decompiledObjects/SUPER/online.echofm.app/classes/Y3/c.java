package Y3;

import Q3.d;
import Q3.h;
import V3.r;
import V3.z;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public abstract class c
  implements r
{
  public ScheduledThreadPoolExecutor a;
  
  public c()
  {
    a locala = new a(1, new b(null));
    a = locala;
    locala.setKeepAliveTime(3L, TimeUnit.SECONDS);
  }
  
  public static String h(Throwable paramThrowable)
  {
    if ((paramThrowable instanceof OutOfMemoryError)) {
      return "Firebase Database encountered an OutOfMemoryError. You may need to reduce the amount of data you are syncing to the client (e.g. by using queries or syncing a deeper path). See https://firebase.google.com/docs/database/ios/structure-data#best_practices_for_data_structure and https://firebase.google.com/docs/database/android/retrieve-data#filtering_data";
    }
    if ((paramThrowable instanceof NoClassDefFoundError)) {
      return "A symbol that the Firebase Database SDK depends on failed to load. This usually indicates that your project includes an incompatible version of another Firebase dependency. If updating your dependencies to the latest version does not resolve this issue, please file a report at https://github.com/firebase/firebase-android-sdk";
    }
    if ((paramThrowable instanceof d)) {
      return "";
    }
    paramThrowable = new StringBuilder();
    paramThrowable.append("Uncaught exception in Firebase Database runloop (");
    paramThrowable.append(h.g());
    paramThrowable.append("). If you are not already on the latest version of the Firebase SDKs, try updating your dependencies. Should this problem persist, please file a report at https://github.com/firebase/firebase-android-sdk");
    return paramThrowable.toString();
  }
  
  public void a()
  {
    a.setCorePoolSize(1);
  }
  
  public ScheduledFuture b(Runnable paramRunnable, long paramLong)
  {
    return a.schedule(paramRunnable, paramLong, TimeUnit.MILLISECONDS);
  }
  
  public void c(Runnable paramRunnable)
  {
    a.execute(paramRunnable);
  }
  
  public ScheduledExecutorService d()
  {
    return a;
  }
  
  public ThreadFactory e()
  {
    return Executors.defaultThreadFactory();
  }
  
  public z f()
  {
    return z.a;
  }
  
  public abstract void g(Throwable paramThrowable);
  
  public class a
    extends ScheduledThreadPoolExecutor
  {
    public a(int paramInt, ThreadFactory paramThreadFactory)
    {
      super(paramThreadFactory);
    }
    
    public void afterExecute(Runnable paramRunnable, Throwable paramThrowable)
    {
      super.afterExecute(paramRunnable, paramThrowable);
      localThrowable = paramThrowable;
      if (paramThrowable == null)
      {
        localThrowable = paramThrowable;
        if ((paramRunnable instanceof Future))
        {
          paramRunnable = (Future)paramRunnable;
          localThrowable = paramThrowable;
        }
      }
      try
      {
        try
        {
          if (!paramRunnable.isDone()) {
            break label70;
          }
          paramRunnable.get();
          localThrowable = paramThrowable;
        }
        catch (ExecutionException paramRunnable) {}catch (InterruptedException paramRunnable)
        {
          Thread.currentThread().interrupt();
          localThrowable = paramThrowable;
        }
        localThrowable = paramRunnable.getCause();
      }
      catch (CancellationException paramRunnable)
      {
        for (;;)
        {
          label70:
          localThrowable = paramThrowable;
        }
      }
      if (localThrowable != null) {
        g(localThrowable);
      }
    }
  }
  
  public class b
    implements ThreadFactory
  {
    public b() {}
    
    public Thread newThread(Runnable paramRunnable)
    {
      Thread localThread = e().newThread(paramRunnable);
      paramRunnable = f();
      paramRunnable.a(localThread, "FirebaseDatabaseWorker");
      paramRunnable.b(localThread, true);
      paramRunnable.c(localThread, new a());
      return localThread;
    }
    
    public class a
      implements Thread.UncaughtExceptionHandler
    {
      public a() {}
      
      public void uncaughtException(Thread paramThread, Throwable paramThrowable)
      {
        g(paramThrowable);
      }
    }
  }
}

/* Location:
 * Qualified Name:     Y3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */