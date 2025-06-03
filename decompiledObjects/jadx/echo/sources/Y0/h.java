package Y0;

import F0.I;
import F0.M;
import F0.N;
import g0.M;
import g0.o;
import g0.z;

/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f7331a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f7332b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7333c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7334d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7335e;

    public h(long[] jArr, long[] jArr2, long j7, long j8, int i7) {
        this.f7331a = jArr;
        this.f7332b = jArr2;
        this.f7333c = j7;
        this.f7334d = j8;
        this.f7335e = i7;
    }

    public static h a(long j7, long j8, I.a aVar, z zVar) {
        int G6;
        zVar.U(10);
        int p7 = zVar.p();
        if (p7 <= 0) {
            return null;
        }
        int i7 = aVar.f1784d;
        long W02 = M.W0(p7, (i7 >= 32000 ? 1152 : 576) * 1000000, i7);
        int M6 = zVar.M();
        int M7 = zVar.M();
        int M8 = zVar.M();
        zVar.U(2);
        long j9 = j8 + aVar.f1783c;
        long[] jArr = new long[M6];
        long[] jArr2 = new long[M6];
        int i8 = 0;
        long j10 = j8;
        while (i8 < M6) {
            int i9 = M7;
            long j11 = j9;
            jArr[i8] = (i8 * W02) / M6;
            jArr2[i8] = Math.max(j10, j11);
            if (M8 == 1) {
                G6 = zVar.G();
            } else if (M8 == 2) {
                G6 = zVar.M();
            } else if (M8 == 3) {
                G6 = zVar.J();
            } else {
                if (M8 != 4) {
                    return null;
                }
                G6 = zVar.K();
            }
            j10 += G6 * i9;
            i8++;
            M6 = M6;
            M7 = i9;
            j9 = j11;
        }
        if (j7 != -1 && j7 != j10) {
            o.h("VbriSeeker", "VBRI data size mismatch: " + j7 + ", " + j10);
        }
        return new h(jArr, jArr2, W02, j10, aVar.f1786f);
    }

    @Override // Y0.g
    public long c(long j7) {
        return this.f7331a[M.h(this.f7332b, j7, true, true)];
    }

    @Override // Y0.g
    public long f() {
        return this.f7334d;
    }

    @Override // F0.M
    public boolean h() {
        return true;
    }

    @Override // F0.M
    public M.a j(long j7) {
        int h7 = g0.M.h(this.f7331a, j7, true, true);
        N n7 = new N(this.f7331a[h7], this.f7332b[h7]);
        if (n7.f1794a >= j7 || h7 == this.f7331a.length - 1) {
            return new M.a(n7);
        }
        int i7 = h7 + 1;
        return new M.a(n7, new N(this.f7331a[i7], this.f7332b[i7]));
    }

    @Override // Y0.g
    public int k() {
        return this.f7335e;
    }

    @Override // F0.M
    public long l() {
        return this.f7333c;
    }
}
