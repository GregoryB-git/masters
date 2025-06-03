package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class StorageNotLowTracker
  extends BroadcastReceiverConstraintTracker<Boolean>
{
  private static final String TAG = Logger.tagWithPrefix("StorageNotLowTracker");
  
  public StorageNotLowTracker(@NonNull Context paramContext, @NonNull TaskExecutor paramTaskExecutor)
  {
    super(paramContext, paramTaskExecutor);
  }
  
  public Boolean getInitialState()
  {
    Object localObject = mAppContext.registerReceiver(null, getIntentFilter());
    if ((localObject != null) && (((Intent)localObject).getAction() != null))
    {
      localObject = ((Intent)localObject).getAction();
      localObject.getClass();
      if (!((String)localObject).equals("android.intent.action.DEVICE_STORAGE_LOW"))
      {
        if (!((String)localObject).equals("android.intent.action.DEVICE_STORAGE_OK")) {
          return null;
        }
        return Boolean.TRUE;
      }
      return Boolean.FALSE;
    }
    return Boolean.TRUE;
  }
  
  public IntentFilter getIntentFilter()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
    localIntentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
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
    if (!paramContext.equals("android.intent.action.DEVICE_STORAGE_LOW"))
    {
      if (paramContext.equals("android.intent.action.DEVICE_STORAGE_OK")) {
        setState(Boolean.TRUE);
      }
    }
    else {
      setState(Boolean.FALSE);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.constraints.trackers.StorageNotLowTracker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */