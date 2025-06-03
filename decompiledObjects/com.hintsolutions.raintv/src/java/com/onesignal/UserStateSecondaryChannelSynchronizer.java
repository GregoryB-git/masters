/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import androidx.annotation.Nullable;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalStateSynchronizer;
import com.onesignal.UserState;
import com.onesignal.UserStateSynchronizer;
import org.json.JSONException;
import org.json.JSONObject;

abstract class UserStateSecondaryChannelSynchronizer
extends UserStateSynchronizer {
    public UserStateSecondaryChannelSynchronizer(OneSignalStateSynchronizer.UserStateSynchronizerType userStateSynchronizerType) {
        super(userStateSynchronizerType);
    }

    @Override
    public void addOnSessionOrCreateExtras(JSONObject jSONObject) {
        try {
            jSONObject.put("device_type", this.getDeviceType());
            jSONObject.putOpt("device_player_id", (Object)OneSignal.getUserId());
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
    }

    @Override
    public void fireEventsForUpdateFailure(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            this.fireUpdateFailure();
        }
    }

    public abstract void fireUpdateFailure();

    public abstract void fireUpdateSuccess(JSONObject var1);

    public abstract String getAuthHashKey();

    public abstract String getChannelKey();

    public abstract int getDeviceType();

    @Override
    @Nullable
    public String getExternalId(boolean bl) {
        return null;
    }

    @Override
    public abstract String getId();

    @Override
    public OneSignal.LOG_LEVEL getLogLevel() {
        return OneSignal.LOG_LEVEL.INFO;
    }

    @Override
    public boolean getSubscribed() {
        return false;
    }

    @Override
    public UserStateSynchronizer.GetTagsResult getTags(boolean bl) {
        return null;
    }

    @Override
    public boolean getUserSubscribePreference() {
        return false;
    }

    @Override
    public abstract void logoutChannel();

    @Override
    public abstract UserState newUserState(String var1, boolean var2);

    @Override
    public void onSuccessfulSync(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(this.getChannelKey(), jSONObject.get("identifier"));
                if (jSONObject.has(this.getAuthHashKey())) {
                    jSONObject2.put(this.getAuthHashKey(), jSONObject.get(this.getAuthHashKey()));
                }
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
            this.fireUpdateSuccess(jSONObject2);
        }
    }

    public void refresh() {
        this.scheduleSyncToServer();
    }

    @Override
    public void scheduleSyncToServer() {
        boolean bl = this.getId() == null && this.getRegistrationId() == null;
        if (!bl && OneSignal.getUserId() != null) {
            this.getNetworkHandlerThread(0).runNewJobDelayed();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setChannelId(String var1_1, String var2_4) {
        block9: {
            var5_5 = this.getUserStateForModification();
            var6_6 = var5_5.getSyncValues();
            var3_9 = var1_1.equals((Object)var6_6.optString("identifier")) != false && (var7_7 = var6_6.optString(this.getAuthHashKey())).equals((Object)(var4_8 /* !! */  = var2_4 == null ? "" : var2_4)) != false;
            if (var3_9) {
                var4_8 /* !! */  = new JSONObject();
                try {
                    var4_8 /* !! */ .put(this.getChannelKey(), (Object)var1_1);
                    var4_8 /* !! */ .put(this.getAuthHashKey(), (Object)var2_4);
                }
                catch (JSONException var1_2) {
                    var1_2.printStackTrace();
                }
                this.fireUpdateSuccess(var4_8 /* !! */ );
                return;
            }
            var4_8 /* !! */  = var6_6.optString("identifier", null);
            if (var4_8 /* !! */  == null) {
                this.setNewSession();
            }
            var6_6 = new JSONObject();
            var6_6.put("identifier", var1_1);
            if (var2_4 == null) break block9;
            var6_6.put(this.getAuthHashKey(), var2_4);
        }
        if (var2_4 != null || var4_8 /* !! */  == null) ** GOTO lbl34
        try {
            if (!var4_8 /* !! */ .equals((Object)var1_1)) {
                this.saveChannelId("");
                this.resetCurrentState();
                this.setNewSession();
            }
lbl34:
            // 4 sources

            var5_5.generateJsonDiffFromIntoSyncValued((JSONObject)var6_6, null);
            this.scheduleSyncToServer();
        }
        catch (JSONException var1_3) {
            var1_3.printStackTrace();
        }
    }

    @Override
    public void setPermission(boolean bl) {
    }

    @Override
    public void setSubscription(boolean bl) {
    }

    @Override
    public abstract void updateIdDependents(String var1);

    @Override
    public void updateState(JSONObject jSONObject) {
    }
}

