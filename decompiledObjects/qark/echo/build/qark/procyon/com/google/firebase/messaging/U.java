// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import android.os.Bundle;
import B2.b;
import B2.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class U implements Parcelable$Creator
{
    public static void c(final T t, final Parcel parcel, int a) {
        a = c.a(parcel);
        c.e(parcel, 2, t.o, false);
        c.b(parcel, a);
    }
    
    public T a(final Parcel parcel) {
        final int u = b.u(parcel);
        Bundle a = null;
        while (parcel.dataPosition() < u) {
            final int n = b.n(parcel);
            if (b.i(n) != 2) {
                b.t(parcel, n);
            }
            else {
                a = b.a(parcel, n);
            }
        }
        b.h(parcel, u);
        return new T(a);
    }
    
    public T[] b(final int n) {
        return new T[n];
    }
}
