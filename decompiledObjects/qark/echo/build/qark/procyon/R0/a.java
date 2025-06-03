// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R0;

import d0.q;
import java.util.Arrays;
import d0.y;
import d0.w;
import W2.e;
import g0.z;
import g0.M;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import d0.x;

public final class a implements b
{
    public static final Parcelable$Creator<a> CREATOR;
    public final int o;
    public final String p;
    public final String q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final byte[] v;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public a a(final Parcel parcel) {
                return new a(parcel);
            }
            
            public a[] b(final int n) {
                return new a[n];
            }
        };
    }
    
    public a(final int o, final String p8, final String q, final int r, final int s, final int t, final int u, final byte[] v) {
        this.o = o;
        this.p = p8;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
    }
    
    public a(final Parcel parcel) {
        this.o = parcel.readInt();
        this.p = (String)M.i(parcel.readString());
        this.q = (String)M.i(parcel.readString());
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = (byte[])M.i(parcel.createByteArray());
    }
    
    public static a a(final z z) {
        final int p = z.p();
        final String t = d0.z.t(z.E(z.p(), e.a));
        final String d = z.D(z.p());
        final int p2 = z.p();
        final int p3 = z.p();
        final int p4 = z.p();
        final int p5 = z.p();
        final int p6 = z.p();
        final byte[] array = new byte[p6];
        z.l(array, 0, p6);
        return new a(p, t, d, p2, p3, p4, p5, array);
    }
    
    @Override
    public void D(final w.b b) {
        b.J(this.v, this.o);
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
        return this.o == a.o && this.p.equals(a.p) && this.q.equals(a.q) && this.r == a.r && this.s == a.s && this.t == a.t && this.u == a.u && Arrays.equals(this.v, a.v);
    }
    
    @Override
    public int hashCode() {
        return (((((((527 + this.o) * 31 + this.p.hashCode()) * 31 + this.q.hashCode()) * 31 + this.r) * 31 + this.s) * 31 + this.t) * 31 + this.u) * 31 + Arrays.hashCode(this.v);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Picture: mimeType=");
        sb.append(this.p);
        sb.append(", description=");
        sb.append(this.q);
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeByteArray(this.v);
    }
}
