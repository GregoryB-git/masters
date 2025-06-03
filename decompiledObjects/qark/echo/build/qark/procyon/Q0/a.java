// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Q0;

import java.util.Arrays;
import d0.y;
import d0.w;
import g0.M;
import android.os.Parcel;
import d0.q;
import android.os.Parcelable$Creator;
import d0.x;

public final class a implements b
{
    public static final Parcelable$Creator<a> CREATOR;
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
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public a a(final Parcel parcel) {
                return new a(parcel);
            }
            
            public a[] b(final int n) {
                return new a[n];
            }
        };
    }
    
    public a(final Parcel parcel) {
        this.o = (String)M.i(parcel.readString());
        this.p = (String)M.i(parcel.readString());
        this.q = parcel.readLong();
        this.r = parcel.readLong();
        this.s = (byte[])M.i(parcel.createByteArray());
    }
    
    public a(final String o, final String p5, final long q, final long r, final byte[] s) {
        this.o = o;
        this.p = p5;
        this.q = q;
        this.r = r;
        this.s = s;
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
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (a.class != o.getClass()) {
            return false;
        }
        final a a = (a)o;
        return this.q == a.q && this.r == a.r && M.c(this.o, a.o) && M.c(this.p, a.p) && Arrays.equals(this.s, a.s);
    }
    
    @Override
    public int hashCode() {
        if (this.t == 0) {
            final String o = this.o;
            int hashCode = 0;
            int hashCode2;
            if (o != null) {
                hashCode2 = o.hashCode();
            }
            else {
                hashCode2 = 0;
            }
            final String p = this.p;
            if (p != null) {
                hashCode = p.hashCode();
            }
            final long q = this.q;
            final int n = (int)(q ^ q >>> 32);
            final long r = this.r;
            this.t = ((((527 + hashCode2) * 31 + hashCode) * 31 + n) * 31 + (int)(r ^ r >>> 32)) * 31 + Arrays.hashCode(this.s);
        }
        return this.t;
    }
    
    @Override
    public q s() {
        final String o = this.o;
        o.hashCode();
        final int hashCode = o.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1303648457: {
                if (!o.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    break;
                }
                n = 2;
                break;
            }
            case -795945609: {
                if (!o.equals("https://aomedia.org/emsg/ID3")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1468477611: {
                if (!o.equals("urn:scte:scte35:2014:bin")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                return null;
            }
            case 1:
            case 2: {
                return a.u;
            }
            case 0: {
                return a.v;
            }
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("EMSG: scheme=");
        sb.append(this.o);
        sb.append(", id=");
        sb.append(this.r);
        sb.append(", durationMs=");
        sb.append(this.q);
        sb.append(", value=");
        sb.append(this.p);
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeLong(this.q);
        parcel.writeLong(this.r);
        parcel.writeByteArray(this.s);
    }
}
