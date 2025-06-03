package T2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        int i7 = 0;
        Intent intent = null;
        int i8 = 0;
        while (parcel.dataPosition() < u7) {
            int n7 = B2.b.n(parcel);
            int i9 = B2.b.i(n7);
            if (i9 == 1) {
                i7 = B2.b.p(parcel, n7);
            } else if (i9 == 2) {
                i8 = B2.b.p(parcel, n7);
            } else if (i9 != 3) {
                B2.b.t(parcel, n7);
            } else {
                intent = (Intent) B2.b.c(parcel, n7, Intent.CREATOR);
            }
        }
        B2.b.h(parcel, u7);
        return new b(i7, i8, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new b[i7];
    }
}
