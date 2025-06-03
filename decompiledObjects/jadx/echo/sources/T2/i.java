package T2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        ArrayList arrayList = null;
        String str = null;
        while (parcel.dataPosition() < u7) {
            int n7 = B2.b.n(parcel);
            int i7 = B2.b.i(n7);
            if (i7 == 1) {
                arrayList = B2.b.e(parcel, n7);
            } else if (i7 != 2) {
                B2.b.t(parcel, n7);
            } else {
                str = B2.b.d(parcel, n7);
            }
        }
        B2.b.h(parcel, u7);
        return new h(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new h[i7];
    }
}
