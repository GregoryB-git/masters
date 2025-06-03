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

public final class o
extends i {
    public static final Parcelable.Creator<o> CREATOR = new Parcelable.Creator(){

        public o a(Parcel parcel) {
            return new o(parcel);
        }

        public o[] b(int n8) {
            return new o[n8];
        }
    };
    public final String p;
    public final String q;

    public o(Parcel parcel) {
        super((String)M.i(parcel.readString()));
        this.p = parcel.readString();
        this.q = (String)M.i(parcel.readString());
    }

    public o(String string2, String string3, String string4) {
        super(string2);
        this.p = string3;
        this.q = string4;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (o.class != object.getClass()) {
                return false;
            }
            object = (o)object;
            if (this.o.equals((Object)object.o) && M.c(this.p, object.p) && M.c(this.q, object.q)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.o.hashCode();
        String string2 = this.p;
        int n9 = 0;
        int n10 = string2 != null ? string2.hashCode() : 0;
        string2 = this.q;
        if (string2 != null) {
            n9 = string2.hashCode();
        }
        return ((527 + n8) * 31 + n10) * 31 + n9;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.o);
        stringBuilder.append(": url=");
        stringBuilder.append(this.q);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
    }

}

