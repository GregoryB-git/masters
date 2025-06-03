// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z2;

import android.os.BaseBundle;
import t0.f;
import android.content.DialogInterface;
import android.os.Parcelable;
import android.os.Bundle;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import x2.b;
import K2.i;
import android.os.Looper;
import x2.j;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicReference;
import android.content.DialogInterface$OnCancelListener;
import com.google.android.gms.common.api.internal.LifecycleCallback;

public abstract class X extends LifecycleCallback implements DialogInterface$OnCancelListener
{
    public volatile boolean p;
    public final AtomicReference q;
    public final Handler r;
    public final j s;
    
    public X(final g g, final j s) {
        super(g);
        this.q = new AtomicReference(null);
        this.r = new i(Looper.getMainLooper());
        this.s = s;
    }
    
    public static final int p(final U u) {
        if (u == null) {
            return -1;
        }
        return u.a();
    }
    
    @Override
    public final void e(int n, final int n2, final Intent intent) {
        final U u = this.q.get();
        if (n != 1) {
            if (n == 2) {
                n = this.s.g((Context)this.b());
                if (n == 0) {
                    this.o();
                    return;
                }
                if (u == null) {
                    return;
                }
                if (u.b().a() == 18 && n == 18) {
                    return;
                }
            }
        }
        else {
            if (n2 == -1) {
                this.o();
                return;
            }
            if (n2 == 0) {
                if (u == null) {
                    return;
                }
                n = 13;
                if (intent != null) {
                    n = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                this.l(new b(n, null, u.b().toString()), p(u));
                return;
            }
        }
        if (u != null) {
            this.l(u.b(), u.a());
        }
    }
    
    @Override
    public final void f(final Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            final AtomicReference q = this.q;
            U newValue;
            if (((BaseBundle)bundle).getBoolean("resolving_error", false)) {
                newValue = new U(new b(((BaseBundle)bundle).getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution")), ((BaseBundle)bundle).getInt("failed_client_id", -1));
            }
            else {
                newValue = null;
            }
            q.set(newValue);
        }
    }
    
    @Override
    public final void i(final Bundle bundle) {
        super.i(bundle);
        final U u = this.q.get();
        if (u == null) {
            return;
        }
        ((BaseBundle)bundle).putBoolean("resolving_error", true);
        ((BaseBundle)bundle).putInt("failed_client_id", u.a());
        ((BaseBundle)bundle).putInt("failed_status", u.b().a());
        bundle.putParcelable("failed_resolution", (Parcelable)u.b().f());
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
    
    public final void l(final b b, final int n) {
        this.q.set(null);
        this.m(b, n);
    }
    
    public abstract void m(final b p0, final int p1);
    
    public abstract void n();
    
    public final void o() {
        this.q.set(null);
        this.n();
    }
    
    public final void onCancel(final DialogInterface dialogInterface) {
        this.l(new b(13, null), p(this.q.get()));
    }
    
    public final void s(final b b, final int n) {
        final U u = new U(b, n);
        final AtomicReference q = this.q;
        while (!f.a(q, null, u)) {
            if (q.get() != null) {
                return;
            }
        }
        this.r.post((Runnable)new W(this, u));
    }
}
