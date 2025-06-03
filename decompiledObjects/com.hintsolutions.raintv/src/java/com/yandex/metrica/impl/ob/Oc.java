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
 *  com.yandex.metrica.impl.ob.O7
 *  com.yandex.metrica.impl.ob.P7
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.WeakHashMap
 *  java.util.concurrent.TimeUnit
 */
package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.core.api.executors.IHandlerExecutor;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.Fc;
import com.yandex.metrica.impl.ob.Gc;
import com.yandex.metrica.impl.ob.Lb;
import com.yandex.metrica.impl.ob.O7;
import com.yandex.metrica.impl.ob.P7;
import com.yandex.metrica.impl.ob.ci;
import com.yandex.metrica.impl.ob.fc;
import com.yandex.metrica.impl.ob.kc;
import com.yandex.metrica.impl.ob.lc;
import com.yandex.metrica.impl.ob.mc;
import com.yandex.metrica.impl.ob.nc;
import com.yandex.metrica.impl.ob.pc;
import com.yandex.metrica.impl.ob.xd;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

public class oc {
    @SuppressLint(value={"StaticFieldLeak"})
    private static volatile oc n;
    public static final long o;
    private static final Object p;
    public static final int q = 0;
    @NonNull
    private final WeakHashMap<Object, Object> a;
    private boolean b = false;
    @Nullable
    private fc c;
    @NonNull
    private ci d;
    @Nullable
    private Fc e;
    @NonNull
    private c f;
    private Runnable g;
    @NonNull
    private final Lb h;
    @NonNull
    private final P7 i;
    @NonNull
    private final O7 j;
    @NonNull
    private final xd k;
    private boolean l = false;
    private final Object m = new Object();

    static {
        o = TimeUnit.MINUTES.toMillis(1L);
        p = new Object();
    }

    @VisibleForTesting
    public oc(@NonNull Context context, @NonNull pc pc2, @NonNull c c3, @NonNull ci ci2) {
        this.h = new Lb(context, pc2.a(), pc2.d());
        this.i = pc2.c();
        this.j = pc2.b();
        this.k = pc2.e();
        this.a = new WeakHashMap();
        this.f = c3;
        this.d = ci2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static oc a(Context object) {
        Object object2;
        if (n != null) return n;
        Object object3 = object2 = p;
        synchronized (object3) {
            oc oc2;
            if (n != null) return n;
            Context context = object.getApplicationContext();
            pc pc2 = new pc(context);
            object = new c();
            ci.b b2 = new ci.b(context);
            n = oc2 = new oc(context, pc2, (c)object, b2.a());
            return n;
        }
    }

    private void b() {
        if (this.l) {
            if (!this.b || this.a.isEmpty()) {
                this.h.b.execute(new lc(this));
                Runnable runnable = this.g;
                if (runnable != null) {
                    this.h.b.remove(runnable);
                }
                this.l = false;
            }
        } else if (this.b && !this.a.isEmpty()) {
            Object object;
            if (this.e == null) {
                c c3 = this.f;
                object = new Gc(this.h, this.i, this.j, this.d, this.c);
                c3.getClass();
                this.e = new Fc((Gc)object);
            }
            this.h.b.execute(new mc(this));
            if (this.g == null) {
                object = new nc(this);
                this.g = object;
                this.h.b.executeDelayed((Runnable)object, o);
            }
            this.h.b.execute(new kc(this));
            this.l = true;
        }
    }

    public static void b(oc oc2) {
        oc2.h.b.executeDelayed(oc2.g, o);
    }

    @Nullable
    public Location a() {
        Fc fc2 = this.e;
        fc2 = fc2 == null ? null : fc2.b();
        return fc2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @AnyThread
    public void a(@NonNull ci ci2, @Nullable fc fc2) {
        Object object;
        Object object2 = object = this.m;
        synchronized (object2) {
            this.d = ci2;
            this.k.a(ci2);
            this.h.c.a(this.k.a());
            IHandlerExecutor iHandlerExecutor = this.h.b;
            Runnable runnable = new Runnable(){
                public final ci a;
                public final oc b;
                {
                    this.b = oc2;
                    this.a = ci2;
                }

                public void run() {
                    if (this.b.e != null) {
                        this.b.e.a(this.a);
                    }
                }
            };
            iHandlerExecutor.execute(runnable);
            if (!A2.a(this.c, (Object)fc2)) {
                this.a(fc2);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @AnyThread
    public void a(@Nullable fc fc2) {
        Object object;
        Object object2 = object = this.m;
        synchronized (object2) {
            this.c = fc2;
        }
        this.h.b.execute(new Runnable(){
            public final fc a;
            public final oc b;
            {
                this.b = oc2;
                this.a = fc2;
            }

            public void run() {
                if (this.b.e != null) {
                    this.b.e.a(this.a);
                }
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(@Nullable Object object) {
        Object object2;
        Object object3 = object2 = this.m;
        synchronized (object3) {
            this.a.put(object, null);
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
    public void a(boolean bl) {
        Object object;
        Object object2 = object = this.m;
        synchronized (object2) {
            if (this.b != bl) {
                this.b = bl;
                this.k.a(bl);
                this.h.c.a(this.k.a());
                this.b();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(@Nullable Object object) {
        Object object2;
        Object object3 = object2 = this.m;
        synchronized (object3) {
            this.a.remove(object);
            this.b();
            return;
        }
    }

    public static class c {
    }
}

