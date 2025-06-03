/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  androidx.annotation.WorkerThread
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.ref.WeakReference
 */
package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.P;
import com.yandex.metrica.impl.ob.V8;
import com.yandex.metrica.impl.ob.c2;
import com.yandex.metrica.impl.ob.ca;
import com.yandex.metrica.impl.ob.d2;
import com.yandex.metrica.impl.ob.p;
import java.lang.ref.WeakReference;

public class f2
implements p.b {
    @SuppressLint(value={"StaticFieldLeak"})
    @Nullable
    private static volatile f2 g;
    @NonNull
    private final Context a;
    @Nullable
    private c2 b;
    @NonNull
    private WeakReference<Activity> c = new WeakReference(null);
    @NonNull
    private final V8 d;
    @NonNull
    private final d2 e;
    private boolean f;

    @VisibleForTesting
    public f2(@NonNull Context context, @NonNull V8 v82, @NonNull d2 d22) {
        this.a = context;
        this.d = v82;
        this.e = d22;
        this.b = v82.s();
        this.f = v82.x();
        P.g().a().a(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    public static f2 a(@NonNull Context context) {
        if (g != null) return g;
        Class<f2> clazz = f2.class;
        synchronized (f2.class) {
            f2 f22;
            if (g != null) return g;
            V8 v82 = new V8(ca.a(context).c());
            d2 d22 = new d2();
            g = f22 = new f2(context, v82, d22);
            // ** MonitorExit[var4_1] (shouldn't be in output)
            return g;
        }
    }

    private void b(@Nullable Context object) {
        if (object != null && (object = this.e.a((Context)object)) != null && !((c2)object).equals(this.b)) {
            this.b = object;
            this.d.a((c2)object);
        }
    }

    @Nullable
    @WorkerThread
    public c2 a() {
        f2 f22 = this;
        synchronized (f22) {
            this.b((Context)this.c.get());
            if (this.b == null) {
                if (A2.a(30)) {
                    if (!this.f) {
                        this.b(this.a);
                        this.f = true;
                        this.d.z();
                    }
                } else {
                    this.b(this.a);
                }
            }
            c2 c22 = this.b;
            return c22;
        }
    }

    @Override
    @WorkerThread
    public void a(@NonNull Activity activity) {
        f2 f22 = this;
        synchronized (f22) {
            WeakReference weakReference;
            this.c = weakReference = new WeakReference((Object)activity);
            if (this.b == null) {
                this.b((Context)activity);
            }
            return;
        }
    }
}

