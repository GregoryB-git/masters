package Y0;

import F0.I;
import g0.M;
import g0.z;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final I.a f7336a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7337b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7338c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7339d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7340e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f7341f;

    public i(I.a aVar, long j7, long j8, long[] jArr, int i7, int i8) {
        this.f7336a = new I.a(aVar);
        this.f7337b = j7;
        this.f7338c = j8;
        this.f7341f = jArr;
        this.f7339d = i7;
        this.f7340e = i8;
    }

    public static i b(I.a aVar, z zVar) {
        long[] jArr;
        int i7;
        int i8;
        int p7 = zVar.p();
        int K6 = (p7 & 1) != 0 ? zVar.K() : -1;
        long I6 = (p7 & 2) != 0 ? zVar.I() : -1L;
        if ((p7 & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i9 = 0; i9 < 100; i9++) {
                jArr2[i9] = zVar.G();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((p7 & 8) != 0) {
            zVar.U(4);
        }
        if (zVar.a() >= 24) {
            zVar.U(21);
            int J6 = zVar.J();
            i8 = J6 & 4095;
            i7 = (16773120 & J6) >> 12;
        } else {
            i7 = -1;
            i8 = -1;
        }
        return new i(aVar, K6, I6, jArr, i7, i8);
    }

    public long a() {
        long j7 = this.f7337b;
        if (j7 == -1 || j7 == 0) {
            return -9223372036854775807L;
        }
        return M.V0((j7 * r2.f1787g) - 1, this.f7336a.f1784d);
    }
}
