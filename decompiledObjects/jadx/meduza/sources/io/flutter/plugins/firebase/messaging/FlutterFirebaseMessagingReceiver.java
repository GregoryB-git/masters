package io.flutter.plugins.firebase.messaging;

import aa.z;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.util.Log;
import java.util.HashMap;

/* loaded from: classes.dex */
public class FlutterFirebaseMessagingReceiver extends BroadcastReceiver {
    private static final String TAG = "FLTFireMsgReceiver";
    public static HashMap<String, z> notifications = new HashMap<>();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "broadcast received for message");
        if (ContextHolder.getApplicationContext() == null) {
            ContextHolder.setApplicationContext(context.getApplicationContext() != null ? context.getApplicationContext() : context);
        }
        if (intent.getExtras() == null) {
            Log.d(TAG, "broadcast received but intent contained no extras to process RemoteMessage. Operation cancelled.");
            return;
        }
        z zVar = new z(intent.getExtras());
        if (zVar.F() != null) {
            notifications.put(zVar.E(), zVar);
            FlutterFirebaseMessagingStore.getInstance().storeFirebaseMessage(zVar);
        }
        if (FlutterFirebaseMessagingUtils.isApplicationForeground(context)) {
            FlutterFirebaseRemoteMessageLiveData.getInstance().postRemoteMessage(zVar);
            return;
        }
        Intent intent2 = new Intent(context, (Class<?>) FlutterFirebaseMessagingBackgroundService.class);
        Parcel obtain = Parcel.obtain();
        zVar.writeToParcel(obtain, 0);
        intent2.putExtra(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE, obtain.marshall());
        String string = zVar.f364a.getString("google.original_priority");
        if (string == null) {
            string = zVar.f364a.getString("google.priority");
        }
        FlutterFirebaseMessagingBackgroundService.enqueueMessageProcessing(context, intent2, ("high".equals(string) ? (char) 1 : "normal".equals(string) ? (char) 2 : (char) 0) == 1);
    }
}
