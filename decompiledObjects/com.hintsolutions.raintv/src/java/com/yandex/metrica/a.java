/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.core.api.executors.ICommonExecutor
 *  com.yandex.metrica.impl.ob.P
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Set
 */
package com.yandex.metrica;

import androidx.annotation.NonNull;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.P;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class a {
    @NonNull
    private final ICommonExecutor a;
    private final Set<b> b = new HashSet();

    public a(long l) {
        this(l, (ICommonExecutor)P.g().d().b());
    }

    public a(long l, @NonNull ICommonExecutor iCommonExecutor) {
        this.a = iCommonExecutor;
    }

    public void a() {
        a a4 = this;
        synchronized (a4) {
            Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                ((b)iterator.next()).a();
            }
            return;
        }
    }

    public void a(@NonNull a a4, long l) {
        a a6 = this;
        synchronized (a6) {
            Set<b> set = this.b;
            b b4 = new b(this, a4, this.a, l);
            set.add((Object)b4);
            return;
        }
    }

    public void b() {
        a a4 = this;
        synchronized (a4) {
            Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                ((b)iterator.next()).b();
            }
            return;
        }
    }

    public static interface a {
        public void a();

        public void b();
    }

    public class b {
        @NonNull
        public final ICommonExecutor a;
        @NonNull
        public final a b;
        private final long c;
        private boolean d = true;
        private final Runnable e = new Runnable(this){
            public final b a;
            {
                this.a = b4;
            }

            public void run() {
                this.a.b.a();
            }
        };

        public b(@NonNull a a4, @NonNull a a6, ICommonExecutor iCommonExecutor, long l) {
            this.b = a6;
            this.a = iCommonExecutor;
            this.c = l;
        }

        public void a() {
            if (!this.d) {
                this.d = true;
                this.a.executeDelayed(this.e, this.c);
            }
        }

        public void b() {
            if (this.d) {
                this.d = false;
                this.a.remove(this.e);
                this.b.b();
            }
        }
    }
}

