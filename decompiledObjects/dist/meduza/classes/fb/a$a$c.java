package fb;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import eb.n0;

public final class a$a$c
  extends ConnectivityManager.NetworkCallback
{
  public a$a$c(a.a parama) {}
  
  public final void onAvailable(Network paramNetwork)
  {
    a.b.D();
  }
  
  public final void onBlockedStatusChanged(Network paramNetwork, boolean paramBoolean)
  {
    if (!paramBoolean) {
      a.b.D();
    }
  }
}

/* Location:
 * Qualified Name:     fb.a.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */