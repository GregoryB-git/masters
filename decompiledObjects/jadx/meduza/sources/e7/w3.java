package e7;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class w3 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k3 f4733a;

    public w3(k3 k3Var) {
        this.f4733a = k3Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f4733a.zzl().u(runnable);
    }
}
