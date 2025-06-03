// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T0;

import java.util.Arrays;
import g0.M;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class l extends i
{
    public static final Parcelable$Creator<l> CREATOR;
    public final int p;
    public final int q;
    public final int r;
    public final int[] s;
    public final int[] t;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public l a(final Parcel parcel) {
                return new l(parcel);
            }
            
            public l[] b(final int n) {
                return new l[n];
            }
        };
    }
    
    public l(final int p5, final int q, final int r, final int[] s, final int[] t) {
        super("MLLT");
        this.p = p5;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
    }
    
    public l(final Parcel parcel) {
        super("MLLT");
        this.p = parcel.readInt();
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.s = (int[])M.i(parcel.createIntArray());
        this.t = (int[])M.i(parcel.createIntArray());
    }
    
    @Override
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
        if (l.class != o.getClass()) {
            return false;
        }
        final l l = (l)o;
        return this.p == l.p && this.q == l.q && this.r == l.r && Arrays.equals(this.s, l.s) && Arrays.equals(this.t, l.t);
    }
    
    @Override
    public int hashCode() {
        return ((((527 + this.p) * 31 + this.q) * 31 + this.r) * 31 + Arrays.hashCode(this.s)) * 31 + Arrays.hashCode(this.t);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeIntArray(this.s);
        parcel.writeIntArray(this.t);
    }
}
