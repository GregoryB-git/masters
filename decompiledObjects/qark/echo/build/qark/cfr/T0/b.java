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
 *  java.util.Arrays
 */
package T0;

import T0.i;
import android.os.Parcel;
import android.os.Parcelable;
import g0.M;
import java.util.Arrays;

public final class b
extends i {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator(){

        public b a(Parcel parcel) {
            return new b(parcel);
        }

        public b[] b(int n8) {
            return new b[n8];
        }
    };
    public final byte[] p;

    public b(Parcel parcel) {
        super((String)M.i(parcel.readString()));
        this.p = (byte[])M.i(parcel.createByteArray());
    }

    public b(String string2, byte[] arrby) {
        super(string2);
        this.p = arrby;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (b.class != object.getClass()) {
                return false;
            }
            object = (b)object;
            if (this.o.equals((Object)object.o) && Arrays.equals((byte[])this.p, (byte[])object.p)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (527 + this.o.hashCode()) * 31 + Arrays.hashCode((byte[])this.p);
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeString(this.o);
        parcel.writeByteArray(this.p);
    }

}

