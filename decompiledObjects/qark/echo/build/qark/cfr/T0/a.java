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
 *  java.util.Arrays
 */
package T0;

import T0.i;
import android.os.Parcel;
import android.os.Parcelable;
import d0.w;
import g0.M;
import java.util.Arrays;

public final class a
extends i {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator(){

        public a a(Parcel parcel) {
            return new a(parcel);
        }

        public a[] b(int n8) {
            return new a[n8];
        }
    };
    public final String p;
    public final String q;
    public final int r;
    public final byte[] s;

    public a(Parcel parcel) {
        super("APIC");
        this.p = (String)M.i(parcel.readString());
        this.q = parcel.readString();
        this.r = parcel.readInt();
        this.s = (byte[])M.i(parcel.createByteArray());
    }

    public a(String string2, String string3, int n8, byte[] arrby) {
        super("APIC");
        this.p = string2;
        this.q = string3;
        this.r = n8;
        this.s = arrby;
    }

    @Override
    public void D(w.b b8) {
        b8.J(this.s, this.r);
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
            if (this.r == object.r && M.c(this.p, object.p) && M.c(this.q, object.q) && Arrays.equals((byte[])this.s, (byte[])object.s)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.r;
        String string2 = this.p;
        int n9 = 0;
        int n10 = string2 != null ? string2.hashCode() : 0;
        string2 = this.q;
        if (string2 != null) {
            n9 = string2.hashCode();
        }
        return (((527 + n8) * 31 + n10) * 31 + n9) * 31 + Arrays.hashCode((byte[])this.s);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.o);
        stringBuilder.append(": mimeType=");
        stringBuilder.append(this.p);
        stringBuilder.append(", description=");
        stringBuilder.append(this.q);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeInt(this.r);
        parcel.writeByteArray(this.s);
    }

}

