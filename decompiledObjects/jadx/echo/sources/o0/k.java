package o0;

import d0.C1194q;
import g0.M;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public final i f18145a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18146b;

    /* renamed from: c, reason: collision with root package name */
    public final long f18147c;

    public static abstract class a extends k {

        /* renamed from: d, reason: collision with root package name */
        public final long f18148d;

        /* renamed from: e, reason: collision with root package name */
        public final long f18149e;

        /* renamed from: f, reason: collision with root package name */
        public final List f18150f;

        /* renamed from: g, reason: collision with root package name */
        public final long f18151g;

        /* renamed from: h, reason: collision with root package name */
        public final long f18152h;

        /* renamed from: i, reason: collision with root package name */
        public final long f18153i;

        public a(i iVar, long j7, long j8, long j9, long j10, List list, long j11, long j12, long j13) {
            super(iVar, j7, j8);
            this.f18148d = j9;
            this.f18149e = j10;
            this.f18150f = list;
            this.f18153i = j11;
            this.f18151g = j12;
            this.f18152h = j13;
        }

        public long c(long j7, long j8) {
            long g7 = g(j7);
            return g7 != -1 ? g7 : (int) (i((j8 - this.f18152h) + this.f18153i, j7) - d(j7, j8));
        }

        public long d(long j7, long j8) {
            if (g(j7) == -1) {
                long j9 = this.f18151g;
                if (j9 != -9223372036854775807L) {
                    return Math.max(e(), i((j8 - this.f18152h) - j9, j7));
                }
            }
            return e();
        }

        public long e() {
            return this.f18148d;
        }

        public long f(long j7, long j8) {
            if (this.f18150f != null) {
                return -9223372036854775807L;
            }
            long d7 = d(j7, j8) + c(j7, j8);
            return (j(d7) + h(d7, j7)) - this.f18153i;
        }

        public abstract long g(long j7);

        public final long h(long j7, long j8) {
            List list = this.f18150f;
            if (list != null) {
                return (((d) list.get((int) (j7 - this.f18148d))).f18159b * 1000000) / this.f18146b;
            }
            long g7 = g(j8);
            return (g7 == -1 || j7 != (e() + g7) - 1) ? (this.f18149e * 1000000) / this.f18146b : j8 - j(j7);
        }

        public long i(long j7, long j8) {
            long e7 = e();
            long g7 = g(j8);
            if (g7 == 0) {
                return e7;
            }
            if (this.f18150f == null) {
                long j9 = this.f18148d + (j7 / ((this.f18149e * 1000000) / this.f18146b));
                return j9 < e7 ? e7 : g7 == -1 ? j9 : Math.min(j9, (e7 + g7) - 1);
            }
            long j10 = (g7 + e7) - 1;
            long j11 = e7;
            while (j11 <= j10) {
                long j12 = ((j10 - j11) / 2) + j11;
                long j13 = j(j12);
                if (j13 < j7) {
                    j11 = j12 + 1;
                } else {
                    if (j13 <= j7) {
                        return j12;
                    }
                    j10 = j12 - 1;
                }
            }
            return j11 == e7 ? j11 : j10;
        }

        public final long j(long j7) {
            List list = this.f18150f;
            return M.W0(list != null ? ((d) list.get((int) (j7 - this.f18148d))).f18158a - this.f18147c : (j7 - this.f18148d) * this.f18149e, 1000000L, this.f18146b);
        }

        public abstract i k(j jVar, long j7);

        public boolean l() {
            return this.f18150f != null;
        }
    }

    public static final class b extends a {

        /* renamed from: j, reason: collision with root package name */
        public final List f18154j;

        public b(i iVar, long j7, long j8, long j9, long j10, List list, long j11, List list2, long j12, long j13) {
            super(iVar, j7, j8, j9, j10, list, j11, j12, j13);
            this.f18154j = list2;
        }

        @Override // o0.k.a
        public long g(long j7) {
            return this.f18154j.size();
        }

        @Override // o0.k.a
        public i k(j jVar, long j7) {
            return (i) this.f18154j.get((int) (j7 - this.f18148d));
        }

        @Override // o0.k.a
        public boolean l() {
            return true;
        }
    }

    public static final class c extends a {

        /* renamed from: j, reason: collision with root package name */
        public final n f18155j;

        /* renamed from: k, reason: collision with root package name */
        public final n f18156k;

        /* renamed from: l, reason: collision with root package name */
        public final long f18157l;

        public c(i iVar, long j7, long j8, long j9, long j10, long j11, List list, long j12, n nVar, n nVar2, long j13, long j14) {
            super(iVar, j7, j8, j9, j11, list, j12, j13, j14);
            this.f18155j = nVar;
            this.f18156k = nVar2;
            this.f18157l = j10;
        }

        @Override // o0.k
        public i a(j jVar) {
            n nVar = this.f18155j;
            if (nVar == null) {
                return super.a(jVar);
            }
            C1194q c1194q = jVar.f18132b;
            return new i(nVar.a(c1194q.f12713a, 0L, c1194q.f12721i, 0L), 0L, -1L);
        }

        @Override // o0.k.a
        public long g(long j7) {
            if (this.f18150f != null) {
                return r0.size();
            }
            long j8 = this.f18157l;
            if (j8 != -1) {
                return (j8 - this.f18148d) + 1;
            }
            if (j7 != -9223372036854775807L) {
                return Z2.a.a(BigInteger.valueOf(j7).multiply(BigInteger.valueOf(this.f18146b)), BigInteger.valueOf(this.f18149e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // o0.k.a
        public i k(j jVar, long j7) {
            List list = this.f18150f;
            long j8 = list != null ? ((d) list.get((int) (j7 - this.f18148d))).f18158a : (j7 - this.f18148d) * this.f18149e;
            n nVar = this.f18156k;
            C1194q c1194q = jVar.f18132b;
            return new i(nVar.a(c1194q.f12713a, j7, c1194q.f12721i, j8), 0L, -1L);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final long f18158a;

        /* renamed from: b, reason: collision with root package name */
        public final long f18159b;

        public d(long j7, long j8) {
            this.f18158a = j7;
            this.f18159b = j8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f18158a == dVar.f18158a && this.f18159b == dVar.f18159b;
        }

        public int hashCode() {
            return (((int) this.f18158a) * 31) + ((int) this.f18159b);
        }
    }

    public static class e extends k {

        /* renamed from: d, reason: collision with root package name */
        public final long f18160d;

        /* renamed from: e, reason: collision with root package name */
        public final long f18161e;

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }

        public i c() {
            long j7 = this.f18161e;
            if (j7 <= 0) {
                return null;
            }
            return new i(null, this.f18160d, j7);
        }

        public e(i iVar, long j7, long j8, long j9, long j10) {
            super(iVar, j7, j8);
            this.f18160d = j9;
            this.f18161e = j10;
        }
    }

    public k(i iVar, long j7, long j8) {
        this.f18145a = iVar;
        this.f18146b = j7;
        this.f18147c = j8;
    }

    public i a(j jVar) {
        return this.f18145a;
    }

    public long b() {
        return M.W0(this.f18147c, 1000000L, this.f18146b);
    }
}
