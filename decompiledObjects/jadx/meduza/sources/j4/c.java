package j4;

import android.util.Pair;
import c4.t;
import c4.u;
import v5.e0;

/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f8387a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f8388b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8389c;

    public c(long[] jArr, long[] jArr2, long j10) {
        this.f8387a = jArr;
        this.f8388b = jArr2;
        this.f8389c = j10 == -9223372036854775807L ? e0.I(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair b(long[] jArr, long[] jArr2, long j10) {
        int f = e0.f(jArr, j10, true);
        long j11 = jArr[f];
        long j12 = jArr2[f];
        int i10 = f + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i10] == j11 ? 0.0d : (j10 - j11) / (r6 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // j4.e
    public final long a(long j10) {
        return e0.I(((Long) b(this.f8387a, this.f8388b, j10).second).longValue());
    }

    @Override // j4.e
    public final long c() {
        return -1L;
    }

    @Override // c4.t
    public final boolean e() {
        return true;
    }

    @Override // c4.t
    public final t.a g(long j10) {
        Pair b10 = b(this.f8388b, this.f8387a, e0.R(e0.j(j10, 0L, this.f8389c)));
        u uVar = new u(e0.I(((Long) b10.first).longValue()), ((Long) b10.second).longValue());
        return new t.a(uVar, uVar);
    }

    @Override // c4.t
    public final long h() {
        return this.f8389c;
    }
}
