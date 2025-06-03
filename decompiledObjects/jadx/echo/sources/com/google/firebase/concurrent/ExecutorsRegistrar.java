package com.google.firebase.concurrent;

import B3.C0342c;
import B3.F;
import B3.InterfaceC0344e;
import B3.h;
import B3.x;
import C3.B;
import C3.ThreadFactoryC0348b;
import C3.o;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import r4.InterfaceC1922b;
import y3.InterfaceC2271a;
import y3.InterfaceC2272b;
import y3.InterfaceC2273c;
import y3.InterfaceC2274d;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final x f11573a = new x(new InterfaceC1922b() { // from class: C3.r
        @Override // r4.InterfaceC1922b
        public final Object get() {
            ScheduledExecutorService p7;
            p7 = ExecutorsRegistrar.p();
            return p7;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    public static final x f11574b = new x(new InterfaceC1922b() { // from class: C3.s
        @Override // r4.InterfaceC1922b
        public final Object get() {
            ScheduledExecutorService q7;
            q7 = ExecutorsRegistrar.q();
            return q7;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    public static final x f11575c = new x(new InterfaceC1922b() { // from class: C3.t
        @Override // r4.InterfaceC1922b
        public final Object get() {
            ScheduledExecutorService r7;
            r7 = ExecutorsRegistrar.r();
            return r7;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    public static final x f11576d = new x(new InterfaceC1922b() { // from class: C3.u
        @Override // r4.InterfaceC1922b
        public final Object get() {
            ScheduledExecutorService s7;
            s7 = ExecutorsRegistrar.s();
            return s7;
        }
    });

    public static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i7 = Build.VERSION.SDK_INT;
        detectNetwork.detectResourceMismatches();
        if (i7 >= 26) {
            detectNetwork.detectUnbufferedIo();
        }
        return detectNetwork.penaltyLog().build();
    }

    public static ThreadFactory j(String str, int i7) {
        return new ThreadFactoryC0348b(str, i7, null);
    }

    public static ThreadFactory k(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        return new ThreadFactoryC0348b(str, i7, threadPolicy);
    }

    public static /* synthetic */ ScheduledExecutorService l(InterfaceC0344e interfaceC0344e) {
        return (ScheduledExecutorService) f11573a.get();
    }

    public static /* synthetic */ ScheduledExecutorService m(InterfaceC0344e interfaceC0344e) {
        return (ScheduledExecutorService) f11575c.get();
    }

    public static /* synthetic */ ScheduledExecutorService n(InterfaceC0344e interfaceC0344e) {
        return (ScheduledExecutorService) f11574b.get();
    }

    public static /* synthetic */ Executor o(InterfaceC0344e interfaceC0344e) {
        return B.INSTANCE;
    }

    public static /* synthetic */ ScheduledExecutorService p() {
        return u(Executors.newFixedThreadPool(4, k("Firebase Background", 10, i())));
    }

    public static /* synthetic */ ScheduledExecutorService q() {
        return u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), k("Firebase Lite", 0, t())));
    }

    public static /* synthetic */ ScheduledExecutorService r() {
        return u(Executors.newCachedThreadPool(j("Firebase Blocking", 11)));
    }

    public static /* synthetic */ ScheduledExecutorService s() {
        return Executors.newSingleThreadScheduledExecutor(j("Firebase Scheduler", 0));
    }

    public static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    public static ScheduledExecutorService u(ExecutorService executorService) {
        return new o(executorService, (ScheduledExecutorService) f11576d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C0342c.d(F.a(InterfaceC2271a.class, ScheduledExecutorService.class), F.a(InterfaceC2271a.class, ExecutorService.class), F.a(InterfaceC2271a.class, Executor.class)).f(new h() { // from class: C3.v
            @Override // B3.h
            public final Object a(InterfaceC0344e interfaceC0344e) {
                ScheduledExecutorService l7;
                l7 = ExecutorsRegistrar.l(interfaceC0344e);
                return l7;
            }
        }).d(), C0342c.d(F.a(InterfaceC2272b.class, ScheduledExecutorService.class), F.a(InterfaceC2272b.class, ExecutorService.class), F.a(InterfaceC2272b.class, Executor.class)).f(new h() { // from class: C3.w
            @Override // B3.h
            public final Object a(InterfaceC0344e interfaceC0344e) {
                ScheduledExecutorService m7;
                m7 = ExecutorsRegistrar.m(interfaceC0344e);
                return m7;
            }
        }).d(), C0342c.d(F.a(InterfaceC2273c.class, ScheduledExecutorService.class), F.a(InterfaceC2273c.class, ExecutorService.class), F.a(InterfaceC2273c.class, Executor.class)).f(new h() { // from class: C3.x
            @Override // B3.h
            public final Object a(InterfaceC0344e interfaceC0344e) {
                ScheduledExecutorService n7;
                n7 = ExecutorsRegistrar.n(interfaceC0344e);
                return n7;
            }
        }).d(), C0342c.c(F.a(InterfaceC2274d.class, Executor.class)).f(new h() { // from class: C3.y
            @Override // B3.h
            public final Object a(InterfaceC0344e interfaceC0344e) {
                Executor o7;
                o7 = ExecutorsRegistrar.o(interfaceC0344e);
                return o7;
            }
        }).d());
    }
}
