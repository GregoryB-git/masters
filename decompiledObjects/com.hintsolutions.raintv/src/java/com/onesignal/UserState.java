/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map$Entry
 *  java.util.Set
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import androidx.annotation.NonNull;
import com.onesignal.ImmutableJSONObject;
import com.onesignal.JSONUtils;
import com.onesignal.LocationController;
import com.onesignal.OneSignalPrefs;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

abstract class UserState {
    public static final int DEVICE_TYPE_ANDROID = 1;
    public static final int DEVICE_TYPE_EMAIL = 11;
    public static final int DEVICE_TYPE_FIREOS = 2;
    public static final int DEVICE_TYPE_HUAWEI = 13;
    public static final int DEVICE_TYPE_SMS = 14;
    private static final String[] LOCATION_FIELDS;
    private static final Set<String> LOCATION_FIELDS_SET;
    private static final Object LOCK;
    public static final int PUSH_STATUS_FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED = -29;
    public static final int PUSH_STATUS_FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER = -11;
    public static final int PUSH_STATUS_FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE = -9;
    public static final int PUSH_STATUS_FIREBASE_FCM_ERROR_MISC_EXCEPTION = -12;
    public static final int PUSH_STATUS_FIREBASE_FCM_INIT_ERROR = -8;
    public static final int PUSH_STATUS_HMS_API_EXCEPTION_OTHER = -27;
    public static final int PUSH_STATUS_HMS_ARGUMENTS_INVALID = -26;
    public static final int PUSH_STATUS_HMS_TOKEN_TIMEOUT = -25;
    public static final int PUSH_STATUS_INVALID_FCM_SENDER_ID = -6;
    public static final int PUSH_STATUS_MISSING_ANDROID_SUPPORT_LIBRARY = -3;
    public static final int PUSH_STATUS_MISSING_FIREBASE_FCM_LIBRARY = -4;
    public static final int PUSH_STATUS_MISSING_HMS_PUSHKIT_LIBRARY = -28;
    public static final int PUSH_STATUS_NO_PERMISSION = 0;
    public static final int PUSH_STATUS_OUTDATED_ANDROID_SUPPORT_LIBRARY = -5;
    public static final int PUSH_STATUS_OUTDATED_GOOGLE_PLAY_SERVICES_APP = -7;
    public static final int PUSH_STATUS_SUBSCRIBED = 1;
    public static final int PUSH_STATUS_UNSUBSCRIBE = -2;
    public static final String TAGS = "tags";
    private JSONObject dependValues;
    private String persistKey;
    private JSONObject syncValues;

    static {
        LOCK = new Object();
        Object[] objectArray = new String[]{"lat", "long", "loc_acc", "loc_type", "loc_bg", "loc_time_stamp"};
        LOCATION_FIELDS = objectArray;
        LOCATION_FIELDS_SET = new HashSet((Collection)Arrays.asList((Object[])objectArray));
    }

