package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

public abstract class WorkContinuation
{
  @NonNull
  public static WorkContinuation combine(@NonNull List<WorkContinuation> paramList)
  {
    return ((WorkContinuation)paramList.get(0)).combineInternal(paramList);
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public abstract WorkContinuation combineInternal(@NonNull List<WorkContinuation> paramList);
  
  @NonNull
  public abstract Operation enqueue();
  
  @NonNull
  public abstract ListenableFuture<List<WorkInfo>> getWorkInfos();
  
  @NonNull
  public abstract LiveData<List<WorkInfo>> getWorkInfosLiveData();
  
  @NonNull
  public final WorkContinuation then(@NonNull OneTimeWorkRequest paramOneTimeWorkRequest)
  {
    return then(Collections.singletonList(paramOneTimeWorkRequest));
  }
  
  @NonNull
  public abstract WorkContinuation then(@NonNull List<OneTimeWorkRequest> paramList);
}

/* Location:
 * Qualified Name:     androidx.work.WorkContinuation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */