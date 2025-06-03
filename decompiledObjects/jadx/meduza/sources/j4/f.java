package j4;

import c4.t;
import c4.u;
import v5.e0;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f8409a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f8410b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8411c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8412d;

    public f(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f8409a = jArr;
        this.f8410b = jArr2;
        this.f8411c = j10;
        this.f8412d = j11;
    }

    @Override // j4.e
    public final long a(long j10) {
        return this.f8409a[e0.f(this.f8410b, j10, true)];
    }

    @Override // j4.e
    public final long c() {
        return this.f8412d;
    }

    @Override // c4.t
    public final boolean e() {
        return true;
    }

    @Override // c4.t
    public final t.a g(long j10) {
        int f = e0.f(this.f8409a, j10, true);
        long[] jArr = this.f8409a;
        long j11 = jArr[f];
        long[] jArr2 = this.f8410b;
        u uVar = new u(j11, jArr2[f]);
        if (j11 >= j10 || f == jArr.length - 1) {
            return new t.a(uVar, uVar);
        }
        int i10 = f + 1;
        return new t.a(uVar, new u(jArr[i10], jArr2[i10]));
    }

    @Override // c4.t
    public final long h() {
        return this.f8411c;
    }
}
