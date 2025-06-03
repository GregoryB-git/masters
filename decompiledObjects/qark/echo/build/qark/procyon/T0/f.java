// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T0;

import java.util.Arrays;
import g0.M;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class f extends i
{
    public static final Parcelable$Creator<f> CREATOR;
    public final String p;
    public final String q;
    public final String r;
    public final byte[] s;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public f a(final Parcel parcel) {
                return new f(parcel);
            }
            
            public f[] b(final int n) {
                return new f[n];
            }
        };
    }
    
    public f(final Parcel parcel) {
        super("GEOB");
        this.p = (String)M.i(parcel.readString());
        this.q = (String)M.i(parcel.readString());
        this.r = (String)M.i(parcel.readString());
        this.s = (byte[])M.i(parcel.createByteArray());
    }
    
    public f(final String p4, final String q, final String r, final byte[] s) {
        super("GEOB");
        this.p = p4;
        this.q = q;
        this.r = r;
        this.s = s;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (f.class != o.getClass()) {
            return false;
        }
        final f f = (f)o;
        return M.c(this.p, f.p) && M.c(this.q, f.q) && M.c(this.r, f.r) && Arrays.equals(this.s, f.s);
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
        return (((527 + hashCode2) * 31 + hashCode3) * 31 + hashCode) * 31 + Arrays.hashCode(this.s);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.o);
        sb.append(": mimeType=");
        sb.append(this.p);
        sb.append(", filename=");
        sb.append(this.q);
        sb.append(", description=");
        sb.append(this.r);
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeByteArray(this.s);
    }
}
