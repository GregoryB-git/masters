/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.Xl;
import com.yandex.metrica.impl.ob.Yl;
import com.yandex.metrica.impl.ob.b0;
import com.yandex.metrica.impl.ob.l2;
import com.yandex.metrica.impl.ob.xl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class J2
implements l2 {
    @NonNull
    private final List<Yl<Context, Intent, Void>> a = new ArrayList();
    private boolean b = false;
    private boolean c = false;
    @NonNull
    private final Context d;
    @NonNull
    private final b0 e;

    public J2(@NonNull Context context, @NonNull ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, new b0.a());
    }

    @VisibleForTesting
    public J2(@NonNull Context context, @NonNull ICommonExecutor iCommonExecutor, @NonNull b0.a a2) {
        this.d = context;
        this.e = a2.a(new xl(new Xl<Context, Intent>(this){
            public final J2 a;
            {
                this.a = j22;
            }

            @Override
            public void a(Object object, Object object2) {
                object = (Context)object;
                object2 = (Intent)object2;
                J2.a(this.a, (Context)object, (Intent)object2);
            }
        }, iCommonExecutor));
    }

    public static void a(J2 j22, Context context, Intent intent) {
        J2 j23 = j22;
        synchronized (j23) {
            Iterator iterator = j22.a.iterator();
            while (iterator.hasNext()) {
                ((Yl)iterator.next()).a(context, intent);
            }
            return;
        }
    }

    @Override
    public void a() {
        J2 j22 = this;
        synchronized (j22) {
            this.c = true;
            if (!this.a.isEmpty()) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
                this.e.a(this.d, intentFilter);
                this.b = true;
            }
            return;
        }
    }

    public void a(@NonNull Yl<Context, Intent, Void> intentFilter) {
        J2 j22 = this;
        synchronized (j22) {
            this.a.add(intentFilter);
            if (this.c && !this.b) {
                intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
                this.e.a(this.d, intentFilter);
                this.b = true;
            }
            return;
        }
    }

    @Override
    public void b() {
        J2 j22 = this;
        synchronized (j22) {
            this.c = false;
            if (this.b) {
                this.e.a(this.d);
                this.b = false;
            }
            return;
        }
    }

    public void b(@NonNull Yl<Context, Intent, Void> yl) {
        J2 j22 = this;
        synchronized (j22) {
            this.a.remove(yl);
            if (this.a.isEmpty() && this.b) {
                this.e.a(this.d);
                this.b = false;
            }
            return;
        }
    }
}

