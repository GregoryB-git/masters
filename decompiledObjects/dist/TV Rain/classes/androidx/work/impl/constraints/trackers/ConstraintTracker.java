package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public abstract class ConstraintTracker<T>
{
  private static final String TAG = Logger.tagWithPrefix("ConstraintTracker");
  public final Context mAppContext;
  public T mCurrentState;
  private final Set<ConstraintListener<T>> mListeners = new LinkedHashSet();
  private final Object mLock = new Object();
  public final TaskExecutor mTaskExecutor;
  
  public ConstraintTracker(@NonNull Context paramContext, @NonNull TaskExecutor paramTaskExecutor)
  {
    mAppContext = paramContext.getApplicationContext();
    mTaskExecutor = paramTaskExecutor;
  }
  
  public void addListener(ConstraintListener<T> paramConstraintListener)
  {
    synchronized (mLock)
    {
      if (mListeners.add(paramConstraintListener))
      {
        if (mListeners.size() == 1)
        {
          mCurrentState = getInitialState();
          Logger.get().debug(TAG, String.format("%s: initial state = %s", new Object[] { getClass().getSimpleName(), mCurrentState }), new Throwable[0]);
          startTracking();
        }
        paramConstraintListener.onConstraintChanged(mCurrentState);
      }
      return;
    }
  }
  
  public abstract T getInitialState();
  
  public void removeListener(ConstraintListener<T> paramConstraintListener)
  {
    synchronized (mLock)
    {
      if ((mListeners.remove(paramConstraintListener)) && (mListeners.isEmpty())) {
        stopTracking();
      }
      return;
    }
  }
  
  public void setState(T paramT)
  {
    synchronized (mLock)
    {
      Object localObject2 = mCurrentState;
      if ((localObject2 != paramT) && ((localObject2 == null) || (!localObject2.equals(paramT))))
      {
        mCurrentState = paramT;
        paramT = new java/util/ArrayList;
        paramT.<init>(mListeners);
        localObject2 = mTaskExecutor.getMainThreadExecutor();
        Runnable local1 = new androidx/work/impl/constraints/trackers/ConstraintTracker$1;
        local1.<init>(this, paramT);
        ((Executor)localObject2).execute(local1);
        return;
      }
      return;
    }
  }
  
  public abstract void startTracking();
  
  public abstract void stopTracking();
}

/* Location:
 * Qualified Name:     androidx.work.impl.constraints.trackers.ConstraintTracker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */