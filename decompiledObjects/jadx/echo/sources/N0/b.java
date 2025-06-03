package N0;

import F0.AbstractC0372q;
import F0.InterfaceC0373s;
import F0.InterfaceC0374t;
import F0.L;
import F0.M;
import F0.r;
import Z0.m;
import c1.t;
import d0.C1194q;
import d0.C1201x;
import g0.AbstractC1297a;
import g0.z;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements r {

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0374t f3582b;

    /* renamed from: c, reason: collision with root package name */
    public int f3583c;

    /* renamed from: d, reason: collision with root package name */
    public int f3584d;

    /* renamed from: e, reason: collision with root package name */
    public int f3585e;

    /* renamed from: g, reason: collision with root package name */
    public U0.a f3587g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0373s f3588h;

    /* renamed from: i, reason: collision with root package name */
    public d f3589i;

    /* renamed from: j, reason: collision with root package name */
    public m f3590j;

    /* renamed from: a, reason: collision with root package name */
    public final z f3581a = new z(6);

    /* renamed from: f, reason: collision with root package name */
    public long f3586f = -1;

    public static U0.a h(String str, long j7) {
        c a7;
        if (j7 == -1 || (a7 = f.a(str)) == null) {
            return null;
        }
        return a7.a(j7);
    }

    private void m(InterfaceC0373s interfaceC0373s) {
        String A7;
        if (this.f3584d == 65505) {
            z zVar = new z(this.f3585e);
            interfaceC0373s.readFully(zVar.e(), 0, this.f3585e);
            if (this.f3587g == null && "http://ns.adobe.com/xap/1.0/".equals(zVar.A()) && (A7 = zVar.A()) != null) {
                U0.a h7 = h(A7, interfaceC0373s.a());
                this.f3587g = h7;
                if (h7 != null) {
                    this.f3586f = h7.f6306r;
                }
            }
        } else {
            interfaceC0373s.i(this.f3585e);
        }
        this.f3583c = 0;
    }

    @Override // F0.r
    public void a(long j7, long j8) {
        if (j7 == 0) {
            this.f3583c = 0;
            this.f3590j = null;
        } else if (this.f3583c == 5) {
            ((m) AbstractC1297a.e(this.f3590j)).a(j7, j8);
        }
    }

    @Override // F0.r
    public void b(InterfaceC0374t interfaceC0374t) {
        this.f3582b = interfaceC0374t;
    }

    public final void c(InterfaceC0373s interfaceC0373s) {
        this.f3581a.P(2);
        interfaceC0373s.n(this.f3581a.e(), 0, 2);
        interfaceC0373s.o(this.f3581a.M() - 2);
    }

    @Override // F0.r
    public /* synthetic */ r d() {
        return AbstractC0372q.b(this);
    }

    @Override // F0.r
    public boolean e(InterfaceC0373s interfaceC0373s) {
        if (k(interfaceC0373s) != 65496) {
            return false;
        }
        int k7 = k(interfaceC0373s);
        this.f3584d = k7;
        if (k7 == 65504) {
            c(interfaceC0373s);
            this.f3584d = k(interfaceC0373s);
        }
        if (this.f3584d != 65505) {
            return false;
        }
        interfaceC0373s.o(2);
        this.f3581a.P(6);
        interfaceC0373s.n(this.f3581a.e(), 0, 6);
        return this.f3581a.I() == 1165519206 && this.f3581a.M() == 0;
    }

    public final void f() {
        ((InterfaceC0374t) AbstractC1297a.e(this.f3582b)).j();
        this.f3582b.e(new M.b(-9223372036854775807L));
        this.f3583c = 6;
    }

    @Override // F0.r
    public /* synthetic */ List g() {
        return AbstractC0372q.a(this);
    }

    @Override // F0.r
    public int i(InterfaceC0373s interfaceC0373s, L l7) {
        int i7 = this.f3583c;
        if (i7 == 0) {
            l(interfaceC0373s);
            return 0;
        }
        if (i7 == 1) {
            n(interfaceC0373s);
            return 0;
        }
        if (i7 == 2) {
            m(interfaceC0373s);
            return 0;
        }
        if (i7 == 4) {
            long p7 = interfaceC0373s.p();
            long j7 = this.f3586f;
            if (p7 != j7) {
                l7.f1788a = j7;
                return 1;
            }
            o(interfaceC0373s);
            return 0;
        }
        if (i7 != 5) {
            if (i7 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f3589i == null || interfaceC0373s != this.f3588h) {
            this.f3588h = interfaceC0373s;
            this.f3589i = new d(interfaceC0373s, this.f3586f);
        }
        int i8 = ((m) AbstractC1297a.e(this.f3590j)).i(this.f3589i, l7);
        if (i8 == 1) {
            l7.f1788a += this.f3586f;
        }
        return i8;
    }

    public final void j(U0.a aVar) {
        ((InterfaceC0374t) AbstractC1297a.e(this.f3582b)).a(1024, 4).d(new C1194q.b().Q("image/jpeg").h0(new C1201x(aVar)).K());
    }

    public final int k(InterfaceC0373s interfaceC0373s) {
        this.f3581a.P(2);
        interfaceC0373s.n(this.f3581a.e(), 0, 2);
        return this.f3581a.M();
    }

    public final void l(InterfaceC0373s interfaceC0373s) {
        int i7;
        this.f3581a.P(2);
        interfaceC0373s.readFully(this.f3581a.e(), 0, 2);
        int M6 = this.f3581a.M();
        this.f3584d = M6;
        if (M6 == 65498) {
            if (this.f3586f == -1) {
                f();
                return;
            }
            i7 = 4;
        } else if ((M6 >= 65488 && M6 <= 65497) || M6 == 65281) {
            return;
        } else {
            i7 = 1;
        }
        this.f3583c = i7;
    }

    public final void n(InterfaceC0373s interfaceC0373s) {
        this.f3581a.P(2);
        interfaceC0373s.readFully(this.f3581a.e(), 0, 2);
        this.f3585e = this.f3581a.M() - 2;
        this.f3583c = 2;
    }

    public final void o(InterfaceC0373s interfaceC0373s) {
        if (interfaceC0373s.l(this.f3581a.e(), 0, 1, true)) {
            interfaceC0373s.h();
            if (this.f3590j == null) {
                this.f3590j = new m(t.a.f10046a, 8);
            }
            d dVar = new d(interfaceC0373s, this.f3586f);
            this.f3589i = dVar;
            if (this.f3590j.e(dVar)) {
                this.f3590j.b(new e(this.f3586f, (InterfaceC0374t) AbstractC1297a.e(this.f3582b)));
                p();
                return;
            }
        }
        f();
    }

    public final void p() {
        j((U0.a) AbstractC1297a.e(this.f3587g));
        this.f3583c = 5;
    }

    @Override // F0.r
    public void release() {
        m mVar = this.f3590j;
        if (mVar != null) {
            mVar.release();
        }
    }
}
