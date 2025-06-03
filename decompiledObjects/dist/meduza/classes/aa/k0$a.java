package aa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class k0$a
  extends BroadcastReceiver
{
  public k0 a;
  
  public k0$a(k0 paramk01, k0 paramk02)
  {
    a = paramk02;
  }
  
  public final void a()
  {
    int i;
    if ((!Log.isLoggable("FirebaseMessaging", 3)) && ((Build.VERSION.SDK_INT != 23) || (!Log.isLoggable("FirebaseMessaging", 3)))) {
      i = 0;
    } else {
      i = 1;
    }
    if (i != 0) {
      Log.d("FirebaseMessaging", "Connectivity change received registered");
    }
    b.a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    try
    {
      paramIntent = a;
      if (paramIntent == null) {
        return;
      }
      boolean bool = paramIntent.d();
      if (!bool) {
        return;
      }
      int i;
      if ((!Log.isLoggable("FirebaseMessaging", 3)) && ((Build.VERSION.SDK_INT != 23) || (!Log.isLoggable("FirebaseMessaging", 3)))) {
        i = 0;
      } else {
        i = 1;
      }
      if (i != 0) {
        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
      }
      paramIntent = a;
      d.f.schedule(paramIntent, 0L, TimeUnit.SECONDS);
      paramContext.unregisterReceiver(this);
      a = null;
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     aa.k0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */