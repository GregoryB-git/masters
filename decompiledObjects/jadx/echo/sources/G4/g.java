package G4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    public final String f2088o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicLong f2089p;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i7) {
            return new g[i7];
        }
    }

    public g(Parcel parcel) {
        this.f2088o = parcel.readString();
        this.f2089p = new AtomicLong(parcel.readLong());
    }

    public long a() {
        return this.f2089p.get();
    }

    public String b() {
        return this.f2088o;
    }

    public void c(long j7) {
        this.f2089p.addAndGet(j7);
    }

    public void d(long j7) {
        this.f2089p.set(j7);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f2088o);
        parcel.writeLong(this.f2089p.get());
    }

    public /* synthetic */ g(Parcel parcel, a aVar) {
        this(parcel);
    }

    public g(String str) {
        this.f2088o = str;
        this.f2089p = new AtomicLong(0L);
    }
}
