package l0;

import android.util.SparseArray;
import d0.AbstractC1163B;
import d0.AbstractC1170I;
import d0.C1164C;
import d0.C1172K;
import d0.C1173L;
import d0.C1177P;
import d0.C1179b;
import d0.C1189l;
import d0.C1193p;
import d0.C1194q;
import d0.C1198u;
import d0.C1200w;
import d0.C1201x;
import d0.InterfaceC1165D;
import f0.C1281b;
import g0.AbstractC1297a;
import java.io.IOException;
import java.util.List;
import k0.C1427o;
import k0.C1429p;
import m0.InterfaceC1659z;
import x0.C2139u;
import x0.InterfaceC2142x;

/* renamed from: l0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1537c {

    /* renamed from: l0.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f16564a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC1170I f16565b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16566c;

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC2142x.b f16567d;

        /* renamed from: e, reason: collision with root package name */
        public final long f16568e;

        /* renamed from: f, reason: collision with root package name */
        public final AbstractC1170I f16569f;

        /* renamed from: g, reason: collision with root package name */
        public final int f16570g;

        /* renamed from: h, reason: collision with root package name */
        public final InterfaceC2142x.b f16571h;

        /* renamed from: i, reason: collision with root package name */
        public final long f16572i;

        /* renamed from: j, reason: collision with root package name */
        public final long f16573j;

        public a(long j7, AbstractC1170I abstractC1170I, int i7, InterfaceC2142x.b bVar, long j8, AbstractC1170I abstractC1170I2, int i8, InterfaceC2142x.b bVar2, long j9, long j10) {
            this.f16564a = j7;
            this.f16565b = abstractC1170I;
            this.f16566c = i7;
            this.f16567d = bVar;
            this.f16568e = j8;
            this.f16569f = abstractC1170I2;
            this.f16570g = i8;
            this.f16571h = bVar2;
            this.f16572i = j9;
            this.f16573j = j10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f16564a == aVar.f16564a && this.f16566c == aVar.f16566c && this.f16568e == aVar.f16568e && this.f16570g == aVar.f16570g && this.f16572i == aVar.f16572i && this.f16573j == aVar.f16573j && W2.k.a(this.f16565b, aVar.f16565b) && W2.k.a(this.f16567d, aVar.f16567d) && W2.k.a(this.f16569f, aVar.f16569f) && W2.k.a(this.f16571h, aVar.f16571h);
        }

        public int hashCode() {
            return W2.k.b(Long.valueOf(this.f16564a), this.f16565b, Integer.valueOf(this.f16566c), this.f16567d, Long.valueOf(this.f16568e), this.f16569f, Integer.valueOf(this.f16570g), this.f16571h, Long.valueOf(this.f16572i), Long.valueOf(this.f16573j));
        }
    }

    /* renamed from: l0.c$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final C1193p f16574a;

        /* renamed from: b, reason: collision with root package name */
        public final SparseArray f16575b;

        public b(C1193p c1193p, SparseArray sparseArray) {
            this.f16574a = c1193p;
            SparseArray sparseArray2 = new SparseArray(c1193p.c());
            for (int i7 = 0; i7 < c1193p.c(); i7++) {
                int b7 = c1193p.b(i7);
                sparseArray2.append(b7, (a) AbstractC1297a.e((a) sparseArray.get(b7)));
            }
            this.f16575b = sparseArray2;
        }

        public boolean a(int i7) {
            return this.f16574a.a(i7);
        }

        public int b(int i7) {
            return this.f16574a.b(i7);
        }

        public a c(int i7) {
            return (a) AbstractC1297a.e((a) this.f16575b.get(i7));
        }

        public int d() {
            return this.f16574a.c();
        }
    }

    void A(a aVar, Exception exc);

    void B(a aVar, C1427o c1427o);

    void C(a aVar, AbstractC1163B abstractC1163B);

    void D(a aVar, String str);

    void E(a aVar, int i7);

    void F(a aVar, C1198u c1198u, int i7);

    void G(a aVar, boolean z7, int i7);

    void H(a aVar, boolean z7, int i7);

    void I(a aVar, String str);

    void J(a aVar, x0.r rVar, C2139u c2139u);

    void K(a aVar, C2139u c2139u);

    void L(a aVar, AbstractC1163B abstractC1163B);

    void M(a aVar, InterfaceC1165D.b bVar);

    void N(a aVar, C2139u c2139u);

    void O(InterfaceC1165D interfaceC1165D, b bVar);

    void P(a aVar);

    void Q(a aVar, String str, long j7);

    void R(a aVar, C1189l c1189l);

    void S(a aVar, int i7);

    void T(a aVar, C1177P c1177p);

    void V(a aVar, C1281b c1281b);

    void W(a aVar, C1194q c1194q, C1429p c1429p);

    void X(a aVar, int i7, long j7, long j8);

    void Y(a aVar);

    void Z(a aVar, int i7);

    void a(a aVar, int i7, long j7);

    void a0(a aVar);

    void b(a aVar);

    void c(a aVar, int i7, boolean z7);

    void c0(a aVar, long j7);

    void d(a aVar, boolean z7);

    void d0(a aVar, Exception exc);

    void e(a aVar, Exception exc);

    void e0(a aVar, C1173L c1173l);

    void f0(a aVar, long j7, int i7);

    void g(a aVar, C1427o c1427o);

    void g0(a aVar, InterfaceC1659z.a aVar2);

    void h(a aVar, int i7, int i8);

    void h0(a aVar, C1194q c1194q, C1429p c1429p);

    void i(a aVar, x0.r rVar, C2139u c2139u);

    void i0(a aVar, boolean z7);

    void j(a aVar, boolean z7);

    void j0(a aVar, int i7, int i8, int i9, float f7);

    void k(a aVar, float f7);

    void k0(a aVar, InterfaceC1165D.e eVar, InterfaceC1165D.e eVar2, int i7);

    void l(a aVar, C1427o c1427o);

    void l0(a aVar, boolean z7);

    void m(a aVar, x0.r rVar, C2139u c2139u, IOException iOException, boolean z7);

    void m0(a aVar, Exception exc);

    void n(a aVar);

    void n0(a aVar, int i7);

    void o(a aVar, C1201x c1201x);

    void o0(a aVar, C1427o c1427o);

    void p(a aVar, C1179b c1179b);

    void q(a aVar, x0.r rVar, C2139u c2139u);

    void q0(a aVar, C1200w c1200w);

    void r(a aVar, C1172K c1172k);

    void r0(a aVar);

    void s(a aVar);

    void s0(a aVar, List list);

    void t(a aVar, Object obj, long j7);

    void t0(a aVar, boolean z7);

    void u(a aVar, String str, long j7);

    void u0(a aVar, int i7, long j7, long j8);

    void v(a aVar, String str, long j7, long j8);

    void v0(a aVar, C1164C c1164c);

    void w(a aVar, InterfaceC1659z.a aVar2);

    void x(a aVar, int i7);

    void y(a aVar, int i7);

    void z(a aVar, String str, long j7, long j8);
}
