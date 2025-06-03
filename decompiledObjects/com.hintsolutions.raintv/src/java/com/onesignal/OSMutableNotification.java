/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.core.app.NotificationCompat$Extender
 *  java.lang.Object
 *  java.lang.Override
 */
package com.onesignal;

import androidx.core.app.NotificationCompat;
import com.onesignal.OSNotification;

public class OSMutableNotification
extends OSNotification {
    public OSMutableNotification(OSNotification oSNotification) {
        super(oSNotification);
    }

    @Override
    public void setAndroidNotificationId(int n) {
        super.setAndroidNotificationId(n);
    }

    public void setExtender(NotificationCompat.Extender extender) {
        this.setNotificationExtender(extender);
    }
}

