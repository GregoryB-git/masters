package m1;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9871a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i10 = this.f9871a;
        runnable.run();
    }
}
