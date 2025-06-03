/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.Notification$Builder
 *  android.app.Notification$MediaStyle
 *  android.app.Notification$Style
 *  android.media.session.MediaSession
 *  android.media.session.MediaSession$Token
 *  java.lang.Object
 */
package b0;

import android.app.Notification;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat;

public abstract class a {
    public static Notification.MediaStyle a() {
        return new Notification.MediaStyle();
    }

    public static Notification.MediaStyle b(Notification.MediaStyle mediaStyle, int[] arrn, MediaSessionCompat.Token token) {
        if (arrn != null) {
            a.e(mediaStyle, arrn);
        }
        if (token != null) {
            a.c(mediaStyle, (MediaSession.Token)token.e());
        }
        return mediaStyle;
    }

    public static void c(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }

    public static void d(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle((Notification.Style)mediaStyle);
    }

    public static /* varargs */ void e(Notification.MediaStyle mediaStyle, int ... arrn) {
        mediaStyle.setShowActionsInCompactView(arrn);
    }
}

