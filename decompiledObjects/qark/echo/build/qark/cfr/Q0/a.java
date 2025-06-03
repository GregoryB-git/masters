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
 *  java.util.Arrays
 */
package Q0;

import android.os.Parcel;
import android.os.Parcelable;
import d0.q;
import d0.w;
import d0.x;
import d0.y;
import g0.M;
import java.util.Arrays;

public final class a
implements x.b {
    public static final Parcelable.Creator<a> CREATOR;
    public static final q u;
    public static final q v;
    public final String o;
    public final String p;
    public final long q;
    public final long r;
    public final byte[] s;
    public int t;

    static {
        u = new q.b().o0("application/id3").K();
        v = new q.b().o0("application/x-scte35").K();
        CREATOR = new Parcelable.Creator(){

            public a a(Parcel parcel) {
                return new a(parcel);
            }

            public a[] b(int n8) {
                return new a[n8];
            }
        };
    }

    public a(Parcel parcel) {
        this.o = (String)M.i(parcel.readString());
        this.p = (String)M.i(parcel.readString());
        this.q = parcel.readLong();
        this.r = parcel.readLong();
        this.s = (byte[])M.i(parcel.createByteArray());
    }

    public a(String string2, String string3, long l8, long l9, byte[] arrby) {
        this.o = string2;
        this.p = string3;
        this.q = l8;
        this.r = l9;
        this.s = arrby;
    }

    @Override
    public /* synthetic */ void D(w.b b8) {
        y.c(this, b8);
    }

    @Override
    public byte[] M() {
        if (this.s() != null) {
            return this.s;
        }
        return null;
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
            if (this.q == object.q && this.r == object.r && M.c(this.o, object.o) && M.c(this.p, object.p) && Arrays.equals((byte[])this.s, (byte[])object.s)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        if (this.t == 0) {
            String string2 = this.o;
            int n8 = 0;
            int n9 = string2 != null ? string2.hashCode() : 0;
            string2 = this.p;
            if (string2 != null) {
                n8 = string2.hashCode();
            }
            long l8 = this.q;
            int n10 = (int)(l8 ^ l8 >>> 32);
            l8 = this.r;
            this.t = ((((527 + n9) * 31 + n8) * 31 + n10) * 31 + (int)(l8 ^ l8 >>> 32)) * 31 + Arrays.hashCode((byte[])this.s);
        }
        return this.t;
    }

    @Override
    public q s() {
        String string2 = this.o;
        string2.hashCode();
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 1303648457: {
                if (!string2.equals((Object)"https://developer.apple.com/streaming/emsg-id3")) break;
                n9 = 2;
                break;
            }
            case -795945609: {
                if (!string2.equals((Object)"https://aomedia.org/emsg/ID3")) break;
                n9 = 1;
                break;
            }
            case -1468477611: {
                if (!string2.equals((Object)"urn:scte:scte35:2014:bin")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                return null;
            }
            case 1: 
            case 2: {
                return u;
            }
            case 0: 
        }
        return v;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EMSG: scheme=");
        stringBuilder.append(this.o);
        stringBuilder.append(", id=");
        stringBuilder.append(this.r);
        stringBuilder.append(", durationMs=");
        stringBuilder.append(this.q);
        stringBuilder.append(", value=");
        stringBuilder.append(this.p);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeLong(this.q);
        parcel.writeLong(this.r);
        parcel.writeByteArray(this.s);
    }

}

