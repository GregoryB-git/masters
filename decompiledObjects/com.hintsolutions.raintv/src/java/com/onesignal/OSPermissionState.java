/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.onesignal.OneSignalPrefs
 *  java.lang.Cloneable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  org.json.JSONObject
 */
package com.onesignal;

import com.onesignal.OSObservable;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalPrefs;
import org.json.JSONObject;

public class OSPermissionState
implements Cloneable {
    private static final String ARE_NOTIFICATION_ENABLED_KEY = "areNotificationsEnabled";
    private static final String CHANGED_KEY = "changed";
    private boolean notificationsEnabled;
    private OSObservable<Object, OSPermissionState> observable = new OSObservable("changed", false);

    public OSPermissionState(boolean bl) {
        if (bl) {
            this.notificationsEnabled = OneSignalPrefs.getBool((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", (boolean)false);
        } else {
            this.refreshAsTo();
        }
    }

    private void setNotificationsEnabled(boolean bl) {
        boolean bl2 = this.notificationsEnabled != bl;
        this.notificationsEnabled = bl;
        if (bl2) {
            this.observable.notifyChange(this);
        }
    }

    public boolean areNotificationsEnabled() {
        return this.notificationsEnabled;
    }

    public Object clone() {
        try {
            Object object = super.clone();
            return object;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public boolean compare(OSPermissionState oSPermissionState) {
        boolean bl = this.notificationsEnabled != oSPermissionState.notificationsEnabled;
        return bl;
    }

    public OSObservable<Object, OSPermissionState> getObservable() {
        return this.observable;
    }

    public void persistAsFrom() {
        OneSignalPrefs.saveBool((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", (boolean)this.notificationsEnabled);
    }

    public void refreshAsTo() {
        this.setNotificationsEnabled(OSUtils.areNotificationsEnabled(OneSignal.appContext));
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ARE_NOTIFICATION_ENABLED_KEY, this.notificationsEnabled);
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return this.toJSONObject().toString();
    }
}

