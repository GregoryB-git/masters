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

public class OSSMSSubscriptionState
implements Cloneable {
    private static final String CHANGED_KEY = "changed";
    private static final String SMS_NUMBER = "smsNumber";
    private static final String SMS_USER_ID = "smsUserId";
    private static final String SUBSCRIBED = "isSubscribed";
    private OSObservable<Object, OSSMSSubscriptionState> observable = new OSObservable("changed", false);
    private String smsNumber;
    private String smsUserId;

    public OSSMSSubscriptionState(boolean bl) {
        if (bl) {
            String string2 = OneSignalPrefs.PREFS_ONESIGNAL;
            this.smsUserId = OneSignalPrefs.getString((String)string2, (String)"PREFS_OS_SMS_ID_LAST", null);
            this.smsNumber = OneSignalPrefs.getString((String)string2, (String)"PREFS_OS_SMS_NUMBER_LAST", null);
        } else {
            this.smsUserId = OneSignal.getSMSId();
            this.smsNumber = OneSignalStateSynchronizer.getSMSStateSynchronizer().getRegistrationId();
        }
    }

    public void clearSMSAndId() {
        boolean bl = this.smsUserId != null || this.smsNumber != null;
        this.smsUserId = null;
        this.smsNumber = null;
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
    public boolean compare(OSSMSSubscriptionState object) {
        String string2 = this.smsUserId;
        String string3 = "";
        if (string2 == null) {
            string2 = "";
        }
        String string4 = ((OSSMSSubscriptionState)object).smsUserId;
        if (string4 == null) {
            string4 = "";
        }
        if (!string2.equals((Object)string4)) return true;
        string2 = this.smsNumber;
        if (string2 == null) {
            string2 = "";
        }
        string4 = ((OSSMSSubscriptionState)object).smsNumber;
        object = string3;
        if (string4 != null) {
            object = string4;
        }
        if (string2.equals(object)) return false;
        return true;
    }

    public OSObservable<Object, OSSMSSubscriptionState> getObservable() {
        return this.observable;
    }

    public String getSMSNumber() {
        return this.smsNumber;
    }

    public String getSmsUserId() {
        return this.smsUserId;
    }

    public boolean isSubscribed() {
        boolean bl = this.smsUserId != null && this.smsNumber != null;
        return bl;
    }

    public void persistAsFrom() {
        String string2 = OneSignalPrefs.PREFS_ONESIGNAL;
        OneSignalPrefs.saveString((String)string2, (String)"PREFS_OS_SMS_ID_LAST", (String)this.smsUserId);
        OneSignalPrefs.saveString((String)string2, (String)"PREFS_OS_SMS_NUMBER_LAST", (String)this.smsNumber);
    }

    public void setSMSNumber(@NonNull String string2) {
        boolean bl = string2.equals((Object)this.smsNumber);
        this.smsNumber = string2;
        if (bl ^ true) {
            this.observable.notifyChange(this);
        }
    }

    public void setSMSUserId(@NonNull String string2) {
        boolean bl = true;
        if (!(string2 == null ? this.smsUserId != null : !string2.equals((Object)this.smsUserId))) {
            bl = false;
        }
        this.smsUserId = string2;
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
            String string2 = this.smsUserId;
            if (string2 != null) {
                jSONObject.put(SMS_USER_ID, (Object)string2);
            } else {
                jSONObject.put(SMS_USER_ID, JSONObject.NULL);
            }
            string2 = this.smsNumber;
            if (string2 != null) {
                jSONObject.put(SMS_NUMBER, (Object)string2);
            } else {
                jSONObject.put(SMS_NUMBER, JSONObject.NULL);
            }
            jSONObject.put(SUBSCRIBED, this.isSubscribed());
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

