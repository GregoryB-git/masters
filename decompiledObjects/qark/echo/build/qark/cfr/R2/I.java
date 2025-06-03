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
package R2;

import A2.n;
import B2.a;
import B2.c;
import R2.D;
import R2.H;
import android.os.Parcel;
import android.os.Parcelable;

public final class I
extends a {
    public static final Parcelable.Creator<I> CREATOR = new H();
    public final String o;
    public final D p;
    public final String q;
    public final long r;

    public I(I i8, long l8) {
        n.i(i8);
        this.o = i8.o;
        this.p = i8.p;
        this.q = i8.q;
        this.r = l8;
    }

    public I(String string2, D d8, String string3, long l8) {
        this.o = string2;
        this.p = d8;
        this.q = string3;
        this.r = l8;
    }

    public final String toString() {
        String string2 = this.q;
        String string3 = this.o;
        String string4 = String.valueOf((Object)this.p);
        StringBuilder stringBuilder = new StringBuilder("origin=");
        stringBuilder.append(string2);
        stringBuilder.append(",name=");
        stringBuilder.append(string3);
        stringBuilder.append(",params=");
        stringBuilder.append(string4);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        int n9 = c.a(parcel);
        c.n(parcel, 2, this.o, false);
        c.m(parcel, 3, this.p, n8, false);
        c.n(parcel, 4, this.q, false);
        c.k(parcel, 5, this.r);
        c.b(parcel, n9);
    }
}

