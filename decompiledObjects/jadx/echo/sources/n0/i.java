package n0;

import F0.C0363h;

/* loaded from: classes.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    public final C0363h f17853a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17854b;

    public i(C0363h c0363h, long j7) {
        this.f17853a = c0363h;
        this.f17854b = j7;
    }

    @Override // n0.g
    public long a(long j7, long j8) {
        return this.f17853a.a(j7 + this.f17854b);
    }

    @Override // n0.g
    public long b(long j7, long j8) {
        return this.f17853a.f1899d[(int) j7];
    }

    @Override // n0.g
    public long c(long j7) {
        return this.f17853a.f1900e[(int) j7] - this.f17854b;
    }

    @Override // n0.g
    public long d(long j7, long j8) {
        return 0L;
    }

    @Override // n0.g
    public long e(long j7, long j8) {
        return -9223372036854775807L;
    }

    @Override // n0.g
    public o0.i f(long j7) {
        return new o0.i(null, this.f17853a.f1898c[(int) j7], r0.f1897b[r8]);
    }

    @Override // n0.g
    public boolean g() {
        return true;
    }

    @Override // n0.g
    public long h() {
        return 0L;
    }

    @Override // n0.g
    public long i(long j7) {
        return this.f17853a.f1896a;
    }

    @Override // n0.g
    public long j(long j7, long j8) {
        return this.f17853a.f1896a;
    }
}
