/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Class
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package h0;

import a3.f;
import android.os.Parcel;
import android.os.Parcelable;
import d0.q;
import d0.w;
import d0.x;
import d0.y;
import g0.M;
import java.util.Arrays;

public final class a
implements x.b {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator(){

        public a a(Parcel parcel) {
            return new a(parcel, null);
        }

        public a[] b(int n8) {
            return new a[n8];
        }
    };
    public final String o;
    public final byte[] p;
    public final int q;
    public final int r;

    public a(Parcel parcel) {
        this.o = (String)M.i(parcel.readString());
        this.p = (byte[])M.i(parcel.createByteArray());
        this.q = parcel.readInt();
        this.r = parcel.readInt();
    }

    public /* synthetic */ a(Parcel parcel,  a8) {
        this(parcel);
    }

    public a(String string2, byte[] arrby, int n8, int n9) {
        this.o = string2;
        this.p = arrby;
        this.q = n8;
        this.r = n9;
    }

    @Override
    public /* synthetic */ void D(w.b b8) {
        y.c(this, b8);
    }

    @Override
    public /* synthetic */ byte[] M() {
        return y.a(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (a.class != object.getClass()) {
                return false;
            }
            object = (a)object;
            if (this.o.equals((Object)object.o) && Arrays.equals((byte[])this.p, (byte[])object.p) && this.q == object.q && this.r == object.r) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((527 + this.o.hashCode()) * 31 + Arrays.hashCode((byte[])this.p)) * 31 + this.q) * 31 + this.r;
    }

    @Override
    public /* synthetic */ q s() {
        return y.b(this);
    }

    public String toString() {
        int n8 = this.r;
        String string2 = n8 != 1 ? (n8 != 23 ? (n8 != 67 ? M.f1(this.p) : String.valueOf((int)f.g(this.p))) : String.valueOf((float)Float.intBitsToFloat((int)f.g(this.p)))) : M.H(this.p);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("mdta: key=");
        stringBuilder.append(this.o);
        stringBuilder.append(", value=");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeString(this.o);
        parcel.writeByteArray(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
    }

}

