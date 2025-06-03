package io.flutter.plugins.firebase.messaging;

import aa.z;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Parcel;
import android.util.Log;
import java.util.HashMap;

public class FlutterFirebaseMessagingReceiver
  extends BroadcastReceiver
{
  private static final String TAG = "FLTFireMsgReceiver";
  public static HashMap<String, z> notifications = new HashMap();
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Log.d("FLTFireMsgReceiver", "broadcast received for message");
    if (ContextHolder.getApplicationContext() == null)
    {
      if (paramContext.getApplicationContext() != null) {
        localObject = paramContext.getApplicationContext();
      } else {
        localObject = paramContext;
      }
      ContextHolder.setApplicationContext((Context)localObject);
    }
    if (paramIntent.getExtras() == null)
    {
      Log.d("FLTFireMsgReceiver", "broadcast received but intent contained no extras to process RemoteMessage. Operation cancelled.");
      return;
    }
    z localz = new z(paramIntent.getExtras());
    if (localz.F() != null)
    {
      notifications.put(localz.E(), localz);
      FlutterFirebaseMessagingStore.getInstance().storeFirebaseMessage(localz);
    }
    if (FlutterFirebaseMessagingUtils.isApplicationForeground(paramContext))
    {
      FlutterFirebaseRemoteMessageLiveData.getInstance().postRemoteMessage(localz);
      return;
    }
    Intent localIntent = new Intent(paramContext, FlutterFirebaseMessagingBackgroundService.class);
    paramIntent = Parcel.obtain();
    boolean bool = false;
    localz.writeToParcel(paramIntent, 0);
    localIntent.putExtra("notification", paramIntent.marshall());
    Object localObject = a.getString("google.original_priority");
    paramIntent = (Intent)localObject;
    if (localObject == null) {
      paramIntent = a.getString("google.priority");
    }
    int i;
    if ("high".equals(paramIntent)) {
      i = 1;
    } else if ("normal".equals(paramIntent)) {
      i = 2;
    } else {
      i = 0;
    }
    if (i == 1) {
      bool = true;
    }
    FlutterFirebaseMessagingBackgroundService.enqueueMessageProcessing(paramContext, localIntent, bool);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */