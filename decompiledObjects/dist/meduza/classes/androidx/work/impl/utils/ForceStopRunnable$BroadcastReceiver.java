package androidx.work.impl.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import o2.j;
import o2.j.a;

public class ForceStopRunnable$BroadcastReceiver
  extends BroadcastReceiver
{
  public static final String a = j.f("ForceStopRunnable$Rcvr");
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramIntent != null) && ("ACTION_FORCE_STOP_RESCHEDULE".equals(paramIntent.getAction())))
    {
      j localj = j.d();
      paramIntent = a;
      if (c <= 2) {
        Log.v(paramIntent, "Rescheduling alarm that keeps track of force-stops.");
      }
      ForceStopRunnable.c(paramContext);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.ForceStopRunnable.BroadcastReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */