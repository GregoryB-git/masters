/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.onesignal;

import android.content.Context;
import com.onesignal.OSUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\b"}, d2={"Lcom/onesignal/OSNotificationOpenAppSettings;", "", "()V", "getShouldOpenActivity", "", "context", "Landroid/content/Context;", "getSuppressLaunchURL", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class OSNotificationOpenAppSettings {
    @NotNull
    public static final OSNotificationOpenAppSettings INSTANCE = new OSNotificationOpenAppSettings();

    private OSNotificationOpenAppSettings() {
    }

    public final boolean getShouldOpenActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        return Intrinsics.areEqual((Object)"DISABLE", (Object)OSUtils.getManifestMeta(context, "com.onesignal.NotificationOpened.DEFAULT")) ^ true;
    }

    public final boolean getSuppressLaunchURL(@NotNull Context context) {
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        return OSUtils.getManifestMetaBoolean(context, "com.onesignal.suppressLaunchURLs");
    }
}

