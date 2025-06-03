package s4;

import a0.j;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.f;
import java.util.Arrays;
import n7.d;
import p4.a;
import v3.i0;
import v3.p0;
import v5.e0;
import v5.u;

/* loaded from: classes.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0218a();

    /* renamed from: a, reason: collision with root package name */
    public final int f14157a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14158b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14159c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14160d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14161e;
    public final int f;

    /* renamed from: o, reason: collision with root package name */
    public final int f14162o;

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f14163p;

    /* renamed from: s4.a$a, reason: collision with other inner class name */
    public class C0218a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f14157a = i10;
        this.f14158b = str;
        this.f14159c = str2;
        this.f14160d = i11;
        this.f14161e = i12;
        this.f = i13;
        this.f14162o = i14;
        this.f14163p = bArr;
    }

    public a(Parcel parcel) {
        this.f14157a = parcel.readInt();
        String readString = parcel.readString();
        int i10 = e0.f15881a;
        this.f14158b = readString;
        this.f14159c = parcel.readString();
        this.f14160d = parcel.readInt();
        this.f14161e = parcel.readInt();
        this.f = parcel.readInt();
        this.f14162o = parcel.readInt();
        this.f14163p = parcel.createByteArray();
    }

    public static a a(u uVar) {
        int f = uVar.f();
        String t = uVar.t(uVar.f(), d.f11282a);
        String s10 = uVar.s(uVar.f());
        int f10 = uVar.f();
        int f11 = uVar.f();
        int f12 = uVar.f();
        int f13 = uVar.f();
        int f14 = uVar.f();
        byte[] bArr = new byte[f14];
        uVar.d(bArr, 0, f14);
        return new a(f, t, s10, f10, f11, f12, f13, bArr);
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
        return this.f14157a == aVar.f14157a && this.f14158b.equals(aVar.f14158b) && this.f14159c.equals(aVar.f14159c) && this.f14160d == aVar.f14160d && this.f14161e == aVar.f14161e && this.f == aVar.f && this.f14162o == aVar.f14162o && Arrays.equals(this.f14163p, aVar.f14163p);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14163p) + ((((((((j.e(this.f14159c, j.e(this.f14158b, (this.f14157a + 527) * 31, 31), 31) + this.f14160d) * 31) + this.f14161e) * 31) + this.f) * 31) + this.f14162o) * 31);
    }

    @Override // p4.a.b
    public final void l(p0.a aVar) {
        aVar.a(this.f14163p, this.f14157a);
    }

    @Override // p4.a.b
    public final /* synthetic */ i0 n() {
        return null;
    }

    public final String toString() {
        StringBuilder l10 = f.l("Picture: mimeType=");
        l10.append(this.f14158b);
        l10.append(", description=");
        l10.append(this.f14159c);
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14157a);
        parcel.writeString(this.f14158b);
        parcel.writeString(this.f14159c);
        parcel.writeInt(this.f14160d);
        parcel.writeInt(this.f14161e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.f14162o);
        parcel.writeByteArray(this.f14163p);
    }
}
