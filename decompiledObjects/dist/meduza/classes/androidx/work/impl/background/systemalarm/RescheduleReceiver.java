package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import o2.j;
import p2.k0;

public class RescheduleReceiver
  extends BroadcastReceiver
{
  public static final String a = j.f("RescheduleReceiver");
  
  public final void onReceive(Context arg1, Intent paramIntent)
  {
    j localj = j.d();
    Object localObject1 = a;
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Received intent ");
    ((StringBuilder)localObject2).append(paramIntent);
    localj.a((String)localObject1, ((StringBuilder)localObject2).toString());
    try
    {
      localObject1 = k0.d(???);
      paramIntent = goAsync();
      localObject1.getClass();
      synchronized (k0.m)
      {
        localObject2 = i;
        if (localObject2 != null) {
          ((BroadcastReceiver.PendingResult)localObject2).finish();
        }
        i = paramIntent;
        if (h)
        {
          paramIntent.finish();
          i = null;
        }
      }
      return;
    }
    catch (IllegalStateException ???)
    {
      j.d().c(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", ???);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.systemalarm.RescheduleReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */