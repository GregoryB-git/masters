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
import com.onesignal.UserStateEmail;
import com.onesignal.UserStateSecondaryChannelSynchronizer;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

class UserStateEmailSynchronizer
extends UserStateSecondaryChannelSynchronizer {
    public UserStateEmailSynchronizer() {
        super(OneSignalStateSynchronizer.UserStateSynchronizerType.EMAIL);
    }

    @Override
    public void fireUpdateFailure() {
        OneSignal.fireEmailUpdateFailure();
    }

    @Override
    public void fireUpdateSuccess(JSONObject jSONObject) {
        OneSignal.fireEmailUpdateSuccess();
    }

    @Override
    public String getAuthHashKey() {
        return "email_auth_hash";
    }

    @Override
    public String getChannelKey() {
        return "email";
    }

    @Override
    public int getDeviceType() {
        return 11;
    }

    @Override
    public String getId() {
        return OneSignal.getEmailId();
    }

    @Override
    public void logoutChannel() {
        OneSignal.saveEmailId("");
        this.resetCurrentState();
        this.getToSyncUserState().removeFromSyncValues("identifier");
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)"email_auth_hash");
        arrayList.add((Object)"device_player_id");
        arrayList.add((Object)"external_user_id");
        this.getToSyncUserState().removeFromSyncValues((List<String>)arrayList);
        this.getToSyncUserState().persistState();
        OneSignal.getEmailSubscriptionState().clearEmailAndId();
    }

    @Override
    public UserState newUserState(String string, boolean bl) {
        return new UserStateEmail(string, bl);
    }

    @Override
    public void saveChannelId(String string) {
        OneSignal.saveEmailId(string);
    }

    @Override
    public void updateIdDependents(String string) {
        OneSignal.updateEmailIdDependents(string);
    }
}

