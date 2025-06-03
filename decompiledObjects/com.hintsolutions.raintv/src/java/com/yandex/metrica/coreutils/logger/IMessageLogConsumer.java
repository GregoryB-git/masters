/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.coreutils.logger;

import androidx.annotation.NonNull;

interface IMessageLogConsumer<T> {
    public void consume(@NonNull T var1, Object ... var2);

    public void consumeWithTag(@NonNull String var1, @NonNull T var2, Object ... var3);
}

