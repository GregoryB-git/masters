package Y0;

import F0.M;
import F0.N;
import g0.M;
import g0.p;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final long f7301a;

    /* renamed from: b, reason: collision with root package name */
    public final p f7302b;

    /* renamed from: c, reason: collision with root package name */
    public final p f7303c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7304d;

    /* renamed from: e, reason: collision with root package name */
    public long f7305e;

    public b(long j7, long j8, long j9) {
        this.f7305e = j7;
        this.f7301a = j9;
        p pVar = new p();
        this.f7302b = pVar;
        p pVar2 = new p();
        this.f7303c = pVar2;
        pVar.a(0L);
        pVar2.a(j8);
        int i7 = -2147483647;
        if (j7 != -9223372036854775807L) {
            long Y02 = M.Y0(j8 - j9, 8L, j7, RoundingMode.HALF_UP);
            if (Y02 > 0 && Y02 <= 2147483647L) {
                i7 = (int) Y02;
            }
        }
        this.f7304d = i7;
    }

    public boolean a(long j7) {
        p pVar = this.f7302b;
        return j7 - pVar.b(pVar.c() - 1) < 100000;
    }

    public void b(long j7, long j8) {
        if (a(j7)) {
            return;
        }
        this.f7302b.a(j7);
        this.f7303c.a(j8);
    }

    @Override // Y0.g
    public long c(long j7) {
        return this.f7302b.b(M.e(this.f7303c, j7, true, true));
    }

    public void d(long j7) {
        this.f7305e = j7;
    }

    @Override // Y0.g
    public long f() {
        return this.f7301a;
    }

    @Override // F0.M
    public boolean h() {
        return true;
    }

    @Override // F0.M
    public M.a j(long j7) {
        int e7 = g0.M.e(this.f7302b, j7, true, true);
        N n7 = new N(this.f7302b.b(e7), this.f7303c.b(e7));
        if (n7.f1794a == j7 || e7 == this.f7302b.c() - 1) {
            return new M.a(n7);
        }
        int i7 = e7 + 1;
        return new M.a(n7, new N(this.f7302b.b(i7), this.f7303c.b(i7)));
    }

    @Override // Y0.g
    public int k() {
        return this.f7304d;
    }

    @Override // F0.M
    public long l() {
        return this.f7305e;
    }
}
