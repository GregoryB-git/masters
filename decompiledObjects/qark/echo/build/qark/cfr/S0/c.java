/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
package S0;

import android.os.Parcel;
import android.os.Parcelable;
import d0.q;
import d0.w;
import d0.x;
import d0.y;
import g0.a;
import java.util.Arrays;

public final class c
implements x.b {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator(){

        public c a(Parcel parcel) {
            return new c(parcel);
        }

        public c[] b(int n8) {
            return new c[n8];
        }
    };
    public final byte[] o;
    public final String p;
    public final String q;

    public c(Parcel parcel) {
        this.o = (byte[])a.e(parcel.createByteArray());
        this.p = parcel.readString();
        this.q = parcel.readString();
    }

    public c(byte[] arrby, String string2, String string3) {
        this.o = arrby;
        this.p = string2;
        this.q = string3;
    }

    @Override
    public void D(w.b b8) {
        String string2 = this.p;
        if (string2 != null) {
            b8.n0(string2);
        }
    }

    @Override
    public /* synthetic */ byte[] M() {
        return y.a(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && c.class == object.getClass()) {
            object = (c)object;
            return Arrays.equals((byte[])this.o, (byte[])object.o);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode((byte[])this.o);
    }

    @Override
    public /* synthetic */ q s() {
        return y.b(this);
    }

    public String toString() {
        return String.format((String)"ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", (Object[])new Object[]{this.p, this.q, this.o.length});
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeByteArray(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
    }

}

