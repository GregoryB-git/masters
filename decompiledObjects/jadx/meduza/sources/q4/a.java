package q4;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.f;
import defpackage.g;
import p4.a;
import v3.i0;
import v3.p0;

/* loaded from: classes.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0200a();

    /* renamed from: a, reason: collision with root package name */
    public final int f13275a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13276b;

    /* renamed from: q4.a$a, reason: collision with other inner class name */
    public class C0200a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            readString.getClass();
            return new a(parcel.readInt(), readString);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, String str) {
        this.f13275a = i10;
        this.f13276b = str;
    }

    @Override // p4.a.b
    public final /* synthetic */ byte[] B() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p4.a.b
    public final /* synthetic */ void l(p0.a aVar) {
    }

    @Override // p4.a.b
    public final /* synthetic */ i0 n() {
        return null;
    }

    public final String toString() {
        StringBuilder l10 = f.l("Ait(controlCode=");
        l10.append(this.f13275a);
        l10.append(",url=");
        return g.f(l10, this.f13276b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13276b);
        parcel.writeInt(this.f13275a);
    }
}
