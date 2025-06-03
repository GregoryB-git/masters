// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.core.app;

import android.os.Parcelable;
import android.app.PendingIntent;
import v1.d;
import androidx.core.graphics.drawable.IconCompat;
import v1.b;

public class RemoteActionCompatParcelizer
{
    public static RemoteActionCompat read(final b b) {
        final RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat)b.v(remoteActionCompat.a, 1);
        remoteActionCompat.b = b.l(remoteActionCompat.b, 2);
        remoteActionCompat.c = b.l(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent)b.r((Parcelable)remoteActionCompat.d, 4);
        remoteActionCompat.e = b.h(remoteActionCompat.e, 5);
        remoteActionCompat.f = b.h(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }
    
    public static void write(final RemoteActionCompat remoteActionCompat, final b b) {
        b.x(false, false);
        b.M(remoteActionCompat.a, 1);
        b.D(remoteActionCompat.b, 2);
        b.D(remoteActionCompat.c, 3);
        b.H((Parcelable)remoteActionCompat.d, 4);
        b.z(remoteActionCompat.e, 5);
        b.z(remoteActionCompat.f, 6);
    }
}
