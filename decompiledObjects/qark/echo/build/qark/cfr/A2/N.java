/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package A2;

import A2.P;
import M2.a;
import M2.c;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import x2.F;
import x2.H;
import x2.J;

public final class N
extends a
implements P {
    public N(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override
    public final H B0(F f8) {
        Object object = this.o();
        c.d((Parcel)object, f8);
        f8 = this.n(6, (Parcel)object);
        object = (H)c.a((Parcel)f8, H.CREATOR);
        f8.recycle();
        return object;
    }

    @Override
    public final boolean e0(J j8, H2.a a8) {
        Parcel parcel = this.o();
        c.d(parcel, j8);
        c.e(parcel, a8);
        j8 = this.n(5, parcel);
        boolean bl = c.f((Parcel)j8);
        j8.recycle();
        return bl;
    }

    @Override
    public final boolean h() {
        Parcel parcel = this.n(7, this.o());
        boolean bl = c.f(parcel);
        parcel.recycle();
        return bl;
    }

    @Override
    public final H i0(F f8) {
        Object object = this.o();
        c.d((Parcel)object, f8);
        f8 = this.n(8, (Parcel)object);
        object = (H)c.a((Parcel)f8, H.CREATOR);
        f8.recycle();
        return object;
    }
}

