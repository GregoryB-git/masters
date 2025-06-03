/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.work.Constraints
 *  androidx.work.Constraints$Builder
 *  androidx.work.Data$Builder
 *  androidx.work.ExistingWorkPolicy
 *  androidx.work.NetworkType
 *  androidx.work.OneTimeWorkRequest
 *  androidx.work.OneTimeWorkRequest$Builder
 *  com.onesignal.OSReceiveReceiptController$ReceiveReceiptWorker
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.TimeUnit
 */
package com.onesignal;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import com.onesignal.OSReceiveReceiptController;
import com.onesignal.OSRemoteParamController;
import com.onesignal.OSUtils;
import com.onesignal.OSWorkManagerHelper;
import com.onesignal.OneSignal;
import java.util.concurrent.TimeUnit;

class OSReceiveReceiptController {
    private static final String OS_NOTIFICATION_ID = "os_notification_id";
    private static OSReceiveReceiptController sInstance;
    private int maxDelay = 25;
    private int minDelay = 0;
    private final OSRemoteParamController remoteParamController = OneSignal.getRemoteParamController();

    private OSReceiveReceiptController() {
    }

    public static OSReceiveReceiptController getInstance() {
        Class<OSReceiveReceiptController> clazz = OSReceiveReceiptController.class;
        synchronized (OSReceiveReceiptController.class) {
            OSReceiveReceiptController oSReceiveReceiptController;
            if (sInstance == null) {
                sInstance = oSReceiveReceiptController = new OSReceiveReceiptController();
            }
            oSReceiveReceiptController = sInstance;
            // ** MonitorExit[var1] (shouldn't be in output)
            return oSReceiveReceiptController;
        }
    }

    public void beginEnqueueingWork(Context context, String string2) {
        if (!this.remoteParamController.isReceiveReceiptEnabled()) {
            OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "sendReceiveReceipt disabled");
            return;
        }
        int n = OSUtils.getRandomDelay(this.minDelay, this.maxDelay);
        Object object = new Data.Builder().putString(OS_NOTIFICATION_ID, string2).build();
        Constraints constraints = this.buildConstraints();
        OneTimeWorkRequest oneTimeWorkRequest = (OneTimeWorkRequest)((OneTimeWorkRequest.Builder)((OneTimeWorkRequest.Builder)((OneTimeWorkRequest.Builder)new OneTimeWorkRequest.Builder(ReceiveReceiptWorker.class).setConstraints(constraints)).setInitialDelay((long)n, TimeUnit.SECONDS)).setInputData(object)).build();
        object = OneSignal.LOG_LEVEL.DEBUG;
        constraints = new StringBuilder();
        constraints.append("OSReceiveReceiptController enqueueing send receive receipt work with notificationId: ");
        constraints.append(string2);
        constraints.append(" and delay: ");
        constraints.append(n);
        constraints.append(" seconds");
        OneSignal.Log((OneSignal.LOG_LEVEL)((Object)object), constraints.toString());
        OSWorkManagerHelper.getInstance(context).enqueueUniqueWork(z2.o(string2, "_receive_receipt"), ExistingWorkPolicy.KEEP, oneTimeWorkRequest);
    }

    public Constraints buildConstraints() {
        return new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
    }
}

