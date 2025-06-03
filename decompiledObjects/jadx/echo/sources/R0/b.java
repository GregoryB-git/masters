package R0;

import W2.c;
import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC1202y;
import d0.C1194q;
import d0.C1200w;
import d0.C1201x;
import g0.M;

/* loaded from: classes.dex */
public class b implements C1201x.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    public final String f4525o;

    /* renamed from: p, reason: collision with root package name */
    public final String f4526p;

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

    public b(Parcel parcel) {
        this.f4525o = (String) M.i(parcel.readString());
        this.f4526p = (String) M.i(parcel.readString());
    }

    @Override // d0.C1201x.b
    public void D(C1200w.b bVar) {
        String str = this.f4525o;
        str.hashCode();
        switch (str) {
            case "ALBUM":
                bVar.O(this.f4526p);
                break;
            case "TITLE":
                bVar.n0(this.f4526p);
                break;
            case "DESCRIPTION":
                bVar.V(this.f4526p);
                break;
            case "ALBUMARTIST":
                bVar.N(this.f4526p);
                break;
            case "ARTIST":
                bVar.P(this.f4526p);
                break;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4525o.equals(bVar.f4525o) && this.f4526p.equals(bVar.f4526p);
    }

    public int hashCode() {
        return ((527 + this.f4525o.hashCode()) * 31) + this.f4526p.hashCode();
    }

    @Override // d0.C1201x.b
    public /* synthetic */ C1194q s() {
        return AbstractC1202y.b(this);
    }

    public String toString() {
        return "VC: " + this.f4525o + "=" + this.f4526p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f4525o);
        parcel.writeString(this.f4526p);
    }

    public b(String str, String str2) {
        this.f4525o = c.f(str);
        this.f4526p = str2;
    }
}
