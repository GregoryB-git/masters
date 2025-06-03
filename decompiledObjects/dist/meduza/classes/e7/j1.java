package e7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class j1
  extends BroadcastReceiver
{
  public final i6 a;
  public boolean b;
  public boolean c;
  
  public j1(i6 parami6)
  {
    a = parami6;
  }
  
  public final void a()
  {
    a.d0();
    a.zzl().l();
    a.zzl().l();
    if (!b) {
      return;
    }
    a.zzj().w.b("Unregistering connectivity change receiver");
    b = false;
    c = false;
    Context localContext = a.t.a;
    try
    {
      localContext.unregisterReceiver(this);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      a.zzj().o.c("Failed to unregister the network broadcast receiver", localIllegalArgumentException);
    }
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    a.d0();
    paramContext = paramIntent.getAction();
    a.zzj().w.c("NetworkBroadcastReceiver received action", paramContext);
    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(paramContext))
    {
      paramContext = a.b;
      i6.q(paramContext);
      boolean bool = paramContext.u();
      if (c != bool)
      {
        c = bool;
        a.zzl().u(new m1(this, bool));
      }
      return;
    }
    a.zzj().r.c("NetworkBroadcastReceiver received unknown action", paramContext);
  }
}

/* Location:
 * Qualified Name:     e7.j1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */