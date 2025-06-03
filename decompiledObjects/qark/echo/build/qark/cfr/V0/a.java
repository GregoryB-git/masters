/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package V0;

import V0.b;
import android.os.Parcel;
import android.os.Parcelable;
import g0.M;
import g0.z;

public final class a
extends b {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator(){

        public a a(Parcel parcel) {
            return new a(parcel, null);
        }

        public a[] b(int n8) {
            return new a[n8];
        }
    };
    public final long o;
    public final long p;
    public final byte[] q;

    public a(long l8, byte[] arrby, long l9) {
        this.o = l9;
        this.p = l8;
        this.q = arrby;
    }

    public a(Parcel parcel) {
        this.o = parcel.readLong();
        this.p = parcel.readLong();
        this.q = (byte[])M.i(parcel.createByteArray());
    }

    public /* synthetic */ a(Parcel parcel,  a8) {
        this(parcel);
    }

    public static a a(z z8, int n8, long l8) {
        long l9 = z8.I();
        byte[] arrby = new byte[n8 -= 4];
        z8.l(arrby, 0, n8);
        return new a(l9, arrby, l8);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SCTE-35 PrivateCommand { ptsAdjustment=");
        stringBuilder.append(this.o);
        stringBuilder.append(", identifier= ");
        stringBuilder.append(this.p);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeLong(this.o);
        parcel.writeLong(this.p);
        parcel.writeByteArray(this.q);
    }

}

