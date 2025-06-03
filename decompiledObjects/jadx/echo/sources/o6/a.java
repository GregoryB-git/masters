package o6;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import kotlin.text.s;
import l6.f;
import x1.AbstractC2157j;

/* loaded from: classes.dex */
public final class a implements Comparable {

    /* renamed from: p, reason: collision with root package name */
    public static final C0243a f18197p = new C0243a(null);

    /* renamed from: q, reason: collision with root package name */
    public static final long f18198q = m(0);

    /* renamed from: r, reason: collision with root package name */
    public static final long f18199r;

    /* renamed from: s, reason: collision with root package name */
    public static final long f18200s;

    /* renamed from: o, reason: collision with root package name */
    public final long f18201o;

    /* renamed from: o6.a$a, reason: collision with other inner class name */
    public static final class C0243a {
        public C0243a() {
        }

        public /* synthetic */ C0243a(g gVar) {
            this();
        }
    }

    static {
        long i7;
        long i8;
        i7 = c.i(4611686018427387903L);
        f18199r = i7;
        i8 = c.i(-4611686018427387903L);
        f18200s = i8;
    }

    public /* synthetic */ a(long j7) {
        this.f18201o = j7;
    }

    public static final int C(long j7) {
        if (S(j7)) {
            return 0;
        }
        return (int) (w(j7) % 60);
    }

    public static final d D(long j7) {
        return M(j7) ? d.f18204p : d.f18206r;
    }

    public static final long F(long j7) {
        return j7 >> 1;
    }

    public static int G(long j7) {
        return AbstractC2157j.a(j7);
    }

    public static final boolean H(long j7) {
        return !S(j7);
    }

    public static final boolean K(long j7) {
        return (((int) j7) & 1) == 1;
    }

    public static final boolean M(long j7) {
        return (((int) j7) & 1) == 0;
    }

    public static final boolean S(long j7) {
        return j7 == f18199r || j7 == f18200s;
    }

    public static final boolean T(long j7) {
        return j7 < 0;
    }

    public static final boolean U(long j7) {
        return j7 > 0;
    }

    public static final long V(long j7, long j8) {
        return W(j7, Z(j8));
    }

