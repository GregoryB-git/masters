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
package h0;

import a3.c;
import android.os.Parcel;
import android.os.Parcelable;
import d0.q;
import d0.w;
import d0.x;
import d0.y;
import g0.a;

public final class b
implements x.b {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator(){

        public b a(Parcel parcel) {
            return new b(parcel, null);
        }

        public b[] b(int n8) {
            return new b[n8];
        }
    };
    public final float o;
    public final float p;

    public b(float f8, float f9) {
        boolean bl = f8 >= -90.0f && f8 <= 90.0f && f9 >= -180.0f && f9 <= 180.0f;
        a.b(bl, "Invalid latitude or longitude");
        this.o = f8;
        this.p = f9;
    }

    public b(Parcel parcel) {
        this.o = parcel.readFloat();
        this.p = parcel.readFloat();
    }

    public /* synthetic */ b(Parcel parcel,  a8) {
        this(parcel);
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

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (b.class != object.getClass()) {
                return false;
            }
            object = (b)object;
            if (this.o == object.o && this.p == object.p) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (527 + c.a(this.o)) * 31 + c.a(this.p);
    }

    @Override
    public /* synthetic */ q s() {
        return y.b(this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("xyz: latitude=");
        stringBuilder.append(this.o);
        stringBuilder.append(", longitude=");
        stringBuilder.append(this.p);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeFloat(this.o);
        parcel.writeFloat(this.p);
    }

}

