/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Parcelable
 *  java.lang.CharSequence
 *  java.lang.Object
 */
package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.app.RemoteActionCompat;
import androidx.core.graphics.drawable.IconCompat;
import v1.b;
import v1.d;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b b8) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat)b8.v(remoteActionCompat.a, 1);
        remoteActionCompat.b = b8.l(remoteActionCompat.b, 2);
        remoteActionCompat.c = b8.l(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent)b8.r((Parcelable)remoteActionCompat.d, 4);
        remoteActionCompat.e = b8.h(remoteActionCompat.e, 5);
        remoteActionCompat.f = b8.h(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b b8) {
        b8.x(false, false);
        b8.M(remoteActionCompat.a, 1);
        b8.D(remoteActionCompat.b, 2);
        b8.D(remoteActionCompat.c, 3);
        b8.H((Parcelable)remoteActionCompat.d, 4);
        b8.z(remoteActionCompat.e, 5);
        b8.z(remoteActionCompat.f, 6);
    }
}

