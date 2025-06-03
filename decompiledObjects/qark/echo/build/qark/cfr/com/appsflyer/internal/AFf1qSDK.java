/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.ClassNotFoundException
 *  java.lang.Long
 *  java.lang.NoSuchMethodError
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Observer
 *  java.util.concurrent.ExecutorService
 */
package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1fSDK;
import com.appsflyer.internal.AFf1pSDK;
import com.appsflyer.internal.AFf1uSDK;
import com.appsflyer.internal.w;
import java.util.HashMap;
import java.util.Map;
import java.util.Observer;
import java.util.concurrent.ExecutorService;

public class AFf1qSDK
extends AFf1uSDK {
    @NonNull
    private final ExecutorService AFInAppEventType;
    public final Map<String, Object> valueOf = new HashMap();

    public AFf1qSDK(@NonNull Runnable runnable, @NonNull ExecutorService executorService) {
        super("store", "google", runnable);
        this.AFInAppEventType = executorService;
    }

    private static boolean AFInAppEventType(@NonNull Context context) {
        ClassNotFoundException classNotFoundException2;
        block6 : {
            Throwable throwable2;
            block5 : {
                if (!AFf1uSDK.valueOf()) {
                    return false;
                }
                try {
                    if (AFa1fSDK.values(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                        AFLogger.afDebugLog("Install referrer is allowed");
                        return true;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                catch (ClassNotFoundException classNotFoundException2) {
                    break block6;
                }
                AFLogger.afDebugLog("Install referrer is not allowed");
                return false;
            }
            AFLogger.afErrorLog("An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), throwable2);
            return false;
        }
        AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", (Throwable)classNotFoundException2);
        StringBuilder stringBuilder = new StringBuilder("Class ");
        stringBuilder.append("com.android.installreferrer.api.InstallReferrerClient");
        stringBuilder.append(" not found");
        AFLogger.afRDLog(stringBuilder.toString());
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void valueOf(AFf1qSDK aFf1qSDK, InstallReferrerClient stringBuilder, Context object, int n8) {
        block9 : {
            Throwable throwable2;
            block16 : {
                block10 : {
                    block11 : {
                        block15 : {
                            block12 : {
                                block13 : {
                                    block14 : {
                                        aFf1qSDK.valueOf.put((Object)"code", (Object)String.valueOf((int)n8));
                                        aFf1qSDK.AFInAppEventParameterName.put((Object)"api_ver", (Object)AFa1fSDK.AFInAppEventType((Context)object, "com.android.vending"));
                                        aFf1qSDK.AFInAppEventParameterName.put((Object)"api_ver_name", (Object)AFa1fSDK.AFKeystoreWrapper((Context)object, "com.android.vending"));
                                        if (n8 == -1) break block10;
                                        if (n8 == 0) break block11;
                                        if (n8 == 1) break block12;
                                        if (n8 == 2) break block13;
                                        if (n8 == 3) break block14;
                                        stringBuilder = "responseCode not found.";
                                        break block15;
                                    }
                                    AFLogger.afWarnLog("InstallReferrer DEVELOPER_ERROR");
                                    stringBuilder = aFf1qSDK.AFInAppEventParameterName;
                                    object = "DEVELOPER_ERROR";
                                    break block16;
                                }
                                AFLogger.afWarnLog("InstallReferrer FEATURE_NOT_SUPPORTED");
                                stringBuilder = aFf1qSDK.AFInAppEventParameterName;
                                object = "FEATURE_NOT_SUPPORTED";
                                break block16;
                            }
                            aFf1qSDK.AFInAppEventParameterName.put((Object)"response", (Object)"SERVICE_UNAVAILABLE");
                            stringBuilder = "InstallReferrer not supported";
                        }
                        AFLogger.afWarnLog((String)stringBuilder);
                        break block9;
                    }
                    aFf1qSDK.AFInAppEventParameterName.put((Object)"response", (Object)"OK");
                    try {
                        AFLogger.afDebugLog("InstallReferrer connected");
                        if (stringBuilder.isReady()) {
                            object = stringBuilder.getInstallReferrer();
                            String string2 = object.getInstallReferrer();
                            if (string2 != null) {
                                aFf1qSDK.valueOf.put((Object)"val", (Object)string2);
                                aFf1qSDK.AFInAppEventParameterName.put((Object)"referrer", (Object)string2);
                            }
                            long l8 = object.getReferrerClickTimestampSeconds();
                            aFf1qSDK.valueOf.put((Object)"clk", (Object)Long.toString((long)l8));
                            aFf1qSDK.AFInAppEventParameterName.put((Object)"click_ts", (Object)l8);
                            l8 = object.getInstallBeginTimestampSeconds();
                            aFf1qSDK.valueOf.put((Object)"install", (Object)Long.toString((long)l8));
                            aFf1qSDK.AFInAppEventParameterName.put((Object)"install_begin_ts", (Object)l8);
                            string2 = new HashMap();
                            try {
                                boolean bl = object.getGooglePlayInstantParam();
                                aFf1qSDK.valueOf.put((Object)"instant", (Object)bl);
                                string2.put((Object)"instant", (Object)bl);
                            }
                            catch (NoSuchMethodError noSuchMethodError) {
                                AFLogger.afErrorLogForExcManagerOnly("getGooglePlayInstantParam not exist", (Throwable)noSuchMethodError);
                            }
                            try {
                                string2.put((Object)"click_server_ts", (Object)object.getReferrerClickTimestampServerSeconds());
                                string2.put((Object)"install_begin_server_ts", (Object)object.getInstallBeginTimestampServerSeconds());
                                string2.put((Object)"install_version", (Object)object.getInstallVersion());
                            }
                            catch (NoSuchMethodError noSuchMethodError) {
                                AFLogger.afErrorLogForExcManagerOnly("some method not exist", (Throwable)noSuchMethodError);
                            }
                            if (!string2.isEmpty()) {
                                aFf1qSDK.AFInAppEventParameterName.put((Object)"google_custom", (Object)string2);
                            }
                            stringBuilder.endConnection();
                            break block9;
                        }
                        AFLogger.afWarnLog("ReferrerClient: InstallReferrer is not ready");
                        aFf1qSDK.valueOf.put((Object)"err", (Object)"ReferrerClient: InstallReferrer is not ready");
                        break block9;
                    }
                    catch (Throwable throwable2) {}
                }
                AFLogger.afWarnLog("InstallReferrer SERVICE_DISCONNECTED");
                stringBuilder = aFf1qSDK.AFInAppEventParameterName;
                object = "SERVICE_DISCONNECTED";
            }
            stringBuilder.put((Object)"response", object);
            break block9;
            stringBuilder = new StringBuilder("Failed to get install referrer: ");
            stringBuilder.append(throwable2.getMessage());
            AFLogger.afWarnLog(stringBuilder.toString());
            aFf1qSDK.valueOf.put((Object)"err", (Object)throwable2.getMessage());
            AFLogger.afErrorLogForExcManagerOnly("Failed to get install referrer", throwable2);
        }
        AFLogger.afDebugLog("Install Referrer collected locally");
        aFf1qSDK.values();
    }

    @Override
    public final void valueOf(final Context context) {
        if (!AFf1qSDK.AFInAppEventType(context)) {
            return;
        }
        this.afInfoLog = System.currentTimeMillis();
        this.afDebugLog = AFf1pSDK.AFa1zSDK.AFInAppEventType;
        this.addObserver(new Observer(this){
            private /* synthetic */ AFf1pSDK values;
            {
                this.values = aFf1pSDK;
            }

            public final void update(java.util.Observable observable, Object object) {
                this.values.values.run();
            }
        });
        try {
            final InstallReferrerClient installReferrerClient = InstallReferrerClient.newBuilder(context).build();
            AFLogger.afDebugLog("Connecting to Install Referrer Library...");
            installReferrerClient.startConnection(new InstallReferrerStateListener(){

                public static /* synthetic */ void a( var0, InstallReferrerClient installReferrerClient2, Context context2, int n8) {
                    var0.lambda$onInstallReferrerSetupFinished$0(installReferrerClient2, context2, n8);
                }

                private /* synthetic */ void lambda$onInstallReferrerSetupFinished$0(InstallReferrerClient installReferrerClient2, Context context2, int n8) {
                    AFf1qSDK.valueOf(AFf1qSDK.this, installReferrerClient2, context2, n8);
                }

                @Override
                public final void onInstallReferrerServiceDisconnected() {
                    AFLogger.afDebugLog("Install Referrer service disconnected");
                }

                @Override
                public final void onInstallReferrerSetupFinished(int n8) {
                    AFf1qSDK.this.AFInAppEventType.execute((Runnable)new w(this, installReferrerClient, context, n8));
                }
            });
            return;
        }
        catch (Throwable throwable) {
            AFLogger.afErrorLog("referrerClient -> startConnection", throwable);
            return;
        }
    }

}

