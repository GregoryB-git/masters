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
package V0;

import V0.b;
import android.os.Parcel;
import android.os.Parcelable;
import g0.E;
import g0.z;

public final class g
extends b {
    public static final Parcelable.Creator<g> CREATOR = new Parcelable.Creator(){

        public g a(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), null);
        }

        public g[] b(int n8) {
            return new g[n8];
        }
    };
    public final long o;
    public final long p;

    public g(long l8, long l9) {
        this.o = l8;
        this.p = l9;
    }

    public /* synthetic */ g(long l8, long l9,  a8) {
        this(l8, l9);
    }

    public static g a(z z8, long l8, E e8) {
        l8 = g.b(z8, l8);
        return new g(l8, e8.b(l8));
    }

    public static long b(z z8, long l8) {
        long l9 = z8.G();
        if ((128L & l9) != 0L) {
            return 0x1FFFFFFFFL & ((l9 & 1L) << 32 | z8.I()) + l8;
        }
        return -9223372036854775807L;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SCTE-35 TimeSignalCommand { ptsTime=");
        stringBuilder.append(this.o);
        stringBuilder.append(", playbackPositionUs= ");
        stringBuilder.append(this.p);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeLong(this.o);
        parcel.writeLong(this.p);
    }

}

