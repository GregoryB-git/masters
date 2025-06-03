// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.text.i;
import android.net.Uri;
import android.app.Activity;
import kotlin.Metadata;

@Metadata
public final class AFf1ySDK implements AFf1vSDK
{
    private String AFInAppEventType;
    
    private static String AFKeystoreWrapper(final Activity activity) {
        final Uri afInAppEventType = AFb1nSDK.AFInAppEventType(activity);
        String string;
        if (afInAppEventType != null) {
            string = afInAppEventType.toString();
        }
        else {
            string = null;
        }
        String s = string;
        if (string == null) {
            s = "";
        }
        if (valueOf(s)) {
            return null;
        }
        return s;
    }
    
    private static boolean valueOf(final String s) {
        return i.s(s, "android-app://", false, 2, null);
    }
    
    @Override
    public final void AFInAppEventParameterName(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        final String afInAppEventType = this.AFInAppEventType;
        if (afInAppEventType == null || afInAppEventType.length() == 0) {
            this.AFInAppEventType = AFKeystoreWrapper(activity);
        }
    }
    
    @Override
    public final String valueOf(final Activity activity) {
        final String afInAppEventType = this.AFInAppEventType;
        this.AFInAppEventType = null;
        if (afInAppEventType != null && afInAppEventType.length() != 0) {
            return afInAppEventType;
        }
        return AFKeystoreWrapper(activity);
    }
    
    @NotNull
    @Override
    public final String values(final Activity activity) {
        final Uri afInAppEventType = AFb1nSDK.AFInAppEventType(activity);
        String string;
        if (afInAppEventType != null) {
            string = afInAppEventType.toString();
        }
        else {
            string = null;
        }
        String s = string;
        if (string == null) {
            s = "";
        }
        return s;
    }
}
