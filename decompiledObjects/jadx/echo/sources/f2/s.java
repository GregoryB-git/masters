package f2;

import c2.AbstractC0820c;
import c2.C0819b;
import c2.InterfaceC0822e;

/* loaded from: classes.dex */
public final class s implements c2.f {

    /* renamed from: a, reason: collision with root package name */
    public final p f14222a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14223b;

    /* renamed from: c, reason: collision with root package name */
    public final C0819b f14224c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0822e f14225d;

    /* renamed from: e, reason: collision with root package name */
    public final t f14226e;

    public s(p pVar, String str, C0819b c0819b, InterfaceC0822e interfaceC0822e, t tVar) {
        this.f14222a = pVar;
        this.f14223b = str;
        this.f14224c = c0819b;
        this.f14225d = interfaceC0822e;
        this.f14226e = tVar;
    }

    @Override // c2.f
    public void a(AbstractC0820c abstractC0820c, c2.h hVar) {
        this.f14226e.a(o.a().e(this.f14222a).c(abstractC0820c).f(this.f14223b).d(this.f14225d).b(this.f14224c).a(), hVar);
    }

    @Override // c2.f
    public void b(AbstractC0820c abstractC0820c) {
        a(abstractC0820c, new c2.h() { // from class: f2.r
            @Override // c2.h
            public final void a(Exception exc) {
                s.e(exc);
            }
        });
    }

    public p d() {
        return this.f14222a;
    }

    public static /* synthetic */ void e(Exception exc) {
    }
}
