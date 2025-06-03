// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T0;

import java.util.Arrays;
import d0.w;
import g0.M;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class a extends i
{
    public static final Parcelable$Creator<a> CREATOR;
    public final String p;
    public final String q;
    public final int r;
    public final byte[] s;
    
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
    
    public a(final Parcel parcel) {
        super("APIC");
        this.p = (String)M.i(parcel.readString());
        this.q = parcel.readString();
        this.r = parcel.readInt();
        this.s = (byte[])M.i(parcel.createByteArray());
    }
    
    public a(final String p4, final String q, final int r, final byte[] s) {
        super("APIC");
        this.p = p4;
        this.q = q;
        this.r = r;
        this.s = s;
    }
    
    @Override
    public void D(final w.b b) {
        b.J(this.s, this.r);
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
        return this.r == a.r && M.c(this.p, a.p) && M.c(this.q, a.q) && Arrays.equals(this.s, a.s);
    }
    
    @Override
    public int hashCode() {
        final int r = this.r;
        final String p = this.p;
        int hashCode = 0;
        int hashCode2;
        if (p != null) {
            hashCode2 = p.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String q = this.q;
        if (q != null) {
            hashCode = q.hashCode();
        }
        return (((527 + r) * 31 + hashCode2) * 31 + hashCode) * 31 + Arrays.hashCode(this.s);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.o);
        sb.append(": mimeType=");
        sb.append(this.p);
        sb.append(", description=");
        sb.append(this.q);
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeInt(this.r);
        parcel.writeByteArray(this.s);
    }
}
