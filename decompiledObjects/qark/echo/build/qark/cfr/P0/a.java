/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package P0;

import android.os.Parcel;
import android.os.Parcelable;
import d0.q;
import d0.w;
import d0.x;
import d0.y;

public final class a
implements x.b {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator(){

        public a a(Parcel parcel) {
            String string2 = (String)g0.a.e(parcel.readString());
            return new a(parcel.readInt(), string2);
        }

        public a[] b(int n8) {
            return new a[n8];
        }
    };
    public final int o;
    public final String p;

    public a(int n8, String string2) {
        this.o = n8;
        this.p = string2;
    }

    @Override
    public /* synthetic */ void D(w.b b8) {
        y.c(this, b8);
    }

    @Override
    public /* synthetic */ byte[] M() {
        return y.a(this);
    }

    public int describeContents() {
        return 0;
    }

    @Override
    public /* synthetic */ q s() {
        return y.b(this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ait(controlCode=");
        stringBuilder.append(this.o);
        stringBuilder.append(",url=");
        stringBuilder.append(this.p);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeString(this.p);
        parcel.writeInt(this.o);
    }

}

