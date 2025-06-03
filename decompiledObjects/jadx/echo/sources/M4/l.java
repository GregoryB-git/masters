package M4;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    public long f3560o;

    /* renamed from: p, reason: collision with root package name */
    public long f3561p;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i7) {
            return new l[i7];
        }
    }

    public l() {
        this(h(), a());
    }

    public static long a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    public static l f(long j7) {
        long micros = TimeUnit.MILLISECONDS.toMicros(j7);
        return new l(h() + (micros - a()), micros);
    }

    public static long h() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    public long b() {
        return this.f3560o + c();
    }

    public long c() {
        return d(new l());
    }

    public long d(l lVar) {
        return lVar.f3561p - this.f3561p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.f3560o;
    }

    public void g() {
        this.f3560o = h();
        this.f3561p = a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f3560o);
        parcel.writeLong(this.f3561p);
    }

    public l(long j7, long j8) {
        this.f3560o = j7;
        this.f3561p = j8;
    }

    public l(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }

    public /* synthetic */ l(Parcel parcel, a aVar) {
        this(parcel);
    }
}
