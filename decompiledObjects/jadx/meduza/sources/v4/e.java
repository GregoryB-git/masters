package v4;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.f;
import p4.a;
import v3.i0;
import v3.p0;

/* loaded from: classes.dex */
public final class e implements a.b {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final float f15859a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15860b;

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

    public e(float f, int i10) {
        this.f15859a = f;
        this.f15860b = i10;
    }

    public e(Parcel parcel) {
        this.f15859a = parcel.readFloat();
        this.f15860b = parcel.readInt();
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
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f15859a == eVar.f15859a && this.f15860b == eVar.f15860b;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f15859a).hashCode() + 527) * 31) + this.f15860b;
    }

    @Override // p4.a.b
    public final /* synthetic */ void l(p0.a aVar) {
    }

    @Override // p4.a.b
    public final /* synthetic */ i0 n() {
        return null;
    }

    public final String toString() {
        StringBuilder l10 = f.l("smta: captureFrameRate=");
        l10.append(this.f15859a);
        l10.append(", svcTemporalLayerCount=");
        l10.append(this.f15860b);
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f15859a);
        parcel.writeInt(this.f15860b);
    }
}
