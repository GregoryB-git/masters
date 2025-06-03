package gb;

import eb.d;
import gb.r1;

/* loaded from: classes.dex */
public final class i1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f6504a;

    public i1(d1 d1Var) {
        this.f6504a = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6504a.f6260j.a(d.a.INFO, "Terminated");
        d1 d1Var = this.f6504a;
        r1.o.a aVar = (r1.o.a) d1Var.f6256e;
        r1.this.B.remove(d1Var);
        eb.c0.b(r1.this.Q.f5057b, d1Var);
        r1.K(r1.this);
    }
}
