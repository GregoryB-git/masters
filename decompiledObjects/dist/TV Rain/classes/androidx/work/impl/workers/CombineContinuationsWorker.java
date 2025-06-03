package androidx.work.impl.workers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ListenableWorker;
import androidx.work.ListenableWorker.Result;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class CombineContinuationsWorker
  extends Worker
{
  public CombineContinuationsWorker(@NonNull Context paramContext, @NonNull WorkerParameters paramWorkerParameters)
  {
    super(paramContext, paramWorkerParameters);
  }
  
  @NonNull
  public ListenableWorker.Result doWork()
  {
    return ListenableWorker.Result.success(getInputData());
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.workers.CombineContinuationsWorker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */