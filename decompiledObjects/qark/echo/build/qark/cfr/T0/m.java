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

public final class m
extends i {
    public static final Parcelable.Creator<m> CREATOR = new Parcelable.Creator(){

        public m a(Parcel parcel) {
            return new m(parcel);
        }

        public m[] b(int n8) {
            return new m[n8];
        }
    };
    public final String p;
    public final byte[] q;

    public m(Parcel parcel) {
        super("PRIV");
        this.p = (String)M.i(parcel.readString());
        this.q = (byte[])M.i(parcel.createByteArray());
    }

    public m(String string2, byte[] arrby) {
        super("PRIV");
        this.p = string2;
        this.q = arrby;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (m.class != object.getClass()) {
                return false;
            }
            object = (m)object;
            if (M.c(this.p, object.p) && Arrays.equals((byte[])this.q, (byte[])object.q)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String string2 = this.p;
        int n8 = string2 != null ? string2.hashCode() : 0;
        return (527 + n8) * 31 + Arrays.hashCode((byte[])this.q);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.o);
        stringBuilder.append(": owner=");
        stringBuilder.append(this.p);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeString(this.p);
        parcel.writeByteArray(this.q);
    }

}

