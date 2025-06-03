package z2;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;
import t0.AbstractC1977f;
import x2.C2188b;
import x2.C2196j;

/* loaded from: classes.dex */
public abstract class X extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f21687p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicReference f21688q;

    /* renamed from: r, reason: collision with root package name */
    public final Handler f21689r;

    /* renamed from: s, reason: collision with root package name */
    public final C2196j f21690s;

    public X(InterfaceC2304g interfaceC2304g, C2196j c2196j) {
        super(interfaceC2304g);
        this.f21688q = new AtomicReference(null);
        this.f21689r = new K2.i(Looper.getMainLooper());
        this.f21690s = c2196j;
    }

    public static final int p(U u7) {
        if (u7 == null) {
            return -1;
        }
        return u7.a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(int i7, int i8, Intent intent) {
        U u7 = (U) this.f21688q.get();
        if (i7 != 1) {
            if (i7 == 2) {
                int g7 = this.f21690s.g(b());
                if (g7 == 0) {
                    o();
                    return;
                } else {
                    if (u7 == null) {
                        return;
                    }
                    if (u7.b().a() == 18 && g7 == 18) {
                        return;
                    }
                }
            }
        } else if (i8 == -1) {
            o();
            return;
        } else if (i8 == 0) {
            if (u7 == null) {
                return;
            }
            l(new C2188b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, u7.b().toString()), p(u7));
            return;
        }
        if (u7 != null) {
            l(u7.b(), u7.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f21688q.set(bundle.getBoolean("resolving_error", false) ? new U(new C2188b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i(Bundle bundle) {
        super.i(bundle);
        U u7 = (U) this.f21688q.get();
        if (u7 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", u7.a());
        bundle.putInt("failed_status", u7.b().a());
        bundle.putParcelable("failed_resolution", u7.b().f());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        super.j();
        this.f21687p = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void k() {
        super.k();
        this.f21687p = false;
    }

    public final void l(C2188b c2188b, int i7) {
        this.f21688q.set(null);
        m(c2188b, i7);
    }

    public abstract void m(C2188b c2188b, int i7);

    public abstract void n();

    public final void o() {
        this.f21688q.set(null);
        n();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new C2188b(13, null), p((U) this.f21688q.get()));
    }

    public final void s(C2188b c2188b, int i7) {
        U u7 = new U(c2188b, i7);
        AtomicReference atomicReference = this.f21688q;
        while (!AbstractC1977f.a(atomicReference, null, u7)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        this.f21689r.post(new W(this, u7));
    }
}
