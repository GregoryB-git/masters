/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  androidx.annotation.NonNull
 *  androidx.annotation.WorkerThread
 *  com.android.billingclient.api.BillingClient
 *  com.yandex.metrica.billing.v3.library.a
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.HashSet
 *  java.util.Set
 */
package com.yandex.metrica.billing.v3.library;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.android.billingclient.api.BillingClient;
import com.yandex.metrica.billing.v3.library.a;
import java.util.HashSet;
import java.util.Set;

class b {
    @NonNull
    private final Handler a;
    @NonNull
    private final BillingClient b;
    private final Set<Object> c;

    public b(@NonNull BillingClient billingClient) {
        this(billingClient, new Handler(Looper.getMainLooper()));
    }

    public b(@NonNull BillingClient billingClient, @NonNull Handler handler) {
        this.b = billingClient;
        this.c = new HashSet();
        this.a = handler;
    }

    public static /* synthetic */ BillingClient a(b b4) {
        return b4.b;
    }

    @WorkerThread
    public void a(@NonNull Object object) {
        this.c.add(object);
    }

    @WorkerThread
    public void b(@NonNull Object object) {
        this.c.remove(object);
        if (this.c.size() == 0) {
            this.a.post((Runnable)new a(this));
        }
    }
}

