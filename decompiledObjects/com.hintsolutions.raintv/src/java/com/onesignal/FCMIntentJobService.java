/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.RequiresApi
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.onesignal.JobIntentService;
import com.onesignal.NotificationBundleProcessor;
import com.onesignal.OneSignal;

@RequiresApi(api=21)
public class FCMIntentJobService
extends JobIntentService {
    public static final String BUNDLE_EXTRA = "Bundle:Parcelable:Extras";
    private static final int JOB_ID = 123890;

    public static void enqueueWork(Context context, Intent intent) {
        JobIntentService.enqueueWork(context, FCMIntentJobService.class, 123890, intent, false);
    }

    @Override
    public void onHandleWork(@NonNull Intent intent) {
        if ((intent = intent.getExtras()) == null) {
            return;
        }
        OneSignal.initWithContext((Context)this);
        NotificationBundleProcessor.processBundleFromReceiver((Context)this, (Bundle)intent, new NotificationBundleProcessor.ProcessBundleReceiverCallback(this){
            public final FCMIntentJobService this$0;
            {
                this.this$0 = fCMIntentJobService;
            }

            @Override
            public void onBundleProcessed(@Nullable NotificationBundleProcessor.ProcessedBundleResult processedBundleResult) {
            }
        });
    }
}

