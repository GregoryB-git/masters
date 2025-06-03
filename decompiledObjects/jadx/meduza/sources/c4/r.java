package c4;

import c4.t;
import v5.e0;

/* loaded from: classes.dex */
public final class r implements t {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f2309a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f2310b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2311c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2312d;

    public r(long[] jArr, long[] jArr2, long j10) {
        x6.b.q(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.f2312d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f2309a = jArr;
            this.f2310b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f2309a = jArr3;
            long[] jArr4 = new long[i10];
            this.f2310b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f2311c = j10;
    }

    @Override // c4.t
    public final boolean e() {
        return this.f2312d;
    }

    @Override // c4.t
    public final t.a g(long j10) {
        if (!this.f2312d) {
            u uVar = u.f2318c;
            return new t.a(uVar, uVar);
        }
        int f = e0.f(this.f2310b, j10, true);
        long[] jArr = this.f2310b;
        long j11 = jArr[f];
        long[] jArr2 = this.f2309a;
        u uVar2 = new u(j11, jArr2[f]);
        if (j11 == j10 || f == jArr.length - 1) {
            return new t.a(uVar2, uVar2);
        }
        int i10 = f + 1;
        return new t.a(uVar2, new u(jArr[i10], jArr2[i10]));
    }

    @Override // c4.t
    public final long h() {
        return this.f2311c;
    }
}
