package aa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;

public final class f0$a
  extends BroadcastReceiver
{
  public f0 a;
  
  public f0$a(f0 paramf0)
  {
    a = paramf0;
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
    IntentFilter localIntentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    a.c.c.registerReceiver(this, localIntentFilter);
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = a;
    if (paramContext == null) {
      return;
    }
    if (!paramContext.a()) {
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
    paramContext = a;
    c.getClass();
    FirebaseMessaging.c(paramContext, 0L);
    a.c.c.unregisterReceiver(this);
    a = null;
  }
}

/* Location:
 * Qualified Name:     aa.f0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */