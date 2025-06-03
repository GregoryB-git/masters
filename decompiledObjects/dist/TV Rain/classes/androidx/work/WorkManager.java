package androidx.work;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import androidx.work.impl.WorkManagerImpl;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@SuppressLint({"AddedAbstractMethod"})
public abstract class WorkManager
{
  @Deprecated
  @NonNull
  public static WorkManager getInstance()
  {
    WorkManagerImpl localWorkManagerImpl = WorkManagerImpl.getInstance();
    if (localWorkManagerImpl != null) {
      return localWorkManagerImpl;
    }
    throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
  }
  
  @NonNull
  public static WorkManager getInstance(@NonNull Context paramContext)
  {
    return WorkManagerImpl.getInstance(paramContext);
  }
  
  public static void initialize(@NonNull Context paramContext, @NonNull Configuration paramConfiguration)
  {
    WorkManagerImpl.initialize(paramContext, paramConfiguration);
  }
  
  @NonNull
  public final WorkContinuation beginUniqueWork(@NonNull String paramString, @NonNull ExistingWorkPolicy paramExistingWorkPolicy, @NonNull OneTimeWorkRequest paramOneTimeWorkRequest)
  {
    return beginUniqueWork(paramString, paramExistingWorkPolicy, Collections.singletonList(paramOneTimeWorkRequest));
  }
  
  @NonNull
  public abstract WorkContinuation beginUniqueWork(@NonNull String paramString, @NonNull ExistingWorkPolicy paramExistingWorkPolicy, @NonNull List<OneTimeWorkRequest> paramList);
  
  @NonNull
  public final WorkContinuation beginWith(@NonNull OneTimeWorkRequest paramOneTimeWorkRequest)
  {
    return beginWith(Collections.singletonList(paramOneTimeWorkRequest));
  }
  
  @NonNull
  public abstract WorkContinuation beginWith(@NonNull List<OneTimeWorkRequest> paramList);
  
  @NonNull
  public abstract Operation cancelAllWork();
  
  @NonNull
  public abstract Operation cancelAllWorkByTag(@NonNull String paramString);
  
  @NonNull
  public abstract Operation cancelUniqueWork(@NonNull String paramString);
  
  @NonNull
  public abstract Operation cancelWorkById(@NonNull UUID paramUUID);
  
  @NonNull
  public abstract PendingIntent createCancelPendingIntent(@NonNull UUID paramUUID);
  
  @NonNull
  public final Operation enqueue(@NonNull WorkRequest paramWorkRequest)
  {
    return enqueue(Collections.singletonList(paramWorkRequest));
  }
  
  @NonNull
  public abstract Operation enqueue(@NonNull List<? extends WorkRequest> paramList);
  
  @NonNull
  public abstract Operation enqueueUniquePeriodicWork(@NonNull String paramString, @NonNull ExistingPeriodicWorkPolicy paramExistingPeriodicWorkPolicy, @NonNull PeriodicWorkRequest paramPeriodicWorkRequest);
  
  @NonNull
  public Operation enqueueUniqueWork(@NonNull String paramString, @NonNull ExistingWorkPolicy paramExistingWorkPolicy, @NonNull OneTimeWorkRequest paramOneTimeWorkRequest)
  {
    return enqueueUniqueWork(paramString, paramExistingWorkPolicy, Collections.singletonList(paramOneTimeWorkRequest));
  }
  
  @NonNull
  public abstract Operation enqueueUniqueWork(@NonNull String paramString, @NonNull ExistingWorkPolicy paramExistingWorkPolicy, @NonNull List<OneTimeWorkRequest> paramList);
  
  @NonNull
  public abstract ListenableFuture<Long> getLastCancelAllTimeMillis();
  
  @NonNull
  public abstract LiveData<Long> getLastCancelAllTimeMillisLiveData();
  
  @NonNull
  public abstract ListenableFuture<WorkInfo> getWorkInfoById(@NonNull UUID paramUUID);
  
  @NonNull
  public abstract LiveData<WorkInfo> getWorkInfoByIdLiveData(@NonNull UUID paramUUID);
  
  @NonNull
  public abstract ListenableFuture<List<WorkInfo>> getWorkInfos(@NonNull WorkQuery paramWorkQuery);
  
  @NonNull
  public abstract ListenableFuture<List<WorkInfo>> getWorkInfosByTag(@NonNull String paramString);
  
  @NonNull
  public abstract LiveData<List<WorkInfo>> getWorkInfosByTagLiveData(@NonNull String paramString);
  
  @NonNull
  public abstract ListenableFuture<List<WorkInfo>> getWorkInfosForUniqueWork(@NonNull String paramString);
  
  @NonNull
  public abstract LiveData<List<WorkInfo>> getWorkInfosForUniqueWorkLiveData(@NonNull String paramString);
  
  @NonNull
  public abstract LiveData<List<WorkInfo>> getWorkInfosLiveData(@NonNull WorkQuery paramWorkQuery);
  
  @NonNull
  public abstract Operation pruneWork();
}

/* Location:
 * Qualified Name:     androidx.work.WorkManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */