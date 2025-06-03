package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class RequestExecutor
{
  public static ThreadPoolExecutor createDefaultExecutor(@NonNull String paramString, int paramInt1, @IntRange(from=0L) int paramInt2)
  {
    paramString = new DefaultThreadFactory(paramString, paramInt1);
    paramString = new ThreadPoolExecutor(0, 1, paramInt2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), paramString);
    paramString.allowCoreThreadTimeOut(true);
    return paramString;
  }
  
  public static Executor createHandlerExecutor(@NonNull Handler paramHandler)
  {
    return new HandlerExecutor(paramHandler);
  }
  
  public static <T> void execute(@NonNull Executor paramExecutor, @NonNull Callable<T> paramCallable, @NonNull Consumer<T> paramConsumer)
  {
    paramExecutor.execute(new ReplyRunnable(CalleeHandler.create(), paramCallable, paramConsumer));
  }
  
  public static <T> T submit(@NonNull ExecutorService paramExecutorService, @NonNull Callable<T> paramCallable, @IntRange(from=0L) int paramInt)
    throws InterruptedException
  {
    paramExecutorService = paramExecutorService.submit(paramCallable);
    long l = paramInt;
    try
    {
      paramExecutorService = paramExecutorService.get(l, TimeUnit.MILLISECONDS);
      return paramExecutorService;
    }
    catch (TimeoutException paramExecutorService)
    {
      throw new InterruptedException("timeout");
    }
    catch (InterruptedException paramExecutorService)
    {
      throw paramExecutorService;
    }
    catch (ExecutionException paramExecutorService)
    {
      throw new RuntimeException(paramExecutorService);
    }
  }
  
  public static class DefaultThreadFactory
    implements ThreadFactory
  {
    private int mPriority;
    private String mThreadName;
    
    public DefaultThreadFactory(@NonNull String paramString, int paramInt)
    {
      mThreadName = paramString;
      mPriority = paramInt;
    }
    
    public Thread newThread(Runnable paramRunnable)
    {
      return new ProcessPriorityThread(paramRunnable, mThreadName, mPriority);
    }
    
    public static class ProcessPriorityThread
      extends Thread
    {
      private final int mPriority;
      
      public ProcessPriorityThread(Runnable paramRunnable, String paramString, int paramInt)
      {
        super(paramString);
        mPriority = paramInt;
      }
      
      public void run()
      {
        Process.setThreadPriority(mPriority);
        super.run();
      }
    }
  }
  
  public static class HandlerExecutor
    implements Executor
  {
    private final Handler mHandler;
    
    public HandlerExecutor(@NonNull Handler paramHandler)
    {
      mHandler = ((Handler)Preconditions.checkNotNull(paramHandler));
    }
    
    public void execute(@NonNull Runnable paramRunnable)
    {
      if (mHandler.post((Runnable)Preconditions.checkNotNull(paramRunnable))) {
        return;
      }
      paramRunnable = new StringBuilder();
      paramRunnable.append(mHandler);
      paramRunnable.append(" is shutting down");
      throw new RejectedExecutionException(paramRunnable.toString());
    }
  }
  
  public static class ReplyRunnable<T>
    implements Runnable
  {
    @NonNull
    private Callable<T> mCallable;
    @NonNull
    private Consumer<T> mConsumer;
    @NonNull
    private Handler mHandler;
    
    public ReplyRunnable(@NonNull Handler paramHandler, @NonNull Callable<T> paramCallable, @NonNull Consumer<T> paramConsumer)
    {
      mCallable = paramCallable;
      mConsumer = paramConsumer;
      mHandler = paramHandler;
    }
    
    public void run()
    {
      final Object localObject2;
      try
      {
        Object localObject1 = mCallable.call();
      }
      catch (Exception localException)
      {
        localObject2 = null;
      }
      final Consumer localConsumer = mConsumer;
      mHandler.post(new Runnable()
      {
        public void run()
        {
          localConsumer.accept(localObject2);
        }
      });
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.provider.RequestExecutor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */