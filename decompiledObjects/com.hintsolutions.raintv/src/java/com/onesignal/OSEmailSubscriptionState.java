/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.onesignal.OneSignalPrefs
 *  com.onesignal.OneSignalStateSynchronizer
 *  java.lang.Cloneable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  org.json.JSONObject
 */
package com.onesignal;

import androidx.annotation.NonNull;
import com.onesignal.OSObservable;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalPrefs;
import com.onesignal.OneSignalStateSynchronizer;
import org.json.JSONObject;

public class OSEmailSubscriptionState
implements Cloneable {
    private static final String CHANGED_KEY = "changed";
    private String emailAddress;
    private String emailUserId;
    private OSObservable<Object, OSEmailSubscriptionState> observable = new OSObservable("changed", false);

    public OSEmailSubscriptionState(boolean bl) {
        if (bl) {
            String string2 = OneSignalPrefs.PREFS_ONESIGNAL;
            this.emailUserId = OneSignalPrefs.getString((String)string2, (String)"PREFS_ONESIGNAL_EMAIL_ID_LAST", null);
            this.emailAddress = OneSignalPrefs.getString((String)string2, (String)"PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST", null);
        } else {
            this.emailUserId = OneSignal.getEmailId();
            this.emailAddress = OneSignalStateSynchronizer.getEmailStateSynchronizer().getRegistrationId();
        }
    }

    public void clearEmailAndId() {
        boolean bl = this.emailUserId != null || this.emailAddress != null;
        this.emailUserId = null;
        this.emailAddress = null;
        if (bl) {
            this.observable.notifyChange(this);
        }
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean compare(OSEmailSubscriptionState object) {
        String string2 = this.emailUserId;
        String string3 = "";
        if (string2 == null) {
            string2 = "";
        }
        String string4 = ((OSEmailSubscriptionState)object).emailUserId;
        if (string4 == null) {
            string4 = "";
        }
        if (!string2.equals((Object)string4)) return true;
        string2 = this.emailAddress;
        if (string2 == null) {
            string2 = "";
        }
        string4 = ((OSEmailSubscriptionState)object).emailAddress;
        object = string3;
        if (string4 != null) {
            object = string4;
        }
        if (string2.equals(object)) return false;
        return true;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public String getEmailUserId() {
        return this.emailUserId;
    }

    public OSObservable<Object, OSEmailSubscriptionState> getObservable() {
        return this.observable;
    }

    public boolean isSubscribed() {
        boolean bl = this.emailUserId != null && this.emailAddress != null;
        return bl;
    }

    public void persistAsFrom() {
        String string2 = OneSignalPrefs.PREFS_ONESIGNAL;
        OneSignalPrefs.saveString((String)string2, (String)"PREFS_ONESIGNAL_EMAIL_ID_LAST", (String)this.emailUserId);
        OneSignalPrefs.saveString((String)string2, (String)"PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST", (String)this.emailAddress);
    }

    public void setEmailAddress(@NonNull String string2) {
        boolean bl = string2.equals((Object)this.emailAddress);
        this.emailAddress = string2;
        if (bl ^ true) {
            this.observable.notifyChange(this);
        }
    }

    public void setEmailUserId(@NonNull String string2) {
        boolean bl = true;
        if (!(string2 == null ? this.emailUserId != null : !string2.equals((Object)this.emailUserId))) {
            bl = false;
        }
        this.emailUserId = string2;
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
            String string2 = this.emailUserId;
            if (string2 != null) {
                jSONObject.put("emailUserId", (Object)string2);
            } else {
                jSONObject.put("emailUserId", JSONObject.NULL);
            }
            string2 = this.emailAddress;
            if (string2 != null) {
                jSONObject.put("emailAddress", (Object)string2);
            } else {
                jSONObject.put("emailAddress", JSONObject.NULL);
            }
            jSONObject.put("isSubscribed", this.isSubscribed());
            return jSONObject;
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