    public static final long W(long j7, long j8) {
        long j9;
        long l7;
        if (S(j7)) {
            if (H(j8) || (j8 ^ j7) >= 0) {
                return j7;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (S(j8)) {
            return j8;
        }
        if ((((int) j7) & 1) != (((int) j8) & 1)) {
            return K(j7) ? c(j7, F(j7), F(j8)) : c(j7, F(j8), F(j7));
        }
        long F6 = F(j7) + F(j8);
        if (M(j7)) {
            l7 = c.l(F6);
            return l7;
        }
        j9 = c.j(F6);
        return j9;
    }

    public static final long X(long j7, d unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j7 == f18199r) {
            return Long.MAX_VALUE;
        }
        if (j7 == f18200s) {
            return Long.MIN_VALUE;
        }
        return e.a(F(j7), D(j7), unit);
    }

    public static String Y(long j7) {
        int i7;
        long j8;
        StringBuilder sb;
        int i8;
        int i9;
        String str;
        boolean z7;
        if (j7 == 0) {
            return "0s";
        }
        if (j7 == f18199r) {
            return "Infinity";
        }
        if (j7 == f18200s) {
            return "-Infinity";
        }
        boolean T6 = T(j7);
        StringBuilder sb2 = new StringBuilder();
        if (T6) {
            sb2.append('-');
        }
        long o7 = o(j7);
        long r7 = r(o7);
        int p7 = p(o7);
        int x7 = x(o7);
        int C7 = C(o7);
        int z8 = z(o7);
        int i10 = 0;
        boolean z9 = r7 != 0;
        boolean z10 = p7 != 0;
        boolean z11 = x7 != 0;
        boolean z12 = (C7 == 0 && z8 == 0) ? false : true;
        if (z9) {
            sb2.append(r7);
            sb2.append('d');
            i10 = 1;
        }
        if (z10 || (z9 && (z11 || z12))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(p7);
            sb2.append('h');
            i10 = i11;
        }
        if (z11 || (z12 && (z10 || z9))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(x7);
            sb2.append('m');
            i10 = i12;
        }
        if (z12) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (C7 != 0 || z9 || z10 || z11) {
                i7 = 9;
                j8 = j7;
                sb = sb2;
                i8 = C7;
                i9 = z8;
                str = "s";
                z7 = false;
            } else {
                if (z8 >= 1000000) {
                    i8 = z8 / 1000000;
                    i9 = z8 % 1000000;
                    str = "ms";
                    z7 = false;
                    i7 = 6;
                } else if (z8 >= 1000) {
                    i8 = z8 / 1000;
                    i9 = z8 % 1000;
                    str = "us";
                    z7 = false;
                    i7 = 3;
                } else {
                    sb2.append(z8);
                    sb2.append("ns");
                    i10 = i13;
                }
                j8 = j7;
                sb = sb2;
            }
            e(j8, sb, i8, i9, i7, str, z7);
            i10 = i13;
        }
        if (T6 && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public static final long Z(long j7) {
        long h7;
        h7 = c.h(-F(j7), ((int) j7) & 1);
        return h7;
    }

    public static final long c(long j7, long j8, long j9) {
        long n7;
        long e7;
        long i7;
        long m7;
        long m8;
        long k7;
        n7 = c.n(j9);
        long j10 = j8 + n7;
        if (-4611686018426L > j10 || j10 >= 4611686018427L) {
            e7 = f.e(j10, -4611686018427387903L, 4611686018427387903L);
            i7 = c.i(e7);
            return i7;
        }
        m7 = c.m(n7);
        long j11 = j9 - m7;
        m8 = c.m(j10);
        k7 = c.k(m8 + j11);
        return k7;
    }

    public static final void e(long j7, StringBuilder sb, int i7, int i8, int i9, String str, boolean z7) {
        String O6;
        sb.append(i7);
        if (i8 != 0) {
            sb.append('.');
            O6 = s.O(String.valueOf(i8), i9, '0');
            int i10 = -1;
            int length = O6.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i11 = length - 1;
                    if (O6.charAt(length) != '0') {
                        i10 = length;
                        break;
                    } else if (i11 < 0) {
                        break;
                    } else {
                        length = i11;
                    }
                }
            }
            int i12 = i10 + 1;
            if (z7 || i12 >= 3) {
                sb.append((CharSequence) O6, 0, ((i10 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) O6, 0, i12);
            }
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        }
        sb.append(str);
    }

    public static final /* synthetic */ a h(long j7) {
        return new a(j7);
    }

    public static int l(long j7, long j8) {
        long j9 = j7 ^ j8;
        if (j9 < 0 || (((int) j9) & 1) == 0) {
            return Intrinsics.e(j7, j8);
        }
        int i7 = (((int) j7) & 1) - (((int) j8) & 1);
        return T(j7) ? -i7 : i7;
    }

    public static long m(long j7) {
        if (b.a()) {
            if (M(j7)) {
                long F6 = F(j7);
                if (-4611686018426999999L > F6 || F6 >= 4611686018427000000L) {
                    throw new AssertionError(F(j7) + " ns is out of nanoseconds range");
                }
            } else {
                long F7 = F(j7);
                if (-4611686018427387903L > F7 || F7 >= 4611686018427387904L) {
                    throw new AssertionError(F(j7) + " ms is out of milliseconds range");
                }
                long F8 = F(j7);
                if (-4611686018426L <= F8 && F8 < 4611686018427L) {
                    throw new AssertionError(F(j7) + " ms is denormalized");
                }
            }
        }
        return j7;
    }

    public static boolean n(long j7, Object obj) {
        return (obj instanceof a) && j7 == ((a) obj).a0();
    }

    public static final long o(long j7) {
        return T(j7) ? Z(j7) : j7;
    }

    public static final int p(long j7) {
        if (S(j7)) {
            return 0;
        }
        return (int) (s(j7) % 24);
    }

    public static final long r(long j7) {
        return X(j7, d.f18210v);
    }

    public static final long s(long j7) {
        return X(j7, d.f18209u);
    }

    public static final long u(long j7) {
        return X(j7, d.f18208t);
    }

    public static final long w(long j7) {
        return X(j7, d.f18207s);
    }

    public static final int x(long j7) {
        if (S(j7)) {
            return 0;
        }
        return (int) (u(j7) % 60);
    }

    public static final int z(long j7) {
        if (S(j7)) {
            return 0;
        }
        boolean K6 = K(j7);
        long F6 = F(j7);
        return (int) (K6 ? c.m(F6 % 1000) : F6 % 1000000000);
    }

    public final /* synthetic */ long a0() {
        return this.f18201o;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return j(((a) obj).a0());
    }

    public boolean equals(Object obj) {
        return n(this.f18201o, obj);
    }

    public int hashCode() {
        return G(this.f18201o);
    }

    public int j(long j7) {
        return l(this.f18201o, j7);
    }

    public String toString() {
        return Y(this.f18201o);
    }
}
