package S0;

import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC1202y;
import d0.C1194q;
import d0.C1200w;
import d0.C1201x;
import g0.AbstractC1297a;
import g0.M;

/* loaded from: classes.dex */
public final class b implements C1201x.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    public final int f5821o;

    /* renamed from: p, reason: collision with root package name */
    public final String f5822p;

    /* renamed from: q, reason: collision with root package name */
    public final String f5823q;

    /* renamed from: r, reason: collision with root package name */
    public final String f5824r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f5825s;

    /* renamed from: t, reason: collision with root package name */
    public final int f5826t;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i7) {
            return new b[i7];
        }
    }

    public b(int i7, String str, String str2, String str3, boolean z7, int i8) {
        AbstractC1297a.a(i8 == -1 || i8 > 0);
        this.f5821o = i7;
        this.f5822p = str;
        this.f5823q = str2;
        this.f5824r = str3;
        this.f5825s = z7;
        this.f5826t = i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static S0.b a(java.util.Map r13) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.b.a(java.util.Map):S0.b");
    }

    @Override // d0.C1201x.b
    public void D(C1200w.b bVar) {
        String str = this.f5823q;
        if (str != null) {
            bVar.l0(str);
        }
        String str2 = this.f5822p;
        if (str2 != null) {
            bVar.b0(str2);
        }
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
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5821o == bVar.f5821o && M.c(this.f5822p, bVar.f5822p) && M.c(this.f5823q, bVar.f5823q) && M.c(this.f5824r, bVar.f5824r) && this.f5825s == bVar.f5825s && this.f5826t == bVar.f5826t;
    }

    public int hashCode() {
        int i7 = (527 + this.f5821o) * 31;
        String str = this.f5822p;
        int hashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5823q;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5824r;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f5825s ? 1 : 0)) * 31) + this.f5826t;
    }

    @Override // d0.C1201x.b
    public /* synthetic */ C1194q s() {
        return AbstractC1202y.b(this);
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f5823q + "\", genre=\"" + this.f5822p + "\", bitrate=" + this.f5821o + ", metadataInterval=" + this.f5826t;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f5821o);
        parcel.writeString(this.f5822p);
        parcel.writeString(this.f5823q);
        parcel.writeString(this.f5824r);
        M.j1(parcel, this.f5825s);
        parcel.writeInt(this.f5826t);
    }

    public b(Parcel parcel) {
        this.f5821o = parcel.readInt();
        this.f5822p = parcel.readString();
        this.f5823q = parcel.readString();
        this.f5824r = parcel.readString();
        this.f5825s = M.T0(parcel);
        this.f5826t = parcel.readInt();
    }
}
