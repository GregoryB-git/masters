/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package R2;

import A2.n;
import R2.D5;
import R2.G2;
import R2.Y1;
import R2.a2;
import R2.f2;
import R2.m2;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public class j2
extends BroadcastReceiver {
    public final D5 a;
    public boolean b;
    public boolean c;

    public j2(D5 d52) {
        n.i(d52);
        this.a = d52;
    }

    public final void b() {
        this.a.p0();
        this.a.e().n();
        if (this.b) {
            return;
        }
        this.a.a().registerReceiver((BroadcastReceiver)this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.c = this.a.g0().A();
        this.a.j().K().b("Registering connectivity change receiver. Network connected", this.c);
        this.b = true;
    }

    public final void c() {
        this.a.p0();
        this.a.e().n();
        this.a.e().n();
        if (!this.b) {
            return;
        }
        this.a.j().K().a("Unregistering connectivity change receiver");
        this.b = false;
        this.c = false;
        Context context = this.a.a();
        try {
            context.unregisterReceiver((BroadcastReceiver)this);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.a.j().G().b("Failed to unregister the network broadcast receiver", (Object)illegalArgumentException);
            return;
        }
    }

    public void onReceive(Context object, Intent intent) {
        this.a.p0();
        object = intent.getAction();
        this.a.j().K().b("NetworkBroadcastReceiver received action", object);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(object)) {
            boolean bl = this.a.g0().A();
            if (this.c != bl) {
                this.c = bl;
                this.a.e().D(new m2(this, bl));
            }
            return;
        }
        this.a.j().L().b("NetworkBroadcastReceiver received unknown action", object);
    }
}

