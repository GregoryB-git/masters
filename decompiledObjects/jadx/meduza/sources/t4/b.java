package t4;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.f;
import p4.a;
import v3.i0;
import v3.p0;
import v5.e0;

/* loaded from: classes.dex */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f14437a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14438b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14439c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14440d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14441e;
    public final int f;

    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(int i10, int i11, String str, String str2, String str3, boolean z10) {
        x6.b.q(i11 == -1 || i11 > 0);
        this.f14437a = i10;
        this.f14438b = str;
        this.f14439c = str2;
        this.f14440d = str3;
        this.f14441e = z10;
        this.f = i11;
    }

    public b(Parcel parcel) {
        this.f14437a = parcel.readInt();
        this.f14438b = parcel.readString();
        this.f14439c = parcel.readString();
        this.f14440d = parcel.readString();
        int i10 = e0.f15881a;
        this.f14441e = parcel.readInt() != 0;
        this.f = parcel.readInt();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static t4.b a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.b.a(java.util.Map):t4.b");
    }

    @Override // p4.a.b
    public final /* synthetic */ byte[] B() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f14437a == bVar.f14437a && e0.a(this.f14438b, bVar.f14438b) && e0.a(this.f14439c, bVar.f14439c) && e0.a(this.f14440d, bVar.f14440d) && this.f14441e == bVar.f14441e && this.f == bVar.f;
    }

    public final int hashCode() {
        int i10 = (527 + this.f14437a) * 31;
        String str = this.f14438b;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14439c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14440d;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f14441e ? 1 : 0)) * 31) + this.f;
    }

    @Override // p4.a.b
    public final void l(p0.a aVar) {
        String str = this.f14439c;
        if (str != null) {
            aVar.E = str;
        }
        String str2 = this.f14438b;
        if (str2 != null) {
            aVar.C = str2;
        }
    }

    @Override // p4.a.b
    public final /* synthetic */ i0 n() {
        return null;
    }

    public final String toString() {
        StringBuilder l10 = f.l("IcyHeaders: name=\"");
        l10.append(this.f14439c);
        l10.append("\", genre=\"");
        l10.append(this.f14438b);
        l10.append("\", bitrate=");
        l10.append(this.f14437a);
        l10.append(", metadataInterval=");
        l10.append(this.f);
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14437a);
        parcel.writeString(this.f14438b);
        parcel.writeString(this.f14439c);
        parcel.writeString(this.f14440d);
        boolean z10 = this.f14441e;
        int i11 = e0.f15881a;
        parcel.writeInt(z10 ? 1 : 0);
        parcel.writeInt(this.f);
    }
}
