package c4;

import c4.o;
import c4.t;
import v5.e0;

/* loaded from: classes.dex */
public final class n implements t {

    /* renamed from: a, reason: collision with root package name */
    public final o f2290a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2291b;

    public n(o oVar, long j10) {
        this.f2290a = oVar;
        this.f2291b = j10;
    }

    @Override // c4.t
    public final boolean e() {
        return true;
    }

    @Override // c4.t
    public final t.a g(long j10) {
        x6.b.K(this.f2290a.f2301k);
        o oVar = this.f2290a;
        o.a aVar = oVar.f2301k;
        long[] jArr = aVar.f2303a;
        long[] jArr2 = aVar.f2304b;
        int f = e0.f(jArr, e0.j((oVar.f2296e * j10) / 1000000, 0L, oVar.f2300j - 1), false);
        long j11 = f == -1 ? 0L : jArr[f];
        long j12 = f != -1 ? jArr2[f] : 0L;
        int i10 = this.f2290a.f2296e;
        long j13 = (j11 * 1000000) / i10;
        long j14 = this.f2291b;
        u uVar = new u(j13, j12 + j14);
        if (j13 == j10 || f == jArr.length - 1) {
            return new t.a(uVar, uVar);
        }
        int i11 = f + 1;
        return new t.a(uVar, new u((jArr[i11] * 1000000) / i10, j14 + jArr2[i11]));
    }

    @Override // c4.t
    public final long h() {
        return this.f2290a.b();
    }
}
