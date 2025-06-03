package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class BatteryNotLowTracker
  extends BroadcastReceiverConstraintTracker<Boolean>
{
  public static final float BATTERY_LOW_THRESHOLD = 0.15F;
  private static final String TAG = Logger.tagWithPrefix("BatteryNotLowTracker");
  
  public BatteryNotLowTracker(@NonNull Context paramContext, @NonNull TaskExecutor paramTaskExecutor)
  {
    super(paramContext, paramTaskExecutor);
  }
  
  public Boolean getInitialState()
  {
    Object localObject = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    localObject = mAppContext.registerReceiver(null, (IntentFilter)localObject);
    boolean bool = false;
    if (localObject == null)
    {
      Logger.get().error(TAG, "getInitialState - null intent received", new Throwable[0]);
      return null;
    }
    int i = ((Intent)localObject).getIntExtra("status", -1);
    int j = ((Intent)localObject).getIntExtra("level", -1);
    int k = ((Intent)localObject).getIntExtra("scale", -1);
    float f = j / k;
    if ((i == 1) || (f > 0.15F)) {
      bool = true;
    }
    return Boolean.valueOf(bool);
  }
  
  public IntentFilter getIntentFilter()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.BATTERY_OKAY");
    localIntentFilter.addAction("android.intent.action.BATTERY_LOW");
    return localIntentFilter;
  }
  
  public void onBroadcastReceive(Context paramContext, @NonNull Intent paramIntent)
  {
    if (paramIntent.getAction() == null) {
      return;
    }
    Logger.get().debug(TAG, String.format("Received %s", new Object[] { paramIntent.getAction() }), new Throwable[0]);
    paramContext = paramIntent.getAction();
    paramContext.getClass();
    if (!paramContext.equals("android.intent.action.BATTERY_OKAY"))
    {
      if (paramContext.equals("android.intent.action.BATTERY_LOW")) {
        setState(Boolean.FALSE);
      }
    }
    else {
      setState(Boolean.TRUE);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.constraints.trackers.BatteryNotLowTracker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */