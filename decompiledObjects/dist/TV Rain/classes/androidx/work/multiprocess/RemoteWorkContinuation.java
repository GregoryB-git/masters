package androidx.work.multiprocess;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.OneTimeWorkRequest;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

public abstract class RemoteWorkContinuation
{
  @NonNull
  public static RemoteWorkContinuation combine(@NonNull List<RemoteWorkContinuation> paramList)
  {
    return ((RemoteWorkContinuation)paramList.get(0)).combineInternal(paramList);
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public abstract RemoteWorkContinuation combineInternal(@NonNull List<RemoteWorkContinuation> paramList);
  
  @NonNull
  public abstract ListenableFuture<Void> enqueue();
  
  @NonNull
  public final RemoteWorkContinuation then(@NonNull OneTimeWorkRequest paramOneTimeWorkRequest)
  {
    return then(Collections.singletonList(paramOneTimeWorkRequest));
  }
  
  @NonNull
  public abstract RemoteWorkContinuation then(@NonNull List<OneTimeWorkRequest> paramList);
}

/* Location:
 * Qualified Name:     androidx.work.multiprocess.RemoteWorkContinuation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */