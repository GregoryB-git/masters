/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.appsetid.a;
import com.yandex.metrica.appsetid.d;
import org.jetbrains.annotations.NotNull;

public final class wb
implements d {
    @Override
    public void a(@NotNull Context context, @NotNull a a2) {
        a2.a((Throwable)new IllegalStateException("No App Set ID library"));
    }
}

