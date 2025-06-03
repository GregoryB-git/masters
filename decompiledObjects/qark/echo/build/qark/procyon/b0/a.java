// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package b0;

import android.app.Notification$Style;
import android.app.Notification$Builder;
import android.media.session.MediaSession$Token;
import android.support.v4.media.session.MediaSessionCompat;
import android.app.Notification$MediaStyle;

public abstract class a
{
    public static Notification$MediaStyle a() {
        return new Notification$MediaStyle();
    }
    
    public static Notification$MediaStyle b(final Notification$MediaStyle notification$MediaStyle, final int[] array, final MediaSessionCompat.Token token) {
        if (array != null) {
            e(notification$MediaStyle, array);
        }
        if (token != null) {
            c(notification$MediaStyle, (MediaSession$Token)token.e());
        }
        return notification$MediaStyle;
    }
    
    public static void c(final Notification$MediaStyle notification$MediaStyle, final MediaSession$Token mediaSession) {
        notification$MediaStyle.setMediaSession(mediaSession);
    }
    
    public static void d(final Notification$Builder notification$Builder, final Notification$MediaStyle style) {
        notification$Builder.setStyle((Notification$Style)style);
    }
    
    public static void e(final Notification$MediaStyle notification$MediaStyle, final int... showActionsInCompactView) {
        notification$MediaStyle.setShowActionsInCompactView(showActionsInCompactView);
    }
}
