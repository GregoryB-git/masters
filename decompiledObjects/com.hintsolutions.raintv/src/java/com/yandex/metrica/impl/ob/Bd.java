/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.metrica.impl.ob.ci
 *  com.yandex.metrica.modules.api.CommonIdentifiers
 *  com.yandex.metrica.modules.api.ModuleFullRemoteConfig
 *  com.yandex.metrica.modules.api.RemoteConfigMetaInfo
 *  java.lang.Object
 *  java.lang.String
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.ci;
import com.yandex.metrica.modules.api.CommonIdentifiers;
import com.yandex.metrica.modules.api.ModuleFullRemoteConfig;
import com.yandex.metrica.modules.api.RemoteConfigMetaInfo;
import org.jetbrains.annotations.NotNull;

public final class bd {
    private final CommonIdentifiers a;
    private final RemoteConfigMetaInfo b;
    private final ci c;

    public bd(@NotNull ci ci2) {
        this.c = ci2;
        this.a = new CommonIdentifiers(ci2.V(), ci2.i());
        this.b = new RemoteConfigMetaInfo(ci2.o(), ci2.B());
    }

    @NotNull
    public final ModuleFullRemoteConfig a(@NotNull String string) {
        return new ModuleFullRemoteConfig(this.a, this.b, this.c.A().get((Object)string));
    }
}

