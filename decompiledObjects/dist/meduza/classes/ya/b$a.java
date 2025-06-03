package ya;

import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;

public final class b$a
  extends ConnectivityManager.NetworkCallback
{
  public b$a(b paramb) {}
  
  public final void onAvailable(Network paramNetwork)
  {
    b localb = a;
    localb.a(a.a(b.a.getNetworkCapabilities(paramNetwork)));
  }
  
  public final void onCapabilitiesChanged(Network paramNetwork, NetworkCapabilities paramNetworkCapabilities)
  {
    paramNetwork = a;
    b.getClass();
    paramNetwork.a(a.a(paramNetworkCapabilities));
  }
  
  public final void onLost(Network paramNetwork)
  {
    paramNetwork = a;
    paramNetwork.getClass();
    u.a locala = new u.a(paramNetwork, 18);
    d.postDelayed(locala, 500L);
  }
}

/* Location:
 * Qualified Name:     ya.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */