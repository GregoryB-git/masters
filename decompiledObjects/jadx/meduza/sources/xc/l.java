package xc;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l extends z {

    /* renamed from: e, reason: collision with root package name */
    public z f17265e;

    public l(z zVar) {
        ec.i.e(zVar, "delegate");
        this.f17265e = zVar;
    }

    @Override // xc.z
    public final z a() {
        return this.f17265e.a();
    }

    @Override // xc.z
    public final z b() {
        return this.f17265e.b();
    }

    @Override // xc.z
    public final long c() {
        return this.f17265e.c();
    }

    @Override // xc.z
    public final z d(long j10) {
        return this.f17265e.d(j10);
    }

    @Override // xc.z
    public final boolean e() {
        return this.f17265e.e();
    }

    @Override // xc.z
    public final void f() {
        this.f17265e.f();
    }

    @Override // xc.z
    public final z g(long j10, TimeUnit timeUnit) {
        ec.i.e(timeUnit, "unit");
        return this.f17265e.g(j10, timeUnit);
    }
}
