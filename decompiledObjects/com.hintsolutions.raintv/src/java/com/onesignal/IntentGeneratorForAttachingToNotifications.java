/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  androidx.annotation.RequiresApi
 *  com.onesignal.NotificationOpenedReceiver
 *  com.onesignal.NotificationOpenedReceiverAndroid22AndOlder
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Deprecated
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.onesignal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RequiresApi;
import com.onesignal.NotificationOpenedReceiver;
import com.onesignal.NotificationOpenedReceiverAndroid22AndOlder;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\rJ\b\u0010\u0012\u001a\u00020\u000fH\u0003J\b\u0010\u0013\u001a\u00020\u000fH\u0003R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2={"Lcom/onesignal/IntentGeneratorForAttachingToNotifications;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "notificationOpenedClassAndroid22AndOlder", "Ljava/lang/Class;", "notificationOpenedClassAndroid23Plus", "getNewActionPendingIntent", "Landroid/app/PendingIntent;", "requestCode", "", "oneSignalIntent", "Landroid/content/Intent;", "getNewBaseIntent", "notificationId", "getNewBaseIntentAndroidAPI22AndOlder", "getNewBaseIntentAndroidAPI23Plus", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class IntentGeneratorForAttachingToNotifications {
    @NotNull
    private final Context context;
    @NotNull
    private final Class<?> notificationOpenedClassAndroid22AndOlder;
    @NotNull
    private final Class<?> notificationOpenedClassAndroid23Plus;

    public IntentGeneratorForAttachingToNotifications(@NotNull Context context) {
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        this.context = context;
        this.notificationOpenedClassAndroid23Plus = NotificationOpenedReceiver.class;
        this.notificationOpenedClassAndroid22AndOlder = NotificationOpenedReceiverAndroid22AndOlder.class;
    }

    @Deprecated(message="Use getNewBaseIntentAndroidAPI23Plus instead for Android 6+")
    private final Intent getNewBaseIntentAndroidAPI22AndOlder() {
        Intent intent = new Intent(this.context, this.notificationOpenedClassAndroid22AndOlder);
        intent.addFlags(0x18080000);
        return intent;
    }

    @RequiresApi(value=23)
    private final Intent getNewBaseIntentAndroidAPI23Plus() {
        return new Intent(this.context, this.notificationOpenedClassAndroid23Plus);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public final PendingIntent getNewActionPendingIntent(int n, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter((Object)intent, (String)"oneSignalIntent");
        return PendingIntent.getActivity((Context)this.context, (int)n, (Intent)intent, (int)0xC000000);
    }

    @NotNull
    public final Intent getNewBaseIntent(int n) {
        Intent intent = this.getNewBaseIntentAndroidAPI23Plus().putExtra("androidNotificationId", n).addFlags(0x24000000);
        Intrinsics.checkNotNullExpressionValue((Object)intent, (String)"intent\n            .putE\u2026Y_CLEAR_TOP\n            )");
        return intent;
    }
}

