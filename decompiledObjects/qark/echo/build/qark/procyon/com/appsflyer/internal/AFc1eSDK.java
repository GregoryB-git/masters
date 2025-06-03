// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public final class AFc1eSDK
{
    @NotNull
    public final String AFInAppEventType;
    @NotNull
    public final AFc1aSDK valueOf;
    public final String values;
    
    public AFc1eSDK(@NotNull final String afInAppEventType, final String values, @NotNull final AFc1aSDK valueOf) {
        Intrinsics.checkNotNullParameter(afInAppEventType, "");
        Intrinsics.checkNotNullParameter(valueOf, "");
        this.AFInAppEventType = afInAppEventType;
        this.values = values;
        this.valueOf = valueOf;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AFc1eSDK)) {
            return false;
        }
        final AFc1eSDK aFc1eSDK = (AFc1eSDK)o;
        return Intrinsics.a(this.AFInAppEventType, aFc1eSDK.AFInAppEventType) && Intrinsics.a(this.values, aFc1eSDK.values) && this.valueOf == aFc1eSDK.valueOf;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.AFInAppEventType.hashCode();
        final String values = this.values;
        int hashCode2;
        if (values == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = values.hashCode();
        }
        return (hashCode * 31 + hashCode2) * 31 + this.valueOf.hashCode();
    }
    
    @NotNull
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("HostMeta(name=");
        sb.append(this.AFInAppEventType);
        sb.append(", prefix=");
        sb.append(this.values);
        sb.append(", method=");
        sb.append(this.valueOf);
        sb.append(')');
        return sb.toString();
    }
}
