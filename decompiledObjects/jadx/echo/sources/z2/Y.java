package z2;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes.dex */
public final class Y implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ LifecycleCallback f21691o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f21692p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Z f21693q;

    public Y(Z z7, LifecycleCallback lifecycleCallback, String str) {
        this.f21693q = z7;
        this.f21691o = lifecycleCallback;
        this.f21692p = str;
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
        Z z7 = this.f21693q;
        i7 = z7.f21696p;
        if (i7 > 0) {
            LifecycleCallback lifecycleCallback = this.f21691o;
            bundle = z7.f21697q;
            if (bundle != null) {
                bundle3 = z7.f21697q;
                bundle2 = bundle3.getBundle(this.f21692p);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.f(bundle2);
        }
        i8 = this.f21693q.f21696p;
        if (i8 >= 2) {
            this.f21691o.j();
        }
        i9 = this.f21693q.f21696p;
        if (i9 >= 3) {
            this.f21691o.h();
        }
        i10 = this.f21693q.f21696p;
        if (i10 >= 4) {
            this.f21691o.k();
        }
        i11 = this.f21693q.f21696p;
        if (i11 >= 5) {
            this.f21691o.g();
        }
    }
}
