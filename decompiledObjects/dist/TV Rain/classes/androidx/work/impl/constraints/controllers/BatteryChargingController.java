package androidx.work.impl.constraints.controllers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.Constraints;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

public class BatteryChargingController
  extends ConstraintController<Boolean>
{
  public BatteryChargingController(Context paramContext, TaskExecutor paramTaskExecutor)
  {
    super(Trackers.getInstance(paramContext, paramTaskExecutor).getBatteryChargingTracker());
  }
  
  public boolean hasConstraint(@NonNull WorkSpec paramWorkSpec)
  {
    return constraints.requiresCharging();
  }
  
  public boolean isConstrained(@NonNull Boolean paramBoolean)
  {
    return paramBoolean.booleanValue() ^ true;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.constraints.controllers.BatteryChargingController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */