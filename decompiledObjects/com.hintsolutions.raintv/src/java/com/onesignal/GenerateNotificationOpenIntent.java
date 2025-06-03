/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.onesignal;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\n\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\n\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2={"Lcom/onesignal/GenerateNotificationOpenIntent;", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "startApp", "", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "getIntentAppOpen", "getIntentVisible", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class GenerateNotificationOpenIntent {
    @NotNull
    private final Context context;
    @Nullable
    private final Intent intent;
    private final boolean startApp;

    public GenerateNotificationOpenIntent(@NotNull Context context, @Nullable Intent intent, boolean bl) {
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        this.context = context;
        this.intent = intent;
        this.startApp = bl;
    }

    private final Intent getIntentAppOpen() {
        if (!this.startApp) {
            return null;
        }
        Intent intent = this.context.getPackageManager().getLaunchIntentForPackage(this.context.getPackageName());
        if (intent == null) {
            return null;
        }
        intent.setPackage(null);
        intent.setFlags(0x10200000);
        return intent;
    }

    @Nullable
    public final Intent getIntentVisible() {
        Intent intent = this.intent;
        if (intent != null) {
            return intent;
        }
        return this.getIntentAppOpen();
    }
}

