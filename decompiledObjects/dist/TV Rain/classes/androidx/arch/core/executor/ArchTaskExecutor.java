package androidx.arch.core.executor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ArchTaskExecutor
  extends TaskExecutor
{
  @NonNull
  private static final Executor sIOThreadExecutor = new Executor()
  {
    public void execute(Runnable paramAnonymousRunnable)
    {
      ArchTaskExecutor.getInstance().executeOnDiskIO(paramAnonymousRunnable);
    }
  };
  private static volatile ArchTaskExecutor sInstance;
  @NonNull
  private static final Executor sMainThreadExecutor = new Executor()
  {
    public void execute(Runnable paramAnonymousRunnable)
    {
      ArchTaskExecutor.getInstance().postToMainThread(paramAnonymousRunnable);
    }
  };
  @NonNull
  private TaskExecutor mDefaultTaskExecutor;
  @NonNull
  private TaskExecutor mDelegate;
  
  private ArchTaskExecutor()
  {
    DefaultTaskExecutor localDefaultTaskExecutor = new DefaultTaskExecutor();
    mDefaultTaskExecutor = localDefaultTaskExecutor;
    mDelegate = localDefaultTaskExecutor;
  }
  
  @NonNull
  public static Executor getIOThreadExecutor()
  {
    return sIOThreadExecutor;
  }
  
  @NonNull
  public static ArchTaskExecutor getInstance()
  {
    if (sInstance != null) {
      return sInstance;
    }
    try
    {
      if (sInstance == null)
      {
        ArchTaskExecutor localArchTaskExecutor = new androidx/arch/core/executor/ArchTaskExecutor;
        localArchTaskExecutor.<init>();
        sInstance = localArchTaskExecutor;
      }
      return sInstance;
    }
    finally {}
  }
  
  @NonNull
  public static Executor getMainThreadExecutor()
  {
    return sMainThreadExecutor;
  }
  
  public void executeOnDiskIO(Runnable paramRunnable)
  {
    mDelegate.executeOnDiskIO(paramRunnable);
  }
  
  public boolean isMainThread()
  {
    return mDelegate.isMainThread();
  }
  
  public void postToMainThread(Runnable paramRunnable)
  {
    mDelegate.postToMainThread(paramRunnable);
  }
  
  public void setDelegate(@Nullable TaskExecutor paramTaskExecutor)
  {
    TaskExecutor localTaskExecutor = paramTaskExecutor;
    if (paramTaskExecutor == null) {
      localTaskExecutor = mDefaultTaskExecutor;
    }
    mDelegate = localTaskExecutor;
  }
}

/* Location:
 * Qualified Name:     androidx.arch.core.executor.ArchTaskExecutor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */