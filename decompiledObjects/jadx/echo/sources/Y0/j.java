package Y0;

import F0.I;
import F0.M;
import F0.N;
import g0.AbstractC1297a;
import g0.M;

/* loaded from: classes.dex */
public final class j implements g {

    /* renamed from: a, reason: collision with root package name */
    public final long f7342a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7343b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7344c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7345d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7346e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7347f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f7348g;

    public j(long j7, int i7, long j8, int i8) {
        this(j7, i7, j8, i8, -1L, null);
    }

    public static j a(i iVar, long j7) {
        long[] jArr;
        long a7 = iVar.a();
        if (a7 == -9223372036854775807L) {
            return null;
        }
        long j8 = iVar.f7338c;
        if (j8 == -1 || (jArr = iVar.f7341f) == null) {
            I.a aVar = iVar.f7336a;
            return new j(j7, aVar.f1783c, a7, aVar.f1786f);
        }
        I.a aVar2 = iVar.f7336a;
        return new j(j7, aVar2.f1783c, a7, aVar2.f1786f, j8, jArr);
    }

    public final long b(int i7) {
        return (this.f7344c * i7) / 100;
    }

    @Override // Y0.g
    public long c(long j7) {
        long j8 = j7 - this.f7342a;
        if (!h() || j8 <= this.f7343b) {
            return 0L;
        }
        long[] jArr = (long[]) AbstractC1297a.h(this.f7348g);
        double d7 = (j8 * 256.0d) / this.f7346e;
        int h7 = M.h(jArr, (long) d7, true, true);
        long b7 = b(h7);
        long j9 = jArr[h7];
        int i7 = h7 + 1;
        long b8 = b(i7);
        return b7 + Math.round((j9 == (h7 == 99 ? 256L : jArr[i7]) ? 0.0d : (d7 - j9) / (r0 - j9)) * (b8 - b7));
    }

    @Override // Y0.g
    public long f() {
        return this.f7347f;
    }

    @Override // F0.M
    public boolean h() {
        return this.f7348g != null;
    }

    @Override // F0.M
    public M.a j(long j7) {
        if (!h()) {
            return new M.a(new N(0L, this.f7342a + this.f7343b));
        }
        long q7 = g0.M.q(j7, 0L, this.f7344c);
        double d7 = (q7 * 100.0d) / this.f7344c;
        double d8 = 0.0d;
        if (d7 > 0.0d) {
            if (d7 >= 100.0d) {
                d8 = 256.0d;
            } else {
                int i7 = (int) d7;
                double d9 = ((long[]) AbstractC1297a.h(this.f7348g))[i7];
                d8 = d9 + ((d7 - i7) * ((i7 == 99 ? 256.0d : r3[i7 + 1]) - d9));
            }
        }
        return new M.a(new N(q7, this.f7342a + g0.M.q(Math.round((d8 / 256.0d) * this.f7346e), this.f7343b, this.f7346e - 1)));
    }

    @Override // Y0.g
    public int k() {
        return this.f7345d;
    }

    @Override // F0.M
    public long l() {
        return this.f7344c;
    }

    public j(long j7, int i7, long j8, int i8, long j9, long[] jArr) {
        this.f7342a = j7;
        this.f7343b = i7;
        this.f7344c = j8;
        this.f7345d = i8;
        this.f7346e = j9;
        this.f7348g = jArr;
        this.f7347f = j9 != -1 ? j7 + j9 : -1L;
    }
}
