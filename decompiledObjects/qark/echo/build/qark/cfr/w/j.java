/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Bundle
 *  android.os.Parcelable
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package w;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import w.h;
import w.l;

public abstract class j {
    public static final Object a = new Object();
    public static final Object b = new Object();

    public static Bundle a(h.a a8) {
        Bundle bundle = new Bundle();
        IconCompat iconCompat = a8.d();
        int n8 = iconCompat != null ? iconCompat.g() : 0;
        bundle.putInt("icon", n8);
        bundle.putCharSequence("title", a8.h());
        bundle.putParcelable("actionIntent", (Parcelable)a8.a());
        iconCompat = a8.c() != null ? new Bundle(a8.c()) : new Bundle();
        iconCompat.putBoolean("android.support.allowGeneratedReplies", a8.b());
        bundle.putBundle("extras", (Bundle)iconCompat);
        bundle.putParcelableArray("remoteInputs", (Parcelable[])j.c(a8.e()));
        bundle.putBoolean("showsUserInterface", a8.g());
        bundle.putInt("semanticAction", a8.f());
        return bundle;
    }

    public static Bundle b(l l8) {
        new Bundle();
        throw null;
    }

    public static Bundle[] c(l[] arrl) {
        if (arrl == null) {
            return null;
        }
        Bundle[] arrbundle = new Bundle[arrl.length];
        for (int i8 = 0; i8 < arrl.length; ++i8) {
            l l8 = arrl[i8];
            arrbundle[i8] = j.b(null);
        }
        return arrbundle;
    }
}

