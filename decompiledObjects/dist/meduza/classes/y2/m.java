package y2;

import android.net.ConnectivityManager;
import android.net.Network;
import ec.i;

public final class m
{
  public static final Network a(ConnectivityManager paramConnectivityManager)
  {
    i.e(paramConnectivityManager, "<this>");
    return paramConnectivityManager.getActiveNetwork();
  }
}

/* Location:
 * Qualified Name:     y2.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */