/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import androidx.annotation.Nullable;
import com.onesignal.OSNotification;
import com.onesignal.OSNotificationController;
import com.onesignal.OSTimeoutHandler;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import org.json.JSONException;
import org.json.JSONObject;

public class OSNotificationReceivedEvent {
    private static final long PROCESS_NOTIFICATION_TIMEOUT = 25000L;
    private final OSNotificationController controller;
    private boolean isComplete = false;
    private final OSNotification notification;
    private final OSTimeoutHandler timeoutHandler;
    private final Runnable timeoutRunnable;

    public OSNotificationReceivedEvent(OSNotificationController object, OSNotification object2) {
        this.notification = object2;
        this.controller = object;
        object = OSTimeoutHandler.getTimeoutHandler();
        this.timeoutHandler = object;
        object2 = new Runnable(this){
            public final OSNotificationReceivedEvent this$0;
            {
                this.this$0 = oSNotificationReceivedEvent;
            }

            public void run() {
                OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "Running complete from OSNotificationReceivedEvent timeout runnable!");
                OSNotificationReceivedEvent oSNotificationReceivedEvent = this.this$0;
                oSNotificationReceivedEvent.complete(oSNotificationReceivedEvent.getNotification());
            }
        };
        this.timeoutRunnable = object2;
        ((OSTimeoutHandler)((Object)object)).startTimeout(25000L, (Runnable)object2);
    }

    public static boolean isRunningOnMainThread() {
        return OSUtils.isRunningOnMainThread();
    }

    private void processNotification(@Nullable OSNotification oSNotification) {
        OSNotificationController oSNotificationController = this.controller;
        OSNotification oSNotification2 = this.notification.copy();
        oSNotification = oSNotification != null ? oSNotification.copy() : null;
        oSNotificationController.processNotification(oSNotification2, oSNotification);
    }

    public void complete(@Nullable OSNotification oSNotification) {
        OSNotificationReceivedEvent oSNotificationReceivedEvent = this;
        synchronized (oSNotificationReceivedEvent) {
            this.timeoutHandler.destroyTimeout(this.timeoutRunnable);
            if (this.isComplete) {
                OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "OSNotificationReceivedEvent already completed");
                return;
            }
            this.isComplete = true;
            if (OSNotificationReceivedEvent.isRunningOnMainThread()) {
                Runnable runnable = new Runnable(this, oSNotification){
                    public final OSNotificationReceivedEvent this$0;
                    public final OSNotification val$notification;
                    {
                        this.this$0 = oSNotificationReceivedEvent;
                        this.val$notification = oSNotification;
                    }

                    public void run() {
                        this.this$0.processNotification(this.val$notification);
                    }
                };
                Thread thread = new Thread(runnable, "OS_COMPLETE_NOTIFICATION");
                thread.start();
                return;
            }
            this.processNotification(oSNotification);
            return;
        }
    }

    public OSNotification getNotification() {
        return this.notification;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("notification", (Object)this.notification.toJSONObject());
            jSONObject.put("isComplete", this.isComplete);
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("OSNotificationReceivedEvent{isComplete=");
        stringBuilder.append(this.isComplete);
        stringBuilder.append(", notification=");
        stringBuilder.append((Object)this.notification);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

