/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  com.onesignal.NotificationPermissionController$supportsNativePrompt$2
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Set
 *  kotlin.Lazy
 *  kotlin.LazyKt
 *  kotlin.Metadata
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.onesignal;

import android.app.Activity;
import android.content.Context;
import com.onesignal.AlertDialogPrepromptForAndroidSettings;
import com.onesignal.NavigateToAndroidSettingsForNotifications;
import com.onesignal.NotificationPermissionController;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.PermissionsActivity;
import com.onesignal.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\b\u0010\u0013\u001a\u00020\u0007H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0006\u0010\u0015\u001a\u00020\u0011J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0007H\u0016J\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\nJ\b\u0010\u001a\u001a\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001b"}, d2={"Lcom/onesignal/NotificationPermissionController;", "Lcom/onesignal/PermissionsActivity$PermissionCallback;", "()V", "ANDROID_PERMISSION_STRING", "", "PERMISSION_TYPE", "awaitingForReturnFromSystemSettings", "", "callbacks", "", "Lcom/onesignal/OneSignal$PromptForPushNotificationPermissionResponseHandler;", "supportsNativePrompt", "getSupportsNativePrompt", "()Z", "supportsNativePrompt$delegate", "Lkotlin/Lazy;", "fireCallBacks", "", "accepted", "notificationsEnabled", "onAccept", "onAppForegrounded", "onReject", "fallbackToSettings", "prompt", "callback", "showFallbackAlertDialog", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class NotificationPermissionController
implements PermissionsActivity.PermissionCallback {
    @NotNull
    private static final String ANDROID_PERMISSION_STRING = "android.permission.POST_NOTIFICATIONS";
    @NotNull
    public static final NotificationPermissionController INSTANCE;
    @NotNull
    private static final String PERMISSION_TYPE = "NOTIFICATION";
    private static boolean awaitingForReturnFromSystemSettings;
    @NotNull
    private static final Set<OneSignal.PromptForPushNotificationPermissionResponseHandler> callbacks;
    @NotNull
    private static final Lazy supportsNativePrompt$delegate;

    static {
        NotificationPermissionController notificationPermissionController;
        INSTANCE = notificationPermissionController = new NotificationPermissionController();
        callbacks = new HashSet();
        PermissionsActivity.registerAsCallback(PERMISSION_TYPE, notificationPermissionController);
        supportsNativePrompt$delegate = LazyKt.lazy((Function0)supportsNativePrompt.2.INSTANCE);
    }

    private NotificationPermissionController() {
    }

    public static final /* synthetic */ void access$fireCallBacks(NotificationPermissionController notificationPermissionController, boolean bl) {
        notificationPermissionController.fireCallBacks(bl);
    }

    public static final /* synthetic */ void access$setAwaitingForReturnFromSystemSettings$p(boolean bl) {
        awaitingForReturnFromSystemSettings = bl;
    }

    private final void fireCallBacks(boolean bl) {
        Iterator iterator = callbacks.iterator();
        while (iterator.hasNext()) {
            ((OneSignal.PromptForPushNotificationPermissionResponseHandler)iterator.next()).response(bl);
        }
        callbacks.clear();
    }

    private final boolean getSupportsNativePrompt() {
        return (Boolean)supportsNativePrompt$delegate.getValue();
    }

    private final boolean notificationsEnabled() {
        return OSUtils.areNotificationsEnabled(OneSignal.appContext);
    }

    private final boolean showFallbackAlertDialog() {
        Activity activity = OneSignal.getCurrentActivity();
        if (activity == null) {
            return false;
        }
        AlertDialogPrepromptForAndroidSettings alertDialogPrepromptForAndroidSettings = AlertDialogPrepromptForAndroidSettings.INSTANCE;
        String string2 = activity.getString(R.string.notification_permission_name_for_title);
        Intrinsics.checkNotNullExpressionValue((Object)string2, (String)"activity.getString(R.str\u2026ermission_name_for_title)");
        String string3 = activity.getString(R.string.notification_permission_settings_message);
        Intrinsics.checkNotNullExpressionValue((Object)string3, (String)"activity.getString(R.str\u2026mission_settings_message)");
        alertDialogPrepromptForAndroidSettings.show(activity, string2, string3, new AlertDialogPrepromptForAndroidSettings.Callback(activity){
            public final Activity $activity;
            {
                this.$activity = activity;
            }

            public void onAccept() {
                NavigateToAndroidSettingsForNotifications.INSTANCE.show((Context)this.$activity);
                NotificationPermissionController.access$setAwaitingForReturnFromSystemSettings$p(true);
            }

            public void onDecline() {
                NotificationPermissionController.access$fireCallBacks(NotificationPermissionController.INSTANCE, false);
            }
        });
        return true;
    }

    @Override
    public void onAccept() {
        OneSignal.refreshNotificationPermissionState();
        this.fireCallBacks(true);
    }

    public final void onAppForegrounded() {
        if (!awaitingForReturnFromSystemSettings) {
            return;
        }
        awaitingForReturnFromSystemSettings = false;
        this.fireCallBacks(this.notificationsEnabled());
    }

    @Override
    public void onReject(boolean bl) {
        if (!(bl = bl ? this.showFallbackAlertDialog() : false)) {
            this.fireCallBacks(false);
        }
    }

    public final void prompt(boolean bl, @Nullable OneSignal.PromptForPushNotificationPermissionResponseHandler promptForPushNotificationPermissionResponseHandler) {
        if (promptForPushNotificationPermissionResponseHandler != null) {
            callbacks.add((Object)promptForPushNotificationPermissionResponseHandler);
        }
        if (this.notificationsEnabled()) {
            this.fireCallBacks(true);
            return;
        }
        if (!this.getSupportsNativePrompt()) {
            if (bl) {
                this.showFallbackAlertDialog();
            } else {
                this.fireCallBacks(false);
            }
            return;
        }
        PermissionsActivity.startPrompt(bl, PERMISSION_TYPE, ANDROID_PERMISSION_STRING, NotificationPermissionController.class);
    }
}

