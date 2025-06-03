package U0;

import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC1202y;
import d0.C1194q;
import d0.C1200w;
import d0.C1201x;

/* loaded from: classes.dex */
public final class d implements C1201x.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    public final float f6313o;

    /* renamed from: p, reason: collision with root package name */
    public final int f6314p;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i7) {
            return new d[i7];
        }
    }

    public d(float f7, int i7) {
        this.f6313o = f7;
        this.f6314p = i7;
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
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f6313o == dVar.f6313o && this.f6314p == dVar.f6314p;
    }

    public int hashCode() {
        return ((527 + a3.c.a(this.f6313o)) * 31) + this.f6314p;
    }

    @Override // d0.C1201x.b
    public /* synthetic */ C1194q s() {
        return AbstractC1202y.b(this);
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f6313o + ", svcTemporalLayerCount=" + this.f6314p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(this.f6313o);
        parcel.writeInt(this.f6314p);
    }

    public d(Parcel parcel) {
        this.f6313o = parcel.readFloat();
        this.f6314p = parcel.readInt();
    }

    public /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }
}
