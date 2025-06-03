package z2;

import z2.ComponentCallbacks2C2300c;

/* renamed from: z2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2315s implements ComponentCallbacks2C2300c.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2302e f21751a;

    public C2315s(C2302e c2302e) {
        this.f21751a = c2302e;
    }

    @Override // z2.ComponentCallbacks2C2300c.a
    public final void a(boolean z7) {
        C2302e c2302e = this.f21751a;
        c2302e.f21721D.sendMessage(c2302e.f21721D.obtainMessage(1, Boolean.valueOf(z7)));
    }
}
