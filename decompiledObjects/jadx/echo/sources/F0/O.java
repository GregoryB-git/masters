package F0;

import d0.C1194q;
import g0.AbstractC1297a;
import java.util.List;

/* loaded from: classes.dex */
public final class O implements r {

    /* renamed from: a, reason: collision with root package name */
    public final int f1796a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1797b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1798c;

    /* renamed from: d, reason: collision with root package name */
    public int f1799d;

    /* renamed from: e, reason: collision with root package name */
    public int f1800e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0374t f1801f;

    /* renamed from: g, reason: collision with root package name */
    public T f1802g;

    public O(int i7, int i8, String str) {
        this.f1796a = i7;
        this.f1797b = i8;
        this.f1798c = str;
    }

    @Override // F0.r
    public void a(long j7, long j8) {
        if (j7 == 0 || this.f1800e == 1) {
            this.f1800e = 1;
            this.f1799d = 0;
        }
    }

    @Override // F0.r
    public void b(InterfaceC0374t interfaceC0374t) {
        this.f1801f = interfaceC0374t;
        c(this.f1798c);
    }

    public final void c(String str) {
        T a7 = this.f1801f.a(1024, 4);
        this.f1802g = a7;
        a7.d(new C1194q.b().o0(str).K());
        this.f1801f.j();
        this.f1801f.e(new P(-9223372036854775807L));
        this.f1800e = 1;
    }

    @Override // F0.r
    public /* synthetic */ r d() {
        return AbstractC0372q.b(this);
    }

    @Override // F0.r
    public boolean e(InterfaceC0373s interfaceC0373s) {
        AbstractC1297a.f((this.f1796a == -1 || this.f1797b == -1) ? false : true);
        g0.z zVar = new g0.z(this.f1797b);
        interfaceC0373s.n(zVar.e(), 0, this.f1797b);
        return zVar.M() == this.f1796a;
    }

    public final void f(InterfaceC0373s interfaceC0373s) {
        int f7 = ((T) AbstractC1297a.e(this.f1802g)).f(interfaceC0373s, 1024, true);
        if (f7 != -1) {
            this.f1799d += f7;
            return;
        }
        this.f1800e = 2;
        this.f1802g.b(0L, 1, this.f1799d, 0, null);
        this.f1799d = 0;
    }

    @Override // F0.r
    public /* synthetic */ List g() {
        return AbstractC0372q.a(this);
    }

    @Override // F0.r
    public int i(InterfaceC0373s interfaceC0373s, L l7) {
        int i7 = this.f1800e;
        if (i7 == 1) {
            f(interfaceC0373s);
            return 0;
        }
        if (i7 == 2) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @Override // F0.r
    public void release() {
    }
}
