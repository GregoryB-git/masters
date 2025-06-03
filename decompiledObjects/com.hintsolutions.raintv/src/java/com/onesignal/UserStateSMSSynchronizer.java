/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  org.json.JSONObject
 */
package com.onesignal;

import com.onesignal.OneSignal;
import com.onesignal.OneSignalStateSynchronizer;
import com.onesignal.UserState;
import com.onesignal.UserStateSMS;
import com.onesignal.UserStateSecondaryChannelSynchronizer;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

class UserStateSMSSynchronizer
extends UserStateSecondaryChannelSynchronizer {
    public UserStateSMSSynchronizer() {
        super(OneSignalStateSynchronizer.UserStateSynchronizerType.SMS);
    }

    @Override
    public void fireUpdateFailure() {
        OneSignal.fireSMSUpdateFailure();
    }

    @Override
    public void fireUpdateSuccess(JSONObject jSONObject) {
        OneSignal.fireSMSUpdateSuccess(jSONObject);
    }

    @Override
    public String getAuthHashKey() {
        return "sms_auth_hash";
    }

    @Override
    public String getChannelKey() {
        return "sms_number";
    }

    @Override
    public int getDeviceType() {
        return 14;
    }

    @Override
    public String getId() {
        return OneSignal.getSMSId();
    }

    @Override
    public void logoutChannel() {
        this.saveChannelId("");
        this.resetCurrentState();
        this.getToSyncUserState().removeFromSyncValues("identifier");
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)"sms_auth_hash");
        arrayList.add((Object)"device_player_id");
        arrayList.add((Object)"external_user_id");
        this.getToSyncUserState().removeFromSyncValues((List<String>)arrayList);
        this.getToSyncUserState().persistState();
        OneSignal.getSMSSubscriptionState().clearSMSAndId();
    }

    @Override
    public UserState newUserState(String string, boolean bl) {
        return new UserStateSMS(string, bl);
    }

    @Override
    public void saveChannelId(String string) {
        OneSignal.saveSMSId(string);
    }

    @Override
    public void updateIdDependents(String string) {
        OneSignal.updateSMSIdDependents(string);
    }
}

