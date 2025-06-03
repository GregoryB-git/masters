/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Map
 */
package com.yandex.metrica.impl.ob;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.i;
import com.yandex.metrica.impl.ob.O0;
import com.yandex.metrica.impl.ob.Q;
import com.yandex.metrica.impl.ob.S0;
import com.yandex.metrica.impl.ob.rb;
import com.yandex.metrica.impl.ob.u;
import com.yandex.metrica.impl.ob.xb;
import java.util.Map;

public class aj
implements S0 {
    @NonNull
    private final Handler a;
    @NonNull
    private final ICommonExecutor b;
    @NonNull
    private final ICommonExecutor c;

    @VisibleForTesting
    public aj(@NonNull ICommonExecutor iCommonExecutor, @NonNull Handler handler, @NonNull ICommonExecutor iCommonExecutor2, @NonNull Q q5) {
        this.b = iCommonExecutor;
        this.a = handler;
        this.c = iCommonExecutor2;
    }

    @Override
    @NonNull
    public u a() {
        return new u(this.c);
    }

    @Override
    public void a(@NonNull i i2, @NonNull O0 o0) {
    }

    @Override
    public void a(@Nullable Map<String, Object> map) {
    }

    @Override
    @NonNull
    public ICommonExecutor b() {
        return this.b;
    }

    @Override
    @NonNull
    public Handler c() {
        return this.a;
    }

    @Override
    @NonNull
    public xb d() {
        return new rb();
    }
}

