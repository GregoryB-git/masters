/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Handler
 *  android.os.HandlerThread
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Set
 */
package com.onesignal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.OneSignal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class OneSignalPrefs {
    public static final String PREFS_EXISTING_PURCHASES = "ExistingPurchases";
    public static final String PREFS_GT_APP_ID = "GT_APP_ID";
    public static final String PREFS_GT_DO_NOT_SHOW_MISSING_GPS = "GT_DO_NOT_SHOW_MISSING_GPS";
    public static final String PREFS_GT_FIREBASE_TRACKING_ENABLED = "GT_FIREBASE_TRACKING_ENABLED";
    public static final String PREFS_GT_PLAYER_ID = "GT_PLAYER_ID";
    public static final String PREFS_GT_REGISTRATION_ID = "GT_REGISTRATION_ID";
    public static final String PREFS_GT_SOUND_ENABLED = "GT_SOUND_ENABLED";
    public static final String PREFS_GT_UNSENT_ACTIVE_TIME = "GT_UNSENT_ACTIVE_TIME";
    public static final String PREFS_GT_VIBRATE_ENABLED = "GT_VIBRATE_ENABLED";
    public static final String PREFS_ONESIGNAL = "OneSignal";
    public static final String PREFS_ONESIGNAL_ACCEPTED_NOTIFICATION_LAST = "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST";
    public static final String PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST = "PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST";
    public static final String PREFS_ONESIGNAL_EMAIL_ID_LAST = "PREFS_ONESIGNAL_EMAIL_ID_LAST";
    public static final String PREFS_ONESIGNAL_PERMISSION_ACCEPTED_LAST = "ONESIGNAL_PERMISSION_ACCEPTED_LAST";
    public static final String PREFS_ONESIGNAL_PLAYER_ID_LAST = "ONESIGNAL_PLAYER_ID_LAST";
    public static final String PREFS_ONESIGNAL_PUSH_TOKEN_LAST = "ONESIGNAL_PUSH_TOKEN_LAST";
    public static final String PREFS_ONESIGNAL_SUBSCRIPTION = "ONESIGNAL_SUBSCRIPTION";
    public static final String PREFS_ONESIGNAL_SUBSCRIPTION_LAST = "ONESIGNAL_SUBSCRIPTION_LAST";
    public static final String PREFS_ONESIGNAL_SYNCED_SUBSCRIPTION = "ONESIGNAL_SYNCED_SUBSCRIPTION";
    public static final String PREFS_ONESIGNAL_USERSTATE_DEPENDVALYES_ = "ONESIGNAL_USERSTATE_DEPENDVALYES_";
    public static final String PREFS_ONESIGNAL_USERSTATE_SYNCVALYES_ = "ONESIGNAL_USERSTATE_SYNCVALYES_";
    public static final String PREFS_ONESIGNAL_USER_PROVIDED_CONSENT = "ONESIGNAL_USER_PROVIDED_CONSENT";
    public static final String PREFS_OS_ATTRIBUTED_INFLUENCES = "PREFS_OS_ATTRIBUTED_INFLUENCES";
    public static final String PREFS_OS_CACHED_IAMS = "PREFS_OS_CACHED_IAMS";
    public static final String PREFS_OS_CLEAR_GROUP_SUMMARY_CLICK = "OS_CLEAR_GROUP_SUMMARY_CLICK";
    public static final String PREFS_OS_CLICKED_CLICK_IDS_IAMS = "PREFS_OS_CLICKED_CLICK_IDS_IAMS";
    public static final String PREFS_OS_DISABLE_GMS_MISSING_PROMPT = "PREFS_OS_DISABLE_GMS_MISSING_PROMPT";
    public static final String PREFS_OS_DISMISSED_IAMS = "PREFS_OS_DISPLAYED_IAMS";
    public static final String PREFS_OS_EMAIL_ID = "OS_EMAIL_ID";
    public static final String PREFS_OS_ETAG_PREFIX = "PREFS_OS_ETAG_PREFIX_";
    public static final String PREFS_OS_FILTER_OTHER_GCM_RECEIVERS = "OS_FILTER_OTHER_GCM_RECEIVERS";
    public static final String PREFS_OS_HTTP_CACHE_PREFIX = "PREFS_OS_HTTP_CACHE_PREFIX_";
    public static final String PREFS_OS_IMPRESSIONED_IAMS = "PREFS_OS_IMPRESSIONED_IAMS";
    public static final String PREFS_OS_LAST_LOCATION_TIME = "OS_LAST_LOCATION_TIME";
    public static final String PREFS_OS_LAST_SESSION_TIME = "OS_LAST_SESSION_TIME";
    public static final String PREFS_OS_LAST_TIME_IAM_DISMISSED = "PREFS_OS_LAST_TIME_IAM_DISMISSED";
    public static final String PREFS_OS_LOCATION_SHARED = "PREFS_OS_LOCATION_SHARED";
    public static final String PREFS_OS_OUTCOMES_V2 = "PREFS_OS_OUTCOMES_V2";
    public static final String PREFS_OS_PAGE_IMPRESSIONED_IAMS = "PREFS_OS_PAGE_IMPRESSIONED_IAMS";
    public static final String PREFS_OS_RECEIVE_RECEIPTS_ENABLED = "PREFS_OS_RECEIVE_RECEIPTS_ENABLED";
    public static final String PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT = "PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT";
    public static final String PREFS_OS_RESTORE_TTL_FILTER = "OS_RESTORE_TTL_FILTER";
    public static final String PREFS_OS_SMS_ID = "PREFS_OS_SMS_ID";
    public static final String PREFS_OS_SMS_ID_LAST = "PREFS_OS_SMS_ID_LAST";
    public static final String PREFS_OS_SMS_NUMBER_LAST = "PREFS_OS_SMS_NUMBER_LAST";
    public static final String PREFS_OS_UNSENT_ATTRIBUTED_ACTIVE_TIME = "OS_UNSENT_ATTRIBUTED_ACTIVE_TIME";
    public static final String PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED = "PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED";
    public static final String PREFS_PLAYER_PURCHASES = "GTPlayerPurchases";
    public static final String PREFS_PURCHASE_TOKENS = "purchaseTokens";
    public static final String PREFS_TRIGGERS = "OneSignalTriggers";
    public static WritePrefHandlerThread prefsHandler;
    public static HashMap<String, HashMap<String, Object>> prefsToApply;

    static {
        OneSignalPrefs.initializePool();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    private static Object get(String string2, String string3, Class clazz, Object object) {
        HashMap hashMap;
        HashMap hashMap2 = hashMap = (HashMap)prefsToApply.get((Object)string2);
        synchronized (hashMap2) {
            if (clazz.equals(Object.class) && hashMap.containsKey((Object)string3)) {
                return Boolean.TRUE;
            }
            Object object2 = hashMap.get((Object)string3);
            if (object2 != null) return object2;
            if (!hashMap.containsKey((Object)string3)) {
                // MONITOREXIT @DISABLED, blocks:[2, 9] lbl8 : w: MONITOREXIT : var6_5
                string2 = OneSignalPrefs.getSharedPrefsByName(string2);
                if (string2 == null) {
                    return object;
                }
                if (clazz.equals(String.class)) {
                    return string2.getString(string3, (String)object);
                }
                if (clazz.equals(Boolean.class)) {
                    return string2.getBoolean(string3, ((Boolean)object).booleanValue());
                }
                if (clazz.equals(Integer.class)) {
                    return string2.getInt(string3, ((Integer)object).intValue());
                }
                if (clazz.equals(Long.class)) {
                    return string2.getLong(string3, ((Long)object).longValue());
                }
                if (clazz.equals(Set.class)) {
                    return string2.getStringSet(string3, (Set)object);
                }
                if (!clazz.equals(Object.class)) return null;
                return string2.contains(string3);
            }
            return object2;
        }
    }

    public static boolean getBool(String string2, String string3, boolean bl) {
        return (Boolean)OneSignalPrefs.get(string2, string3, Boolean.class, bl);
    }

    public static int getInt(String string2, String string3, int n) {
        return (Integer)OneSignalPrefs.get(string2, string3, Integer.class, n);
    }

    public static long getLong(String string2, String string3, long l) {
        return (Long)OneSignalPrefs.get(string2, string3, Long.class, l);
    }

    public static Object getObject(String string2, String string3, Object object) {
        return OneSignalPrefs.get(string2, string3, Object.class, object);
    }

    public static SharedPreferences getSharedPrefsByName(String string2) {
        Class<OneSignalPrefs> clazz = OneSignalPrefs.class;
        synchronized (OneSignalPrefs.class) {
            Object object;
            block5: {
                object = OneSignal.appContext;
                if (object != null) break block5;
                object = new StringBuilder();
                object.append("OneSignal.appContext null, could not read ");
                object.append(string2);
                object.append(" from getSharedPreferences.");
                string2 = object.toString();
                object = OneSignal.LOG_LEVEL.WARN;
                Throwable throwable = new Throwable();
                OneSignal.Log((OneSignal.LOG_LEVEL)((Object)object), string2, throwable);
                // ** MonitorExit[var3_2] (shouldn't be in output)
                return null;
            }
            string2 = object.getSharedPreferences(string2, 0);
            // ** MonitorExit[var3_2] (shouldn't be in output)
            return string2;
        }
    }

    public static String getString(String string2, String string3, String string4) {
        return (String)OneSignalPrefs.get(string2, string3, String.class, string4);
    }

    @Nullable
    public static Set<String> getStringSet(@NonNull String string2, @NonNull String string3, @Nullable Set<String> set) {
        return (Set)OneSignalPrefs.get(string2, string3, Set.class, set);
    }

    public static void initializePool() {
        HashMap hashMap;
        prefsToApply = hashMap = new HashMap();
        hashMap.put((Object)PREFS_ONESIGNAL, (Object)new HashMap());
        prefsToApply.put((Object)PREFS_PLAYER_PURCHASES, (Object)new HashMap());
        prefsToApply.put((Object)PREFS_TRIGGERS, (Object)new HashMap());
        prefsHandler = new WritePrefHandlerThread("OSH_WritePrefs");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void save(String string2, String string3, Object object) {
        String string4 = string2 = (HashMap)prefsToApply.get((Object)string2);
        synchronized (string4) {
            string2.put((Object)string3, object);
        }
        OneSignalPrefs.startDelayedWrite();
    }

    public static void saveBool(String string2, String string3, boolean bl) {
        OneSignalPrefs.save(string2, string3, bl);
    }

    public static void saveInt(String string2, String string3, int n) {
        OneSignalPrefs.save(string2, string3, n);
    }

    public static void saveLong(String string2, String string3, long l) {
        OneSignalPrefs.save(string2, string3, l);
    }

    public static void saveObject(String string2, String string3, Object object) {
        OneSignalPrefs.save(string2, string3, object);
    }

    public static void saveString(String string2, String string3, String string4) {
        OneSignalPrefs.save(string2, string3, string4);
    }

    public static void saveStringSet(@NonNull String string2, @NonNull String string3, @NonNull Set<String> set) {
        OneSignalPrefs.save(string2, string3, set);
    }

    public static void startDelayedWrite() {
        OneSignalPrefs.prefsHandler.startDelayedWrite();
    }

    public static class WritePrefHandlerThread
    extends HandlerThread {
        private static final int WRITE_CALL_DELAY_TO_BUFFER_MS = 200;
        private long lastSyncTime = 0L;
        @Nullable
        private Handler mHandler;
        private boolean threadStartCalled;

        public WritePrefHandlerThread(String string2) {
            super(string2);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void flushBufferToDisk() {
            Iterator iterator = prefsToApply.keySet().iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    this.lastSyncTime = OneSignal.getTime().getCurrentTimeMillis();
                    return;
                }
                String string2 = (String)iterator.next();
                SharedPreferences.Editor editor = OneSignalPrefs.getSharedPrefsByName(string2).edit();
                String string3 = string2 = (HashMap)prefsToApply.get((Object)string2);
                synchronized (string3) {
                    for (String string4 : string2.keySet()) {
                        Object object = string2.get((Object)string4);
                        if (object instanceof String) {
                            editor.putString(string4, (String)object);
                            continue;
                        }
                        if (object instanceof Boolean) {
                            editor.putBoolean(string4, ((Boolean)object).booleanValue());
                            continue;
                        }
                        if (object instanceof Integer) {
                            editor.putInt(string4, ((Integer)object).intValue());
                            continue;
                        }
                        if (object instanceof Long) {
                            editor.putLong(string4, ((Long)object).longValue());
                            continue;
                        }
                        if (object instanceof Set) {
                            editor.putStringSet(string4, (Set)object);
                            continue;
                        }
                        if (object != null) continue;
                        editor.remove(string4);
                    }
                    string2.clear();
                }
                editor.apply();
            }
        }

        private void scheduleFlushToDisk() {
            WritePrefHandlerThread writePrefHandlerThread = this;
            synchronized (writePrefHandlerThread) {
                Object object;
                block5: {
                    object = this.mHandler;
                    if (object != null) break block5;
                    return;
                }
                object.removeCallbacksAndMessages(null);
                if (this.lastSyncTime == 0L) {
                    this.lastSyncTime = OneSignal.getTime().getCurrentTimeMillis();
                }
                long l = this.lastSyncTime;
                long l2 = OneSignal.getTime().getCurrentTimeMillis();
                object = new Runnable(this){
                    public final WritePrefHandlerThread this$0;
                    {
                        this.this$0 = writePrefHandlerThread;
                    }

                    public void run() {
                        this.this$0.flushBufferToDisk();
                    }
                };
                this.mHandler.postDelayed((Runnable)object, l - l2 + 200L);
                return;
            }
        }

        private void startDelayedWrite() {
            WritePrefHandlerThread writePrefHandlerThread = this;
            synchronized (writePrefHandlerThread) {
                block4: {
                    Context context = OneSignal.appContext;
                    if (context != null) break block4;
                    return;
                }
                this.startThread();
                this.scheduleFlushToDisk();
                return;
            }
        }

        private void startThread() {
            if (this.threadStartCalled) {
                return;
            }
            this.start();
            this.threadStartCalled = true;
        }

        public void onLooperPrepared() {
            super.onLooperPrepared();
            this.mHandler = new Handler(this.getLooper());
            this.scheduleFlushToDisk();
        }
    }
}

