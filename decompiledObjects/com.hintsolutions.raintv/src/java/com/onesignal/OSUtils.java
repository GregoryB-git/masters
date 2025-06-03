/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.DeadSystemException
 *  android.os.Handler
 *  android.os.Looper
 *  android.telephony.TelephonyManager
 *  android.text.TextUtils
 *  androidx.annotation.Keep
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.core.app.NotificationManagerCompat
 *  com.google.android.gms.location.LocationListener
 *  com.google.firebase.messaging.FirebaseMessaging
 *  com.huawei.agconnect.config.AGConnectServicesConfig
 *  com.huawei.hms.aaid.HmsInstanceId
 *  com.huawei.hms.api.HuaweiApiAvailability
 *  com.huawei.hms.location.LocationCallback
 *  com.onesignal.PackageInfoHelper
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.NoClassDefFoundError
 *  java.lang.Object
 *  java.lang.OutOfMemoryError
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Random
 *  java.util.Set
 *  java.util.UUID
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.regex.Pattern
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadSystemException;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.gms.location.LocationListener;
import com.google.firebase.messaging.FirebaseMessaging;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.location.LocationCallback;
import com.onesignal.ApplicationInfoHelper;
import com.onesignal.GetPackageInfoResult;
import com.onesignal.OneSignal;
import com.onesignal.PackageInfoHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class OSUtils {
    private static final int HMS_AVAILABLE_SUCCESSFUL = 0;
    private static final String HMS_CORE_SERVICES_PACKAGE = "com.huawei.hwid";
    public static int MAX_NETWORK_REQUEST_ATTEMPT_COUNT = 3;
    public static final int[] NO_RETRY_NETWROK_REQUEST_STATUS_CODES = new int[]{401, 402, 403, 404, 410};
    private static final String PREFER_HMS_METADATA_NAME = "com.onesignal.preferHMS";
    public static final int UNINITIALIZABLE_STATUS = -999;

    public static boolean areNotificationsEnabled(Context context) {
        try {
            boolean bl = NotificationManagerCompat.from((Context)OneSignal.appContext).areNotificationsEnabled();
            return bl;
        }
        catch (Throwable throwable) {
            return true;
        }
    }

    private Integer checkAndroidSupportLibrary(Context context) {
        boolean bl = OSUtils.hasWakefulBroadcastReceiver();
        boolean bl2 = OSUtils.hasNotificationManagerCompat();
        if (!bl && !bl2) {
            OneSignal.Log(OneSignal.LOG_LEVEL.FATAL, "Could not find the Android Support Library. Please make sure it has been correctly added to your project.");
            return -3;
        }
        if (bl && bl2) {
            if (Build.VERSION.SDK_INT >= 26 && OSUtils.getTargetSdkVersion(context) >= 26 && !OSUtils.hasJobIntentService()) {
                OneSignal.Log(OneSignal.LOG_LEVEL.FATAL, "The included Android Support Library is to old or incomplete. Please update to the 26.0.0 revision or newer.");
                return -5;
            }
            return null;
        }
        OneSignal.Log(OneSignal.LOG_LEVEL.FATAL, "The included Android Support Library is to old or incomplete. Please update to the 26.0.0 revision or newer.");
        return -5;
    }

    @NonNull
    public static Collection<String> extractStringsFromCollection(@Nullable Collection<Object> object2) {
        ArrayList arrayList = new ArrayList();
        if (object2 == null) {
            return arrayList;
        }
        for (Object object2 : object2) {
            if (!(object2 instanceof String)) continue;
            arrayList.add((Object)((String)object2));
        }
        return arrayList;
    }

    public static String getManifestMeta(Context context, String string2) {
        if ((context = OSUtils.getManifestMetaBundle(context)) != null) {
            return context.getString(string2);
        }
        return null;
    }

    public static boolean getManifestMetaBoolean(Context context, String string2) {
        if ((context = OSUtils.getManifestMetaBundle(context)) != null) {
            return context.getBoolean(string2);
        }
        return false;
    }

    public static Bundle getManifestMetaBundle(Context context) {
        if ((context = ApplicationInfoHelper.Companion.getInfo(context)) == null) {
            return null;
        }
        return context.metaData;
    }

    public static int getRandomDelay(int n, int n2) {
        return new Random().nextInt(n2 + 1 - n) + n;
    }

    public static String getResourceString(Context context, String string2, String string3) {
        Resources resources = context.getResources();
        int n = resources.getIdentifier(string2, "string", context.getPackageName());
        if (n != 0) {
            return resources.getString(n);
        }
        return string3;
    }

    public static String getRootCauseMessage(@NonNull Throwable throwable) {
        return OSUtils.getRootCauseThrowable(throwable).getMessage();
    }

    @NonNull
    public static Throwable getRootCauseThrowable(@NonNull Throwable throwable) {
        while (throwable.getCause() != null && throwable.getCause() != throwable) {
            throwable = throwable.getCause();
        }
        return throwable;
    }

    public static Uri getSoundUri(Context object, String string2) {
        int n;
        Resources resources = object.getResources();
        object = object.getPackageName();
        if (OSUtils.isValidResourceName(string2) && (n = resources.getIdentifier(string2, "raw", (String)object)) != 0) {
            string2 = new StringBuilder();
            string2.append("android.resource://");
            string2.append((String)object);
            string2.append("/");
            string2.append(n);
            return Uri.parse((String)string2.toString());
        }
        n = resources.getIdentifier("onesignal_default_sound", "raw", (String)object);
        if (n != 0) {
            string2 = new StringBuilder();
            string2.append("android.resource://");
            string2.append((String)object);
            string2.append("/");
            string2.append(n);
            return Uri.parse((String)string2.toString());
        }
        return null;
    }

    public static int getTargetSdkVersion(Context context) {
        if ((context = ApplicationInfoHelper.Companion.getInfo(context)) == null) {
            return 15;
        }
        return context.targetSdkVersion;
    }

    public static boolean hasAllHMSLibrariesForPushKit() {
        boolean bl = OSUtils.hasHMSAGConnectLibrary() && OSUtils.hasHMSPushKitLibrary();
        return bl;
    }

    public static boolean hasConfigChangeFlag(Activity activity, int n) {
        boolean bl = false;
        try {
            int n2 = activity.getPackageManager().getActivityInfo((ComponentName)activity.getComponentName(), (int)0).configChanges;
            if ((n2 & n) != 0) {
                bl = true;
            }
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            nameNotFoundException.printStackTrace();
        }
        return bl;
    }

    public static boolean hasFCMLibrary() {
        try {
            boolean bl = OSUtils.opaqueHasClass(FirebaseMessaging.class);
            return bl;
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            return false;
        }
    }

    public static boolean hasGMSLocationLibrary() {
        try {
            boolean bl = OSUtils.opaqueHasClass(LocationListener.class);
            return bl;
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            return false;
        }
    }

    private static boolean hasHMSAGConnectLibrary() {
        try {
            boolean bl = OSUtils.opaqueHasClass(AGConnectServicesConfig.class);
            return bl;
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            return false;
        }
    }

    private static boolean hasHMSAvailabilityLibrary() {
        try {
            boolean bl = OSUtils.opaqueHasClass(HuaweiApiAvailability.class);
            return bl;
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            return false;
        }
    }

    public static boolean hasHMSLocationLibrary() {
        try {
            boolean bl = OSUtils.opaqueHasClass(LocationCallback.class);
            return bl;
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            return false;
        }
    }

    private static boolean hasHMSPushKitLibrary() {
        try {
            boolean bl = OSUtils.opaqueHasClass(HmsInstanceId.class);
            return bl;
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            return false;
        }
    }

    private static boolean hasJobIntentService() {
        return true;
    }

    private static boolean hasNotificationManagerCompat() {
        return true;
    }

    private static boolean hasWakefulBroadcastReceiver() {
        return true;
    }

    public static boolean isAndroidDeviceType() {
        int n = new OSUtils().getDeviceType();
        boolean bl = true;
        if (n != 1) {
            bl = false;
        }
        return bl;
    }

    public static boolean isFireOSDeviceType() {
        boolean bl = new OSUtils().getDeviceType() == 2;
        return bl;
    }

    public static boolean isGMSInstalledAndEnabled() {
        return OSUtils.packageInstalledAndEnabled("com.google.android.gms");
    }

    @TargetApi(value=24)
    private static boolean isHMSCoreInstalledAndEnabled() {
        HuaweiApiAvailability huaweiApiAvailability = HuaweiApiAvailability.getInstance();
        boolean bl = false;
        try {
            int n = huaweiApiAvailability.isHuaweiMobileServicesAvailable(OneSignal.appContext);
            if (n == 0) {
                bl = true;
            }
            return bl;
        }
        catch (RuntimeException runtimeException) {
            if (runtimeException.getCause() instanceof DeadSystemException) {
                return false;
            }
            throw runtimeException;
        }
    }

    private static boolean isHMSCoreInstalledAndEnabledFallback() {
        return OSUtils.packageInstalledAndEnabled(HMS_CORE_SERVICES_PACKAGE);
    }

    public static boolean isHuaweiDeviceType() {
        boolean bl = new OSUtils().getDeviceType() == 13;
        return bl;
    }

    public static boolean isRunningOnMainThread() {
        return Thread.currentThread().equals((Object)Looper.getMainLooper().getThread());
    }

    public static boolean isStringNotEmpty(String string2) {
        return TextUtils.isEmpty((CharSequence)string2) ^ true;
    }

    public static boolean isValidEmail(String string2) {
        if (string2 == null) {
            return false;
        }
        return Pattern.compile((String)"^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$").matcher((CharSequence)string2).matches();
    }

    public static boolean isValidResourceName(String string2) {
        boolean bl = string2 != null && !string2.matches("^[0-9]");
        return bl;
    }

    @Nullable
    public static Bundle jsonStringToBundle(@NonNull String string2) {
        try {
            JSONObject jSONObject = new JSONObject(string2);
            string2 = new Bundle();
            Iterator iterator = jSONObject.keys();
            while (iterator.hasNext()) {
                String string3 = (String)iterator.next();
                string2.putString(string3, jSONObject.getString(string3));
            }
            return string2;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return null;
        }
    }

    public static <T> Set<T> newConcurrentSet() {
        return Collections.newSetFromMap((Map)new ConcurrentHashMap());
    }

    public static Set<String> newStringSetFromJSONArray(JSONArray jSONArray) throws JSONException {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); ++i) {
            hashSet.add((Object)jSONArray.getString(i));
        }
        return hashSet;
    }

    @Keep
    private static boolean opaqueHasClass(Class<?> clazz) {
        return true;
    }

    private static void openURLInBrowser(@NonNull Uri uri) {
        uri = OSUtils.openURLInBrowserIntent(uri);
        OneSignal.appContext.startActivity((Intent)uri);
    }

    public static void openURLInBrowser(@NonNull String string2) {
        OSUtils.openURLInBrowser(Uri.parse((String)string2.trim()));
    }

    @NonNull
    public static Intent openURLInBrowserIntent(@NonNull Uri uri) {
        SchemaType schemaType = uri.getScheme() != null ? SchemaType.fromString(uri.getScheme()) : null;
        SchemaType schemaType2 = schemaType;
        Uri uri2 = uri;
        if (schemaType == null) {
            schemaType2 = schemaType = SchemaType.HTTP;
            uri2 = uri;
            if (!uri.toString().contains((CharSequence)"://")) {
                uri2 = z2.t("http://");
                uri2.append(uri.toString());
                uri2 = Uri.parse((String)uri2.toString());
                schemaType2 = schemaType;
            }
        }
        if (1.$SwitchMap$com$onesignal$OSUtils$SchemaType[schemaType2.ordinal()] != 1) {
            uri = new Intent("android.intent.action.VIEW", uri2);
        } else {
            uri = Intent.makeMainSelectorActivity((String)"android.intent.action.MAIN", (String)"android.intent.category.APP_BROWSER");
            uri.setData(uri2);
        }
        uri.addFlags(0x10000000);
        return uri;
    }

    private static boolean packageInstalledAndEnabled(@NonNull String object) {
        if (!((GetPackageInfoResult)(object = PackageInfoHelper.Companion.getInfo(OneSignal.appContext, (String)object, 128))).getSuccessful()) {
            return false;
        }
        if ((object = ((GetPackageInfoResult)object).getPackageInfo()) == null) {
            return false;
        }
        return ((PackageInfo)object).applicationInfo.enabled;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static long[] parseVibrationPattern(JSONObject object) {
        int n;
        Object object2;
        try {
            object2 = object.opt("vib_pt");
            object = object2 instanceof String ? new JSONArray((String)object2) : (JSONArray)object2;
            object2 = new long[object.length()];
            n = 0;
        }
        catch (JSONException jSONException) {
            return null;
        }
        while (true) {
            if (n >= object.length()) return object2;
            object2[n] = object.optLong(n);
            ++n;
            continue;
            break;
        }
    }

    public static void runOnMainThreadDelayed(Runnable runnable, int n) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, (long)n);
    }

    public static void runOnMainUIThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public static boolean shouldLogMissingAppIdError(@Nullable String string2) {
        if (string2 != null) {
            return false;
        }
        OneSignal.Log(OneSignal.LOG_LEVEL.INFO, "OneSignal was not initialized, ensure to always initialize OneSignal from the onCreate of your Application class.");
        return true;
    }

    public static boolean shouldRetryNetworkRequest(int n) {
        int[] nArray = NO_RETRY_NETWROK_REQUEST_STATUS_CODES;
        int n2 = nArray.length;
        for (int i = 0; i < n2; ++i) {
            if (n != nArray[i]) continue;
            return false;
        }
        return true;
    }

    public static void sleep(int n) {
        long l = n;
        try {
            Thread.sleep((long)l);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void startThreadWithRetry(@NonNull Thread thread) {
        boolean bl = false;
        while (!bl) {
            try {
                thread.start();
                return;
            }
            catch (OutOfMemoryError outOfMemoryError) {
                try {
                    Thread.sleep((long)250L);
                }
                catch (InterruptedException interruptedException) {}
            }
        }
    }

    private boolean supportsADM() {
        try {
            Class.forName((String)"com.amazon.device.messaging.ADM");
            return true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
    }

    private boolean supportsGooglePush() {
        if (!OSUtils.hasFCMLibrary()) {
            return false;
        }
        return OSUtils.isGMSInstalledAndEnabled();
    }

    private boolean supportsHMS() {
        if (OSUtils.hasHMSAvailabilityLibrary() && OSUtils.hasAllHMSLibrariesForPushKit()) {
            return OSUtils.isHMSCoreInstalledAndEnabled();
        }
        return false;
    }

    public Integer checkForGooglePushLibrary() {
        if (!OSUtils.hasFCMLibrary()) {
            OneSignal.Log(OneSignal.LOG_LEVEL.FATAL, "The Firebase FCM library is missing! Please make sure to include it in your project.");
            return -4;
        }
        return null;
    }

    public String getCarrierName() {
        Object var3_1 = null;
        try {
            String string2 = ((TelephonyManager)OneSignal.appContext.getSystemService("phone")).getNetworkOperatorName();
            boolean bl = "".equals((Object)string2);
            if (bl) {
                string2 = var3_1;
            }
            return string2;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }

    public int getDeviceType() {
        if (this.supportsADM()) {
            return 2;
        }
        boolean bl = this.supportsHMS();
        boolean bl2 = this.supportsGooglePush();
        int n = 13;
        if (bl2 && bl) {
            Context context = OneSignal.appContext;
            int n2 = context != null && OSUtils.getManifestMetaBoolean(context, PREFER_HMS_METADATA_NAME) ? 1 : 0;
            n2 = n2 != 0 ? n : 1;
            return n2;
        }
        if (bl2) {
            return 1;
        }
        if (bl) {
            return 13;
        }
        if (OSUtils.isGMSInstalledAndEnabled()) {
            return 1;
        }
        if (OSUtils.isHMSCoreInstalledAndEnabledFallback()) {
            return 13;
        }
        return 1;
    }

    public Integer getNetType() {
        NetworkInfo networkInfo = ((ConnectivityManager)OneSignal.appContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkInfo != null) {
            int n = networkInfo.getType();
            if (n != 1 && n != 9) {
                return 1;
            }
            return 0;
        }
        return null;
    }

    public int initializationChecker(Context context, String string2) {
        int n;
        int n2 = this.getDeviceType();
        try {
            UUID.fromString((String)string2);
        }
        catch (Throwable throwable) {
            OneSignal.Log(OneSignal.LOG_LEVEL.FATAL, "OneSignal AppId format is invalid.\nExample: 'b2f7f966-d8cc-11e4-bed1-df8f05be55ba'\n", throwable);
            return -999;
        }
        if ("b2f7f966-d8cc-11e4-bed1-df8f05be55ba".equals((Object)string2) || "5eb5a37e-b458-11e3-ac11-000c2940e62c".equals((Object)string2)) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "OneSignal Example AppID detected, please update to your app's id found on OneSignal.com");
        }
        int n3 = n = 1;
        if (n2 == 1) {
            string2 = this.checkForGooglePushLibrary();
            n3 = n;
            if (string2 != null) {
                n3 = string2.intValue();
            }
        }
        if ((context = this.checkAndroidSupportLibrary(context)) != null) {
            n3 = context.intValue();
        }
        return n3;
    }

    public static final class SchemaType
    extends Enum<SchemaType> {
        private static final SchemaType[] $VALUES;
        public static final /* enum */ SchemaType DATA;
        public static final /* enum */ SchemaType HTTP;
        public static final /* enum */ SchemaType HTTPS;
        private final String text;

        static {
            SchemaType schemaType;
            SchemaType schemaType2;
            SchemaType schemaType3;
            DATA = schemaType3 = new SchemaType("data");
            HTTPS = schemaType2 = new SchemaType("https");
            HTTP = schemaType = new SchemaType("http");
            $VALUES = new SchemaType[]{schemaType3, schemaType2, schemaType};
        }

        private SchemaType(String string3) {
            this.text = string3;
        }

        public static SchemaType fromString(String string2) {
            for (SchemaType schemaType : SchemaType.values()) {
                if (!schemaType.text.equalsIgnoreCase(string2)) continue;
                return schemaType;
            }
            return null;
        }

        public static SchemaType valueOf(String string2) {
            return (SchemaType)Enum.valueOf(SchemaType.class, (String)string2);
        }

        public static SchemaType[] values() {
            return (SchemaType[])$VALUES.clone();
        }
    }
}

