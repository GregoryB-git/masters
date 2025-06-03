/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 */
package R2;

import B2.b;
import R2.n;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class m
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int n8 = b.u(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < n8) {
            int n9 = b.n(parcel);
            if (b.i(n9) != 1) {
                b.t(parcel, n9);
                continue;
            }
            bundle = b.a(parcel, n9);
        }
        b.h(parcel, n8);
        return new n(bundle);
    }

    public final /* synthetic */ Object[] newArray(int n8) {
        return new n[n8];
    }
}

