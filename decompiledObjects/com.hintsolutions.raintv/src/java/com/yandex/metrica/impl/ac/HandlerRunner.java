/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  androidx.annotation.NonNull
 *  dalvik.system.PathClassLoader
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ac;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.A2;
import dalvik.system.PathClassLoader;

public class HandlerRunner {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SuppressLint(value={"UnsafeDynamicallyLoadedCode"})
    private static void a(@NonNull String string) {
        try {
            String string2 = System.getProperty((String)"java.class.path");
            String string3 = System.getProperty((String)"java.library.path");
            PathClassLoader pathClassLoader = new PathClassLoader(string2, string3, ClassLoader.getSystemClassLoader());
            string = pathClassLoader.findLibrary(string);
            if (string == null) return;
            System.load((String)string);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static void main(String[] stringArray) {
        if (A2.a(24)) {
            try {
                System.loadLibrary((String)"appmetrica-native-runner");
            }
            catch (Throwable throwable) {
                HandlerRunner.a("appmetrica-native-runner");
            }
        } else {
            HandlerRunner.a("appmetrica-native-runner");
        }
        HandlerRunner.runHandler(stringArray);
    }

    private static native void runHandler(String[] var0);
}

