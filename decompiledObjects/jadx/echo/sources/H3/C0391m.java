package H3;

import S4.b;

/* renamed from: H3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0391m implements S4.b {

    /* renamed from: a, reason: collision with root package name */
    public final C0402y f2283a;

    /* renamed from: b, reason: collision with root package name */
    public final C0390l f2284b;

    public C0391m(C0402y c0402y, M3.g gVar) {
        this.f2283a = c0402y;
        this.f2284b = new C0390l(gVar);
    }

    @Override // S4.b
    public b.a a() {
        return b.a.CRASHLYTICS;
    }

    @Override // S4.b
    public void b(b.C0095b c0095b) {
        E3.f.f().b("App Quality Sessions session changed: " + c0095b);
        this.f2284b.h(c0095b.a());
    }

    @Override // S4.b
    public boolean c() {
        return this.f2283a.d();
    }

    public String d(String str) {
        return this.f2284b.c(str);
    }

    public void e(String str) {
        this.f2284b.i(str);
    }
}
