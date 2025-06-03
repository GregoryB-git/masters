// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.plugins.firebase.messaging;

import android.os.Parcelable;
import O5.B;
import O5.z;
import O5.y;
import com.google.firebase.messaging.T;
import O5.a;
import android.util.Log;
import android.content.Intent;
import android.content.Context;
import java.util.HashMap;
import android.content.BroadcastReceiver;

public class FlutterFirebaseMessagingReceiver extends BroadcastReceiver
{
    public static HashMap a;
    
    static {
        FlutterFirebaseMessagingReceiver.a = new HashMap();
    }
    
    public void onReceive(final Context context, final Intent intent) {
        Log.d("FLTFireMsgReceiver", "broadcast received for message");
        if (O5.a.a() == null) {
            O5.a.b(context.getApplicationContext());
        }
        if (intent.getExtras() == null) {
            Log.d("FLTFireMsgReceiver", "broadcast received but intent contained no extras to process RemoteMessage. Operation cancelled.");
            return;
        }
        final T value = new T(intent.getExtras());
        if (value.q() != null) {
            FlutterFirebaseMessagingReceiver.a.put(value.g(), value);
            y.b().i(value);
        }
        if (z.d(context)) {
            B.k().l(value);
            return;
        }
        final Intent intent2 = new Intent(context, (Class)FlutterFirebaseMessagingBackgroundService.class);
        intent2.putExtra("notification", (Parcelable)value);
        FlutterFirebaseMessagingBackgroundService.k(context, intent2);
    }
}
