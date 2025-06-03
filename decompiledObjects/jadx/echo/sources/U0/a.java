package U0;

import a3.h;
import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC1202y;
import d0.C1194q;
import d0.C1200w;
import d0.C1201x;

/* loaded from: classes.dex */
public final class a implements C1201x.b {
    public static final Parcelable.Creator<a> CREATOR = new C0104a();

    /* renamed from: o, reason: collision with root package name */
    public final long f6303o;

    /* renamed from: p, reason: collision with root package name */
    public final long f6304p;

    /* renamed from: q, reason: collision with root package name */
    public final long f6305q;

    /* renamed from: r, reason: collision with root package name */
    public final long f6306r;

    /* renamed from: s, reason: collision with root package name */
    public final long f6307s;

    /* renamed from: U0.a$a, reason: collision with other inner class name */
    public class C0104a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i7) {
            return new a[i7];
        }
    }

    public a(long j7, long j8, long j9, long j10, long j11) {
        this.f6303o = j7;
        this.f6304p = j8;
        this.f6305q = j9;
        this.f6306r = j10;
        this.f6307s = j11;
    }

    @Override // d0.C1201x.b
    public /* synthetic */ void D(C1200w.b bVar) {
        AbstractC1202y.c(this, bVar);
    }

    @Override // d0.C1201x.b
    public /* synthetic */ byte[] M() {
        return AbstractC1202y.a(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6303o == aVar.f6303o && this.f6304p == aVar.f6304p && this.f6305q == aVar.f6305q && this.f6306r == aVar.f6306r && this.f6307s == aVar.f6307s;
    }

    public int hashCode() {
        return ((((((((527 + h.b(this.f6303o)) * 31) + h.b(this.f6304p)) * 31) + h.b(this.f6305q)) * 31) + h.b(this.f6306r)) * 31) + h.b(this.f6307s);
    }

    @Override // d0.C1201x.b
    public /* synthetic */ C1194q s() {
        return AbstractC1202y.b(this);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f6303o + ", photoSize=" + this.f6304p + ", photoPresentationTimestampUs=" + this.f6305q + ", videoStartPosition=" + this.f6306r + ", videoSize=" + this.f6307s;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f6303o);
        parcel.writeLong(this.f6304p);
        parcel.writeLong(this.f6305q);
        parcel.writeLong(this.f6306r);
        parcel.writeLong(this.f6307s);
    }

    public a(Parcel parcel) {
        this.f6303o = parcel.readLong();
        this.f6304p = parcel.readLong();
        this.f6305q = parcel.readLong();
        this.f6306r = parcel.readLong();
        this.f6307s = parcel.readLong();
    }

    public /* synthetic */ a(Parcel parcel, C0104a c0104a) {
        this(parcel);
    }
}
