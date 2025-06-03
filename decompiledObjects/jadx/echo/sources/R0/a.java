package R0;

import W2.e;
import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC1202y;
import d0.AbstractC1203z;
import d0.C1194q;
import d0.C1200w;
import d0.C1201x;
import g0.M;
import g0.z;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements C1201x.b {
    public static final Parcelable.Creator<a> CREATOR = new C0086a();

    /* renamed from: o, reason: collision with root package name */
    public final int f4517o;

    /* renamed from: p, reason: collision with root package name */
    public final String f4518p;

    /* renamed from: q, reason: collision with root package name */
    public final String f4519q;

    /* renamed from: r, reason: collision with root package name */
    public final int f4520r;

    /* renamed from: s, reason: collision with root package name */
    public final int f4521s;

    /* renamed from: t, reason: collision with root package name */
    public final int f4522t;

    /* renamed from: u, reason: collision with root package name */
    public final int f4523u;

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f4524v;

    /* renamed from: R0.a$a, reason: collision with other inner class name */
    public class C0086a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i7) {
            return new a[i7];
        }
    }

    public a(int i7, String str, String str2, int i8, int i9, int i10, int i11, byte[] bArr) {
        this.f4517o = i7;
        this.f4518p = str;
        this.f4519q = str2;
        this.f4520r = i8;
        this.f4521s = i9;
        this.f4522t = i10;
        this.f4523u = i11;
        this.f4524v = bArr;
    }

    public static a a(z zVar) {
        int p7 = zVar.p();
        String t7 = AbstractC1203z.t(zVar.E(zVar.p(), e.f6819a));
        String D7 = zVar.D(zVar.p());
        int p8 = zVar.p();
        int p9 = zVar.p();
        int p10 = zVar.p();
        int p11 = zVar.p();
        int p12 = zVar.p();
        byte[] bArr = new byte[p12];
        zVar.l(bArr, 0, p12);
        return new a(p7, t7, D7, p8, p9, p10, p11, bArr);
    }

    @Override // d0.C1201x.b
    public void D(C1200w.b bVar) {
        bVar.J(this.f4524v, this.f4517o);
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
        return this.f4517o == aVar.f4517o && this.f4518p.equals(aVar.f4518p) && this.f4519q.equals(aVar.f4519q) && this.f4520r == aVar.f4520r && this.f4521s == aVar.f4521s && this.f4522t == aVar.f4522t && this.f4523u == aVar.f4523u && Arrays.equals(this.f4524v, aVar.f4524v);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f4517o) * 31) + this.f4518p.hashCode()) * 31) + this.f4519q.hashCode()) * 31) + this.f4520r) * 31) + this.f4521s) * 31) + this.f4522t) * 31) + this.f4523u) * 31) + Arrays.hashCode(this.f4524v);
    }

    @Override // d0.C1201x.b
    public /* synthetic */ C1194q s() {
        return AbstractC1202y.b(this);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f4518p + ", description=" + this.f4519q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f4517o);
        parcel.writeString(this.f4518p);
        parcel.writeString(this.f4519q);
        parcel.writeInt(this.f4520r);
        parcel.writeInt(this.f4521s);
        parcel.writeInt(this.f4522t);
        parcel.writeInt(this.f4523u);
        parcel.writeByteArray(this.f4524v);
    }

    public a(Parcel parcel) {
        this.f4517o = parcel.readInt();
        this.f4518p = (String) M.i(parcel.readString());
        this.f4519q = (String) M.i(parcel.readString());
        this.f4520r = parcel.readInt();
        this.f4521s = parcel.readInt();
        this.f4522t = parcel.readInt();
        this.f4523u = parcel.readInt();
        this.f4524v = (byte[]) M.i(parcel.createByteArray());
    }
}
