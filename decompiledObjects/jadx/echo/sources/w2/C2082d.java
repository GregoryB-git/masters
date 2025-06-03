package w2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: w2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2082d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < u7) {
            int n7 = B2.b.n(parcel);
            if (B2.b.i(n7) != 1) {
                B2.b.t(parcel, n7);
            } else {
                intent = (Intent) B2.b.c(parcel, n7, Intent.CREATOR);
            }
        }
        B2.b.h(parcel, u7);
        return new C2079a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i7) {
        return new C2079a[i7];
    }
}
