/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.android.installreferrer.api.InstallReferrerClient
 *  com.yandex.metrica.impl.ob.gg
 *  com.yandex.metrica.impl.ob.mg$a
 *  java.lang.Object
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.android.installreferrer.api.InstallReferrerClient;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.ag;
import com.yandex.metrica.impl.ob.gg;
import com.yandex.metrica.impl.ob.h2;
import com.yandex.metrica.impl.ob.lg;
import com.yandex.metrica.impl.ob.mg;

public class mg {
    @NonNull
    private final ag a;

    public mg(@NonNull Context context, @NonNull ICommonExecutor iCommonExecutor) {
        this(mg.a(context, iCommonExecutor));
    }

    @VisibleForTesting
    public mg(@NonNull ag ag2) {
        this.a = ag2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    private static ag a(@NonNull Context context, @NonNull ICommonExecutor iCommonExecutor) {
        if (h2.a("com.android.installreferrer.api.InstallReferrerClient")) {
            try {
                gg gg2 = new gg(InstallReferrerClient.newBuilder((Context)context).build(), iCommonExecutor);
                context = gg2;
            }
            catch (Throwable throwable) {}
        }
        context = null;
        iCommonExecutor = context;
        if (context != null) return iCommonExecutor;
        return new a();
    }

    public void a(@NonNull lg lg2) {
        try {
            this.a.a(lg2);
        }
        catch (Throwable throwable) {
            lg2.a(throwable);
        }
    }
}

