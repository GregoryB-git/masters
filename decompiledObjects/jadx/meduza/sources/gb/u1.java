package gb;

import gb.y;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class u1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f6821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eb.n f6822b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1 f6823c;

    public u1(r1 r1Var, x0.f fVar, eb.n nVar) {
        this.f6823c = r1Var;
        this.f6821a = fVar;
        this.f6822b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r1 r1Var = this.f6823c;
        y yVar = r1Var.f6730s;
        Runnable runnable = this.f6821a;
        Executor executor = r1Var.f6720i;
        eb.n nVar = this.f6822b;
        yVar.getClass();
        x6.b.y(runnable, "callback");
        x6.b.y(executor, "executor");
        x6.b.y(nVar, "source");
        y.a aVar = new y.a(runnable, executor);
        if (yVar.f6900b != nVar) {
            executor.execute(runnable);
        } else {
            yVar.f6899a.add(aVar);
        }
    }
}
