package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import androidx.work.d.a;
import androidx.work.d.a.c;

public final class CombineContinuationsWorker
  extends Worker
{
  public CombineContinuationsWorker(Context paramContext, WorkerParameters paramWorkerParameters)
  {
    super(paramContext, paramWorkerParameters);
  }
  
  public final d.a j()
  {
    return new d.a.c(b.b);
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.workers.CombineContinuationsWorker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */