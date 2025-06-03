package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import v1.b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f8833a = bVar.p(iconCompat.f8833a, 1);
        iconCompat.f8835c = bVar.j(iconCompat.f8835c, 2);
        iconCompat.f8836d = bVar.r(iconCompat.f8836d, 3);
        iconCompat.f8837e = bVar.p(iconCompat.f8837e, 4);
        iconCompat.f8838f = bVar.p(iconCompat.f8838f, 5);
        iconCompat.f8839g = (ColorStateList) bVar.r(iconCompat.f8839g, 6);
        iconCompat.f8841i = bVar.t(iconCompat.f8841i, 7);
        iconCompat.f8842j = bVar.t(iconCompat.f8842j, 8);
        iconCompat.l();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.x(true, true);
        iconCompat.m(bVar.f());
        int i7 = iconCompat.f8833a;
        if (-1 != i7) {
            bVar.F(i7, 1);
        }
        byte[] bArr = iconCompat.f8835c;
        if (bArr != null) {
            bVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f8836d;
        if (parcelable != null) {
            bVar.H(parcelable, 3);
        }
        int i8 = iconCompat.f8837e;
        if (i8 != 0) {
            bVar.F(i8, 4);
        }
        int i9 = iconCompat.f8838f;
        if (i9 != 0) {
            bVar.F(i9, 5);
        }
        ColorStateList colorStateList = iconCompat.f8839g;
        if (colorStateList != null) {
            bVar.H(colorStateList, 6);
        }
        String str = iconCompat.f8841i;
        if (str != null) {
            bVar.J(str, 7);
        }
        String str2 = iconCompat.f8842j;
        if (str2 != null) {
            bVar.J(str2, 8);
        }
    }
}
