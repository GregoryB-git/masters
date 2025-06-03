package e7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzoy;
import i6.q;
import i6.r;

public final class u6
  extends BroadcastReceiver
{
  public final j2 a;
  
  public u6(j2 paramj2)
  {
    a = paramj2;
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null)
    {
      a.zzj().r.b("App receiver called with null intent");
      return;
    }
    paramContext = paramIntent.getAction();
    if (paramContext == null)
    {
      a.zzj().r.b("App receiver called with null action");
      return;
    }
    if (!paramContext.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE"))
    {
      if (!paramContext.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE"))
      {
        a.zzj().r.b("App receiver called with unknown action");
        return;
      }
      if (a.o.x(null, h0.M0))
      {
        a.zzj().w.b("[sgtm] App Receiver notified batches are available");
        a.zzl().u(new q(this, 5));
      }
      return;
    }
    paramContext = a;
    if ((zzoy.zza()) && (o.x(null, h0.R0)))
    {
      zzjw.b("App receiver notified triggers are available");
      paramContext.zzl().u(new r(paramContext, 5));
    }
  }
}

/* Location:
 * Qualified Name:     e7.u6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */