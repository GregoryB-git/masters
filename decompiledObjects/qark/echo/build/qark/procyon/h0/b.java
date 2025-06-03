// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package h0;

import d0.q;
import a3.c;
import d0.y;
import d0.w;
import g0.a;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import d0.x;

public final class b implements x.b
{
    public static final Parcelable$Creator<b> CREATOR;
    public final float o;
    public final float p;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public b a(final Parcel parcel) {
                return new b(parcel, null);
            }
            
            public b[] b(final int n) {
                return new b[n];
            }
        };
    }
    
    public b(final float o, final float p2) {
        a.b(o >= -90.0f && o <= 90.0f && p2 >= -180.0f && p2 <= 180.0f, "Invalid latitude or longitude");
        this.o = o;
        this.p = p2;
    }
    
    public b(final Parcel parcel) {
        this.o = parcel.readFloat();
        this.p = parcel.readFloat();
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
        if (b.class != o.getClass()) {
            return false;
        }
        final b b = (b)o;
        return this.o == b.o && this.p == b.p;
    }
    
    @Override
    public int hashCode() {
        return (527 + c.a(this.o)) * 31 + c.a(this.p);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("xyz: latitude=");
        sb.append(this.o);
        sb.append(", longitude=");
        sb.append(this.p);
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeFloat(this.o);
        parcel.writeFloat(this.p);
    }
}
