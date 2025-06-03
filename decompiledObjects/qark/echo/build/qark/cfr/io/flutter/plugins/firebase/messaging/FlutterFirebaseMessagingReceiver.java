/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 */
package io.flutter.plugins.firebase.messaging;

import O5.B;
import O5.a;
import O5.y;
import O5.z;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.messaging.T;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import java.util.HashMap;

public class FlutterFirebaseMessagingReceiver
extends BroadcastReceiver {
    public static HashMap a = new HashMap();

    public void onReceive(Context context, Intent object) {
        Log.d((String)"FLTFireMsgReceiver", (String)"broadcast received for message");
        if (a.a() == null) {
            a.b(context.getApplicationContext());
        }
        if (object.getExtras() == null) {
            Log.d((String)"FLTFireMsgReceiver", (String)"broadcast received but intent contained no extras to process RemoteMessage. Operation cancelled.");
            return;
        }
        if ((object = new T(object.getExtras())).q() != null) {
            a.put((Object)object.g(), object);
            y.b().i((T)object);
        }
        if (z.d(context)) {
            B.k().l((T)object);
            return;
        }
        Intent intent = new Intent(context, FlutterFirebaseMessagingBackgroundService.class);
        intent.putExtra("notification", (Parcelable)object);
        FlutterFirebaseMessagingBackgroundService.k(context, intent);
    }
}

