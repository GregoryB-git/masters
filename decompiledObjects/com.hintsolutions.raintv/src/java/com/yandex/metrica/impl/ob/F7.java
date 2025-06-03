/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.WorkerThread
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;

public interface f7 {
    @NonNull
    public String a();

    public void a(@Nullable String var1);

    @WorkerThread
    public void a(@NonNull String var1, @NonNull String var2, @Nullable String var3);

    public void a(boolean var1);

    public void b();

    @NonNull
    public String c();
}

