package R2;

import A2.n;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public class j2
  extends BroadcastReceiver
{
  public final D5 a;
  public boolean b;
  public boolean c;
  
  public j2(D5 paramD5)
  {
    n.i(paramD5);
    a = paramD5;
  }
  
  public final void b()
  {
    a.p0();
    a.e().n();
    if (b) {
      return;
    }
    a.a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    c = a.g0().A();
    a.j().K().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(c));
    b = true;
  }
  
  public final void c()
  {
    a.p0();
    a.e().n();
    a.e().n();
    if (!b) {
      return;
    }
    a.j().K().a("Unregistering connectivity change receiver");
    b = false;
    c = false;
    Context localContext = a.a();
    try
    {
      localContext.unregisterReceiver(this);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      a.j().G().b("Failed to unregister the network broadcast receiver", localIllegalArgumentException);
    }
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    a.p0();
    paramContext = paramIntent.getAction();
    a.j().K().b("NetworkBroadcastReceiver received action", paramContext);
    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(paramContext))
    {
      boolean bool = a.g0().A();
      if (c != bool)
      {
        c = bool;
        a.e().D(new m2(this, bool));
      }
      return;
    }
    a.j().L().b("NetworkBroadcastReceiver received unknown action", paramContext);
  }
}

/* Location:
 * Qualified Name:     R2.j2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */