package d0;

import android.net.Uri;
import android.util.Pair;
import d0.C1178a;
import d0.C1198u;
import g0.AbstractC1297a;

/* renamed from: d0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1170I {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC1170I f12388a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final String f12389b = g0.M.w0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final String f12390c = g0.M.w0(1);

    /* renamed from: d, reason: collision with root package name */
    public static final String f12391d = g0.M.w0(2);

    /* renamed from: d0.I$a */
    public class a extends AbstractC1170I {
        @Override // d0.AbstractC1170I
        public int b(Object obj) {
            return -1;
        }

        @Override // d0.AbstractC1170I
        public b g(int i7, b bVar, boolean z7) {
            throw new IndexOutOfBoundsException();
        }

        @Override // d0.AbstractC1170I
        public int i() {
            return 0;
        }

        @Override // d0.AbstractC1170I
        public Object m(int i7) {
            throw new IndexOutOfBoundsException();
        }

        @Override // d0.AbstractC1170I
        public c o(int i7, c cVar, long j7) {
            throw new IndexOutOfBoundsException();
        }

        @Override // d0.AbstractC1170I
        public int p() {
            return 0;
        }
    }

    /* renamed from: d0.I$b */
    public static final class b {

        /* renamed from: h, reason: collision with root package name */
        public static final String f12392h = g0.M.w0(0);

        /* renamed from: i, reason: collision with root package name */
        public static final String f12393i = g0.M.w0(1);

        /* renamed from: j, reason: collision with root package name */
        public static final String f12394j = g0.M.w0(2);

        /* renamed from: k, reason: collision with root package name */
        public static final String f12395k = g0.M.w0(3);

        /* renamed from: l, reason: collision with root package name */
        public static final String f12396l = g0.M.w0(4);

        /* renamed from: a, reason: collision with root package name */
        public Object f12397a;

        /* renamed from: b, reason: collision with root package name */
        public Object f12398b;

        /* renamed from: c, reason: collision with root package name */
        public int f12399c;

        /* renamed from: d, reason: collision with root package name */
        public long f12400d;

        /* renamed from: e, reason: collision with root package name */
        public long f12401e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f12402f;

        /* renamed from: g, reason: collision with root package name */
        public C1178a f12403g = C1178a.f12564g;

        public int a(int i7) {
            return this.f12403g.a(i7).f12586b;
        }

        public long b(int i7, int i8) {
            C1178a.C0186a a7 = this.f12403g.a(i7);
            if (a7.f12586b != -1) {
                return a7.f12591g[i8];
            }
            return -9223372036854775807L;
        }

        public int c() {
            return this.f12403g.f12571b;
        }

        public int d(long j7) {
            return this.f12403g.b(j7, this.f12400d);
        }

        public int e(long j7) {
            return this.f12403g.c(j7, this.f12400d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return g0.M.c(this.f12397a, bVar.f12397a) && g0.M.c(this.f12398b, bVar.f12398b) && this.f12399c == bVar.f12399c && this.f12400d == bVar.f12400d && this.f12401e == bVar.f12401e && this.f12402f == bVar.f12402f && g0.M.c(this.f12403g, bVar.f12403g);
        }

        public long f(int i7) {
            return this.f12403g.a(i7).f12585a;
        }

        public long g() {
            return this.f12403g.f12572c;
        }

        public int h(int i7, int i8) {
            C1178a.C0186a a7 = this.f12403g.a(i7);
            if (a7.f12586b != -1) {
                return a7.f12590f[i8];
            }
            return 0;
        }

        public int hashCode() {
            Object obj = this.f12397a;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f12398b;
            int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f12399c) * 31;
            long j7 = this.f12400d;
            int i7 = (hashCode2 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
            long j8 = this.f12401e;
            return ((((i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (this.f12402f ? 1 : 0)) * 31) + this.f12403g.hashCode();
        }

        public long i(int i7) {
            return this.f12403g.a(i7).f12592h;
        }

        public long j() {
            return this.f12400d;
        }

        public int k(int i7) {
            return this.f12403g.a(i7).d();
        }

        public int l(int i7, int i8) {
            return this.f12403g.a(i7).e(i8);
        }

        public long m() {
            return g0.M.i1(this.f12401e);
        }

        public long n() {
            return this.f12401e;
        }

        public int o() {
            return this.f12403g.f12574e;
        }

        public boolean p(int i7) {
            return !this.f12403g.a(i7).f();
        }

        public boolean q(int i7) {
            return i7 == c() - 1 && this.f12403g.d(i7);
        }

        public boolean r(int i7) {
            return this.f12403g.a(i7).f12593i;
        }

        public b s(Object obj, Object obj2, int i7, long j7, long j8) {
            return t(obj, obj2, i7, j7, j8, C1178a.f12564g, false);
        }

        public b t(Object obj, Object obj2, int i7, long j7, long j8, C1178a c1178a, boolean z7) {
            this.f12397a = obj;
            this.f12398b = obj2;
            this.f12399c = i7;
            this.f12400d = j7;
            this.f12401e = j8;
            this.f12403g = c1178a;
            this.f12402f = z7;
            return this;
        }
    }

    /* renamed from: d0.I$c */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public Object f12421b;

        /* renamed from: d, reason: collision with root package name */
        public Object f12423d;

        /* renamed from: e, reason: collision with root package name */
        public long f12424e;

        /* renamed from: f, reason: collision with root package name */
        public long f12425f;

        /* renamed from: g, reason: collision with root package name */
        public long f12426g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f12427h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f12428i;

        /* renamed from: j, reason: collision with root package name */
        public C1198u.g f12429j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f12430k;

        /* renamed from: l, reason: collision with root package name */
        public long f12431l;

        /* renamed from: m, reason: collision with root package name */
        public long f12432m;

        /* renamed from: n, reason: collision with root package name */
        public int f12433n;

        /* renamed from: o, reason: collision with root package name */
        public int f12434o;

        /* renamed from: p, reason: collision with root package name */
        public long f12435p;

        /* renamed from: q, reason: collision with root package name */
        public static final Object f12410q = new Object();

        /* renamed from: r, reason: collision with root package name */
        public static final Object f12411r = new Object();

        /* renamed from: s, reason: collision with root package name */
        public static final C1198u f12412s = new C1198u.c().b("androidx.media3.common.Timeline").e(Uri.EMPTY).a();

        /* renamed from: t, reason: collision with root package name */
        public static final String f12413t = g0.M.w0(1);

        /* renamed from: u, reason: collision with root package name */
        public static final String f12414u = g0.M.w0(2);

        /* renamed from: v, reason: collision with root package name */
        public static final String f12415v = g0.M.w0(3);

        /* renamed from: w, reason: collision with root package name */
        public static final String f12416w = g0.M.w0(4);

        /* renamed from: x, reason: collision with root package name */
        public static final String f12417x = g0.M.w0(5);

        /* renamed from: y, reason: collision with root package name */
        public static final String f12418y = g0.M.w0(6);

        /* renamed from: z, reason: collision with root package name */
        public static final String f12419z = g0.M.w0(7);

        /* renamed from: A, reason: collision with root package name */
        public static final String f12404A = g0.M.w0(8);

        /* renamed from: B, reason: collision with root package name */
        public static final String f12405B = g0.M.w0(9);

        /* renamed from: C, reason: collision with root package name */
        public static final String f12406C = g0.M.w0(10);

        /* renamed from: D, reason: collision with root package name */
        public static final String f12407D = g0.M.w0(11);

        /* renamed from: E, reason: collision with root package name */
        public static final String f12408E = g0.M.w0(12);

        /* renamed from: F, reason: collision with root package name */
        public static final String f12409F = g0.M.w0(13);

        /* renamed from: a, reason: collision with root package name */
        public Object f12420a = f12410q;

        /* renamed from: c, reason: collision with root package name */
        public C1198u f12422c = f12412s;

        public long a() {
            return g0.M.d0(this.f12426g);
        }

        public long b() {
            return g0.M.i1(this.f12431l);
        }

        public long c() {
            return this.f12431l;
        }

        public long d() {
            return g0.M.i1(this.f12432m);
        }

        public long e() {
            return this.f12435p;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            return g0.M.c(this.f12420a, cVar.f12420a) && g0.M.c(this.f12422c, cVar.f12422c) && g0.M.c(this.f12423d, cVar.f12423d) && g0.M.c(this.f12429j, cVar.f12429j) && this.f12424e == cVar.f12424e && this.f12425f == cVar.f12425f && this.f12426g == cVar.f12426g && this.f12427h == cVar.f12427h && this.f12428i == cVar.f12428i && this.f12430k == cVar.f12430k && this.f12431l == cVar.f12431l && this.f12432m == cVar.f12432m && this.f12433n == cVar.f12433n && this.f12434o == cVar.f12434o && this.f12435p == cVar.f12435p;
        }

        public boolean f() {
            return this.f12429j != null;
        }

        public c g(Object obj, C1198u c1198u, Object obj2, long j7, long j8, long j9, boolean z7, boolean z8, C1198u.g gVar, long j10, long j11, int i7, int i8, long j12) {
            C1198u.h hVar;
            this.f12420a = obj;
            this.f12422c = c1198u != null ? c1198u : f12412s;
            this.f12421b = (c1198u == null || (hVar = c1198u.f12800b) == null) ? null : hVar.f12899h;
            this.f12423d = obj2;
            this.f12424e = j7;
            this.f12425f = j8;
            this.f12426g = j9;
            this.f12427h = z7;
            this.f12428i = z8;
            this.f12429j = gVar;
            this.f12431l = j10;
            this.f12432m = j11;
            this.f12433n = i7;
            this.f12434o = i8;
            this.f12435p = j12;
            this.f12430k = false;
            return this;
        }

        public int hashCode() {
            int hashCode = (((217 + this.f12420a.hashCode()) * 31) + this.f12422c.hashCode()) * 31;
            Object obj = this.f12423d;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            C1198u.g gVar = this.f12429j;
            int hashCode3 = (hashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j7 = this.f12424e;
            int i7 = (hashCode3 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
            long j8 = this.f12425f;
            int i8 = (i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
            long j9 = this.f12426g;
            int i9 = (((((((i8 + ((int) (j9 ^ (j9 >>> 32)))) * 31) + (this.f12427h ? 1 : 0)) * 31) + (this.f12428i ? 1 : 0)) * 31) + (this.f12430k ? 1 : 0)) * 31;
            long j10 = this.f12431l;
            int i10 = (i9 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f12432m;
            int i11 = (((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f12433n) * 31) + this.f12434o) * 31;
            long j12 = this.f12435p;
            return i11 + ((int) (j12 ^ (j12 >>> 32)));
        }
    }

    public int a(boolean z7) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z7) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i7, b bVar, c cVar, int i8, boolean z7) {
        int i9 = f(i7, bVar).f12399c;
        if (n(i9, cVar).f12434o != i7) {
            return i7 + 1;
        }
        int e7 = e(i9, i8, z7);
        if (e7 == -1) {
            return -1;
        }
        return n(e7, cVar).f12433n;
    }

    public int e(int i7, int i8, boolean z7) {
        if (i8 == 0) {
            if (i7 == c(z7)) {
                return -1;
            }
            return i7 + 1;
        }
        if (i8 == 1) {
            return i7;
        }
        if (i8 == 2) {
            return i7 == c(z7) ? a(z7) : i7 + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int c7;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1170I)) {
            return false;
        }
        AbstractC1170I abstractC1170I = (AbstractC1170I) obj;
        if (abstractC1170I.p() != p() || abstractC1170I.i() != i()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i7 = 0; i7 < p(); i7++) {
            if (!n(i7, cVar).equals(abstractC1170I.n(i7, cVar2))) {
                return false;
            }
        }
        for (int i8 = 0; i8 < i(); i8++) {
            if (!g(i8, bVar, true).equals(abstractC1170I.g(i8, bVar2, true))) {
                return false;
            }
        }
        int a7 = a(true);
        if (a7 != abstractC1170I.a(true) || (c7 = c(true)) != abstractC1170I.c(true)) {
            return false;
        }
        while (a7 != c7) {
            int e7 = e(a7, 0, true);
            if (e7 != abstractC1170I.e(a7, 0, true)) {
                return false;
            }
            a7 = e7;
        }
        return true;
    }

    public final b f(int i7, b bVar) {
        return g(i7, bVar, false);
    }

    public abstract b g(int i7, b bVar, boolean z7);

    public b h(Object obj, b bVar) {
        return g(b(obj), bVar, true);
    }

    public int hashCode() {
        int i7;
        c cVar = new c();
        b bVar = new b();
        int p7 = 217 + p();
        int i8 = 0;
        while (true) {
            i7 = p7 * 31;
            if (i8 >= p()) {
                break;
            }
            p7 = i7 + n(i8, cVar).hashCode();
            i8++;
        }
        int i9 = i7 + i();
        for (int i10 = 0; i10 < i(); i10++) {
            i9 = (i9 * 31) + g(i10, bVar, true).hashCode();
        }
        int a7 = a(true);
        while (a7 != -1) {
            i9 = (i9 * 31) + a7;
            a7 = e(a7, 0, true);
        }
        return i9;
    }

    public abstract int i();

    public final Pair j(c cVar, b bVar, int i7, long j7) {
        return (Pair) AbstractC1297a.e(k(cVar, bVar, i7, j7, 0L));
    }

    public final Pair k(c cVar, b bVar, int i7, long j7, long j8) {
        AbstractC1297a.c(i7, 0, p());
        o(i7, cVar, j8);
        if (j7 == -9223372036854775807L) {
            j7 = cVar.c();
            if (j7 == -9223372036854775807L) {
                return null;
            }
        }
        int i8 = cVar.f12433n;
        f(i8, bVar);
        while (i8 < cVar.f12434o && bVar.f12401e != j7) {
            int i9 = i8 + 1;
            if (f(i9, bVar).f12401e > j7) {
                break;
            }
            i8 = i9;
        }
        g(i8, bVar, true);
        long j9 = j7 - bVar.f12401e;
        long j10 = bVar.f12400d;
        if (j10 != -9223372036854775807L) {
            j9 = Math.min(j9, j10 - 1);
        }
        return Pair.create(AbstractC1297a.e(bVar.f12398b), Long.valueOf(Math.max(0L, j9)));
    }

    public int l(int i7, int i8, boolean z7) {
        if (i8 == 0) {
            if (i7 == a(z7)) {
                return -1;
            }
            return i7 - 1;
        }
        if (i8 == 1) {
            return i7;
        }
        if (i8 == 2) {
            return i7 == a(z7) ? c(z7) : i7 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object m(int i7);

    public final c n(int i7, c cVar) {
        return o(i7, cVar, 0L);
    }

    public abstract c o(int i7, c cVar, long j7);

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }

    public final boolean r(int i7, b bVar, c cVar, int i8, boolean z7) {
        return d(i7, bVar, cVar, i8, z7) == -1;
    }
}
