package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import androidx.annotation.RestrictTo;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import z2;

abstract class ModernAsyncTask<Params, Progress, Result>
{
  private static final int CORE_POOL_SIZE = 5;
  private static final int KEEP_ALIVE = 1;
  private static final String LOG_TAG = "AsyncTask";
  private static final int MAXIMUM_POOL_SIZE = 128;
  private static final int MESSAGE_POST_PROGRESS = 2;
  private static final int MESSAGE_POST_RESULT = 1;
  public static final Executor THREAD_POOL_EXECUTOR;
  private static volatile Executor sDefaultExecutor;
  private static InternalHandler sHandler;
  private static final BlockingQueue<Runnable> sPoolWorkQueue;
  private static final ThreadFactory sThreadFactory;
  public final AtomicBoolean mCancelled = new AtomicBoolean();
  private final FutureTask<Result> mFuture;
  private volatile Status mStatus = Status.PENDING;
  public final AtomicBoolean mTaskInvoked = new AtomicBoolean();
  private final WorkerRunnable<Params, Result> mWorker;
  
  static
  {
    Object localObject = new ThreadFactory()
    {
      private final AtomicInteger mCount = new AtomicInteger(1);
      
      public Thread newThread(Runnable paramAnonymousRunnable)
      {
        StringBuilder localStringBuilder = z2.t("ModernAsyncTask #");
        localStringBuilder.append(mCount.getAndIncrement());
        return new Thread(paramAnonymousRunnable, localStringBuilder.toString());
      }
    };
    sThreadFactory = (ThreadFactory)localObject;
    LinkedBlockingQueue localLinkedBlockingQueue = new LinkedBlockingQueue(10);
    sPoolWorkQueue = localLinkedBlockingQueue;
    localObject = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, localLinkedBlockingQueue, (ThreadFactory)localObject);
    THREAD_POOL_EXECUTOR = (Executor)localObject;
    sDefaultExecutor = (Executor)localObject;
  }
  
  public ModernAsyncTask()
  {
    WorkerRunnable local2 = new WorkerRunnable()
    {
      public Result call()
        throws Exception
      {
        mTaskInvoked.set(true);
        Object localObject1 = null;
        Object localObject4 = localObject1;
        try
        {
          Process.setThreadPriority(10);
          localObject4 = localObject1;
          localObject1 = doInBackground(mParams);
          localObject4 = localObject1;
          Binder.flushPendingCommands();
          postResult(localObject1);
          return (Result)localObject1;
        }
        finally
        {
          try
          {
            mCancelled.set(true);
            throw ((Throwable)localObject2);
          }
          finally
          {
            postResult(localObject4);
          }
        }
      }
    };
    mWorker = local2;
    mFuture = new FutureTask(local2)
    {
      /* Error */
      public void done()
      {
        // Byte code:
        //   0: aload_0
        //   1: invokevirtual 30	java/util/concurrent/FutureTask:get	()Ljava/lang/Object;
        //   4: astore_1
        //   5: aload_0
        //   6: getfield 15	androidx/loader/content/ModernAsyncTask$3:this$0	Landroidx/loader/content/ModernAsyncTask;
        //   9: aload_1
        //   10: invokevirtual 34	androidx/loader/content/ModernAsyncTask:postResultIfNotInvoked	(Ljava/lang/Object;)V
        //   13: goto +50 -> 63
        //   16: astore_1
        //   17: new 36	java/lang/RuntimeException
        //   20: dup
        //   21: ldc 38
        //   23: aload_1
        //   24: invokespecial 41	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   27: athrow
        //   28: astore_1
        //   29: aload_0
        //   30: getfield 15	androidx/loader/content/ModernAsyncTask$3:this$0	Landroidx/loader/content/ModernAsyncTask;
        //   33: aconst_null
        //   34: invokevirtual 34	androidx/loader/content/ModernAsyncTask:postResultIfNotInvoked	(Ljava/lang/Object;)V
        //   37: goto +26 -> 63
        //   40: astore_1
        //   41: new 36	java/lang/RuntimeException
        //   44: dup
        //   45: ldc 38
        //   47: aload_1
        //   48: invokevirtual 47	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
        //   51: invokespecial 41	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   54: athrow
        //   55: astore_1
        //   56: ldc 49
        //   58: aload_1
        //   59: invokestatic 55	android/util/Log:w	(Ljava/lang/String;Ljava/lang/Throwable;)I
        //   62: pop
        //   63: return
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	64	0	this	3
        //   4	6	1	localObject	Object
        //   16	8	1	localThrowable	Throwable
        //   28	1	1	localCancellationException	java.util.concurrent.CancellationException
        //   40	8	1	localExecutionException	ExecutionException
        //   55	4	1	localInterruptedException	InterruptedException
        // Exception table:
        //   from	to	target	type
        //   0	13	16	finally
        //   0	13	28	java/util/concurrent/CancellationException
        //   0	13	40	java/util/concurrent/ExecutionException
        //   0	13	55	java/lang/InterruptedException
      }
    };
  }
  
  public static void execute(Runnable paramRunnable)
  {
    sDefaultExecutor.execute(paramRunnable);
  }
  
  private static Handler getHandler()
  {
    try
    {
      if (sHandler == null)
      {
        localInternalHandler = new androidx/loader/content/ModernAsyncTask$InternalHandler;
        localInternalHandler.<init>();
        sHandler = localInternalHandler;
      }
      InternalHandler localInternalHandler = sHandler;
      return localInternalHandler;
    }
    finally {}
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static void setDefaultExecutor(Executor paramExecutor)
  {
    sDefaultExecutor = paramExecutor;
  }
  
  public final boolean cancel(boolean paramBoolean)
  {
    mCancelled.set(true);
    return mFuture.cancel(paramBoolean);
  }
  
  public abstract Result doInBackground(Params... paramVarArgs);
  
  public final ModernAsyncTask<Params, Progress, Result> execute(Params... paramVarArgs)
  {
    return executeOnExecutor(sDefaultExecutor, paramVarArgs);
  }
  
  public final ModernAsyncTask<Params, Progress, Result> executeOnExecutor(Executor paramExecutor, Params... paramVarArgs)
  {
    if (mStatus != Status.PENDING)
    {
      int i = 4.$SwitchMap$androidx$loader$content$ModernAsyncTask$Status[mStatus.ordinal()];
      if (i != 1)
      {
        if (i != 2) {
          throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
      }
      throw new IllegalStateException("Cannot execute task: the task is already running.");
    }
    mStatus = Status.RUNNING;
    onPreExecute();
    mWorker.mParams = paramVarArgs;
    paramExecutor.execute(mFuture);
    return this;
  }
  
  public void finish(Result paramResult)
  {
    if (isCancelled()) {
      onCancelled(paramResult);
    } else {
      onPostExecute(paramResult);
    }
    mStatus = Status.FINISHED;
  }
  
  public final Result get()
    throws InterruptedException, ExecutionException
  {
    return (Result)mFuture.get();
  }
  
  public final Result get(long paramLong, TimeUnit paramTimeUnit)
    throws InterruptedException, ExecutionException, TimeoutException
  {
    return (Result)mFuture.get(paramLong, paramTimeUnit);
  }
  
  public final Status getStatus()
  {
    return mStatus;
  }
  
  public final boolean isCancelled()
  {
    return mCancelled.get();
  }
  
  public void onCancelled() {}
  
  public void onCancelled(Result paramResult)
  {
    onCancelled();
  }
  
  public void onPostExecute(Result paramResult) {}
  
  public void onPreExecute() {}
  
  public void onProgressUpdate(Progress... paramVarArgs) {}
  
  public Result postResult(Result paramResult)
  {
    getHandler().obtainMessage(1, new AsyncTaskResult(this, new Object[] { paramResult })).sendToTarget();
    return paramResult;
  }
  
  public void postResultIfNotInvoked(Result paramResult)
  {
    if (!mTaskInvoked.get()) {
      postResult(paramResult);
    }
  }
  
  public final void publishProgress(Progress... paramVarArgs)
  {
    if (!isCancelled()) {
      getHandler().obtainMessage(2, new AsyncTaskResult(this, paramVarArgs)).sendToTarget();
    }
  }
  
  public static class AsyncTaskResult<Data>
  {
    public final Data[] mData;
    public final ModernAsyncTask mTask;
    
    public AsyncTaskResult(ModernAsyncTask paramModernAsyncTask, Data... paramVarArgs)
    {
      mTask = paramModernAsyncTask;
      mData = paramVarArgs;
    }
  }
  
  public static class InternalHandler
    extends Handler
  {
    public InternalHandler()
    {
      super();
    }
    
    public void handleMessage(Message paramMessage)
    {
      ModernAsyncTask.AsyncTaskResult localAsyncTaskResult = (ModernAsyncTask.AsyncTaskResult)obj;
      int i = what;
      if (i != 1)
      {
        if (i == 2) {
          mTask.onProgressUpdate(mData);
        }
      }
      else {
        mTask.finish(mData[0]);
      }
    }
  }
  
  public static enum Status
  {
    static
    {
      Status localStatus1 = new Status("PENDING", 0);
      PENDING = localStatus1;
      Status localStatus2 = new Status("RUNNING", 1);
      RUNNING = localStatus2;
      Status localStatus3 = new Status("FINISHED", 2);
      FINISHED = localStatus3;
      $VALUES = new Status[] { localStatus1, localStatus2, localStatus3 };
    }
    
    private Status() {}
  }
  
  public static abstract class WorkerRunnable<Params, Result>
    implements Callable<Result>
  {
    public Params[] mParams;
  }
}

/* Location:
 * Qualified Name:     androidx.loader.content.ModernAsyncTask
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */