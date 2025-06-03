/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.appsflyer.internal;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public interface AFb1eSDK {
    @NotNull
    public AFa1ySDK AFInAppEventType(@NotNull Context var1);

    @Metadata
    public static final class AFa1ySDK {
        public final float AFInAppEventParameterName;
        public final String AFInAppEventType;

        public AFa1ySDK(float f8, String string2) {
            this.AFInAppEventParameterName = f8;
            this.AFInAppEventType = string2;
        }

        public final boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof AFa1ySDK)) {
                return false;
            }
            object = (AFa1ySDK)object;
            if (!Intrinsics.a((Object)Float.valueOf((float)this.AFInAppEventParameterName), (Object)Float.valueOf((float)object.AFInAppEventParameterName))) {
                return false;
            }
            if (!Intrinsics.a(this.AFInAppEventType, object.AFInAppEventType)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int n8 = Float.floatToIntBits((float)this.AFInAppEventParameterName);
            String string2 = this.AFInAppEventType;
            int n9 = string2 == null ? 0 : string2.hashCode();
            return n8 * 31 + n9;
        }

        @NotNull
        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("BatteryData(level=");
            stringBuilder.append(this.AFInAppEventParameterName);
            stringBuilder.append(", charging=");
            stringBuilder.append(this.AFInAppEventType);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

}

