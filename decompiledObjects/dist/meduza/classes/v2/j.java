package v2;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import ec.i;
import t2.c;
import y2.l;
import y2.m;

public final class j
{
  public static final String a;
  
  static
  {
    String str = o2.j.f("NetworkStateTracker");
    i.d(str, "tagWithPrefix(\"NetworkStateTracker\")");
    a = str;
  }
  
  public static final c a(ConnectivityManager paramConnectivityManager)
  {
    i.e(paramConnectivityManager, "<this>");
    NetworkInfo localNetworkInfo = paramConnectivityManager.getActiveNetworkInfo();
    boolean bool1 = true;
    boolean bool2;
    if ((localNetworkInfo != null) && (localNetworkInfo.isConnected())) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    boolean bool3;
    try
    {
      NetworkCapabilities localNetworkCapabilities = l.a(paramConnectivityManager, m.a(paramConnectivityManager));
      if (localNetworkCapabilities != null) {
        bool3 = l.b(localNetworkCapabilities, 16);
      }
    }
    catch (SecurityException localSecurityException)
    {
      o2.j.d().c(a, "Unable to validate active network", localSecurityException);
      bool3 = false;
    }
    boolean bool4 = paramConnectivityManager.isActiveNetworkMetered();
    if ((localNetworkInfo == null) || (localNetworkInfo.isRoaming())) {
      bool1 = false;
    }
    return new c(bool2, bool3, bool4, bool1);
  }
}

/* Location:
 * Qualified Name:     v2.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */