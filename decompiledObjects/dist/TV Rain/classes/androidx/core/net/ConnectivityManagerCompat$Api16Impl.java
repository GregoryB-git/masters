package androidx.core.net;

import android.net.ConnectivityManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;

@RequiresApi(16)
class ConnectivityManagerCompat$Api16Impl
{
  @DoNotInline
  @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
  public static boolean isActiveNetworkMetered(ConnectivityManager paramConnectivityManager)
  {
    return paramConnectivityManager.isActiveNetworkMetered();
  }
}

/* Location:
 * Qualified Name:     androidx.core.net.ConnectivityManagerCompat.Api16Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */