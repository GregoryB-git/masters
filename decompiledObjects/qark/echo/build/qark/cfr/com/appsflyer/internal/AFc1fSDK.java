/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.appsflyer.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class AFc1fSDK {
    @NotNull
    final String AFInAppEventParameterName;
    @NotNull
    final String valueOf;

    public AFc1fSDK(@NotNull String string2, @NotNull String string3) {
        Intrinsics.checkNotNullParameter(string2, "");
        Intrinsics.checkNotNullParameter(string3, "");
        this.AFInAppEventParameterName = string2;
        this.valueOf = string3;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof AFc1fSDK)) {
            return false;
        }
        object = (AFc1fSDK)object;
        if (!Intrinsics.a(this.AFInAppEventParameterName, object.AFInAppEventParameterName)) {
            return false;
        }
        if (!Intrinsics.a(this.valueOf, object.valueOf)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.AFInAppEventParameterName.hashCode() * 31 + this.valueOf.hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HostConfig(prefix=");
        stringBuilder.append(this.AFInAppEventParameterName);
        stringBuilder.append(", host=");
        stringBuilder.append(this.valueOf);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

