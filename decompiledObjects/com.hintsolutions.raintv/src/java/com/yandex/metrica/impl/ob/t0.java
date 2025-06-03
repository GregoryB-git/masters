/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.AnyThread
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.WorkerThread
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.e;
import com.yandex.metrica.i;
import com.yandex.metrica.impl.ob.M0;
import com.yandex.metrica.impl.ob.O0;
import com.yandex.metrica.impl.ob.f0;
import com.yandex.metrica.impl.ob.k1;
import com.yandex.metrica.impl.ob.n1;
import java.util.List;

public interface T0
extends n1,
f0.a,
O0 {
    @NonNull
    @WorkerThread
    public M0 a(@NonNull e var1);

    @AnyThread
    @Nullable
    public String a();

    @WorkerThread
    public void a(@NonNull AppMetricaDeviceIDListener var1);

    @WorkerThread
    public void a(DeferredDeeplinkListener var1);

    @WorkerThread
    public void a(DeferredDeeplinkParametersListener var1);

    @WorkerThread
    public void a(IIdentifierCallback var1, @NonNull List<String> var2);

    @WorkerThread
    public void a(@NonNull YandexMetricaConfig var1, @NonNull i var2);

    @AnyThread
    @Nullable
    public String c();

    @WorkerThread
    public void c(@NonNull e var1);

    @AnyThread
    @Nullable
    public k1 d();
}

