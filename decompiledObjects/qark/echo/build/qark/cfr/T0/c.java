/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
package T0;

import T0.i;
import android.os.Parcel;
import android.os.Parcelable;
import g0.M;
import java.util.Arrays;

public final class c
extends i {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator(){

        public c a(Parcel parcel) {
            return new c(parcel);
        }

        public c[] b(int n8) {
            return new c[n8];
        }
    };
    public final String p;
    public final int q;
    public final int r;
    public final long s;
    public final long t;
    public final i[] u;

    public c(Parcel parcel) {
        super("CHAP");
        this.p = (String)M.i(parcel.readString());
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.s = parcel.readLong();
        this.t = parcel.readLong();
        int n8 = parcel.readInt();
        this.u = new i[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            this.u[i8] = (i)parcel.readParcelable(i.class.getClassLoader());
        }
    }

    public c(String string2, int n8, int n9, long l8, long l9, i[] arri) {
        super("CHAP");
        this.p = string2;
        this.q = n8;
        this.r = n9;
        this.s = l8;
        this.t = l9;
        this.u = arri;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (c.class != object.getClass()) {
                return false;
            }
            object = (c)object;
            if (this.q == object.q && this.r == object.r && this.s == object.s && this.t == object.t && M.c(this.p, object.p) && Arrays.equals((Object[])this.u, (Object[])object.u)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.q;
        int n9 = this.r;
        int n10 = (int)this.s;
        int n11 = (int)this.t;
        String string2 = this.p;
        int n12 = string2 != null ? string2.hashCode() : 0;
        return ((((527 + n8) * 31 + n9) * 31 + n10) * 31 + n11) * 31 + n12;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeString(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeLong(this.s);
        parcel.writeLong(this.t);
        parcel.writeInt(this.u.length);
        i[] arri = this.u;
        int n9 = arri.length;
        for (n8 = 0; n8 < n9; ++n8) {
            parcel.writeParcelable((Parcelable)arri[n8], 0);
        }
    }

}

