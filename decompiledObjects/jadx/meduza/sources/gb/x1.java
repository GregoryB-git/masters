package gb;

import eb.d;

/* loaded from: classes.dex */
public final class x1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1 f6890a;

    public x1(r1 r1Var) {
        this.f6890a = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6890a.P.a(d.a.INFO, "Entering SHUTDOWN state");
        this.f6890a.f6730s.a(eb.n.SHUTDOWN);
    }
}
