/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.WorkerThread
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.impl.ac.NativeCrashesHelper;
import com.yandex.metrica.impl.ob.f7;

@Deprecated
public class j7
implements f7 {
    @Override
    @NonNull
    public String a() {
        return "YandexMetricaNativeCrashes";
    }

    @Override
    public void a(@Nullable String string) {
    }

    @Override
    @WorkerThread
    public void a(@NonNull String string, @NonNull String string2, @Nullable String string3) {
        NativeCrashesHelper.setUpNativeUncaughtExceptionHandler(string2);
    }

    @Override
    public void a(boolean bl2) {
        NativeCrashesHelper.logsEnabled(bl2);
    }

    @Override
    public void b() {
        NativeCrashesHelper.cancelSetUpNativeUncaughtExceptionHandler();
    }

    @Override
    @NonNull
    public String c() {
        return "YandexMetricaNativeModule";
    }
}

