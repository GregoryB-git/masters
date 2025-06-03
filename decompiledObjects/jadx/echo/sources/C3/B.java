package C3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public enum B implements Executor {
    INSTANCE;


    /* renamed from: p, reason: collision with root package name */
    public static final Handler f938p = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f938p.post(runnable);
    }
}
