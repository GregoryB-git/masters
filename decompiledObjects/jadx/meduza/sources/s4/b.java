package s4;

import a0.j;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.f;
import p4.a;
import v3.i0;
import v3.p0;
import v5.e0;

@Deprecated
/* loaded from: classes.dex */
public class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f14164a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14165b;

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

    public b(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = e0.f15881a;
        this.f14164a = readString;
        this.f14165b = parcel.readString();
    }

    public b(String str, String str2) {
        this.f14164a = str;
        this.f14165b = str2;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f14164a.equals(bVar.f14164a) && this.f14165b.equals(bVar.f14165b);
    }

    public final int hashCode() {
        return this.f14165b.hashCode() + j.e(this.f14164a, 527, 31);
    }

    @Override // p4.a.b
    public final void l(p0.a aVar) {
        String str = this.f14164a;
        str.getClass();
        switch (str) {
            case "ALBUM":
                aVar.f15668c = this.f14165b;
                break;
            case "TITLE":
                aVar.f15666a = this.f14165b;
                break;
            case "DESCRIPTION":
                aVar.f15671g = this.f14165b;
                break;
            case "ALBUMARTIST":
                aVar.f15669d = this.f14165b;
                break;
            case "ARTIST":
                aVar.f15667b = this.f14165b;
                break;
        }
    }

    @Override // p4.a.b
    public final /* synthetic */ i0 n() {
        return null;
    }

    public final String toString() {
        StringBuilder l10 = f.l("VC: ");
        l10.append(this.f14164a);
        l10.append("=");
        l10.append(this.f14165b);
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14164a);
        parcel.writeString(this.f14165b);
    }
}
