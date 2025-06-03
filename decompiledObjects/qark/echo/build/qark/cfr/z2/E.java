/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package z2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import z2.D;

public final class E
extends BroadcastReceiver {
    public Context a;
    public final D b;

    public E(D d8) {
        this.b = d8;
    }

    public final void a(Context context) {
        this.a = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        synchronized (this) {
            try {
                Context context = this.a;
                if (context != null) {
                    context.unregisterReceiver((BroadcastReceiver)this);
                }
                this.a = null;
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void onReceive(Context object, Intent intent) {
        object = intent.getData();
        object = object != null ? object.getSchemeSpecificPart() : null;
        if ("com.google.android.gms".equals(object)) {
            this.b.a();
            this.b();
        }
    }
}

