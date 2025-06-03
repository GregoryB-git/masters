/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.coreutils.logger.DebugLogger
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  org.json.JSONObject
 */
package com.yandex.metrica.coreutils.logger;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.coreutils.logger.BaseLogger;
import com.yandex.metrica.coreutils.logger.DebugLogger;
import com.yandex.metrica.coreutils.logger.YLoggerImpl;
import org.json.JSONObject;

public final class YLogger {
    public static final boolean DEBUG = false;
    public static final String FEATURE_TAG_ECOMMERCE = "[ECommerce]";
    private static YLoggerImpl impl = new YLoggerImpl((BaseLogger)new DebugLogger(false), false);

    private YLogger() {
    }

    public static void d(@NonNull String string2, Object ... objectArray) {
    }

    public static void debug(@NonNull String string2, @NonNull String string3, Object ... objectArray) {
    }

    public static void dumpJson(@NonNull String string2, @NonNull JSONObject jSONObject) {
    }

    public static void e(@NonNull String string2, Object ... objectArray) {
    }

    public static void e(@NonNull Throwable throwable, @Nullable String string2, Object ... objectArray) {
    }

    public static void error(@NonNull String string2, @NonNull String string3, Object ... objectArray) {
    }

    public static void error(@NonNull String string2, @Nullable Throwable throwable) {
        YLogger.error(string2, throwable, null, new Object[0]);
    }

    public static void error(@NonNull String string2, @Nullable Throwable throwable, @Nullable String string3, Object ... objectArray) {
    }

    @VisibleForTesting
    public static YLoggerImpl getImpl() {
        return impl;
    }

    public static void i(@NonNull String string2, Object ... objectArray) {
    }

    public static void info(@NonNull String string2, @NonNull String string3, Object ... objectArray) {
    }

    @VisibleForTesting(otherwise=5)
    public static void setImpl(@NonNull YLoggerImpl yLoggerImpl) {
        impl = yLoggerImpl;
    }

    public static void w(@NonNull String string2, Object ... objectArray) {
    }

    public static void warning(@NonNull String string2, @NonNull String string3, Object ... objectArray) {
    }
}

