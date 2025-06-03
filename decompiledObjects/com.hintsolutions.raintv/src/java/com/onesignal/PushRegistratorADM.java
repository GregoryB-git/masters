/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.amazon.device.messaging.ADM
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
import com.amazon.device.messaging.ADM;
import com.onesignal.OneSignal;
import com.onesignal.PushRegistrator;

public class PushRegistratorADM
implements PushRegistrator {
    private static boolean callbackSuccessful;
    private static PushRegistrator.RegisteredHandler registeredCallback;

    public static /* synthetic */ boolean access$000() {
        return callbackSuccessful;
    }

    public static void fireCallback(String string2) {
        PushRegistrator.RegisteredHandler registeredHandler = registeredCallback;
        if (registeredHandler == null) {
            return;
        }
        callbackSuccessful = true;
        registeredHandler.complete(string2, 1);
    }

    @Override
    public void registerForPush(Context context, String string2, PushRegistrator.RegisteredHandler registeredHandler) {
        registeredCallback = registeredHandler;
        new Thread(new Runnable(this, context, registeredHandler){
            public final PushRegistratorADM this$0;
            public final PushRegistrator.RegisteredHandler val$callback;
            public final Context val$context;
            {
                this.this$0 = pushRegistratorADM;
                this.val$context = context;
                this.val$callback = registeredHandler;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void run() {
                ADM aDM = new ADM(this.val$context);
                String string2 = aDM.getRegistrationId();
                if (string2 == null) {
                    aDM.startRegister();
                } else {
                    OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
                    aDM = new StringBuilder();
                    aDM.append("ADM Already registered with ID:");
                    aDM.append(string2);
                    OneSignal.Log(lOG_LEVEL, aDM.toString());
                    this.val$callback.complete(string2, 1);
                }
                try {
                    Thread.sleep((long)30000L);
                }
                catch (InterruptedException interruptedException) {}
                if (!PushRegistratorADM.access$000()) {
                    OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.");
                    PushRegistratorADM.fireCallback(null);
                }
            }
        }).start();
    }
}