    public UserState(String string2, boolean bl) {
        this.persistKey = string2;
        if (bl) {
            this.loadState();
        } else {
            this.dependValues = new JSONObject();
            this.syncValues = new JSONObject();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static JSONObject generateJsonDiff(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            return JSONUtils.generateJsonDiff(jSONObject, jSONObject2, jSONObject3, set);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Set<String> getGroupChangeFields(UserState set) {
        try {
            if (this.dependValues.optLong("loc_time_stamp") == set.dependValues.getLong("loc_time_stamp")) return null;
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"loc_bg", set.dependValues.opt("loc_bg"));
            hashMap.put((Object)"loc_time_stamp", set.dependValues.opt("loc_time_stamp"));
            this.putValues(set.syncValues, (HashMap<String, Object>)hashMap);
            return LOCATION_FIELDS_SET;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void loadState() {
        block12: {
            block10: {
                block13: {
                    var4_1 = OneSignalPrefs.PREFS_ONESIGNAL;
                    var5_4 /* !! */  = z2.t("ONESIGNAL_USERSTATE_DEPENDVALYES_");
                    var5_4 /* !! */ .append(this.persistKey);
                    var5_4 /* !! */  = OneSignalPrefs.getString(var4_1, var5_4 /* !! */ .toString(), null);
                    if (var5_4 /* !! */  != null) break block12;
                    this.setDependValues(new JSONObject());
                    var3_6 = this.persistKey.equals((Object)"CURRENT_STATE");
                    var2_7 = 1;
                    if (!var3_6) ** GOTO lbl15
                    var1_8 = OneSignalPrefs.getInt(var4_1, "ONESIGNAL_SUBSCRIPTION", 1);
                    break block13;
lbl15:
                    // 1 sources

                    var1_8 = OneSignalPrefs.getInt(var4_1, "ONESIGNAL_SYNCED_SUBSCRIPTION", 1);
                }
                if (var1_8 == -2) {
                    var3_6 = false;
                    var1_8 = var2_7;
                    break block10;
                }
                var3_6 = true;
            }
            var4_1 = new HashMap();
            var4_1.put((Object)"subscribableStatus", (Object)var1_8);
            var4_1.put((Object)"userSubscribePref", (Object)var3_6);
            this.putValues(this.dependValues, (HashMap<String, Object>)var4_1);
        }
        try {
            var4_1 = new JSONObject((String)var5_4 /* !! */ );
            this.setDependValues((JSONObject)var4_1);
        }
        catch (JSONException var4_2) {
            var4_2.printStackTrace();
        }
lbl38:
        // 3 sources

        while (true) {
            block11: {
                var5_4 /* !! */  = OneSignalPrefs.PREFS_ONESIGNAL;
                var4_1 = z2.t("ONESIGNAL_USERSTATE_SYNCVALYES_");
                var4_1.append(this.persistKey);
                var6_9 = OneSignalPrefs.getString((String)var5_4 /* !! */ , var4_1.toString(), null);
                var4_1 = new JSONObject();
                if (var6_9 != null) ** GOTO lbl50
                try {
                    var4_1.put("identifier", (Object)OneSignalPrefs.getString((String)var5_4 /* !! */ , "GT_REGISTRATION_ID", null));
                    break block11;
lbl50:
                    // 1 sources

                    var5_4 /* !! */  = new JSONObject(var6_9);
                    var4_1 = var5_4 /* !! */ ;
                }
                catch (JSONException var5_5) {
                    var5_5.printStackTrace();
                }
            }
            this.setSyncValues((JSONObject)var4_1);
            return;
        }
        catch (JSONException var4_3) {
        }
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void putValues(JSONObject jSONObject, HashMap<String, Object> iterator) throws JSONException {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            iterator = iterator.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry)iterator.next();
                jSONObject.put((String)entry.getKey(), entry.getValue());
            }
            return;
        }
    }

    public abstract void addDependFields();

    public void clearLocation() {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"lat", null);
            hashMap.put((Object)"long", null);
            hashMap.put((Object)"loc_acc", null);
            hashMap.put((Object)"loc_type", null);
            hashMap.put((Object)"loc_bg", null);
            hashMap.put((Object)"loc_time_stamp", null);
            this.putValues(this.syncValues, (HashMap<String, Object>)hashMap);
            hashMap = new HashMap();
            hashMap.put((Object)"loc_bg", null);
            hashMap.put((Object)"loc_time_stamp", null);
            this.putValues(this.dependValues, (HashMap<String, Object>)hashMap);
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
    }

    public UserState deepClone(String object) {
        object = this.newInstance((String)object);
        try {
            ((UserState)object).dependValues = this.getDependValuesCopy();
            ((UserState)object).syncValues = this.getSyncValuesCopy();
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        return object;
    }

    public JSONObject generateJsonDiff(UserState userState, boolean bl) {
        this.addDependFields();
        userState.addDependFields();
        JSONObject jSONObject = this.getGroupChangeFields(userState);
        jSONObject = UserState.generateJsonDiff(this.syncValues, userState.syncValues, null, jSONObject);
        if (!bl && jSONObject.toString().equals((Object)"{}")) {
            return null;
        }
        try {
            if (!jSONObject.has("app_id")) {
                jSONObject.put("app_id", (Object)this.syncValues.optString("app_id"));
            }
            if (this.syncValues.has("email_auth_hash")) {
                jSONObject.put("email_auth_hash", (Object)this.syncValues.optString("email_auth_hash"));
            }
            if (this.syncValues.has("sms_auth_hash")) {
                jSONObject.put("sms_auth_hash", (Object)this.syncValues.optString("sms_auth_hash"));
            }
            if (this.syncValues.has("external_user_id_auth_hash") && !jSONObject.has("external_user_id_auth_hash")) {
                jSONObject.put("external_user_id_auth_hash", (Object)this.syncValues.optString("external_user_id_auth_hash"));
            }
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        return jSONObject;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JSONObject generateJsonDiffFromDependValues(UserState userState, Set<String> set) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            return JSONUtils.generateJsonDiff(this.dependValues, userState.dependValues, null, set);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JSONObject generateJsonDiffFromIntoDependValues(JSONObject jSONObject, Set<String> set) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            JSONObject jSONObject2 = this.dependValues;
            return JSONUtils.generateJsonDiff(jSONObject2, jSONObject, jSONObject2, set);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JSONObject generateJsonDiffFromIntoSyncValued(JSONObject jSONObject, Set<String> set) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            JSONObject jSONObject2 = this.syncValues;
            return JSONUtils.generateJsonDiff(jSONObject2, jSONObject, jSONObject2, set);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JSONObject generateJsonDiffFromSyncValued(UserState userState, Set<String> set) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            return JSONUtils.generateJsonDiff(this.syncValues, userState.syncValues, null, set);
        }
    }

    public ImmutableJSONObject getDependValues() {
        try {
            ImmutableJSONObject immutableJSONObject = new ImmutableJSONObject(this.getDependValuesCopy());
            return immutableJSONObject;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return new ImmutableJSONObject();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JSONObject getDependValuesCopy() throws JSONException {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            return new JSONObject(this.dependValues.toString());
        }
    }

    public ImmutableJSONObject getSyncValues() {
        try {
            ImmutableJSONObject immutableJSONObject = new ImmutableJSONObject(this.getSyncValuesCopy());
            return immutableJSONObject;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return new ImmutableJSONObject();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JSONObject getSyncValuesCopy() throws JSONException {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            return new JSONObject(this.syncValues.toString());
        }
    }

    public abstract boolean isSubscribed();

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void mergeTags(JSONObject var1_1, JSONObject var2_3) {
        if (!var1_1 /* !! */ .has("tags")) {
            return;
        }
        var5_4 /* !! */  = this.getSyncValuesCopy();
        var3_5 = var5_4 /* !! */ .has("tags");
        if (var3_5) {
        }
        ** GOTO lbl18
        {
            catch (JSONException var1_2) {
                var1_2.printStackTrace();
                return;
            }
            try {
                var4_6 = new JSONObject(var5_4 /* !! */ .optString("tags"));
            }
            catch (JSONException var4_7) {}
            {
                block14: {
                    var4_6 = new JSONObject();
                    break block14;
lbl18:
                    // 1 sources

                    var4_6 = new JSONObject();
                }
                var1_1 /* !! */  = var1_1 /* !! */ .optJSONObject("tags");
                var6_8 = var1_1 /* !! */ .keys();
                while (var6_8.hasNext()) {
                    var5_4 /* !! */  = (String)var6_8.next();
                    if ("".equals((Object)var1_1 /* !! */ .optString((String)var5_4 /* !! */ ))) {
                        var4_6.remove((String)var5_4 /* !! */ );
                        continue;
                    }
                    if (var2_3 != null && var2_3.has((String)var5_4 /* !! */ )) continue;
                    var4_6.put((String)var5_4 /* !! */ , (Object)var1_1 /* !! */ .optString((String)var5_4 /* !! */ ));
                }
                var7_9 /* !! */  = var1_1 /* !! */  = UserState.LOCK;
                ** synchronized (var7_9 /* !! */ )
            }
        }
lbl-1000:
        // 1 sources

        {
            if (var4_6.toString().equals((Object)"{}")) {
                this.syncValues.remove("tags");
            } else {
                this.syncValues.put("tags", (Object)var4_6);
            }
            return;
        }
    }

    public abstract UserState newInstance(String var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void persistState() {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            Throwable throwable2;
            block7: {
                try {
                    try {
                        if (this.syncValues.has("external_user_id_auth_hash") && (this.syncValues.has("external_user_id") && this.syncValues.get("external_user_id").toString() == "" || !this.syncValues.has("external_user_id"))) {
                            this.syncValues.remove("external_user_id_auth_hash");
                        }
                    }
                    catch (JSONException jSONException) {
                        jSONException.printStackTrace();
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                String string2 = OneSignalPrefs.PREFS_ONESIGNAL;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ONESIGNAL_USERSTATE_SYNCVALYES_");
                stringBuilder.append(this.persistKey);
                OneSignalPrefs.saveString(string2, stringBuilder.toString(), this.syncValues.toString());
                stringBuilder = new StringBuilder();
                stringBuilder.append("ONESIGNAL_USERSTATE_DEPENDVALYES_");
                stringBuilder.append(this.persistKey);
                OneSignalPrefs.saveString(string2, stringBuilder.toString(), this.dependValues.toString());
                return;
            }
            throw throwable2;
        }
    }

    public void persistStateAfterSync(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        if (jSONObject != null) {
            jSONObject3 = this.dependValues;
            UserState.generateJsonDiff(jSONObject3, jSONObject, jSONObject3, null);
        }
        if (jSONObject2 != null) {
            jSONObject3 = this.syncValues;
            UserState.generateJsonDiff(jSONObject3, jSONObject2, jSONObject3, null);
            this.mergeTags(jSONObject2, null);
        }
        if (jSONObject != null || jSONObject2 != null) {
            this.persistState();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void putOnDependValues(String string2, Object object) throws JSONException {
        Object object2;
        Object object3 = object2 = LOCK;
        synchronized (object3) {
            this.dependValues.put(string2, object);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void putOnSyncValues(String string2, Object object) throws JSONException {
        Object object2;
        Object object3 = object2 = LOCK;
        synchronized (object3) {
            this.syncValues.put(string2, object);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void removeFromDependValues(String string2) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            this.dependValues.remove(string2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void removeFromDependValues(List<String> iterator) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                String string2 = (String)iterator.next();
                this.dependValues.remove(string2);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void removeFromSyncValues(String string2) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            this.syncValues.remove(string2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void removeFromSyncValues(List<String> object) {
        Object object2;
        Object object3 = object2 = LOCK;
        synchronized (object3) {
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                object = (String)iterator.next();
                this.syncValues.remove(object);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setDependValues(JSONObject jSONObject) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            this.dependValues = jSONObject;
            return;
        }
    }

    public void setLocation(LocationController.LocationPoint locationPoint) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"lat", (Object)locationPoint.lat);
            hashMap.put((Object)"long", (Object)locationPoint.log);
            hashMap.put((Object)"loc_acc", (Object)locationPoint.accuracy);
            hashMap.put((Object)"loc_type", (Object)locationPoint.type);
            this.putValues(this.syncValues, (HashMap<String, Object>)hashMap);
            hashMap = new HashMap();
            hashMap.put((Object)"loc_bg", (Object)locationPoint.bg);
            hashMap.put((Object)"loc_time_stamp", (Object)locationPoint.timeStamp);
            this.putValues(this.dependValues, (HashMap<String, Object>)hashMap);
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setSyncValues(@NonNull JSONObject jSONObject) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            this.syncValues = jSONObject;
            return;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("UserState{persistKey='");
        a.B(stringBuilder, this.persistKey, '\'', ", dependValues=");
        stringBuilder.append((Object)this.dependValues);
        stringBuilder.append(", syncValues=");
        stringBuilder.append((Object)this.syncValues);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

