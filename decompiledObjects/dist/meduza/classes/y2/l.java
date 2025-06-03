package y2;

import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;
import ec.i;

public final class l
{
  public static final NetworkCapabilities a(ConnectivityManager paramConnectivityManager, Network paramNetwork)
  {
    i.e(paramConnectivityManager, "<this>");
    return paramConnectivityManager.getNetworkCapabilities(paramNetwork);
  }
  
  public static final boolean b(NetworkCapabilities paramNetworkCapabilities, int paramInt)
  {
    i.e(paramNetworkCapabilities, "<this>");
    return paramNetworkCapabilities.hasCapability(paramInt);
  }
  
  public static final void c(ConnectivityManager paramConnectivityManager, ConnectivityManager.NetworkCallback paramNetworkCallback)
  {
    i.e(paramConnectivityManager, "<this>");
    i.e(paramNetworkCallback, "networkCallback");
    paramConnectivityManager.unregisterNetworkCallback(paramNetworkCallback);
  }
}

/* Location:
 * Qualified Name:     y2.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */