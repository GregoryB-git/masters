// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import com.android.installreferrer.api.ReferrerDetails;
import com.android.installreferrer.api.InstallReferrerStateListener;
import java.util.Observable;
import java.util.Observer;
import java.io.Serializable;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.AFLogger;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;

public class AFf1qSDK extends AFf1uSDK
{
    @NonNull
    private final ExecutorService AFInAppEventType;
    public final Map<String, Object> valueOf;
    
    public AFf1qSDK(@NonNull final Runnable runnable, @NonNull final ExecutorService afInAppEventType) {
        super("store", "google", runnable);
        this.valueOf = new HashMap<String, Object>();
        this.AFInAppEventType = afInAppEventType;
    }
    
    private static boolean AFInAppEventType(@NonNull final Context context) {
        if (!AFf1uSDK.valueOf()) {
            return false;
        }
        final Throwable t;
        Label_0052: {
            Label_0039: {
                try {
                    if (AFa1fSDK.values(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                        AFLogger.afDebugLog("Install referrer is allowed");
                        return true;
                    }
                }
                catch (ClassNotFoundException ex) {
                    break Label_0052;
                }
                finally {
                    break Label_0039;
                }
                AFLogger.afDebugLog("Install referrer is not allowed");
                return false;
            }
            AFLogger.afErrorLog("An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), t);
            return false;
        }
        AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", t);
        final StringBuilder sb = new StringBuilder("Class ");
        sb.append("com.android.installreferrer.api.InstallReferrerClient");
        sb.append(" not found");
        AFLogger.afRDLog(sb.toString());
        return false;
    }
    
    public static /* synthetic */ ExecutorService AFKeystoreWrapper(final AFf1qSDK aFf1qSDK) {
        return aFf1qSDK.AFInAppEventType;
    }
    
    @Override
    public final void valueOf(final Context context) {
        if (!AFInAppEventType(context)) {
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
        try {
            final InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
            AFLogger.afDebugLog("Connecting to Install Referrer Library...");
            build.startConnection(new InstallReferrerStateListener() {
                @Override
                public final void onInstallReferrerServiceDisconnected() {
                    AFLogger.afDebugLog("Install Referrer service disconnected");
                }
                
                @Override
                public final void onInstallReferrerSetupFinished(final int n) {
                    AFf1qSDK.AFKeystoreWrapper(AFf1qSDK.this).execute(new w(this, build, context, n));
                }
            });
        }
        finally {
            final Throwable t;
            AFLogger.afErrorLog("referrerClient -> startConnection", t);
        }
    }
}
