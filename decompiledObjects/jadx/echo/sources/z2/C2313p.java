package z2;

import A2.AbstractC0328n;
import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import t.C1959b;
import x2.C2188b;
import x2.C2196j;

/* renamed from: z2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2313p extends X {

    /* renamed from: t, reason: collision with root package name */
    public final C1959b f21747t;

    /* renamed from: u, reason: collision with root package name */
    public final C2302e f21748u;

    public C2313p(InterfaceC2304g interfaceC2304g, C2302e c2302e, C2196j c2196j) {
        super(interfaceC2304g, c2196j);
        this.f21747t = new C1959b();
        this.f21748u = c2302e;
        this.f10264o.a("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, C2302e c2302e, C2299b c2299b) {
        InterfaceC2304g c7 = LifecycleCallback.c(activity);
        C2313p c2313p = (C2313p) c7.b("ConnectionlessLifecycleHelper", C2313p.class);
        if (c2313p == null) {
            c2313p = new C2313p(c7, c2302e, C2196j.m());
        }
        AbstractC0328n.j(c2299b, "ApiKey cannot be null");
        c2313p.f21747t.add(c2299b);
        c2302e.c(c2313p);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        super.h();
        v();
    }

    @Override // z2.X, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        v();
    }

    @Override // z2.X, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        this.f21748u.d(this);
    }

    @Override // z2.X
    public final void m(C2188b c2188b, int i7) {
        this.f21748u.F(c2188b, i7);
    }

    @Override // z2.X
    public final void n() {
        this.f21748u.a();
    }

    public final C1959b t() {
        return this.f21747t;
    }

    public final void v() {
        if (this.f21747t.isEmpty()) {
            return;
        }
        this.f21748u.c(this);
    }
}
