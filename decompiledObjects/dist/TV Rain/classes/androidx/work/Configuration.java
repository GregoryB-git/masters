package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.impl.DefaultRunnableScheduler;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import z2;

public final class Configuration
{
  @SuppressLint({"MinMaxConstant"})
  public static final int MIN_SCHEDULER_LIMIT = 20;
  @Nullable
  public final String mDefaultProcessName;
  @Nullable
  public final InitializationExceptionHandler mExceptionHandler;
  @NonNull
  public final Executor mExecutor;
  @NonNull
  public final InputMergerFactory mInputMergerFactory;
  private final boolean mIsUsingDefaultTaskExecutor;
  public final int mLoggingLevel;
  public final int mMaxJobSchedulerId;
  public final int mMaxSchedulerLimit;
  public final int mMinJobSchedulerId;
  @NonNull
  public final RunnableScheduler mRunnableScheduler;
  @NonNull
  public final Executor mTaskExecutor;
  @NonNull
  public final WorkerFactory mWorkerFactory;
  
  public Configuration(@NonNull Builder paramBuilder)
  {
    Object localObject = mExecutor;
    if (localObject == null) {
      mExecutor = createDefaultExecutor(false);
    } else {
      mExecutor = ((Executor)localObject);
    }
    localObject = mTaskExecutor;
    if (localObject == null)
    {
      mIsUsingDefaultTaskExecutor = true;
      mTaskExecutor = createDefaultExecutor(true);
    }
    else
    {
      mIsUsingDefaultTaskExecutor = false;
      mTaskExecutor = ((Executor)localObject);
    }
    localObject = mWorkerFactory;
    if (localObject == null) {
      mWorkerFactory = WorkerFactory.getDefaultWorkerFactory();
    } else {
      mWorkerFactory = ((WorkerFactory)localObject);
    }
    localObject = mInputMergerFactory;
    if (localObject == null) {
      mInputMergerFactory = InputMergerFactory.getDefaultInputMergerFactory();
    } else {
      mInputMergerFactory = ((InputMergerFactory)localObject);
    }
    localObject = mRunnableScheduler;
    if (localObject == null) {
      mRunnableScheduler = new DefaultRunnableScheduler();
    } else {
      mRunnableScheduler = ((RunnableScheduler)localObject);
    }
    mLoggingLevel = mLoggingLevel;
    mMinJobSchedulerId = mMinJobSchedulerId;
    mMaxJobSchedulerId = mMaxJobSchedulerId;
    mMaxSchedulerLimit = mMaxSchedulerLimit;
    mExceptionHandler = mExceptionHandler;
    mDefaultProcessName = mDefaultProcessName;
  }
  
