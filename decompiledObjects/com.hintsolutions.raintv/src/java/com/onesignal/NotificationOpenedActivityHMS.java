/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.os.Bundle
 *  androidx.annotation.Nullable
 *  java.lang.Object
 */
package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.onesignal.NotificationPayloadProcessorHMS;

public class NotificationOpenedActivityHMS
extends Activity {
    private void processIntent() {
        this.processOpen(this.getIntent());
        this.finish();
    }

    private void processOpen(@Nullable Intent intent) {
        NotificationPayloadProcessorHMS.handleHMSNotificationOpenIntent(this, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.processIntent();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.processIntent();
    }
}

