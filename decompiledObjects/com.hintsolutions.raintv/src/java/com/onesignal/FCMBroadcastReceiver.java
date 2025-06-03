/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  androidx.annotation.Nullable
 *  androidx.legacy.content.WakefulBroadcastReceiver
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.onesignal;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.onesignal.BundleCompat;
import com.onesignal.BundleCompatBundle;
import com.onesignal.BundleCompatFactory;
import com.onesignal.FCMIntentJobService;
import com.onesignal.FCMIntentService;
import com.onesignal.NotificationBundleProcessor;
import com.onesignal.OneSignal;

public class FCMBroadcastReceiver
extends WakefulBroadcastReceiver {
    private static final String FCM_RECEIVE_ACTION = "com.google.android.c2dm.intent.RECEIVE";
    private static final String FCM_TYPE = "gcm";
    private static final String MESSAGE_TYPE_EXTRA_KEY = "message_type";

    private static boolean isFCMMessage(Intent object) {
        boolean bl;
        block2: {
            block3: {
                boolean bl2;
                boolean bl3 = FCM_RECEIVE_ACTION.equals((Object)object.getAction());
                bl = bl2 = false;
                if (!bl3) break block2;
                if ((object = object.getStringExtra(MESSAGE_TYPE_EXTRA_KEY)) == null) break block3;
                bl = bl2;
                if (!FCM_TYPE.equals(object)) break block2;
            }
            bl = true;
        }
        return bl;
    }

    private static void processOrderBroadcast(Context context, Intent intent, Bundle bundle, NotificationBundleProcessor.ProcessBundleReceiverCallback processBundleReceiverCallback) {
        if (!FCMBroadcastReceiver.isFCMMessage(intent)) {
            processBundleReceiverCallback.onBundleProcessed(null);
        }
        NotificationBundleProcessor.processBundleFromReceiver(context, bundle, new NotificationBundleProcessor.ProcessBundleReceiverCallback(processBundleReceiverCallback, context, bundle){
            public final Bundle val$bundle;
            public final Context val$context;
            public final NotificationBundleProcessor.ProcessBundleReceiverCallback val$fcmBundleReceiver;
            {
                this.val$fcmBundleReceiver = processBundleReceiverCallback;
                this.val$context = context;
                this.val$bundle = bundle;
            }

            @Override
            public void onBundleProcessed(@Nullable NotificationBundleProcessor.ProcessedBundleResult processedBundleResult) {
                if (processedBundleResult != null && processedBundleResult.processed()) {
                    this.val$fcmBundleReceiver.onBundleProcessed(processedBundleResult);
                    return;
                }
                FCMBroadcastReceiver.startFCMService(this.val$context, this.val$bundle);
                this.val$fcmBundleReceiver.onBundleProcessed(processedBundleResult);
            }
        });
    }

    private void setAbort() {
        if (this.isOrderedBroadcast()) {
            this.abortBroadcast();
            this.setResultCode(-1);
        }
    }

    private static BundleCompat setCompatBundleForServer(Bundle bundle, BundleCompat bundleCompat) {
        bundleCompat.putString("json_payload", NotificationBundleProcessor.bundleAsJSONObject(bundle).toString());
        bundleCompat.putLong("timestamp", OneSignal.getTime().getCurrentTimeMillis() / 1000L);
        return bundleCompat;
    }

    private void setSuccessfulResultCode() {
        if (this.isOrderedBroadcast()) {
            this.setResultCode(-1);
        }
    }

    public static void startFCMService(Context context, Bundle bundle) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("startFCMService from: ");
        stringBuilder.append((Object)context);
        stringBuilder.append(" and bundle: ");
        stringBuilder.append((Object)bundle);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        if (!NotificationBundleProcessor.hasRemoteResource(bundle)) {
            OneSignal.Log(lOG_LEVEL, "startFCMService with no remote resources, no need for services");
            NotificationBundleProcessor.processFromFCMIntentService(context, FCMBroadcastReceiver.setCompatBundleForServer(bundle, BundleCompatFactory.getInstance()));
            return;
        }
        boolean bl = Integer.parseInt((String)bundle.getString("pri", "0")) > 9;
        if (!bl && Build.VERSION.SDK_INT >= 26) {
            FCMBroadcastReceiver.startFCMServiceWithJobIntentService(context, bundle);
        } else {
            try {
                FCMBroadcastReceiver.startFCMServiceWithWakefulService(context, bundle);
            }
            catch (IllegalStateException illegalStateException) {
                FCMBroadcastReceiver.startFCMServiceWithJobIntentService(context, bundle);
            }
        }
    }

    @TargetApi(value=21)
    private static void startFCMServiceWithJobIntentService(Context context, Bundle bundle) {
        BundleCompat bundleCompat = FCMBroadcastReceiver.setCompatBundleForServer(bundle, BundleCompatFactory.getInstance());
        bundle = new Intent(context, FCMIntentJobService.class);
        bundle.putExtra("Bundle:Parcelable:Extras", (Parcelable)bundleCompat.getBundle());
        FCMIntentJobService.enqueueWork(context, (Intent)bundle);
    }

    private static void startFCMServiceWithWakefulService(Context context, Bundle object) {
        ComponentName componentName = new ComponentName(context.getPackageName(), FCMIntentService.class.getName());
        object = FCMBroadcastReceiver.setCompatBundleForServer((Bundle)object, new BundleCompatBundle());
        WakefulBroadcastReceiver.startWakefulService((Context)context, (Intent)new Intent().replaceExtras((Bundle)object.getBundle()).setComponent(componentName));
    }

    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();
        if (bundle != null && !"google.com/iid".equals((Object)bundle.getString("from"))) {
            OneSignal.initWithContext(context);
            FCMBroadcastReceiver.processOrderBroadcast(context, intent, bundle, new NotificationBundleProcessor.ProcessBundleReceiverCallback(this){
                public final FCMBroadcastReceiver this$0;
                {
                    this.this$0 = fCMBroadcastReceiver;
                }

                @Override
                public void onBundleProcessed(@Nullable NotificationBundleProcessor.ProcessedBundleResult processedBundleResult) {
                    if (processedBundleResult == null) {
                        this.this$0.setSuccessfulResultCode();
                        return;
                    }
                    if (!processedBundleResult.isDup() && !processedBundleResult.isWorkManagerProcessing()) {
                        this.this$0.setSuccessfulResultCode();
                        return;
                    }
                    this.this$0.setAbort();
                }
            });
        }
    }
}

