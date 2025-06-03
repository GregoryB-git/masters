package k0;

import d0.AbstractC1170I;
import g0.AbstractC1297a;
import java.io.IOException;
import k0.C1447y0;
import x0.C2124e;
import x0.C2134o;
import x0.InterfaceC2140v;
import x0.InterfaceC2142x;

/* loaded from: classes.dex */
public final class B0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2140v f15507a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15508b;

    /* renamed from: c, reason: collision with root package name */
    public final x0.Q[] f15509c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15510d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15511e;

    /* renamed from: f, reason: collision with root package name */
    public C0 f15512f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15513g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f15514h;

    /* renamed from: i, reason: collision with root package name */
    public final a1[] f15515i;

    /* renamed from: j, reason: collision with root package name */
    public final A0.D f15516j;

    /* renamed from: k, reason: collision with root package name */
    public final T0 f15517k;

    /* renamed from: l, reason: collision with root package name */
    public B0 f15518l;

    /* renamed from: m, reason: collision with root package name */
    public x0.Z f15519m;

    /* renamed from: n, reason: collision with root package name */
    public A0.E f15520n;

    /* renamed from: o, reason: collision with root package name */
    public long f15521o;

    public interface a {
        B0 a(C0 c02, long j7);
    }

    public B0(a1[] a1VarArr, long j7, A0.D d7, B0.b bVar, T0 t02, C0 c02, A0.E e7) {
        this.f15515i = a1VarArr;
        this.f15521o = j7;
        this.f15516j = d7;
        this.f15517k = t02;
        InterfaceC2142x.b bVar2 = c02.f15523a;
        this.f15508b = bVar2.f20848a;
        this.f15512f = c02;
        this.f15519m = x0.Z.f20700d;
        this.f15520n = e7;
        this.f15509c = new x0.Q[a1VarArr.length];
        this.f15514h = new boolean[a1VarArr.length];
        this.f15507a = f(bVar2, t02, bVar, c02.f15524b, c02.f15526d);
    }

    public static InterfaceC2140v f(InterfaceC2142x.b bVar, T0 t02, B0.b bVar2, long j7, long j8) {
        InterfaceC2140v h7 = t02.h(bVar, bVar2, j7);
        return j8 != -9223372036854775807L ? new C2124e(h7, true, 0L, j8) : h7;
    }

    public static void w(T0 t02, InterfaceC2140v interfaceC2140v) {
        try {
            if (interfaceC2140v instanceof C2124e) {
                interfaceC2140v = ((C2124e) interfaceC2140v).f20719o;
            }
            t02.z(interfaceC2140v);
        } catch (RuntimeException e7) {
            g0.o.d("MediaPeriodHolder", "Period release failed.", e7);
        }
    }

    public long A(long j7) {
        return j7 - m();
    }

    public long B(long j7) {
        return j7 + m();
    }

    public void C() {
        InterfaceC2140v interfaceC2140v = this.f15507a;
        if (interfaceC2140v instanceof C2124e) {
            long j7 = this.f15512f.f15526d;
            if (j7 == -9223372036854775807L) {
                j7 = Long.MIN_VALUE;
            }
            ((C2124e) interfaceC2140v).w(0L, j7);
        }
    }

    public long a(A0.E e7, long j7, boolean z7) {
        return b(e7, j7, z7, new boolean[this.f15515i.length]);
    }

    public long b(A0.E e7, long j7, boolean z7, boolean[] zArr) {
        int i7 = 0;
        while (true) {
            boolean z8 = true;
            if (i7 >= e7.f41a) {
                break;
            }
            boolean[] zArr2 = this.f15514h;
            if (z7 || !e7.b(this.f15520n, i7)) {
                z8 = false;
            }
            zArr2[i7] = z8;
            i7++;
        }
        h(this.f15509c);
        g();
        this.f15520n = e7;
        i();
        long i8 = this.f15507a.i(e7.f43c, this.f15514h, this.f15509c, zArr, j7);
        c(this.f15509c);
        this.f15511e = false;
        int i9 = 0;
        while (true) {
            x0.Q[] qArr = this.f15509c;
            if (i9 >= qArr.length) {
                return i8;
            }
            if (qArr[i9] != null) {
                AbstractC1297a.f(e7.c(i9));
                if (this.f15515i[i9].l() != -2) {
                    this.f15511e = true;
                }
            } else {
                AbstractC1297a.f(e7.f43c[i9] == null);
            }
            i9++;
        }
    }

    public final void c(x0.Q[] qArr) {
        int i7 = 0;
        while (true) {
            a1[] a1VarArr = this.f15515i;
            if (i7 >= a1VarArr.length) {
                return;
            }
            if (a1VarArr[i7].l() == -2 && this.f15520n.c(i7)) {
                qArr[i7] = new C2134o();
            }
            i7++;
        }
    }

    public boolean d(C0 c02) {
        if (E0.d(this.f15512f.f15527e, c02.f15527e)) {
            C0 c03 = this.f15512f;
            if (c03.f15524b == c02.f15524b && c03.f15523a.equals(c02.f15523a)) {
                return true;
            }
        }
        return false;
    }

    public void e(long j7, float f7, long j8) {
        AbstractC1297a.f(t());
        this.f15507a.g(new C1447y0.b().f(A(j7)).g(f7).e(j8).d());
    }

    public final void g() {
        if (!t()) {
            return;
        }
        int i7 = 0;
        while (true) {
            A0.E e7 = this.f15520n;
            if (i7 >= e7.f41a) {
                return;
            }
            boolean c7 = e7.c(i7);
            A0.y yVar = this.f15520n.f43c[i7];
            if (c7 && yVar != null) {
                yVar.g();
            }
            i7++;
        }
    }

    public final void h(x0.Q[] qArr) {
        int i7 = 0;
        while (true) {
            a1[] a1VarArr = this.f15515i;
            if (i7 >= a1VarArr.length) {
                return;
            }
            if (a1VarArr[i7].l() == -2) {
                qArr[i7] = null;
            }
            i7++;
        }
    }

    public final void i() {
        if (!t()) {
            return;
        }
        int i7 = 0;
        while (true) {
            A0.E e7 = this.f15520n;
            if (i7 >= e7.f41a) {
                return;
            }
            boolean c7 = e7.c(i7);
            A0.y yVar = this.f15520n.f43c[i7];
            if (c7 && yVar != null) {
                yVar.j();
            }
            i7++;
        }
    }

    public long j() {
        if (!this.f15510d) {
            return this.f15512f.f15524b;
        }
        long f7 = this.f15511e ? this.f15507a.f() : Long.MIN_VALUE;
        return f7 == Long.MIN_VALUE ? this.f15512f.f15527e : f7;
    }

    public B0 k() {
        return this.f15518l;
    }

    public long l() {
        if (this.f15510d) {
            return this.f15507a.c();
        }
        return 0L;
    }

    public long m() {
        return this.f15521o;
    }

    public long n() {
        return this.f15512f.f15524b + this.f15521o;
    }

    public x0.Z o() {
        return this.f15519m;
    }

    public A0.E p() {
        return this.f15520n;
    }

    public void q(float f7, AbstractC1170I abstractC1170I) {
        this.f15510d = true;
        this.f15519m = this.f15507a.n();
        A0.E x7 = x(f7, abstractC1170I);
        C0 c02 = this.f15512f;
        long j7 = c02.f15524b;
        long j8 = c02.f15527e;
        if (j8 != -9223372036854775807L && j7 >= j8) {
            j7 = Math.max(0L, j8 - 1);
        }
        long a7 = a(x7, j7, false);
        long j9 = this.f15521o;
        C0 c03 = this.f15512f;
        this.f15521o = j9 + (c03.f15524b - a7);
        this.f15512f = c03.b(a7);
    }

    public boolean r() {
        try {
            if (this.f15510d) {
                for (x0.Q q7 : this.f15509c) {
                    if (q7 != null) {
                        q7.a();
                    }
                }
            } else {
                this.f15507a.p();
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    public boolean s() {
        return this.f15510d && (!this.f15511e || this.f15507a.f() == Long.MIN_VALUE);
    }

    public final boolean t() {
        return this.f15518l == null;
    }

    public void u(long j7) {
        AbstractC1297a.f(t());
        if (this.f15510d) {
            this.f15507a.h(A(j7));
        }
    }

    public void v() {
        g();
        w(this.f15517k, this.f15507a);
    }

    public A0.E x(float f7, AbstractC1170I abstractC1170I) {
        A0.E k7 = this.f15516j.k(this.f15515i, o(), this.f15512f.f15523a, abstractC1170I);
        for (int i7 = 0; i7 < k7.f41a; i7++) {
            boolean z7 = true;
            if (!k7.c(i7) ? k7.f43c[i7] != null : k7.f43c[i7] == null && this.f15515i[i7].l() != -2) {
                z7 = false;
            }
            AbstractC1297a.f(z7);
        }
        for (A0.y yVar : k7.f43c) {
            if (yVar != null) {
                yVar.r(f7);
            }
        }
        return k7;
    }

    public void y(B0 b02) {
        if (b02 == this.f15518l) {
            return;
        }
        g();
        this.f15518l = b02;
        i();
    }

    public void z(long j7) {
        this.f15521o = j7;
    }
}
