package io.flutter.plugins.googlesignin;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class Executors {

    public static final class UiThreadExecutor implements Executor {
        private static final Handler UI_THREAD = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            UI_THREAD.post(runnable);
        }
    }

    private Executors() {
    }

    public static Executor uiThreadExecutor() {
        return new UiThreadExecutor();
    }
}
