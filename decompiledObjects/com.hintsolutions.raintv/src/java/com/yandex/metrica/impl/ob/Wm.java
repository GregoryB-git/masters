/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.core.api.executors.IHandlerExecutor
 *  com.yandex.metrica.impl.ob.xm
 *  com.yandex.metrica.impl.ob.zm
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.Callable
 *  java.util.concurrent.Future
 *  java.util.concurrent.FutureTask
 *  java.util.concurrent.TimeUnit
 */
package com.yandex.metrica.impl.ob;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.core.api.executors.IHandlerExecutor;
import com.yandex.metrica.impl.ob.xm;
import com.yandex.metrica.impl.ob.zm;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class wm
implements IHandlerExecutor {
    @NonNull
    private final Looper a;
    @NonNull
    private final Handler b;
    @NonNull
    private final xm c;

    @VisibleForTesting
    public wm(@NonNull xm xm2) {
        this(xm2, xm2.getLooper(), new Handler(xm2.getLooper()));
    }

    @VisibleForTesting
    public wm(@NonNull xm xm2, @NonNull Looper looper, @NonNull Handler handler) {
        this.c = xm2;
        this.a = looper;
        this.b = handler;
    }

    public wm(@NonNull String string) {
        this(wm.a(string));
    }

    private static xm a(@NonNull String string) {
        string = new zm(string).b();
        string.start();
        return string;
    }

    public void execute(@NonNull Runnable runnable) {
        this.b.post(runnable);
    }

    public void executeDelayed(@NonNull Runnable runnable, long l2) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.b.postDelayed(runnable, timeUnit.toMillis(l2));
    }

    public void executeDelayed(@NonNull Runnable runnable, long l2, @NonNull TimeUnit timeUnit) {
        this.b.postDelayed(runnable, timeUnit.toMillis(l2));
    }

    @NonNull
    public Handler getHandler() {
        return this.b;
    }

    @NonNull
    public Looper getLooper() {
        return this.a;
    }

    public boolean isRunning() {
        return this.c.isRunning();
    }

    public void remove(@NonNull Runnable runnable) {
        this.b.removeCallbacks(runnable);
    }

    public void removeAll() {
        this.b.removeCallbacksAndMessages(null);
    }

    public void stopRunning() {
        this.c.stopRunning();
    }

    public <T> Future<T> submit(Callable<T> futureTask) {
        futureTask = new FutureTask(futureTask);
        this.b.post((Runnable)futureTask);
        return futureTask;
    }
}

