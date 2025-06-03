// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S0;

import d0.q;
import java.util.Arrays;
import d0.y;
import d0.w;
import g0.a;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import d0.x;

public final class c implements b
{
    public static final Parcelable$Creator<c> CREATOR;
    public final byte[] o;
    public final String p;
    public final String q;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public c a(final Parcel parcel) {
                return new c(parcel);
            }
            
            public c[] b(final int n) {
                return new c[n];
            }
        };
    }
    
    public c(final Parcel parcel) {
        this.o = (byte[])a.e(parcel.createByteArray());
        this.p = parcel.readString();
        this.q = parcel.readString();
    }
    
    public c(final byte[] o, final String p3, final String q) {
        this.o = o;
        this.p = p3;
        this.q = q;
    }
    
    @Override
    public void D(final w.b b) {
        final String p = this.p;
        if (p != null) {
            b.n0(p);
        }
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && c.class == o.getClass() && Arrays.equals(this.o, ((c)o).o));
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(this.o);
    }
    
    @Override
    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.p, this.q, this.o.length);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeByteArray(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
    }
}
