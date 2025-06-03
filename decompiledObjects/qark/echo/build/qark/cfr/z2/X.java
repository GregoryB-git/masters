/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.atomic.AtomicReference
 */
package z2;

import K2.i;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;
import t0.f;
import x2.b;
import x2.j;
import z2.U;
import z2.W;
import z2.g;

public abstract class X
extends LifecycleCallback
implements DialogInterface.OnCancelListener {
    public volatile boolean p;
    public final AtomicReference q = new AtomicReference((Object)null);
    public final Handler r = new i(Looper.getMainLooper());
    public final j s;

    public X(g g8, j j8) {
        super(g8);
        this.s = j8;
    }

    public static final int p(U u8) {
        if (u8 == null) {
            return -1;
        }
        return u8.a();
    }

    @Override
    public final void e(int n8, int n9, Intent intent) {
        U u8 = (U)this.q.get();
        if (n8 != 1) {
            if (n8 == 2) {
                n8 = this.s.g((Context)this.b());
                if (n8 == 0) {
                    this.o();
                    return;
                }
                if (u8 == null) {
                    return;
                }
                if (u8.b().a() == 18 && n8 == 18) {
                    return;
                }
            }
        } else {
            if (n9 == -1) {
                this.o();
                return;
            }
            if (n9 == 0) {
                if (u8 == null) {
                    return;
                }
                n8 = 13;
                if (intent != null) {
                    n8 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                this.l(new b(n8, null, u8.b().toString()), X.p(u8));
                return;
            }
        }
        if (u8 != null) {
            this.l(u8.b(), u8.a());
        }
    }

    @Override
    public final void f(Bundle object) {
        super.f((Bundle)object);
        if (object != null) {
            AtomicReference atomicReference = this.q;
            object = object.getBoolean("resolving_error", false) ? new U(new b(object.getInt("failed_status"), (PendingIntent)object.getParcelable("failed_resolution")), object.getInt("failed_client_id", -1)) : null;
            atomicReference.set(object);
        }
    }

    @Override
    public final void i(Bundle bundle) {
        super.i(bundle);
        U u8 = (U)this.q.get();
        if (u8 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", u8.a());
        bundle.putInt("failed_status", u8.b().a());
        bundle.putParcelable("failed_resolution", (Parcelable)u8.b().f());
    }

    @Override
    public void j() {
        super.j();
        this.p = true;
    }

    @Override
    public void k() {
        super.k();
        this.p = false;
    }

    public final void l(b b8, int n8) {
        this.q.set((Object)null);
        this.m(b8, n8);
    }

    public abstract void m(b var1, int var2);

    public abstract void n();

    public final void o() {
        this.q.set((Object)null);
        this.n();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.l(new b(13, null), X.p((U)this.q.get()));
    }

    public final void s(b object, int n8) {
        object = new U((b)object, n8);
        AtomicReference atomicReference = this.q;
        do {
            if (!f.a(atomicReference, null, object)) continue;
            this.r.post((Runnable)new W(this, (U)object));
            return;
        } while (atomicReference.get() == null);
    }
}

