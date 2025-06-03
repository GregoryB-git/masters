package t4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p4.a;
import v3.i0;
import v3.p0;

/* loaded from: classes.dex */
public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f14442a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14443b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14444c;

    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.f14442a = createByteArray;
        this.f14443b = parcel.readString();
        this.f14444c = parcel.readString();
    }

    public c(byte[] bArr, String str, String str2) {
        this.f14442a = bArr;
        this.f14443b = str;
        this.f14444c = str2;
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
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f14442a, ((c) obj).f14442a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14442a);
    }

    @Override // p4.a.b
    public final void l(p0.a aVar) {
        String str = this.f14443b;
        if (str != null) {
            aVar.f15666a = str;
        }
    }

    @Override // p4.a.b
    public final /* synthetic */ i0 n() {
        return null;
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f14443b, this.f14444c, Integer.valueOf(this.f14442a.length));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f14442a);
        parcel.writeString(this.f14443b);
        parcel.writeString(this.f14444c);
    }
}
