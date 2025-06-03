package androidx.work.impl.constraints.controllers;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

public class NetworkMeteredController
  extends ConstraintController<NetworkState>
{
  private static final String TAG = Logger.tagWithPrefix("NetworkMeteredCtrlr");
  
  public NetworkMeteredController(Context paramContext, TaskExecutor paramTaskExecutor)
  {
    super(Trackers.getInstance(paramContext, paramTaskExecutor).getNetworkStateTracker());
  }
  
  public boolean hasConstraint(@NonNull WorkSpec paramWorkSpec)
  {
    boolean bool;
    if (constraints.getRequiredNetworkType() == NetworkType.METERED) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isConstrained(@NonNull NetworkState paramNetworkState)
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool1 = true;
    if (i < 26)
    {
      Logger.get().debug(TAG, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
      return paramNetworkState.isConnected() ^ true;
    }
    boolean bool2 = bool1;
    if (paramNetworkState.isConnected()) {
      if (!paramNetworkState.isMetered()) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    return bool2;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.constraints.controllers.NetworkMeteredController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */