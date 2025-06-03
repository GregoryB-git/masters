/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 */
package com.onesignal;

import android.content.Context;
import com.onesignal.GooglePlayServicesUpgradePrompt;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.PushRegistrator;
import java.io.IOException;

abstract class PushRegistratorAbstractGoogle
implements PushRegistrator {
    private static int REGISTRATION_RETRY_BACKOFF_MS = 10000;
    private static int REGISTRATION_RETRY_COUNT = 5;
    private boolean firedCallback;
    private Thread registerThread;
    private PushRegistrator.RegisteredHandler registeredHandler;

    public static /* synthetic */ int access$000() {
        return REGISTRATION_RETRY_COUNT;
    }

    public static /* synthetic */ boolean access$100(PushRegistratorAbstractGoogle pushRegistratorAbstractGoogle, String string2, int n) {
        return pushRegistratorAbstractGoogle.attemptRegistration(string2, n);
    }

    public static /* synthetic */ int access$200() {
        return REGISTRATION_RETRY_BACKOFF_MS;
    }

    private boolean attemptRegistration(String object, int n) {
        try {
            String string2 = this.getToken((String)object);
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.INFO;
            object = new StringBuilder();
            object.append("Device registered, push token = ");
            object.append(string2);
            OneSignal.Log(lOG_LEVEL, object.toString());
            this.registeredHandler.complete(string2, 1);
            return true;
        }
        catch (Throwable throwable) {
            object = new Exception(throwable);
            n = PushRegistratorAbstractGoogle.pushStatusFromThrowable(throwable);
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.ERROR;
            StringBuilder stringBuilder = z2.t("Unknown error getting ");
            stringBuilder.append(this.getProviderName());
            stringBuilder.append(" Token");
            OneSignal.Log(lOG_LEVEL, stringBuilder.toString(), (Throwable)object);
            this.registeredHandler.complete(null, n);
            return true;
        }
        catch (IOException iOException) {
            int n2 = PushRegistratorAbstractGoogle.pushStatusFromThrowable(iOException);
            Object object2 = OSUtils.getRootCauseMessage(iOException);
            boolean bl = "SERVICE_NOT_AVAILABLE".equals(object2) || "AUTHENTICATION_FAILED".equals(object2);
            if (bl) {
                Exception exception = new Exception((Throwable)iOException);
                if (n >= REGISTRATION_RETRY_COUNT - 1) {
                    object2 = OneSignal.LOG_LEVEL.ERROR;
                    StringBuilder stringBuilder = z2.t("Retry count of ");
                    stringBuilder.append(REGISTRATION_RETRY_COUNT);
                    stringBuilder.append(" exceed! Could not get a ");
                    stringBuilder.append(this.getProviderName());
                    stringBuilder.append(" Token.");
                    OneSignal.Log((OneSignal.LOG_LEVEL)((Object)object2), stringBuilder.toString(), exception);
                } else {
                    OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.INFO;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("'Google Play services' returned ");
                    stringBuilder.append(object2);
                    stringBuilder.append(" error. Current retry count: ");
                    stringBuilder.append(n);
                    OneSignal.Log(lOG_LEVEL, stringBuilder.toString(), exception);
                    if (n == 2) {
                        this.registeredHandler.complete(null, n2);
                        this.firedCallback = true;
                        return true;
                    }
                }
                return false;
            }
            object2 = new Exception((Throwable)iOException);
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.ERROR;
            StringBuilder stringBuilder = z2.t("Error Getting ");
            stringBuilder.append(this.getProviderName());
            stringBuilder.append(" Token");
            OneSignal.Log(lOG_LEVEL, stringBuilder.toString(), (Throwable)object2);
            if (!this.firedCallback) {
                this.registeredHandler.complete(null, n2);
            }
            return true;
        }
    }

    private void internalRegisterForPush(String object) {
        try {
            if (OSUtils.isGMSInstalledAndEnabled()) {
                this.registerInBackground((String)object);
            } else {
                GooglePlayServicesUpgradePrompt.showUpdateGPSDialog();
                OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "'Google Play services' app not installed or disabled on the device.");
                this.registeredHandler.complete(null, -7);
            }
        }
        catch (Throwable throwable) {
            object = OneSignal.LOG_LEVEL.ERROR;
            StringBuilder stringBuilder = z2.t("Could not register with ");
            stringBuilder.append(this.getProviderName());
            stringBuilder.append(" due to an issue with your AndroidManifest.xml or with 'Google Play services'.");
            OneSignal.Log((OneSignal.LOG_LEVEL)((Object)object), stringBuilder.toString(), throwable);
            this.registeredHandler.complete(null, -8);
        }
    }

    private boolean isValidProjectNumber(String string2, PushRegistrator.RegisteredHandler registeredHandler) {
        boolean bl;
        try {
            Float.parseFloat((String)string2);
            bl = true;
        }
        catch (Throwable throwable) {
            bl = false;
        }
        if (!bl) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard.");
            registeredHandler.complete(null, -6);
            return false;
        }
        return true;
    }

    private static int pushStatusFromThrowable(Throwable throwable) {
        String string2 = OSUtils.getRootCauseMessage(throwable);
        if (throwable instanceof IOException) {
            if ("SERVICE_NOT_AVAILABLE".equals((Object)string2)) {
                return -9;
            }
            if ("AUTHENTICATION_FAILED".equals((Object)string2)) {
                return -29;
            }
            return -11;
        }
        return -12;
    }

    private void registerInBackground(String string2) {
        PushRegistratorAbstractGoogle pushRegistratorAbstractGoogle = this;
        synchronized (pushRegistratorAbstractGoogle) {
            Thread thread;
            Object object;
            block5: {
                object = this.registerThread;
                if (object == null) break block5;
                boolean bl = object.isAlive();
                if (!bl) break block5;
                return;
            }
            object = new Runnable(this, string2){
                public final PushRegistratorAbstractGoogle this$0;
                public final String val$senderId;
                {
                    this.this$0 = pushRegistratorAbstractGoogle;
                    this.val$senderId = string2;
                }

                public void run() {
                    int n = 0;
                    while (n < PushRegistratorAbstractGoogle.access$000()) {
                        if (PushRegistratorAbstractGoogle.access$100(this.this$0, this.val$senderId, n)) {
                            return;
                        }
                        int n2 = PushRegistratorAbstractGoogle.access$200();
                        OSUtils.sleep(n2 * ++n);
                    }
                }
            };
            this.registerThread = thread = new Thread((Runnable)object);
            thread.start();
            return;
        }
    }

    public abstract String getProviderName();

    public abstract String getToken(String var1) throws Throwable;

    @Override
    public void registerForPush(Context context, String string2, PushRegistrator.RegisteredHandler registeredHandler) {
        this.registeredHandler = registeredHandler;
        if (this.isValidProjectNumber(string2, registeredHandler)) {
            this.internalRegisterForPush(string2);
        }
    }
}

