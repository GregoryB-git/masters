package l1;

import F0.AbstractC0360e;
import F0.InterfaceC0373s;

/* loaded from: classes.dex */
public final class z extends AbstractC0360e {

    public static final class b implements AbstractC0360e.f {

        /* renamed from: a, reason: collision with root package name */
        public final g0.E f17135a;

        /* renamed from: b, reason: collision with root package name */
        public final g0.z f17136b;

        public b(g0.E e7) {
            this.f17135a = e7;
            this.f17136b = new g0.z();
        }

        public static void d(g0.z zVar) {
            int k7;
            int g7 = zVar.g();
            if (zVar.a() < 10) {
                zVar.T(g7);
                return;
            }
            zVar.U(9);
            int G6 = zVar.G() & 7;
            if (zVar.a() < G6) {
                zVar.T(g7);
                return;
            }
            zVar.U(G6);
            if (zVar.a() < 4) {
                zVar.T(g7);
                return;
            }
            if (z.k(zVar.e(), zVar.f()) == 443) {
                zVar.U(4);
                int M6 = zVar.M();
                if (zVar.a() < M6) {
                    zVar.T(g7);
                    return;
                }
                zVar.U(M6);
            }
            while (zVar.a() >= 4 && (k7 = z.k(zVar.e(), zVar.f())) != 442 && k7 != 441 && (k7 >>> 8) == 1) {
                zVar.U(4);
                if (zVar.a() < 2) {
                    zVar.T(g7);
                    return;
                }
                zVar.T(Math.min(zVar.g(), zVar.f() + zVar.M()));
            }
        }

        @Override // F0.AbstractC0360e.f
        public AbstractC0360e.C0030e a(InterfaceC0373s interfaceC0373s, long j7) {
            long p7 = interfaceC0373s.p();
            int min = (int) Math.min(20000L, interfaceC0373s.a() - p7);
            this.f17136b.P(min);
            interfaceC0373s.n(this.f17136b.e(), 0, min);
            return c(this.f17136b, j7, p7);
        }

        @Override // F0.AbstractC0360e.f
        public void b() {
            this.f17136b.Q(g0.M.f14266f);
        }

        public final AbstractC0360e.C0030e c(g0.z zVar, long j7, long j8) {
            int i7 = -1;
            int i8 = -1;
            long j9 = -9223372036854775807L;
            while (zVar.a() >= 4) {
                if (z.k(zVar.e(), zVar.f()) != 442) {
                    zVar.U(1);
                } else {
                    zVar.U(4);
                    long l7 = C1584A.l(zVar);
                    if (l7 != -9223372036854775807L) {
                        long b7 = this.f17135a.b(l7);
                        if (b7 > j7) {
                            return j9 == -9223372036854775807L ? AbstractC0360e.C0030e.d(b7, j8) : AbstractC0360e.C0030e.e(j8 + i8);
                        }
                        if (100000 + b7 > j7) {
                            return AbstractC0360e.C0030e.e(j8 + zVar.f());
                        }
                        i8 = zVar.f();
                        j9 = b7;
                    }
                    d(zVar);
                    i7 = zVar.f();
                }
            }
            return j9 != -9223372036854775807L ? AbstractC0360e.C0030e.f(j9, j8 + i7) : AbstractC0360e.C0030e.f1892d;
        }
    }

    public z(g0.E e7, long j7, long j8) {
        super(new AbstractC0360e.b(), new b(e7), j7, 0L, j7 + 1, 0L, j8, 188L, 1000);
    }

    public static int k(byte[] bArr, int i7) {
        return (bArr[i7 + 3] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
    }
}
