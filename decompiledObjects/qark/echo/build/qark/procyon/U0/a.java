// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package U0;

import d0.q;
import a3.h;
import d0.y;
import d0.w;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import d0.x;

public final class a implements b
{
    public static final Parcelable$Creator<a> CREATOR;
    public final long o;
    public final long p;
    public final long q;
    public final long r;
    public final long s;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public a a(final Parcel parcel) {
                return new a(parcel, null);
            }
            
            public a[] b(final int n) {
                return new a[n];
            }
        };
    }
    
    public a(final long o, final long p5, final long q, final long r, final long s) {
        this.o = o;
        this.p = p5;
        this.q = q;
        this.r = r;
        this.s = s;
    }
    
    public a(final Parcel parcel) {
        this.o = parcel.readLong();
        this.p = parcel.readLong();
        this.q = parcel.readLong();
        this.r = parcel.readLong();
        this.s = parcel.readLong();
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
        return this.o == a.o && this.p == a.p && this.q == a.q && this.r == a.r && this.s == a.s;
    }
    
    @Override
    public int hashCode() {
        return ((((527 + h.b(this.o)) * 31 + h.b(this.p)) * 31 + h.b(this.q)) * 31 + h.b(this.r)) * 31 + h.b(this.s);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(this.o);
        sb.append(", photoSize=");
        sb.append(this.p);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(this.q);
        sb.append(", videoStartPosition=");
        sb.append(this.r);
        sb.append(", videoSize=");
        sb.append(this.s);
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.o);
        parcel.writeLong(this.p);
        parcel.writeLong(this.q);
        parcel.writeLong(this.r);
        parcel.writeLong(this.s);
    }
}
