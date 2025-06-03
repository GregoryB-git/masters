// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import kotlin.text.Regex;
import android.util.Base64;
import kotlin.text.b;
import java.security.MessageDigest;
import com.appsflyer.AFLogger;
import java.util.Arrays;
import kotlin.jvm.internal.x;
import java.util.Locale;
import kotlin.text.i;
import kotlin.jvm.internal.l;
import g6.a;
import kotlin.jvm.internal.Intrinsics;
import W5.m;
import V5.h;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public final class AFc1dSDK
{
    @NotNull
    public static String AFInAppEventParameterName;
    @NotNull
    public static String AFKeystoreWrapper;
    @NotNull
    private static final List<String> afDebugLog;
    private static AFc1fSDK afErrorLog;
    @NotNull
    public static final AFa1zSDK values;
    @NotNull
    public final h AFInAppEventType;
    @NotNull
    private final AFb1dSDK AFLogger;
    @NotNull
    private final h afRDLog;
    @NotNull
    private final AFb1gSDK valueOf;
    
    static {
        values = new AFa1zSDK((byte)0);
        AFc1dSDK.AFInAppEventParameterName = "https://%scdn-%ssettings.%s/android/v1/%s/settings";
        AFc1dSDK.AFKeystoreWrapper = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";
        afDebugLog = m.i("googleplay", "playstore", "googleplaystore");
    }
    
    public AFc1dSDK(@NotNull final AFb1gSDK valueOf, @NotNull final AFb1dSDK afLogger) {
        Intrinsics.checkNotNullParameter(valueOf, "");
        Intrinsics.checkNotNullParameter(afLogger, "");
        this.valueOf = valueOf;
        this.AFLogger = afLogger;
        this.afRDLog = V5.i.a(new a() {});
        this.AFInAppEventType = V5.i.a(new a() {});
    }
    
    public static boolean AFInAppEventType() {
        return AFc1dSDK.afErrorLog == null;
    }
    
    public static final void valueOf(final AFc1fSDK afErrorLog) {
        AFc1dSDK.afErrorLog = afErrorLog;
    }
    
    @NotNull
    public final String AFInAppEventParameterName() {
        AFc1aSDK aFc1aSDK;
        if (AFInAppEventType()) {
            aFc1aSDK = AFc1aSDK.AFKeystoreWrapper;
        }
        else {
            aFc1aSDK = AFc1aSDK.AFInAppEventType;
        }
        final int n = AFa1vSDK.values[aFc1aSDK.ordinal()];
        if (n == 1) {
            return "appsflyersdk.com";
        }
        if (n != 2) {
            if (n == 3) {
                return "";
            }
            throw new V5.l();
        }
        else {
            final AFc1fSDK afErrorLog = AFc1dSDK.afErrorLog;
            String valueOf;
            if (afErrorLog != null) {
                valueOf = afErrorLog.valueOf;
            }
            else {
                valueOf = null;
            }
            if (valueOf == null) {
                return "";
            }
            return valueOf;
        }
    }
    
    @NotNull
    public final String valueOf() {
        AFc1aSDK aFc1aSDK;
        if (AFInAppEventType()) {
            aFc1aSDK = AFc1aSDK.AFKeystoreWrapper;
        }
        else {
            aFc1aSDK = AFc1aSDK.AFInAppEventType;
        }
        final int n = AFa1vSDK.values[aFc1aSDK.ordinal()];
        if (n == 1) {
            return (String)this.AFInAppEventType.getValue();
        }
        if (n != 2) {
            if (n == 3) {
                return "";
            }
            throw new V5.l();
        }
        else {
            final AFc1fSDK afErrorLog = AFc1dSDK.afErrorLog;
            String afInAppEventParameterName;
            if (afErrorLog != null) {
                afInAppEventParameterName = afErrorLog.AFInAppEventParameterName;
            }
            else {
                afInAppEventParameterName = null;
            }
            if (afInAppEventParameterName == null) {
                return "";
            }
            return afInAppEventParameterName;
        }
    }
    
    @Metadata
    public static final class AFa1zSDK
    {
        private AFa1zSDK() {
        }
    }
}
