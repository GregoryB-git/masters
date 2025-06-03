package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.Logger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class WorkTimer
{
  private static final String TAG = Logger.tagWithPrefix("WorkTimer");
  private final ThreadFactory mBackgroundThreadFactory;
  private final ScheduledExecutorService mExecutorService;
  public final Map<String, TimeLimitExceededListener> mListeners;
  public final Object mLock;
  public final Map<String, WorkTimerRunnable> mTimerMap;
  
  public WorkTimer()
  {
    ThreadFactory local1 = new ThreadFactory()
    {
      private int mThreadsCreated = 0;
      
      public Thread newThread(@NonNull Runnable paramAnonymousRunnable)
      {
        paramAnonymousRunnable = Executors.defaultThreadFactory().newThread(paramAnonymousRunnable);
        StringBuilder localStringBuilder = z2.t("WorkManager-WorkTimer-thread-");
        localStringBuilder.append(mThreadsCreated);
        paramAnonymousRunnable.setName(localStringBuilder.toString());
        mThreadsCreated += 1;
        return paramAnonymousRunnable;
      }
    };
    mBackgroundThreadFactory = local1;
    mTimerMap = new HashMap();
    mListeners = new HashMap();
    mLock = new Object();
    mExecutorService = Executors.newSingleThreadScheduledExecutor(local1);
  }
  
  @NonNull
  @VisibleForTesting
  public ScheduledExecutorService getExecutorService()
  {
    return mExecutorService;
  }
  
  @NonNull
  @VisibleForTesting
  public Map<String, TimeLimitExceededListener> getListeners()
  {
    try
    {
      Map localMap = mListeners;
      return localMap;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  @NonNull
  @VisibleForTesting
  public Map<String, WorkTimerRunnable> getTimerMap()
  {
    try
    {
      Map localMap = mTimerMap;
      return localMap;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void onDestroy()
  {
    if (!mExecutorService.isShutdown()) {
      mExecutorService.shutdownNow();
    }
  }
  
  public void startTimer(@NonNull String paramString, long paramLong, @NonNull TimeLimitExceededListener paramTimeLimitExceededListener)
  {
    synchronized (mLock)
    {
      Logger.get().debug(TAG, String.format("Starting timer for %s", new Object[] { paramString }), new Throwable[0]);
      stopTimer(paramString);
      WorkTimerRunnable localWorkTimerRunnable = new androidx/work/impl/utils/WorkTimer$WorkTimerRunnable;
      localWorkTimerRunnable.<init>(this, paramString);
      mTimerMap.put(paramString, localWorkTimerRunnable);
      mListeners.put(paramString, paramTimeLimitExceededListener);
      mExecutorService.schedule(localWorkTimerRunnable, paramLong, TimeUnit.MILLISECONDS);
      return;
    }
  }
  
  public void stopTimer(@NonNull String paramString)
  {
    synchronized (mLock)
    {
      if ((WorkTimerRunnable)mTimerMap.remove(paramString) != null)
      {
        Logger.get().debug(TAG, String.format("Stopping timer for %s", new Object[] { paramString }), new Throwable[0]);
        mListeners.remove(paramString);
      }
      return;
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static abstract interface TimeLimitExceededListener
  {
    public abstract void onTimeLimitExceeded(@NonNull String paramString);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static class WorkTimerRunnable
    implements Runnable
  {
    public static final String TAG = "WrkTimerRunnable";
    private final String mWorkSpecId;
    private final WorkTimer mWorkTimer;
    
    public WorkTimerRunnable(@NonNull WorkTimer paramWorkTimer, @NonNull String paramString)
    {
      mWorkTimer = paramWorkTimer;
      mWorkSpecId = paramString;
    }
    
    public void run()
    {
      synchronized (mWorkTimer.mLock)
      {
        if ((WorkTimerRunnable)mWorkTimer.mTimerMap.remove(mWorkSpecId) != null)
        {
          WorkTimer.TimeLimitExceededListener localTimeLimitExceededListener = (WorkTimer.TimeLimitExceededListener)mWorkTimer.mListeners.remove(mWorkSpecId);
          if (localTimeLimitExceededListener != null) {
            localTimeLimitExceededListener.onTimeLimitExceeded(mWorkSpecId);
          }
        }
        else
        {
          Logger.get().debug("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[] { mWorkSpecId }), new Throwable[0]);
        }
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.WorkTimer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */