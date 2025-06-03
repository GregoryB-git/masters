/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  org.json.JSONException
 */
package com.onesignal;

import com.onesignal.UserState;
import org.json.JSONException;

class UserStatePush
extends UserState {
    public UserStatePush(String string2, boolean bl) {
        super(string2, bl);
    }

    private int getNotificationTypes() {
        int n = this.getDependValues().optInt("subscribableStatus", 1);
        if (n < -2) {
            return n;
        }
        if (!this.getDependValues().optBoolean("androidPermission", true)) {
            return 0;
        }
        if (!this.getDependValues().optBoolean("userSubscribePref", true)) {
            return -2;
        }
        return 1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void addDependFields() {
        try {
            this.putOnSyncValues("notification_types", this.getNotificationTypes());
            return;
        }
        catch (JSONException jSONException) {
            return;
        }
    }

    @Override
    public boolean isSubscribed() {
        boolean bl = this.getNotificationTypes() > 0;
        return bl;
    }

    @Override
    public UserState newInstance(String string2) {
        return new UserStatePush(string2, false);
    }
}

