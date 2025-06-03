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
import R2.D;
import R2.I;
import android.os.Parcel;
import android.os.Parcelable;

public final class H
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int n8 = b.u(parcel);
        String string2 = null;
        Object object = string2;
        String string3 = object;
        long l8 = 0L;
        while (parcel.dataPosition() < n8) {
            int n9 = b.n(parcel);
            int n10 = b.i(n9);
            if (n10 != 2) {
                if (n10 != 3) {
                    if (n10 != 4) {
                        if (n10 != 5) {
                            b.t(parcel, n9);
                            continue;
                        }
                        l8 = b.q(parcel, n9);
                        continue;
                    }
                    string3 = b.d(parcel, n9);
                    continue;
                }
                object = (D)b.c(parcel, n9, D.CREATOR);
                continue;
            }
            string2 = b.d(parcel, n9);
        }
        b.h(parcel, n8);
        return new I(string2, (D)object, string3, l8);
    }

    public final /* synthetic */ Object[] newArray(int n8) {
        return new I[n8];
    }
}

