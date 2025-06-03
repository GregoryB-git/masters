/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import androidx.annotation.Nullable;
import com.onesignal.JSONUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalRestClient;
import com.onesignal.OneSignalStateSynchronizer;
import com.onesignal.UserState;
import com.onesignal.UserStatePush;
import com.onesignal.UserStateSynchronizer;
import org.json.JSONException;
import org.json.JSONObject;

class UserStatePushSynchronizer
extends UserStateSynchronizer {
    private static boolean serverSuccess;

    public UserStatePushSynchronizer() {
        super(OneSignalStateSynchronizer.UserStateSynchronizerType.PUSH);
    }

    public static /* synthetic */ boolean access$002(boolean bl) {
        serverSuccess = bl;
        return bl;
    }

    @Override
    public void addOnSessionOrCreateExtras(JSONObject jSONObject) {
    }

    @Override
    public void fireEventsForUpdateFailure(JSONObject jSONObject) {
        if (jSONObject.has("email")) {
            OneSignal.fireEmailUpdateFailure();
        }
        if (jSONObject.has("sms_number")) {
            OneSignal.fireSMSUpdateFailure();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @Nullable
    public String getExternalId(boolean bl) {
        Object object;
        Object object2 = object = this.LOCK;
        synchronized (object2) {
            return this.getToSyncUserState().getSyncValues().optString("external_user_id", null);
        }
    }

    @Override
    public String getId() {
        return OneSignal.getUserId();
    }

    public String getLanguage() {
        return this.getToSyncUserState().getDependValues().optString("language", null);
    }

    @Override
    public OneSignal.LOG_LEVEL getLogLevel() {
        return OneSignal.LOG_LEVEL.ERROR;
    }

    @Override
    public boolean getSubscribed() {
        return this.getToSyncUserState().isSubscribed();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public UserStateSynchronizer.GetTagsResult getTags(boolean bl) {
        Object object;
        if (bl) {
            OneSignalRestClient.getSync(a.m("players/", OneSignal.getUserId(), "?app_id=", OneSignal.getSavedAppId()), new OneSignalRestClient.ResponseHandler(this){
                public final UserStatePushSynchronizer this$0;
                {
                    this.this$0 = userStatePushSynchronizer;
                }

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                @Override
                public void onSuccess(String string2) {
                    UserStatePushSynchronizer userStatePushSynchronizer;
                    Object object;
                    block8: {
                        block7: {
                            UserStatePushSynchronizer.access$002(true);
                            if (string2 == null) break block7;
                            object = string2;
                            if (!string2.isEmpty()) break block8;
                        }
                        object = "{}";
                    }
                    try {
                        string2 = new JSONObject((String)object);
                        if (!string2.has("tags")) return;
                        Object object2 = object = this.this$0.LOCK;
                        synchronized (object2) {
                            userStatePushSynchronizer = this.this$0;
                        }
                    }
                    catch (JSONException jSONException) {
                        jSONException.printStackTrace();
                        return;
                    }
                    {
                        userStatePushSynchronizer = userStatePushSynchronizer.generateJsonDiff(userStatePushSynchronizer.getCurrentUserState().getSyncValues().optJSONObject("tags"), this.this$0.getToSyncUserState().getSyncValues().optJSONObject("tags"), null, null);
                        this.this$0.getCurrentUserState().putOnSyncValues("tags", string2.optJSONObject("tags"));
                        this.this$0.getCurrentUserState().persistState();
                        this.this$0.getToSyncUserState().mergeTags((JSONObject)string2, (JSONObject)userStatePushSynchronizer);
                        this.this$0.getToSyncUserState().persistState();
                        return;
                    }
                }
            }, "CACHE_KEY_GET_TAGS");
        }
        Object object2 = object = this.LOCK;
        synchronized (object2) {
            return new UserStateSynchronizer.GetTagsResult(serverSuccess, JSONUtils.getJSONObjectWithoutBlankValues(this.getToSyncUserState().getSyncValues(), "tags"));
        }
    }

    @Override
    public boolean getUserSubscribePreference() {
        return this.getToSyncUserState().getDependValues().optBoolean("userSubscribePref", true);
    }

    @Override
    public void logoutChannel() {
    }

    public void logoutEmail() {
        try {
            this.getUserStateForModification().putOnDependValues("logoutEmail", Boolean.TRUE);
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
    }

    public void logoutSMS() {
        UserState userState = this.getToSyncUserState();
        userState.removeFromDependValues("sms_auth_hash");
        userState.removeFromSyncValues("sms_number");
        userState.persistState();
        userState = this.getCurrentUserState();
        userState.removeFromDependValues("sms_auth_hash");
        Object object = userState.getSyncValues().optString("sms_number");
        userState.removeFromSyncValues("sms_number");
        userState = new JSONObject();
        try {
            userState.put("sms_number", object);
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        object = OneSignal.LOG_LEVEL.INFO;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Device successfully logged out of SMS number: ");
        stringBuilder.append((Object)userState);
        OneSignal.Log((OneSignal.LOG_LEVEL)((Object)object), stringBuilder.toString());
        OneSignal.handleSuccessfulSMSlLogout((JSONObject)userState);
    }

    @Override
    public UserState newUserState(String string2, boolean bl) {
        return new UserStatePush(string2, bl);
    }

    @Override
    public void onSuccessfulSync(JSONObject jSONObject) {
    }

    @Override
    public void saveChannelId(String string2) {
        OneSignal.saveUserId(string2);
    }

    @Override
    public void scheduleSyncToServer() {
        this.getNetworkHandlerThread(0).runNewJobDelayed();
    }

    public void setEmail(String string2, String string3) {
        try {
            UserState userState = this.getUserStateForModification();
            userState.putOnDependValues("email_auth_hash", string3);
            string3 = new JSONObject();
            userState.generateJsonDiffFromIntoSyncValued(string3.put("email", (Object)string2), null);
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
    }

    @Override
    public void setPermission(boolean bl) {
        try {
            this.getUserStateForModification().putOnDependValues("androidPermission", bl);
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
    }

    public void setSMSNumber(String string2, String string3) {
        try {
            UserState userState = this.getUserStateForModification();
            userState.putOnDependValues("sms_auth_hash", string3);
            string3 = new JSONObject();
            userState.generateJsonDiffFromIntoSyncValued(string3.put("sms_number", (Object)string2), null);
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
    }

    @Override
    public void setSubscription(boolean bl) {
        try {
            this.getUserStateForModification().putOnDependValues("userSubscribePref", bl);
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
    }

    @Override
    public void updateIdDependents(String string2) {
        OneSignal.updateUserIdDependents(string2);
    }

    @Override
    public void updateState(JSONObject jSONObject) {
        JSONObject jSONObject2;
        try {
            jSONObject2 = new JSONObject();
            jSONObject2.putOpt("identifier", (Object)jSONObject.optString("identifier", null));
            if (jSONObject.has("device_type")) {
                jSONObject2.put("device_type", jSONObject.optInt("device_type"));
            }
            jSONObject2.putOpt("parent_player_id", (Object)jSONObject.optString("parent_player_id", null));
            this.getUserStateForModification().generateJsonDiffFromIntoSyncValued(jSONObject2, null);
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        try {
            jSONObject2 = new JSONObject();
            if (jSONObject.has("subscribableStatus")) {
                jSONObject2.put("subscribableStatus", jSONObject.optInt("subscribableStatus"));
            }
            if (jSONObject.has("androidPermission")) {
                jSONObject2.put("androidPermission", jSONObject.optBoolean("androidPermission"));
            }
            this.getUserStateForModification().generateJsonDiffFromIntoDependValues(jSONObject2, null);
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
    }
}

