package v2;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;

public final class i$a
  extends ConnectivityManager.NetworkCallback
{
  public i$a(i parami) {}
  
  public final void onCapabilitiesChanged(Network paramNetwork, NetworkCapabilities paramNetworkCapabilities)
  {
    ec.i.e(paramNetwork, "network");
    ec.i.e(paramNetworkCapabilities, "capabilities");
    o2.j localj = o2.j.d();
    String str = j.a;
    paramNetwork = new StringBuilder();
    paramNetwork.append("Network capabilities changed: ");
    paramNetwork.append(paramNetworkCapabilities);
    localj.a(str, paramNetwork.toString());
    paramNetwork = a;
    paramNetwork.b(j.a(f));
  }
  
  public final void onLost(Network paramNetwork)
  {
    ec.i.e(paramNetwork, "network");
    o2.j.d().a(j.a, "Network connection lost");
    paramNetwork = a;
    paramNetwork.b(j.a(f));
  }
}

/* Location:
 * Qualified Name:     v2.i.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */