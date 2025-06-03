package d5;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import v3.i0;
import v5.e0;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public final i f3506a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3507b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3508c;

    public static abstract class a extends k {

        /* renamed from: d, reason: collision with root package name */
        public final long f3509d;

        /* renamed from: e, reason: collision with root package name */
        public final long f3510e;
        public final List<d> f;

        /* renamed from: g, reason: collision with root package name */
        public final long f3511g;

        /* renamed from: h, reason: collision with root package name */
        public final long f3512h;

        /* renamed from: i, reason: collision with root package name */
        public final long f3513i;

        public a(i iVar, long j10, long j11, long j12, long j13, List<d> list, long j14, long j15, long j16) {
            super(iVar, j10, j11);
            this.f3509d = j12;
            this.f3510e = j13;
            this.f = list;
            this.f3513i = j14;
            this.f3511g = j15;
            this.f3512h = j16;
        }

        public final long b(long j10, long j11) {
            long d10 = d(j10);
            return d10 != -1 ? d10 : (int) (f((j11 - this.f3512h) + this.f3513i, j10) - c(j10, j11));
        }

        public final long c(long j10, long j11) {
            if (d(j10) == -1) {
                long j12 = this.f3511g;
                if (j12 != -9223372036854775807L) {
                    return Math.max(this.f3509d, f((j11 - this.f3512h) - j12, j10));
                }
            }
            return this.f3509d;
        }

        public abstract long d(long j10);

        public final long e(long j10, long j11) {
            List<d> list = this.f;
            if (list != null) {
                return (list.get((int) (j10 - this.f3509d)).f3519b * 1000000) / this.f3507b;
            }
            long d10 = d(j11);
            return (d10 == -1 || j10 != (this.f3509d + d10) - 1) ? (this.f3510e * 1000000) / this.f3507b : j11 - g(j10);
        }

        public final long f(long j10, long j11) {
            long j12 = this.f3509d;
            long d10 = d(j11);
            if (d10 == 0) {
                return j12;
            }
            if (this.f == null) {
                long j13 = (j10 / ((this.f3510e * 1000000) / this.f3507b)) + this.f3509d;
                return j13 < j12 ? j12 : d10 == -1 ? j13 : Math.min(j13, (j12 + d10) - 1);
            }
            long j14 = (d10 + j12) - 1;
            long j15 = j12;
            while (j15 <= j14) {
                long j16 = ((j14 - j15) / 2) + j15;
                long g10 = g(j16);
                if (g10 < j10) {
                    j15 = j16 + 1;
                } else {
                    if (g10 <= j10) {
                        return j16;
                    }
                    j14 = j16 - 1;
                }
            }
            return j15 == j12 ? j15 : j14;
        }

        public final long g(long j10) {
            List<d> list = this.f;
            return e0.O(list != null ? list.get((int) (j10 - this.f3509d)).f3518a - this.f3508c : (j10 - this.f3509d) * this.f3510e, 1000000L, this.f3507b);
        }

        public abstract i h(long j10, j jVar);

        public boolean i() {
            return this.f != null;
        }
    }

    public static final class b extends a {

        /* renamed from: j, reason: collision with root package name */
        public final List<i> f3514j;

        public b(i iVar, long j10, long j11, long j12, long j13, List<d> list, long j14, List<i> list2, long j15, long j16) {
            super(iVar, j10, j11, j12, j13, list, j14, j15, j16);
            this.f3514j = list2;
        }

        @Override // d5.k.a
        public final long d(long j10) {
            return this.f3514j.size();
        }

        @Override // d5.k.a
        public final i h(long j10, j jVar) {
            return this.f3514j.get((int) (j10 - this.f3509d));
        }

        @Override // d5.k.a
        public final boolean i() {
            return true;
        }
    }

    public static final class c extends a {

        /* renamed from: j, reason: collision with root package name */
        public final m f3515j;

        /* renamed from: k, reason: collision with root package name */
        public final m f3516k;

        /* renamed from: l, reason: collision with root package name */
        public final long f3517l;

        public c(i iVar, long j10, long j11, long j12, long j13, long j14, List<d> list, long j15, m mVar, m mVar2, long j16, long j17) {
            super(iVar, j10, j11, j12, j14, list, j15, j16, j17);
            this.f3515j = mVar;
            this.f3516k = mVar2;
            this.f3517l = j13;
        }

        @Override // d5.k
        public final i a(j jVar) {
            m mVar = this.f3515j;
            if (mVar == null) {
                return this.f3506a;
            }
            i0 i0Var = jVar.f3496a;
            return new i(0L, -1L, mVar.a(i0Var.f15447a, 0L, 0L, i0Var.f15453p));
        }

        @Override // d5.k.a
        public final long d(long j10) {
            if (this.f != null) {
                return r0.size();
            }
            long j11 = this.f3517l;
            if (j11 != -1) {
                return (j11 - this.f3509d) + 1;
            }
            if (j10 == -9223372036854775807L) {
                return -1L;
            }
            BigInteger multiply = BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f3507b));
            BigInteger multiply2 = BigInteger.valueOf(this.f3510e).multiply(BigInteger.valueOf(1000000L));
            RoundingMode roundingMode = RoundingMode.CEILING;
            int i10 = q7.a.f13342a;
            return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
        }

        @Override // d5.k.a
        public final i h(long j10, j jVar) {
            List<d> list = this.f;
            long j11 = list != null ? list.get((int) (j10 - this.f3509d)).f3518a : (j10 - this.f3509d) * this.f3510e;
            m mVar = this.f3516k;
            i0 i0Var = jVar.f3496a;
            return new i(0L, -1L, mVar.a(i0Var.f15447a, j10, j11, i0Var.f15453p));
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final long f3518a;

        /* renamed from: b, reason: collision with root package name */
        public final long f3519b;

        public d(long j10, long j11) {
            this.f3518a = j10;
            this.f3519b = j11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f3518a == dVar.f3518a && this.f3519b == dVar.f3519b;
        }

        public final int hashCode() {
            return (((int) this.f3518a) * 31) + ((int) this.f3519b);
        }
    }

    public static class e extends k {

        /* renamed from: d, reason: collision with root package name */
        public final long f3520d;

        /* renamed from: e, reason: collision with root package name */
        public final long f3521e;

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }

        public e(i iVar, long j10, long j11, long j12, long j13) {
            super(iVar, j10, j11);
            this.f3520d = j12;
            this.f3521e = j13;
        }
    }

    public k(i iVar, long j10, long j11) {
        this.f3506a = iVar;
        this.f3507b = j10;
        this.f3508c = j11;
    }

    public i a(j jVar) {
        return this.f3506a;
    }
}
