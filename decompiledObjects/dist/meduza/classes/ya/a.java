package ya;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import java.util.ArrayList;

public final class a
{
  public final ConnectivityManager a;
  
  public a(ConnectivityManager paramConnectivityManager)
  {
    a = paramConnectivityManager;
  }
  
  public static ArrayList a(NetworkCapabilities paramNetworkCapabilities)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramNetworkCapabilities != null) && (paramNetworkCapabilities.hasCapability(12)))
    {
      if ((paramNetworkCapabilities.hasTransport(1)) || (paramNetworkCapabilities.hasTransport(5))) {
        localArrayList.add("wifi");
      }
      if (paramNetworkCapabilities.hasTransport(3)) {
        localArrayList.add("ethernet");
      }
      if (paramNetworkCapabilities.hasTransport(4)) {
        localArrayList.add("vpn");
      }
      if (paramNetworkCapabilities.hasTransport(0)) {
        localArrayList.add("mobile");
      }
      if (paramNetworkCapabilities.hasTransport(2)) {
        localArrayList.add("bluetooth");
      }
      if ((localArrayList.isEmpty()) && (paramNetworkCapabilities.hasCapability(12))) {
        localArrayList.add("other");
      }
      if (localArrayList.isEmpty()) {
        localArrayList.add("none");
      }
      return localArrayList;
    }
    localArrayList.add("none");
    return localArrayList;
  }
}

/* Location:
 * Qualified Name:     ya.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */