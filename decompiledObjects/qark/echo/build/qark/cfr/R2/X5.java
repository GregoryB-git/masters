/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package R2;

import R2.G2;
import R2.K;
import R2.N2;
import R2.P1;
import R2.Y1;
import R2.Z5;
import R2.a2;
import R2.g;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.g7;

public final class X5
extends BroadcastReceiver {
    public final N2 a;

    public X5(N2 n22) {
        this.a = n22;
    }

    public final void onReceive(Context object, Intent intent) {
        if (intent == null) {
            this.a.j().L().a("App receiver called with null intent");
            return;
        }
        object = intent.getAction();
        if (object == null) {
            this.a.j().L().a("App receiver called with null action");
            return;
        }
        if (!object.equals((Object)"com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            this.a.j().L().a("App receiver called with unknown action");
            return;
        }
        object = this.a;
        if (g7.a()) {
            if (!object.z().D(null, K.M0)) {
                return;
            }
            object.j().K().a("App receiver notified triggers are available");
            object.e().D(new Z5((N2)object));
        }
    }
}

