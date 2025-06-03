/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.net.ConnectivityManager
 *  android.net.Network
 *  android.net.NetworkCapabilities
 *  android.net.Uri
 *  android.os.Environment
 *  android.os.StatFs
 *  android.os.SystemClock
 *  android.provider.Settings
 *  android.provider.Settings$Secure
 *  android.view.Display
 *  android.view.WindowManager
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileNotFoundException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 *  java.nio.charset.Charset
 *  java.text.SimpleDateFormat
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.Properties
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.Display;
import android.view.WindowManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1cSDK;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFa1fSDK;
import com.appsflyer.internal.AFa1iSDK;
import com.appsflyer.internal.AFa1kSDK;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFb1eSDK;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFb1xSDK;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.AFe1mSDK;
import com.appsflyer.internal.AFe1vSDK;
import com.appsflyer.internal.AFe1wSDK;
import com.appsflyer.internal.AFf1iSDK;
import com.appsflyer.internal.AFf1tSDK;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
public final class AFb1nSDK
implements AFe1vSDK {
    @NotNull
    private final AFb1eSDK AFInAppEventParameterName;
    @NotNull
    private final Context AFInAppEventType;
    @NotNull
    private final AFa1iSDK AFKeystoreWrapper;
    @NotNull
    private final AFb1dSDK AFLogger;
    @NotNull
    private final AFe1wSDK afDebugLog;
    @NotNull
    private final AFa1kSDK afErrorLog;
    @NotNull
    private final AFb1gSDK afInfoLog;
    @NotNull
    private final AFe1mSDK afRDLog;
    @NotNull
    private final AFb1xSDK getLevel;
    @NotNull
    private final AFf1tSDK valueOf;
    @NotNull
    private final AFf1iSDK values;

    public AFb1nSDK() {
    }

    public AFb1nSDK(Context context, AFf1tSDK aFf1tSDK, AFb1eSDK aFb1eSDK, AFf1iSDK aFf1iSDK, AFa1iSDK aFa1iSDK, AFe1mSDK aFe1mSDK, AFb1dSDK aFb1dSDK, AFb1gSDK aFb1gSDK, AFa1kSDK aFa1kSDK, AFe1wSDK aFe1wSDK, AFb1xSDK aFb1xSDK) {
        Intrinsics.checkNotNullParameter((Object)context, "");
        Intrinsics.checkNotNullParameter(aFf1tSDK, "");
        Intrinsics.checkNotNullParameter(aFb1eSDK, "");
        Intrinsics.checkNotNullParameter(aFf1iSDK, "");
        Intrinsics.checkNotNullParameter(aFa1iSDK, "");
        Intrinsics.checkNotNullParameter(aFe1mSDK, "");
        Intrinsics.checkNotNullParameter(aFb1dSDK, "");
        Intrinsics.checkNotNullParameter(aFb1gSDK, "");
        Intrinsics.checkNotNullParameter(aFa1kSDK, "");
        Intrinsics.checkNotNullParameter(aFe1wSDK, "");
        Intrinsics.checkNotNullParameter(aFb1xSDK, "");
        this.AFInAppEventType = context;
        this.valueOf = aFf1tSDK;
        this.AFInAppEventParameterName = aFb1eSDK;
        this.values = aFf1iSDK;
        this.AFKeystoreWrapper = aFa1iSDK;
        this.afRDLog = aFe1mSDK;
        this.AFLogger = aFb1dSDK;
        this.afInfoLog = aFb1gSDK;
        this.afErrorLog = aFa1kSDK;
        this.afDebugLog = aFe1wSDK;
        this.getLevel = aFb1xSDK;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SuppressLint(value={"PrivateApi"})
    private static String AFInAppEventParameterName(String object) {
        try {
            object = Class.forName((String)"android.os.SystemProperties").getMethod("get", new Class[]{String.class}).invoke((Object)null, new Object[]{object});
            if (object != null) {
                return (String)object;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        catch (Throwable throwable) {}
        AFLogger.afErrorLog(throwable.getMessage(), throwable);
        return null;
    }

    public static Uri AFInAppEventType(Activity activity) {
        if (activity != null && activity.getIntent() != null) {
            return activity.getReferrer();
        }
        return null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static String AFInAppEventType(File file, String string2) {
        Throwable throwable622;
        File file2;
        block20 : {
            File file3;
            block18 : {
                Properties properties;
                block19 : {
                    block17 : {
                        if (file == null) {
                            return null;
                        }
                        properties = new Properties();
                        file2 = new InputStreamReader((InputStream)new FileInputStream(file), Charset.defaultCharset());
                        properties.load((Reader)file2);
                        AFLogger.afInfoLog("Found PreInstall property!");
                        string2 = properties.getProperty(string2);
                        try {
                            file2.close();
                            return string2;
                        }
                        catch (Throwable throwable2) {
                            AFLogger.afErrorLog(throwable2.getMessage(), throwable2);
                            return string2;
                        }
                        catch (Throwable throwable3) {
                            file = file2;
                            break block17;
                        }
                        catch (Throwable throwable4) {
                            file = null;
                        }
                    }
                    file2 = file;
                    AFLogger.afErrorLog(file3.getMessage(), (Throwable)file3);
                    if (file == null) return null;
                    try {
                        file.close();
                        return null;
                    }
                    catch (Throwable throwable5) {
                        AFLogger.afErrorLog(throwable5.getMessage(), throwable5);
                        return null;
                    }
                    catch (FileNotFoundException fileNotFoundException) {}
                    file3 = null;
                    break block19;
                    catch (FileNotFoundException fileNotFoundException) {
                        file3 = file2;
                    }
                }
                file2 = file3;
                try {
                    properties = new StringBuilder("PreInstall file wasn't found: ");
                    file2 = file3;
                    properties.append(file.getAbsolutePath());
                    file2 = file3;
                    AFLogger.afDebugLog(properties.toString());
                    if (file3 == null) return null;
                    break block18;
                }
                catch (Throwable throwable622) {}
                break block20;
            }
            file3.close();
            return null;
        }
        if (file2 == null) throw throwable622;
        try {
            file2.close();
            throw throwable622;
        }
        catch (Throwable throwable7) {
            AFLogger.afErrorLog(throwable7.getMessage(), throwable7);
        }
        throw throwable622;
    }

    private boolean AFLogger$LogLevel() {
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (!appsFlyerProperties.getBoolean("collectAndroidIdForceByUser", false) && !appsFlyerProperties.getBoolean("collectIMEIForceByUser", false)) {
            AFa1eSDK.valueOf();
            if (AFa1eSDK.AFInAppEventParameterName(this.AFInAppEventType)) {
                return false;
            }
        }
        return true;
    }

    private static boolean valueOf(File file) {
        if (file != null && file.exists()) {
            return false;
        }
        return true;
    }

    private static File values(String string2) {
        if (string2 != null) {
            try {
                if (i.f0(string2).toString().length() > 0) {
                    string2 = new File(i.f0(string2).toString());
                    return string2;
                }
            }
            catch (Throwable throwable) {
                AFLogger.afErrorLog(throwable.getMessage(), throwable);
            }
        }
        return null;
    }

    @NotNull
    @Override
    public final String AFInAppEventParameterName() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long l8 = statFs.getBlockSizeLong();
        long l9 = statFs.getAvailableBlocksLong();
        long l10 = statFs.getBlockCountLong();
        double d8 = Math.pow((double)2.0, (double)20.0);
        l9 = (long)((double)(l9 * l8) / d8);
        l8 = (long)((double)(l10 * l8) / d8);
        statFs = new StringBuilder();
        statFs.append(l9);
        statFs.append('/');
        statFs.append(l8);
        return statFs.toString();
    }

    @Override
    public final void AFInAppEventParameterName(Map<String, Object> map) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(map, "");
        Object object = this.AFInAppEventType.getSystemService("window");
        object = object instanceof WindowManager ? (WindowManager)object : null;
        if (object == null) {
            return;
        }
        int n8 = object.getDefaultDisplay().getRotation();
        object = n8 != 0 ? (n8 != 1 ? (n8 != 2 ? (n8 != 3 ? string2 : "lr") : "pr") : "l") : "p";
        map.put((Object)"sc_o", object);
    }

    @Override
    public final String AFInAppEventType() {
        boolean bl = this.AFLogger.values("INSTALL_STORE");
        String string2 = null;
        if (bl) {
            return this.AFLogger.values("INSTALL_STORE", null);
        }
        if (this.afRDLog()) {
            String string3;
            string2 = string3 = AppsFlyerProperties.getInstance().getString("api_store_value");
            if (string3 == null) {
                string2 = this.afInfoLog.AFInAppEventType("AF_STORE");
            }
        }
        this.AFLogger.AFInAppEventParameterName("INSTALL_STORE", string2);
        return string2;
    }

    @Override
    public final void AFInAppEventType(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        boolean bl = AppsFlyerProperties.getInstance().getBoolean("disableCollectNetworkData", false);
        Object object = this.afErrorLog.AFInAppEventParameterName(this.AFInAppEventType);
        String string2 = object.AFInAppEventParameterName;
        Intrinsics.checkNotNullExpressionValue(string2, "");
        map.put((Object)"network", (Object)string2);
        if (bl) {
            return;
        }
        string2 = object.valueOf;
        if (string2 != null) {
            map.put((Object)"operator", (Object)string2);
        }
        if ((object = object.AFInAppEventType) != null) {
            map.put((Object)"carrier", object);
        }
    }

    @Override
    public final void AFInAppEventType(boolean bl, Map<String, Object> map, int n8) {
        Intrinsics.checkNotNullParameter(map, "");
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"cpu_abi", (Object)AFb1nSDK.AFInAppEventParameterName("ro.product.cpu.abi"));
        hashMap.put((Object)"cpu_abi2", (Object)AFb1nSDK.AFInAppEventParameterName("ro.product.cpu.abi2"));
        hashMap.put((Object)"arch", (Object)AFb1nSDK.AFInAppEventParameterName("os.arch"));
        hashMap.put((Object)"build_display_id", (Object)AFb1nSDK.AFInAppEventParameterName("ro.build.display.id"));
        if (bl) {
            Object object = this.AFInAppEventParameterName.AFInAppEventType(this.AFInAppEventType);
            float f8 = object.AFInAppEventParameterName;
            object = object.AFInAppEventType;
            hashMap.put((Object)"btl", (Object)String.valueOf((float)f8));
            if (object != null) {
                hashMap.put((Object)"btch", object);
            }
            if (n8 <= 2) {
                hashMap.putAll(this.values.valueOf());
            }
        }
        hashMap.put((Object)"dim", this.AFKeystoreWrapper.valueOf(this.AFInAppEventType));
        map.put((Object)"deviceData", (Object)hashMap);
    }

    @Override
    public final String AFKeystoreWrapper() {
        return AFa1fSDK.values(this.AFInAppEventType.getApplicationContext().getPackageManager(), this.AFInAppEventType.getApplicationContext().getPackageName());
    }

    @Override
    public final void AFKeystoreWrapper(Map<String, Object> map, boolean bl) {
        Intrinsics.checkNotNullParameter(map, "");
        String string2 = this.getLevel.AFInAppEventParameterName();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        map.put((Object)"platformextension", (Object)string2);
        if (bl) {
            map.put((Object)"platform_extension_v2", this.valueOf.AFKeystoreWrapper());
        }
    }

    @Override
    public final String AFLogger() {
        String string2;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String string3 = appsFlyerProperties.getString("preInstallName");
        if (string3 != null) {
            return string3;
        }
        boolean bl = this.AFLogger.values("preInstallName");
        Object var4_4 = null;
        if (bl) {
            string2 = this.AFLogger.values("preInstallName", null);
        } else {
            if (this.afRDLog()) {
                string3 = string2 = AFb1nSDK.values(AFb1nSDK.AFInAppEventParameterName("ro.appsflyer.preinstall.path"));
                if (AFb1nSDK.valueOf((File)string2)) {
                    string3 = AFb1nSDK.values(this.afInfoLog.AFInAppEventType("AF_PRE_INSTALL_PATH"));
                }
                string2 = string3;
                if (AFb1nSDK.valueOf((File)string3)) {
                    string2 = AFb1nSDK.values("/data/local/tmp/pre_install.appsflyer");
                }
                string3 = string2;
                if (AFb1nSDK.valueOf((File)string2)) {
                    string3 = AFb1nSDK.values("/etc/pre_install.appsflyer");
                }
                if (AFb1nSDK.valueOf((File)string3)) {
                    string3 = var4_4;
                } else {
                    string2 = this.AFInAppEventType.getPackageName();
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    string3 = AFb1nSDK.AFInAppEventType((File)string3, string2);
                }
                if (string3 == null) {
                    string3 = this.afInfoLog.AFInAppEventType("AF_PRE_INSTALL_NAME");
                }
            }
            string2 = string3;
            if (string3 != null) {
                this.AFLogger.AFInAppEventParameterName("preInstallName", string3);
                string2 = string3;
            }
        }
        if (string2 != null) {
            appsFlyerProperties.set("preInstallName", string2);
        }
        return string2;
    }

    @Override
    public final boolean afDebugLog() {
        return Boolean.parseBoolean((String)this.AFLogger.values("sentSuccessfully", null));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean afErrorLog() {
        int n8;
        Object object;
        int n9;
        Network[] arrnetwork;
        block5 : {
            try {
                object = this.AFInAppEventType.getSystemService("connectivity");
                if (object == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
                }
                object = (ConnectivityManager)object;
                arrnetwork = object.getAllNetworks();
                Intrinsics.checkNotNullExpressionValue(arrnetwork, "");
                n8 = arrnetwork.length;
                n9 = 0;
                break block5;
            }
            catch (Exception exception) {}
            AFLogger.afErrorLog("Failed collecting ivc data", (Throwable)exception);
            return false;
        }
        while (n9 < n8) {
            NetworkCapabilities networkCapabilities = object.getNetworkCapabilities(arrnetwork[n9]);
            if (networkCapabilities != null && networkCapabilities.hasTransport(4) && !networkCapabilities.hasCapability(15)) {
                return true;
            }
            ++n9;
        }
        return false;
    }

    @Override
    public final String afInfoLog() {
        String string2;
        String string3 = string2 = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string2 == null) {
            string3 = this.afInfoLog.AFInAppEventType("AF_STORE");
        }
        return string3;
    }

    @Override
    public final boolean afRDLog() {
        if (!this.AFLogger.values("appsFlyerCount")) {
            return true;
        }
        return false;
    }

    @Override
    public final long valueOf() {
        return System.currentTimeMillis();
    }

    @Override
    public final void valueOf(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFe1mSDK aFe1mSDK = this.afRDLog;
        HashMap hashMap = new HashMap(aFe1mSDK.AFKeystoreWrapper);
        aFe1mSDK.AFKeystoreWrapper.clear();
        this.afRDLog.valueOf.AFInAppEventType("gcd");
        Intrinsics.checkNotNullExpressionValue((Object)hashMap, "");
        if (hashMap.isEmpty() ^ true) {
            map = AFa1eSDK.values(map);
            Intrinsics.checkNotNullExpressionValue(map, "");
            map.put((Object)"gcd", (Object)hashMap);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void valueOf(Map<String, Object> map, String string2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(string2, "");
        try {
            String string3 = this.AFLogger.values("prev_event_name", null);
            if (string3 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", this.AFLogger.valueOf("prev_event_timestamp", -1L));
                jSONObject.put("prev_event_name", (Object)string3);
                map.put((Object)"prev_event", (Object)jSONObject);
            }
            this.AFLogger.AFInAppEventParameterName("prev_event_name", string2);
            this.AFLogger.AFInAppEventParameterName("prev_event_timestamp", System.currentTimeMillis());
            return;
        }
        catch (Exception exception) {}
        AFLogger.afErrorLog("Error while processing previous event.", (Throwable)exception);
    }

    @Override
    public final long values() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    @Override
    public final String values(SimpleDateFormat simpleDateFormat) {
        String string2;
        String string3 = "";
        Intrinsics.checkNotNullParameter((Object)simpleDateFormat, "");
        String string4 = string2 = this.AFLogger.values("appsFlyerFirstInstall", null);
        if (string2 == null) {
            string4 = string3;
            if (this.afRDLog()) {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                string4 = simpleDateFormat.format(new Date());
            }
            this.AFLogger.AFInAppEventParameterName("appsFlyerFirstInstall", string4);
        }
        AFLogger.afInfoLog("AppsFlyer: first launch date: ".concat(String.valueOf((Object)string4)));
        return string4;
    }

    @Override
    public final void values(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        String string2 = AppsFlyerProperties.getInstance().getString("oneLinkSlug");
        String string3 = AppsFlyerProperties.getInstance().getString("onelinkVersion");
        if (string2 != null) {
            map.put((Object)"onelink_id", (Object)string2);
        }
        if (string3 != null) {
            map.put((Object)"onelink_ver", (Object)string3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SuppressLint(value={"HardwareIds"})
    @Override
    public final void values(Map<String, Object> map, String object) {
        Object object2;
        String string2;
        block15 : {
            block16 : {
                block17 : {
                    Intrinsics.checkNotNullParameter(map, "");
                    object2 = AppsFlyerProperties.getInstance();
                    if (object2.getBoolean("deviceTrackingDisabled", false)) {
                        map.put((Object)"deviceTrackingDisabled", (Object)"true");
                        return;
                    }
                    string2 = this.afDebugLog.valueOf(this.AFLogger);
                    if (string2 != null && string2.length() != 0) {
                        map.put((Object)"imei", (Object)string2);
                    }
                    boolean bl = object2.getBoolean("collectAndroidId", false);
                    object2 = this.AFLogger.values("androidIdCached", null);
                    if (!bl || object != null && object.length() != 0) break block17;
                    if (!this.AFLogger$LogLevel()) break block16;
                    try {
                        object = Settings.Secure.getString((ContentResolver)this.AFInAppEventType.getContentResolver(), (String)"android_id");
                        if (object != null) break block15;
                        if (object2 != null) {
                            AFLogger.afDebugLog("use cached AndroidId: ".concat((String)object2));
                            object = object2;
                        }
                        break block16;
                    }
                    catch (Exception exception) {
                        if (object2 != null) {
                            AFLogger.afDebugLog("use cached AndroidId: ".concat((String)object2));
                            object = object2;
                        } else {
                            object = null;
                        }
                        AFLogger.afErrorLog(exception.getMessage(), (Throwable)exception);
                    }
                    break block15;
                }
                if (object != null) break block15;
            }
            object = null;
        }
        if (object != null) {
            this.AFLogger.AFInAppEventParameterName("androidIdCached", (String)object);
            map.put((Object)"android_id", object);
        } else {
            AFLogger.afInfoLog("Android ID was not collected.");
        }
        object2 = AFa1cSDK.values(this.AFInAppEventType);
        if (object2 != null) {
            object = new LinkedHashMap();
            string2 = object2.values;
            Intrinsics.checkNotNullExpressionValue(string2, "");
            object.put((Object)"isManual", (Object)string2);
            string2 = object2.valueOf;
            Intrinsics.checkNotNullExpressionValue(string2, "");
            object.put((Object)"val", (Object)string2);
            object2 = object2.AFInAppEventType;
            if (object2 != null) {
                object.put((Object)"isLat", object2);
            }
            map.put((Object)"oaid", object);
        }
    }
}

