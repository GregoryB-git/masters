package m0;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class Z implements Executor {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Handler f17489o;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f17489o.post(runnable);
    }
}
