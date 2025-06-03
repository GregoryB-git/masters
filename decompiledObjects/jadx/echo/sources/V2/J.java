package V2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class J implements Executor {

    /* renamed from: o, reason: collision with root package name */
    public final Handler f6432o = new O2.a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f6432o.post(runnable);
    }
}
