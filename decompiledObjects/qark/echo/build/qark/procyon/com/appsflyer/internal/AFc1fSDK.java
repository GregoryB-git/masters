// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public final class AFc1fSDK
{
    @NotNull
    final String AFInAppEventParameterName;
    @NotNull
    final String valueOf;
    
    public AFc1fSDK(@NotNull final String afInAppEventParameterName, @NotNull final String valueOf) {
        Intrinsics.checkNotNullParameter(afInAppEventParameterName, "");
        Intrinsics.checkNotNullParameter(valueOf, "");
        this.AFInAppEventParameterName = afInAppEventParameterName;
        this.valueOf = valueOf;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AFc1fSDK)) {
            return false;
        }
        final AFc1fSDK aFc1fSDK = (AFc1fSDK)o;
        return Intrinsics.a(this.AFInAppEventParameterName, aFc1fSDK.AFInAppEventParameterName) && Intrinsics.a(this.valueOf, aFc1fSDK.valueOf);
    }
    
    @Override
    public final int hashCode() {
        return this.AFInAppEventParameterName.hashCode() * 31 + this.valueOf.hashCode();
    }
    
    @NotNull
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("HostConfig(prefix=");
        sb.append(this.AFInAppEventParameterName);
        sb.append(", host=");
        sb.append(this.valueOf);
        sb.append(')');
        return sb.toString();
    }
}
