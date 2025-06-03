/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  kotlin.jvm.internal.Intrinsics
 */
package com.yandex.metrica.modules.api;

import com.yandex.metrica.modules.api.CommonIdentifiers;
import com.yandex.metrica.modules.api.RemoteConfigMetaInfo;
import kotlin.jvm.internal.Intrinsics;

public final class ModuleFullRemoteConfig {
    private final CommonIdentifiers a;
    private final RemoteConfigMetaInfo b;
    private final Object c;

    public ModuleFullRemoteConfig(CommonIdentifiers commonIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object object) {
        Intrinsics.checkNotNullParameter((Object)commonIdentifiers, (String)"commonIdentifiers");
        Intrinsics.checkNotNullParameter((Object)remoteConfigMetaInfo, (String)"remoteConfigMetaInfo");
        this.a = commonIdentifiers;
        this.b = remoteConfigMetaInfo;
        this.c = object;
    }

    public static /* synthetic */ ModuleFullRemoteConfig copy$default(ModuleFullRemoteConfig moduleFullRemoteConfig, CommonIdentifiers commonIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object object, int n7, Object object2) {
        if ((n7 & 1) != 0) {
            commonIdentifiers = moduleFullRemoteConfig.a;
        }
        if ((n7 & 2) != 0) {
            remoteConfigMetaInfo = moduleFullRemoteConfig.b;
        }
        if ((n7 & 4) != 0) {
            object = moduleFullRemoteConfig.c;
        }
        return moduleFullRemoteConfig.copy(commonIdentifiers, remoteConfigMetaInfo, object);
    }

    public final CommonIdentifiers component1() {
        return this.a;
    }

    public final RemoteConfigMetaInfo component2() {
        return this.b;
    }

    public final Object component3() {
        return this.c;
    }

    public final ModuleFullRemoteConfig copy(CommonIdentifiers commonIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object object) {
        Intrinsics.checkNotNullParameter((Object)commonIdentifiers, (String)"commonIdentifiers");
        Intrinsics.checkNotNullParameter((Object)remoteConfigMetaInfo, (String)"remoteConfigMetaInfo");
        return new ModuleFullRemoteConfig(commonIdentifiers, remoteConfigMetaInfo, object);
    }

    public boolean equals(Object object) {
        block2: {
            block3: {
                if (this == object) break block2;
                if (!(object instanceof ModuleFullRemoteConfig)) break block3;
                object = (ModuleFullRemoteConfig)object;
                if (Intrinsics.areEqual((Object)this.a, (Object)((ModuleFullRemoteConfig)object).a) && Intrinsics.areEqual((Object)this.b, (Object)((ModuleFullRemoteConfig)object).b) && Intrinsics.areEqual((Object)this.c, (Object)((ModuleFullRemoteConfig)object).c)) break block2;
            }
            return false;
        }
        return true;
    }

    public final CommonIdentifiers getCommonIdentifiers() {
        return this.a;
    }

    public final Object getModuleConfig() {
        return this.c;
    }

    public final RemoteConfigMetaInfo getRemoteConfigMetaInfo() {
        return this.b;
    }

    public int hashCode() {
        Object object = this.a;
        int n7 = 0;
        int n8 = object != null ? ((CommonIdentifiers)object).hashCode() : 0;
        object = this.b;
        int n10 = object != null ? ((RemoteConfigMetaInfo)object).hashCode() : 0;
        object = this.c;
        if (object != null) {
            n7 = object.hashCode();
        }
        return (n8 * 31 + n10) * 31 + n7;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("ModuleFullRemoteConfig(commonIdentifiers=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", remoteConfigMetaInfo=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", moduleConfig=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

