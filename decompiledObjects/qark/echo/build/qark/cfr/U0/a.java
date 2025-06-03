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

import a3.h;
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
            return new a(parcel, null);
        }

        public a[] b(int n8) {
            return new a[n8];
        }
    };
    public final long o;
    public final long p;
    public final long q;
    public final long r;
    public final long s;

    public a(long l8, long l9, long l10, long l11, long l12) {
        this.o = l8;
        this.p = l9;
        this.q = l10;
        this.r = l11;
        this.s = l12;
    }

    public a(Parcel parcel) {
        this.o = parcel.readLong();
        this.p = parcel.readLong();
        this.q = parcel.readLong();
        this.r = parcel.readLong();
        this.s = parcel.readLong();
    }

    public /* synthetic */ a(Parcel parcel,  a8) {
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
            if (a.class != object.getClass()) {
                return false;
            }
            object = (a)object;
            if (this.o == object.o && this.p == object.p && this.q == object.q && this.r == object.r && this.s == object.s) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + h.b(this.o)) * 31 + h.b(this.p)) * 31 + h.b(this.q)) * 31 + h.b(this.r)) * 31 + h.b(this.s);
    }

    @Override
    public /* synthetic */ q s() {
        return y.b(this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Motion photo metadata: photoStartPosition=");
        stringBuilder.append(this.o);
        stringBuilder.append(", photoSize=");
        stringBuilder.append(this.p);
        stringBuilder.append(", photoPresentationTimestampUs=");
        stringBuilder.append(this.q);
        stringBuilder.append(", videoStartPosition=");
        stringBuilder.append(this.r);
        stringBuilder.append(", videoSize=");
        stringBuilder.append(this.s);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeLong(this.o);
        parcel.writeLong(this.p);
        parcel.writeLong(this.q);
        parcel.writeLong(this.r);
        parcel.writeLong(this.s);
    }

}