  @NonNull
  private Executor createDefaultExecutor(boolean paramBoolean)
  {
    return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), createDefaultThreadFactory(paramBoolean));
  }
  
  @NonNull
  private ThreadFactory createDefaultThreadFactory(final boolean paramBoolean)
  {
    new ThreadFactory()
    {
      private final AtomicInteger mThreadCount = new AtomicInteger(0);
      
      public Thread newThread(Runnable paramAnonymousRunnable)
      {
        if (paramBoolean) {
          localObject = "WM.task-";
        } else {
          localObject = "androidx.work-";
        }
        Object localObject = z2.t((String)localObject);
        ((StringBuilder)localObject).append(mThreadCount.incrementAndGet());
        return new Thread(paramAnonymousRunnable, ((StringBuilder)localObject).toString());
      }
    };
  }
  
  @Nullable
  public String getDefaultProcessName()
  {
    return mDefaultProcessName;
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public InitializationExceptionHandler getExceptionHandler()
  {
    return mExceptionHandler;
  }
  
  @NonNull
  public Executor getExecutor()
  {
    return mExecutor;
  }
  
  @NonNull
  public InputMergerFactory getInputMergerFactory()
  {
    return mInputMergerFactory;
  }
  
  public int getMaxJobSchedulerId()
  {
    return mMaxJobSchedulerId;
  }
  
  @IntRange(from=20L, to=50L)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public int getMaxSchedulerLimit()
  {
    return mMaxSchedulerLimit;
  }
  
  public int getMinJobSchedulerId()
  {
    return mMinJobSchedulerId;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public int getMinimumLoggingLevel()
  {
    return mLoggingLevel;
  }
  
  @NonNull
  public RunnableScheduler getRunnableScheduler()
  {
    return mRunnableScheduler;
  }
  
  @NonNull
  public Executor getTaskExecutor()
  {
    return mTaskExecutor;
  }
  
  @NonNull
  public WorkerFactory getWorkerFactory()
  {
    return mWorkerFactory;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public boolean isUsingDefaultTaskExecutor()
  {
    return mIsUsingDefaultTaskExecutor;
  }
  
  public static final class Builder
  {
    @Nullable
    public String mDefaultProcessName;
    @Nullable
    public InitializationExceptionHandler mExceptionHandler;
    public Executor mExecutor;
    public InputMergerFactory mInputMergerFactory;
    public int mLoggingLevel;
    public int mMaxJobSchedulerId;
    public int mMaxSchedulerLimit;
    public int mMinJobSchedulerId;
    public RunnableScheduler mRunnableScheduler;
    public Executor mTaskExecutor;
    public WorkerFactory mWorkerFactory;
    
    public Builder()
    {
      mLoggingLevel = 4;
      mMinJobSchedulerId = 0;
      mMaxJobSchedulerId = Integer.MAX_VALUE;
      mMaxSchedulerLimit = 20;
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public Builder(@NonNull Configuration paramConfiguration)
    {
      mExecutor = mExecutor;
      mWorkerFactory = mWorkerFactory;
      mInputMergerFactory = mInputMergerFactory;
      mTaskExecutor = mTaskExecutor;
      mLoggingLevel = mLoggingLevel;
      mMinJobSchedulerId = mMinJobSchedulerId;
      mMaxJobSchedulerId = mMaxJobSchedulerId;
      mMaxSchedulerLimit = mMaxSchedulerLimit;
      mRunnableScheduler = mRunnableScheduler;
      mExceptionHandler = mExceptionHandler;
      mDefaultProcessName = mDefaultProcessName;
    }
    
    @NonNull
    public Configuration build()
    {
      return new Configuration(this);
    }
    
    @NonNull
    public Builder setDefaultProcessName(@NonNull String paramString)
    {
      mDefaultProcessName = paramString;
      return this;
    }
    
    @NonNull
    public Builder setExecutor(@NonNull Executor paramExecutor)
    {
      mExecutor = paramExecutor;
      return this;
    }
    
    @NonNull
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public Builder setInitializationExceptionHandler(@NonNull InitializationExceptionHandler paramInitializationExceptionHandler)
    {
      mExceptionHandler = paramInitializationExceptionHandler;
      return this;
    }
    
    @NonNull
    public Builder setInputMergerFactory(@NonNull InputMergerFactory paramInputMergerFactory)
    {
      mInputMergerFactory = paramInputMergerFactory;
      return this;
    }
    
    @NonNull
    public Builder setJobSchedulerJobIdRange(int paramInt1, int paramInt2)
    {
      if (paramInt2 - paramInt1 >= 1000)
      {
        mMinJobSchedulerId = paramInt1;
        mMaxJobSchedulerId = paramInt2;
        return this;
      }
      throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
    }
    
    @NonNull
    public Builder setMaxSchedulerLimit(int paramInt)
    {
      if (paramInt >= 20)
      {
        mMaxSchedulerLimit = Math.min(paramInt, 50);
        return this;
      }
      throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
    }
    
    @NonNull
    public Builder setMinimumLoggingLevel(int paramInt)
    {
      mLoggingLevel = paramInt;
      return this;
    }
    
    @NonNull
    public Builder setRunnableScheduler(@NonNull RunnableScheduler paramRunnableScheduler)
    {
      mRunnableScheduler = paramRunnableScheduler;
      return this;
    }
    
    @NonNull
    public Builder setTaskExecutor(@NonNull Executor paramExecutor)
    {
      mTaskExecutor = paramExecutor;
      return this;
    }
    
    @NonNull
    public Builder setWorkerFactory(@NonNull WorkerFactory paramWorkerFactory)
    {
      mWorkerFactory = paramWorkerFactory;
      return this;
    }
  }
  
  public static abstract interface Provider
  {
    @NonNull
    public abstract Configuration getWorkManagerConfiguration();
  }
}

/* Location:
 * Qualified Name:     androidx.work.Configuration
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */