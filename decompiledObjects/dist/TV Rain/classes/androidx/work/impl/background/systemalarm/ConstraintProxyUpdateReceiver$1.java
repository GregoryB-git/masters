package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import androidx.work.Logger;
import androidx.work.impl.utils.PackageManagerHelper;

class ConstraintProxyUpdateReceiver$1
  implements Runnable
{
  public ConstraintProxyUpdateReceiver$1(ConstraintProxyUpdateReceiver paramConstraintProxyUpdateReceiver, Intent paramIntent, Context paramContext, BroadcastReceiver.PendingResult paramPendingResult) {}
  
  public void run()
  {
    try
    {
      boolean bool1 = val$intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
      boolean bool2 = val$intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
      boolean bool3 = val$intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
      boolean bool4 = val$intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
      Logger.get().debug(ConstraintProxyUpdateReceiver.TAG, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4) }), new Throwable[0]);
      PackageManagerHelper.setComponentEnabled(val$context, ConstraintProxy.BatteryNotLowProxy.class, bool1);
      PackageManagerHelper.setComponentEnabled(val$context, ConstraintProxy.BatteryChargingProxy.class, bool2);
      PackageManagerHelper.setComponentEnabled(val$context, ConstraintProxy.StorageNotLowProxy.class, bool3);
      PackageManagerHelper.setComponentEnabled(val$context, ConstraintProxy.NetworkStateProxy.class, bool4);
      return;
    }
    finally
    {
      val$pendingResult.finish();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */