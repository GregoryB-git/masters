package T0;

import android.os.Parcel;
import android.os.Parcelable;
import d0.C1200w;
import g0.M;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends i {
    public static final Parcelable.Creator<a> CREATOR = new C0099a();

    /* renamed from: p, reason: collision with root package name */
    public final String f6014p;

    /* renamed from: q, reason: collision with root package name */
    public final String f6015q;

    /* renamed from: r, reason: collision with root package name */
    public final int f6016r;

    /* renamed from: s, reason: collision with root package name */
    public final byte[] f6017s;

    /* renamed from: T0.a$a, reason: collision with other inner class name */
    public class C0099a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i7) {
            return new a[i7];
        }
    }

    public a(Parcel parcel) {
        super("APIC");
        this.f6014p = (String) M.i(parcel.readString());
        this.f6015q = parcel.readString();
        this.f6016r = parcel.readInt();
        this.f6017s = (byte[]) M.i(parcel.createByteArray());
    }

    @Override // T0.i, d0.C1201x.b
    public void D(C1200w.b bVar) {
        bVar.J(this.f6017s, this.f6016r);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6016r == aVar.f6016r && M.c(this.f6014p, aVar.f6014p) && M.c(this.f6015q, aVar.f6015q) && Arrays.equals(this.f6017s, aVar.f6017s);
    }

    public int hashCode() {
        int i7 = (527 + this.f6016r) * 31;
        String str = this.f6014p;
        int hashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6015q;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f6017s);
    }

    @Override // T0.i
    public String toString() {
        return this.f6042o + ": mimeType=" + this.f6014p + ", description=" + this.f6015q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f6014p);
        parcel.writeString(this.f6015q);
        parcel.writeInt(this.f6016r);
        parcel.writeByteArray(this.f6017s);
    }

    public a(String str, String str2, int i7, byte[] bArr) {
        super("APIC");
        this.f6014p = str;
        this.f6015q = str2;
        this.f6016r = i7;
        this.f6017s = bArr;
    }
}
