// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package U0;

import d0.q;
import a3.c;
import d0.y;
import d0.w;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import d0.x;

public final class d implements b
{
    public static final Parcelable$Creator<d> CREATOR;
    public final float o;
    public final int p;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public d a(final Parcel parcel) {
                return new d(parcel, null);
            }
            
            public d[] b(final int n) {
                return new d[n];
            }
        };
    }
    
    public d(final float o, final int p2) {
        this.o = o;
        this.p = p2;
    }
    
    public d(final Parcel parcel) {
        this.o = parcel.readFloat();
        this.p = parcel.readInt();
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
        if (d.class != o.getClass()) {
            return false;
        }
        final d d = (d)o;
        return this.o == d.o && this.p == d.p;
    }
    
    @Override
    public int hashCode() {
        return (527 + c.a(this.o)) * 31 + this.p;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("smta: captureFrameRate=");
        sb.append(this.o);
        sb.append(", svcTemporalLayerCount=");
        sb.append(this.p);
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeFloat(this.o);
        parcel.writeInt(this.p);
    }
}
