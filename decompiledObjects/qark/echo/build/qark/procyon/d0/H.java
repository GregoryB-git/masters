// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d0;

import g0.M;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class H implements Comparable, Parcelable
{
    public static final Parcelable$Creator<H> CREATOR;
    public static final String r;
    public static final String s;
    public static final String t;
    public final int o;
    public final int p;
    public final int q;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public H a(final Parcel parcel) {
                return new H(parcel);
            }
            
            public H[] b(final int n) {
                return new H[n];
            }
        };
        r = M.w0(0);
        s = M.w0(1);
        t = M.w0(2);
    }
    
    public H(final int o, final int p3, final int q) {
        this.o = o;
        this.p = p3;
        this.q = q;
    }
    
    public H(final Parcel parcel) {
        this.o = parcel.readInt();
        this.p = parcel.readInt();
        this.q = parcel.readInt();
    }
    
    public int c(final H h) {
        int n;
        if ((n = this.o - h.o) == 0 && (n = this.p - h.p) == 0) {
            n = this.q - h.q;
        }
        return n;
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
        if (H.class != o.getClass()) {
            return false;
        }
        final H h = (H)o;
        return this.o == h.o && this.p == h.p && this.q == h.q;
    }
    
    @Override
    public int hashCode() {
        return (this.o * 31 + this.p) * 31 + this.q;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.o);
        sb.append(".");
        sb.append(this.p);
        sb.append(".");
        sb.append(this.q);
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
    }
}
