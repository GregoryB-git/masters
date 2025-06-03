package io.flutter.plugins.firebase.messaging;

import O5.AbstractC0460a;
import O5.B;
import O5.y;
import O5.z;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.messaging.T;
import java.util.HashMap;

/* loaded from: classes.dex */
public class FlutterFirebaseMessagingReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static HashMap f15117a = new HashMap();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.d("FLTFireMsgReceiver", "broadcast received for message");
        if (AbstractC0460a.a() == null) {
            AbstractC0460a.b(context.getApplicationContext());
        }
        if (intent.getExtras() == null) {
            Log.d("FLTFireMsgReceiver", "broadcast received but intent contained no extras to process RemoteMessage. Operation cancelled.");
            return;
        }
        T t7 = new T(intent.getExtras());
        if (t7.q() != null) {
            f15117a.put(t7.g(), t7);
            y.b().i(t7);
        }
        if (z.d(context)) {
            B.k().l(t7);
            return;
        }
        Intent intent2 = new Intent(context, (Class<?>) FlutterFirebaseMessagingBackgroundService.class);
        intent2.putExtra("notification", t7);
        FlutterFirebaseMessagingBackgroundService.k(context, intent2);
    }
}
