package androidx.core.net;

import android.net.ConnectivityManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
class ConnectivityManagerCompat$Api24Impl
{
  @DoNotInline
  public static int getRestrictBackgroundStatus(ConnectivityManager paramConnectivityManager)
  {
    return paramConnectivityManager.getRestrictBackgroundStatus();
  }
}

/* Location:
 * Qualified Name:     androidx.core.net.ConnectivityManagerCompat.Api24Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */