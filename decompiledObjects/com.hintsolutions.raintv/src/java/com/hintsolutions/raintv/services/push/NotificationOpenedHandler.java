/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  com.hintsolutions.raintv.MainActivity
 *  com.hintsolutions.raintv.common.BaseActivity
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  javax.inject.Inject
 *  org.json.JSONObject
 *  tvrain.utils.PushHelper
 */
package com.hintsolutions.raintv.services.push;

import android.content.Context;
import android.content.Intent;
import com.hintsolutions.raintv.MainActivity;
import com.hintsolutions.raintv.RainApplication;
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.utils.CurrentActivityHolder;
import com.onesignal.OSNotificationAction;
import com.onesignal.OSNotificationOpenedResult;
import com.onesignal.OneSignal;
import javax.inject.Inject;
import org.json.JSONObject;
import tvrain.utils.PushHelper;

public class NotificationOpenedHandler
implements OneSignal.OSNotificationOpenedHandler {
    private static String actionId;
    private static JSONObject pushData;
    @Inject
    public Context context;

    public NotificationOpenedHandler() {
        RainApplication.getAppComponent().inject(this);
    }

    public static String getActionId() {
        return actionId;
    }

    public static JSONObject getPushData() {
        return pushData;
    }

    public static void removePushData() {
        pushData = null;
        actionId = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void notificationOpened(OSNotificationOpenedResult object) {
        try {
            pushData = ((OSNotificationOpenedResult)object).getNotification().getAdditionalData();
            object = ((OSNotificationOpenedResult)object).getAction().getType() == OSNotificationAction.ActionType.ActionTaken ? ((OSNotificationOpenedResult)object).getAction().getActionId() : null;
            actionId = object;
            object = CurrentActivityHolder.getActivity();
            if (object != null) {
                PushHelper.checkPushData((BaseActivity)object, (boolean)true);
                return;
            }
            object = new Intent(this.context, MainActivity.class);
            object = object.setFlags(0x10020000);
            this.context.startActivity((Intent)object);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

