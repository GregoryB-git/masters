package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import b2.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(c cVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f932a = (IconCompat) cVar.x(remoteActionCompat.f932a, 1);
        CharSequence charSequence = remoteActionCompat.f933b;
        if (cVar.l(2)) {
            charSequence = cVar.j();
        }
        remoteActionCompat.f933b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f934c;
        if (cVar.l(3)) {
            charSequence2 = cVar.j();
        }
        remoteActionCompat.f934c = charSequence2;
        remoteActionCompat.f935d = (PendingIntent) cVar.s(remoteActionCompat.f935d, 4);
        remoteActionCompat.f936e = cVar.f(5, remoteActionCompat.f936e);
        remoteActionCompat.f = cVar.f(6, remoteActionCompat.f);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, c cVar) {
        cVar.getClass();
        cVar.R(remoteActionCompat.f932a, 1);
        CharSequence charSequence = remoteActionCompat.f933b;
        cVar.y(2);
        cVar.E(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f934c;
        cVar.y(3);
        cVar.E(charSequence2);
        cVar.M(remoteActionCompat.f935d, 4);
        cVar.z(5, remoteActionCompat.f936e);
        cVar.z(6, remoteActionCompat.f);
    }
}
