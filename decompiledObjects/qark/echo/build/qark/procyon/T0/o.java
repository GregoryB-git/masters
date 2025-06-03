// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T0;

import g0.M;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class o extends i
{
    public static final Parcelable$Creator<o> CREATOR;
    public final String p;
    public final String q;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public o a(final Parcel parcel) {
                return new o(parcel);
            }
            
            public o[] b(final int n) {
                return new o[n];
            }
        };
    }
    
    public o(final Parcel parcel) {
        super((String)M.i(parcel.readString()));
        this.p = parcel.readString();
        this.q = (String)M.i(parcel.readString());
    }
    
    public o(final String s, final String p3, final String q) {
        super(s);
        this.p = p3;
        this.q = q;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o.class != o.getClass()) {
            return false;
        }
        final o o2 = (o)o;
        return super.o.equals(o2.o) && M.c(this.p, o2.p) && M.c(this.q, o2.q);
    }
    
    @Override
    public int hashCode() {
        final int hashCode = super.o.hashCode();
        final String p = this.p;
        int hashCode2 = 0;
        int hashCode3;
        if (p != null) {
            hashCode3 = p.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String q = this.q;
        if (q != null) {
            hashCode2 = q.hashCode();
        }
        return ((527 + hashCode) * 31 + hashCode3) * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.o);
        sb.append(": url=");
        sb.append(this.q);
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(super.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
    }
}
