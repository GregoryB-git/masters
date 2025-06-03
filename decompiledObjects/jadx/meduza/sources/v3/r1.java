package v3;

import a5.a;
import android.net.Uri;
import android.util.Pair;
import v3.o0;

/* loaded from: classes.dex */
public abstract class r1 implements g {

    /* renamed from: a, reason: collision with root package name */
    public static final a f15743a = new a();

    public class a extends r1 {
        @Override // v3.r1
        public final int b(Object obj) {
            return -1;
        }

        @Override // v3.r1
        public final b f(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // v3.r1
        public final int h() {
            return 0;
        }

        @Override // v3.r1
        public final Object l(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // v3.r1
        public final c n(int i10, c cVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // v3.r1
        public final int o() {
            return 0;
        }
    }

    public static final class b implements g {

        /* renamed from: p, reason: collision with root package name */
        public static final String f15744p = v5.e0.E(0);

        /* renamed from: q, reason: collision with root package name */
        public static final String f15745q = v5.e0.E(1);

        /* renamed from: r, reason: collision with root package name */
        public static final String f15746r = v5.e0.E(2);

        /* renamed from: s, reason: collision with root package name */
        public static final String f15747s = v5.e0.E(3);
        public static final String t = v5.e0.E(4);

        /* renamed from: a, reason: collision with root package name */
        public Object f15748a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15749b;

        /* renamed from: c, reason: collision with root package name */
        public int f15750c;

        /* renamed from: d, reason: collision with root package name */
        public long f15751d;

        /* renamed from: e, reason: collision with root package name */
        public long f15752e;
        public boolean f;

        /* renamed from: o, reason: collision with root package name */
        public a5.a f15753o = a5.a.f208o;

        static {
            new w3.v(7);
        }

        public final long a(int i10, int i11) {
            a.C0006a a10 = this.f15753o.a(i10);
            if (a10.f228b != -1) {
                return a10.f[i11];
            }
            return -9223372036854775807L;
        }

        public final int b(long j10) {
            a5.a aVar = this.f15753o;
            long j11 = this.f15751d;
            aVar.getClass();
            if (j10 == Long.MIN_VALUE) {
                return -1;
            }
            if (j11 != -9223372036854775807L && j10 >= j11) {
                return -1;
            }
            int i10 = aVar.f218e;
            while (i10 < aVar.f215b) {
                if (aVar.a(i10).f227a == Long.MIN_VALUE || aVar.a(i10).f227a > j10) {
                    a.C0006a a10 = aVar.a(i10);
                    if (a10.f228b == -1 || a10.a(-1) < a10.f228b) {
                        break;
                    }
                }
                i10++;
            }
            if (i10 < aVar.f215b) {
                return i10;
            }
            return -1;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[LOOP:0: B:2:0x0008->B:14:0x0033, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[EDGE_INSN: B:15:0x0036->B:16:0x0036 BREAK  A[LOOP:0: B:2:0x0008->B:14:0x0033], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int c(long r11) {
            /*
                r10 = this;
                a5.a r0 = r10.f15753o
                long r1 = r10.f15751d
                int r3 = r0.f215b
                r4 = 1
                int r3 = r3 - r4
            L8:
                r5 = 0
                if (r3 < 0) goto L36
                r6 = -9223372036854775808
                int r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r8 != 0) goto L12
                goto L30
            L12:
                a5.a$a r8 = r0.a(r3)
                long r8 = r8.f227a
                int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r6 != 0) goto L2a
                r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r6 == 0) goto L2e
                int r6 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
                if (r6 >= 0) goto L30
                goto L2e
            L2a:
                int r6 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r6 >= 0) goto L30
            L2e:
                r6 = r4
                goto L31
            L30:
                r6 = r5
            L31:
                if (r6 == 0) goto L36
                int r3 = r3 + (-1)
                goto L8
            L36:
                r11 = -1
                if (r3 < 0) goto L57
                a5.a$a r12 = r0.a(r3)
                int r0 = r12.f228b
                if (r0 != r11) goto L42
                goto L54
            L42:
                r0 = r5
            L43:
                int r1 = r12.f228b
                if (r0 >= r1) goto L53
                int[] r1 = r12.f231e
                r1 = r1[r0]
                if (r1 == 0) goto L54
                if (r1 != r4) goto L50
                goto L54
            L50:
                int r0 = r0 + 1
                goto L43
            L53:
                r4 = r5
            L54:
                if (r4 == 0) goto L57
                goto L58
            L57:
                r3 = r11
            L58:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: v3.r1.b.c(long):int");
        }

        public final long d(int i10) {
            return this.f15753o.a(i10).f227a;
        }

        public final int e(int i10, int i11) {
            a.C0006a a10 = this.f15753o.a(i10);
            if (a10.f228b != -1) {
                return a10.f231e[i11];
            }
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return v5.e0.a(this.f15748a, bVar.f15748a) && v5.e0.a(this.f15749b, bVar.f15749b) && this.f15750c == bVar.f15750c && this.f15751d == bVar.f15751d && this.f15752e == bVar.f15752e && this.f == bVar.f && v5.e0.a(this.f15753o, bVar.f15753o);
        }

        public final int f(int i10) {
            return this.f15753o.a(i10).a(-1);
        }

        public final boolean g(int i10) {
            return this.f15753o.a(i10).f233p;
        }

        public final void h(Object obj, Object obj2, int i10, long j10, long j11, a5.a aVar, boolean z10) {
            this.f15748a = obj;
            this.f15749b = obj2;
            this.f15750c = i10;
            this.f15751d = j10;
            this.f15752e = j11;
            this.f15753o = aVar;
            this.f = z10;
        }

        public final int hashCode() {
            Object obj = this.f15748a;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f15749b;
            int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f15750c) * 31;
            long j10 = this.f15751d;
            int i10 = (hashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f15752e;
            return this.f15753o.hashCode() + ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
        }
    }

    public static final class c implements g {
        public static final o0 B;
        public static final String C;
        public static final String D;
        public static final String E;
        public static final String F;
        public static final String G;
        public static final String H;
        public static final String I;
        public static final String J;
        public static final String K;
        public static final String L;
        public static final String M;
        public static final String N;
        public static final String O;

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public Object f15756b;

        /* renamed from: d, reason: collision with root package name */
        public Object f15758d;

        /* renamed from: e, reason: collision with root package name */
        public long f15759e;
        public long f;

        /* renamed from: o, reason: collision with root package name */
        public long f15760o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f15761p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f15762q;

        /* renamed from: r, reason: collision with root package name */
        @Deprecated
        public boolean f15763r;

        /* renamed from: s, reason: collision with root package name */
        public o0.e f15764s;
        public boolean t;

        /* renamed from: u, reason: collision with root package name */
        public long f15765u;

        /* renamed from: v, reason: collision with root package name */
        public long f15766v;

        /* renamed from: w, reason: collision with root package name */
        public int f15767w;

        /* renamed from: x, reason: collision with root package name */
        public int f15768x;

        /* renamed from: y, reason: collision with root package name */
        public long f15769y;

        /* renamed from: z, reason: collision with root package name */
        public static final Object f15754z = new Object();
        public static final Object A = new Object();

        /* renamed from: a, reason: collision with root package name */
        public Object f15755a = f15754z;

        /* renamed from: c, reason: collision with root package name */
        public o0 f15757c = B;

        static {
            o0.a aVar = new o0.a();
            aVar.f15539a = "com.google.android.exoplayer2.Timeline";
            aVar.f15540b = Uri.EMPTY;
            B = aVar.a();
            C = v5.e0.E(1);
            D = v5.e0.E(2);
            E = v5.e0.E(3);
            F = v5.e0.E(4);
            G = v5.e0.E(5);
            H = v5.e0.E(6);
            I = v5.e0.E(7);
            J = v5.e0.E(8);
            K = v5.e0.E(9);
            L = v5.e0.E(10);
            M = v5.e0.E(11);
            N = v5.e0.E(12);
            O = v5.e0.E(13);
            new r3.j(10);
        }

        public final boolean a() {
            x6.b.H(this.f15763r == (this.f15764s != null));
            return this.f15764s != null;
        }

        public final void b(Object obj, o0 o0Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, o0.e eVar, long j13, long j14, int i10, int i11, long j15) {
            o0.g gVar;
            this.f15755a = obj;
            this.f15757c = o0Var != null ? o0Var : B;
            this.f15756b = (o0Var == null || (gVar = o0Var.f15535b) == null) ? null : gVar.f15600g;
            this.f15758d = obj2;
            this.f15759e = j10;
            this.f = j11;
            this.f15760o = j12;
            this.f15761p = z10;
            this.f15762q = z11;
            this.f15763r = eVar != null;
            this.f15764s = eVar;
            this.f15765u = j13;
            this.f15766v = j14;
            this.f15767w = i10;
            this.f15768x = i11;
            this.f15769y = j15;
            this.t = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            return v5.e0.a(this.f15755a, cVar.f15755a) && v5.e0.a(this.f15757c, cVar.f15757c) && v5.e0.a(this.f15758d, cVar.f15758d) && v5.e0.a(this.f15764s, cVar.f15764s) && this.f15759e == cVar.f15759e && this.f == cVar.f && this.f15760o == cVar.f15760o && this.f15761p == cVar.f15761p && this.f15762q == cVar.f15762q && this.t == cVar.t && this.f15765u == cVar.f15765u && this.f15766v == cVar.f15766v && this.f15767w == cVar.f15767w && this.f15768x == cVar.f15768x && this.f15769y == cVar.f15769y;
        }

        public final int hashCode() {
            int hashCode = (this.f15757c.hashCode() + ((this.f15755a.hashCode() + 217) * 31)) * 31;
            Object obj = this.f15758d;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            o0.e eVar = this.f15764s;
            int hashCode3 = (hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
            long j10 = this.f15759e;
            int i10 = (hashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f15760o;
            int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f15761p ? 1 : 0)) * 31) + (this.f15762q ? 1 : 0)) * 31) + (this.t ? 1 : 0)) * 31;
            long j13 = this.f15765u;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f15766v;
            int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f15767w) * 31) + this.f15768x) * 31;
            long j15 = this.f15769y;
            return i14 + ((int) (j15 ^ (j15 >>> 32)));
        }
    }

