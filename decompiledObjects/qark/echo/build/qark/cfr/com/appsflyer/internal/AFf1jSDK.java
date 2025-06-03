/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.miui.referrer.api.GetAppsReferrerClient
 *  com.miui.referrer.api.GetAppsReferrerClient$Builder
 *  com.miui.referrer.api.GetAppsReferrerClient$Companion
 *  com.miui.referrer.api.GetAppsReferrerDetails
 *  com.miui.referrer.api.GetAppsReferrerStateListener
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Observer
 */
package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1fSDK;
import com.appsflyer.internal.AFf1pSDK;
import com.appsflyer.internal.AFf1uSDK;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerDetails;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Observer;

public final class AFf1jSDK
extends AFf1uSDK {
    public AFf1jSDK(Runnable runnable) {
        super("store", "xiaomi", runnable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean AFKeystoreWrapper() {
        if (!AFf1uSDK.valueOf()) {
            return false;
        }
        try {
            Class.forName((String)"com.miui.referrer.api.GetAppsReferrerClient");
        }
        catch (Throwable throwable) {
            AFLogger.afErrorLog("An error occurred while trying to access GetAppsReferrerClient", throwable);
            return false;
        }
        catch (ClassNotFoundException classNotFoundException) {}
        AFLogger.afDebugLog("Xiaomi Install Referrer is allowed");
        return true;
        StringBuilder stringBuilder = new StringBuilder("Class ");
        stringBuilder.append("com.miui.referrer.api.GetAppsReferrerClient");
        stringBuilder.append(" not found");
        AFLogger.afRDLog(stringBuilder.toString());
        return false;
    }

    @Override
    public final void valueOf(Context context) {
        if (!AFf1jSDK.AFKeystoreWrapper()) {
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
        GetAppsReferrerClient getAppsReferrerClient = GetAppsReferrerClient.Companion.newBuilder(context).build();
        getAppsReferrerClient.startConnection(new GetAppsReferrerStateListener(this, context, getAppsReferrerClient){
            private /* synthetic */ Context AFInAppEventParameterName;
            private /* synthetic */ GetAppsReferrerClient AFInAppEventType;
            private /* synthetic */ AFf1jSDK AFKeystoreWrapper;
            {
                this.AFKeystoreWrapper = aFf1jSDK;
                this.AFInAppEventParameterName = context;
                this.AFInAppEventType = getAppsReferrerClient;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public final void onGetAppsReferrerSetupFinished(int n8) {
                block5 : {
                    Object object;
                    block12 : {
                        Map<String, Object> map;
                        Throwable throwable2;
                        String string2;
                        block13 : {
                            block6 : {
                                block7 : {
                                    block8 : {
                                        block9 : {
                                            block10 : {
                                                block11 : {
                                                    this.AFKeystoreWrapper.AFInAppEventParameterName.put((Object)"api_ver", (Object)AFa1fSDK.AFInAppEventType(this.AFInAppEventParameterName, "com.xiaomi.mipicks"));
                                                    this.AFKeystoreWrapper.AFInAppEventParameterName.put((Object)"api_ver_name", (Object)AFa1fSDK.AFKeystoreWrapper(this.AFInAppEventParameterName, "com.xiaomi.mipicks"));
                                                    if (n8 == -1) break block6;
                                                    if (n8 == 0) break block7;
                                                    if (n8 == 1) break block8;
                                                    if (n8 == 2) break block9;
                                                    if (n8 == 3) break block10;
                                                    if (n8 == 4) break block11;
                                                    object = "responseCode not found.";
                                                    break block12;
                                                }
                                                AFLogger.afWarnLog("XiaomiInstallReferrer DEVELOPER_ERROR");
                                                map = this.AFKeystoreWrapper.AFInAppEventParameterName;
                                                string2 = "PERMISSION_ERROR";
                                                break block13;
                                            }
                                            AFLogger.afWarnLog("XiaomiInstallReferrer DEVELOPER_ERROR");
                                            map = this.AFKeystoreWrapper.AFInAppEventParameterName;
                                            string2 = "DEVELOPER_ERROR";
                                            break block13;
                                        }
                                        AFLogger.afWarnLog("XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
                                        map = this.AFKeystoreWrapper.AFInAppEventParameterName;
                                        string2 = "FEATURE_NOT_SUPPORTED";
                                        break block13;
                                    }
                                    this.AFKeystoreWrapper.AFInAppEventParameterName.put((Object)"response", (Object)"SERVICE_UNAVAILABLE");
                                    object = "XiaomiInstallReferrer not supported";
                                    break block12;
                                }
                                object = this.AFKeystoreWrapper;
                                GetAppsReferrerClient getAppsReferrerClient = this.AFInAppEventType;
                                object.AFInAppEventParameterName.put((Object)"response", (Object)"OK");
                                try {
                                    AFLogger.afDebugLog("XiaomiInstallReferrer connected");
                                    if (getAppsReferrerClient.isReady()) {
                                        String string3 = (getAppsReferrerClient = getAppsReferrerClient.getInstallReferrer()).getInstallReferrer();
                                        if (string3 != null) {
                                            object.AFInAppEventParameterName.put((Object)"referrer", (Object)string3);
                                        }
                                        long l8 = getAppsReferrerClient.getReferrerClickTimestampSeconds();
                                        object.AFInAppEventParameterName.put((Object)"click_ts", (Object)l8);
                                        l8 = getAppsReferrerClient.getInstallBeginTimestampSeconds();
                                        object.AFInAppEventParameterName.put((Object)"install_begin_ts", (Object)l8);
                                        string3 = new HashMap();
                                        string3.put((Object)"click_server_ts", (Object)getAppsReferrerClient.getReferrerClickTimestampServerSeconds());
                                        string3.put((Object)"install_begin_server_ts", (Object)getAppsReferrerClient.getInstallBeginTimestampServerSeconds());
                                        string3.put((Object)"install_version", (Object)getAppsReferrerClient.getInstallVersion());
                                        object.AFInAppEventParameterName.put((Object)"xiaomi_custom", (Object)string3);
                                    } else {
                                        AFLogger.afWarnLog("XiaomiReferrerClient: XiaomiInstallReferrer is not ready");
                                    }
                                    break block5;
                                }
                                catch (Throwable throwable2) {}
                            }
                            AFLogger.afWarnLog("XiaomiInstallReferrer SERVICE_DISCONNECTED");
                            map = this.AFKeystoreWrapper.AFInAppEventParameterName;
                            string2 = "SERVICE_DISCONNECTED";
                        }
                        map.put((Object)"response", (Object)string2);
                        break block5;
                        object = new StringBuilder("Failed to get Xiaomi install referrer: ");
                        object.append(throwable2.getMessage());
                        object = object.toString();
                    }
                    AFLogger.afWarnLog((String)object);
                }
                AFLogger.afDebugLog("Xiaomi Install Referrer collected locally");
                this.AFKeystoreWrapper.values();
                this.AFInAppEventType.endConnection();
            }

            public final void onGetAppsServiceDisconnected() {
            }
        });
    }

}

