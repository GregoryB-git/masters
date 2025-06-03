package F0;

import F0.M;
import g0.AbstractC1297a;

/* renamed from: F0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0360e {

    /* renamed from: a, reason: collision with root package name */
    public final a f1873a;

    /* renamed from: b, reason: collision with root package name */
    public final f f1874b;

    /* renamed from: c, reason: collision with root package name */
    public c f1875c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1876d;

    /* renamed from: F0.e$a */
    public static class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public final d f1877a;

        /* renamed from: b, reason: collision with root package name */
        public final long f1878b;

        /* renamed from: c, reason: collision with root package name */
        public final long f1879c;

        /* renamed from: d, reason: collision with root package name */
        public final long f1880d;

        /* renamed from: e, reason: collision with root package name */
        public final long f1881e;

        /* renamed from: f, reason: collision with root package name */
        public final long f1882f;

        /* renamed from: g, reason: collision with root package name */
        public final long f1883g;

        public a(d dVar, long j7, long j8, long j9, long j10, long j11, long j12) {
            this.f1877a = dVar;
            this.f1878b = j7;
            this.f1879c = j8;
            this.f1880d = j9;
            this.f1881e = j10;
            this.f1882f = j11;
            this.f1883g = j12;
        }

        @Override // F0.M
        public boolean h() {
            return true;
        }

        public long i(long j7) {
            return this.f1877a.a(j7);
        }

        @Override // F0.M
        public M.a j(long j7) {
            return new M.a(new N(j7, c.h(this.f1877a.a(j7), this.f1879c, this.f1880d, this.f1881e, this.f1882f, this.f1883g)));
        }

        @Override // F0.M
        public long l() {
            return this.f1878b;
        }
    }

    /* renamed from: F0.e$c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f1884a;

        /* renamed from: b, reason: collision with root package name */
        public final long f1885b;

        /* renamed from: c, reason: collision with root package name */
        public final long f1886c;

        /* renamed from: d, reason: collision with root package name */
        public long f1887d;

        /* renamed from: e, reason: collision with root package name */
        public long f1888e;

        /* renamed from: f, reason: collision with root package name */
        public long f1889f;

        /* renamed from: g, reason: collision with root package name */
        public long f1890g;

        /* renamed from: h, reason: collision with root package name */
        public long f1891h;

        public c(long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
            this.f1884a = j7;
            this.f1885b = j8;
            this.f1887d = j9;
            this.f1888e = j10;
            this.f1889f = j11;
            this.f1890g = j12;
            this.f1886c = j13;
            this.f1891h = h(j8, j9, j10, j11, j12, j13);
        }

        public static long h(long j7, long j8, long j9, long j10, long j11, long j12) {
            if (j10 + 1 >= j11 || j8 + 1 >= j9) {
                return j10;
            }
            long j13 = (long) ((j7 - j8) * ((j11 - j10) / (j9 - j8)));
            return g0.M.q(((j13 + j10) - j12) - (j13 / 20), j10, j11 - 1);
        }

        public final long i() {
            return this.f1890g;
        }

        public final long j() {
            return this.f1889f;
        }

        public final long k() {
            return this.f1891h;
        }

        public final long l() {
            return this.f1884a;
        }

        public final long m() {
            return this.f1885b;
        }

        public final void n() {
            this.f1891h = h(this.f1885b, this.f1887d, this.f1888e, this.f1889f, this.f1890g, this.f1886c);
        }

        public final void o(long j7, long j8) {
            this.f1888e = j7;
            this.f1890g = j8;
            n();
        }

        public final void p(long j7, long j8) {
            this.f1887d = j7;
            this.f1889f = j8;
            n();
        }
    }

    /* renamed from: F0.e$d */
    public interface d {
        long a(long j7);
    }

    /* renamed from: F0.e$e, reason: collision with other inner class name */
    public static final class C0030e {

        /* renamed from: d, reason: collision with root package name */
        public static final C0030e f1892d = new C0030e(-3, -9223372036854775807L, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f1893a;

        /* renamed from: b, reason: collision with root package name */
        public final long f1894b;

        /* renamed from: c, reason: collision with root package name */
        public final long f1895c;

        public C0030e(int i7, long j7, long j8) {
            this.f1893a = i7;
            this.f1894b = j7;
            this.f1895c = j8;
        }

        public static C0030e d(long j7, long j8) {
            return new C0030e(-1, j7, j8);
        }

        public static C0030e e(long j7) {
            return new C0030e(0, -9223372036854775807L, j7);
        }

        public static C0030e f(long j7, long j8) {
            return new C0030e(-2, j7, j8);
        }
    }

    /* renamed from: F0.e$f */
    public interface f {
        C0030e a(InterfaceC0373s interfaceC0373s, long j7);

        void b();
    }

    public AbstractC0360e(d dVar, f fVar, long j7, long j8, long j9, long j10, long j11, long j12, int i7) {
        this.f1874b = fVar;
        this.f1876d = i7;
        this.f1873a = new a(dVar, j7, j8, j9, j10, j11, j12);
    }

    public c a(long j7) {
        return new c(j7, this.f1873a.i(j7), this.f1873a.f1879c, this.f1873a.f1880d, this.f1873a.f1881e, this.f1873a.f1882f, this.f1873a.f1883g);
    }

    public final M b() {
        return this.f1873a;
    }

    public int c(InterfaceC0373s interfaceC0373s, L l7) {
        while (true) {
            c cVar = (c) AbstractC1297a.h(this.f1875c);
            long j7 = cVar.j();
            long i7 = cVar.i();
            long k7 = cVar.k();
            if (i7 - j7 <= this.f1876d) {
                e(false, j7);
                return g(interfaceC0373s, j7, l7);
            }
            if (!i(interfaceC0373s, k7)) {
                return g(interfaceC0373s, k7, l7);
            }
            interfaceC0373s.h();
            C0030e a7 = this.f1874b.a(interfaceC0373s, cVar.m());
            int i8 = a7.f1893a;
            if (i8 == -3) {
                e(false, k7);
                return g(interfaceC0373s, k7, l7);
            }
            if (i8 == -2) {
                cVar.p(a7.f1894b, a7.f1895c);
            } else {
                if (i8 != -1) {
                    if (i8 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(interfaceC0373s, a7.f1895c);
                    e(true, a7.f1895c);
                    return g(interfaceC0373s, a7.f1895c, l7);
                }
                cVar.o(a7.f1894b, a7.f1895c);
            }
        }
    }

    public final boolean d() {
        return this.f1875c != null;
    }

    public final void e(boolean z7, long j7) {
        this.f1875c = null;
        this.f1874b.b();
        f(z7, j7);
    }

    public final int g(InterfaceC0373s interfaceC0373s, long j7, L l7) {
        if (j7 == interfaceC0373s.p()) {
            return 0;
        }
        l7.f1788a = j7;
        return 1;
    }

    public final void h(long j7) {
        c cVar = this.f1875c;
        if (cVar == null || cVar.l() != j7) {
            this.f1875c = a(j7);
        }
    }

    public final boolean i(InterfaceC0373s interfaceC0373s, long j7) {
        long p7 = j7 - interfaceC0373s.p();
        if (p7 < 0 || p7 > 262144) {
            return false;
        }
        interfaceC0373s.i((int) p7);
        return true;
    }

    /* renamed from: F0.e$b */
    public static final class b implements d {
        @Override // F0.AbstractC0360e.d
        public long a(long j7) {
            return j7;
        }
    }

    public void f(boolean z7, long j7) {
    }
}
