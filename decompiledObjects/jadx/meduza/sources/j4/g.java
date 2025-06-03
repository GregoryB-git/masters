package j4;

import c4.t;
import c4.u;
import v5.e0;

/* loaded from: classes.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    public final long f8413a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8414b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8415c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8416d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8417e;
    public final long[] f;

    public g(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f8413a = j10;
        this.f8414b = i10;
        this.f8415c = j11;
        this.f = jArr;
        this.f8416d = j12;
        this.f8417e = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override // j4.e
    public final long a(long j10) {
        long j11 = j10 - this.f8413a;
        if (!e() || j11 <= this.f8414b) {
            return 0L;
        }
        long[] jArr = this.f;
        x6.b.K(jArr);
        double d10 = (j11 * 256.0d) / this.f8416d;
        int f = e0.f(jArr, (long) d10, true);
        long j12 = this.f8415c;
        long j13 = (f * j12) / 100;
        long j14 = jArr[f];
        int i10 = f + 1;
        long j15 = (j12 * i10) / 100;
        return Math.round((j14 == (f == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j14) / (r0 - j14)) * (j15 - j13)) + j13;
    }

    @Override // j4.e
    public final long c() {
        return this.f8417e;
    }

    @Override // c4.t
    public final boolean e() {
        return this.f != null;
    }

    @Override // c4.t
    public final t.a g(long j10) {
        if (!e()) {
            u uVar = new u(0L, this.f8413a + this.f8414b);
            return new t.a(uVar, uVar);
        }
        long j11 = e0.j(j10, 0L, this.f8415c);
        double d10 = (j11 * 100.0d) / this.f8415c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                long[] jArr = this.f;
                x6.b.K(jArr);
                double d12 = jArr[i10];
                d11 = d12 + (((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12) * (d10 - i10));
            }
        }
        u uVar2 = new u(j11, this.f8413a + e0.j(Math.round((d11 / 256.0d) * this.f8416d), this.f8414b, this.f8416d - 1));
        return new t.a(uVar2, uVar2);
    }

    @Override // c4.t
    public final long h() {
        return this.f8415c;
    }
}
