package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1iSDK;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes.dex */
final class AFb1jSDK implements Application.ActivityLifecycleCallbacks {

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

    @Metadata
    public static final class AFa1wSDK extends TimerTask {
        private /* synthetic */ Context AFKeystoreWrapper;

        public AFa1wSDK(Context context) {
            this.AFKeystoreWrapper = context;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            if (AFb1jSDK.this.AFKeystoreWrapper && AFb1jSDK.this.afErrorLog) {
                AFb1jSDK aFb1jSDK = AFb1jSDK.this;
                aFb1jSDK.AFKeystoreWrapper = false;
                try {
                    AFb1iSDK.AFa1wSDK aFa1wSDK = aFb1jSDK.AFInAppEventParameterName;
                    Context context = this.AFKeystoreWrapper;
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    aFa1wSDK.AFInAppEventType(context);
                } catch (Exception e7) {
                    AFLogger.afErrorLog("Listener threw exception! ", e7);
                }
            }
        }
    }

    public AFb1jSDK(@NotNull Executor executor, @NotNull AFb1sSDK aFb1sSDK, @NotNull AFf1vSDK aFf1vSDK, @NotNull AFb1iSDK.AFa1wSDK aFa1wSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(aFb1sSDK, "");
        Intrinsics.checkNotNullParameter(aFf1vSDK, "");
        Intrinsics.checkNotNullParameter(aFa1wSDK, "");
        this.values = executor;
        this.valueOf = aFb1sSDK;
        this.AFInAppEventType = aFf1vSDK;
        this.AFInAppEventParameterName = aFa1wSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventParameterName(AFb1jSDK aFb1jSDK, Activity activity) {
        Intrinsics.checkNotNullParameter(aFb1jSDK, "");
        Intrinsics.checkNotNullParameter(activity, "");
        if (!aFb1jSDK.AFKeystoreWrapper) {
            try {
                aFb1jSDK.AFInAppEventParameterName.values(activity);
            } catch (Exception e7) {
                AFLogger.afErrorLog("Listener thrown an exception: ", e7, true);
            }
        }
        aFb1jSDK.afErrorLog = false;
        aFb1jSDK.AFKeystoreWrapper = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void valueOf(AFb1jSDK aFb1jSDK, Activity activity) {
        Intrinsics.checkNotNullParameter(aFb1jSDK, "");
        Intrinsics.checkNotNullParameter(activity, "");
        AFb1sSDK aFb1sSDK = aFb1jSDK.valueOf;
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != AFb1sSDK.valueOf) {
            AFb1sSDK.valueOf = intent;
        }
        aFb1jSDK.AFInAppEventType.AFInAppEventParameterName(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(AFb1jSDK aFb1jSDK, Activity activity) {
        Intrinsics.checkNotNullParameter(aFb1jSDK, "");
        Intrinsics.checkNotNullParameter(activity, "");
        aFb1jSDK.afErrorLog = true;
        Context applicationContext = activity.getApplicationContext();
        try {
            Timer timer = new Timer();
            AFa1wSDK aFa1wSDK = aFb1jSDK.new AFa1wSDK(applicationContext);
            AFb1iSDK.AFa1vSDK aFa1vSDK = AFb1iSDK.valueOf;
            timer.schedule(aFa1wSDK, AFb1iSDK.AFa1vSDK.AFInAppEventType());
        } catch (Throwable th) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull final Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.values.execute(new Runnable() { // from class: com.appsflyer.internal.h
            @Override // java.lang.Runnable
            public final void run() {
                AFb1jSDK.valueOf(AFb1jSDK.this, activity);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.values.execute(new Runnable() { // from class: com.appsflyer.internal.j
            @Override // java.lang.Runnable
            public final void run() {
                AFb1jSDK.values(AFb1jSDK.this, activity);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.values.execute(new Runnable() { // from class: com.appsflyer.internal.i
            @Override // java.lang.Runnable
            public final void run() {
                AFb1jSDK.AFInAppEventParameterName(AFb1jSDK.this, activity);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }
}
