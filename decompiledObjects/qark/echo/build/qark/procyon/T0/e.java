// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T0;

import g0.M;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class e extends i
{
    public static final Parcelable$Creator<e> CREATOR;
    public final String p;
    public final String q;
    public final String r;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public e a(final Parcel parcel) {
                return new e(parcel);
            }
            
            public e[] b(final int n) {
                return new e[n];
            }
        };
    }
    
    public e(final Parcel parcel) {
        super("COMM");
        this.p = (String)M.i(parcel.readString());
        this.q = (String)M.i(parcel.readString());
        this.r = (String)M.i(parcel.readString());
    }
    
    public e(final String p3, final String q, final String r) {
        super("COMM");
        this.p = p3;
        this.q = q;
        this.r = r;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (e.class != o.getClass()) {
            return false;
        }
        final e e = (e)o;
        return M.c(this.q, e.q) && M.c(this.p, e.p) && M.c(this.r, e.r);
    }
    
    @Override
    public int hashCode() {
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
        int hashCode3;
        if (q != null) {
            hashCode3 = q.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String r = this.r;
        if (r != null) {
            hashCode = r.hashCode();
        }
        return ((527 + hashCode2) * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.o);
        sb.append(": language=");
        sb.append(this.p);
        sb.append(", description=");
        sb.append(this.q);
        sb.append(", text=");
        sb.append(this.r);
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(super.o);
        parcel.writeString(this.p);
        parcel.writeString(this.r);
    }
}
