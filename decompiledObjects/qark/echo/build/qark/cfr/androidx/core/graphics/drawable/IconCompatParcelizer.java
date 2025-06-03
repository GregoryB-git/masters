/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.os.Parcelable
 *  java.lang.Object
 *  java.lang.String
 */
package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import v1.b;

public class IconCompatParcelizer {
    public static IconCompat read(b b8) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = b8.p(iconCompat.a, 1);
        iconCompat.c = b8.j(iconCompat.c, 2);
        iconCompat.d = b8.r(iconCompat.d, 3);
        iconCompat.e = b8.p(iconCompat.e, 4);
        iconCompat.f = b8.p(iconCompat.f, 5);
        iconCompat.g = (ColorStateList)b8.r((Parcelable)iconCompat.g, 6);
        iconCompat.i = b8.t(iconCompat.i, 7);
        iconCompat.j = b8.t(iconCompat.j, 8);
        iconCompat.l();
        return iconCompat;
    }

    public static void write(IconCompat object, b b8) {
        Object object2;
        b8.x(true, true);
        object.m(b8.f());
        int n8 = object.a;
        if (-1 != n8) {
            b8.F(n8, 1);
        }
        if ((object2 = object.c) != null) {
            b8.B((byte[])object2, 2);
        }
        if ((object2 = object.d) != null) {
            b8.H((Parcelable)object2, 3);
        }
        if ((n8 = object.e) != 0) {
            b8.F(n8, 4);
        }
        if ((n8 = object.f) != 0) {
            b8.F(n8, 5);
        }
        if ((object2 = object.g) != null) {
            b8.H((Parcelable)object2, 6);
        }
        if ((object2 = object.i) != null) {
            b8.J((String)object2, 7);
        }
        if ((object = object.j) != null) {
            b8.J((String)object, 8);
        }
    }
}

