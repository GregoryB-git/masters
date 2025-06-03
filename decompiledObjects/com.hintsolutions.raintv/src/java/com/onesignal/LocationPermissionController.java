/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.onesignal;

import android.app.Activity;
import android.content.Context;
import com.onesignal.AlertDialogPrepromptForAndroidSettings;
import com.onesignal.LocationController;
import com.onesignal.NavigateToAndroidSettingsForLocation;
import com.onesignal.OneSignal;
import com.onesignal.PermissionsActivity;
import com.onesignal.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010\r\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004J\b\u0010\u000f\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2={"Lcom/onesignal/LocationPermissionController;", "Lcom/onesignal/PermissionsActivity$PermissionCallback;", "()V", "PERMISSION_TYPE", "", "onAccept", "", "onReject", "fallbackToSettings", "", "onResponse", "result", "Lcom/onesignal/OneSignal$PromptActionResult;", "prompt", "androidPermissionString", "showFallbackAlertDialog", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class LocationPermissionController
implements PermissionsActivity.PermissionCallback {
    @NotNull
    public static final LocationPermissionController INSTANCE;
    @NotNull
    private static final String PERMISSION_TYPE = "LOCATION";

    static {
        LocationPermissionController locationPermissionController;
        INSTANCE = locationPermissionController = new LocationPermissionController();
        PermissionsActivity.registerAsCallback(PERMISSION_TYPE, locationPermissionController);
    }

    private LocationPermissionController() {
    }

    private final void onResponse(OneSignal.PromptActionResult promptActionResult) {
        LocationController.sendAndClearPromptHandlers(true, promptActionResult);
    }

    private final void showFallbackAlertDialog() {
        Activity activity = OneSignal.getCurrentActivity();
        if (activity == null) {
            return;
        }
        AlertDialogPrepromptForAndroidSettings alertDialogPrepromptForAndroidSettings = AlertDialogPrepromptForAndroidSettings.INSTANCE;
        String string2 = activity.getString(R.string.location_permission_name_for_title);
        Intrinsics.checkNotNullExpressionValue((Object)string2, (String)"activity.getString(R.str\u2026ermission_name_for_title)");
        String string3 = activity.getString(R.string.location_permission_settings_message);
        Intrinsics.checkNotNullExpressionValue((Object)string3, (String)"activity.getString(R.str\u2026mission_settings_message)");
        alertDialogPrepromptForAndroidSettings.show(activity, string2, string3, new AlertDialogPrepromptForAndroidSettings.Callback(activity){
            public final Activity $activity;
            {
                this.$activity = activity;
            }

            public void onAccept() {
                NavigateToAndroidSettingsForLocation.INSTANCE.show((Context)this.$activity);
                LocationController.sendAndClearPromptHandlers(true, OneSignal.PromptActionResult.PERMISSION_DENIED);
            }

            public void onDecline() {
                LocationController.sendAndClearPromptHandlers(true, OneSignal.PromptActionResult.PERMISSION_DENIED);
            }
        });
    }

    @Override
    public void onAccept() {
        this.onResponse(OneSignal.PromptActionResult.PERMISSION_GRANTED);
        LocationController.startGetLocation();
    }

    @Override
    public void onReject(boolean bl) {
        this.onResponse(OneSignal.PromptActionResult.PERMISSION_DENIED);
        if (bl) {
            this.showFallbackAlertDialog();
        }
        LocationController.fireFailedComplete();
    }

    public final void prompt(boolean bl, @NotNull String string2) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"androidPermissionString");
        PermissionsActivity.startPrompt(bl, PERMISSION_TYPE, string2, LocationPermissionController.class);
    }
}

