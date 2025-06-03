/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.os.Bundle
 *  androidx.annotation.AnyThread
 *  androidx.annotation.MainThread
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.Iterator
 */
package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.em;
import com.yandex.metrica.impl.ob.k0;
import java.util.Iterator;

public class q
extends k0 {
    @Nullable
    private Application a;
    @NonNull
    private volatile c b = com.yandex.metrica.impl.ob.q$c.d;
    @NonNull
    private final em<a, b> c = new em(true);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void a(@NonNull a a2, @NonNull Activity activity) {
        q q5 = this;
        // MONITORENTER : q5
        Iterator iterator = this.c.a(a2);
        // MONITOREXIT : q5
        if (iterator == null) return;
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            (iterator.next()).a(activity, a2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @AnyThread
    private void b() {
        q q5 = this;
        synchronized (q5) {
            c c5 = this.b;
            c c9 = com.yandex.metrica.impl.ob.q$c.b;
            if (c5 != c9 && !this.c.b()) {
                if (this.a == null) {
                    this.b = com.yandex.metrica.impl.ob.q$c.c;
                    return;
                }
                this.b = c9;
                this.a.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this);
                return;
            }
            return;
        }
    }

    @AnyThread
    @NonNull
    public c a() {
        return this.b;
    }

    @AnyThread
    public void a(@NonNull Application application) {
        q q5 = this;
        synchronized (q5) {
            if (this.a == null) {
                this.a = application;
            }
            this.b();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @AnyThread
    public void a(@NonNull Context context) {
        q q5 = this;
        synchronized (q5) {
            Application application = this.a;
            if (application == null) {
                try {
                    this.a = (Application)context.getApplicationContext();
                }
                catch (Throwable throwable) {}
            }
            this.b();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @AnyThread
    public void a(@NonNull b b4, a ... aArray) {
        q q5 = this;
        synchronized (q5) {
            a[] aArray2;
            int n2 = aArray2.length;
            int n5 = 0;
            n2 = n2 == 0 ? 1 : 0;
            if (n2 != 0) {
                aArray2 = com.yandex.metrica.impl.ob.q$a.values();
            }
            int n6 = aArray2.length;
            n2 = n5;
            while (true) {
                if (n2 >= n6) {
                    this.b();
                    return;
                }
                a a2 = aArray2[n2];
                this.c.a(a2, b4);
                ++n2;
            }
        }
    }

    @MainThread
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        this.a(com.yandex.metrica.impl.ob.q$a.a, activity);
    }

    public void onActivityDestroyed(@NonNull Activity activity) {
        this.a(com.yandex.metrica.impl.ob.q$a.f, activity);
    }

    @MainThread
    public void onActivityPaused(@NonNull Activity activity) {
        this.a(com.yandex.metrica.impl.ob.q$a.c, activity);
    }

    @MainThread
    public void onActivityResumed(@NonNull Activity activity) {
        this.a(com.yandex.metrica.impl.ob.q$a.b, activity);
    }

    public void onActivityStarted(@NonNull Activity activity) {
        this.a(com.yandex.metrica.impl.ob.q$a.d, activity);
    }

    public void onActivityStopped(@NonNull Activity activity) {
        this.a(com.yandex.metrica.impl.ob.q$a.e, activity);
    }
}

