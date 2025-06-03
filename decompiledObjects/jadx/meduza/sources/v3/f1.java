package v3;

import android.os.Looper;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.List;
import v5.h;

/* loaded from: classes.dex */
public interface f1 {

    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        public final v5.h f15341a;

        /* renamed from: v3.f1$a$a, reason: collision with other inner class name */
        public static final class C0248a {

            /* renamed from: a, reason: collision with root package name */
            public final h.a f15342a = new h.a();

            public final void a(int i10, boolean z10) {
                h.a aVar = this.f15342a;
                if (z10) {
                    aVar.a(i10);
                } else {
                    aVar.getClass();
                }
            }
        }

        static {
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            x6.b.H(!false);
            new v5.h(sparseBooleanArray);
            v5.e0.E(0);
        }

        public a(v5.h hVar) {
            this.f15341a = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f15341a.equals(((a) obj).f15341a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f15341a.hashCode();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final v5.h f15343a;

        public b(v5.h hVar) {
            this.f15343a = hVar;
        }

        public final boolean a(int... iArr) {
            v5.h hVar = this.f15343a;
            hVar.getClass();
            for (int i10 : iArr) {
                if (hVar.f15905a.get(i10)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f15343a.equals(((b) obj).f15343a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f15343a.hashCode();
        }
    }

    public interface c {
        @Deprecated
        void D(boolean z10);

        void F(a aVar);

        void G(int i10, d dVar, d dVar2);

        void I(boolean z10);

        void K(int i10, boolean z10);

        void L(float f);

        void N(int i10);

        void R(p0 p0Var);

        void T(boolean z10);

        void W(int i10, boolean z10);

        void X(n nVar);

        void Y(r1 r1Var, int i10);

        void Z(s1 s1Var);

        void a0(n nVar);

        void b(w5.o oVar);

        @Deprecated
        void b0(int i10, boolean z10);

        void c0(e1 e1Var);

        @Deprecated
        void d(int i10);

        void d0(x3.d dVar);

        void e0(f1 f1Var, b bVar);

        @Deprecated
        void f();

        void j(h5.c cVar);

        void k0(o0 o0Var, int i10);

        void l0(m mVar);

        void m();

        void m0(int i10, int i11);

        void o(boolean z10);

        void p0(boolean z10);

        void q(int i10);

        @Deprecated
        void r(List<h5.a> list);

        void w(p4.a aVar);

        void x(int i10);
    }

    public static final class d implements g {

        /* renamed from: a, reason: collision with root package name */
        public final Object f15344a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15345b;

        /* renamed from: c, reason: collision with root package name */
        public final o0 f15346c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f15347d;

        /* renamed from: e, reason: collision with root package name */
        public final int f15348e;
        public final long f;

        /* renamed from: o, reason: collision with root package name */
        public final long f15349o;

        /* renamed from: p, reason: collision with root package name */
        public final int f15350p;

        /* renamed from: q, reason: collision with root package name */
        public final int f15351q;

        static {
            v5.e0.E(0);
            v5.e0.E(1);
            v5.e0.E(2);
            v5.e0.E(3);
            v5.e0.E(4);
            v5.e0.E(5);
            v5.e0.E(6);
        }

        public d(Object obj, int i10, o0 o0Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f15344a = obj;
            this.f15345b = i10;
            this.f15346c = o0Var;
            this.f15347d = obj2;
            this.f15348e = i11;
            this.f = j10;
            this.f15349o = j11;
            this.f15350p = i12;
            this.f15351q = i13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f15345b == dVar.f15345b && this.f15348e == dVar.f15348e && this.f == dVar.f && this.f15349o == dVar.f15349o && this.f15350p == dVar.f15350p && this.f15351q == dVar.f15351q && x6.b.Q(this.f15344a, dVar.f15344a) && x6.b.Q(this.f15347d, dVar.f15347d) && x6.b.Q(this.f15346c, dVar.f15346c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f15344a, Integer.valueOf(this.f15345b), this.f15346c, this.f15347d, Integer.valueOf(this.f15348e), Long.valueOf(this.f), Long.valueOf(this.f15349o), Integer.valueOf(this.f15350p), Integer.valueOf(this.f15351q)});
        }
    }

    boolean A();

    s1 B();

    boolean C();

    boolean D();

    int E();

    int F();

    boolean G(int i10);

    boolean H();

    int I();

    r1 J();

    Looper K();

    boolean L();

    void M();

    void N();

    void O();

    long P();

    boolean Q();

    void a();

    void b();

    void c(e1 e1Var);

    int d();

    e1 f();

    boolean g();

    long getDuration();

    void h(c cVar);

    long i();

    void j(int i10, long j10);

    boolean k();

    void l();

    o0 m();

    void n(boolean z10);

    @Deprecated
    void o(boolean z10);

    int p();

    void pause();

    boolean q();

    int r();

    void s(c cVar);

    void stop();

    void t();

    void u(int i10);

    c1 v();

    void w(int i10);

    int x();

    long y();

    long z();
}
