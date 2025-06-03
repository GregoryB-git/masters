// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package G4;

import android.os.Parcel;
import java.util.concurrent.atomic.AtomicLong;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class g implements Parcelable
{
    public static final Parcelable$Creator<g> CREATOR;
    public final String o;
    public final AtomicLong p;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public g a(final Parcel parcel) {
                return new g(parcel, null);
            }
            
            public g[] b(final int n) {
                return new g[n];
            }
        };
    }
    
    public g(final Parcel parcel) {
        this.o = parcel.readString();
        this.p = new AtomicLong(parcel.readLong());
    }
    
    public g(final String o) {
        this.o = o;
        this.p = new AtomicLong(0L);
    }
    
    public long a() {
        return this.p.get();
    }
    
    public String b() {
        return this.o;
    }
    
    public void c(final long delta) {
        this.p.addAndGet(delta);
    }
    
    public void d(final long newValue) {
        this.p.set(newValue);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.o);
        parcel.writeLong(this.p.get());
    }
}
