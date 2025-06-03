// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T0;

import java.util.Arrays;
import g0.M;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class b extends i
{
    public static final Parcelable$Creator<b> CREATOR;
    public final byte[] p;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public b a(final Parcel parcel) {
                return new b(parcel);
            }
            
            public b[] b(final int n) {
                return new b[n];
            }
        };
    }
    
    public b(final Parcel parcel) {
        super((String)M.i(parcel.readString()));
        this.p = (byte[])M.i(parcel.createByteArray());
    }
    
    public b(final String s, final byte[] p2) {
        super(s);
        this.p = p2;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (b.class != o.getClass()) {
            return false;
        }
        final b b = (b)o;
        return super.o.equals(b.o) && Arrays.equals(this.p, b.p);
    }
    
    @Override
    public int hashCode() {
        return (527 + super.o.hashCode()) * 31 + Arrays.hashCode(this.p);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(super.o);
        parcel.writeByteArray(this.p);
    }
}
