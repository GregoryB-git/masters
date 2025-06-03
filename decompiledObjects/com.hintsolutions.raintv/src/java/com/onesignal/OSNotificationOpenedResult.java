/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import com.onesignal.OSNotification;
import com.onesignal.OSNotificationAction;
import com.onesignal.OSTimeoutHandler;
import com.onesignal.OneSignal;
import org.json.JSONException;
import org.json.JSONObject;

public class OSNotificationOpenedResult
implements OneSignal.EntryStateListener {
    private static final long PROCESS_NOTIFICATION_TIMEOUT = 5000L;
    private OSNotificationAction action;
    private boolean isComplete = false;
    private OSNotification notification;
    private final OSTimeoutHandler timeoutHandler;
    private final Runnable timeoutRunnable;

    public OSNotificationOpenedResult(OSNotification object, OSNotificationAction object2) {
        this.notification = object;
        this.action = object2;
        object2 = OSTimeoutHandler.getTimeoutHandler();
        this.timeoutHandler = object2;
        object = new Runnable(this){
            public final OSNotificationOpenedResult this$0;
            {
                this.this$0 = oSNotificationOpenedResult;
            }

            public void run() {
                OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "Running complete from OSNotificationOpenedResult timeout runnable!");
                OSNotificationOpenedResult.access$000(this.this$0, false);
            }
        };
        this.timeoutRunnable = object;
        ((OSTimeoutHandler)((Object)object2)).startTimeout(5000L, (Runnable)object);
    }

    public static /* synthetic */ void access$000(OSNotificationOpenedResult oSNotificationOpenedResult, boolean bl) {
        oSNotificationOpenedResult.complete(bl);
    }

    private void complete(boolean bl) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSNotificationOpenedResult complete called with opened: ");
        stringBuilder.append(bl);
        OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
        this.timeoutHandler.destroyTimeout(this.timeoutRunnable);
        if (this.isComplete) {
            OneSignal.onesignalLog(lOG_LEVEL, "OSNotificationOpenedResult already completed");
            return;
        }
        this.isComplete = true;
        if (bl) {
            OneSignal.applicationOpenedByNotification(this.notification.getNotificationId());
        }
        OneSignal.removeEntryStateListener(this);
    }

    public OSNotificationAction getAction() {
        return this.action;
    }

    public OSNotification getNotification() {
        return this.notification;
    }

    @Override
    public void onEntryStateChange(OneSignal.AppEntryAction appEntryAction) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSNotificationOpenedResult onEntryStateChange called with appEntryState: ");
        stringBuilder.append((Object)appEntryAction);
        OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
        this.complete(OneSignal.AppEntryAction.APP_CLOSE.equals((Object)appEntryAction));
    }

    @Deprecated
    public String stringify() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", (Object)this.action.toJSONObject());
            jSONObject.put("notification", (Object)this.notification.toJSONObject());
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        return jSONObject.toString();
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", (Object)this.action.toJSONObject());
            jSONObject.put("notification", (Object)this.notification.toJSONObject());
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("OSNotificationOpenedResult{notification=");
        stringBuilder.append((Object)this.notification);
        stringBuilder.append(", action=");
        stringBuilder.append((Object)this.action);
        stringBuilder.append(", isComplete=");
        stringBuilder.append(this.isComplete);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

