package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class DelegatingWorkerFactory
  extends WorkerFactory
{
  private static final String TAG = Logger.tagWithPrefix("DelegatingWkrFctry");
  private final List<WorkerFactory> mFactories = new CopyOnWriteArrayList();
  
  public final void addFactory(@NonNull WorkerFactory paramWorkerFactory)
  {
    mFactories.add(paramWorkerFactory);
  }
  
  @Nullable
  public final ListenableWorker createWorker(@NonNull Context paramContext, @NonNull String paramString, @NonNull WorkerParameters paramWorkerParameters)
  {
    Iterator localIterator = mFactories.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (WorkerFactory)localIterator.next();
      try
      {
        localObject = ((WorkerFactory)localObject).createWorker(paramContext, paramString, paramWorkerParameters);
        if (localObject != null) {
          return (ListenableWorker)localObject;
        }
      }
      finally
      {
        paramString = String.format("Unable to instantiate a ListenableWorker (%s)", new Object[] { paramString });
        Logger.get().error(TAG, paramString, new Throwable[] { paramContext });
      }
    }
    return null;
  }
  
  @NonNull
  @VisibleForTesting
  public List<WorkerFactory> getFactories()
  {
    return mFactories;
  }
}

/* Location:
 * Qualified Name:     androidx.work.DelegatingWorkerFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */