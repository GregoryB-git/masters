// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d0;

import a3.h;
import java.util.Arrays;
import g0.M;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class x implements Parcelable
{
    public static final Parcelable$Creator<x> CREATOR;
    public final b[] o;
    public final long p;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public x a(final Parcel parcel) {
                return new x(parcel);
            }
            
            public x[] b(final int n) {
                return new x[n];
            }
        };
    }
    
    public x(final long n, final List list) {
        this(n, (b[])list.toArray(new b[0]));
    }
    
    public x(final long p2, final b... o) {
        this.p = p2;
        this.o = o;
    }
    
    public x(final Parcel parcel) {
        this.o = new b[parcel.readInt()];
        int n = 0;
        while (true) {
            final b[] o = this.o;
            if (n >= o.length) {
                break;
            }
            o[n] = (b)parcel.readParcelable(b.class.getClassLoader());
            ++n;
        }
        this.p = parcel.readLong();
    }
    
    public x(final List list) {
        this((b[])list.toArray(new b[0]));
    }
    
    public x(final b... array) {
        this(-9223372036854775807L, array);
    }
    
    public x a(final b... array) {
        if (array.length == 0) {
            return this;
        }
        return new x(this.p, (b[])M.N0(this.o, array));
    }
    
    public x b(final x x) {
        if (x == null) {
            return this;
        }
        return this.a(x.o);
    }
    
    public x c(final long n) {
        if (this.p == n) {
            return this;
        }
        return new x(n, this.o);
    }
    
    public b d(final int n) {
        return this.o[n];
    }
    
    public int describeContents() {
        return 0;
    }
    
    public int e() {
        return this.o.length;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (x.class != o.getClass()) {
            return false;
        }
        final x x = (x)o;
        return Arrays.equals(this.o, x.o) && this.p == x.p;
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(this.o) * 31 + h.b(this.p);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("entries=");
        sb.append(Arrays.toString(this.o));
        String string;
        if (this.p == -9223372036854775807L) {
            string = "";
        }
        else {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(", presentationTimeUs=");
            sb2.append(this.p);
            string = sb2.toString();
        }
        sb.append(string);
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, int i) {
        parcel.writeInt(this.o.length);
        final b[] o = this.o;
        int length;
        for (length = o.length, i = 0; i < length; ++i) {
            parcel.writeParcelable((Parcelable)o[i], 0);
        }
        parcel.writeLong(this.p);
    }
    
    public interface b extends Parcelable
    {
        void D(final w.b p0);
        
        byte[] M();
        
        q s();
    }
}
