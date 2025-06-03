// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import android.content.pm.InstallSourceInfo;
import android.os.Build$VERSION;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import org.json.JSONObject;
import android.content.Context;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import android.content.pm.PackageManager;
import org.jetbrains.annotations.NotNull;
import java.util.Map;
import kotlin.Metadata;

@Metadata
public final class AFb1vSDK
{
    @NotNull
    private final Map<String, Object> AFInAppEventParameterName;
    @NotNull
    private final String AFInAppEventType;
    private final PackageManager values;
    
    public AFb1vSDK() {
    }
    
    public AFb1vSDK(final AFb1bSDK aFb1bSDK, final AFb1gSDK aFb1gSDK) {
        Intrinsics.checkNotNullParameter(aFb1bSDK, "");
        Intrinsics.checkNotNullParameter(aFb1gSDK, "");
        this.AFInAppEventParameterName = new LinkedHashMap<String, Object>();
        final Context afInAppEventType = aFb1bSDK.AFInAppEventType;
        PackageManager packageManager;
        if (afInAppEventType != null) {
            packageManager = afInAppEventType.getPackageManager();
        }
        else {
            packageManager = null;
        }
        this.values = packageManager;
        final String packageName = aFb1gSDK.valueOf.AFInAppEventType.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        this.AFInAppEventType = packageName;
    }
    
    public static JSONObject AFKeystoreWrapper(String value) {
        value = (String)AFa1rSDK.valueOf(value);
        if (value != null) {
            while (true) {
                try {
                    final boolean boolean1 = AppsFlyerProperties.getInstance().getBoolean("disableProxy", false);
                    final boolean optBoolean = ((JSONObject)value).optBoolean("monitor", false);
                    final AFb1tSDK afErrorLogForExcManagerOnly = AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly();
                    if (optBoolean && !boolean1) {
                        afErrorLogForExcManagerOnly.AFKeystoreWrapper();
                    }
                    else {
                        afErrorLogForExcManagerOnly.AFInAppEventType();
                        afErrorLogForExcManagerOnly.values();
                    }
                    if (((JSONObject)value).has("ol_id")) {
                        final String optString = ((JSONObject)value).optString("ol_scheme", (String)null);
                        final String optString2 = ((JSONObject)value).optString("ol_domain", (String)null);
                        final String optString3 = ((JSONObject)value).optString("ol_ver", (String)null);
                        if (optString != null) {
                            AppsFlyerProperties.getInstance().set("onelinkScheme", optString);
                        }
                        if (optString2 != null) {
                            AppsFlyerProperties.getInstance().set("onelinkDomain", optString2);
                        }
                        if (optString3 != null) {
                            AppsFlyerProperties.getInstance().set("onelinkVersion", optString3);
                            return (JSONObject)value;
                        }
                    }
                    return (JSONObject)value;
                    final StringBuilder sb = new StringBuilder("Error in handleResponse: ");
                    final Throwable t;
                    sb.append(t.getMessage());
                    AFLogger.afErrorLogForExcManagerOnly(sb.toString(), t);
                    AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventType();
                    AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().values();
                    return (JSONObject)value;
                }
                finally {}
                final Throwable t2;
                final Throwable t = t2;
                continue;
            }
        }
        return (JSONObject)value;
    }
    
    @NotNull
    public final Map<String, Object> AFInAppEventParameterName() {
        if (this.AFInAppEventParameterName.isEmpty()) {
            try {
                final PackageManager values = this.values;
                if (values != null) {
                    final String installerPackageName = values.getInstallerPackageName(this.AFInAppEventType);
                    if (installerPackageName != null) {
                        this.AFInAppEventParameterName.put("installer_package", installerPackageName);
                    }
                }
            }
            catch (Exception ex) {
                AFLogger.afErrorLog("Exception while getting the app's installer package. ", ex);
            }
            if (Build$VERSION.SDK_INT >= 30) {
                final Map<String, Object> afInAppEventParameterName = this.AFInAppEventParameterName;
                final LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
                final String afInAppEventType = this.AFInAppEventType;
                final PackageManager values2 = this.values;
                LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
                if (values2 != null) {
                    final InstallSourceInfo a = k.a(values2, afInAppEventType);
                    linkedHashMap2 = linkedHashMap;
                    if (a != null) {
                        Intrinsics.checkNotNullExpressionValue(a, "");
                        final LinkedHashMap<String, String> linkedHashMap3 = new LinkedHashMap<String, String>();
                        final String a2 = l.a(a);
                        if (a2 != null) {
                            linkedHashMap3.put("initiating_package", a2);
                        }
                        final String a3 = m.a(a);
                        if (a3 != null) {
                            linkedHashMap3.put("installing_package", a3);
                        }
                        final String a4 = n.a(a);
                        linkedHashMap2 = linkedHashMap3;
                        if (a4 != null) {
                            linkedHashMap3.put("originating_package", a4);
                            linkedHashMap2 = linkedHashMap3;
                        }
                    }
                }
                afInAppEventParameterName.put("install_source_info", linkedHashMap2);
            }
        }
        return this.AFInAppEventParameterName;
    }
}
