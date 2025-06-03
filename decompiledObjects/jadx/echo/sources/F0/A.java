package F0;

import F0.B;
import F0.M;
import g0.AbstractC1297a;

/* loaded from: classes.dex */
public final class A implements M {

    /* renamed from: a, reason: collision with root package name */
    public final B f1736a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1737b;

    public A(B b7, long j7) {
        this.f1736a = b7;
        this.f1737b = j7;
    }

    public final N a(long j7, long j8) {
        return new N((j7 * 1000000) / this.f1736a.f1742e, this.f1737b + j8);
    }

    @Override // F0.M
    public boolean h() {
        return true;
    }

    @Override // F0.M
    public M.a j(long j7) {
        AbstractC1297a.h(this.f1736a.f1748k);
        B b7 = this.f1736a;
        B.a aVar = b7.f1748k;
        long[] jArr = aVar.f1750a;
        long[] jArr2 = aVar.f1751b;
        int h7 = g0.M.h(jArr, b7.i(j7), true, false);
        N a7 = a(h7 == -1 ? 0L : jArr[h7], h7 != -1 ? jArr2[h7] : 0L);
        if (a7.f1794a == j7 || h7 == jArr.length - 1) {
            return new M.a(a7);
        }
        int i7 = h7 + 1;
        return new M.a(a7, a(jArr[i7], jArr2[i7]));
    }

    @Override // F0.M
    public long l() {
        return this.f1736a.f();
    }
}
