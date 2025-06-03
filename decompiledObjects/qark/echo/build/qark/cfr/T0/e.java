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

public final class e
extends i {
    public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator(){

        public e a(Parcel parcel) {
            return new e(parcel);
        }

        public e[] b(int n8) {
            return new e[n8];
        }
    };
    public final String p;
    public final String q;
    public final String r;

    public e(Parcel parcel) {
        super("COMM");
        this.p = (String)M.i(parcel.readString());
        this.q = (String)M.i(parcel.readString());
        this.r = (String)M.i(parcel.readString());
    }

    public e(String string2, String string3, String string4) {
        super("COMM");
        this.p = string2;
        this.q = string3;
        this.r = string4;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (e.class != object.getClass()) {
                return false;
            }
            object = (e)object;
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
        stringBuilder.append(": language=");
        stringBuilder.append(this.p);
        stringBuilder.append(", description=");
        stringBuilder.append(this.q);
        stringBuilder.append(", text=");
        stringBuilder.append(this.r);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.r);
    }

}

