package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.Logger;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.PackageManagerHelper;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

public class ConstraintProxyUpdateReceiver
  extends BroadcastReceiver
{
  public static final String ACTION = "androidx.work.impl.background.systemalarm.UpdateProxies";
  public static final String KEY_BATTERY_CHARGING_PROXY_ENABLED = "KEY_BATTERY_CHARGING_PROXY_ENABLED";
  public static final String KEY_BATTERY_NOT_LOW_PROXY_ENABLED = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED";
  public static final String KEY_NETWORK_STATE_PROXY_ENABLED = "KEY_NETWORK_STATE_PROXY_ENABLED";
  public static final String KEY_STORAGE_NOT_LOW_PROXY_ENABLED = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED";
  public static final String TAG = Logger.tagWithPrefix("ConstrntProxyUpdtRecvr");
  
  public static Intent newConstraintProxyUpdateIntent(Context paramContext, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    Intent localIntent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
    localIntent.setComponent(new ComponentName(paramContext, ConstraintProxyUpdateReceiver.class));
    localIntent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", paramBoolean1).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", paramBoolean2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", paramBoolean3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", paramBoolean4);
    return localIntent;
  }
  
  public void onReceive(@NonNull final Context paramContext, @Nullable final Intent paramIntent)
  {
    final Object localObject;
    if (paramIntent != null) {
      localObject = paramIntent.getAction();
    } else {
      localObject = null;
    }
    if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(localObject))
    {
      Logger.get().debug(TAG, String.format("Ignoring unknown action %s", new Object[] { localObject }), new Throwable[0]);
    }
    else
    {
      localObject = goAsync();
      WorkManagerImpl.getInstance(paramContext).getWorkTaskExecutor().executeOnBackgroundThread(new Runnable()
      {
        public void run()
        {
          try
          {
            boolean bool1 = paramIntent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
            boolean bool2 = paramIntent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
            boolean bool3 = paramIntent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
            boolean bool4 = paramIntent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
            Logger.get().debug(ConstraintProxyUpdateReceiver.TAG, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4) }), new Throwable[0]);
            PackageManagerHelper.setComponentEnabled(paramContext, ConstraintProxy.BatteryNotLowProxy.class, bool1);
            PackageManagerHelper.setComponentEnabled(paramContext, ConstraintProxy.BatteryChargingProxy.class, bool2);
            PackageManagerHelper.setComponentEnabled(paramContext, ConstraintProxy.StorageNotLowProxy.class, bool3);
            PackageManagerHelper.setComponentEnabled(paramContext, ConstraintProxy.NetworkStateProxy.class, bool4);
            return;
          }
          finally
          {
            localObject.finish();
          }
        }
      });
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */