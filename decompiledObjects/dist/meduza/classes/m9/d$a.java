package m9;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;

public final class d$a
  extends ConnectivityManager.NetworkCallback
{
  public d$a(d paramd) {}
  
  public final void onAvailable(Network paramNetwork)
  {
    a.c(true);
  }
  
  public final void onLost(Network paramNetwork)
  {
    a.c(false);
  }
}

/* Location:
 * Qualified Name:     m9.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */