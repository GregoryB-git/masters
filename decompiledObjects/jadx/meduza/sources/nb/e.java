package nb;

import eb.e1;
import eb.k0;
import eb.l0;
import eb.n;

/* loaded from: classes.dex */
public final class e extends nb.b {

    /* renamed from: o, reason: collision with root package name */
    public static final b f11374o = new b();
    public final a f;

    /* renamed from: g, reason: collision with root package name */
    public final k0.e f11375g;

    /* renamed from: h, reason: collision with root package name */
    public k0.c f11376h;

    /* renamed from: i, reason: collision with root package name */
    public k0 f11377i;

    /* renamed from: j, reason: collision with root package name */
    public k0.c f11378j;

    /* renamed from: k, reason: collision with root package name */
    public k0 f11379k;

    /* renamed from: l, reason: collision with root package name */
    public n f11380l;

    /* renamed from: m, reason: collision with root package name */
    public k0.j f11381m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11382n;

    public class a extends k0 {
        public a() {
        }

        @Override // eb.k0
        public final void c(e1 e1Var) {
            e.this.f11375g.f(n.TRANSIENT_FAILURE, new k0.d(k0.f.a(e1Var)));
        }

        @Override // eb.k0
        public final void d(k0.h hVar) {
            throw new IllegalStateException("GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses");
        }

        @Override // eb.k0
        public final void f() {
        }
    }

    public class b extends k0.j {
        @Override // eb.k0.j
        public final k0.f a(k0.g gVar) {
            return k0.f.f5160e;
        }

        public final String toString() {
            return "BUFFER_PICKER";
        }
    }

    public e(c cVar) {
        a aVar = new a();
        this.f = aVar;
        this.f11377i = aVar;
        this.f11379k = aVar;
        this.f11375g = cVar;
    }

    @Override // eb.k0
    public final void f() {
        this.f11379k.f();
        this.f11377i.f();
    }

    @Override // nb.b
    public final k0 g() {
        k0 k0Var = this.f11379k;
        return k0Var == this.f ? this.f11377i : k0Var;
    }

    public final void h() {
        this.f11375g.f(this.f11380l, this.f11381m);
        this.f11377i.f();
        this.f11377i = this.f11379k;
        this.f11376h = this.f11378j;
        this.f11379k = this.f;
        this.f11378j = null;
    }

    public final void i(l0 l0Var) {
        x6.b.y(l0Var, "newBalancerFactory");
        if (l0Var.equals(this.f11378j)) {
            return;
        }
        this.f11379k.f();
        this.f11379k = this.f;
        this.f11378j = null;
        this.f11380l = n.CONNECTING;
        this.f11381m = f11374o;
        if (l0Var.equals(this.f11376h)) {
            return;
        }
        f fVar = new f(this);
        k0 a10 = l0Var.a(fVar);
        fVar.f11383a = a10;
        this.f11379k = a10;
        this.f11378j = l0Var;
        if (this.f11382n) {
            return;
        }
        h();
    }
}
