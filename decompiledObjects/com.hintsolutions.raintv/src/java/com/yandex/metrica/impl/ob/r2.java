/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.location.Location
 *  androidx.annotation.AnyThread
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  androidx.annotation.WorkerThread
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.Callable
 *  java.util.concurrent.FutureTask
 */
package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.e;
import com.yandex.metrica.i;
import com.yandex.metrica.impl.ob.M0;
import com.yandex.metrica.impl.ob.N0;
import com.yandex.metrica.impl.ob.O0;
import com.yandex.metrica.impl.ob.P;
import com.yandex.metrica.impl.ob.Q2;
import com.yandex.metrica.impl.ob.S0;
import com.yandex.metrica.impl.ob.S2;
import com.yandex.metrica.impl.ob.T0;
import com.yandex.metrica.impl.ob.k1;
import com.yandex.metrica.impl.ob.n1;
import com.yandex.metrica.impl.ob.vm;
import com.yandex.metrica.impl.ob.xb;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class R2
implements O0 {
    @SuppressLint(value={"StaticFieldLeak"})
    @Nullable
    private static volatile R2 f;
    private static volatile boolean g;
    @NonNull
    private final Context a;
    @NonNull
    private final Q2 b;
    @NonNull
    private final FutureTask<T0> c;
    @NonNull
    private final S0 d;
    @NonNull
    private final vm e;

    @VisibleForTesting
    public R2(@NonNull Context context, @NonNull Q2 q2, @NonNull S0 s02, @NonNull vm vm2) {
        this.a = context;
        this.b = q2;
        this.d = s02;
        this.e = vm2;
        this.c = context = new FutureTask((Callable)new Callable<T0>(this){
            public final R2 a;
            {
                this.a = r22;
            }

            public Object call() throws Exception {
                return R2.a(this.a);
            }
        });
        vm2.b().execute((Runnable)context);
    }

    private R2(@NonNull Context context, @NonNull Q2 q2, @NonNull vm vm2) {
        this(context, q2, q2.a(context, vm2), vm2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @AnyThread
    @NonNull
    public static R2 a(@NonNull Context object) {
        if (f != null) return f;
        Class<R2> clazz = R2.class;
        synchronized (R2.class) {
            R2 r22;
            if (f != null) return f;
            Object object2 = object.getApplicationContext();
            object = new Q2();
            r22 = f = (r22 = new R2((Context)object2, (Q2)object, P.g().d()));
            object2 = r22.e.b();
            object = new S2(r22);
            object2.execute((Runnable)object);
            // ** MonitorExit[var3_1] (shouldn't be in output)
            return f;
        }
    }

    public static T0 a(R2 r22) {
        return r22.b.a(r22.a, r22.d);
    }

    @WorkerThread
    public static void a(@Nullable Location location) {
        R2.f().a(location);
    }

    @WorkerThread
    public static void a(@Nullable String string2) {
        R2.f().setUserProfileID(string2);
    }

    @WorkerThread
    public static void a(String string2, String string3) {
        R2.f().c(string2, string3);
    }

    @WorkerThread
    public static void a(boolean bl) {
        R2.f().b(bl);
    }

    public static /* synthetic */ Context b(R2 r22) {
        return r22.a;
    }

    @WorkerThread
    public static void b(boolean bl) {
        R2.f().a(bl);
    }

    public static /* synthetic */ vm c(R2 r22) {
        return r22.e;
    }

    @WorkerThread
    public static void c(boolean bl) {
        R2.f().setStatisticsSending(bl);
    }

    @AnyThread
    private static n1 f() {
        T0 t02 = R2.i() ? f.g() : P.g().f();
        return t02;
    }

    @AnyThread
    @NonNull
    private T0 g() {
        try {
            T0 t02 = (T0)this.c.get();
            return t02;
        }
        catch (Exception exception) {
            throw new RuntimeException((Throwable)exception);
        }
    }

    @AnyThread
    public static boolean h() {
        Class<R2> clazz = R2.class;
        synchronized (R2.class) {
            boolean bl = g;
            // ** MonitorExit[var2] (shouldn't be in output)
            return bl;
        }
    }

    @AnyThread
    public static boolean i() {
        Class<R2> clazz = R2.class;
        synchronized (R2.class) {
            k1 k12;
            boolean bl = f != null && R2.f.c.isDone() && (k12 = f.g().d()) != null;
            return bl;
        }
    }

    @AnyThread
    public static void j() {
        Class<R2> clazz = R2.class;
        synchronized (R2.class) {
            g = true;
            // ** MonitorExit[var1] (shouldn't be in output)
            return;
        }
    }

    @AnyThread
    @Nullable
    public static R2 k() {
        return f;
    }

    @NonNull
    @WorkerThread
    public M0 a(@NonNull e e3) {
        return this.g().a(e3);
    }

    @AnyThread
    @Nullable
    public String a() {
        return this.g().a();
    }

    @WorkerThread
    public void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.g().a(deferredDeeplinkListener);
    }

    @WorkerThread
    public void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.g().a(deferredDeeplinkParametersListener);
    }

    @WorkerThread
    public void a(@NonNull IIdentifierCallback iIdentifierCallback, @NonNull List<String> list) {
        this.g().a(iIdentifierCallback, list);
    }

    @WorkerThread
    public void a(@Nullable Map<String, Object> map) {
        this.d.a(map);
    }

    @Override
    @NonNull
    public N0 b() {
        return this.g().b();
    }

    @WorkerThread
    public void b(@NonNull AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        this.g().a(appMetricaDeviceIDListener);
    }

    @WorkerThread
    public void b(@NonNull YandexMetricaConfig yandexMetricaConfig, @NonNull i i2) {
        this.g().a(yandexMetricaConfig, i2);
    }

    @AnyThread
    public void b(@NonNull i i2) {
        this.d.a(i2, this);
    }

    @AnyThread
    @Nullable
    public String c() {
        return this.g().c();
    }

    @WorkerThread
    public void c(@NonNull e e3) {
        this.g().c(e3);
    }

    @Nullable
    @WorkerThread
    public k1 d() {
        return this.g().d();
    }

    @AnyThread
    @NonNull
    public xb e() {
        return this.d.d();
    }
}

