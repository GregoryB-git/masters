package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import b2.c;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(c cVar) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        iconCompat.f942a = cVar.o(iconCompat.f942a, 1);
        byte[] bArr = iconCompat.f944c;
        if (cVar.l(2)) {
            bArr = cVar.i();
        }
        iconCompat.f944c = bArr;
        iconCompat.f945d = cVar.s(iconCompat.f945d, 3);
        iconCompat.f946e = cVar.o(iconCompat.f946e, 4);
        iconCompat.f = cVar.o(iconCompat.f, 5);
        iconCompat.f947g = (ColorStateList) cVar.s(iconCompat.f947g, 6);
        iconCompat.f949i = cVar.u(7, iconCompat.f949i);
        iconCompat.f950j = cVar.u(8, iconCompat.f950j);
        iconCompat.f948h = PorterDuff.Mode.valueOf(iconCompat.f949i);
        switch (iconCompat.f942a) {
            case -1:
                parcelable = iconCompat.f945d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f943b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                parcelable = iconCompat.f945d;
                if (parcelable == null) {
                    byte[] bArr2 = iconCompat.f944c;
                    iconCompat.f943b = bArr2;
                    iconCompat.f942a = 3;
                    iconCompat.f946e = 0;
                    iconCompat.f = bArr2.length;
                    return iconCompat;
                }
                iconCompat.f943b = parcelable;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f944c, Charset.forName("UTF-16"));
                iconCompat.f943b = str;
                if (iconCompat.f942a == 2 && iconCompat.f950j == null) {
                    iconCompat.f950j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f943b = iconCompat.f944c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, c cVar) {
        cVar.getClass();
        iconCompat.f949i = iconCompat.f948h.name();
        switch (iconCompat.f942a) {
            case -1:
            case 1:
            case 5:
                iconCompat.f945d = (Parcelable) iconCompat.f943b;
                break;
            case 2:
                iconCompat.f944c = ((String) iconCompat.f943b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f944c = (byte[]) iconCompat.f943b;
                break;
            case 4:
            case 6:
                iconCompat.f944c = iconCompat.f943b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.f942a;
        if (-1 != i10) {
            cVar.I(i10, 1);
        }
        byte[] bArr = iconCompat.f944c;
        if (bArr != null) {
            cVar.y(2);
            cVar.D(bArr);
        }
        Parcelable parcelable = iconCompat.f945d;
        if (parcelable != null) {
            cVar.M(parcelable, 3);
        }
        int i11 = iconCompat.f946e;
        if (i11 != 0) {
            cVar.I(i11, 4);
        }
        int i12 = iconCompat.f;
        if (i12 != 0) {
            cVar.I(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f947g;
        if (colorStateList != null) {
            cVar.M(colorStateList, 6);
        }
        String str = iconCompat.f949i;
        if (str != null) {
            cVar.O(7, str);
        }
        String str2 = iconCompat.f950j;
        if (str2 != null) {
            cVar.O(8, str2);
        }
    }
}
