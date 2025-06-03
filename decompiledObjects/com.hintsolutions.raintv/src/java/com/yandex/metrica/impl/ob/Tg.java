/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.ci;
import com.yandex.metrica.impl.ob.g1;
import com.yandex.metrica.impl.ob.qg;
import com.yandex.metrica.impl.ob.rg;

public abstract class tg<T extends rg, IA, A extends qg<IA, A>, L extends rg.d<T, rg.c<A>>>
implements g1.a {
    @Nullable
    private T a;
    @NonNull
    private L b;
    @NonNull
    private rg.c<A> c;

    public tg(@NonNull L l6, @NonNull ci ci2, @NonNull A a2) {
        this.b = l6;
        g1.a(F0.g().e()).a(this);
        this.a((IA)new rg.c<A>(ci2, a2));
    }

    @Override
    public void a() {
        tg tg2 = this;
        synchronized (tg2) {
            this.a = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void a(@NonNull ci ci2) {
        tg tg2 = this;
        // MONITORENTER : tg2
        tg2 = this;
        // MONITORENTER : tg2
        qg qg2 = (qg)this.c.b;
        // MONITOREXIT : tg2
        rg.c<qg> c9 = new rg.c<qg>(ci2, qg2);
        tg2 = this;
        // MONITORENTER : tg2
        this.c = c9;
        // MONITOREXIT : tg2
        tg2 = this;
        // MONITORENTER : tg2
        this.a = null;
        // MONITOREXIT : tg2
        // MONITOREXIT : tg2
    }

    public void a(@NonNull rg.c<A> c9) {
        tg tg2 = this;
        synchronized (tg2) {
            this.c = c9;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void a(@NonNull IA IA) {
        tg tg2 = this;
        // MONITORENTER : tg2
        if (!((qg)this.c.b).b(IA)) {
            tg2 = this;
            // MONITORENTER : tg2
            rg.c<A> c9 = this.c;
            ci ci2 = c9.a;
            // MONITOREXIT : tg2
            rg.c c10 = new rg.c(ci2, ((qg)c9.b).a(IA));
            tg2 = this;
            // MONITORENTER : tg2
            this.c = c10;
            // MONITOREXIT : tg2
            tg2 = this;
            // MONITORENTER : tg2
            this.a = null;
            // MONITOREXIT : tg2
        }
        // MONITOREXIT : tg2
    }

    @NonNull
    public T b() {
        tg tg2 = this;
        synchronized (tg2) {
            if (this.a == null) {
                this.a = this.b.a(this.c);
            }
            T t3 = this.a;
            return t3;
        }
    }

    @NonNull
    @VisibleForTesting(otherwise=4)
    public A c() {
        tg tg2 = this;
        synchronized (tg2) {
            qg qg2 = (qg)this.c.b;
            return (A)qg2;
        }
    }

    @NonNull
    public ci d() {
        tg tg2 = this;
        synchronized (tg2) {
            ci ci2 = this.c.a;
            return ci2;
        }
    }

    public void e() {
        tg tg2 = this;
        synchronized (tg2) {
            this.a = null;
            return;
        }
    }
}

