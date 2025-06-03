package u4;

import android.os.Parcel;
import android.os.Parcelable;
import v5.e0;

/* loaded from: classes.dex */
public final class m extends h {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f14975b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14976c;

    public class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i10) {
            return new m[i10];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = v5.e0.f15881a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f14975b = r0
            java.lang.String r3 = r3.readString()
            r2.f14976c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.m.<init>(android.os.Parcel):void");
    }

    public m(String str, String str2, String str3) {
        super(str);
        this.f14975b = str2;
        this.f14976c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f14963a.equals(mVar.f14963a) && e0.a(this.f14975b, mVar.f14975b) && e0.a(this.f14976c, mVar.f14976c);
    }

    public final int hashCode() {
        int e10 = a0.j.e(this.f14963a, 527, 31);
        String str = this.f14975b;
        int hashCode = (e10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14976c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // u4.h
    public final String toString() {
        return this.f14963a + ": url=" + this.f14976c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14963a);
        parcel.writeString(this.f14975b);
        parcel.writeString(this.f14976c);
    }
}
