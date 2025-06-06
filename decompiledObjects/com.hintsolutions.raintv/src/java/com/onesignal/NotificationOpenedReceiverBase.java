/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.NotificationOpenedProcessor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0014\u00a8\u0006\n"}, d2={"Lcom/onesignal/NotificationOpenedReceiverBase;", "Landroid/app/Activity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public abstract class NotificationOpenedReceiverBase
extends Activity {
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        NotificationOpenedProcessor.processFromContext((Context)this, this.getIntent());
        this.finish();
    }

    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter((Object)intent, (String)"intent");
        super.onNewIntent(intent);
        NotificationOpenedProcessor.processFromContext((Context)this, this.getIntent());
        this.finish();
    }
}

