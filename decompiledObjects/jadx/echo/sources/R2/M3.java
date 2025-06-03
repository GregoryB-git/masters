package R2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class M3 implements Executor {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C3 f4898o;

    public M3(C3 c32) {
        this.f4898o = c32;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f4898o.e().D(runnable);
    }
}
