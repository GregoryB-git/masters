package h0;

import a3.h;
import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC1202y;
import d0.C1194q;
import d0.C1200w;
import d0.C1201x;

/* renamed from: h0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1328c implements C1201x.b {
    public static final Parcelable.Creator<C1328c> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    public final long f14521o;

    /* renamed from: p, reason: collision with root package name */
    public final long f14522p;

    /* renamed from: q, reason: collision with root package name */
    public final long f14523q;

    /* renamed from: h0.c$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1328c createFromParcel(Parcel parcel) {
            return new C1328c(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1328c[] newArray(int i7) {
            return new C1328c[i7];
        }
    }

    public C1328c(long j7, long j8, long j9) {
        this.f14521o = j7;
        this.f14522p = j8;
        this.f14523q = j9;
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
        if (!(obj instanceof C1328c)) {
            return false;
        }
        C1328c c1328c = (C1328c) obj;
        return this.f14521o == c1328c.f14521o && this.f14522p == c1328c.f14522p && this.f14523q == c1328c.f14523q;
    }

    public int hashCode() {
        return ((((527 + h.b(this.f14521o)) * 31) + h.b(this.f14522p)) * 31) + h.b(this.f14523q);
    }

    @Override // d0.C1201x.b
    public /* synthetic */ C1194q s() {
        return AbstractC1202y.b(this);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.f14521o + ", modification time=" + this.f14522p + ", timescale=" + this.f14523q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f14521o);
        parcel.writeLong(this.f14522p);
        parcel.writeLong(this.f14523q);
    }

    public C1328c(Parcel parcel) {
        this.f14521o = parcel.readLong();
        this.f14522p = parcel.readLong();
        this.f14523q = parcel.readLong();
    }

    public /* synthetic */ C1328c(Parcel parcel, a aVar) {
        this(parcel);
    }
}
