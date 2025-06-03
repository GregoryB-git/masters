package h0;

import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC1202y;
import d0.C1194q;
import d0.C1200w;
import d0.C1201x;
import g0.AbstractC1297a;

/* renamed from: h0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1327b implements C1201x.b {
    public static final Parcelable.Creator<C1327b> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    public final float f14519o;

    /* renamed from: p, reason: collision with root package name */
    public final float f14520p;

    /* renamed from: h0.b$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1327b createFromParcel(Parcel parcel) {
            return new C1327b(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1327b[] newArray(int i7) {
            return new C1327b[i7];
        }
    }

    public C1327b(float f7, float f8) {
        AbstractC1297a.b(f7 >= -90.0f && f7 <= 90.0f && f8 >= -180.0f && f8 <= 180.0f, "Invalid latitude or longitude");
        this.f14519o = f7;
        this.f14520p = f8;
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
        if (obj == null || C1327b.class != obj.getClass()) {
            return false;
        }
        C1327b c1327b = (C1327b) obj;
        return this.f14519o == c1327b.f14519o && this.f14520p == c1327b.f14520p;
    }

    public int hashCode() {
        return ((527 + a3.c.a(this.f14519o)) * 31) + a3.c.a(this.f14520p);
    }

    @Override // d0.C1201x.b
    public /* synthetic */ C1194q s() {
        return AbstractC1202y.b(this);
    }

    public String toString() {
        return "xyz: latitude=" + this.f14519o + ", longitude=" + this.f14520p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(this.f14519o);
        parcel.writeFloat(this.f14520p);
    }

    public C1327b(Parcel parcel) {
        this.f14519o = parcel.readFloat();
        this.f14520p = parcel.readFloat();
    }

    public /* synthetic */ C1327b(Parcel parcel, a aVar) {
        this(parcel);
    }
}
