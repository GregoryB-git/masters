package u4;

import android.os.Parcel;
import android.os.Parcelable;
import v5.e0;

/* loaded from: classes.dex */
public final class e extends h {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f14951b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14952c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14953d;

    public class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i10 = e0.f15881a;
        this.f14951b = readString;
        this.f14952c = parcel.readString();
        this.f14953d = parcel.readString();
    }

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f14951b = str;
        this.f14952c = str2;
        this.f14953d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return e0.a(this.f14952c, eVar.f14952c) && e0.a(this.f14951b, eVar.f14951b) && e0.a(this.f14953d, eVar.f14953d);
    }

    public final int hashCode() {
        String str = this.f14951b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14952c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14953d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // u4.h
    public final String toString() {
        return this.f14963a + ": language=" + this.f14951b + ", description=" + this.f14952c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14963a);
        parcel.writeString(this.f14951b);
        parcel.writeString(this.f14953d);
    }
}
