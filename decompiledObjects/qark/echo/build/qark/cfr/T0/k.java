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
 */
package T0;

import T0.i;
import android.os.Parcel;
import android.os.Parcelable;
import g0.M;

public final class k
extends i {
    public static final Parcelable.Creator<k> CREATOR = new Parcelable.Creator(){

        public k a(Parcel parcel) {
            return new k(parcel);
        }

        public k[] b(int n8) {
            return new k[n8];
        }
    };
    public final String p;
    public final String q;
    public final String r;

    public k(Parcel parcel) {
        super("----");
        this.p = (String)M.i(parcel.readString());
        this.q = (String)M.i(parcel.readString());
        this.r = (String)M.i(parcel.readString());
    }

    public k(String string2, String string3, String string4) {
        super("----");
        this.p = string2;
        this.q = string3;
        this.r = string4;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (k.class != object.getClass()) {
                return false;
            }
            object = (k)object;
            if (M.c(this.q, object.q) && M.c(this.p, object.p) && M.c(this.r, object.r)) {
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
        return ((527 + n9) * 31 + n10) * 31 + n8;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.o);
        stringBuilder.append(": domain=");
        stringBuilder.append(this.p);
        stringBuilder.append(", description=");
        stringBuilder.append(this.q);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.r);
    }

}

