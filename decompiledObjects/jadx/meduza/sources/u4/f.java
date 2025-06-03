package u4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import v5.e0;

/* loaded from: classes.dex */
public final class f extends h {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f14954b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14955c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14956d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f14957e;

    public class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public f(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i10 = e0.f15881a;
        this.f14954b = readString;
        this.f14955c = parcel.readString();
        this.f14956d = parcel.readString();
        this.f14957e = parcel.createByteArray();
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f14954b = str;
        this.f14955c = str2;
        this.f14956d = str3;
        this.f14957e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return e0.a(this.f14954b, fVar.f14954b) && e0.a(this.f14955c, fVar.f14955c) && e0.a(this.f14956d, fVar.f14956d) && Arrays.equals(this.f14957e, fVar.f14957e);
    }

    public final int hashCode() {
        String str = this.f14954b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14955c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14956d;
        return Arrays.hashCode(this.f14957e) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // u4.h
    public final String toString() {
        return this.f14963a + ": mimeType=" + this.f14954b + ", filename=" + this.f14955c + ", description=" + this.f14956d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14954b);
        parcel.writeString(this.f14955c);
        parcel.writeString(this.f14956d);
        parcel.writeByteArray(this.f14957e);
    }
}
