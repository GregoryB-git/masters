package x0;

import android.os.Handler;
import d0.AbstractC1170I;
import d0.C1198u;
import l0.y1;

/* renamed from: x0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2142x {

    /* renamed from: x0.x$a */
    public interface a {
    }

    /* renamed from: x0.x$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Object f20848a;

        /* renamed from: b, reason: collision with root package name */
        public final int f20849b;

        /* renamed from: c, reason: collision with root package name */
        public final int f20850c;

        /* renamed from: d, reason: collision with root package name */
        public final long f20851d;

        /* renamed from: e, reason: collision with root package name */
        public final int f20852e;

        public b(Object obj) {
            this(obj, -1L);
        }

        public b a(Object obj) {
            return this.f20848a.equals(obj) ? this : new b(obj, this.f20849b, this.f20850c, this.f20851d, this.f20852e);
        }

        public boolean b() {
            return this.f20849b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f20848a.equals(bVar.f20848a) && this.f20849b == bVar.f20849b && this.f20850c == bVar.f20850c && this.f20851d == bVar.f20851d && this.f20852e == bVar.f20852e;
        }

        public int hashCode() {
            return ((((((((527 + this.f20848a.hashCode()) * 31) + this.f20849b) * 31) + this.f20850c) * 31) + ((int) this.f20851d)) * 31) + this.f20852e;
        }

        public b(Object obj, int i7, int i8, long j7) {
            this(obj, i7, i8, j7, -1);
        }

        public b(Object obj, int i7, int i8, long j7, int i9) {
            this.f20848a = obj;
            this.f20849b = i7;
            this.f20850c = i8;
            this.f20851d = j7;
            this.f20852e = i9;
        }

        public b(Object obj, long j7) {
            this(obj, -1, -1, j7, -1);
        }

        public b(Object obj, long j7, int i7) {
            this(obj, -1, -1, j7, i7);
        }
    }

    /* renamed from: x0.x$c */
    public interface c {
        void a(InterfaceC2142x interfaceC2142x, AbstractC1170I abstractC1170I);
    }

    C1198u a();

    void c(InterfaceC2117E interfaceC2117E);

    void d(c cVar);

    void e(InterfaceC2140v interfaceC2140v);

    InterfaceC2140v f(b bVar, B0.b bVar2, long j7);

    void g(c cVar, i0.y yVar, y1 y1Var);

    void h();

    boolean i();

    AbstractC1170I j();

    void k(Handler handler, p0.v vVar);

    void l(C1198u c1198u);

    void m(c cVar);

    void n(c cVar);

    void o(p0.v vVar);

    void p(Handler handler, InterfaceC2117E interfaceC2117E);
}
