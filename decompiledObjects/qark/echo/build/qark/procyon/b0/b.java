// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package b0;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import androidx.annotation.NonNull;
import android.app.Notification$MediaStyle;

public abstract class b
{
    @SuppressLint({ "MissingPermission" })
    public static Notification$MediaStyle a(final Notification$MediaStyle notification$MediaStyle, @NonNull final CharSequence charSequence, final int n, final PendingIntent pendingIntent, final Boolean b) {
        if (b) {
            notification$MediaStyle.setRemotePlaybackInfo(charSequence, n, pendingIntent);
        }
        return notification$MediaStyle;
    }
}
