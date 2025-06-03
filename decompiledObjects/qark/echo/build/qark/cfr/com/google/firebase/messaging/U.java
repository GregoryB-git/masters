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
package com.google.firebase.messaging;

import B2.b;
import B2.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.T;

public class U
implements Parcelable.Creator {
    public static void c(T t8, Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.e(parcel, 2, t8.o, false);
        c.b(parcel, n8);
    }

    public T a(Parcel parcel) {
        int n8 = b.u(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < n8) {
            int n9 = b.n(parcel);
            if (b.i(n9) != 2) {
                b.t(parcel, n9);
                continue;
            }
            bundle = b.a(parcel, n9);
        }
        b.h(parcel, n8);
        return new T(bundle);
    }

    public T[] b(int n8) {
        return new T[n8];
    }
}

