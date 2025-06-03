package androidx.work.impl.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class ForceStopRunnable$BroadcastReceiver
  extends BroadcastReceiver
{
  private static final String TAG = Logger.tagWithPrefix("ForceStopRunnable$Rcvr");
  
  public void onReceive(@NonNull Context paramContext, @Nullable Intent paramIntent)
  {
    if ((paramIntent != null) && ("ACTION_FORCE_STOP_RESCHEDULE".equals(paramIntent.getAction())))
    {
      Logger.get().verbose(TAG, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
      ForceStopRunnable.setAlarm(paramContext);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.ForceStopRunnable.BroadcastReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */