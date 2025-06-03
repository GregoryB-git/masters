package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import z2;

public abstract class ListenableWorker
{
  @NonNull
  private Context mAppContext;
  private boolean mRunInForeground;
  private volatile boolean mStopped;
  private boolean mUsed;
  @NonNull
  private WorkerParameters mWorkerParams;
  
  @SuppressLint({"BanKeepAnnotation"})
  @Keep
  public ListenableWorker(@NonNull Context paramContext, @NonNull WorkerParameters paramWorkerParameters)
  {
    if (paramContext != null)
    {
      if (paramWorkerParameters != null)
      {
        mAppContext = paramContext;
        mWorkerParams = paramWorkerParameters;
        return;
      }
      throw new IllegalArgumentException("WorkerParameters is null");
    }
    throw new IllegalArgumentException("Application Context is null");
  }
  
  @NonNull
  public final Context getApplicationContext()
  {
    return mAppContext;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public Executor getBackgroundExecutor()
  {
    return mWorkerParams.getBackgroundExecutor();
  }
  
  @NonNull
  public ListenableFuture<ForegroundInfo> getForegroundInfoAsync()
  {
    SettableFuture localSettableFuture = SettableFuture.create();
    localSettableFuture.setException(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
    return localSettableFuture;
  }
  
  @NonNull
  public final UUID getId()
  {
    return mWorkerParams.getId();
  }
  
  @NonNull
  public final Data getInputData()
  {
    return mWorkerParams.getInputData();
  }
  
  @Nullable
  @RequiresApi(28)
  public final Network getNetwork()
  {
    return mWorkerParams.getNetwork();
  }
  
  @IntRange(from=0L)
  public final int getRunAttemptCount()
  {
    return mWorkerParams.getRunAttemptCount();
  }
  
  @NonNull
  public final Set<String> getTags()
  {
    return mWorkerParams.getTags();
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public TaskExecutor getTaskExecutor()
  {
    return mWorkerParams.getTaskExecutor();
  }
  
  @NonNull
  @RequiresApi(24)
  public final List<String> getTriggeredContentAuthorities()
  {
    return mWorkerParams.getTriggeredContentAuthorities();
  }
  
  @NonNull
  @RequiresApi(24)
  public final List<Uri> getTriggeredContentUris()
  {
    return mWorkerParams.getTriggeredContentUris();
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public WorkerFactory getWorkerFactory()
  {
    return mWorkerParams.getWorkerFactory();
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public boolean isRunInForeground()
  {
    return mRunInForeground;
  }
  
  public final boolean isStopped()
  {
    return mStopped;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public final boolean isUsed()
  {
    return mUsed;
  }
  
  public void onStopped() {}
  
  @NonNull
  public final ListenableFuture<Void> setForegroundAsync(@NonNull ForegroundInfo paramForegroundInfo)
  {
    mRunInForeground = true;
    return mWorkerParams.getForegroundUpdater().setForegroundAsync(getApplicationContext(), getId(), paramForegroundInfo);
  }
  
  @NonNull
  public ListenableFuture<Void> setProgressAsync(@NonNull Data paramData)
  {
    return mWorkerParams.getProgressUpdater().updateProgress(getApplicationContext(), getId(), paramData);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public void setRunInForeground(boolean paramBoolean)
  {
    mRunInForeground = paramBoolean;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public final void setUsed()
  {
    mUsed = true;
  }
  
  @MainThread
  @NonNull
  public abstract ListenableFuture<Result> startWork();
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public final void stop()
  {
    mStopped = true;
    onStopped();
  }
  
  public static abstract class Result
  {
    @NonNull
    public static Result failure()
    {
      return new Failure();
    }
    
    @NonNull
    public static Result failure(@NonNull Data paramData)
    {
      return new Failure(paramData);
    }
    
    @NonNull
    public static Result retry()
    {
      return new Retry();
    }
    
    @NonNull
    public static Result success()
    {
      return new Success();
    }
    
    @NonNull
    public static Result success(@NonNull Data paramData)
    {
      return new Success(paramData);
    }
    
    @NonNull
    public abstract Data getOutputData();
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Failure
      extends ListenableWorker.Result
    {
      private final Data mOutputData;
      
      public Failure()
      {
        this(Data.EMPTY);
      }
      
      public Failure(@NonNull Data paramData)
      {
        mOutputData = paramData;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this == paramObject) {
          return true;
        }
        if ((paramObject != null) && (Failure.class == paramObject.getClass()))
        {
          paramObject = (Failure)paramObject;
          return mOutputData.equals(mOutputData);
        }
        return false;
      }
      
      @NonNull
      public Data getOutputData()
      {
        return mOutputData;
      }
      
      public int hashCode()
      {
        return mOutputData.hashCode() + 846803280;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = z2.t("Failure {mOutputData=");
        localStringBuilder.append(mOutputData);
        localStringBuilder.append('}');
        return localStringBuilder.toString();
      }
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Retry
      extends ListenableWorker.Result
    {
      public boolean equals(Object paramObject)
      {
        boolean bool = true;
        if (this == paramObject) {
          return true;
        }
        if ((paramObject == null) || (Retry.class != paramObject.getClass())) {
          bool = false;
        }
        return bool;
      }
      
      @NonNull
      public Data getOutputData()
      {
        return Data.EMPTY;
      }
      
      public int hashCode()
      {
        return 25945934;
      }
      
      public String toString()
      {
        return "Retry";
      }
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Success
      extends ListenableWorker.Result
    {
      private final Data mOutputData;
      
      public Success()
      {
        this(Data.EMPTY);
      }
      
      public Success(@NonNull Data paramData)
      {
        mOutputData = paramData;
      }
      
      public boolean equals(Object paramObject)
      {
        if (this == paramObject) {
          return true;
        }
        if ((paramObject != null) && (Success.class == paramObject.getClass()))
        {
          paramObject = (Success)paramObject;
          return mOutputData.equals(mOutputData);
        }
        return false;
      }
      
      @NonNull
      public Data getOutputData()
      {
        return mOutputData;
      }
      
      public int hashCode()
      {
        return mOutputData.hashCode() - 1876823561;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = z2.t("Success {mOutputData=");
        localStringBuilder.append(mOutputData);
        localStringBuilder.append('}');
        return localStringBuilder.toString();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.ListenableWorker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */