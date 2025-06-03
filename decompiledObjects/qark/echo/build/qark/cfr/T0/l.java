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

public final class l
extends i {
    public static final Parcelable.Creator<l> CREATOR = new Parcelable.Creator(){

        public l a(Parcel parcel) {
            return new l(parcel);
        }

        public l[] b(int n8) {
            return new l[n8];
        }
    };
    public final int p;
    public final int q;
    public final int r;
    public final int[] s;
    public final int[] t;

    public l(int n8, int n9, int n10, int[] arrn, int[] arrn2) {
        super("MLLT");
        this.p = n8;
        this.q = n9;
        this.r = n10;
        this.s = arrn;
        this.t = arrn2;
    }

    public l(Parcel parcel) {
        super("MLLT");
        this.p = parcel.readInt();
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.s = (int[])M.i(parcel.createIntArray());
        this.t = (int[])M.i(parcel.createIntArray());
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
            if (l.class != object.getClass()) {
                return false;
            }
            object = (l)object;
            if (this.p == object.p && this.q == object.q && this.r == object.r && Arrays.equals((int[])this.s, (int[])object.s) && Arrays.equals((int[])this.t, (int[])object.t)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.p) * 31 + this.q) * 31 + this.r) * 31 + Arrays.hashCode((int[])this.s)) * 31 + Arrays.hashCode((int[])this.t);
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeIntArray(this.s);
        parcel.writeIntArray(this.t);
    }

}

