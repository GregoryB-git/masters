/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package R2;

import R2.I;
import R2.R1;
import R2.R5;
import R2.W5;
import R2.e;
import R2.n;
import R2.v5;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.Y;
import com.google.android.gms.internal.measurement.a0;
import java.util.ArrayList;
import java.util.List;

public final class T1
extends Y
implements R1 {
    public T1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override
    public final void D0(W5 w52) {
        Parcel parcel = this.n();
        a0.d(parcel, w52);
        this.v(18, parcel);
    }

    @Override
    public final List F(W5 w52, Bundle bundle) {
        Parcel parcel = this.n();
        a0.d(parcel, w52);
        a0.d(parcel, (Parcelable)bundle);
        w52 = this.o(24, parcel);
        bundle = w52.createTypedArrayList(v5.CREATOR);
        w52.recycle();
        return bundle;
    }

    @Override
    public final String G(W5 w52) {
        Object object = this.n();
        a0.d((Parcel)object, w52);
        w52 = this.o(11, (Parcel)object);
        object = w52.readString();
        w52.recycle();
        return object;
    }

    @Override
    public final void I0(long l8, String string2, String string3, String string4) {
        Parcel parcel = this.n();
        parcel.writeLong(l8);
        parcel.writeString(string2);
        parcel.writeString(string3);
        parcel.writeString(string4);
        this.v(10, parcel);
    }

    @Override
    public final List K0(String string2, String string3, String string4) {
        Parcel parcel = this.n();
        parcel.writeString(string2);
        parcel.writeString(string3);
        parcel.writeString(string4);
        string2 = this.o(17, parcel);
        string3 = string2.createTypedArrayList(e.CREATOR);
        string2.recycle();
        return string3;
    }

    @Override
    public final byte[] M0(I i8, String arrby) {
        Parcel parcel = this.n();
        a0.d(parcel, i8);
        parcel.writeString((String)arrby);
        i8 = this.o(9, parcel);
        arrby = i8.createByteArray();
        i8.recycle();
        return arrby;
    }

    @Override
    public final void N(W5 w52) {
        Parcel parcel = this.n();
        a0.d(parcel, w52);
        this.v(6, parcel);
    }

    @Override
    public final void O0(Bundle bundle, W5 w52) {
        Parcel parcel = this.n();
        a0.d(parcel, (Parcelable)bundle);
        a0.d(parcel, w52);
        this.v(19, parcel);
    }

    @Override
    public final n P0(W5 w52) {
        Object object = this.n();
        a0.d((Parcel)object, w52);
        w52 = this.o(21, (Parcel)object);
        object = (n)a0.a((Parcel)w52, n.CREATOR);
        w52.recycle();
        return object;
    }

    @Override
    public final void R0(I i8, W5 w52) {
        Parcel parcel = this.n();
        a0.d(parcel, i8);
        a0.d(parcel, w52);
        this.v(1, parcel);
    }

    @Override
    public final void S0(I i8, String string2, String string3) {
        Parcel parcel = this.n();
        a0.d(parcel, i8);
        parcel.writeString(string2);
        parcel.writeString(string3);
        this.v(5, parcel);
    }

    @Override
    public final void U0(W5 w52) {
        Parcel parcel = this.n();
        a0.d(parcel, w52);
        this.v(20, parcel);
    }

    @Override
    public final List V0(String string2, String string3, W5 w52) {
        Parcel parcel = this.n();
        parcel.writeString(string2);
        parcel.writeString(string3);
        a0.d(parcel, w52);
        string2 = this.o(16, parcel);
        string3 = string2.createTypedArrayList(e.CREATOR);
        string2.recycle();
        return string3;
    }

    @Override
    public final List W(String string2, String string3, String string4, boolean bl) {
        Parcel parcel = this.n();
        parcel.writeString(string2);
        parcel.writeString(string3);
        parcel.writeString(string4);
        a0.e(parcel, bl);
        string2 = this.o(15, parcel);
        string3 = string2.createTypedArrayList(R5.CREATOR);
        string2.recycle();
        return string3;
    }

    @Override
    public final void Z(R5 r52, W5 w52) {
        Parcel parcel = this.n();
        a0.d(parcel, r52);
        a0.d(parcel, w52);
        this.v(2, parcel);
    }

    @Override
    public final void c0(W5 w52) {
        Parcel parcel = this.n();
        a0.d(parcel, w52);
        this.v(4, parcel);
    }

    @Override
    public final void m0(e e8, W5 w52) {
        Parcel parcel = this.n();
        a0.d(parcel, e8);
        a0.d(parcel, w52);
        this.v(12, parcel);
    }

    @Override
    public final void n0(e e8) {
        Parcel parcel = this.n();
        a0.d(parcel, e8);
        this.v(13, parcel);
    }

    @Override
    public final List x0(String string2, String string3, boolean bl, W5 w52) {
        Parcel parcel = this.n();
        parcel.writeString(string2);
        parcel.writeString(string3);
        a0.e(parcel, bl);
        a0.d(parcel, w52);
        string2 = this.o(14, parcel);
        string3 = string2.createTypedArrayList(R5.CREATOR);
        string2.recycle();
        return string3;
    }
}

