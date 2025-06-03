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

interface IObjectLogDumper<T> {
    public String dumpObject(@NonNull T var1);
}

