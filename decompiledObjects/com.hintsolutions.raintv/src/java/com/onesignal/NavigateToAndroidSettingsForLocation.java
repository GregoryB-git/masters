/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2={"Lcom/onesignal/NavigateToAndroidSettingsForLocation;", "", "()V", "show", "", "context", "Landroid/content/Context;", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class NavigateToAndroidSettingsForLocation {
    @NotNull
    public static final NavigateToAndroidSettingsForLocation INSTANCE = new NavigateToAndroidSettingsForLocation();

    private NavigateToAndroidSettingsForLocation() {
    }

    public final void show(@NotNull Context context) {
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse((String)Intrinsics.stringPlus((String)"package:", (Object)context.getPackageName())));
        context.startActivity(intent);
    }
}

