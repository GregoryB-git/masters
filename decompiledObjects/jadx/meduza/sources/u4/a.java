package u4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import v3.p0;
import v5.e0;

/* loaded from: classes.dex */
public final class a extends h {
    public static final Parcelable.Creator<a> CREATOR = new C0241a();

    /* renamed from: b, reason: collision with root package name */
    public final String f14937b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14938c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14939d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f14940e;

    /* renamed from: u4.a$a, reason: collision with other inner class name */
    public class C0241a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f14937b = str;
        this.f14938c = str2;
        this.f14939d = i10;
        this.f14940e = bArr;
    }

    public a(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i10 = e0.f15881a;
        this.f14937b = readString;
        this.f14938c = parcel.readString();
        this.f14939d = parcel.readInt();
        this.f14940e = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f14939d == aVar.f14939d && e0.a(this.f14937b, aVar.f14937b) && e0.a(this.f14938c, aVar.f14938c) && Arrays.equals(this.f14940e, aVar.f14940e);
    }

    public final int hashCode() {
        int i10 = (527 + this.f14939d) * 31;
        String str = this.f14937b;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14938c;
        return Arrays.hashCode(this.f14940e) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // u4.h, p4.a.b
    public final void l(p0.a aVar) {
        aVar.a(this.f14940e, this.f14939d);
    }

    @Override // u4.h
    public final String toString() {
        return this.f14963a + ": mimeType=" + this.f14937b + ", description=" + this.f14938c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14937b);
        parcel.writeString(this.f14938c);
        parcel.writeInt(this.f14939d);
        parcel.writeByteArray(this.f14940e);
    }
}
