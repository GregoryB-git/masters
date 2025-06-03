/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  java.lang.Object
 *  java.lang.String
 */
package com.appsflyer.internal;

import android.app.Activity;
import com.appsflyer.internal.AFb1nSDK;
import com.appsflyer.internal.AFf1vSDK;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class AFf1ySDK
implements AFf1vSDK {
    private String AFInAppEventType;

    private static String AFKeystoreWrapper(Activity object) {
        object = (object = AFb1nSDK.AFInAppEventType((Activity)object)) != null ? object.toString() : null;
        Object object2 = object;
        if (object == null) {
            object2 = "";
        }
        if (AFf1ySDK.valueOf((String)object2)) {
            return null;
        }
        return object2;
    }

    private static boolean valueOf(String string2) {
        return i.s(string2, "android-app://", false, 2, null);
    }

    @Override
    public final void AFInAppEventParameterName(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter((Object)activity, "");
        String string2 = this.AFInAppEventType;
        if (string2 == null || string2.length() == 0) {
            this.AFInAppEventType = AFf1ySDK.AFKeystoreWrapper(activity);
        }
    }

    @Override
    public final String valueOf(Activity activity) {
        String string2 = this.AFInAppEventType;
        this.AFInAppEventType = null;
        if (string2 != null && string2.length() != 0) {
            return string2;
        }
        return AFf1ySDK.AFKeystoreWrapper(activity);
    }

    @NotNull
    @Override
    public final String values(Activity object) {
        object = (object = AFb1nSDK.AFInAppEventType((Activity)object)) != null ? object.toString() : null;
        Object object2 = object;
        if (object == null) {
            object2 = "";
        }
        return object2;
    }
}

