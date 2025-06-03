// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package M4;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class l implements Parcelable
{
    public static final Parcelable$Creator<l> CREATOR;
    public long o;
    public long p;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public l a(final Parcel parcel) {
                return new l(parcel, null);
            }
            
            public l[] b(final int n) {
                return new l[n];
            }
        };
    }
    
    public l() {
        this(h(), a());
    }
    
    public l(final long o, final long p2) {
        this.o = o;
        this.p = p2;
    }
    
    public l(final Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }
    
    public static long a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }
    
    public static l f(long micros) {
        micros = TimeUnit.MILLISECONDS.toMicros(micros);
        return new l(h() + (micros - a()), micros);
    }
    
    public static long h() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }
    
    public long b() {
        return this.o + this.c();
    }
    
    public long c() {
        return this.d(new l());
    }
    
    public long d(final l l) {
        return l.p - this.p;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public long e() {
        return this.o;
    }
    
    public void g() {
        this.o = h();
        this.p = a();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.o);
        parcel.writeLong(this.p);
    }
}
