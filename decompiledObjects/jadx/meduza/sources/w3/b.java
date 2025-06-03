package w3;

import android.util.SparseArray;
import java.util.Arrays;
import v3.c1;
import v3.f1;
import v3.r1;
import z4.t;

/* loaded from: classes.dex */
public interface b {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f16199a;

        /* renamed from: b, reason: collision with root package name */
        public final r1 f16200b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16201c;

        /* renamed from: d, reason: collision with root package name */
        public final t.b f16202d;

        /* renamed from: e, reason: collision with root package name */
        public final long f16203e;
        public final r1 f;

        /* renamed from: g, reason: collision with root package name */
        public final int f16204g;

        /* renamed from: h, reason: collision with root package name */
        public final t.b f16205h;

        /* renamed from: i, reason: collision with root package name */
        public final long f16206i;

        /* renamed from: j, reason: collision with root package name */
        public final long f16207j;

        public a(long j10, r1 r1Var, int i10, t.b bVar, long j11, r1 r1Var2, int i11, t.b bVar2, long j12, long j13) {
            this.f16199a = j10;
            this.f16200b = r1Var;
            this.f16201c = i10;
            this.f16202d = bVar;
            this.f16203e = j11;
            this.f = r1Var2;
            this.f16204g = i11;
            this.f16205h = bVar2;
            this.f16206i = j12;
            this.f16207j = j13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f16199a == aVar.f16199a && this.f16201c == aVar.f16201c && this.f16203e == aVar.f16203e && this.f16204g == aVar.f16204g && this.f16206i == aVar.f16206i && this.f16207j == aVar.f16207j && x6.b.Q(this.f16200b, aVar.f16200b) && x6.b.Q(this.f16202d, aVar.f16202d) && x6.b.Q(this.f, aVar.f) && x6.b.Q(this.f16205h, aVar.f16205h);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f16199a), this.f16200b, Integer.valueOf(this.f16201c), this.f16202d, Long.valueOf(this.f16203e), this.f, Integer.valueOf(this.f16204g), this.f16205h, Long.valueOf(this.f16206i), Long.valueOf(this.f16207j)});
        }
    }

    /* renamed from: w3.b$b, reason: collision with other inner class name */
    public static final class C0252b {

        /* renamed from: a, reason: collision with root package name */
        public final v5.h f16208a;

        /* renamed from: b, reason: collision with root package name */
        public final SparseArray<a> f16209b;

        public C0252b(v5.h hVar, SparseArray<a> sparseArray) {
            this.f16208a = hVar;
            SparseArray<a> sparseArray2 = new SparseArray<>(hVar.b());
            for (int i10 = 0; i10 < hVar.b(); i10++) {
                int a10 = hVar.a(i10);
                a aVar = sparseArray.get(a10);
                aVar.getClass();
                sparseArray2.append(a10, aVar);
            }
            this.f16209b = sparseArray2;
        }

        public final boolean a(int i10) {
            return this.f16208a.f15905a.get(i10);
        }
    }

    void A();

    void A0();

    @Deprecated
    void B();

    void B0();

    void C();

    void C0();

    @Deprecated
    void D();

    void D0();

    void E();

    void E0();

    void F();

    @Deprecated
    void F0();

    void G();

    void G0();

    void H();

    @Deprecated
    void H0();

    void I();

    void I0();

    void J(f1 f1Var, C0252b c0252b);

    void K();

    void L();

    void M();

    void N();

    void O();

    void P(a aVar, int i10, long j10);

    void Q();

    @Deprecated
    void R();

    void S();

    @Deprecated
    void T();

    void U();

    void V();

    void W();

    void X();

    void Y();

    @Deprecated
    void Z();

    void a(z3.e eVar);

    void a0();

    void b(w5.o oVar);

    void b0();

    void c();

    void c0();

    void d(int i10);

    @Deprecated
    void d0();

    void e();

    void e0(c1 c1Var);

    @Deprecated
    void f();

    void f0();

    void g0(z4.q qVar);

    void h();

    void h0();

    void i0();

    void j0();

    void k0();

    @Deprecated
    void l0();

    void m();

    void m0();

    void n0(a aVar, z4.q qVar);

    @Deprecated
    void o();

    void o0();

    void p0();

    @Deprecated
    void q();

    @Deprecated
    void q0();

    @Deprecated
    void r0();

    void s0();

    void t0();

    void u0();

    void v0();

    void w0();

    @Deprecated
    void x();

    void x0();

    void y();

    void y0();

    @Deprecated
    void z();

    void z0();
}
