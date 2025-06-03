package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class BatteryChargingTracker
  extends BroadcastReceiverConstraintTracker<Boolean>
{
  private static final String TAG = Logger.tagWithPrefix("BatteryChrgTracker");
  
  public BatteryChargingTracker(@NonNull Context paramContext, @NonNull TaskExecutor paramTaskExecutor)
  {
    super(paramContext, paramTaskExecutor);
  }
  
  private boolean isBatteryChangedIntentCharging(Intent paramIntent)
  {
    int i = paramIntent.getIntExtra("status", -1);
    boolean bool;
    if ((i != 2) && (i != 5)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public Boolean getInitialState()
  {
    Object localObject = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    localObject = mAppContext.registerReceiver(null, (IntentFilter)localObject);
    if (localObject == null)
    {
      Logger.get().error(TAG, "getInitialState - null intent received", new Throwable[0]);
      return null;
    }
    return Boolean.valueOf(isBatteryChangedIntentCharging((Intent)localObject));
  }
  
  public IntentFilter getIntentFilter()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.os.action.CHARGING");
    localIntentFilter.addAction("android.os.action.DISCHARGING");
    return localIntentFilter;
  }
  
  public void onBroadcastReceive(Context paramContext, @NonNull Intent paramIntent)
  {
    paramContext = paramIntent.getAction();
    if (paramContext == null) {
      return;
    }
    paramIntent = Logger.get();
    String str = TAG;
    int i = 1;
    paramIntent.debug(str, String.format("Received %s", new Object[] { paramContext }), new Throwable[0]);
    switch (paramContext.hashCode())
    {
    }
    do
    {
      do
      {
        do
        {
          i = -1;
          break;
        } while (!paramContext.equals("android.intent.action.ACTION_POWER_CONNECTED"));
        i = 3;
        break;
      } while (!paramContext.equals("android.os.action.CHARGING"));
      i = 2;
      break;
      if (paramContext.equals("android.os.action.DISCHARGING")) {
        break;
      }
    } while ((goto 88) || (!paramContext.equals("android.intent.action.ACTION_POWER_DISCONNECTED")));
    i = 0;
    switch (i)
    {
    default: 
      break;
    case 3: 
      setState(Boolean.TRUE);
      break;
    case 2: 
      setState(Boolean.TRUE);
      break;
    case 1: 
      setState(Boolean.FALSE);
      break;
    case 0: 
      setState(Boolean.FALSE);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.constraints.trackers.BatteryChargingTracker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */