package z2;

import A2.AbstractC0317c;
import A2.InterfaceC0323i;
import android.util.Log;
import java.util.Map;
import java.util.Set;
import x2.C2188b;
import y2.C2270a;

/* renamed from: z2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2293B implements AbstractC0317c.InterfaceC0004c, L {

    /* renamed from: a, reason: collision with root package name */
    public final C2270a.f f21643a;

    /* renamed from: b, reason: collision with root package name */
    public final C2299b f21644b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0323i f21645c = null;

    /* renamed from: d, reason: collision with root package name */
    public Set f21646d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21647e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2302e f21648f;

    public C2293B(C2302e c2302e, C2270a.f fVar, C2299b c2299b) {
        this.f21648f = c2302e;
        this.f21643a = fVar;
        this.f21644b = c2299b;
    }

    @Override // z2.L
    public final void a(C2188b c2188b) {
        Map map;
        map = this.f21648f.f21734z;
        C2320x c2320x = (C2320x) map.get(this.f21644b);
        if (c2320x != null) {
            c2320x.H(c2188b);
        }
    }

    @Override // A2.AbstractC0317c.InterfaceC0004c
    public final void b(C2188b c2188b) {
        this.f21648f.f21721D.post(new RunnableC2292A(this, c2188b));
    }

    @Override // z2.L
    public final void c(InterfaceC0323i interfaceC0323i, Set set) {
        if (interfaceC0323i == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            a(new C2188b(4));
        } else {
            this.f21645c = interfaceC0323i;
            this.f21646d = set;
            h();
        }
    }

    public final void h() {
        InterfaceC0323i interfaceC0323i;
        if (!this.f21647e || (interfaceC0323i = this.f21645c) == null) {
            return;
        }
        this.f21643a.o(interfaceC0323i, this.f21646d);
    }
}
