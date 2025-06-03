/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.modules.api;

import com.yandex.metrica.modules.api.RemoteConfigExtensionConfiguration;

public interface ModuleEntryPoint {
    public String getIdentifier();

    public RemoteConfigExtensionConfiguration getRemoteConfigExtensionConfiguration();
}

