/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.json.JSONArray
 *  org.json.JSONException
 */
package com.onesignal.influence.data;

import com.onesignal.OSSharedPreferences;
import com.onesignal.OneSignalRemoteParams;
import com.onesignal.influence.domain.OSInfluenceType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

@Metadata(d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\nJ\u000e\u0010'\u001a\u00020%2\u0006\u0010&\u001a\u00020\nJ\u0010\u0010(\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u00010\u0006J\u000e\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020\u0019J\u000e\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020.J\u000e\u0010/\u001a\u00020%2\u0006\u00100\u001a\u00020\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\fR\u0011\u0010 \u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0010R\u0011\u0010\"\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b#\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2={"Lcom/onesignal/influence/data/OSInfluenceDataRepository;", "", "preferences", "Lcom/onesignal/OSSharedPreferences;", "(Lcom/onesignal/OSSharedPreferences;)V", "cachedNotificationOpenId", "", "getCachedNotificationOpenId", "()Ljava/lang/String;", "iamCachedInfluenceType", "Lcom/onesignal/influence/domain/OSInfluenceType;", "getIamCachedInfluenceType", "()Lcom/onesignal/influence/domain/OSInfluenceType;", "iamIndirectAttributionWindow", "", "getIamIndirectAttributionWindow", "()I", "iamLimit", "getIamLimit", "isDirectInfluenceEnabled", "", "()Z", "isIndirectInfluenceEnabled", "isUnattributedInfluenceEnabled", "lastIAMsReceivedData", "Lorg/json/JSONArray;", "getLastIAMsReceivedData", "()Lorg/json/JSONArray;", "lastNotificationsReceivedData", "getLastNotificationsReceivedData", "notificationCachedInfluenceType", "getNotificationCachedInfluenceType", "notificationIndirectAttributionWindow", "getNotificationIndirectAttributionWindow", "notificationLimit", "getNotificationLimit", "cacheIAMInfluenceType", "", "influenceType", "cacheNotificationInfluenceType", "cacheNotificationOpenId", "id", "saveIAMs", "iams", "saveInfluenceParams", "influenceParams", "Lcom/onesignal/OneSignalRemoteParams$InfluenceParams;", "saveNotifications", "notifications", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class OSInfluenceDataRepository {
    @NotNull
    private final OSSharedPreferences preferences;

    public OSInfluenceDataRepository(@NotNull OSSharedPreferences oSSharedPreferences) {
        Intrinsics.checkNotNullParameter((Object)oSSharedPreferences, (String)"preferences");
        this.preferences = oSSharedPreferences;
    }

    public final void cacheIAMInfluenceType(@NotNull OSInfluenceType oSInfluenceType) {
        Intrinsics.checkNotNullParameter((Object)((Object)oSInfluenceType), (String)"influenceType");
        OSSharedPreferences oSSharedPreferences = this.preferences;
        oSSharedPreferences.saveString(oSSharedPreferences.getPreferencesName(), "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE", oSInfluenceType.toString());
    }

    public final void cacheNotificationInfluenceType(@NotNull OSInfluenceType oSInfluenceType) {
        Intrinsics.checkNotNullParameter((Object)((Object)oSInfluenceType), (String)"influenceType");
        OSSharedPreferences oSSharedPreferences = this.preferences;
        oSSharedPreferences.saveString(oSSharedPreferences.getPreferencesName(), "PREFS_OS_OUTCOMES_CURRENT_SESSION", oSInfluenceType.toString());
    }

    public final void cacheNotificationOpenId(@Nullable String string2) {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        oSSharedPreferences.saveString(oSSharedPreferences.getPreferencesName(), "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN", string2);
    }

    @Nullable
    public final String getCachedNotificationOpenId() {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        return oSSharedPreferences.getString(oSSharedPreferences.getPreferencesName(), "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN", null);
    }

    @NotNull
    public final OSInfluenceType getIamCachedInfluenceType() {
        String string2 = OSInfluenceType.UNATTRIBUTED.toString();
        Object object = this.preferences;
        object = object.getString(object.getPreferencesName(), "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE", string2);
        return OSInfluenceType.Companion.fromString((String)object);
    }

    public final int getIamIndirectAttributionWindow() {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        return oSSharedPreferences.getInt(oSSharedPreferences.getPreferencesName(), "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW", 1440);
    }

    public final int getIamLimit() {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        return oSSharedPreferences.getInt(oSSharedPreferences.getPreferencesName(), "PREFS_OS_IAM_LIMIT", 10);
    }

    @NotNull
    public final JSONArray getLastIAMsReceivedData() throws JSONException {
        Object object = this.preferences;
        object = (object = object.getString(object.getPreferencesName(), "PREFS_OS_LAST_IAMS_RECEIVED", "[]")) == null ? null : new JSONArray((String)object);
        Object object2 = object;
        if (object == null) {
            object2 = new JSONArray();
        }
        return object2;
    }

    @NotNull
    public final JSONArray getLastNotificationsReceivedData() throws JSONException {
        Object object = this.preferences;
        object = (object = object.getString(object.getPreferencesName(), "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED", "[]")) == null ? null : new JSONArray((String)object);
        Object object2 = object;
        if (object == null) {
            object2 = new JSONArray();
        }
        return object2;
    }

    @NotNull
    public final OSInfluenceType getNotificationCachedInfluenceType() {
        Object object = this.preferences;
        object = object.getString(object.getPreferencesName(), "PREFS_OS_OUTCOMES_CURRENT_SESSION", OSInfluenceType.UNATTRIBUTED.toString());
        return OSInfluenceType.Companion.fromString((String)object);
    }

    public final int getNotificationIndirectAttributionWindow() {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        return oSSharedPreferences.getInt(oSSharedPreferences.getPreferencesName(), "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW", 1440);
    }

    public final int getNotificationLimit() {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        return oSSharedPreferences.getInt(oSSharedPreferences.getPreferencesName(), "PREFS_OS_NOTIFICATION_LIMIT", 10);
    }

    public final boolean isDirectInfluenceEnabled() {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        return oSSharedPreferences.getBool(oSSharedPreferences.getPreferencesName(), "PREFS_OS_DIRECT_ENABLED", false);
    }

    public final boolean isIndirectInfluenceEnabled() {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        return oSSharedPreferences.getBool(oSSharedPreferences.getPreferencesName(), "PREFS_OS_INDIRECT_ENABLED", false);
    }

    public final boolean isUnattributedInfluenceEnabled() {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        return oSSharedPreferences.getBool(oSSharedPreferences.getPreferencesName(), "PREFS_OS_UNATTRIBUTED_ENABLED", false);
    }

    public final void saveIAMs(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter((Object)jSONArray, (String)"iams");
        OSSharedPreferences oSSharedPreferences = this.preferences;
        oSSharedPreferences.saveString(oSSharedPreferences.getPreferencesName(), "PREFS_OS_LAST_IAMS_RECEIVED", jSONArray.toString());
    }

    public final void saveInfluenceParams(@NotNull OneSignalRemoteParams.InfluenceParams influenceParams) {
        Intrinsics.checkNotNullParameter((Object)influenceParams, (String)"influenceParams");
        OSSharedPreferences oSSharedPreferences = this.preferences;
        oSSharedPreferences.saveBool(oSSharedPreferences.getPreferencesName(), "PREFS_OS_DIRECT_ENABLED", influenceParams.isDirectEnabled());
        oSSharedPreferences = this.preferences;
        oSSharedPreferences.saveBool(oSSharedPreferences.getPreferencesName(), "PREFS_OS_INDIRECT_ENABLED", influenceParams.isIndirectEnabled());
        oSSharedPreferences = this.preferences;
        oSSharedPreferences.saveBool(oSSharedPreferences.getPreferencesName(), "PREFS_OS_UNATTRIBUTED_ENABLED", influenceParams.isUnattributedEnabled());
        oSSharedPreferences = this.preferences;
        oSSharedPreferences.saveInt(oSSharedPreferences.getPreferencesName(), "PREFS_OS_NOTIFICATION_LIMIT", influenceParams.getNotificationLimit());
        oSSharedPreferences = this.preferences;
        oSSharedPreferences.saveInt(oSSharedPreferences.getPreferencesName(), "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW", influenceParams.getIndirectNotificationAttributionWindow());
        oSSharedPreferences = this.preferences;
        oSSharedPreferences.saveInt(oSSharedPreferences.getPreferencesName(), "PREFS_OS_IAM_LIMIT", influenceParams.getIamLimit());
        oSSharedPreferences = this.preferences;
        oSSharedPreferences.saveInt(oSSharedPreferences.getPreferencesName(), "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW", influenceParams.getIndirectIAMAttributionWindow());
    }

    public final void saveNotifications(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter((Object)jSONArray, (String)"notifications");
        OSSharedPreferences oSSharedPreferences = this.preferences;
        oSSharedPreferences.saveString(oSSharedPreferences.getPreferencesName(), "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED", jSONArray.toString());
    }
}

