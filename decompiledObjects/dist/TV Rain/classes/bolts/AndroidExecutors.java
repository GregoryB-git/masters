package bolts;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class AndroidExecutors
{
  public static final int CORE_POOL_SIZE;
  private static final int CPU_COUNT;
  private static final AndroidExecutors INSTANCE = new AndroidExecutors();
  public static final long KEEP_ALIVE_TIME = 1L;
  public static final int MAX_POOL_SIZE;
  private final Executor uiThread = new UIThreadExecutor(null);
  
  static
  {
    int i = Runtime.getRuntime().availableProcessors();
    CPU_COUNT = i;
    CORE_POOL_SIZE = i + 1;
    MAX_POOL_SIZE = i * 2 + 1;
  }
  
  @SuppressLint({"NewApi"})
  public static void allowCoreThreadTimeout(ThreadPoolExecutor paramThreadPoolExecutor, boolean paramBoolean)
  {
    paramThreadPoolExecutor.allowCoreThreadTimeOut(paramBoolean);
  }
  
  public static ExecutorService newCachedThreadPool()
  {
    ThreadPoolExecutor localThreadPoolExecutor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    allowCoreThreadTimeout(localThreadPoolExecutor, true);
    return localThreadPoolExecutor;
  }
  
  public static ExecutorService newCachedThreadPool(ThreadFactory paramThreadFactory)
  {
    paramThreadFactory = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), paramThreadFactory);
    allowCoreThreadTimeout(paramThreadFactory, true);
    return paramThreadFactory;
  }
  
  public static Executor uiThread()
  {
    return INSTANCEuiThread;
  }
  
  public static class UIThreadExecutor
    implements Executor
  {
    public void execute(Runnable paramRunnable)
    {
      new Handler(Looper.getMainLooper()).post(paramRunnable);
    }
  }
}

/* Location:
 * Qualified Name:     bolts.AndroidExecutors
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */