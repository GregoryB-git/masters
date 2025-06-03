/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package R2;

import B2.b;
import R2.I;
import R2.R5;
import R2.e;
import android.os.Parcel;
import android.os.Parcelable;

public final class h
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object object;
        long l8;
        Object object2;
        String string2;
        long l9;
        int n8 = b.u(parcel);
        String string3 = string2 = null;
        Object object3 = string3;
        String string4 = object3;
        Object object4 = object2 = (object = string4);
        long l10 = l9 = (l8 = 0L);
        boolean bl = false;
        block13 : while (parcel.dataPosition() < n8) {
            int n9 = b.n(parcel);
            switch (b.i(n9)) {
                default: {
                    b.t(parcel, n9);
                    continue block13;
                }
                case 12: {
                    object4 = (I)b.c(parcel, n9, I.CREATOR);
                    continue block13;
                }
                case 11: {
                    l10 = b.q(parcel, n9);
                    continue block13;
                }
                case 10: {
                    object2 = (I)b.c(parcel, n9, I.CREATOR);
                    continue block13;
                }
                case 9: {
                    l9 = b.q(parcel, n9);
                    continue block13;
                }
                case 8: {
                    object = (I)b.c(parcel, n9, I.CREATOR);
                    continue block13;
                }
                case 7: {
                    string4 = b.d(parcel, n9);
                    continue block13;
                }
                case 6: {
                    bl = b.j(parcel, n9);
                    continue block13;
                }
                case 5: {
                    l8 = b.q(parcel, n9);
                    continue block13;
                }
                case 4: {
                    object3 = (R5)b.c(parcel, n9, R5.CREATOR);
                    continue block13;
                }
                case 3: {
                    string3 = b.d(parcel, n9);
                    continue block13;
                }
                case 2: 
            }
            string2 = b.d(parcel, n9);
        }
        b.h(parcel, n8);
        return new e(string2, string3, (R5)object3, l8, bl, string4, (I)object, l9, (I)object2, l10, (I)object4);
    }

    public final /* synthetic */ Object[] newArray(int n8) {
        return new e[n8];
    }
}

