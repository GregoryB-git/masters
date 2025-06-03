/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.AnyThread
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.E;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.ci;
import com.yandex.metrica.impl.ob.fc;
import com.yandex.metrica.impl.ob.gc;
import com.yandex.metrica.impl.ob.hc;
import com.yandex.metrica.impl.ob.oc;
import com.yandex.metrica.impl.ob.w;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class jc
implements E.c,
w.b {
    @NonNull
    private List<hc> a;
    @NonNull
    private final E b;
    @NonNull
    private final oc c;
    @NonNull
    private final w d;
    @Nullable
    private volatile fc e;
    @NonNull
    private final Set<gc> f = new HashSet();
    private final Object g = new Object();

    public jc(@NonNull Context context) {
        this(F0.g().c(), oc.a(context), new ci.b(context), F0.g().b());
    }

    @VisibleForTesting
    public jc(@NonNull E e4, @NonNull oc oc2, @NonNull ci.b b2, @NonNull w w5) {
        this.b = e4;
        this.c = oc2;
        this.d = w5;
        this.a = b2.a().w();
    }

    @Nullable
    private fc a() {
        Object object;
        block1: {
            w.a a2 = this.d.c();
            E.b.a a3 = this.b.b();
            object = this.a.iterator();
            while (object.hasNext()) {
                hc hc2 = (hc)object.next();
                if (!hc2.b.a.contains((Object)a3) || !hc2.b.b.contains((Object)a2)) continue;
                object = hc2.a;
                break block1;
            }
            object = null;
        }
        return object;
    }

    @AnyThread
    private void d() {
        fc fc2 = this.a();
        if (!A2.a(this.e, (Object)fc2)) {
            this.c.a(fc2);
            fc2 = this.e = fc2;
            Iterator iterator = this.f.iterator();
            while (iterator.hasNext()) {
                ((gc)iterator.next()).a(fc2);
            }
        }
    }

    @Override
    public void a(@NonNull E.b.a a2) {
        jc jc2 = this;
        synchronized (jc2) {
            this.d();
            return;
        }
    }

    @AnyThread
    public void a(@NonNull ci ci2) {
        jc jc2 = this;
        synchronized (jc2) {
            this.a = ci2.w();
            this.e = this.a();
            this.c.a(ci2, this.e);
            fc fc2 = this.e;
            ci2 = this.f.iterator();
            while (ci2.hasNext()) {
                ((gc)ci2.next()).a(fc2);
            }
            return;
        }
    }

    @AnyThread
    public void a(@NonNull gc gc2) {
        jc jc2 = this;
        synchronized (jc2) {
            this.f.add((Object)gc2);
            return;
        }
    }

    @Override
    public void a(@NonNull w.a a2) {
        jc jc2 = this;
        synchronized (jc2) {
            this.d();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b() {
        Object object;
        Object object2 = object = this.g;
        synchronized (object2) {
            this.b.a(this);
            this.d.a(this);
            return;
        }
    }

    public void c() {
        jc jc2 = this;
        synchronized (jc2) {
            this.d();
            return;
        }
    }
}

