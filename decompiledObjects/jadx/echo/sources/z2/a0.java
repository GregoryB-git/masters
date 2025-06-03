package z2;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes.dex */
public final class a0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ LifecycleCallback f21698o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f21699p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b0 f21700q;

    public a0(b0 b0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f21700q = b0Var;
        this.f21698o = lifecycleCallback;
        this.f21699p = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        b0 b0Var = this.f21700q;
        i7 = b0Var.f21707p0;
        if (i7 > 0) {
            LifecycleCallback lifecycleCallback = this.f21698o;
            bundle = b0Var.f21708q0;
            if (bundle != null) {
                bundle3 = b0Var.f21708q0;
                bundle2 = bundle3.getBundle(this.f21699p);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.f(bundle2);
        }
        i8 = this.f21700q.f21707p0;
        if (i8 >= 2) {
            this.f21698o.j();
        }
        i9 = this.f21700q.f21707p0;
        if (i9 >= 3) {
            this.f21698o.h();
        }
        i10 = this.f21700q.f21707p0;
        if (i10 >= 4) {
            this.f21698o.k();
        }
        i11 = this.f21700q.f21707p0;
        if (i11 >= 5) {
            this.f21698o.g();
        }
    }
}
