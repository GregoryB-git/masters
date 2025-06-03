package T0;

import android.os.Parcel;
import android.os.Parcelable;
import g0.M;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f extends i {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: p, reason: collision with root package name */
    public final String f6033p;

    /* renamed from: q, reason: collision with root package name */
    public final String f6034q;

    /* renamed from: r, reason: collision with root package name */
    public final String f6035r;

    /* renamed from: s, reason: collision with root package name */
    public final byte[] f6036s;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i7) {
            return new f[i7];
        }
    }

    public f(Parcel parcel) {
        super("GEOB");
        this.f6033p = (String) M.i(parcel.readString());
        this.f6034q = (String) M.i(parcel.readString());
        this.f6035r = (String) M.i(parcel.readString());
        this.f6036s = (byte[]) M.i(parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return M.c(this.f6033p, fVar.f6033p) && M.c(this.f6034q, fVar.f6034q) && M.c(this.f6035r, fVar.f6035r) && Arrays.equals(this.f6036s, fVar.f6036s);
    }

    public int hashCode() {
        String str = this.f6033p;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6034q;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6035r;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f6036s);
    }

    @Override // T0.i
    public String toString() {
        return this.f6042o + ": mimeType=" + this.f6033p + ", filename=" + this.f6034q + ", description=" + this.f6035r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f6033p);
        parcel.writeString(this.f6034q);
        parcel.writeString(this.f6035r);
        parcel.writeByteArray(this.f6036s);
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f6033p = str;
        this.f6034q = str2;
        this.f6035r = str3;
        this.f6036s = bArr;
    }
}
