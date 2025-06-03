package l1;

import F0.AbstractC0360e;
import F0.InterfaceC0373s;

/* loaded from: classes.dex */
public final class G extends AbstractC0360e {

    public static final class a implements AbstractC0360e.f {

        /* renamed from: a, reason: collision with root package name */
        public final g0.E f16769a;

        /* renamed from: b, reason: collision with root package name */
        public final g0.z f16770b = new g0.z();

        /* renamed from: c, reason: collision with root package name */
        public final int f16771c;

        /* renamed from: d, reason: collision with root package name */
        public final int f16772d;

        public a(int i7, g0.E e7, int i8) {
            this.f16771c = i7;
            this.f16769a = e7;
            this.f16772d = i8;
        }

        @Override // F0.AbstractC0360e.f
        public AbstractC0360e.C0030e a(InterfaceC0373s interfaceC0373s, long j7) {
            long p7 = interfaceC0373s.p();
            int min = (int) Math.min(this.f16772d, interfaceC0373s.a() - p7);
            this.f16770b.P(min);
            interfaceC0373s.n(this.f16770b.e(), 0, min);
            return c(this.f16770b, j7, p7);
        }

        @Override // F0.AbstractC0360e.f
        public void b() {
            this.f16770b.Q(g0.M.f14266f);
        }

        public final AbstractC0360e.C0030e c(g0.z zVar, long j7, long j8) {
            int a7;
            int a8;
            int g7 = zVar.g();
            long j9 = -1;
            long j10 = -1;
            long j11 = -9223372036854775807L;
            while (zVar.a() >= 188 && (a8 = (a7 = L.a(zVar.e(), zVar.f(), g7)) + 188) <= g7) {
                long c7 = L.c(zVar, a7, this.f16771c);
                if (c7 != -9223372036854775807L) {
                    long b7 = this.f16769a.b(c7);
                    if (b7 > j7) {
                        return j11 == -9223372036854775807L ? AbstractC0360e.C0030e.d(b7, j8) : AbstractC0360e.C0030e.e(j8 + j10);
                    }
                    if (100000 + b7 > j7) {
                        return AbstractC0360e.C0030e.e(j8 + a7);
                    }
                    j10 = a7;
                    j11 = b7;
                }
                zVar.T(a8);
                j9 = a8;
            }
            return j11 != -9223372036854775807L ? AbstractC0360e.C0030e.f(j11, j8 + j9) : AbstractC0360e.C0030e.f1892d;
        }
    }

    public G(g0.E e7, long j7, long j8, int i7, int i8) {
        super(new AbstractC0360e.b(), new a(i7, e7, i8), j7, 0L, j7 + 1, 0L, j8, 188L, 940);
    }
}
