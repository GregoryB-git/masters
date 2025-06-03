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
import g0.M;
import java.util.Arrays;

public final class f
extends i {
    public static final Parcelable.Creator<f> CREATOR = new Parcelable.Creator(){

        public f a(Parcel parcel) {
            return new f(parcel);
        }

        public f[] b(int n8) {
            return new f[n8];
        }
    };
    public final String p;
    public final String q;
    public final String r;
    public final byte[] s;

    public f(Parcel parcel) {
        super("GEOB");
        this.p = (String)M.i(parcel.readString());
        this.q = (String)M.i(parcel.readString());
        this.r = (String)M.i(parcel.readString());
        this.s = (byte[])M.i(parcel.createByteArray());
    }

    public f(String string2, String string3, String string4, byte[] arrby) {
        super("GEOB");
        this.p = string2;
        this.q = string3;
        this.r = string4;
        this.s = arrby;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (f.class != object.getClass()) {
                return false;
            }
            object = (f)object;
            if (M.c(this.p, object.p) && M.c(this.q, object.q) && M.c(this.r, object.r) && Arrays.equals((byte[])this.s, (byte[])object.s)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String string2 = this.p;
        int n8 = 0;
        int n9 = string2 != null ? string2.hashCode() : 0;
        string2 = this.q;
        int n10 = string2 != null ? string2.hashCode() : 0;
        string2 = this.r;
        if (string2 != null) {
            n8 = string2.hashCode();
        }
        return (((527 + n9) * 31 + n10) * 31 + n8) * 31 + Arrays.hashCode((byte[])this.s);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.o);
        stringBuilder.append(": mimeType=");
        stringBuilder.append(this.p);
        stringBuilder.append(", filename=");
        stringBuilder.append(this.q);
        stringBuilder.append(", description=");
        stringBuilder.append(this.r);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeByteArray(this.s);
    }

}

