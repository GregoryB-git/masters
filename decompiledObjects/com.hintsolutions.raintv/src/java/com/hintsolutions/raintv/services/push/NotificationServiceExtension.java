/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.core.app.NotificationCompat$Builder
 *  com.google.gson.Gson
 *  com.google.gson.JsonSyntaxException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 *  java.util.Date
 *  javax.inject.Inject
 *  tvrain.managers.PrefsManager
 */
package com.hintsolutions.raintv.services.push;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.hintsolutions.raintv.services.push.NotificationPayloadRaw;
import com.onesignal.OSMutableNotification;
import com.onesignal.OSNotification;
import com.onesignal.OSNotificationReceivedEvent;
import com.onesignal.OneSignal;
import java.util.Date;
import javax.inject.Inject;
import tvrain.managers.PrefsManager;

public class NotificationServiceExtension
implements OneSignal.OSRemoteNotificationReceivedHandler {
    @Inject
    public PrefsManager prefsManager;

    public static /* synthetic */ NotificationCompat.Builder a(Context context, NotificationCompat.Builder builder) {
        return builder.setColor(context.getResources().getColor(2131099728));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void remoteNotificationReceived(Context object, OSNotificationReceivedEvent oSNotificationReceivedEvent) {
        block11: {
            boolean bl;
            OSMutableNotification oSMutableNotification;
            block10: {
                boolean bl2;
                Object object2 = oSNotificationReceivedEvent.getNotification();
                oSMutableNotification = ((OSNotification)object2).mutableCopy();
                oSMutableNotification.setExtender(new s4(object, 13));
                object = ((OSNotification)object2).getRawPayload();
                bl = bl2 = false;
                if (object != null) {
                    try {
                        object = new Gson();
                        object2 = (NotificationPayloadRaw)object.fromJson(((OSNotification)object2).getRawPayload(), NotificationPayloadRaw.class);
                        bl = bl2;
                        if (object2 == null) break block10;
                        object = new Date();
                        long l = (object.getTime() - ((NotificationPayloadRaw)object2).sentTime) / 3600000L;
                        bl = bl2;
                        if (l > 1L) {
                            bl = true;
                        }
                    }
                    catch (JsonSyntaxException jsonSyntaxException) {
                        bl = bl2;
                    }
                }
            }
            if (!bl) {
                try {
                    try {
                        if (this.prefsManager.getBoolean("push", true)) {
                            oSNotificationReceivedEvent.complete(oSMutableNotification);
                        }
                        break block11;
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                    break block11;
                }
                catch (Throwable throwable2) {}
                oSNotificationReceivedEvent.complete(null);
                throw throwable2;
            }
        }
        oSNotificationReceivedEvent.complete(null);
    }
}

