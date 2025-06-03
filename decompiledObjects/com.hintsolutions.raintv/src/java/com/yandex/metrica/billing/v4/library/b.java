/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  androidx.annotation.WorkerThread
 *  com.android.billingclient.api.BillingClient
 *  com.yandex.metrica.billing.v4.library.a
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.LinkedHashSet
 *  java.util.Set
 *  kotlin.jvm.JvmOverloads
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.billing.v4.library;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.WorkerThread;
import com.android.billingclient.api.BillingClient;
import com.yandex.metrica.billing.v4.library.a;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class b {
    private final Set<Object> a;
    private final BillingClient b;
    private final Handler c;

    @JvmOverloads
    public b(@NotNull BillingClient billingClient, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter((Object)billingClient, (String)"billingClient");
        Intrinsics.checkNotNullParameter((Object)handler, (String)"mainHandler");
        this.b = billingClient;
        this.c = handler;
        this.a = new LinkedHashSet();
    }

    public /* synthetic */ b(BillingClient billingClient, Handler object, int n) {
        object = (n & 2) != 0 ? new Handler(Looper.getMainLooper()) : null;
        this(billingClient, (Handler)object);
    }

    public static final /* synthetic */ BillingClient a(b b4) {
        return b4.b;
    }

    @WorkerThread
    public final void a(@NotNull Object object) {
        Intrinsics.checkNotNullParameter((Object)object, (String)"listener");
        this.a.add(object);
    }

    @WorkerThread
    public final void b(@NotNull Object object) {
        Intrinsics.checkNotNullParameter((Object)object, (String)"listener");
        this.a.remove(object);
        if (this.a.size() == 0) {
            this.c.post((Runnable)new a(this));
        }
    }
}

