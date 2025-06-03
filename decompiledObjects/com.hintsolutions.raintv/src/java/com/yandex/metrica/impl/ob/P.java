/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  androidx.annotation.MainThread
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.util.HashSet
 *  java.util.Set
 */
package com.yandex.metrica.impl.ob;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.q;
import java.util.HashSet;
import java.util.Set;

public class p
implements q.b {
    @NonNull
    private final Set<b> a = new HashSet();
    @NonNull
    private final ICommonExecutor b;

    public p(@NonNull q q5, @NonNull ICommonExecutor iCommonExecutor) {
        this.b = iCommonExecutor;
        q5.a(this, new q.a[0]);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(@NonNull Activity activity) {
        HashSet hashSet;
        p p3 = this;
        synchronized (p3) {
            hashSet = new HashSet(this.a);
        }
        hashSet = hashSet.iterator();
        while (hashSet.hasNext()) {
            (hashSet.next()).a(activity);
        }
        return;
    }

    @Override
    @MainThread
    public void a(@NonNull Activity activity, @NonNull q.a a2) {
        this.b.execute(new Runnable(){
            public final Activity a;
            public final p b;
            {
                this.b = p3;
                this.a = activity;
            }

            public void run() {
                this.b.a(this.a);
            }
        });
    }

    public void a(@NonNull b b4) {
        p p3 = this;
        synchronized (p3) {
            this.a.add((Object)b4);
            return;
        }
    }
}

