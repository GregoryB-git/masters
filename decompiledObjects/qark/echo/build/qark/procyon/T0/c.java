// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T0;

import android.os.Parcelable;
import java.util.Arrays;
import g0.M;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class c extends i
{
    public static final Parcelable$Creator<c> CREATOR;
    public final String p;
    public final int q;
    public final int r;
    public final long s;
    public final long t;
    public final i[] u;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public c a(final Parcel parcel) {
                return new c(parcel);
            }
            
            public c[] b(final int n) {
                return new c[n];
            }
        };
    }
    
    public c(final Parcel parcel) {
        super("CHAP");
        this.p = (String)M.i(parcel.readString());
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.s = parcel.readLong();
        this.t = parcel.readLong();
        final int int1 = parcel.readInt();
        this.u = new i[int1];
        for (int i = 0; i < int1; ++i) {
            this.u[i] = (i)parcel.readParcelable(i.class.getClassLoader());
        }
    }
    
    public c(final String p6, final int q, final int r, final long s, final long t, final i[] u) {
        super("CHAP");
        this.p = p6;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
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
        if (c.class != o.getClass()) {
            return false;
        }
        final c c = (c)o;
        return this.q == c.q && this.r == c.r && this.s == c.s && this.t == c.t && M.c(this.p, c.p) && Arrays.equals(this.u, c.u);
    }
    
    @Override
    public int hashCode() {
        final int q = this.q;
        final int r = this.r;
        final int n = (int)this.s;
        final int n2 = (int)this.t;
        final String p = this.p;
        int hashCode;
        if (p != null) {
            hashCode = p.hashCode();
        }
        else {
            hashCode = 0;
        }
        return ((((527 + q) * 31 + r) * 31 + n) * 31 + n2) * 31 + hashCode;
    }
    
    public void writeToParcel(final Parcel parcel, int i) {
        parcel.writeString(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeLong(this.s);
        parcel.writeLong(this.t);
        parcel.writeInt(this.u.length);
        final i[] u = this.u;
        int length;
        for (length = u.length, i = 0; i < length; ++i) {
            parcel.writeParcelable((Parcelable)u[i], 0);
        }
    }
}
