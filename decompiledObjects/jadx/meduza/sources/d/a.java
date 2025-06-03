package d;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0058a();

    /* renamed from: a, reason: collision with root package name */
    public final int f3305a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f3306b;

    /* renamed from: d.a$a, reason: collision with other inner class name */
    public class C0058a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, Intent intent) {
        this.f3305a = i10;
        this.f3306b = intent;
    }

    public a(Parcel parcel) {
        this.f3305a = parcel.readInt();
        this.f3306b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("ActivityResult{resultCode=");
        int i10 = this.f3305a;
        l10.append(i10 != -1 ? i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED" : "RESULT_OK");
        l10.append(", data=");
        l10.append(this.f3306b);
        l10.append('}');
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f3305a);
        parcel.writeInt(this.f3306b == null ? 0 : 1);
        Intent intent = this.f3306b;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }
}
