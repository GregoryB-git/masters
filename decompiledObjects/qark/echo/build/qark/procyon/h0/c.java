// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package h0;

import d0.q;
import a3.h;
import d0.y;
import d0.w;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import d0.x;

public final class c implements b
{
    public static final Parcelable$Creator<c> CREATOR;
    public final long o;
    public final long p;
    public final long q;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public c a(final Parcel parcel) {
                return new c(parcel, null);
            }
            
            public c[] b(final int n) {
                return new c[n];
            }
        };
    }
    
    public c(final long o, final long p3, final long q) {
        this.o = o;
        this.p = p3;
        this.q = q;
    }
    
    public c(final Parcel parcel) {
        this.o = parcel.readLong();
        this.p = parcel.readLong();
        this.q = parcel.readLong();
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        return this.o == c.o && this.p == c.p && this.q == c.q;
    }
    
    @Override
    public int hashCode() {
        return ((527 + h.b(this.o)) * 31 + h.b(this.p)) * 31 + h.b(this.q);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Mp4Timestamp: creation time=");
        sb.append(this.o);
        sb.append(", modification time=");
        sb.append(this.p);
        sb.append(", timescale=");
        sb.append(this.q);
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.o);
        parcel.writeLong(this.p);
        parcel.writeLong(this.q);
    }
}
