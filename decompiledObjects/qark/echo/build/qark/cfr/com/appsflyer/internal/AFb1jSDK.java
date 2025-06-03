/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Timer
 *  java.util.TimerTask
 *  java.util.concurrent.Executor
 */
package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1iSDK;
import com.appsflyer.internal.AFb1sSDK;
import com.appsflyer.internal.AFf1vSDK;
import com.appsflyer.internal.h;
import com.appsflyer.internal.i;
import com.appsflyer.internal.j;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
final class AFb1jSDK
implements Application.ActivityLifecycleCallbacks {
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

    public AFb1jSDK(@NotNull Executor executor, @NotNull AFb1sSDK aFb1sSDK, @NotNull AFf1vSDK aFf1vSDK, @NotNull AFb1iSDK.AFa1wSDK aFa1wSDK) {
        Intrinsics.checkNotNullParameter((Object)executor, "");
        Intrinsics.checkNotNullParameter(aFb1sSDK, "");
        Intrinsics.checkNotNullParameter(aFf1vSDK, "");
        Intrinsics.checkNotNullParameter(aFa1wSDK, "");
        this.values = executor;
        this.valueOf = aFb1sSDK;
        this.AFInAppEventType = aFf1vSDK;
        this.AFInAppEventParameterName = aFa1wSDK;
    }

    private static final void AFInAppEventParameterName(AFb1jSDK aFb1jSDK, Activity activity) {
        Intrinsics.checkNotNullParameter(aFb1jSDK, "");
        Intrinsics.checkNotNullParameter((Object)activity, "");
        if (!aFb1jSDK.AFKeystoreWrapper) {
            try {
                aFb1jSDK.AFInAppEventParameterName.values(activity);
            }
            catch (Exception exception) {
                AFLogger.afErrorLog("Listener thrown an exception: ", (Throwable)exception, true);
            }
        }
        aFb1jSDK.afErrorLog = false;
        aFb1jSDK.AFKeystoreWrapper = true;
    }

    public static /* synthetic */ void a(AFb1jSDK aFb1jSDK, Activity activity) {
        AFb1jSDK.AFInAppEventParameterName(aFb1jSDK, activity);
    }

    public static /* synthetic */ void b(AFb1jSDK aFb1jSDK, Activity activity) {
        AFb1jSDK.values(aFb1jSDK, activity);
    }

    public static /* synthetic */ void c(AFb1jSDK aFb1jSDK, Activity activity) {
        AFb1jSDK.valueOf(aFb1jSDK, activity);
    }

    private static final void valueOf(AFb1jSDK aFb1jSDK, Activity activity) {
        Intrinsics.checkNotNullParameter(aFb1jSDK, "");
        Intrinsics.checkNotNullParameter((Object)activity, "");
        AFb1sSDK aFb1sSDK = aFb1jSDK.valueOf;
        Intent intent = activity.getIntent();
        aFb1sSDK = intent != null && "android.intent.action.VIEW".equals((Object)intent.getAction()) ? intent.getData() : null;
        if (aFb1sSDK != null && intent != AFb1sSDK.valueOf) {
            AFb1sSDK.valueOf = intent;
        }
        aFb1jSDK.AFInAppEventType.AFInAppEventParameterName(activity);
    }

    private static final void values(AFb1jSDK object, Activity activity) {
        Intrinsics.checkNotNullParameter(object, "");
        Intrinsics.checkNotNullParameter((Object)activity, "");
        object.afErrorLog = true;
        Object object2 = activity.getApplicationContext();
        try {
            activity = new Timer();
            object = new TimerTask((AFb1jSDK)object, (Context)object2){
                private /* synthetic */ AFb1jSDK AFInAppEventType;
                private /* synthetic */ Context AFKeystoreWrapper;
                {
                    this.AFInAppEventType = aFb1jSDK;
                    this.AFKeystoreWrapper = context;
                }

                public final void run() {
                    if (this.AFInAppEventType.AFKeystoreWrapper && this.AFInAppEventType.afErrorLog) {
                        Object object = this.AFInAppEventType;
                        object.AFKeystoreWrapper = false;
                        try {
                            object = object.AFInAppEventParameterName;
                            Context context = this.AFKeystoreWrapper;
                            Intrinsics.checkNotNullExpressionValue((Object)context, "");
                            object.AFInAppEventType(context);
                            return;
                        }
                        catch (Exception exception) {
                            AFLogger.afErrorLog("Listener threw exception! ", (Throwable)exception);
                        }
                    }
                }
            };
            object2 = AFb1iSDK.valueOf;
            activity.schedule((TimerTask)object, AFb1iSDK.AFa1vSDK.AFInAppEventType());
            return;
        }
        catch (Throwable throwable) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", throwable);
            return;
        }
    }

    public final void onActivityCreated(@NotNull Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter((Object)activity, "");
        this.values.execute((Runnable)new h(this, activity));
    }

    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter((Object)activity, "");
    }

    public final void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter((Object)activity, "");
        this.values.execute((Runnable)new j(this, activity));
    }

    public final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter((Object)activity, "");
        this.values.execute((Runnable)new i(this, activity));
    }

    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter((Object)activity, "");
        Intrinsics.checkNotNullParameter((Object)bundle, "");
    }

    public final void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter((Object)activity, "");
    }

    public final void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter((Object)activity, "");
    }

}

