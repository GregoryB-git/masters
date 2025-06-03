package androidx.work.multiprocess;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Data;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkContinuation;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkManagerImpl;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public abstract class RemoteWorkManager
{
  @NonNull
  public static RemoteWorkManager getInstance(@NonNull Context paramContext)
  {
    paramContext = WorkManagerImpl.getInstance(paramContext).getRemoteWorkManager();
    if (paramContext != null) {
      return paramContext;
    }
    throw new IllegalStateException("Unable to initialize RemoteWorkManager");
  }
  
  @NonNull
  public final RemoteWorkContinuation beginUniqueWork(@NonNull String paramString, @NonNull ExistingWorkPolicy paramExistingWorkPolicy, @NonNull OneTimeWorkRequest paramOneTimeWorkRequest)
  {
    return beginUniqueWork(paramString, paramExistingWorkPolicy, Collections.singletonList(paramOneTimeWorkRequest));
  }
  
  @NonNull
  public abstract RemoteWorkContinuation beginUniqueWork(@NonNull String paramString, @NonNull ExistingWorkPolicy paramExistingWorkPolicy, @NonNull List<OneTimeWorkRequest> paramList);
  
  @NonNull
  public final RemoteWorkContinuation beginWith(@NonNull OneTimeWorkRequest paramOneTimeWorkRequest)
  {
    return beginWith(Collections.singletonList(paramOneTimeWorkRequest));
  }
  
  @NonNull
  public abstract RemoteWorkContinuation beginWith(@NonNull List<OneTimeWorkRequest> paramList);
  
  @NonNull
  public abstract ListenableFuture<Void> cancelAllWork();
  
  @NonNull
  public abstract ListenableFuture<Void> cancelAllWorkByTag(@NonNull String paramString);
  
  @NonNull
  public abstract ListenableFuture<Void> cancelUniqueWork(@NonNull String paramString);
  
  @NonNull
  public abstract ListenableFuture<Void> cancelWorkById(@NonNull UUID paramUUID);
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public abstract ListenableFuture<Void> enqueue(@NonNull WorkContinuation paramWorkContinuation);
  
  @NonNull
  public abstract ListenableFuture<Void> enqueue(@NonNull WorkRequest paramWorkRequest);
  
  @NonNull
  public abstract ListenableFuture<Void> enqueue(@NonNull List<WorkRequest> paramList);
  
  @NonNull
  public abstract ListenableFuture<Void> enqueueUniquePeriodicWork(@NonNull String paramString, @NonNull ExistingPeriodicWorkPolicy paramExistingPeriodicWorkPolicy, @NonNull PeriodicWorkRequest paramPeriodicWorkRequest);
  
  @NonNull
  public final ListenableFuture<Void> enqueueUniqueWork(@NonNull String paramString, @NonNull ExistingWorkPolicy paramExistingWorkPolicy, @NonNull OneTimeWorkRequest paramOneTimeWorkRequest)
  {
    return enqueueUniqueWork(paramString, paramExistingWorkPolicy, Collections.singletonList(paramOneTimeWorkRequest));
  }
  
  @NonNull
  public abstract ListenableFuture<Void> enqueueUniqueWork(@NonNull String paramString, @NonNull ExistingWorkPolicy paramExistingWorkPolicy, @NonNull List<OneTimeWorkRequest> paramList);
  
  @NonNull
  public abstract ListenableFuture<List<WorkInfo>> getWorkInfos(@NonNull WorkQuery paramWorkQuery);
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public abstract ListenableFuture<Void> setProgress(@NonNull UUID paramUUID, @NonNull Data paramData);
}

/* Location:
 * Qualified Name:     androidx.work.multiprocess.RemoteWorkManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */