package gb;

import eb.h1;

/* loaded from: classes.dex */
public final class h1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eb.e1 f6456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f6457b;

    public h1(d1 d1Var, eb.e1 e1Var) {
        this.f6457b = d1Var;
        this.f6456a = e1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eb.n nVar = this.f6457b.f6273x.f5184a;
        eb.n nVar2 = eb.n.SHUTDOWN;
        if (nVar == nVar2) {
            return;
        }
        d1 d1Var = this.f6457b;
        d1Var.f6274y = this.f6456a;
        h2 h2Var = d1Var.f6272w;
        d1 d1Var2 = this.f6457b;
        x xVar = d1Var2.f6271v;
        d1Var2.f6272w = null;
        d1 d1Var3 = this.f6457b;
        d1Var3.f6271v = null;
        d1.b(d1Var3, nVar2);
        this.f6457b.f6263m.a();
        if (this.f6457b.t.isEmpty()) {
            d1 d1Var4 = this.f6457b;
            d1Var4.f6262l.execute(new i1(d1Var4));
        }
        d1 d1Var5 = this.f6457b;
        d1Var5.f6262l.d();
        h1.c cVar = d1Var5.f6267q;
        if (cVar != null) {
            cVar.a();
            d1Var5.f6267q = null;
            d1Var5.f6265o = null;
        }
        h1.c cVar2 = this.f6457b.f6268r;
        if (cVar2 != null) {
            cVar2.a();
            this.f6457b.f6269s.c(this.f6456a);
            d1 d1Var6 = this.f6457b;
            d1Var6.f6268r = null;
            d1Var6.f6269s = null;
        }
        if (h2Var != null) {
            h2Var.c(this.f6456a);
        }
        if (xVar != null) {
            xVar.c(this.f6456a);
        }
    }
}
