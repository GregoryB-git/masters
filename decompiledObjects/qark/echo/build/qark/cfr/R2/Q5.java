/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package R2;

import B2.b;
import R2.R5;
import android.os.Parcel;
import android.os.Parcelable;

public final class Q5
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object object;
        Double d8;
        int n8 = b.u(parcel);
        int n9 = 0;
        Object object2 = null;
        Double d9 = d8 = object2;
        Object object3 = object = d9;
        Double d10 = object3;
        long l8 = 0L;
        block10 : while (parcel.dataPosition() < n8) {
            int n10 = b.n(parcel);
            switch (b.i(n10)) {
                default: {
                    b.t(parcel, n10);
                    continue block10;
                }
                case 8: {
                    d10 = b.l(parcel, n10);
                    continue block10;
                }
                case 7: {
                    object3 = b.d(parcel, n10);
                    continue block10;
                }
                case 6: {
                    object = b.d(parcel, n10);
                    continue block10;
                }
                case 5: {
                    d9 = b.m(parcel, n10);
                    continue block10;
                }
                case 4: {
                    d8 = b.r(parcel, n10);
                    continue block10;
                }
                case 3: {
                    l8 = b.q(parcel, n10);
                    continue block10;
                }
                case 2: {
                    object2 = b.d(parcel, n10);
                    continue block10;
                }
                case 1: 
            }
            n9 = b.p(parcel, n10);
        }
        b.h(parcel, n8);
        return new R5(n9, (String)object2, l8, (Long)d8, (Float)d9, (String)object, (String)object3, d10);
    }

    public final /* synthetic */ Object[] newArray(int n8) {
        return new R5[n8];
    }
}

