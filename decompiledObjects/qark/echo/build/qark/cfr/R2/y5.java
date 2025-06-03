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
import R2.v5;
import android.os.Parcel;
import android.os.Parcelable;

public final class y5
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int n8 = b.u(parcel);
        String string2 = null;
        long l8 = 0L;
        int n9 = 0;
        while (parcel.dataPosition() < n8) {
            int n10 = b.n(parcel);
            int n11 = b.i(n10);
            if (n11 != 1) {
                if (n11 != 2) {
                    if (n11 != 3) {
                        b.t(parcel, n10);
                        continue;
                    }
                    n9 = b.p(parcel, n10);
                    continue;
                }
                l8 = b.q(parcel, n10);
                continue;
            }
            string2 = b.d(parcel, n10);
        }
        b.h(parcel, n8);
        return new v5(string2, l8, n9);
    }

    public final /* synthetic */ Object[] newArray(int n8) {
        return new v5[n8];
    }
}

