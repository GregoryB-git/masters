package F0;

import F0.M;
import g0.AbstractC1297a;

/* loaded from: classes.dex */
public final class H implements M {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f1770a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f1771b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1772c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1773d;

    public H(long[] jArr, long[] jArr2, long j7) {
        AbstractC1297a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z7 = length > 0;
        this.f1773d = z7;
        if (!z7 || jArr2[0] <= 0) {
            this.f1770a = jArr;
            this.f1771b = jArr2;
        } else {
            int i7 = length + 1;
            long[] jArr3 = new long[i7];
            this.f1770a = jArr3;
            long[] jArr4 = new long[i7];
            this.f1771b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f1772c = j7;
    }

    @Override // F0.M
    public boolean h() {
        return this.f1773d;
    }

    @Override // F0.M
    public M.a j(long j7) {
        if (!this.f1773d) {
            return new M.a(N.f1793c);
        }
        int h7 = g0.M.h(this.f1771b, j7, true, true);
        N n7 = new N(this.f1771b[h7], this.f1770a[h7]);
        if (n7.f1794a == j7 || h7 == this.f1771b.length - 1) {
            return new M.a(n7);
        }
        int i7 = h7 + 1;
        return new M.a(n7, new N(this.f1771b[i7], this.f1770a[i7]));
    }

    @Override // F0.M
    public long l() {
        return this.f1772c;
    }
}
