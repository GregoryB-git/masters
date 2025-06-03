/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  android.os.StrictMode$ThreadPolicy$Builder
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.List
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ThreadFactory
 */
package com.google.firebase.concurrent;

import B3.F;
import B3.c;
import B3.e;
import B3.h;
import B3.x;
import C3.B;
import C3.o;
import C3.q;
import C3.r;
import C3.s;
import C3.t;
import C3.u;
import C3.v;
import C3.w;
import C3.y;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import y3.a;
import y3.b;
import y3.c;
import y3.d;

@SuppressLint(value={"ThreadPoolCreation"})
public class ExecutorsRegistrar
implements ComponentRegistrar {
    public static final x a = new x(new r());
    public static final x b = new x(new s());
    public static final x c = new x(new t());
    public static final x d = new x(new u());

    public static /* synthetic */ ScheduledExecutorService a(e e8) {
        return ExecutorsRegistrar.n(e8);
    }

    public static /* synthetic */ ScheduledExecutorService b() {
        return ExecutorsRegistrar.s();
    }

    public static /* synthetic */ ScheduledExecutorService c() {
        return ExecutorsRegistrar.u(Executors.newFixedThreadPool((int)Math.max((int)2, (int)Runtime.getRuntime().availableProcessors()), (ThreadFactory)ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.t())));
    }

    public static /* synthetic */ Executor d(e e8) {
        return ExecutorsRegistrar.o(e8);
    }

    public static /* synthetic */ ScheduledExecutorService e(e e8) {
        return ExecutorsRegistrar.m(e8);
    }

    public static /* synthetic */ ScheduledExecutorService f() {
        return ExecutorsRegistrar.u(Executors.newFixedThreadPool((int)4, (ThreadFactory)ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i())));
    }

    public static /* synthetic */ ScheduledExecutorService g(e e8) {
        return ExecutorsRegistrar.l(e8);
    }

    public static /* synthetic */ ScheduledExecutorService h() {
        return ExecutorsRegistrar.u(Executors.newCachedThreadPool((ThreadFactory)ExecutorsRegistrar.j("Firebase Blocking", 11)));
    }

    public static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder builder = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int n8 = Build.VERSION.SDK_INT;
        builder.detectResourceMismatches();
        if (n8 >= 26) {
            q.a(builder);
        }
        return builder.penaltyLog().build();
    }

    public static ThreadFactory j(String string2, int n8) {
        return new C3.b(string2, n8, null);
    }

    public static ThreadFactory k(String string2, int n8, StrictMode.ThreadPolicy threadPolicy) {
        return new C3.b(string2, n8, threadPolicy);
    }

    public static /* synthetic */ ScheduledExecutorService l(e e8) {
        return (ScheduledExecutorService)a.get();
    }

    public static /* synthetic */ ScheduledExecutorService m(e e8) {
        return (ScheduledExecutorService)c.get();
    }

    public static /* synthetic */ ScheduledExecutorService n(e e8) {
        return (ScheduledExecutorService)b.get();
    }

    public static /* synthetic */ Executor o(e e8) {
        return B.o;
    }

    public static /* synthetic */ ScheduledExecutorService s() {
        return Executors.newSingleThreadScheduledExecutor((ThreadFactory)ExecutorsRegistrar.j("Firebase Scheduler", 0));
    }

    public static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    public static ScheduledExecutorService u(ExecutorService executorService) {
        return new o(executorService, (ScheduledExecutorService)d.get());
    }

    @Override
    public List getComponents() {
        return Arrays.asList((Object[])new B3.c[]{B3.c.d(F.a(a.class, ScheduledExecutorService.class), F.a(a.class, ExecutorService.class), F.a(a.class, Executor.class)).f(new v()).d(), B3.c.d(F.a(b.class, ScheduledExecutorService.class), F.a(b.class, ExecutorService.class), F.a(b.class, Executor.class)).f(new w()).d(), B3.c.d(F.a(c.class, ScheduledExecutorService.class), F.a(c.class, ExecutorService.class), F.a(c.class, Executor.class)).f(new C3.x()).d(), B3.c.c(F.a(d.class, Executor.class)).f(new y()).d()});
    }
}

