package androidx.work.impl.constraints;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.work.Logger;
import androidx.work.impl.constraints.controllers.BatteryChargingController;
import androidx.work.impl.constraints.controllers.BatteryNotLowController;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback;
import androidx.work.impl.constraints.controllers.NetworkConnectedController;
import androidx.work.impl.constraints.controllers.NetworkMeteredController;
import androidx.work.impl.constraints.controllers.NetworkNotRoamingController;
import androidx.work.impl.constraints.controllers.NetworkUnmeteredController;
import androidx.work.impl.constraints.controllers.StorageNotLowController;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WorkConstraintsTracker
  implements ConstraintController.OnConstraintUpdatedCallback
{
  private static final String TAG = Logger.tagWithPrefix("WorkConstraintsTracker");
  @Nullable
  private final WorkConstraintsCallback mCallback;
  private final ConstraintController<?>[] mConstraintControllers;
  private final Object mLock;
  
  public WorkConstraintsTracker(@NonNull Context paramContext, @NonNull TaskExecutor paramTaskExecutor, @Nullable WorkConstraintsCallback paramWorkConstraintsCallback)
  {
    paramContext = paramContext.getApplicationContext();
    mCallback = paramWorkConstraintsCallback;
    mConstraintControllers = new ConstraintController[] { new BatteryChargingController(paramContext, paramTaskExecutor), new BatteryNotLowController(paramContext, paramTaskExecutor), new StorageNotLowController(paramContext, paramTaskExecutor), new NetworkConnectedController(paramContext, paramTaskExecutor), new NetworkUnmeteredController(paramContext, paramTaskExecutor), new NetworkNotRoamingController(paramContext, paramTaskExecutor), new NetworkMeteredController(paramContext, paramTaskExecutor) };
    mLock = new Object();
  }
  
  @VisibleForTesting
  public WorkConstraintsTracker(@Nullable WorkConstraintsCallback paramWorkConstraintsCallback, ConstraintController<?>[] paramArrayOfConstraintController)
  {
    mCallback = paramWorkConstraintsCallback;
    mConstraintControllers = paramArrayOfConstraintController;
    mLock = new Object();
  }
  
  public boolean areAllConstraintsMet(@NonNull String paramString)
  {
    synchronized (mLock)
    {
      for (ConstraintController localConstraintController : mConstraintControllers) {
        if (localConstraintController.isWorkSpecConstrained(paramString))
        {
          Logger.get().debug(TAG, String.format("Work %s constrained by %s", new Object[] { paramString, localConstraintController.getClass().getSimpleName() }), new Throwable[0]);
          return false;
        }
      }
      return true;
    }
  }
  
  public void onConstraintMet(@NonNull List<String> paramList)
  {
    synchronized (mLock)
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        paramList = (String)localIterator.next();
        if (areAllConstraintsMet(paramList))
        {
          Logger.get().debug(TAG, String.format("Constraints met for %s", new Object[] { paramList }), new Throwable[0]);
          localArrayList.add(paramList);
        }
      }
      paramList = mCallback;
      if (paramList != null) {
        paramList.onAllConstraintsMet(localArrayList);
      }
      return;
    }
  }
  
  public void onConstraintNotMet(@NonNull List<String> paramList)
  {
    synchronized (mLock)
    {
      WorkConstraintsCallback localWorkConstraintsCallback = mCallback;
      if (localWorkConstraintsCallback != null) {
        localWorkConstraintsCallback.onAllConstraintsNotMet(paramList);
      }
      return;
    }
  }
  
  public void replace(@NonNull Iterable<WorkSpec> paramIterable)
  {
    synchronized (mLock)
    {
      ConstraintController[] arrayOfConstraintController = mConstraintControllers;
      int i = arrayOfConstraintController.length;
      int j = 0;
      for (int k = 0; k < i; k++) {
        arrayOfConstraintController[k].setCallback(null);
      }
      arrayOfConstraintController = mConstraintControllers;
      i = arrayOfConstraintController.length;
      for (k = 0; k < i; k++) {
        arrayOfConstraintController[k].replace(paramIterable);
      }
      paramIterable = mConstraintControllers;
      i = paramIterable.length;
      for (k = j; k < i; k++) {
        paramIterable[k].setCallback(this);
      }
      return;
    }
  }
  
  public void reset()
  {
    synchronized (mLock)
    {
      ConstraintController[] arrayOfConstraintController = mConstraintControllers;
      int i = arrayOfConstraintController.length;
      for (int j = 0; j < i; j++) {
        arrayOfConstraintController[j].reset();
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.constraints.WorkConstraintsTracker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */