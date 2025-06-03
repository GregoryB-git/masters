package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import v1.b;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f8826a = (IconCompat) bVar.v(remoteActionCompat.f8826a, 1);
        remoteActionCompat.f8827b = bVar.l(remoteActionCompat.f8827b, 2);
        remoteActionCompat.f8828c = bVar.l(remoteActionCompat.f8828c, 3);
        remoteActionCompat.f8829d = (PendingIntent) bVar.r(remoteActionCompat.f8829d, 4);
        remoteActionCompat.f8830e = bVar.h(remoteActionCompat.f8830e, 5);
        remoteActionCompat.f8831f = bVar.h(remoteActionCompat.f8831f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.x(false, false);
        bVar.M(remoteActionCompat.f8826a, 1);
        bVar.D(remoteActionCompat.f8827b, 2);
        bVar.D(remoteActionCompat.f8828c, 3);
        bVar.H(remoteActionCompat.f8829d, 4);
        bVar.z(remoteActionCompat.f8830e, 5);
        bVar.z(remoteActionCompat.f8831f, 6);
    }
}
