/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.NotificationChannel
 *  android.app.NotificationChannelGroup
 *  android.app.NotificationManager
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.DeadSystemException
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.RequiresApi
 *  com.onesignal.OneSignalNotificationManager
 *  com.onesignal.language.LanguageContext
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.math.BigInteger
 *  java.util.HashSet
 *  java.util.List
 *  java.util.regex.Pattern
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.DeadSystemException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.onesignal.OSNotificationGenerationJob;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalNotificationManager;
import com.onesignal.language.LanguageContext;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class NotificationChannelManager {
    private static final String CHANNEL_PREFIX = "OS_";
    private static final String DEFAULT_CHANNEL_ID = "fcm_fallback_notification_channel";
    private static final String RESTORE_CHANNEL_ID = "restored_OS_notifications";
    private static final Pattern hexPattern = Pattern.compile((String)"^([A-Fa-f0-9]{8})$");

    @RequiresApi(api=26)
    private static String createChannel(Context context, NotificationManager notificationManager, JSONObject object) throws JSONException {
        String string2;
        Object object2 = object.opt("chnl");
        object2 = object2 instanceof String ? new JSONObject((String)object2) : (JSONObject)object2;
        String string3 = DEFAULT_CHANNEL_ID;
        Object object3 = object2.optString("id", DEFAULT_CHANNEL_ID);
        if (!object3.equals((Object)"miscellaneous")) {
            string3 = object3;
        }
        object3 = object2.has("langs") && (object3 = object2.getJSONObject("langs")).has(string2 = LanguageContext.getInstance().getLanguage()) ? object3.optJSONObject(string2) : object2;
        string2 = new NotificationChannel(string3, (CharSequence)object3.optString("nm", "Miscellaneous"), NotificationChannelManager.priorityToImportance(object.optInt("pri", 6)));
        string2.setDescription(object3.optString("dscr", null));
        if (object2.has("grp_id")) {
            object2 = object2.optString("grp_id");
            notificationManager.createNotificationChannelGroup(new NotificationChannelGroup((String)object2, (CharSequence)object3.optString("grp_nm")));
            string2.setGroup((String)object2);
        }
        if (object.has("ledc")) {
            object2 = object3 = object.optString("ledc");
            if (!hexPattern.matcher((CharSequence)object3).matches()) {
                OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "OneSignal LED Color Settings: ARGB Hex value incorrect format (E.g: FF9900FF)");
                object2 = "FFFFFFFF";
            }
            try {
                object3 = new BigInteger((String)object2, 16);
                string2.setLightColor(object3.intValue());
            }
            catch (Throwable throwable) {
                OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Couldn't convert ARGB Hex value to BigInteger:", throwable);
            }
        }
        boolean bl = true;
        boolean bl2 = object.optInt("led", 1) == 1;
        string2.enableLights(bl2);
        if (object.has("vib_pt") && (object2 = (Object)OSUtils.parseVibrationPattern(object)) != null) {
            string2.setVibrationPattern((long[])object2);
        }
        bl2 = object.optInt("vib", 1) == 1;
        string2.enableVibration(bl2);
        if (object.has("sound")) {
            object2 = object.optString("sound", null);
            if ((context = OSUtils.getSoundUri(context, (String)object2)) != null) {
                string2.setSound((Uri)context, null);
            } else if ("null".equals(object2) || "nil".equals(object2)) {
                string2.setSound(null, null);
            }
        }
        string2.setLockscreenVisibility(object.optInt("vis", 0));
        bl2 = object.optInt("bdg", 1) == 1;
        string2.setShowBadge(bl2);
        bl2 = object.optInt("bdnd", 0) == 1 ? bl : false;
        string2.setBypassDnd(bl2);
        object = OneSignal.LOG_LEVEL.VERBOSE;
        context = z2.t("Creating notification channel with channel:\n");
        context.append(string2.toString());
        OneSignal.onesignalLog((OneSignal.LOG_LEVEL)((Object)object), context.toString());
        try {
            notificationManager.createNotificationChannel((NotificationChannel)string2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            illegalArgumentException.printStackTrace();
        }
        return string3;
    }

    @RequiresApi(api=26)
    private static String createDefaultChannel(NotificationManager notificationManager) {
        NotificationChannel notificationChannel = new NotificationChannel(DEFAULT_CHANNEL_ID, (CharSequence)"Miscellaneous", 3);
        notificationChannel.enableLights(true);
        notificationChannel.enableVibration(true);
        notificationManager.createNotificationChannel(notificationChannel);
        return DEFAULT_CHANNEL_ID;
    }

    public static String createNotificationChannel(OSNotificationGenerationJob object) {
        if (Build.VERSION.SDK_INT < 26) {
            return DEFAULT_CHANNEL_ID;
        }
        Context context = ((OSNotificationGenerationJob)object).getContext();
        JSONObject jSONObject = ((OSNotificationGenerationJob)object).getJsonPayload();
        NotificationManager notificationManager = OneSignalNotificationManager.getNotificationManager((Context)context);
        if (((OSNotificationGenerationJob)object).isRestoring()) {
            return NotificationChannelManager.createRestoreChannel(notificationManager);
        }
        if (jSONObject.has("oth_chnl") && u2.e(notificationManager, (String)(object = jSONObject.optString("oth_chnl"))) != null) {
            return object;
        }
        if (!jSONObject.has("chnl")) {
            return NotificationChannelManager.createDefaultChannel(notificationManager);
        }
        try {
            object = NotificationChannelManager.createChannel(context, notificationManager, jSONObject);
            return object;
        }
        catch (JSONException jSONException) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Could not create notification channel due to JSON payload error!", jSONException);
            return DEFAULT_CHANNEL_ID;
        }
    }

    @RequiresApi(api=26)
    private static String createRestoreChannel(NotificationManager notificationManager) {
        notificationManager.createNotificationChannel(new NotificationChannel(RESTORE_CHANNEL_ID, (CharSequence)"Restored", 2));
        return RESTORE_CHANNEL_ID;
    }

    @RequiresApi(api=26)
    private static List<NotificationChannel> getChannelList(NotificationManager notificationManager) {
        try {
            notificationManager = u2.p(notificationManager);
            return notificationManager;
        }
        catch (RuntimeException runtimeException) {
            if (!(runtimeException.getCause() instanceof DeadSystemException)) {
                throw runtimeException;
            }
        }
        catch (NullPointerException nullPointerException) {
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.ERROR;
            StringBuilder stringBuilder = z2.t("Error when trying to delete notification channel: ");
            stringBuilder.append(nullPointerException.getMessage());
            OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
        }
        return null;
    }

    private static int priorityToImportance(int n) {
        if (n > 9) {
            return 5;
        }
        if (n > 7) {
            return 4;
        }
        if (n > 5) {
            return 3;
        }
        if (n > 3) {
            return 2;
        }
        if (n > 1) {
            return 1;
        }
        return 0;
    }

    public static void processChannelList(@NonNull Context object, @Nullable JSONArray jSONArray) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (jSONArray != null && jSONArray.length() != 0) {
            NotificationManager notificationManager = OneSignalNotificationManager.getNotificationManager((Context)object);
            HashSet hashSet = new HashSet();
            int n = jSONArray.length();
            for (int i = 0; i < n; ++i) {
                try {
                    hashSet.add((Object)NotificationChannelManager.createChannel(object, notificationManager, jSONArray.getJSONObject(i)));
                    continue;
                }
                catch (JSONException jSONException) {
                    OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Could not create notification channel due to JSON payload error!", jSONException);
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            object = NotificationChannelManager.getChannelList(notificationManager);
            if (object == null) {
                return;
            }
            jSONArray = object.iterator();
            while (jSONArray.hasNext()) {
                object = ((NotificationChannel)jSONArray.next()).getId();
                if (!object.startsWith(CHANNEL_PREFIX) || hashSet.contains(object)) continue;
                notificationManager.deleteNotificationChannel(object);
            }
        }
    }
}

