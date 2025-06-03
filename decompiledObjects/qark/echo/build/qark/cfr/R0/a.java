/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.charset.Charset
 *  java.util.Arrays
 */
package R0;

import W2.e;
import android.os.Parcel;
import android.os.Parcelable;
import d0.q;
import d0.w;
import d0.x;
import d0.y;
import d0.z;
import g0.M;
import java.nio.charset.Charset;
import java.util.Arrays;

public final class a
implements x.b {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator(){

        public a a(Parcel parcel) {
            return new a(parcel);
        }

        public a[] b(int n8) {
            return new a[n8];
        }
    };
    public final int o;
    public final String p;
    public final String q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final byte[] v;

    public a(int n8, String string2, String string3, int n9, int n10, int n11, int n12, byte[] arrby) {
        this.o = n8;
        this.p = string2;
        this.q = string3;
        this.r = n9;
        this.s = n10;
        this.t = n11;
        this.u = n12;
        this.v = arrby;
    }

    public a(Parcel parcel) {
        this.o = parcel.readInt();
        this.p = (String)M.i(parcel.readString());
        this.q = (String)M.i(parcel.readString());
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = (byte[])M.i(parcel.createByteArray());
    }

    public static a a(g0.z z8) {
        int n8 = z8.p();
        String string2 = z.t(z8.E(z8.p(), e.a));
        String string3 = z8.D(z8.p());
        int n9 = z8.p();
        int n10 = z8.p();
        int n11 = z8.p();
        int n12 = z8.p();
        int n13 = z8.p();
        byte[] arrby = new byte[n13];
        z8.l(arrby, 0, n13);
        return new a(n8, string2, string3, n9, n10, n11, n12, arrby);
    }

    @Override
    public void D(w.b b8) {
        b8.J(this.v, this.o);
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
            if (this.o == object.o && this.p.equals((Object)object.p) && this.q.equals((Object)object.q) && this.r == object.r && this.s == object.s && this.t == object.t && this.u == object.u && Arrays.equals((byte[])this.v, (byte[])object.v)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((((((527 + this.o) * 31 + this.p.hashCode()) * 31 + this.q.hashCode()) * 31 + this.r) * 31 + this.s) * 31 + this.t) * 31 + this.u) * 31 + Arrays.hashCode((byte[])this.v);
    }

    @Override
    public /* synthetic */ q s() {
        return y.b(this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Picture: mimeType=");
        stringBuilder.append(this.p);
        stringBuilder.append(", description=");
        stringBuilder.append(this.q);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeInt(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeByteArray(this.v);
    }

}

