package d0;

import d0.C1193p;
import f0.C1281b;
import java.util.List;

/* renamed from: d0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1165D {

    /* renamed from: d0.D$b */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f12359b = new a().e();

        /* renamed from: c, reason: collision with root package name */
        public static final String f12360c = g0.M.w0(0);

        /* renamed from: a, reason: collision with root package name */
        public final C1193p f12361a;

        /* renamed from: d0.D$b$a */
        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            public static final int[] f12362b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};

            /* renamed from: a, reason: collision with root package name */
            public final C1193p.b f12363a = new C1193p.b();

            public a a(int i7) {
                this.f12363a.a(i7);
                return this;
            }

            public a b(b bVar) {
                this.f12363a.b(bVar.f12361a);
                return this;
            }

            public a c(int... iArr) {
                this.f12363a.c(iArr);
                return this;
            }

            public a d(int i7, boolean z7) {
                this.f12363a.d(i7, z7);
                return this;
            }

            public b e() {
                return new b(this.f12363a.e());
            }
        }

        public b(C1193p c1193p) {
            this.f12361a = c1193p;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f12361a.equals(((b) obj).f12361a);
            }
            return false;
        }

        public int hashCode() {
            return this.f12361a.hashCode();
        }
    }

    /* renamed from: d0.D$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final C1193p f12364a;

        public c(C1193p c1193p) {
            this.f12364a = c1193p;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f12364a.equals(((c) obj).f12364a);
            }
            return false;
        }

        public int hashCode() {
            return this.f12364a.hashCode();
        }
    }

    /* renamed from: d0.D$d */
    public interface d {
        void B(int i7);

        void C(boolean z7, int i7);

        void D(C1172K c1172k);

        void E(AbstractC1163B abstractC1163B);

        void F(C1179b c1179b);

        void G(boolean z7);

        void H(int i7);

        void I(C1200w c1200w);

        void J(C1173L c1173l);

        void O(C1198u c1198u, int i7);

        void P(AbstractC1170I abstractC1170I, int i7);

        void Q(boolean z7);

        void R();

        void U(float f7);

        void V(C1189l c1189l);

        void X(int i7);

        void Y(boolean z7, int i7);

        void b(C1177P c1177p);

        void c(boolean z7);

        void e0(AbstractC1163B abstractC1163B);

        void h0(boolean z7);

        void i0(int i7, int i8);

        void j(C1164C c1164c);

        void j0(b bVar);

        void k(List list);

        void k0(e eVar, e eVar2, int i7);

        void m(int i7);

        void n0(InterfaceC1165D interfaceC1165D, c cVar);

        void q0(int i7, boolean z7);

        void r(C1281b c1281b);

        void r0(boolean z7);

        void x(C1201x c1201x);
    }

    /* renamed from: d0.D$e */
    public static final class e {

        /* renamed from: k, reason: collision with root package name */
        public static final String f12365k = g0.M.w0(0);

        /* renamed from: l, reason: collision with root package name */
        public static final String f12366l = g0.M.w0(1);

        /* renamed from: m, reason: collision with root package name */
        public static final String f12367m = g0.M.w0(2);

        /* renamed from: n, reason: collision with root package name */
        public static final String f12368n = g0.M.w0(3);

        /* renamed from: o, reason: collision with root package name */
        public static final String f12369o = g0.M.w0(4);

        /* renamed from: p, reason: collision with root package name */
        public static final String f12370p = g0.M.w0(5);

        /* renamed from: q, reason: collision with root package name */
        public static final String f12371q = g0.M.w0(6);

        /* renamed from: a, reason: collision with root package name */
        public final Object f12372a;

        /* renamed from: b, reason: collision with root package name */
        public final int f12373b;

        /* renamed from: c, reason: collision with root package name */
        public final int f12374c;

        /* renamed from: d, reason: collision with root package name */
        public final C1198u f12375d;

        /* renamed from: e, reason: collision with root package name */
        public final Object f12376e;

        /* renamed from: f, reason: collision with root package name */
        public final int f12377f;

        /* renamed from: g, reason: collision with root package name */
        public final long f12378g;

        /* renamed from: h, reason: collision with root package name */
        public final long f12379h;

        /* renamed from: i, reason: collision with root package name */
        public final int f12380i;

        /* renamed from: j, reason: collision with root package name */
        public final int f12381j;

        public e(Object obj, int i7, C1198u c1198u, Object obj2, int i8, long j7, long j8, int i9, int i10) {
            this.f12372a = obj;
            this.f12373b = i7;
            this.f12374c = i7;
            this.f12375d = c1198u;
            this.f12376e = obj2;
            this.f12377f = i8;
            this.f12378g = j7;
            this.f12379h = j8;
            this.f12380i = i9;
            this.f12381j = i10;
        }

        public boolean a(e eVar) {
            return this.f12374c == eVar.f12374c && this.f12377f == eVar.f12377f && this.f12378g == eVar.f12378g && this.f12379h == eVar.f12379h && this.f12380i == eVar.f12380i && this.f12381j == eVar.f12381j && W2.k.a(this.f12375d, eVar.f12375d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return a(eVar) && W2.k.a(this.f12372a, eVar.f12372a) && W2.k.a(this.f12376e, eVar.f12376e);
        }

        public int hashCode() {
            return W2.k.b(this.f12372a, Integer.valueOf(this.f12374c), this.f12375d, this.f12376e, Integer.valueOf(this.f12377f), Long.valueOf(this.f12378g), Long.valueOf(this.f12379h), Integer.valueOf(this.f12380i), Integer.valueOf(this.f12381j));
        }
    }

    void A(C1179b c1179b, boolean z7);

    boolean B();

    int C();

    int D();

    int E();

    void F(C1172K c1172k);

    boolean G();

    int H();

    boolean I();

    int J();

    long K();

    AbstractC1170I L();

    int M();

    boolean N();

    C1172K O();

    long P();

    boolean Q();

    int f();

    void g();

    C1164C h();

    void i(int i7);

    void k(C1164C c1164c);

    void l(float f7);

    AbstractC1163B m();

    void n(boolean z7);

    boolean o();

    long p();

    int q();

    long r();

    void s(int i7, long j7);

    void stop();

    long t();

    boolean u();

    void v(d dVar);

    boolean w();

    void x(boolean z7);

    void y();

    C1173L z();
}
