package l1;

import F0.InterfaceC0373s;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final int f16773a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16776d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16777e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16778f;

    /* renamed from: b, reason: collision with root package name */
    public final g0.E f16774b = new g0.E(0);

    /* renamed from: g, reason: collision with root package name */
    public long f16779g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f16780h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public long f16781i = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    public final g0.z f16775c = new g0.z();

    public H(int i7) {
        this.f16773a = i7;
    }

    public final int a(InterfaceC0373s interfaceC0373s) {
        this.f16775c.Q(g0.M.f14266f);
        this.f16776d = true;
        interfaceC0373s.h();
        return 0;
    }

    public long b() {
        return this.f16781i;
    }

    public g0.E c() {
        return this.f16774b;
    }

    public boolean d() {
        return this.f16776d;
    }

    public int e(InterfaceC0373s interfaceC0373s, F0.L l7, int i7) {
        if (i7 <= 0) {
            return a(interfaceC0373s);
        }
        if (!this.f16778f) {
            return h(interfaceC0373s, l7, i7);
        }
        if (this.f16780h == -9223372036854775807L) {
            return a(interfaceC0373s);
        }
        if (!this.f16777e) {
            return f(interfaceC0373s, l7, i7);
        }
        long j7 = this.f16779g;
        if (j7 == -9223372036854775807L) {
            return a(interfaceC0373s);
        }
        this.f16781i = this.f16774b.c(this.f16780h) - this.f16774b.b(j7);
        return a(interfaceC0373s);
    }

    public final int f(InterfaceC0373s interfaceC0373s, F0.L l7, int i7) {
        int min = (int) Math.min(this.f16773a, interfaceC0373s.a());
        long j7 = 0;
        if (interfaceC0373s.p() != j7) {
            l7.f1788a = j7;
            return 1;
        }
        this.f16775c.P(min);
        interfaceC0373s.h();
        interfaceC0373s.n(this.f16775c.e(), 0, min);
        this.f16779g = g(this.f16775c, i7);
        this.f16777e = true;
        return 0;
    }

    public final long g(g0.z zVar, int i7) {
        int g7 = zVar.g();
        for (int f7 = zVar.f(); f7 < g7; f7++) {
            if (zVar.e()[f7] == 71) {
                long c7 = L.c(zVar, f7, i7);
                if (c7 != -9223372036854775807L) {
                    return c7;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int h(InterfaceC0373s interfaceC0373s, F0.L l7, int i7) {
        long a7 = interfaceC0373s.a();
        int min = (int) Math.min(this.f16773a, a7);
        long j7 = a7 - min;
        if (interfaceC0373s.p() != j7) {
            l7.f1788a = j7;
            return 1;
        }
        this.f16775c.P(min);
        interfaceC0373s.h();
        interfaceC0373s.n(this.f16775c.e(), 0, min);
        this.f16780h = i(this.f16775c, i7);
        this.f16778f = true;
        return 0;
    }

    public final long i(g0.z zVar, int i7) {
        int f7 = zVar.f();
        int g7 = zVar.g();
        for (int i8 = g7 - 188; i8 >= f7; i8--) {
            if (L.b(zVar.e(), f7, g7, i8)) {
                long c7 = L.c(zVar, i8, i7);
                if (c7 != -9223372036854775807L) {
                    return c7;
                }
            }
        }
        return -9223372036854775807L;
    }
}
