package T0;

import android.os.Parcel;
import android.os.Parcelable;
import g0.M;

/* loaded from: classes.dex */
public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: p, reason: collision with root package name */
    public final String f6030p;

    /* renamed from: q, reason: collision with root package name */
    public final String f6031q;

    /* renamed from: r, reason: collision with root package name */
    public final String f6032r;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i7) {
            return new e[i7];
        }
    }

    public e(Parcel parcel) {
        super("COMM");
        this.f6030p = (String) M.i(parcel.readString());
        this.f6031q = (String) M.i(parcel.readString());
        this.f6032r = (String) M.i(parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return M.c(this.f6031q, eVar.f6031q) && M.c(this.f6030p, eVar.f6030p) && M.c(this.f6032r, eVar.f6032r);
    }

    public int hashCode() {
        String str = this.f6030p;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6031q;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6032r;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // T0.i
    public String toString() {
        return this.f6042o + ": language=" + this.f6030p + ", description=" + this.f6031q + ", text=" + this.f6032r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f6042o);
        parcel.writeString(this.f6030p);
        parcel.writeString(this.f6032r);
    }

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f6030p = str;
        this.f6031q = str2;
        this.f6032r = str3;
    }
}
