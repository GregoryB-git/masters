// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V0;

import g0.z;
import g0.M;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class a extends b
{
    public static final Parcelable$Creator<a> CREATOR;
    public final long o;
    public final long p;
    public final byte[] q;
    
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
    
    public a(final long p3, final byte[] q, final long o) {
        this.o = o;
        this.p = p3;
        this.q = q;
    }
    
    public a(final Parcel parcel) {
        this.o = parcel.readLong();
        this.p = parcel.readLong();
        this.q = (byte[])M.i(parcel.createByteArray());
    }
    
    public static a a(final z z, int n, final long n2) {
        final long i = z.I();
        n -= 4;
        final byte[] array = new byte[n];
        z.l(array, 0, n);
        return new a(i, array, n2);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.o);
        sb.append(", identifier= ");
        sb.append(this.p);
        sb.append(" }");
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.o);
        parcel.writeLong(this.p);
        parcel.writeByteArray(this.q);
    }
}
