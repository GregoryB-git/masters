package Y0;

import F0.M;
import F0.N;
import T0.l;
import android.util.Pair;
import g0.M;

/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f7306a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f7307b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7308c;

    public c(long[] jArr, long[] jArr2, long j7) {
        this.f7306a = jArr;
        this.f7307b = jArr2;
        this.f7308c = j7 == -9223372036854775807L ? M.J0(jArr2[jArr2.length - 1]) : j7;
    }

    public static c a(long j7, l lVar, long j8) {
        int length = lVar.f6050s.length;
        int i7 = length + 1;
        long[] jArr = new long[i7];
        long[] jArr2 = new long[i7];
        jArr[0] = j7;
        long j9 = 0;
        jArr2[0] = 0;
        for (int i8 = 1; i8 <= length; i8++) {
            int i9 = i8 - 1;
            j7 += lVar.f6048q + lVar.f6050s[i9];
            j9 += lVar.f6049r + lVar.f6051t[i9];
            jArr[i8] = j7;
            jArr2[i8] = j9;
        }
        return new c(jArr, jArr2, j8);
    }

    public static Pair b(long j7, long[] jArr, long[] jArr2) {
        Long valueOf;
        Long valueOf2;
        int h7 = M.h(jArr, j7, true, true);
        long j8 = jArr[h7];
        long j9 = jArr2[h7];
        int i7 = h7 + 1;
        if (i7 == jArr.length) {
            valueOf = Long.valueOf(j8);
            valueOf2 = Long.valueOf(j9);
        } else {
            long j10 = jArr[i7];
            long j11 = jArr2[i7];
            double d7 = j10 == j8 ? 0.0d : (j7 - j8) / (j10 - j8);
            valueOf = Long.valueOf(j7);
            valueOf2 = Long.valueOf(((long) (d7 * (j11 - j9))) + j9);
        }
        return Pair.create(valueOf, valueOf2);
    }

    @Override // Y0.g
    public long c(long j7) {
        return M.J0(((Long) b(j7, this.f7306a, this.f7307b).second).longValue());
    }

    @Override // Y0.g
    public long f() {
        return -1L;
    }

    @Override // F0.M
    public boolean h() {
        return true;
    }

    @Override // F0.M
    public M.a j(long j7) {
        Pair b7 = b(g0.M.i1(g0.M.q(j7, 0L, this.f7308c)), this.f7307b, this.f7306a);
        return new M.a(new N(g0.M.J0(((Long) b7.first).longValue()), ((Long) b7.second).longValue()));
    }

    @Override // Y0.g
    public int k() {
        return -2147483647;
    }

    @Override // F0.M
    public long l() {
        return this.f7308c;
    }
}
