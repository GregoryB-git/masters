/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.RequiresApi
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ac;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(value=21)
public class CrashpadHelper {
    public static native void cancelSetUpNativeUncaughtExceptionHandler();

    @Nullable
    public static native String getLibDirInsideApk();

    public static native String getLibraryVersion();

    public static native void logsEnabled(boolean var0);

    public static native void setUpNativeUncaughtExceptionHandler(@NonNull Bundle var0);

    public static native void updateRuntimeConfig(@NonNull String var0);
}

