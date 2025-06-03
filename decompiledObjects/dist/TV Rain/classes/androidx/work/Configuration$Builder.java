package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

public final class Configuration$Builder
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
  
  public Configuration$Builder()
  {
    mLoggingLevel = 4;
    mMinJobSchedulerId = 0;
    mMaxJobSchedulerId = Integer.MAX_VALUE;
    mMaxSchedulerLimit = 20;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public Configuration$Builder(@NonNull Configuration paramConfiguration)
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

/* Location:
 * Qualified Name:     androidx.work.Configuration.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */