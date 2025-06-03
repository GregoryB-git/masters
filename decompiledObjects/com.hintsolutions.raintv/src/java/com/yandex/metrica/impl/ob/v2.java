/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.If;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.plugins.YandexMetricaPlugins;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class V2
implements YandexMetricaPlugins {
    private final If a;

    public V2(@NotNull If if_) {
        this.a = if_;
    }

    @Override
    public void reportError(@NotNull PluginErrorDetails pluginErrorDetails, @Nullable String string2) {
        this.a.a(pluginErrorDetails, string2);
    }

    @Override
    public void reportError(@NotNull String string2, @Nullable String string3, @Nullable PluginErrorDetails pluginErrorDetails) {
        this.a.a(string2, string3, pluginErrorDetails);
    }

    @Override
    public void reportUnhandledException(@NotNull PluginErrorDetails pluginErrorDetails) {
        this.a.a(pluginErrorDetails);
    }
}

