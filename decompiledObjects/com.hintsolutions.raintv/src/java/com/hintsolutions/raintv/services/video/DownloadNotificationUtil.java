/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  androidx.annotation.DrawableRes
 *  androidx.annotation.Nullable
 *  androidx.annotation.StringRes
 *  androidx.core.app.NotificationCompat$BigTextStyle
 *  androidx.core.app.NotificationCompat$Builder
 *  androidx.core.app.NotificationCompat$Style
 *  com.google.android.exoplayer2.offline.DownloadManager$TaskState
 *  com.hintsolutions.raintv.services.video.AutoVideoDownloadService
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.services.video;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.hintsolutions.raintv.services.video.AutoVideoDownloadService;

public final class DownloadNotificationUtil {
    @StringRes
    private static final int NULL_STRING_ID = 0;
    private static final int REQUEST_CODE_CANCEL_DOWNLOADS = 100;

    private DownloadNotificationUtil() {
    }

    public static Notification buildDownloadCompletedNotification(Context context, @DrawableRes int n, String string2, @Nullable PendingIntent pendingIntent, @Nullable String string3) {
        return DownloadNotificationUtil.newNotificationBuilder(context, n, string2, pendingIntent, string3, 2131755205).build();
    }

    public static Notification buildDownloadFailedNotification(Context context, @DrawableRes int n, String string2, @Nullable PendingIntent pendingIntent, @Nullable String string3) {
        return DownloadNotificationUtil.newNotificationBuilder(context, n, string2, pendingIntent, string3, 2131755206).build();
    }

    public static Notification buildProgressNotification(Context context, @DrawableRes int n, String string2, @Nullable PendingIntent pendingIntent, @Nullable String string3, DownloadManager.TaskState[] object) {
        boolean bl;
        int n2;
        int n3;
        int n4;
        int n6 = ((DownloadManager.TaskState[])object).length;
        float f2 = 0.0f;
        boolean bl2 = true;
        int n7 = 0;
        int n8 = n4 = (n3 = (n2 = 0));
        int n9 = n4;
        for (n4 = n7; n4 < n6; ++n4) {
            float f4;
            DownloadManager.TaskState taskState;
            block12: {
                block13: {
                    taskState = object[n4];
                    bl = taskState.action.isRemoveAction;
                    n7 = n9;
                    if (bl) break block12;
                    int n10 = taskState.state;
                    if (n10 == 0) break block13;
                    n7 = n9;
                    if (n10 != 1) break block12;
                }
                n7 = n9 + 1;
            }
            if ((n9 = taskState.state) != 1 && n9 != 2 && n9 != 0) {
                f4 = f2;
            } else if (bl) {
                n3 = 1;
                f4 = f2;
            } else {
                float f5 = taskState.downloadPercentage;
                f4 = f2;
                if (f5 != -1.0f) {
                    f4 = f2 + f5;
                    bl2 = false;
                }
                n2 = taskState.downloadedBytes > 0L ? 1 : 0;
                n8 |= n2;
                n2 = 1;
            }
            f2 = f4;
            n9 = n7;
        }
        object = n2 != 0 ? context.getResources().getString(2131755644, new Object[]{n9}) : (n3 != 0 ? context.getResources().getString(2131755209) : null);
        string2 = DownloadNotificationUtil.newNotificationBuilder(context, n, string2, pendingIntent, string3, (String)object);
        if (n2 != 0) {
            n = (int)(f2 / (float)n9);
            bl = bl2 && n8 != 0;
        } else {
            bl = true;
            n = 0;
        }
        string2.setProgress(100, n, bl);
        string2.setOngoing(true);
        string2.setShowWhen(false);
        if (n3 == 0) {
            pendingIntent = new Intent(context, AutoVideoDownloadService.class);
            pendingIntent.setAction("com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS");
            pendingIntent = PendingIntent.getService((Context)context, (int)100, (Intent)pendingIntent, (int)0);
            string2.addAction(2131230985, (CharSequence)context.getResources().getString(2131755081), pendingIntent);
        }
        return string2.build();
    }

    private static NotificationCompat.Builder newNotificationBuilder(Context context, @DrawableRes int n, String string2, @Nullable PendingIntent pendingIntent, @Nullable String string3, @StringRes int n2) {
        String string4 = n2 != 0 ? context.getResources().getString(n2) : null;
        return DownloadNotificationUtil.newNotificationBuilder(context, n, string2, pendingIntent, string3, string4);
    }

    private static NotificationCompat.Builder newNotificationBuilder(Context context, @DrawableRes int n, String string2, @Nullable PendingIntent pendingIntent, @Nullable String string3, String string4) {
        context = new NotificationCompat.Builder(context, string2).setSmallIcon(n);
        if (string4 != null) {
            context.setContentTitle((CharSequence)string4);
        }
        if (pendingIntent != null) {
            context.setContentIntent(pendingIntent);
        }
        if (string3 != null) {
            context.setStyle((NotificationCompat.Style)new NotificationCompat.BigTextStyle().bigText((CharSequence)string3));
        }
        return context;
    }
}

