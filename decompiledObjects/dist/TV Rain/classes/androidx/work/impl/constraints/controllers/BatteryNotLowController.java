package androidx.work.impl.constraints.controllers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.Constraints;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

public class BatteryNotLowController
  extends ConstraintController<Boolean>
{
  public BatteryNotLowController(Context paramContext, TaskExecutor paramTaskExecutor)
  {
    super(Trackers.getInstance(paramContext, paramTaskExecutor).getBatteryNotLowTracker());
  }
  
  public boolean hasConstraint(@NonNull WorkSpec paramWorkSpec)
  {
    return constraints.requiresBatteryNotLow();
  }
  
  public boolean isConstrained(@NonNull Boolean paramBoolean)
  {
    return paramBoolean.booleanValue() ^ true;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.constraints.controllers.BatteryNotLowController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */