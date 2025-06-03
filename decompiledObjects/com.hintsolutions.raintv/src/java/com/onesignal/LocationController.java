/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.HandlerThread
 *  com.onesignal.GMSLocationController
 *  com.onesignal.HMSLocationController
 *  com.onesignal.LocationController$LocationPromptCompletionHandler
 *  com.onesignal.LocationPermissionController
 *  com.onesignal.OSSyncService
 *  com.onesignal.OneSignalPrefs
 *  com.onesignal.PackageInfoHelper
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.math.BigDecimal
 *  java.math.RoundingMode
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.ConcurrentHashMap
 */
package com.onesignal;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.AndroidSupportV4Compat;
import com.onesignal.GMSLocationController;
import com.onesignal.GetPackageInfoResult;
import com.onesignal.HMSLocationController;
import com.onesignal.LocationController;
import com.onesignal.LocationPermissionController;
import com.onesignal.OSSyncService;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalPrefs;
import com.onesignal.PackageInfoHelper;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

class LocationController {
    public static final long BACKGROUND_UPDATE_TIME_MS = 570000L;
    public static final long FOREGROUND_UPDATE_TIME_MS = 270000L;
    private static final long TIME_BACKGROUND_SEC = 600L;
    private static final long TIME_FOREGROUND_SEC = 300L;
    public static Context classContext;
    public static Thread fallbackFailThread;
    public static Location lastLocation;
    private static boolean locationCoarse;
    private static LocationHandlerThread locationHandlerThread;
    private static ConcurrentHashMap<PermissionType, LocationHandler> locationHandlers;
    private static final List<LocationPromptCompletionHandler> promptHandlers;
    public static String requestPermission;
    public static final Object syncLock;

    static {
        promptHandlers = new ArrayList();
        locationHandlers = new ConcurrentHashMap();
        syncLock = new Object(){};
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void addPromptHandlerIfAvailable(LocationHandler locationHandler) {
        List<LocationPromptCompletionHandler> list;
        if (!(locationHandler instanceof LocationPromptCompletionHandler)) return;
        List<LocationPromptCompletionHandler> list2 = list = promptHandlers;
        synchronized (list2) {
            list.add((Object)(locationHandler));
            return;
        }
    }

    private static void backgroundLocationPermissionLogic(Context object, boolean bl, boolean bl2) {
        if (((GetPackageInfoResult)(object = PackageInfoHelper.Companion.getInfo((Context)object, object.getPackageName(), 4096))).getSuccessful() && ((GetPackageInfoResult)object).getPackageInfo() != null) {
            if (Arrays.asList((Object[])((GetPackageInfoResult)object).getPackageInfo().requestedPermissions).contains((Object)"android.permission.ACCESS_BACKGROUND_LOCATION")) {
                requestPermission = "android.permission.ACCESS_BACKGROUND_LOCATION";
            }
            if (requestPermission != null && bl) {
                LocationPermissionController.INSTANCE.prompt(bl2, requestPermission);
            } else {
                LocationController.sendAndClearPromptHandlers(bl, OneSignal.PromptActionResult.PERMISSION_GRANTED);
                LocationController.startGetLocation();
            }
            return;
        }
        LocationController.sendAndClearPromptHandlers(bl, OneSignal.PromptActionResult.ERROR);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static void fireComplete(LocationPoint locationPoint) {
        HashMap hashMap = new HashMap();
        Class<LocationController> clazz = LocationController.class;
        // MONITORENTER : com.onesignal.LocationController.class
        hashMap.putAll(locationHandlers);
        locationHandlers.clear();
        Thread thread = fallbackFailThread;
        // MONITOREXIT : clazz
        Iterator iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            ((LocationHandler)hashMap.get((Object)((PermissionType)((Object)iterator.next())))).onComplete(locationPoint);
        }
        if (thread != null && !Thread.currentThread().equals((Object)thread)) {
            thread.interrupt();
        }
        if (thread == fallbackFailThread) {
            clazz = LocationController.class;
            // MONITORENTER : com.onesignal.LocationController.class
            if (thread == fallbackFailThread) {
                fallbackFailThread = null;
            }
            // MONITOREXIT : clazz
        }
        LocationController.setLastLocationTime(OneSignal.getTime().getCurrentTimeMillis());
    }

    public static void fireCompleteForLocation(Location location) {
        Object object = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LocationController fireCompleteForLocation with location: ");
        stringBuilder.append((Object)location);
        OneSignal.Log(object, stringBuilder.toString());
        object = new LocationPoint();
        ((LocationPoint)object).accuracy = Float.valueOf((float)location.getAccuracy());
        ((LocationPoint)object).bg = OneSignal.isInForeground() ^ true;
        ((LocationPoint)object).type = locationCoarse ^ 1;
        ((LocationPoint)object).timeStamp = location.getTime();
        if (locationCoarse) {
            ((LocationPoint)object).lat = new BigDecimal(location.getLatitude()).setScale(7, RoundingMode.HALF_UP).doubleValue();
            ((LocationPoint)object).log = new BigDecimal(location.getLongitude()).setScale(7, RoundingMode.HALF_UP).doubleValue();
        } else {
            ((LocationPoint)object).lat = location.getLatitude();
            ((LocationPoint)object).log = location.getLongitude();
        }
        LocationController.fireComplete((LocationPoint)object);
        LocationController.scheduleUpdate(classContext);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void fireFailedComplete() {
        Object object;
        Object object2 = object = syncLock;
        synchronized (object2) {
            if (LocationController.isGooglePlayServicesAvailable()) {
                GMSLocationController.fireFailedComplete();
            } else if (LocationController.isHMSAvailable()) {
                HMSLocationController.fireFailedComplete();
            }
        }
        LocationController.fireComplete(null);
    }

    private static long getLastLocationTime() {
        return OneSignalPrefs.getLong((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"OS_LAST_LOCATION_TIME", (long)-600000L);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static void getLocation(Context object, boolean bl, boolean bl2, LocationHandler object2) {
        void var2_10;
        int n;
        int n2;
        void var1_9;
        block9: {
            block10: {
                void var0_8;
                int n3;
                block12: {
                    block13: {
                        OneSignal.PromptActionResult promptActionResult;
                        List list;
                        block14: {
                            block11: {
                                void var3_11;
                                LocationController.addPromptHandlerIfAvailable((LocationHandler)var3_11);
                                classContext = object;
                                locationHandlers.put((Object)var3_11.getType(), (Object)var3_11);
                                if (!OneSignal.isLocationShared()) {
                                    LocationController.sendAndClearPromptHandlers((boolean)var1_9, OneSignal.PromptActionResult.ERROR);
                                    LocationController.fireFailedComplete();
                                    return;
                                }
                                int n4 = AndroidSupportV4Compat.ContextCompat.checkSelfPermission(object, "android.permission.ACCESS_FINE_LOCATION");
                                n2 = -1;
                                if (n4 == -1) {
                                    n3 = AndroidSupportV4Compat.ContextCompat.checkSelfPermission(object, "android.permission.ACCESS_COARSE_LOCATION");
                                    locationCoarse = true;
                                } else {
                                    n3 = -1;
                                }
                                n = Build.VERSION.SDK_INT;
                                if (n >= 29) {
                                    n2 = AndroidSupportV4Compat.ContextCompat.checkSelfPermission(object, "android.permission.ACCESS_BACKGROUND_LOCATION");
                                }
                                if (n4 == 0) break block9;
                                GetPackageInfoResult getPackageInfoResult = PackageInfoHelper.Companion.getInfo(object, object.getPackageName(), 4096);
                                if (!getPackageInfoResult.getSuccessful() || getPackageInfoResult.getPackageInfo() == null) break block10;
                                list = Arrays.asList((Object[])getPackageInfoResult.getPackageInfo().requestedPermissions);
                                promptActionResult = OneSignal.PromptActionResult.PERMISSION_DENIED;
                                if (!list.contains((Object)"android.permission.ACCESS_FINE_LOCATION")) break block11;
                                requestPermission = "android.permission.ACCESS_FINE_LOCATION";
                                OneSignal.PromptActionResult promptActionResult2 = promptActionResult;
                                break block12;
                            }
                            if (!list.contains((Object)"android.permission.ACCESS_COARSE_LOCATION")) break block13;
                            if (n3 == 0) break block14;
                            requestPermission = "android.permission.ACCESS_COARSE_LOCATION";
                            OneSignal.PromptActionResult promptActionResult3 = promptActionResult;
                            break block12;
                        }
                        OneSignal.PromptActionResult promptActionResult4 = promptActionResult;
                        if (n >= 29) {
                            OneSignal.PromptActionResult promptActionResult5 = promptActionResult;
                            if (list.contains((Object)"android.permission.ACCESS_BACKGROUND_LOCATION")) {
                                requestPermission = "android.permission.ACCESS_BACKGROUND_LOCATION";
                                OneSignal.PromptActionResult promptActionResult6 = promptActionResult;
                            }
                        }
                        break block12;
                    }
                    OneSignal.onesignalLog(OneSignal.LOG_LEVEL.INFO, "Location permissions not added on AndroidManifest file");
                    OneSignal.PromptActionResult promptActionResult = OneSignal.PromptActionResult.LOCATION_PERMISSIONS_MISSING_MANIFEST;
                }
                if (requestPermission != null && var1_9 != false) {
                    LocationPermissionController.INSTANCE.prompt((boolean)var2_10, requestPermission);
                    return;
                }
                if (n3 == 0) {
                    LocationController.sendAndClearPromptHandlers((boolean)var1_9, OneSignal.PromptActionResult.PERMISSION_GRANTED);
                    LocationController.startGetLocation();
                    return;
                }
                LocationController.sendAndClearPromptHandlers((boolean)var1_9, (OneSignal.PromptActionResult)var0_8);
                LocationController.fireFailedComplete();
                return;
            }
            LocationController.sendAndClearPromptHandlers((boolean)var1_9, OneSignal.PromptActionResult.ERROR);
            return;
        }
        if (n >= 29 && n2 != 0) {
            LocationController.backgroundLocationPermissionLogic(object, (boolean)var1_9, (boolean)var2_10);
            return;
        }
        LocationController.sendAndClearPromptHandlers((boolean)var1_9, OneSignal.PromptActionResult.PERMISSION_GRANTED);
        LocationController.startGetLocation();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static LocationHandlerThread getLocationHandlerThread() {
        Object object;
        if (locationHandlerThread != null) return locationHandlerThread;
        Object object2 = object = syncLock;
        synchronized (object2) {
            LocationHandlerThread locationHandlerThread;
            if (LocationController.locationHandlerThread != null) return LocationController.locationHandlerThread;
            LocationController.locationHandlerThread = locationHandlerThread = new LocationHandlerThread();
            return LocationController.locationHandlerThread;
        }
    }

    private static boolean hasLocationPermission(Context context) {
        boolean bl = AndroidSupportV4Compat.ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || AndroidSupportV4Compat.ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
        return bl;
    }

    public static boolean isGooglePlayServicesAvailable() {
        boolean bl = OSUtils.isAndroidDeviceType() && OSUtils.hasGMSLocationLibrary();
        return bl;
    }

    public static boolean isHMSAvailable() {
        boolean bl = OSUtils.isHuaweiDeviceType() && OSUtils.hasHMSLocationLibrary();
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void onFocusChange() {
        Object object;
        Object object2 = object = syncLock;
        synchronized (object2) {
            if (LocationController.isGooglePlayServicesAvailable()) {
                GMSLocationController.onFocusChange();
                return;
            }
            if (LocationController.isHMSAvailable()) {
                HMSLocationController.onFocusChange();
            }
            return;
        }
    }

    public static boolean scheduleUpdate(Context context) {
        if (!LocationController.hasLocationPermission(context)) {
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "LocationController scheduleUpdate not possible, location permission not enabled");
            return false;
        }
        if (!OneSignal.isLocationShared()) {
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "LocationController scheduleUpdate not possible, location shared not enabled");
            return false;
        }
        long l = OneSignal.getTime().getCurrentTimeMillis() - LocationController.getLastLocationTime();
        long l2 = OneSignal.isInForeground() ? 300L : 600L;
        l2 *= 1000L;
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LocationController scheduleUpdate lastTime: ");
        stringBuilder.append(l);
        stringBuilder.append(" minTime: ");
        stringBuilder.append(l2);
        OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
        OSSyncService.getInstance().scheduleLocationUpdateTask(context, l2 - l);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void sendAndClearPromptHandlers(boolean bl, OneSignal.PromptActionResult promptActionResult) {
        List<LocationPromptCompletionHandler> list;
        if (!bl) {
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "LocationController sendAndClearPromptHandlers from non prompt flow");
            return;
        }
        List<LocationPromptCompletionHandler> list2 = list = promptHandlers;
        synchronized (list2) {
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "LocationController calling prompt handlers");
            Iterator iterator = list.iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    promptHandlers.clear();
                    return;
                }
                (iterator.next()).onAnswered(promptActionResult);
            }
        }
    }

    private static void setLastLocationTime(long l) {
        OneSignalPrefs.saveLong((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"OS_LAST_LOCATION_TIME", (long)l);
    }

    public static void startGetLocation() {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = z2.t("LocationController startGetLocation with lastLocation: ");
        stringBuilder.append((Object)lastLocation);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        try {
            if (LocationController.isGooglePlayServicesAvailable()) {
                GMSLocationController.startGetLocation();
            } else if (LocationController.isHMSAvailable()) {
                HMSLocationController.startGetLocation();
            } else {
                OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "LocationController startGetLocation not possible, no location dependency found");
                LocationController.fireFailedComplete();
            }
        }
        catch (Throwable throwable) {
            OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "Location permission exists but there was an error initializing: ", throwable);
            LocationController.fireFailedComplete();
        }
    }

    public static interface LocationHandler {
        public PermissionType getType();

        public void onComplete(LocationPoint var1);
    }

    public static class LocationHandlerThread
    extends HandlerThread {
        public Handler mHandler;

        public LocationHandlerThread() {
            super("OSH_LocationHandlerThread");
            this.start();
            this.mHandler = new Handler(this.getLooper());
        }
    }

    public static class LocationPoint {
        public Float accuracy;
        public Boolean bg;
        public Double lat;
        public Double log;
        public Long timeStamp;
        public Integer type;

        public String toString() {
            StringBuilder stringBuilder = z2.t("LocationPoint{lat=");
            stringBuilder.append((Object)this.lat);
            stringBuilder.append(", log=");
            stringBuilder.append((Object)this.log);
            stringBuilder.append(", accuracy=");
            stringBuilder.append((Object)this.accuracy);
            stringBuilder.append(", type=");
            stringBuilder.append((Object)this.type);
            stringBuilder.append(", bg=");
            stringBuilder.append((Object)this.bg);
            stringBuilder.append(", timeStamp=");
            stringBuilder.append((Object)this.timeStamp);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    public static final class PermissionType
    extends Enum<PermissionType> {
        private static final PermissionType[] $VALUES;
        public static final /* enum */ PermissionType PROMPT_LOCATION;
        public static final /* enum */ PermissionType STARTUP;
        public static final /* enum */ PermissionType SYNC_SERVICE;

        static {
            PermissionType permissionType;
            PermissionType permissionType2;
            PermissionType permissionType3;
            STARTUP = permissionType3 = new PermissionType();
            PROMPT_LOCATION = permissionType2 = new PermissionType();
            SYNC_SERVICE = permissionType = new PermissionType();
            $VALUES = new PermissionType[]{permissionType3, permissionType2, permissionType};
        }

        public static PermissionType valueOf(String string2) {
            return (PermissionType)Enum.valueOf(PermissionType.class, (String)string2);
        }

        public static PermissionType[] values() {
            return (PermissionType[])$VALUES.clone();
        }
    }
}

