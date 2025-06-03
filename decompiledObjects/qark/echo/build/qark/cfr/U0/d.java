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
package U0;

import a3.c;
import android.os.Parcel;
import android.os.Parcelable;
import d0.q;
import d0.w;
import d0.x;
import d0.y;

public final class d
implements x.b {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator(){

        public d a(Parcel parcel) {
            return new d(parcel, null);
        }

        public d[] b(int n8) {
            return new d[n8];
        }
    };
    public final float o;
    public final int p;

    public d(float f8, int n8) {
        this.o = f8;
        this.p = n8;
    }

    public d(Parcel parcel) {
        this.o = parcel.readFloat();
        this.p = parcel.readInt();
    }

    public /* synthetic */ d(Parcel parcel,  a8) {
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
            if (d.class != object.getClass()) {
                return false;
            }
            object = (d)object;
            if (this.o == object.o && this.p == object.p) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (527 + c.a(this.o)) * 31 + this.p;
    }

    @Override
    public /* synthetic */ q s() {
        return y.b(this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("smta: captureFrameRate=");
        stringBuilder.append(this.o);
        stringBuilder.append(", svcTemporalLayerCount=");
        stringBuilder.append(this.p);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeFloat(this.o);
        parcel.writeInt(this.p);
    }

}

