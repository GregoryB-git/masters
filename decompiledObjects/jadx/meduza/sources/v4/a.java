package v4;

import a0.j;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.f;
import java.util.Arrays;
import p4.a;
import v3.i0;
import v3.p0;
import v5.e0;

/* loaded from: classes.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0249a();

    /* renamed from: a, reason: collision with root package name */
    public final String f15845a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f15846b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15847c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15848d;

    /* renamed from: v4.a$a, reason: collision with other inner class name */
    public class C0249a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = e0.f15881a;
        this.f15845a = readString;
        this.f15846b = parcel.createByteArray();
        this.f15847c = parcel.readInt();
        this.f15848d = parcel.readInt();
    }

    public a(String str, byte[] bArr, int i10, int i11) {
        this.f15845a = str;
        this.f15846b = bArr;
        this.f15847c = i10;
        this.f15848d = i11;
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
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f15845a.equals(aVar.f15845a) && Arrays.equals(this.f15846b, aVar.f15846b) && this.f15847c == aVar.f15847c && this.f15848d == aVar.f15848d;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f15846b) + j.e(this.f15845a, 527, 31)) * 31) + this.f15847c) * 31) + this.f15848d;
    }

    @Override // p4.a.b
    public final /* synthetic */ void l(p0.a aVar) {
    }

    @Override // p4.a.b
    public final /* synthetic */ i0 n() {
        return null;
    }

    public final String toString() {
        StringBuilder l10 = f.l("mdta: key=");
        l10.append(this.f15845a);
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15845a);
        parcel.writeByteArray(this.f15846b);
        parcel.writeInt(this.f15847c);
        parcel.writeInt(this.f15848d);
    }
}
