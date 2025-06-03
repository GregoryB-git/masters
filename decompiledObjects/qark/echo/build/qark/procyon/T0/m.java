// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T0;

import java.util.Arrays;
import g0.M;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class m extends i
{
    public static final Parcelable$Creator<m> CREATOR;
    public final String p;
    public final byte[] q;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public m a(final Parcel parcel) {
                return new m(parcel);
            }
            
            public m[] b(final int n) {
                return new m[n];
            }
        };
    }
    
    public m(final Parcel parcel) {
        super("PRIV");
        this.p = (String)M.i(parcel.readString());
        this.q = (byte[])M.i(parcel.createByteArray());
    }
    
    public m(final String p2, final byte[] q) {
        super("PRIV");
        this.p = p2;
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
        if (m.class != o.getClass()) {
            return false;
        }
        final m m = (m)o;
        return M.c(this.p, m.p) && Arrays.equals(this.q, m.q);
    }
    
    @Override
    public int hashCode() {
        final String p = this.p;
        int hashCode;
        if (p != null) {
            hashCode = p.hashCode();
        }
        else {
            hashCode = 0;
        }
        return (527 + hashCode) * 31 + Arrays.hashCode(this.q);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.o);
        sb.append(": owner=");
        sb.append(this.p);
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.p);
        parcel.writeByteArray(this.q);
    }
}
