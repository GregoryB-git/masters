/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ac;

public class NativeCrashesHelper {
    public static native void cancelSetUpNativeUncaughtExceptionHandler();

    public static native void logsEnabled(boolean var0);

    public static native void setUpNativeUncaughtExceptionHandler(String var0);
}

