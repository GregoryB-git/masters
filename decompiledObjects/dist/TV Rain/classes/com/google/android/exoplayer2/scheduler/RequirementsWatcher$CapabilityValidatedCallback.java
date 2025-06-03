package com.google.android.exoplayer2.scheduler;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import androidx.annotation.RequiresApi;

@RequiresApi(api=21)
final class RequirementsWatcher$CapabilityValidatedCallback
  extends ConnectivityManager.NetworkCallback
{
  private RequirementsWatcher$CapabilityValidatedCallback(RequirementsWatcher paramRequirementsWatcher) {}
  
  public void onAvailable(Network paramNetwork)
  {
    super.onAvailable(paramNetwork);
    paramNetwork = new StringBuilder();
    paramNetwork.append(this$0);
    paramNetwork.append(" NetworkCallback.onAvailable");
    RequirementsWatcher.access$200(paramNetwork.toString());
    RequirementsWatcher.access$300(this$0);
  }
  
  public void onLost(Network paramNetwork)
  {
    super.onLost(paramNetwork);
    paramNetwork = new StringBuilder();
    paramNetwork.append(this$0);
    paramNetwork.append(" NetworkCallback.onLost");
    RequirementsWatcher.access$200(paramNetwork.toString());
    RequirementsWatcher.access$300(this$0);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.scheduler.RequirementsWatcher.CapabilityValidatedCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */