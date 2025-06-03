package w2;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: w2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2084f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C2086h(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i7) {
        return new C2086h[i7];
    }
}
