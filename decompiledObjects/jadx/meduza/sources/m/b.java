package m;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9849a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f9849a) {
            case 0:
                c.v().f9852b.f9854c.execute(runnable);
                break;
            case 1:
            default:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
        }
    }
}
