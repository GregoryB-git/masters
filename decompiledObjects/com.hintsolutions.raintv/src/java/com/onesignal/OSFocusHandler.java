/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.work.Constraints
 *  androidx.work.Constraints$Builder
 *  androidx.work.ExistingWorkPolicy
 *  androidx.work.NetworkType
 *  androidx.work.OneTimeWorkRequest
 *  androidx.work.OneTimeWorkRequest$Builder
 *  com.onesignal.ActivityLifecycleHandler
 *  com.onesignal.OSFocusHandler$OnLostFocusWorker
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.TimeUnit
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.onesignal;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import com.onesignal.ActivityLifecycleHandler;
import com.onesignal.ActivityLifecycleListener;
import com.onesignal.OSFocusHandler;
import com.onesignal.OSTimeoutHandler;
import com.onesignal.OSWorkManagerHelper;
import com.onesignal.OneSignal;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0010\u001a\u00020\bH\u0002J\b\u0010\u0011\u001a\u00020\bH\u0002J\u0006\u0010\u0012\u001a\u00020\bJ\u001e\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\u0016\u001a\u00020\bJ\u0006\u0010\u0017\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2={"Lcom/onesignal/OSFocusHandler;", "", "()V", "stopRunnable", "Ljava/lang/Runnable;", "buildConstraints", "Landroidx/work/Constraints;", "cancelOnLostFocusWorker", "", "tag", "", "context", "Landroid/content/Context;", "hasBackgrounded", "", "hasCompleted", "resetBackgroundState", "resetStopState", "startOnFocusWork", "startOnLostFocusWorker", "delay", "", "startOnStartFocusWork", "startOnStopFocusWork", "Companion", "OnLostFocusWorker", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class OSFocusHandler {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static boolean backgrounded = false;
    private static boolean completed = false;
    private static final long stopDelay = 1500L;
    private static boolean stopped;
    @Nullable
    private Runnable stopRunnable;

    public static /* synthetic */ void a() {
        OSFocusHandler.startOnStopFocusWork$lambda-0();
    }

    private final Constraints buildConstraints() {
        Constraints constraints = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
        Intrinsics.checkNotNullExpressionValue((Object)constraints, (String)"Builder()\n            .s\u2026TED)\n            .build()");
        return constraints;
    }

    private final void resetBackgroundState() {
        this.resetStopState();
        backgrounded = false;
    }

    private final void resetStopState() {
        stopped = false;
        Runnable runnable = this.stopRunnable;
        if (runnable != null) {
            OSTimeoutHandler.getTimeoutHandler().destroyTimeout(runnable);
        }
    }

    private static final void startOnStopFocusWork$lambda-0() {
        stopped = true;
        OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "OSFocusHandler setting stop state: true");
    }

    public final void cancelOnLostFocusWorker(@NotNull String string2, @NotNull Context context) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"tag");
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        OSWorkManagerHelper.getInstance(context).cancelAllWorkByTag(string2);
    }

    public final boolean hasBackgrounded() {
        return backgrounded;
    }

    public final boolean hasCompleted() {
        return completed;
    }

    public final void startOnFocusWork() {
        this.resetBackgroundState();
        OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "OSFocusHandler running onAppFocus");
        OneSignal.onAppFocus();
    }

    public final void startOnLostFocusWorker(@NotNull String string2, long l, @NotNull Context context) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"tag");
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        Constraints constraints = this.buildConstraints();
        constraints = ((OneTimeWorkRequest.Builder)((OneTimeWorkRequest.Builder)((OneTimeWorkRequest.Builder)new OneTimeWorkRequest.Builder(OnLostFocusWorker.class).setConstraints(constraints)).setInitialDelay(l, TimeUnit.MILLISECONDS)).addTag(string2)).build();
        Intrinsics.checkNotNullExpressionValue((Object)constraints, (String)"Builder(OnLostFocusWorke\u2026tag)\n            .build()");
        constraints = (OneTimeWorkRequest)constraints;
        OSWorkManagerHelper.getInstance(context).enqueueUniqueWork(string2, ExistingWorkPolicy.KEEP, (OneTimeWorkRequest)constraints);
    }

    public final void startOnStartFocusWork() {
        if (stopped) {
            stopped = false;
            this.stopRunnable = null;
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "OSFocusHandler running onAppStartFocusLogic");
            OneSignal.onAppStartFocusLogic();
        } else {
            this.resetStopState();
        }
    }

    public final void startOnStopFocusWork() {
        w0 w02 = new w0(2);
        OSTimeoutHandler.getTimeoutHandler().startTimeout(1500L, w02);
        Unit unit = Unit.INSTANCE;
        this.stopRunnable = w02;
    }

    @Metadata(d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2={"Lcom/onesignal/OSFocusHandler$Companion;", "", "()V", "backgrounded", "", "completed", "stopDelay", "", "stopped", "onLostFocusDoWork", "", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void onLostFocusDoWork() {
            ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.getActivityLifecycleHandler();
            if (activityLifecycleHandler == null || activityLifecycleHandler.getCurActivity() == null) {
                OneSignal.setInForeground(false);
            }
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "OSFocusHandler running onAppLostFocus");
            backgrounded = true;
            OneSignal.onAppLostFocus();
            completed = true;
        }
    }
}

