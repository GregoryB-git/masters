package io.flutter.plugins.firebase.messaging;

import O5.B;
import O5.a;
import O5.y;
import O5.z;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.messaging.T;
import java.util.HashMap;

public class FlutterFirebaseMessagingReceiver
  extends BroadcastReceiver
{
  public static HashMap a = new HashMap();
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Log.d("FLTFireMsgReceiver", "broadcast received for message");
    if (a.a() == null) {
      a.b(paramContext.getApplicationContext());
    }
    if (paramIntent.getExtras() == null)
    {
      Log.d("FLTFireMsgReceiver", "broadcast received but intent contained no extras to process RemoteMessage. Operation cancelled.");
      return;
    }
    T localT = new T(paramIntent.getExtras());
    if (localT.q() != null)
    {
      a.put(localT.g(), localT);
      y.b().i(localT);
    }
    if (z.d(paramContext))
    {
      B.k().l(localT);
      return;
    }
    paramIntent = new Intent(paramContext, FlutterFirebaseMessagingBackgroundService.class);
    paramIntent.putExtra("notification", localT);
    FlutterFirebaseMessagingBackgroundService.k(paramContext, paramIntent);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */