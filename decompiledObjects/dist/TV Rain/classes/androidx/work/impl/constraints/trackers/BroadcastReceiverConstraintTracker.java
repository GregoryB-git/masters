package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public abstract class BroadcastReceiverConstraintTracker<T>
  extends ConstraintTracker<T>
{
  private static final String TAG = Logger.tagWithPrefix("BrdcstRcvrCnstrntTrckr");
  private final BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver()
  {
    public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      if (paramAnonymousIntent != null) {
        onBroadcastReceive(paramAnonymousContext, paramAnonymousIntent);
      }
    }
  };
  
  public BroadcastReceiverConstraintTracker(@NonNull Context paramContext, @NonNull TaskExecutor paramTaskExecutor)
  {
    super(paramContext, paramTaskExecutor);
  }
  
  public abstract IntentFilter getIntentFilter();
  
  public abstract void onBroadcastReceive(Context paramContext, @NonNull Intent paramIntent);
  
  public void startTracking()
  {
    Logger.get().debug(TAG, String.format("%s: registering receiver", new Object[] { getClass().getSimpleName() }), new Throwable[0]);
    mAppContext.registerReceiver(mBroadcastReceiver, getIntentFilter());
  }
  
  public void stopTracking()
  {
    Logger.get().debug(TAG, String.format("%s: unregistering receiver", new Object[] { getClass().getSimpleName() }), new Throwable[0]);
    mAppContext.unregisterReceiver(mBroadcastReceiver);
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */