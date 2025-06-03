package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.Logger;

class NetworkStateTracker$NetworkStateBroadcastReceiver
  extends BroadcastReceiver
{
  public NetworkStateTracker$NetworkStateBroadcastReceiver(NetworkStateTracker paramNetworkStateTracker) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramIntent != null) && (paramIntent.getAction() != null) && (paramIntent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")))
    {
      Logger.get().debug(NetworkStateTracker.TAG, "Network broadcast received", new Throwable[0]);
      paramContext = this$0;
      paramContext.setState(paramContext.getActiveNetworkState());
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.constraints.trackers.NetworkStateTracker.NetworkStateBroadcastReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */