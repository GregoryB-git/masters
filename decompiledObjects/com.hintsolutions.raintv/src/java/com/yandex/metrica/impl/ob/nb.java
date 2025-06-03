/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.util.concurrent.TimeUnit
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.Jb;
import java.util.concurrent.TimeUnit;

public abstract class Nb<T>
implements Jb<T> {
    @NonNull
    private ICommonExecutor a;
    @Nullable
    private volatile Runnable b;

    public Nb(@NonNull ICommonExecutor iCommonExecutor) {
        this.a = iCommonExecutor;
    }

    @Override
    public void a() {
        Runnable runnable = this.b;
        if (runnable != null) {
            this.a.remove(runnable);
            this.b = null;
        }
    }

    @Override
    public void a(@NonNull Runnable runnable, long l4) {
        this.a.executeDelayed(runnable, l4, TimeUnit.SECONDS);
        this.b = runnable;
    }
}

