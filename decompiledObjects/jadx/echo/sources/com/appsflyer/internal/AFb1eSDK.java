package com.appsflyer.internal;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes.dex */
public interface AFb1eSDK {

    @Metadata
    public static final class AFa1ySDK {
        public final float AFInAppEventParameterName;
        public final String AFInAppEventType;

        public AFa1ySDK(float f7, String str) {
            this.AFInAppEventParameterName = f7;
            this.AFInAppEventType = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1ySDK)) {
                return false;
            }
            AFa1ySDK aFa1ySDK = (AFa1ySDK) obj;
            return Intrinsics.a(Float.valueOf(this.AFInAppEventParameterName), Float.valueOf(aFa1ySDK.AFInAppEventParameterName)) && Intrinsics.a(this.AFInAppEventType, aFa1ySDK.AFInAppEventType);
        }

        public final int hashCode() {
            int floatToIntBits = Float.floatToIntBits(this.AFInAppEventParameterName) * 31;
            String str = this.AFInAppEventType;
            return floatToIntBits + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("BatteryData(level=");
            sb.append(this.AFInAppEventParameterName);
            sb.append(", charging=");
            sb.append(this.AFInAppEventType);
            sb.append(')');
            return sb.toString();
        }
    }

    @NotNull
    AFa1ySDK AFInAppEventType(@NotNull Context context);
}
