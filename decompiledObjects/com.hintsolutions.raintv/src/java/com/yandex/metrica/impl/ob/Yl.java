/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.AnyThread
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.WorkerThread
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.E1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class yl<T> {
    @Nullable
    private T a;
    @NonNull
    private final ICommonExecutor b;
    private final List<E1<T>> c = new ArrayList();

    @AnyThread
    public yl(@NonNull ICommonExecutor iCommonExecutor) {
        this.b = iCommonExecutor;
    }

    @AnyThread
    public void a(@NonNull E1<T> e12) {
        this.b.execute(new Runnable(){
            public final E1 a;
            public final yl b;
            {
                this.b = yl2;
                this.a = e12;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void run() {
                yl yl2;
                yl yl3 = yl2 = this.b;
                synchronized (yl3) {
                    Object object = this.b.a;
                    if (object == null) {
                        this.b.c.add((Object)this.a);
                    } else {
                        this.a.b(object);
                    }
                    return;
                }
            }
        });
    }

    @WorkerThread
    public void a(@NonNull T t3) {
        yl yl2 = this;
        synchronized (yl2) {
            this.a = t3;
            Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                ((E1)iterator.next()).b(t3);
            }
            this.c.clear();
            return;
        }
    }
}

