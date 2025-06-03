/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  com.amazon.device.messaging.ADMMessageHandlerBase
 *  com.amazon.device.messaging.ADMMessageReceiver
 *  com.onesignal.ADMMessageHandler$1
 *  com.onesignal.PushRegistratorADM
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.amazon.device.messaging.ADMMessageReceiver;
import com.onesignal.ADMMessageHandler;
import com.onesignal.ADMMessageHandlerJob;
import com.onesignal.NotificationBundleProcessor;
import com.onesignal.OneSignal;
import com.onesignal.PushRegistratorADM;

public class ADMMessageHandler
extends ADMMessageHandlerBase {
    private static final int JOB_ID = 123891;

    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    public void onMessage(Intent intent) {
        Context context = this.getApplicationContext();
        intent = intent.getExtras();
        NotificationBundleProcessor.processBundleFromReceiver(context, (Bundle)intent, (NotificationBundleProcessor.ProcessBundleReceiverCallback)new 1(this, (Bundle)intent, context));
    }

    public void onRegistered(String string2) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.INFO;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ADM registration ID: ");
        stringBuilder.append(string2);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        PushRegistratorADM.fireCallback((String)string2);
    }

    public void onRegistrationError(String string2) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.ERROR;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ADM:onRegistrationError: ");
        stringBuilder.append(string2);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        if ("INVALID_SENDER".equals((Object)string2)) {
            OneSignal.Log(lOG_LEVEL, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.");
        }
        PushRegistratorADM.fireCallback(null);
    }

    public void onUnregistered(String string2) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.INFO;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ADM:onUnregistered: ");
        stringBuilder.append(string2);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
    }

    public static class Receiver
    extends ADMMessageReceiver {
        public Receiver() {
            super(ADMMessageHandler.class);
            boolean bl;
            try {
                Class.forName((String)"com.amazon.device.messaging.ADMMessageHandlerJobBase");
                bl = true;
            }
            catch (ClassNotFoundException classNotFoundException) {
                bl = false;
            }
            if (bl) {
                this.registerJobServiceClass(ADMMessageHandlerJob.class, 123891);
            }
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ADM latest available: ");
            stringBuilder.append(bl);
            OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        }
    }
}

