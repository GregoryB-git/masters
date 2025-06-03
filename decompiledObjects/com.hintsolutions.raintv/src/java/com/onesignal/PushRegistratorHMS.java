/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.huawei.agconnect.config.AGConnectServicesConfig
 *  com.huawei.hms.aaid.HmsInstanceId
 *  com.huawei.hms.common.ApiException
 *  java.lang.CharSequence
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 */
package com.onesignal;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.common.ApiException;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.PushRegistrator;

class PushRegistratorHMS
implements PushRegistrator {
    public static final String HMS_CLIENT_APP_ID = "client/app_id";
    private static final int NEW_TOKEN_TIMEOUT_MS = 30000;
    private static boolean callbackSuccessful;
    @Nullable
    private static PushRegistrator.RegisteredHandler registeredHandler;

    public static /* synthetic */ void access$000(PushRegistratorHMS pushRegistratorHMS, Context context, PushRegistrator.RegisteredHandler registeredHandler) throws ApiException {
        pushRegistratorHMS.getHMSTokenTask(context, registeredHandler);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void doTimeOutWait() {
        try {
            Thread.sleep((long)30000L);
            return;
        }
        catch (InterruptedException interruptedException) {
            return;
        }
    }

    public static void fireCallback(String string2) {
        PushRegistrator.RegisteredHandler registeredHandler = PushRegistratorHMS.registeredHandler;
        if (registeredHandler == null) {
            return;
        }
        callbackSuccessful = true;
        registeredHandler.complete(string2, 1);
    }

    private void getHMSTokenTask(@NonNull Context object, @NonNull PushRegistrator.RegisteredHandler registeredHandler) throws ApiException {
        PushRegistratorHMS pushRegistratorHMS = this;
        synchronized (pushRegistratorHMS) {
            if (!OSUtils.hasAllHMSLibrariesForPushKit()) {
                registeredHandler.complete(null, -28);
                return;
            }
            String string2 = AGConnectServicesConfig.fromContext((Context)object).getString(HMS_CLIENT_APP_ID);
            String string3 = HmsInstanceId.getInstance((Context)object).getToken(string2, "HCM");
            if (!TextUtils.isEmpty((CharSequence)string3)) {
                object = OneSignal.LOG_LEVEL.INFO;
                string2 = new StringBuilder();
                string2.append("Device registered for HMS, push token = ");
                string2.append(string3);
                OneSignal.Log((OneSignal.LOG_LEVEL)((Object)object), string2.toString());
                registeredHandler.complete(string3, 1);
            } else {
                this.waitForOnNewPushTokenEvent(registeredHandler);
            }
            return;
        }
    }

    private void waitForOnNewPushTokenEvent(@NonNull PushRegistrator.RegisteredHandler registeredHandler) {
        PushRegistratorHMS.doTimeOutWait();
        if (!callbackSuccessful) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "HmsMessageServiceOneSignal.onNewToken timed out.");
            registeredHandler.complete(null, -25);
        }
    }

    @Override
    public void registerForPush(@NonNull Context context, String string2, @NonNull PushRegistrator.RegisteredHandler registeredHandler) {
        PushRegistratorHMS.registeredHandler = registeredHandler;
        new Thread(new Runnable(this, context, registeredHandler){
            public final PushRegistratorHMS this$0;
            public final PushRegistrator.RegisteredHandler val$callback;
            public final Context val$context;
            {
                this.this$0 = pushRegistratorHMS;
                this.val$context = context;
                this.val$callback = registeredHandler;
            }

            public void run() {
                try {
                    PushRegistratorHMS.access$000(this.this$0, this.val$context, this.val$callback);
                }
                catch (ApiException apiException) {
                    OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "HMS ApiException getting Huawei push token!", apiException);
                    int n = apiException.getStatusCode() == 907135000 ? -26 : -27;
                    this.val$callback.complete(null, n);
                }
            }
        }, "OS_HMS_GET_TOKEN").start();
    }
}

