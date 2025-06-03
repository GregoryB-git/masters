/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.onesignal.OneSignalRemoteParams$1
 *  com.onesignal.OneSignalRemoteParams$2
 *  java.lang.Boolean
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalRemoteParams;
import com.onesignal.OneSignalRestClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OneSignalRemoteParams {
    public static final int DEFAULT_INDIRECT_ATTRIBUTION_WINDOW = 1440;
    public static final int DEFAULT_NOTIFICATION_LIMIT = 10;
    private static final String DIRECT_PARAM = "direct";
    private static final String DISABLE_GMS_MISSING_PROMPT = "disable_gms_missing_prompt";
    private static final String ENABLED_PARAM = "enabled";
    private static final String FCM_API_KEY = "api_key";
    private static final String FCM_APP_ID = "app_id";
    private static final String FCM_PARENT_PARAM = "fcm";
    private static final String FCM_PROJECT_ID = "project_id";
    private static final String IAM_ATTRIBUTION_PARAM = "in_app_message_attribution";
    private static final int INCREASE_BETWEEN_RETRIES = 10000;
    private static final String INDIRECT_PARAM = "indirect";
    private static final String LOCATION_SHARED = "location_shared";
    private static final int MAX_WAIT_BETWEEN_RETRIES = 90000;
    private static final int MIN_WAIT_BETWEEN_RETRIES = 30000;
    private static final String NOTIFICATION_ATTRIBUTION_PARAM = "notification_attribution";
    private static final String OUTCOMES_V2_SERVICE_PARAM = "v2_enabled";
    private static final String OUTCOME_PARAM = "outcomes";
    private static final String REQUIRES_USER_PRIVACY_CONSENT = "requires_user_privacy_consent";
    private static final String UNATTRIBUTED_PARAM = "unattributed";
    private static final String UNSUBSCRIBE_ON_NOTIFICATION_DISABLE = "unsubscribe_on_notifications_disabled";
    private static int androidParamsRetries;

    public static /* synthetic */ int access$000() {
        return androidParamsRetries;
    }

    public static /* synthetic */ int access$008() {
        int n = androidParamsRetries;
        androidParamsRetries = n + 1;
        return n;
    }

    public static /* synthetic */ void access$100(String string2, Callback callback) {
        OneSignalRemoteParams.processJson(string2, callback);
    }

    public static /* synthetic */ void access$200(JSONObject jSONObject, InfluenceParams influenceParams) {
        OneSignalRemoteParams.processOutcomeJson(jSONObject, influenceParams);
    }

    public static void makeAndroidParamsRequest(String object, String string2, @NonNull Callback object2) {
        1 var3_3 = new 1((String)object, string2, (Callback)object2);
        object = object2 = z2.p("apps/", (String)object, "/android_params.js");
        if (string2 != null) {
            object = z2.p((String)object2, "?player_id=", string2);
        }
        OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "Starting request to get Android parameters.");
        OneSignalRestClient.get((String)object, (OneSignalRestClient.ResponseHandler)var3_3, "CACHE_KEY_REMOTE_PARAMS");
    }

    private static void processJson(String string2, @NonNull Callback callback) {
        StringBuilder stringBuilder;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(string2);
        }
        catch (JSONException jSONException) {
        }
        catch (NullPointerException nullPointerException) {
            // empty catch block
        }
        callback.complete((Params)new 2(jSONObject));
        return;
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.FATAL;
        OneSignal.Log(lOG_LEVEL, "Error parsing android_params!: ", (Throwable)stringBuilder);
        stringBuilder = new StringBuilder();
        stringBuilder.append("Response that errored from android_params!: ");
        stringBuilder.append(string2);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
    }

    private static void processOutcomeJson(JSONObject jSONObject, InfluenceParams influenceParams) {
        if (jSONObject.has(OUTCOMES_V2_SERVICE_PARAM)) {
            influenceParams.outcomesV2ServiceEnabled = jSONObject.optBoolean(OUTCOMES_V2_SERVICE_PARAM);
        }
        if (jSONObject.has(DIRECT_PARAM)) {
            influenceParams.directEnabled = jSONObject.optJSONObject(DIRECT_PARAM).optBoolean(ENABLED_PARAM);
        }
        if (jSONObject.has(INDIRECT_PARAM)) {
            JSONObject jSONObject2;
            JSONObject jSONObject3 = jSONObject.optJSONObject(INDIRECT_PARAM);
            influenceParams.indirectEnabled = jSONObject3.optBoolean(ENABLED_PARAM);
            if (jSONObject3.has(NOTIFICATION_ATTRIBUTION_PARAM)) {
                jSONObject2 = jSONObject3.optJSONObject(NOTIFICATION_ATTRIBUTION_PARAM);
                influenceParams.indirectNotificationAttributionWindow = jSONObject2.optInt("minutes_since_displayed", 1440);
                influenceParams.notificationLimit = jSONObject2.optInt("limit", 10);
            }
            if (jSONObject3.has(IAM_ATTRIBUTION_PARAM)) {
                jSONObject2 = jSONObject3.optJSONObject(IAM_ATTRIBUTION_PARAM);
                influenceParams.indirectIAMAttributionWindow = jSONObject2.optInt("minutes_since_displayed", 1440);
                influenceParams.iamLimit = jSONObject2.optInt("limit", 10);
            }
        }
        if (jSONObject.has(UNATTRIBUTED_PARAM)) {
            influenceParams.unattributedEnabled = jSONObject.optJSONObject(UNATTRIBUTED_PARAM).optBoolean(ENABLED_PARAM);
        }
    }

    public static interface Callback {
        public void complete(Params var1);
    }

    public static class FCMParams {
        @Nullable
        public String apiKey;
        @Nullable
        public String appId;
        @Nullable
        public String projectId;
    }

    public static class InfluenceParams {
        public boolean directEnabled = false;
        public int iamLimit = 10;
        public boolean indirectEnabled = false;
        public int indirectIAMAttributionWindow = 1440;
        public int indirectNotificationAttributionWindow = 1440;
        public int notificationLimit = 10;
        public boolean outcomesV2ServiceEnabled = false;
        public boolean unattributedEnabled = false;

        public int getIamLimit() {
            return this.iamLimit;
        }

        public int getIndirectIAMAttributionWindow() {
            return this.indirectIAMAttributionWindow;
        }

        public int getIndirectNotificationAttributionWindow() {
            return this.indirectNotificationAttributionWindow;
        }

        public int getNotificationLimit() {
            return this.notificationLimit;
        }

        public boolean isDirectEnabled() {
            return this.directEnabled;
        }

        public boolean isIndirectEnabled() {
            return this.indirectEnabled;
        }

        public boolean isUnattributedEnabled() {
            return this.unattributedEnabled;
        }

        public String toString() {
            StringBuilder stringBuilder = z2.t("InfluenceParams{indirectNotificationAttributionWindow=");
            stringBuilder.append(this.indirectNotificationAttributionWindow);
            stringBuilder.append(", notificationLimit=");
            stringBuilder.append(this.notificationLimit);
            stringBuilder.append(", indirectIAMAttributionWindow=");
            stringBuilder.append(this.indirectIAMAttributionWindow);
            stringBuilder.append(", iamLimit=");
            stringBuilder.append(this.iamLimit);
            stringBuilder.append(", directEnabled=");
            stringBuilder.append(this.directEnabled);
            stringBuilder.append(", indirectEnabled=");
            stringBuilder.append(this.indirectEnabled);
            stringBuilder.append(", unattributedEnabled=");
            stringBuilder.append(this.unattributedEnabled);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    public static class Params {
        public boolean clearGroupOnSummaryClick;
        public Boolean disableGMSMissingPrompt;
        public boolean enterprise;
        public FCMParams fcmParams;
        public boolean firebaseAnalytics;
        public String googleProjectNumber;
        public InfluenceParams influenceParams;
        public Boolean locationShared;
        public JSONArray notificationChannels;
        public boolean receiveReceiptEnabled;
        public Boolean requiresUserPrivacyConsent;
        public boolean restoreTTLFilter;
        public Boolean unsubscribeWhenNotificationsDisabled;
        public boolean useEmailAuth;
        public boolean useSMSAuth;
        public boolean useUserIdAuth;
    }
}

