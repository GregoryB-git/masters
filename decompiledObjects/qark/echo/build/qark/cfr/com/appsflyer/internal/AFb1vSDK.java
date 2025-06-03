/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.InstallSourceInfo
 *  android.content.pm.PackageManager
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFa1rSDK;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.k;
import com.appsflyer.internal.l;
import com.appsflyer.internal.m;
import com.appsflyer.internal.n;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
public final class AFb1vSDK {
    @NotNull
    private final Map<String, Object> AFInAppEventParameterName;
    @NotNull
    private final String AFInAppEventType;
    private final PackageManager values;

    public AFb1vSDK() {
    }

    public AFb1vSDK(AFb1bSDK object, AFb1gSDK aFb1gSDK) {
        Intrinsics.checkNotNullParameter(object, "");
        Intrinsics.checkNotNullParameter(aFb1gSDK, "");
        this.AFInAppEventParameterName = new LinkedHashMap();
        object = object.AFInAppEventType;
        object = object != null ? object.getPackageManager() : null;
        this.values = object;
        object = aFb1gSDK.valueOf.AFInAppEventType.getPackageName();
        Intrinsics.checkNotNullExpressionValue(object, "");
        this.AFInAppEventType = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static JSONObject AFKeystoreWrapper(String string2) {
        if ((string2 = AFa1rSDK.valueOf(string2)) == null) return string2;
        {
            try {
                boolean bl = AppsFlyerProperties.getInstance().getBoolean("disableProxy", false);
                boolean bl2 = string2.optBoolean("monitor", false);
                Object object = AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly();
                if (bl2 && !bl) {
                    object.AFKeystoreWrapper();
                } else {
                    object.AFInAppEventType();
                    object.values();
                }
                if (!string2.has("ol_id")) return string2;
                {
                    object = string2.optString("ol_scheme", null);
                    String string3 = string2.optString("ol_domain", null);
                    String string4 = string2.optString("ol_ver", null);
                    if (object != null) {
                        AppsFlyerProperties.getInstance().set("onelinkScheme", (String)object);
                    }
                    if (string3 != null) {
                        AppsFlyerProperties.getInstance().set("onelinkDomain", string3);
                    }
                    if (string4 == null) return string2;
                    {
                        AppsFlyerProperties.getInstance().set("onelinkVersion", string4);
                        return string2;
                    }
                }
            }
            catch (Throwable throwable) {}
            StringBuilder stringBuilder = new StringBuilder("Error in handleResponse: ");
            stringBuilder.append(throwable.getMessage());
            AFLogger.afErrorLogForExcManagerOnly(stringBuilder.toString(), throwable);
            AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventType();
            AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().values();
        }
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NotNull
    public final Map<String, Object> AFInAppEventParameterName() {
        if (this.AFInAppEventParameterName.isEmpty()) {
            Object object;
            try {
                object = this.values;
                if (object != null && (object = object.getInstallerPackageName(this.AFInAppEventType)) != null) {
                    this.AFInAppEventParameterName.put((Object)"installer_package", object);
                }
            }
            catch (Exception exception) {
                AFLogger.afErrorLog("Exception while getting the app's installer package. ", (Throwable)exception);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                Map<String, Object> map = this.AFInAppEventParameterName;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String string2 = this.AFInAppEventType;
                PackageManager packageManager = this.values;
                object = linkedHashMap;
                if (packageManager != null) {
                    string2 = k.a(packageManager, string2);
                    object = linkedHashMap;
                    if (string2 != null) {
                        Intrinsics.checkNotNullExpressionValue(string2, "");
                        linkedHashMap = new LinkedHashMap();
                        object = l.a((InstallSourceInfo)string2);
                        if (object != null) {
                            linkedHashMap.put((Object)"initiating_package", object);
                        }
                        if ((object = m.a((InstallSourceInfo)string2)) != null) {
                            linkedHashMap.put((Object)"installing_package", object);
                        }
                        string2 = n.a((InstallSourceInfo)string2);
                        object = linkedHashMap;
                        if (string2 != null) {
                            linkedHashMap.put((Object)"originating_package", (Object)string2);
                            object = linkedHashMap;
                        }
                    }
                }
                map.put((Object)"install_source_info", object);
            }
        }
        return this.AFInAppEventParameterName;
    }
}

