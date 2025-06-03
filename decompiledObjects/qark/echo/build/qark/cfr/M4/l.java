/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.os.SystemClock
 *  java.lang.Object
 *  java.lang.System
 *  java.util.concurrent.TimeUnit
 */
package M4;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public class l
implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new Parcelable.Creator(){

        public l a(Parcel parcel) {
            return new l(parcel, null);
        }

        public l[] b(int n8) {
            return new l[n8];
        }
    };
    public long o;
    public long p;

    public l() {
        this(l.h(), l.a());
    }

    public l(long l8, long l9) {
        this.o = l8;
        this.p = l9;
    }

    public l(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }

    public /* synthetic */ l(Parcel parcel,  a8) {
        this(parcel);
    }

    public static long a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    public static l f(long l8) {
        l8 = TimeUnit.MILLISECONDS.toMicros(l8);
        return new l(l.h() + (l8 - l.a()), l8);
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

    public long d(l l8) {
        return l8.p - this.p;
    }

    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.o;
    }

    public void g() {
        this.o = l.h();
        this.p = l.a();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeLong(this.o);
        parcel.writeLong(this.p);
    }

}

