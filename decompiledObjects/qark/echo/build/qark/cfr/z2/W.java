/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.Intent
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package z2;

import A2.n;
import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import x2.b;
import x2.j;
import z2.D;
import z2.E;
import z2.U;
import z2.V;
import z2.X;
import z2.g;

public final class W
implements Runnable {
    public final U o;
    public final /* synthetic */ X p;

    public W(X x8, U u8) {
        this.p = x8;
        this.o = u8;
    }

    public final void run() {
        if (!this.p.p) {
            return;
        }
        Object object = this.o.b();
        if (object.g()) {
            X x8 = this.p;
            x8.o.startActivityForResult(GoogleApiActivity.a((Context)x8.b(), (PendingIntent)n.i((Object)object.f()), this.o.a(), false), 1);
            return;
        }
        X x9 = this.p;
        if (x9.s.b((Context)x9.b(), object.a(), null) != null) {
            x9 = this.p;
            x9.s.v(x9.b(), this.p.o, object.a(), 2, this.p);
            return;
        }
        if (object.a() == 18) {
            object = this.p;
            object = object.s.q(object.b(), this.p);
            x9 = this.p;
            x9.s.r(x9.b().getApplicationContext(), new V(this, (Dialog)object));
            return;
        }
        X.q(this.p, (b)object, this.o.a());
    }
}

