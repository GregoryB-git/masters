package x4;

import android.os.Parcel;
import android.os.Parcelable;
import s4.b;

/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0260a();

    /* renamed from: x4.a$a, reason: collision with other inner class name */
    public class C0260a implements Parcelable.Creator<a> {
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
        super(parcel);
    }

    public a(String str, String str2) {
        super(str, str2);
    }
}
