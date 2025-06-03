// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V0;

import g0.E;
import g0.z;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class g extends b
{
    public static final Parcelable$Creator<g> CREATOR;
    public final long o;
    public final long p;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public g a(final Parcel parcel) {
                return new g(parcel.readLong(), parcel.readLong(), null);
            }
            
            public g[] b(final int n) {
                return new g[n];
            }
        };
    }
    
    public g(final long o, final long p2) {
        this.o = o;
        this.p = p2;
    }
    
    public static g a(final z z, long b, final E e) {
        b = b(z, b);
        return new g(b, e.b(b));
    }
    
    public static long b(final z z, final long n) {
        final long n2 = z.G();
        if ((0x80L & n2) != 0x0L) {
            return 0x1FFFFFFFFL & ((n2 & 0x1L) << 32 | z.I()) + n;
        }
        return -9223372036854775807L;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.o);
        sb.append(", playbackPositionUs= ");
        sb.append(this.p);
        sb.append(" }");
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.o);
        parcel.writeLong(this.p);
    }
}
