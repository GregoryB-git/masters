package K2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import x.AbstractC2112a;

/* loaded from: classes.dex */
public abstract class g extends AbstractC2112a {
    public static Intent l(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        Intent registerReceiver;
        if (!e.a()) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, true != e.a() ? 0 : 2);
        return registerReceiver;
    }
}
