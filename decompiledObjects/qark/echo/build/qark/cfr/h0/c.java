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
package h0;

import a3.h;
import android.os.Parcel;
import android.os.Parcelable;
import d0.q;
import d0.w;
import d0.x;
import d0.y;

public final class c
implements x.b {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator(){

        public c a(Parcel parcel) {
            return new c(parcel, null);
        }

        public c[] b(int n8) {
            return new c[n8];
        }
    };
    public final long o;
    public final long p;
    public final long q;

    public c(long l8, long l9, long l10) {
        this.o = l8;
        this.p = l9;
        this.q = l10;
    }

    public c(Parcel parcel) {
        this.o = parcel.readLong();
        this.p = parcel.readLong();
        this.q = parcel.readLong();
    }

    public /* synthetic */ c(Parcel parcel,  a8) {
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
        if (!(object instanceof c)) {
            return false;
        }
        object = (c)object;
        if (this.o == object.o && this.p == object.p && this.q == object.q) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + h.b(this.o)) * 31 + h.b(this.p)) * 31 + h.b(this.q);
    }

    @Override
    public /* synthetic */ q s() {
        return y.b(this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Mp4Timestamp: creation time=");
        stringBuilder.append(this.o);
        stringBuilder.append(", modification time=");
        stringBuilder.append(this.p);
        stringBuilder.append(", timescale=");
        stringBuilder.append(this.q);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeLong(this.o);
        parcel.writeLong(this.p);
        parcel.writeLong(this.q);
    }

}

