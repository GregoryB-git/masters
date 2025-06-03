package androidx.work.impl.background.systemalarm;

import a3.b;
import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import o2.j;
import p2.k0;
import y2.o;

public class ConstraintProxyUpdateReceiver
  extends BroadcastReceiver
{
  public static final String a = j.f("ConstrntProxyUpdtRecvr");
  
  public final void onReceive(final Context paramContext, Intent paramIntent)
  {
    final Object localObject;
    if (paramIntent != null) {
      localObject = paramIntent.getAction();
    } else {
      localObject = null;
    }
    if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(localObject))
    {
      j localj = j.d();
      paramIntent = a;
      paramContext = new StringBuilder();
      paramContext.append("Ignoring unknown action ");
      paramContext.append((String)localObject);
      localj.a(paramIntent, paramContext.toString());
    }
    else
    {
      localObject = goAsync();
      dd.d(new a(paramIntent, paramContext, (BroadcastReceiver.PendingResult)localObject));
    }
  }
  
  public final class a
    implements Runnable
  {
    public a(Context paramContext, BroadcastReceiver.PendingResult paramPendingResult) {}
    
    public final void run()
    {
      try
      {
        boolean bool1 = getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
        boolean bool2 = getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
        boolean bool3 = getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
        boolean bool4 = getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
        Object localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("Updating proxies: (BatteryNotLowProxy (");
        ((StringBuilder)localObject1).append(bool1);
        ((StringBuilder)localObject1).append("), BatteryChargingProxy (");
        ((StringBuilder)localObject1).append(bool2);
        ((StringBuilder)localObject1).append("), StorageNotLowProxy (");
        ((StringBuilder)localObject1).append(bool3);
        ((StringBuilder)localObject1).append("), NetworkStateProxy (");
        ((StringBuilder)localObject1).append(bool4);
        ((StringBuilder)localObject1).append("), ");
        localObject1 = ((StringBuilder)localObject1).toString();
        j.d().a(ConstraintProxyUpdateReceiver.a, (String)localObject1);
        o.a(paramContext, ConstraintProxy.BatteryNotLowProxy.class, bool1);
        o.a(paramContext, ConstraintProxy.BatteryChargingProxy.class, bool2);
        o.a(paramContext, ConstraintProxy.StorageNotLowProxy.class, bool3);
        o.a(paramContext, ConstraintProxy.NetworkStateProxy.class, bool4);
        return;
      }
      finally
      {
        localObject.finish();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */