package androidx.work.impl.constraints.trackers;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.work.Logger;

@RequiresApi(24)
class NetworkStateTracker$NetworkStateCallback
  extends ConnectivityManager.NetworkCallback
{
  public NetworkStateTracker$NetworkStateCallback(NetworkStateTracker paramNetworkStateTracker) {}
  
  public void onCapabilitiesChanged(@NonNull Network paramNetwork, @NonNull NetworkCapabilities paramNetworkCapabilities)
  {
    Logger.get().debug(NetworkStateTracker.TAG, String.format("Network capabilities changed: %s", new Object[] { paramNetworkCapabilities }), new Throwable[0]);
    paramNetwork = this$0;
    paramNetwork.setState(paramNetwork.getActiveNetworkState());
  }
  
  public void onLost(@NonNull Network paramNetwork)
  {
    Logger.get().debug(NetworkStateTracker.TAG, "Network connection lost", new Throwable[0]);
    paramNetwork = this$0;
    paramNetwork.setState(paramNetwork.getActiveNetworkState());
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.constraints.trackers.NetworkStateTracker.NetworkStateCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */