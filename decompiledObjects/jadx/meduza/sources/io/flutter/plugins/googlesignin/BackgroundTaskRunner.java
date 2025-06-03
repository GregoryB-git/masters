package io.flutter.plugins.googlesignin;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s7.a;

/* loaded from: classes.dex */
public final class BackgroundTaskRunner {
    private final ThreadPoolExecutor executor;

    public interface Callback<T> {
        void run(Future<T> future);
    }

    public BackgroundTaskRunner(int i10) {
        this.executor = new ThreadPoolExecutor(i10, i10, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$runInBackground$1(s7.f fVar, Callable callable) {
        if (fVar.f14237a instanceof a.b) {
            return;
        }
        try {
            Object call = callable.call();
            if (call == null) {
                call = s7.a.f14236o;
            }
            if (s7.a.f.b(fVar, null, call)) {
                s7.a.d(fVar);
            }
        } catch (Throwable th) {
            if (s7.a.f.b(fVar, null, new a.c(th))) {
                s7.a.d(fVar);
            }
        }
    }

    public <T> s7.e<T> runInBackground(Callable<T> callable) {
        s7.f fVar = new s7.f();
        this.executor.execute(new io.flutter.plugins.firebase.messaging.f(1, fVar, callable));
        return fVar;
    }

    public <T> void runInBackground(Callable<T> callable, Callback<T> callback) {
        s7.e<T> runInBackground = runInBackground(callable);
        runInBackground.f(new a(0, callback, runInBackground), Executors.uiThreadExecutor());
    }
}
