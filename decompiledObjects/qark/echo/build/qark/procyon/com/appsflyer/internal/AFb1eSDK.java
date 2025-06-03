// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import android.content.Context;
import kotlin.Metadata;

@Metadata
public interface AFb1eSDK
{
    @NotNull
    AFa1ySDK AFInAppEventType(@NotNull final Context p0);
    
    @Metadata
    public static final class AFa1ySDK
    {
        public final float AFInAppEventParameterName;
        public final String AFInAppEventType;
        
        public AFa1ySDK(final float afInAppEventParameterName, final String afInAppEventType) {
            this.AFInAppEventParameterName = afInAppEventParameterName;
            this.AFInAppEventType = afInAppEventType;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof AFa1ySDK)) {
                return false;
            }
            final AFa1ySDK aFa1ySDK = (AFa1ySDK)o;
            return Intrinsics.a(this.AFInAppEventParameterName, aFa1ySDK.AFInAppEventParameterName) && Intrinsics.a(this.AFInAppEventType, aFa1ySDK.AFInAppEventType);
        }
        
        @Override
        public final int hashCode() {
            final int floatToIntBits = Float.floatToIntBits(this.AFInAppEventParameterName);
            final String afInAppEventType = this.AFInAppEventType;
            int hashCode;
            if (afInAppEventType == null) {
                hashCode = 0;
            }
            else {
                hashCode = afInAppEventType.hashCode();
            }
            return floatToIntBits * 31 + hashCode;
        }
        
        @NotNull
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("BatteryData(level=");
            sb.append(this.AFInAppEventParameterName);
            sb.append(", charging=");
            sb.append(this.AFInAppEventType);
            sb.append(')');
            return sb.toString();
        }
    }
}
