package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import d8.b;
import d8.g;
import d8.o;
import d8.r;
import d8.t;
import d9.p;
import d9.q;
import e8.f;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import t9.b;
import y7.a;
import y7.c;
import y7.d;

/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final o<ScheduledExecutorService> f3110a = new o<>(new b() { // from class: e8.h
        @Override // t9.b
        public final Object get() {
            o<ScheduledExecutorService> oVar = ExecutorsRegistrar.f3110a;
            StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
            int i10 = Build.VERSION.SDK_INT;
            detectNetwork.detectResourceMismatches();
            if (i10 >= 26) {
                detectNetwork.detectUnbufferedIo();
            }
            return ExecutorsRegistrar.a(Executors.newFixedThreadPool(4, new a("Firebase Background", 10, detectNetwork.penaltyLog().build())));
        }
    });

    /* renamed from: b, reason: collision with root package name */
    public static final o<ScheduledExecutorService> f3111b = new o<>(new b() { // from class: e8.i
        @Override // t9.b
        public final Object get() {
            o<ScheduledExecutorService> oVar = ExecutorsRegistrar.f3110a;
            return ExecutorsRegistrar.a(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())));
        }
    });

    /* renamed from: c, reason: collision with root package name */
    public static final o<ScheduledExecutorService> f3112c = new o<>(new g(1));

    /* renamed from: d, reason: collision with root package name */
    public static final o<ScheduledExecutorService> f3113d = new o<>(new r(1));

    public static f a(ExecutorService executorService) {
        return new f(executorService, f3113d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<d8.b<?>> getComponents() {
        d8.b[] bVarArr = new d8.b[4];
        t tVar = new t(a.class, ScheduledExecutorService.class);
        int i10 = 0;
        t[] tVarArr = {new t(a.class, ExecutorService.class), new t(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(tVar);
        for (t tVar2 : tVarArr) {
            if (tVar2 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet, tVarArr);
        bVarArr[0] = new d8.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new p(i10), hashSet3);
        t tVar3 = new t(y7.b.class, ScheduledExecutorService.class);
        t[] tVarArr2 = {new t(y7.b.class, ExecutorService.class), new t(y7.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(tVar3);
        for (t tVar4 : tVarArr2) {
            if (tVar4 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet4, tVarArr2);
        bVarArr[1] = new d8.b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new q(i10), hashSet6);
        t tVar5 = new t(c.class, ScheduledExecutorService.class);
        t[] tVarArr3 = {new t(c.class, ExecutorService.class), new t(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(tVar5);
        for (t tVar6 : tVarArr3) {
            if (tVar6 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet7, tVarArr3);
        bVarArr[2] = new d8.b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new d9.r(i10), hashSet9);
        b.a a10 = d8.b.a(new t(d.class, Executor.class));
        a10.f = new e0.d(i10);
        bVarArr[3] = a10.b();
        return Arrays.asList(bVarArr);
    }
}
