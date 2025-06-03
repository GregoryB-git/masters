/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.IntentService
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  com.onesignal.FCMIntentService$1
 *  java.lang.Object
 */
package com.onesignal;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.FCMIntentService;
import com.onesignal.NotificationBundleProcessor;
import com.onesignal.OneSignal;

public class FCMIntentService
extends IntentService {
    public FCMIntentService() {
        super("FCMIntentService");
        this.setIntentRedelivery(true);
    }

    public void onHandleIntent(Intent intent) {
        Bundle bundle = intent.getExtras();
        if (bundle == null) {
            return;
        }
        OneSignal.initWithContext((Context)this);
        NotificationBundleProcessor.processBundleFromReceiver((Context)this, bundle, (NotificationBundleProcessor.ProcessBundleReceiverCallback)new 1(this, intent));
    }
}

