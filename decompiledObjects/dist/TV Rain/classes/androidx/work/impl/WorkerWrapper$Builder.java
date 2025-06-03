package androidx.work.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.Configuration;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters.RuntimeExtras;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.List;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class WorkerWrapper$Builder
{
  @NonNull
  public Context mAppContext;
  @NonNull
  public Configuration mConfiguration;
  @NonNull
  public ForegroundProcessor mForegroundProcessor;
  @NonNull
  public WorkerParameters.RuntimeExtras mRuntimeExtras = new WorkerParameters.RuntimeExtras();
  public List<Scheduler> mSchedulers;
  @NonNull
  public WorkDatabase mWorkDatabase;
  @NonNull
  public String mWorkSpecId;
  @NonNull
  public TaskExecutor mWorkTaskExecutor;
  @Nullable
  public ListenableWorker mWorker;
  
  public WorkerWrapper$Builder(@NonNull Context paramContext, @NonNull Configuration paramConfiguration, @NonNull TaskExecutor paramTaskExecutor, @NonNull ForegroundProcessor paramForegroundProcessor, @NonNull WorkDatabase paramWorkDatabase, @NonNull String paramString)
  {
    mAppContext = paramContext.getApplicationContext();
    mWorkTaskExecutor = paramTaskExecutor;
    mForegroundProcessor = paramForegroundProcessor;
    mConfiguration = paramConfiguration;
    mWorkDatabase = paramWorkDatabase;
    mWorkSpecId = paramString;
  }
  
  @NonNull
  public WorkerWrapper build()
  {
    return new WorkerWrapper(this);
  }
  
  @NonNull
  public Builder withRuntimeExtras(@Nullable WorkerParameters.RuntimeExtras paramRuntimeExtras)
  {
    if (paramRuntimeExtras != null) {
      mRuntimeExtras = paramRuntimeExtras;
    }
    return this;
  }
  
  @NonNull
  public Builder withSchedulers(@NonNull List<Scheduler> paramList)
  {
    mSchedulers = paramList;
    return this;
  }
  
  @NonNull
  @VisibleForTesting
  public Builder withWorker(@NonNull ListenableWorker paramListenableWorker)
  {
    mWorker = paramListenableWorker;
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.WorkerWrapper.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */