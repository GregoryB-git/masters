package androidx.work.impl.constraints.controllers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

public class NetworkNotRoamingController
  extends ConstraintController<NetworkState>
{
  private static final String TAG = Logger.tagWithPrefix("NetworkNotRoamingCtrlr");
  
  public NetworkNotRoamingController(Context paramContext, TaskExecutor paramTaskExecutor)
  {
    super(Trackers.getInstance(paramContext, paramTaskExecutor).getNetworkStateTracker());
  }
  
  public boolean hasConstraint(@NonNull WorkSpec paramWorkSpec)
  {
    boolean bool;
    if (constraints.getRequiredNetworkType() == NetworkType.NOT_ROAMING) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isConstrained(@NonNull NetworkState paramNetworkState)
  {
    boolean bool;
    if ((paramNetworkState.isConnected()) && (paramNetworkState.isNotRoaming())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.constraints.controllers.NetworkNotRoamingController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */