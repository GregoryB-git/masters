// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.core.graphics.drawable;

import android.os.Parcelable;
import android.content.res.ColorStateList;
import v1.b;

public class IconCompatParcelizer
{
    public static IconCompat read(final b b) {
        final IconCompat iconCompat = new IconCompat();
        iconCompat.a = b.p(iconCompat.a, 1);
        iconCompat.c = b.j(iconCompat.c, 2);
        iconCompat.d = b.r(iconCompat.d, 3);
        iconCompat.e = b.p(iconCompat.e, 4);
        iconCompat.f = b.p(iconCompat.f, 5);
        iconCompat.g = (ColorStateList)b.r((Parcelable)iconCompat.g, 6);
        iconCompat.i = b.t(iconCompat.i, 7);
        iconCompat.j = b.t(iconCompat.j, 8);
        iconCompat.l();
        return iconCompat;
    }
    
    public static void write(final IconCompat iconCompat, final b b) {
        b.x(true, true);
        iconCompat.m(b.f());
        final int a = iconCompat.a;
        if (-1 != a) {
            b.F(a, 1);
        }
        final byte[] c = iconCompat.c;
        if (c != null) {
            b.B(c, 2);
        }
        final Parcelable d = iconCompat.d;
        if (d != null) {
            b.H(d, 3);
        }
        final int e = iconCompat.e;
        if (e != 0) {
            b.F(e, 4);
        }
        final int f = iconCompat.f;
        if (f != 0) {
            b.F(f, 5);
        }
        final ColorStateList g = iconCompat.g;
        if (g != null) {
            b.H((Parcelable)g, 6);
        }
        final String i = iconCompat.i;
        if (i != null) {
            b.J(i, 7);
        }
        final String j = iconCompat.j;
        if (j != null) {
            b.J(j, 8);
        }
    }
}
