/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 */
package K2;

import K2.e;
import K2.f;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import x.a;

public abstract class g
extends a {
    public static Intent l(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (e.a()) {
            int n8 = true != e.a() ? 0 : 2;
            return f.a(context, broadcastReceiver, intentFilter, n8);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}

