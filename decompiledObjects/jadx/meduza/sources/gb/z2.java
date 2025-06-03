package gb;

import gb.y2;
import java.util.Collection;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class z2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Collection f6996a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y2.a0 f6997b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Future f6998c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Future f6999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y2 f7000e;

    public z2(y2 y2Var, Collection collection, y2.a0 a0Var, Future future, Future future2) {
        this.f7000e = y2Var;
        this.f6996a = collection;
        this.f6997b = a0Var;
        this.f6998c = future;
        this.f6999d = future2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (y2.a0 a0Var : this.f6996a) {
            if (a0Var != this.f6997b) {
                a0Var.f6932a.n(y2.C);
            }
        }
        Future future = this.f6998c;
        if (future != null) {
            future.cancel(false);
        }
        Future future2 = this.f6999d;
        if (future2 != null) {
            future2.cancel(false);
        }
        this.f7000e.x();
    }
}
