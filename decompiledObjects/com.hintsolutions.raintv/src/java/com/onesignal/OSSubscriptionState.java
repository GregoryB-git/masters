/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.onesignal.OneSignalPrefs
 *  com.onesignal.OneSignalStateSynchronizer
 *  java.lang.CloneNotSupportedException
 *  java.lang.Cloneable
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import androidx.annotation.Nullable;
import com.onesignal.OSObservable;
import com.onesignal.OSPermissionState;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalPrefs;
import com.onesignal.OneSignalStateSynchronizer;
import org.json.JSONException;
import org.json.JSONObject;

public class OSSubscriptionState
implements Cloneable {
    private static final String CHANGED_KEY = "changed";
    private boolean accepted;
    private OSObservable<Object, OSSubscriptionState> observable = new OSObservable("changed", false);
    private boolean pushDisabled;
    private String pushToken;
    private String userId;

    public OSSubscriptionState(boolean bl, boolean bl2) {
        if (bl) {
            String string2 = OneSignalPrefs.PREFS_ONESIGNAL;
            this.pushDisabled = OneSignalPrefs.getBool((String)string2, (String)"ONESIGNAL_SUBSCRIPTION_LAST", (boolean)true);
            this.userId = OneSignalPrefs.getString((String)string2, (String)"ONESIGNAL_PLAYER_ID_LAST", null);
            this.pushToken = OneSignalPrefs.getString((String)string2, (String)"ONESIGNAL_PUSH_TOKEN_LAST", null);
            this.accepted = OneSignalPrefs.getBool((String)string2, (String)"ONESIGNAL_PERMISSION_ACCEPTED_LAST", (boolean)false);
        } else {
            this.pushDisabled = OneSignalStateSynchronizer.getUserSubscribePreference() ^ true;
            this.userId = OneSignal.getUserId();
            this.pushToken = OneSignalStateSynchronizer.getRegistrationId();
            this.accepted = bl2;
        }
    }

    private void setAccepted(boolean bl) {
        boolean bl2 = this.isSubscribed();
        this.accepted = bl;
        if (bl2 != this.isSubscribed()) {
            this.observable.notifyChange(this);
        }
    }

    public void changed(OSPermissionState oSPermissionState) {
        this.setAccepted(oSPermissionState.areNotificationsEnabled());
    }

    public Object clone() {
        try {
            Object object = super.clone();
            return object;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean compare(OSSubscriptionState oSSubscriptionState) {
        if (this.pushDisabled != oSSubscriptionState.pushDisabled) return true;
        String string2 = this.userId;
        String string3 = "";
        if (string2 == null) {
            string2 = "";
        }
        String string4 = oSSubscriptionState.userId;
        if (string4 == null) {
            string4 = "";
        }
        if (!string2.equals((Object)string4)) return true;
        string2 = this.pushToken;
        if (string2 == null) {
            string2 = "";
        }
        String string5 = oSSubscriptionState.pushToken;
        string4 = string3;
        if (string5 != null) {
            string4 = string5;
        }
        if (!string2.equals((Object)string4)) return true;
        if (this.accepted == oSSubscriptionState.accepted) return false;
        return true;
    }

    public OSObservable<Object, OSSubscriptionState> getObservable() {
        return this.observable;
    }

    public String getPushToken() {
        return this.pushToken;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isPushDisabled() {
        return this.pushDisabled;
    }

    public boolean isSubscribed() {
        boolean bl = this.userId != null && this.pushToken != null && !this.pushDisabled && this.accepted;
        return bl;
    }

    public void persistAsFrom() {
        String string2 = OneSignalPrefs.PREFS_ONESIGNAL;
        OneSignalPrefs.saveBool((String)string2, (String)"ONESIGNAL_SUBSCRIPTION_LAST", (boolean)this.pushDisabled);
        OneSignalPrefs.saveString((String)string2, (String)"ONESIGNAL_PLAYER_ID_LAST", (String)this.userId);
        OneSignalPrefs.saveString((String)string2, (String)"ONESIGNAL_PUSH_TOKEN_LAST", (String)this.pushToken);
        OneSignalPrefs.saveBool((String)string2, (String)"ONESIGNAL_PERMISSION_ACCEPTED_LAST", (boolean)this.accepted);
    }

    public void setPushDisabled(boolean bl) {
        boolean bl2 = this.pushDisabled != bl;
        this.pushDisabled = bl;
        if (bl2) {
            this.observable.notifyChange(this);
        }
    }

    public void setPushToken(String string2) {
        if (string2 == null) {
            return;
        }
        boolean bl = string2.equals((Object)this.pushToken);
        this.pushToken = string2;
        if (bl ^ true) {
            this.observable.notifyChange(this);
        }
    }

    public void setUserId(@Nullable String string2) {
        boolean bl = true;
        if (!(string2 == null ? this.userId != null : !string2.equals((Object)this.userId))) {
            bl = false;
        }
        this.userId = string2;
        if (bl) {
            this.observable.notifyChange(this);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            String string2 = this.userId;
            if (string2 != null) {
                jSONObject.put("userId", (Object)string2);
            } else {
                jSONObject.put("userId", JSONObject.NULL);
            }
            string2 = this.pushToken;
            if (string2 != null) {
                jSONObject.put("pushToken", (Object)string2);
            } else {
                jSONObject.put("pushToken", JSONObject.NULL);
            }
            jSONObject.put("isPushDisabled", this.isPushDisabled());
            jSONObject.put("isSubscribed", this.isSubscribed());
            return jSONObject;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return this.toJSONObject().toString();
    }
}

