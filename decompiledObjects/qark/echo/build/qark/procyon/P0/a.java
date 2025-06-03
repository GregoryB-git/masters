// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package P0;

import d0.q;
import d0.y;
import d0.w;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import d0.x;

public final class a implements b
{
    public static final Parcelable$Creator<a> CREATOR;
    public final int o;
    public final String p;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public a a(final Parcel parcel) {
                return new a(parcel.readInt(), (String)g0.a.e(parcel.readString()));
            }
            
            public a[] b(final int n) {
                return new a[n];
            }
        };
    }
    
    public a(final int o, final String p2) {
        this.o = o;
        this.p = p2;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Ait(controlCode=");
        sb.append(this.o);
        sb.append(",url=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.p);
        parcel.writeInt(this.o);
    }
}
