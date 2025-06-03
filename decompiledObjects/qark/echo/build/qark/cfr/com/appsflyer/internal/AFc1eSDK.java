/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFc1aSDK;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class AFc1eSDK {
    @NotNull
    public final String AFInAppEventType;
    @NotNull
    public final AFc1aSDK valueOf;
    public final String values;

    public AFc1eSDK(@NotNull String string2, String string3, @NotNull AFc1aSDK aFc1aSDK) {
        Intrinsics.checkNotNullParameter(string2, "");
        Intrinsics.checkNotNullParameter((Object)aFc1aSDK, "");
        this.AFInAppEventType = string2;
        this.values = string3;
        this.valueOf = aFc1aSDK;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof AFc1eSDK)) {
            return false;
        }
        object = (AFc1eSDK)object;
        if (!Intrinsics.a(this.AFInAppEventType, object.AFInAppEventType)) {
            return false;
        }
        if (!Intrinsics.a(this.values, object.values)) {
            return false;
        }
        if (this.valueOf != object.valueOf) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int n8 = this.AFInAppEventType.hashCode();
        String string2 = this.values;
        int n9 = string2 == null ? 0 : string2.hashCode();
        return (n8 * 31 + n9) * 31 + this.valueOf.hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HostMeta(name=");
        stringBuilder.append(this.AFInAppEventType);
        stringBuilder.append(", prefix=");
        stringBuilder.append(this.values);
        stringBuilder.append(", method=");
        stringBuilder.append((Object)this.valueOf);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

