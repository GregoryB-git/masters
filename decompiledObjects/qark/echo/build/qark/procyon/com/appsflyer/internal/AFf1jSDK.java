// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.util.Map;
import com.miui.referrer.api.GetAppsReferrerDetails;
import java.util.HashMap;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import com.miui.referrer.api.GetAppsReferrerClient;
import java.util.Observable;
import java.util.Observer;
import android.content.Context;
import com.appsflyer.AFLogger;

public final class AFf1jSDK extends AFf1uSDK
{
    public AFf1jSDK(final Runnable runnable) {
        super("store", "xiaomi", runnable);
    }
    
    private static boolean AFKeystoreWrapper() {
        if (!AFf1uSDK.valueOf()) {
            return false;
        }
        try {
            Class.forName("com.miui.referrer.api.GetAppsReferrerClient");
            AFLogger.afDebugLog("Xiaomi Install Referrer is allowed");
            return true;
        }
        catch (ClassNotFoundException ex) {
            goto Label_0030;
        }
        finally {
            final Throwable t;
            AFLogger.afErrorLog("An error occurred while trying to access GetAppsReferrerClient", t);
            return false;
        }
    }
    
    @Override
    public final void valueOf(final Context context) {
        if (!AFKeystoreWrapper()) {
            return;
        }
        super.afInfoLog = System.currentTimeMillis();
        super.afDebugLog = AFa1zSDK.AFInAppEventType;
        this.addObserver(new Observer() {
            private /* synthetic */ AFf1pSDK values = this;
            
            @Override
            public final void update(final Observable observable, final Object o) {
                this.values.values.run();
            }
        });
        final GetAppsReferrerClient build = GetAppsReferrerClient.Companion.newBuilder(context).build();
        build.startConnection((GetAppsReferrerStateListener)new GetAppsReferrerStateListener() {
            public final void onGetAppsReferrerSetupFinished(final int n) {
                AFf1jSDK.this.AFInAppEventParameterName.put("api_ver", AFa1fSDK.AFInAppEventType(context, "com.xiaomi.mipicks"));
                AFf1jSDK.this.AFInAppEventParameterName.put("api_ver_name", AFa1fSDK.AFKeystoreWrapper(context, "com.xiaomi.mipicks"));
                while (true) {
                    Label_0426: {
                        if (n == -1) {
                            break Label_0426;
                        }
                    Label_0084_Outer:
                        while (true) {
                            while (true) {
                                Label_0447: {
                                    Label_0191: {
                                        if (n == 0) {
                                            break Label_0191;
                                        }
                                        String string;
                                        if (n != 1) {
                                            if (n == 2) {
                                                AFLogger.afWarnLog("XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
                                                final Object o = AFf1jSDK.this.AFInAppEventParameterName;
                                                string = "FEATURE_NOT_SUPPORTED";
                                                break Label_0110;
                                            }
                                            if (n == 3) {
                                                AFLogger.afWarnLog("XiaomiInstallReferrer DEVELOPER_ERROR");
                                                final Object o = AFf1jSDK.this.AFInAppEventParameterName;
                                                string = "DEVELOPER_ERROR";
                                                break Label_0110;
                                            }
                                            if (n == 4) {
                                                AFLogger.afWarnLog("XiaomiInstallReferrer DEVELOPER_ERROR");
                                                final Object o = AFf1jSDK.this.AFInAppEventParameterName;
                                                string = "PERMISSION_ERROR";
                                                break Label_0110;
                                            }
                                            string = "responseCode not found.";
                                        }
                                        else {
                                            AFf1jSDK.this.AFInAppEventParameterName.put("response", "SERVICE_UNAVAILABLE");
                                            string = "XiaomiInstallReferrer not supported";
                                        }
                                        AFLogger.afWarnLog(string);
                                        break Label_0447;
                                        Object o = null;
                                        ((Map<String, String>)o).put("response", string);
                                        break Label_0447;
                                    }
                                    final AFf1jSDK afKeystoreWrapper = AFf1jSDK.this;
                                    final GetAppsReferrerClient afInAppEventType = build;
                                    afKeystoreWrapper.AFInAppEventParameterName.put("response", "OK");
                                    try {
                                        AFLogger.afDebugLog("XiaomiInstallReferrer connected");
                                        if (afInAppEventType.isReady()) {
                                            final GetAppsReferrerDetails installReferrer = afInAppEventType.getInstallReferrer();
                                            final String installReferrer2 = installReferrer.getInstallReferrer();
                                            if (installReferrer2 != null) {
                                                afKeystoreWrapper.AFInAppEventParameterName.put("referrer", installReferrer2);
                                            }
                                            afKeystoreWrapper.AFInAppEventParameterName.put("click_ts", installReferrer.getReferrerClickTimestampSeconds());
                                            afKeystoreWrapper.AFInAppEventParameterName.put("install_begin_ts", installReferrer.getInstallBeginTimestampSeconds());
                                            final HashMap<String, Long> hashMap = new HashMap<String, Long>();
                                            hashMap.put("click_server_ts", installReferrer.getReferrerClickTimestampServerSeconds());
                                            hashMap.put("install_begin_server_ts", installReferrer.getInstallBeginTimestampServerSeconds());
                                            hashMap.put("install_version", (Long)installReferrer.getInstallVersion());
                                            afKeystoreWrapper.AFInAppEventParameterName.put("xiaomi_custom", hashMap);
                                        }
                                        else {
                                            AFLogger.afWarnLog("XiaomiReferrerClient: XiaomiInstallReferrer is not ready");
                                        }
                                        AFLogger.afDebugLog("Xiaomi Install Referrer collected locally");
                                        AFf1jSDK.this.values();
                                        build.endConnection();
                                        return;
                                        final StringBuilder sb = new StringBuilder("Failed to get Xiaomi install referrer: ");
                                        final Object o;
                                        sb.append(((Throwable)o).getMessage());
                                        final String string = sb.toString();
                                        continue;
                                        AFLogger.afWarnLog("XiaomiInstallReferrer SERVICE_DISCONNECTED");
                                        final Map<String, Object> afInAppEventParameterName = AFf1jSDK.this.AFInAppEventParameterName;
                                        continue Label_0084_Outer;
                                    }
                                    finally {}
                                }
                                break;
                            }
                            break;
                        }
                    }
                    final Throwable t;
                    final Object o = t;
                    continue;
                }
            }
            
            public final void onGetAppsServiceDisconnected() {
            }
        });
    }
}
