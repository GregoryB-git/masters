/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.onesignal;

import androidx.annotation.NonNull;

public interface OSLogger {
    public void debug(@NonNull String var1);

    public void error(@NonNull String var1);

    public void error(@NonNull String var1, @NonNull Throwable var2);

    public void info(@NonNull String var1);

    public void verbose(@NonNull String var1);

    public void warning(@NonNull String var1);
}

