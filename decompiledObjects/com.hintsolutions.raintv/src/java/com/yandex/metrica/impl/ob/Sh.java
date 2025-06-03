/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.ServerSocket
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.net.ServerSocket;

public interface sh {
    @NonNull
    public ServerSocket a(int var1) throws IOException, a;

    public static class a
    extends Throwable {
        public a(@NonNull String string, @NonNull Throwable throwable) {
            super(string, throwable);
        }
    }
}

