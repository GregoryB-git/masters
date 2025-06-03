// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package U0;

import g0.M;
import W2.k;
import X2.n;
import java.util.Comparator;
import android.os.Parcelable;
import d0.q;
import d0.y;
import d0.w;
import g0.a;
import java.util.ArrayList;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;
import d0.x;

public final class b implements x.b
{
    public static final Parcelable$Creator<b> CREATOR;
    public final List o;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public b a(final Parcel parcel) {
                final ArrayList list = new ArrayList();
                parcel.readList((List)list, b.class.getClassLoader());
                return new b(list);
            }
            
            public b[] b(final int n) {
                return new b[n];
            }
        };
    }
    
    public b(final List o) {
        this.o = o;
        a.a(a(o) ^ true);
    }
    
    public static boolean a(final List list) {
        if (list.isEmpty()) {
            return false;
        }
        long n = list.get(0).p;
        for (int i = 1; i < list.size(); ++i) {
            if (list.get(i).o < n) {
                return true;
            }
            n = list.get(i).p;
        }
        return false;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && b.class == o.getClass() && this.o.equals(((b)o).o));
    }
    
    @Override
    public int hashCode() {
        return this.o.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SlowMotion: segments=");
        sb.append(this.o);
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeList(this.o);
    }
    
    public static final class b implements Parcelable
    {
        public static final Parcelable$Creator<b> CREATOR;
        public static final Comparator r;
        public final long o;
        public final long p;
        public final int q;
        
        static {
            r = new c();
            CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
                public b a(final Parcel parcel) {
                    return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
                }
                
                public b[] b(final int n) {
                    return new b[n];
                }
            };
        }
        
        public b(final long o, final long p3, final int q) {
            a.a(o < p3);
            this.o = o;
            this.p = p3;
            this.q = q;
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
            if (b.class != o.getClass()) {
                return false;
            }
            final b b = (b)o;
            return this.o == b.o && this.p == b.p && this.q == b.q;
        }
        
        @Override
        public int hashCode() {
            return k.b(this.o, this.p, this.q);
        }
        
        @Override
        public String toString() {
            return M.G("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", this.o, this.p, this.q);
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeLong(this.o);
            parcel.writeLong(this.p);
            parcel.writeInt(this.q);
        }
    }
}
