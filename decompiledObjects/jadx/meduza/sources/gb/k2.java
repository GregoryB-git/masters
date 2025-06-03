package gb;

import eb.b;
import gb.l;
import gb.t;

/* loaded from: classes.dex */
public final class k2 extends b.a {

    /* renamed from: a, reason: collision with root package name */
    public final u f6563a;

    /* renamed from: b, reason: collision with root package name */
    public final eb.t0<?, ?> f6564b;

    /* renamed from: c, reason: collision with root package name */
    public final eb.s0 f6565c;

    /* renamed from: d, reason: collision with root package name */
    public final eb.c f6566d;
    public final a f;

    /* renamed from: g, reason: collision with root package name */
    public final eb.h[] f6568g;

    /* renamed from: i, reason: collision with root package name */
    public s f6570i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6571j;

    /* renamed from: k, reason: collision with root package name */
    public g0 f6572k;

    /* renamed from: h, reason: collision with root package name */
    public final Object f6569h = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final eb.p f6567e = eb.p.b();

    public interface a {
    }

    public k2(x xVar, eb.t0 t0Var, eb.s0 s0Var, eb.c cVar, l.a.C0101a c0101a, eb.h[] hVarArr) {
        this.f6563a = xVar;
        this.f6564b = t0Var;
        this.f6565c = s0Var;
        this.f6566d = cVar;
        this.f = c0101a;
        this.f6568g = hVarArr;
    }

    @Override // eb.b.a
    public final void a(eb.s0 s0Var) {
        x6.b.I(!this.f6571j, "apply() or fail() already called");
        this.f6565c.d(s0Var);
        eb.p a10 = this.f6567e.a();
        try {
            s d10 = this.f6563a.d(this.f6564b, this.f6565c, this.f6566d, this.f6568g);
            this.f6567e.c(a10);
            c(d10);
        } catch (Throwable th) {
            this.f6567e.c(a10);
            throw th;
        }
    }

    @Override // eb.b.a
    public final void b(eb.e1 e1Var) {
        x6.b.s("Cannot fail with OK status", !e1Var.e());
        x6.b.I(!this.f6571j, "apply() or fail() already called");
        c(new l0(v0.g(e1Var), t.a.PROCESSED, this.f6568g));
    }

    public final void c(s sVar) {
        boolean z10;
        x6.b.I(!this.f6571j, "already finalized");
        this.f6571j = true;
        synchronized (this.f6569h) {
            if (this.f6570i == null) {
                this.f6570i = sVar;
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (!z10) {
            x6.b.I(this.f6572k != null, "delayedStream is null");
            h0 t = this.f6572k.t(sVar);
            if (t != null) {
                t.run();
            }
        }
        ((l.a.C0101a) this.f).a();
    }
}
