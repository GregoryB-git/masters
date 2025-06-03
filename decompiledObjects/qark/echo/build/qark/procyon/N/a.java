// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package N;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public abstract class a implements Parcelable
{
    public static final Parcelable$Creator<a> CREATOR;
    public static final a p;
    public final Parcelable o;
    
    static {
        p = new a() {};
        CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator() {
            public a a(final Parcel parcel) {
                return this.b(parcel, null);
            }
            
            public a b(final Parcel parcel, final ClassLoader classLoader) {
                if (parcel.readParcelable(classLoader) == null) {
                    return a.p;
                }
                throw new IllegalStateException("superState must be null");
            }
            
            public a[] c(final int n) {
                return new a[n];
            }
        };
    }
    
    public a() {
        this.o = null;
    }
    
    public a(final Parcel parcel, final ClassLoader classLoader) {
        Object o = parcel.readParcelable(classLoader);
        if (o == null) {
            o = a.p;
        }
        this.o = (Parcelable)o;
    }
    
    public a(Parcelable o) {
        if (o != null) {
            if (o == a.p) {
                o = null;
            }
            this.o = o;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }
    
    public final Parcelable a() {
        return this.o;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable(this.o, n);
    }
}
