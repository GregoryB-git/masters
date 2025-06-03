package a0;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class h implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f5a;

    public h(Handler handler) {
        this.f5a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler = this.f5a;
        runnable.getClass();
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(this.f5a + " is shutting down");
    }
}
