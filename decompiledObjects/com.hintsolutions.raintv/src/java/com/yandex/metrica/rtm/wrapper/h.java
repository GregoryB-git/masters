/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.rtm.client.CrashesDirectoryProvider
 *  com.yandex.metrica.rtm.client.ExceptionProcessor
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.yandex.metrica.rtm.wrapper;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.rtm.client.CrashesDirectoryProvider;
import com.yandex.metrica.rtm.client.ExceptionProcessor;
import com.yandex.metrica.rtm.wrapper.a;
import com.yandex.metrica.rtm.wrapper.e;
import com.yandex.metrica.rtm.wrapper.i;

public class h
implements e {
    @NonNull
    private final ExceptionProcessor a;

    @VisibleForTesting
    public h(@NonNull ExceptionProcessor exceptionProcessor) throws Throwable {
        this.a = exceptionProcessor;
    }

    public h(@NonNull i i2, @NonNull Context context) throws Throwable {
        this(new ExceptionProcessor(context, (CrashesDirectoryProvider)new a(i2)));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void reportException(@Nullable String string, @Nullable Throwable throwable) {
        try {
            this.a.onException(string, throwable);
            return;
        }
        catch (Throwable throwable2) {
            return;
        }
    }
}

