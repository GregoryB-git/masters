package u4;

import android.os.Parcel;
import android.os.Parcelable;
import v5.e0;

/* loaded from: classes.dex */
public final class i extends h {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f14964b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14965c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14966d;

    public class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i10) {
            return new i[i10];
        }
    }

    public i(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i10 = e0.f15881a;
        this.f14964b = readString;
        this.f14965c = parcel.readString();
        this.f14966d = parcel.readString();
    }

    public i(String str, String str2, String str3) {
        super("----");
        this.f14964b = str;
        this.f14965c = str2;
        this.f14966d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return e0.a(this.f14965c, iVar.f14965c) && e0.a(this.f14964b, iVar.f14964b) && e0.a(this.f14966d, iVar.f14966d);
    }

    public final int hashCode() {
        String str = this.f14964b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14965c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14966d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // u4.h
    public final String toString() {
        return this.f14963a + ": domain=" + this.f14964b + ", description=" + this.f14965c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14963a);
        parcel.writeString(this.f14964b);
        parcel.writeString(this.f14966d);
    }
}
