/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.A0;
import com.yandex.metrica.impl.ob.C6;
import com.yandex.metrica.impl.ob.D6;
import com.yandex.metrica.plugins.PluginErrorDetails;
import org.jetbrains.annotations.NotNull;

public final class n6 {
    private final A0 a;

    public n6(@NotNull A0 a02) {
        this.a = a02;
    }

    @NotNull
    public final C6 a(@NotNull PluginErrorDetails pluginErrorDetails) {
        return D6.a(pluginErrorDetails.getExceptionClass(), pluginErrorDetails.getMessage(), pluginErrorDetails.getStacktrace(), pluginErrorDetails.getPlatform(), pluginErrorDetails.getVirtualMachineVersion(), pluginErrorDetails.getPluginEnvironment(), this.a.a(), this.a.b());
    }
}