    static {
        v5.e0.E(0);
        v5.e0.E(1);
        v5.e0.E(2);
    }

    public int a(boolean z10) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i10, b bVar, c cVar, int i11, boolean z10) {
        int i12 = f(i10, bVar, false).f15750c;
        if (m(i12, cVar).f15768x != i10) {
            return i10 + 1;
        }
        int e10 = e(i12, i11, z10);
        if (e10 == -1) {
            return -1;
        }
        return m(e10, cVar).f15767w;
    }

    public int e(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == c(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == c(z10) ? a(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        int c10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        if (r1Var.o() != o() || r1Var.h() != h()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i10 = 0; i10 < o(); i10++) {
            if (!m(i10, cVar).equals(r1Var.m(i10, cVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < h(); i11++) {
            if (!f(i11, bVar, true).equals(r1Var.f(i11, bVar2, true))) {
                return false;
            }
        }
        int a10 = a(true);
        if (a10 != r1Var.a(true) || (c10 = c(true)) != r1Var.c(true)) {
            return false;
        }
        while (a10 != c10) {
            int e10 = e(a10, 0, true);
            if (e10 != r1Var.e(a10, 0, true)) {
                return false;
            }
            a10 = e10;
        }
        return true;
    }

    public abstract b f(int i10, b bVar, boolean z10);

    public b g(Object obj, b bVar) {
        return f(b(obj), bVar, true);
    }

    public abstract int h();

    public final int hashCode() {
        int i10;
        c cVar = new c();
        b bVar = new b();
        int o10 = o() + 217;
        int i11 = 0;
        while (true) {
            i10 = o10 * 31;
            if (i11 >= o()) {
                break;
            }
            o10 = i10 + m(i11, cVar).hashCode();
            i11++;
        }
        int h10 = h() + i10;
        for (int i12 = 0; i12 < h(); i12++) {
            h10 = (h10 * 31) + f(i12, bVar, true).hashCode();
        }
        int a10 = a(true);
        while (a10 != -1) {
            h10 = (h10 * 31) + a10;
            a10 = e(a10, 0, true);
        }
        return h10;
    }

    public final Pair<Object, Long> i(c cVar, b bVar, int i10, long j10) {
        Pair<Object, Long> j11 = j(cVar, bVar, i10, j10, 0L);
        j11.getClass();
        return j11;
    }

    public final Pair<Object, Long> j(c cVar, b bVar, int i10, long j10, long j11) {
        x6.b.x(i10, o());
        n(i10, cVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = cVar.f15765u;
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = cVar.f15767w;
        f(i11, bVar, false);
        while (i11 < cVar.f15768x && bVar.f15752e != j10) {
            int i12 = i11 + 1;
            if (f(i12, bVar, false).f15752e > j10) {
                break;
            }
            i11 = i12;
        }
        f(i11, bVar, true);
        long j12 = j10 - bVar.f15752e;
        long j13 = bVar.f15751d;
        if (j13 != -9223372036854775807L) {
            j12 = Math.min(j12, j13 - 1);
        }
        long max = Math.max(0L, j12);
        Object obj = bVar.f15749b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == a(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == a(z10) ? c(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i10);

    public final c m(int i10, c cVar) {
        return n(i10, cVar, 0L);
    }

    public abstract c n(int i10, c cVar, long j10);

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
