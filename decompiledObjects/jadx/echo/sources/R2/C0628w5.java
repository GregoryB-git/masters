package R2;

import A2.AbstractC0328n;

/* renamed from: R2.w5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0628w5 {

    /* renamed from: a, reason: collision with root package name */
    public final E2.e f5580a;

    /* renamed from: b, reason: collision with root package name */
    public long f5581b;

    public C0628w5(E2.e eVar) {
        AbstractC0328n.i(eVar);
        this.f5580a = eVar;
    }

    public final void a() {
        this.f5581b = 0L;
    }

    public final boolean b(long j7) {
        return this.f5581b == 0 || this.f5580a.b() - this.f5581b >= 3600000;
    }

    public final void c() {
        this.f5581b = this.f5580a.b();
    }
}
