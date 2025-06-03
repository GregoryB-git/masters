package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager.WakeLock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.work.Configuration;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.WorkerParameters.RuntimeExtras;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.utils.SerialExecutor;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class Processor
  implements ExecutionListener, ForegroundProcessor
{
  private static final String FOREGROUND_WAKELOCK_TAG = "ProcessorForegroundLck";
  private static final String TAG = Logger.tagWithPrefix("Processor");
  private Context mAppContext;
  private Set<String> mCancelledIds;
  private Configuration mConfiguration;
  private Map<String, WorkerWrapper> mEnqueuedWorkMap;
  @Nullable
  private PowerManager.WakeLock mForegroundLock;
  private Map<String, WorkerWrapper> mForegroundWorkMap;
  private final Object mLock;
  private final List<ExecutionListener> mOuterListeners;
  private List<Scheduler> mSchedulers;
  private WorkDatabase mWorkDatabase;
  private TaskExecutor mWorkTaskExecutor;
  
  public Processor(@NonNull Context paramContext, @NonNull Configuration paramConfiguration, @NonNull TaskExecutor paramTaskExecutor, @NonNull WorkDatabase paramWorkDatabase, @NonNull List<Scheduler> paramList)
  {
    mAppContext = paramContext;
    mConfiguration = paramConfiguration;
    mWorkTaskExecutor = paramTaskExecutor;
    mWorkDatabase = paramWorkDatabase;
    mEnqueuedWorkMap = new HashMap();
    mForegroundWorkMap = new HashMap();
    mSchedulers = paramList;
    mCancelledIds = new HashSet();
    mOuterListeners = new ArrayList();
    mForegroundLock = null;
    mLock = new Object();
  }
  
  private static boolean interrupt(@NonNull String paramString, @Nullable WorkerWrapper paramWorkerWrapper)
  {
    if (paramWorkerWrapper != null)
    {
      paramWorkerWrapper.interrupt();
      Logger.get().debug(TAG, String.format("WorkerWrapper interrupted for %s", new Object[] { paramString }), new Throwable[0]);
      return true;
    }
    Logger.get().debug(TAG, String.format("WorkerWrapper could not be found for %s", new Object[] { paramString }), new Throwable[0]);
    return false;
  }
  
  /* Error */
  private void stopForegroundService()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 94	androidx/work/impl/Processor:mLock	Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 78	androidx/work/impl/Processor:mForegroundWorkMap	Ljava/util/Map;
    //   11: invokeinterface 130 1 0
    //   16: iconst_1
    //   17: ixor
    //   18: ifne +61 -> 79
    //   21: aload_0
    //   22: getfield 65	androidx/work/impl/Processor:mAppContext	Landroid/content/Context;
    //   25: invokestatic 136	androidx/work/impl/foreground/SystemForegroundDispatcher:createStopForegroundIntent	(Landroid/content/Context;)Landroid/content/Intent;
    //   28: astore_2
    //   29: aload_0
    //   30: getfield 65	androidx/work/impl/Processor:mAppContext	Landroid/content/Context;
    //   33: aload_2
    //   34: invokevirtual 142	android/content/Context:startService	(Landroid/content/Intent;)Landroid/content/ComponentName;
    //   37: pop
    //   38: goto +23 -> 61
    //   41: astore_2
    //   42: invokestatic 107	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   45: getstatic 57	androidx/work/impl/Processor:TAG	Ljava/lang/String;
    //   48: ldc -112
    //   50: iconst_1
    //   51: anewarray 117	java/lang/Throwable
    //   54: dup
    //   55: iconst_0
    //   56: aload_2
    //   57: aastore
    //   58: invokevirtual 147	androidx/work/Logger:error	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   61: aload_0
    //   62: getfield 92	androidx/work/impl/Processor:mForegroundLock	Landroid/os/PowerManager$WakeLock;
    //   65: astore_2
    //   66: aload_2
    //   67: ifnull +12 -> 79
    //   70: aload_2
    //   71: invokevirtual 152	android/os/PowerManager$WakeLock:release	()V
    //   74: aload_0
    //   75: aconst_null
    //   76: putfield 92	androidx/work/impl/Processor:mForegroundLock	Landroid/os/PowerManager$WakeLock;
    //   79: aload_1
    //   80: monitorexit
    //   81: return
    //   82: astore_2
    //   83: aload_1
    //   84: monitorexit
    //   85: aload_2
    //   86: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	87	0	this	Processor
    //   4	80	1	localObject1	Object
    //   28	6	2	localIntent	android.content.Intent
    //   41	16	2	localObject2	Object
    //   65	6	2	localWakeLock	PowerManager.WakeLock
    //   82	4	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   29	38	41	finally
    //   7	29	82	finally
    //   42	61	82	finally
    //   61	66	82	finally
    //   70	79	82	finally
    //   79	81	82	finally
    //   83	85	82	finally
  }
  
  public void addExecutionListener(@NonNull ExecutionListener paramExecutionListener)
  {
    synchronized (mLock)
    {
      mOuterListeners.add(paramExecutionListener);
      return;
    }
  }
  
  public boolean hasWork()
  {
    synchronized (mLock)
    {
      boolean bool;
      if ((mEnqueuedWorkMap.isEmpty()) && (mForegroundWorkMap.isEmpty())) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
  }
  
  public boolean isCancelled(@NonNull String paramString)
  {
    synchronized (mLock)
    {
      boolean bool = mCancelledIds.contains(paramString);
      return bool;
    }
  }
  
  public boolean isEnqueued(@NonNull String paramString)
  {
    synchronized (mLock)
    {
      boolean bool;
      if ((!mEnqueuedWorkMap.containsKey(paramString)) && (!mForegroundWorkMap.containsKey(paramString))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
  }
  
  public boolean isEnqueuedInForeground(@NonNull String paramString)
  {
    synchronized (mLock)
    {
      boolean bool = mForegroundWorkMap.containsKey(paramString);
      return bool;
    }
  }
  
  public void onExecuted(@NonNull String paramString, boolean paramBoolean)
  {
    synchronized (mLock)
    {
      mEnqueuedWorkMap.remove(paramString);
      Logger.get().debug(TAG, String.format("%s %s executed; reschedule = %s", new Object[] { getClass().getSimpleName(), paramString, Boolean.valueOf(paramBoolean) }), new Throwable[0]);
      Iterator localIterator = mOuterListeners.iterator();
      while (localIterator.hasNext()) {
        ((ExecutionListener)localIterator.next()).onExecuted(paramString, paramBoolean);
      }
      return;
    }
  }
  
  public void removeExecutionListener(@NonNull ExecutionListener paramExecutionListener)
  {
    synchronized (mLock)
    {
      mOuterListeners.remove(paramExecutionListener);
      return;
    }
  }
  
  public void startForeground(@NonNull String paramString, @NonNull ForegroundInfo paramForegroundInfo)
  {
    synchronized (mLock)
    {
      Logger.get().info(TAG, String.format("Moving WorkSpec (%s) to the foreground", new Object[] { paramString }), new Throwable[0]);
      WorkerWrapper localWorkerWrapper = (WorkerWrapper)mEnqueuedWorkMap.remove(paramString);
      if (localWorkerWrapper != null)
      {
        if (mForegroundLock == null)
        {
          PowerManager.WakeLock localWakeLock = WakeLocks.newWakeLock(mAppContext, "ProcessorForegroundLck");
          mForegroundLock = localWakeLock;
          localWakeLock.acquire();
        }
        mForegroundWorkMap.put(paramString, localWorkerWrapper);
        paramString = SystemForegroundDispatcher.createStartForegroundIntent(mAppContext, paramString, paramForegroundInfo);
        ContextCompat.startForegroundService(mAppContext, paramString);
      }
      return;
    }
  }
  
  public boolean startWork(@NonNull String paramString)
  {
    return startWork(paramString, null);
  }
  
  public boolean startWork(@NonNull String paramString, @Nullable WorkerParameters.RuntimeExtras paramRuntimeExtras)
  {
    synchronized (mLock)
    {
      if (isEnqueued(paramString))
      {
        Logger.get().debug(TAG, String.format("Work %s is already enqueued for processing", new Object[] { paramString }), new Throwable[0]);
        return false;
      }
      Object localObject2 = new androidx/work/impl/WorkerWrapper$Builder;
      ((WorkerWrapper.Builder)localObject2).<init>(mAppContext, mConfiguration, mWorkTaskExecutor, this, mWorkDatabase, paramString);
      localObject2 = ((WorkerWrapper.Builder)localObject2).withSchedulers(mSchedulers).withRuntimeExtras(paramRuntimeExtras).build();
      paramRuntimeExtras = ((WorkerWrapper)localObject2).getFuture();
      FutureListener localFutureListener = new androidx/work/impl/Processor$FutureListener;
      localFutureListener.<init>(this, paramString, paramRuntimeExtras);
      paramRuntimeExtras.addListener(localFutureListener, mWorkTaskExecutor.getMainThreadExecutor());
      mEnqueuedWorkMap.put(paramString, localObject2);
      mWorkTaskExecutor.getBackgroundExecutor().execute((Runnable)localObject2);
      Logger.get().debug(TAG, String.format("%s: processing %s", new Object[] { getClass().getSimpleName(), paramString }), new Throwable[0]);
      return true;
    }
  }
  
  public boolean stopAndCancelWork(@NonNull String paramString)
  {
    synchronized (mLock)
    {
      Object localObject2 = Logger.get();
      Object localObject3 = TAG;
      int i = 1;
      ((Logger)localObject2).debug((String)localObject3, String.format("Processor cancelling %s", new Object[] { paramString }), new Throwable[0]);
      mCancelledIds.add(paramString);
      localObject2 = (WorkerWrapper)mForegroundWorkMap.remove(paramString);
      if (localObject2 == null) {
        i = 0;
      }
      localObject3 = localObject2;
      if (localObject2 == null) {
        localObject3 = (WorkerWrapper)mEnqueuedWorkMap.remove(paramString);
      }
      boolean bool = interrupt(paramString, (WorkerWrapper)localObject3);
      if (i != 0) {
        stopForegroundService();
      }
      return bool;
    }
  }
  
  public void stopForeground(@NonNull String paramString)
  {
    synchronized (mLock)
    {
      mForegroundWorkMap.remove(paramString);
      stopForegroundService();
      return;
    }
  }
  
  public boolean stopForegroundWork(@NonNull String paramString)
  {
    synchronized (mLock)
    {
      Logger.get().debug(TAG, String.format("Processor stopping foreground work %s", new Object[] { paramString }), new Throwable[0]);
      boolean bool = interrupt(paramString, (WorkerWrapper)mForegroundWorkMap.remove(paramString));
      return bool;
    }
  }
  
  public boolean stopWork(@NonNull String paramString)
  {
    synchronized (mLock)
    {
      Logger.get().debug(TAG, String.format("Processor stopping background work %s", new Object[] { paramString }), new Throwable[0]);
      boolean bool = interrupt(paramString, (WorkerWrapper)mEnqueuedWorkMap.remove(paramString));
      return bool;
    }
  }
  
  public static class FutureListener
    implements Runnable
  {
    @NonNull
    private ExecutionListener mExecutionListener;
    @NonNull
    private ListenableFuture<Boolean> mFuture;
    @NonNull
    private String mWorkSpecId;
    
    public FutureListener(@NonNull ExecutionListener paramExecutionListener, @NonNull String paramString, @NonNull ListenableFuture<Boolean> paramListenableFuture)
    {
      mExecutionListener = paramExecutionListener;
      mWorkSpecId = paramString;
      mFuture = paramListenableFuture;
    }
    
    public void run()
    {
      boolean bool;
      try
      {
        bool = ((Boolean)mFuture.get()).booleanValue();
      }
      catch (InterruptedException|ExecutionException localInterruptedException)
      {
        bool = true;
      }
      mExecutionListener.onExecuted(mWorkSpecId, bool);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.Processor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */