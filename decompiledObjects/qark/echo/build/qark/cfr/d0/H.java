/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Class
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d0;

import android.os.Parcel;
import android.os.Parcelable;
import g0.M;

public final class H
implements Comparable,
Parcelable {
    public static final Parcelable.Creator<H> CREATOR = new Parcelable.Creator(){

        public H a(Parcel parcel) {
            return new H(parcel);
        }

        public H[] b(int n8) {
            return new H[n8];
        }
    };
    public static final String r = M.w0(0);
    public static final String s = M.w0(1);
    public static final String t = M.w0(2);
    public final int o;
    public final int p;
    public final int q;

    public H(int n8, int n9, int n10) {
        this.o = n8;
        this.p = n9;
        this.q = n10;
    }

    public H(Parcel parcel) {
        this.o = parcel.readInt();
        this.p = parcel.readInt();
        this.q = parcel.readInt();
    }

    public int c(H h8) {
        int n8;
        int n9 = n8 = this.o - h8.o;
        if (n8 == 0) {
            n9 = n8 = this.p - h8.p;
            if (n8 == 0) {
                n9 = this.q - h8.q;
            }
        }
        return n9;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (H.class != object.getClass()) {
                return false;
            }
            object = (H)object;
            if (this.o == object.o && this.p == object.p && this.q == object.q) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (this.o * 31 + this.p) * 31 + this.q;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.o);
        stringBuilder.append(".");
        stringBuilder.append(this.p);
        stringBuilder.append(".");
        stringBuilder.append(this.q);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
    }

}

