package androidx.work.impl.constraints.controllers;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

public class NetworkUnmeteredController
  extends ConstraintController<NetworkState>
{
  public NetworkUnmeteredController(@NonNull Context paramContext, @NonNull TaskExecutor paramTaskExecutor)
  {
    super(Trackers.getInstance(paramContext, paramTaskExecutor).getNetworkStateTracker());
  }
  
  public boolean hasConstraint(@NonNull WorkSpec paramWorkSpec)
  {
    boolean bool;
    if ((constraints.getRequiredNetworkType() != NetworkType.UNMETERED) && ((Build.VERSION.SDK_INT < 30) || (constraints.getRequiredNetworkType() != NetworkType.TEMPORARILY_UNMETERED))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean isConstrained(@NonNull NetworkState paramNetworkState)
  {
    boolean bool;
    if ((paramNetworkState.isConnected()) && (!paramNetworkState.isMetered())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.constraints.controllers.NetworkUnmeteredController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */