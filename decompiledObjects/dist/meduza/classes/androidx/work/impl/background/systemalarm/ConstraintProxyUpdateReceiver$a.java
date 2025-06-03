package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import o2.j;
import y2.o;

public final class ConstraintProxyUpdateReceiver$a
  implements Runnable
{
  public ConstraintProxyUpdateReceiver$a(Intent paramIntent, Context paramContext, BroadcastReceiver.PendingResult paramPendingResult) {}
  
  public final void run()
  {
    try
    {
      boolean bool1 = a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
      boolean bool2 = a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
      boolean bool3 = a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
      boolean bool4 = a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
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
      o.a(b, ConstraintProxy.BatteryNotLowProxy.class, bool1);
      o.a(b, ConstraintProxy.BatteryChargingProxy.class, bool2);
      o.a(b, ConstraintProxy.StorageNotLowProxy.class, bool3);
      o.a(b, ConstraintProxy.NetworkStateProxy.class, bool4);
      return;
    }
    finally
    {
      c.finish();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */