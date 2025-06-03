package T0;

import android.os.Parcel;
import android.os.Parcelable;
import g0.M;

/* loaded from: classes.dex */
public final class k extends i {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: p, reason: collision with root package name */
    public final String f6044p;

    /* renamed from: q, reason: collision with root package name */
    public final String f6045q;

    /* renamed from: r, reason: collision with root package name */
    public final String f6046r;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i7) {
            return new k[i7];
        }
    }

    public k(Parcel parcel) {
        super("----");
        this.f6044p = (String) M.i(parcel.readString());
        this.f6045q = (String) M.i(parcel.readString());
        this.f6046r = (String) M.i(parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return M.c(this.f6045q, kVar.f6045q) && M.c(this.f6044p, kVar.f6044p) && M.c(this.f6046r, kVar.f6046r);
    }

    public int hashCode() {
        String str = this.f6044p;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6045q;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6046r;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // T0.i
    public String toString() {
        return this.f6042o + ": domain=" + this.f6044p + ", description=" + this.f6045q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f6042o);
        parcel.writeString(this.f6044p);
        parcel.writeString(this.f6046r);
    }

    public k(String str, String str2, String str3) {
        super("----");
        this.f6044p = str;
        this.f6045q = str2;
        this.f6046r = str3;
    }
}
