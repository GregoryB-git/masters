package j8;

import android.os.Looper;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.auth.g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

public final class e0
{
  public static final ExecutorService a;
  
  static
  {
    Object localObject1 = new x(new AtomicLong(1L));
    Object localObject2 = new ThreadPoolExecutor.DiscardPolicy();
    localObject2 = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), (ThreadFactory)localObject1, (RejectedExecutionHandler)localObject2));
    localObject1 = TimeUnit.SECONDS;
    Runtime.getRuntime().addShutdownHook(new Thread(new y((ExecutorService)localObject2, (TimeUnit)localObject1), "Crashlytics Shutdown Hook for awaitEvenIfOnMainThread task continuation executor"));
    a = (ExecutorService)localObject2;
  }
  
  @Deprecated
  public static void a(Task paramTask)
  {
    CountDownLatch localCountDownLatch = new CountDownLatch(1);
    paramTask.continueWith(a, new g(localCountDownLatch, 16));
    long l;
    if (Looper.getMainLooper() == Looper.myLooper()) {
      l = 3000L;
    } else {
      l = 4000L;
    }
    localCountDownLatch.await(l, TimeUnit.MILLISECONDS);
    if (paramTask.isSuccessful())
    {
      paramTask.getResult();
      return;
    }
    if (!paramTask.isCanceled())
    {
      if (paramTask.isComplete()) {
        throw new IllegalStateException(paramTask.getException());
      }
      throw new TimeoutException();
    }
    throw new CancellationException("Task is already canceled");
  }
}

/* Location:
 * Qualified Name:     j8.e0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */