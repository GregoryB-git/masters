package l1;

import F0.InterfaceC0373s;

/* renamed from: l1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1584A {

    /* renamed from: c, reason: collision with root package name */
    public boolean f16735c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16736d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16737e;

    /* renamed from: a, reason: collision with root package name */
    public final g0.E f16733a = new g0.E(0);

    /* renamed from: f, reason: collision with root package name */
    public long f16738f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f16739g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f16740h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final g0.z f16734b = new g0.z();

    public static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public static long l(g0.z zVar) {
        int f7 = zVar.f();
        if (zVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zVar.l(bArr, 0, 9);
        zVar.T(f7);
        if (a(bArr)) {
            return m(bArr);
        }
        return -9223372036854775807L;
    }

    public static long m(byte[] bArr) {
        byte b7 = bArr[0];
        long j7 = (((b7 & 56) >> 3) << 30) | ((b7 & 3) << 28) | ((bArr[1] & 255) << 20);
        byte b8 = bArr[2];
        return j7 | (((b8 & 248) >> 3) << 15) | ((b8 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public final int b(InterfaceC0373s interfaceC0373s) {
        this.f16734b.Q(g0.M.f14266f);
        this.f16735c = true;
        interfaceC0373s.h();
        return 0;
    }

    public long c() {
        return this.f16740h;
    }

    public g0.E d() {
        return this.f16733a;
    }

    public boolean e() {
        return this.f16735c;
    }

    public final int f(byte[] bArr, int i7) {
        return (bArr[i7 + 3] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
    }

    public int g(InterfaceC0373s interfaceC0373s, F0.L l7) {
        if (!this.f16737e) {
            return j(interfaceC0373s, l7);
        }
        if (this.f16739g == -9223372036854775807L) {
            return b(interfaceC0373s);
        }
        if (!this.f16736d) {
            return h(interfaceC0373s, l7);
        }
        long j7 = this.f16738f;
        if (j7 == -9223372036854775807L) {
            return b(interfaceC0373s);
        }
        this.f16740h = this.f16733a.c(this.f16739g) - this.f16733a.b(j7);
        return b(interfaceC0373s);
    }

    public final int h(InterfaceC0373s interfaceC0373s, F0.L l7) {
        int min = (int) Math.min(20000L, interfaceC0373s.a());
        long j7 = 0;
        if (interfaceC0373s.p() != j7) {
            l7.f1788a = j7;
            return 1;
        }
        this.f16734b.P(min);
        interfaceC0373s.h();
        interfaceC0373s.n(this.f16734b.e(), 0, min);
        this.f16738f = i(this.f16734b);
        this.f16736d = true;
        return 0;
    }

    public final long i(g0.z zVar) {
        int g7 = zVar.g();
        for (int f7 = zVar.f(); f7 < g7 - 3; f7++) {
            if (f(zVar.e(), f7) == 442) {
                zVar.T(f7 + 4);
                long l7 = l(zVar);
                if (l7 != -9223372036854775807L) {
                    return l7;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int j(InterfaceC0373s interfaceC0373s, F0.L l7) {
        long a7 = interfaceC0373s.a();
        int min = (int) Math.min(20000L, a7);
        long j7 = a7 - min;
        if (interfaceC0373s.p() != j7) {
            l7.f1788a = j7;
            return 1;
        }
        this.f16734b.P(min);
        interfaceC0373s.h();
        interfaceC0373s.n(this.f16734b.e(), 0, min);
        this.f16739g = k(this.f16734b);
        this.f16737e = true;
        return 0;
    }

    public final long k(g0.z zVar) {
        int f7 = zVar.f();
        for (int g7 = zVar.g() - 4; g7 >= f7; g7--) {
            if (f(zVar.e(), g7) == 442) {
                zVar.T(g7 + 4);
                long l7 = l(zVar);
                if (l7 != -9223372036854775807L) {
                    return l7;
                }
            }
        }
        return -9223372036854775807L;
    }
}
