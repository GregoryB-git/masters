// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import android.os.Bundle;
import android.content.Context;
import java.util.TimerTask;
import java.util.Timer;
import android.net.Uri;
import android.content.Intent;
import com.appsflyer.AFLogger;
import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;
import android.app.Application$ActivityLifecycleCallbacks;

@Metadata
final class AFb1jSDK implements Application$ActivityLifecycleCallbacks
{
    @NotNull
    final AFb1iSDK.AFa1wSDK AFInAppEventParameterName;
    @NotNull
    private final AFf1vSDK AFInAppEventType;
    boolean AFKeystoreWrapper;
    private boolean afErrorLog;
    @NotNull
    private final AFb1sSDK valueOf;
    @NotNull
    private final Executor values;
    
    public AFb1jSDK(@NotNull final Executor values, @NotNull final AFb1sSDK valueOf, @NotNull final AFf1vSDK afInAppEventType, @NotNull final AFb1iSDK.AFa1wSDK afInAppEventParameterName) {
        Intrinsics.checkNotNullParameter(values, "");
        Intrinsics.checkNotNullParameter(valueOf, "");
        Intrinsics.checkNotNullParameter(afInAppEventType, "");
        Intrinsics.checkNotNullParameter(afInAppEventParameterName, "");
        this.values = values;
        this.valueOf = valueOf;
        this.AFInAppEventType = afInAppEventType;
        this.AFInAppEventParameterName = afInAppEventParameterName;
    }
    
    private static final void AFInAppEventParameterName(final AFb1jSDK aFb1jSDK, final Activity activity) {
        Intrinsics.checkNotNullParameter(aFb1jSDK, "");
        Intrinsics.checkNotNullParameter(activity, "");
        if (!aFb1jSDK.AFKeystoreWrapper) {
            try {
                aFb1jSDK.AFInAppEventParameterName.values(activity);
            }
            catch (Exception ex) {
                AFLogger.afErrorLog("Listener thrown an exception: ", ex, true);
            }
        }
        aFb1jSDK.afErrorLog = false;
        aFb1jSDK.AFKeystoreWrapper = true;
    }
    
    public static final /* synthetic */ boolean AFInAppEventParameterName(final AFb1jSDK aFb1jSDK) {
        return aFb1jSDK.afErrorLog;
    }
    
    private static final void valueOf(final AFb1jSDK aFb1jSDK, final Activity activity) {
        Intrinsics.checkNotNullParameter(aFb1jSDK, "");
        Intrinsics.checkNotNullParameter(activity, "");
        final AFb1sSDK valueOf = aFb1jSDK.valueOf;
        final Intent intent = activity.getIntent();
        Uri data;
        if (intent != null && "android.intent.action.VIEW".equals(intent.getAction())) {
            data = intent.getData();
        }
        else {
            data = null;
        }
        if (data != null && intent != AFb1sSDK.valueOf) {
            AFb1sSDK.valueOf = intent;
        }
        aFb1jSDK.AFInAppEventType.AFInAppEventParameterName(activity);
    }
    
    private static final void values(final AFb1jSDK aFb1jSDK, final Activity activity) {
        Intrinsics.checkNotNullParameter(aFb1jSDK, "");
        Intrinsics.checkNotNullParameter(activity, "");
        aFb1jSDK.afErrorLog = true;
        final Context applicationContext = ((Context)activity).getApplicationContext();
        try {
            final Timer timer = new Timer();
            final TimerTask task = new TimerTask() {
                @Override
                public final void run() {
                    if (AFb1jSDK.values(aFb1jSDK) && AFb1jSDK.AFInAppEventParameterName(aFb1jSDK)) {
                        final AFb1jSDK afInAppEventType = aFb1jSDK;
                        afInAppEventType.AFKeystoreWrapper = false;
                        try {
                            final AFb1iSDK.AFa1wSDK afInAppEventParameterName = afInAppEventType.AFInAppEventParameterName;
                            final Context afKeystoreWrapper = applicationContext;
                            Intrinsics.checkNotNullExpressionValue(afKeystoreWrapper, "");
                            afInAppEventParameterName.AFInAppEventType(afKeystoreWrapper);
                        }
                        catch (Exception ex) {
                            AFLogger.afErrorLog("Listener threw exception! ", ex);
                        }
                    }
                }
            };
            final AFb1iSDK.AFa1vSDK valueOf = AFb1iSDK.valueOf;
            timer.schedule(task, AFb1iSDK.AFa1vSDK.AFInAppEventType());
        }
        finally {
            final Throwable t;
            AFLogger.afErrorLog("Background task failed with a throwable: ", t);
        }
    }
    
    public static final /* synthetic */ boolean values(final AFb1jSDK aFb1jSDK) {
        return aFb1jSDK.AFKeystoreWrapper;
    }
    
    public final void onActivityCreated(@NotNull final Activity activity, final Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.values.execute(new h(this, activity));
    }
    
    public final void onActivityDestroyed(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }
    
    public final void onActivityPaused(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.values.execute(new j(this, activity));
    }
    
    public final void onActivityResumed(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.values.execute(new i(this, activity));
    }
    
    public final void onActivitySaveInstanceState(@NotNull final Activity activity, @NotNull final Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }
    
    public final void onActivityStarted(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }
    
    public final void onActivityStopped(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }
}
