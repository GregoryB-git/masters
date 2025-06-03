// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R0;

import d0.q;
import d0.y;
import d0.w;
import W2.c;
import g0.M;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import d0.x;

public class b implements x.b
{
    public static final Parcelable$Creator<b> CREATOR;
    public final String o;
    public final String p;
    
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
        this.o = (String)M.i(parcel.readString());
        this.p = (String)M.i(parcel.readString());
    }
    
    public b(final String s, final String p2) {
        this.o = c.f(s);
        this.p = p2;
    }
    
    @Override
    public void D(final w.b b) {
        final String o = this.o;
        o.hashCode();
        final int hashCode = o.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1939198791: {
                if (!o.equals("ARTIST")) {
                    break;
                }
                n = 4;
                break;
            }
            case 1746739798: {
                if (!o.equals("ALBUMARTIST")) {
                    break;
                }
                n = 3;
                break;
            }
            case 428414940: {
                if (!o.equals("DESCRIPTION")) {
                    break;
                }
                n = 2;
                break;
            }
            case 79833656: {
                if (!o.equals("TITLE")) {
                    break;
                }
                n = 1;
                break;
            }
            case 62359119: {
                if (!o.equals("ALBUM")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {}
            case 4: {
                b.P(this.p);
            }
            case 3: {
                b.N(this.p);
            }
            case 2: {
                b.V(this.p);
            }
            case 1: {
                b.n0(this.p);
            }
            case 0: {
                b.O(this.p);
            }
        }
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
        if (this.getClass() != o.getClass()) {
            return false;
        }
        final b b = (b)o;
        return this.o.equals(b.o) && this.p.equals(b.p);
    }
    
    @Override
    public int hashCode() {
        return (527 + this.o.hashCode()) * 31 + this.p.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("VC: ");
        sb.append(this.o);
        sb.append("=");
        sb.append(this.p);
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.o);
        parcel.writeString(this.p);
    }
}
