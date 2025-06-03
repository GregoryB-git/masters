/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.StringBuilder
 */
package com.onesignal;

import com.onesignal.OSInAppMessage;
import com.onesignal.OneSignal;

public abstract class OSInAppMessageLifecycleHandler {
    public void onDidDismissInAppMessage(OSInAppMessage oSInAppMessage) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.VERBOSE;
        StringBuilder stringBuilder = z2.t("OSInAppMessageLifecycleHandler: IAM Did Dismiss: ");
        stringBuilder.append(oSInAppMessage.getMessageId());
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
    }

    public void onDidDisplayInAppMessage(OSInAppMessage oSInAppMessage) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.VERBOSE;
        StringBuilder stringBuilder = z2.t("OSInAppMessageLifecycleHandler: IAM Did Display: ");
        stringBuilder.append(oSInAppMessage.getMessageId());
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
    }

    public void onWillDismissInAppMessage(OSInAppMessage oSInAppMessage) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.VERBOSE;
        StringBuilder stringBuilder = z2.t("OSInAppMessageLifecycleHandler: IAM Will Dismiss: ");
        stringBuilder.append(oSInAppMessage.getMessageId());
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
    }

    public void onWillDisplayInAppMessage(OSInAppMessage oSInAppMessage) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.VERBOSE;
        StringBuilder stringBuilder = z2.t("OSInAppMessageLifecycleHandler: IAM Will Display: ");
        stringBuilder.append(oSInAppMessage.getMessageId());
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
    }
}

