/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Notification
 *  android.app.Notification$MediaStyle
 *  android.app.PendingIntent
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Object
 */
package b0;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import androidx.annotation.NonNull;

public abstract class b {
    @SuppressLint(value={"MissingPermission"})
    public static Notification.MediaStyle a(Notification.MediaStyle mediaStyle, @NonNull CharSequence charSequence, int n8, PendingIntent pendingIntent, Boolean bl) {
        if (bl.booleanValue()) {
            mediaStyle.setRemotePlaybackInfo(charSequence, n8, pendingIntent);
        }
        return mediaStyle;
    }
}

