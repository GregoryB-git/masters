package m1;

import F0.M;
import F0.N;

/* renamed from: m1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1664e implements M {

    /* renamed from: a, reason: collision with root package name */
    public final C1662c f17664a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17665b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17666c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17667d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17668e;

    public C1664e(C1662c c1662c, int i7, long j7, long j8) {
        this.f17664a = c1662c;
        this.f17665b = i7;
        this.f17666c = j7;
        long j9 = (j8 - j7) / c1662c.f17659e;
        this.f17667d = j9;
        this.f17668e = a(j9);
    }

    public final long a(long j7) {
        return g0.M.W0(j7 * this.f17665b, 1000000L, this.f17664a.f17657c);
    }

    @Override // F0.M
    public boolean h() {
        return true;
    }

    @Override // F0.M
    public M.a j(long j7) {
        long q7 = g0.M.q((this.f17664a.f17657c * j7) / (this.f17665b * 1000000), 0L, this.f17667d - 1);
        long j8 = this.f17666c + (this.f17664a.f17659e * q7);
        long a7 = a(q7);
        N n7 = new N(a7, j8);
        if (a7 >= j7 || q7 == this.f17667d - 1) {
            return new M.a(n7);
        }
        long j9 = q7 + 1;
        return new M.a(n7, new N(a(j9), this.f17666c + (this.f17664a.f17659e * j9)));
    }

    @Override // F0.M
    public long l() {
        return this.f17668e;
    }
}
