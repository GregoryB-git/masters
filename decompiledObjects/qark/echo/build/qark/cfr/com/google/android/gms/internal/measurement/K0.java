/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

import B2.b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.H0;

public final class K0
implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String string2;
        String string3;
        long l8;
        String string4;
        String string5;
        int n8 = b.u(parcel);
        long l9 = l8 = 0L;
        boolean bl = false;
        String string6 = string5 = (string3 = (string2 = (string4 = null)));
        block10 : while (parcel.dataPosition() < n8) {
            int n9 = b.n(parcel);
            switch (b.i(n9)) {
                default: {
                    b.t(parcel, n9);
                    continue block10;
                }
                case 8: {
                    string6 = b.d(parcel, n9);
                    continue block10;
                }
                case 7: {
                    string5 = b.a(parcel, n9);
                    continue block10;
                }
                case 6: {
                    string3 = b.d(parcel, n9);
                    continue block10;
                }
                case 5: {
                    string2 = b.d(parcel, n9);
                    continue block10;
                }
                case 4: {
                    string4 = b.d(parcel, n9);
                    continue block10;
                }
                case 3: {
                    bl = b.j(parcel, n9);
                    continue block10;
                }
                case 2: {
                    l9 = b.q(parcel, n9);
                    continue block10;
                }
                case 1: 
            }
            l8 = b.q(parcel, n9);
        }
        b.h(parcel, n8);
        return new H0(l8, l9, bl, string4, string2, string3, (Bundle)string5, string6);
    }

    public final /* synthetic */ Object[] newArray(int n8) {
        return new H0[n8];
    }
}

