package fb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import eb.n0;

public final class a$a$d
  extends BroadcastReceiver
{
  public boolean a = false;
  
  public a$a$d(a.a parama) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    boolean bool1 = a;
    boolean bool2;
    if ((paramContext != null) && (paramContext.isConnected())) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    a = bool2;
    if ((bool2) && (!bool1)) {
      b.b.D();
    }
  }
}

/* Location:
 * Qualified Name:     fb.a.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */