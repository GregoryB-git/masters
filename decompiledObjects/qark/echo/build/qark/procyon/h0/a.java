// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package h0;

import a3.f;
import d0.q;
import java.util.Arrays;
import d0.y;
import d0.w;
import g0.M;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import d0.x;

public final class a implements b
{
    public static final Parcelable$Creator<a> CREATOR;
    public final String o;
    public final byte[] p;
    public final int q;
    public final int r;
    
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
    
    public a(final Parcel parcel) {
        this.o = (String)M.i(parcel.readString());
        this.p = (byte[])M.i(parcel.createByteArray());
        this.q = parcel.readInt();
        this.r = parcel.readInt();
    }
    
    public a(final String o, final byte[] p4, final int q, final int r) {
        this.o = o;
        this.p = p4;
        this.q = q;
        this.r = r;
    }
    
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
        if (a.class != o.getClass()) {
            return false;
        }
        final a a = (a)o;
        return this.o.equals(a.o) && Arrays.equals(this.p, a.p) && this.q == a.q && this.r == a.r;
    }
    
    @Override
    public int hashCode() {
        return (((527 + this.o.hashCode()) * 31 + Arrays.hashCode(this.p)) * 31 + this.q) * 31 + this.r;
    }
    
    @Override
    public String toString() {
        final int r = this.r;
        String str;
        if (r != 1) {
            if (r != 23) {
                if (r != 67) {
                    str = M.f1(this.p);
                }
                else {
                    str = String.valueOf(f.g(this.p));
                }
            }
            else {
                str = String.valueOf(Float.intBitsToFloat(f.g(this.p)));
            }
        }
        else {
            str = M.H(this.p);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("mdta: key=");
        sb.append(this.o);
        sb.append(", value=");
        sb.append(str);
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.o);
        parcel.writeByteArray(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
    }
}
