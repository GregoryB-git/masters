/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.plugins;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.plugins.PluginErrorDetails;

public interface YandexMetricaPlugins {
    public void reportError(@NonNull PluginErrorDetails var1, @Nullable String var2);

    public void reportError(@NonNull String var1, @Nullable String var2, @Nullable PluginErrorDetails var3);

    public void reportUnhandledException(@NonNull PluginErrorDetails var1);
}

