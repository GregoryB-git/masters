package l1;

import F0.InterfaceC0374t;
import F0.T;
import d0.C1194q;
import g0.AbstractC1297a;
import l1.K;

/* loaded from: classes.dex */
public final class x implements D {

    /* renamed from: a, reason: collision with root package name */
    public C1194q f17120a;

    /* renamed from: b, reason: collision with root package name */
    public g0.E f17121b;

    /* renamed from: c, reason: collision with root package name */
    public T f17122c;

    public x(String str) {
        this.f17120a = new C1194q.b().o0(str).K();
    }

    @Override // l1.D
    public void a(g0.z zVar) {
        b();
        long e7 = this.f17121b.e();
        long f7 = this.f17121b.f();
        if (e7 == -9223372036854775807L || f7 == -9223372036854775807L) {
            return;
        }
        C1194q c1194q = this.f17120a;
        if (f7 != c1194q.f12731s) {
            C1194q K6 = c1194q.a().s0(f7).K();
            this.f17120a = K6;
            this.f17122c.d(K6);
        }
        int a7 = zVar.a();
        this.f17122c.e(zVar, a7);
        this.f17122c.b(e7, 1, a7, 0, null);
    }

    public final void b() {
        AbstractC1297a.h(this.f17121b);
        g0.M.i(this.f17122c);
    }

    @Override // l1.D
    public void c(g0.E e7, InterfaceC0374t interfaceC0374t, K.d dVar) {
        this.f17121b = e7;
        dVar.a();
        T a7 = interfaceC0374t.a(dVar.c(), 5);
        this.f17122c = a7;
        a7.d(this.f17120a);
    }
}
