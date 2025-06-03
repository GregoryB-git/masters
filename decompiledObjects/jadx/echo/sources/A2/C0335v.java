package A2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: A2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0335v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        int i7 = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < u7) {
            int n7 = B2.b.n(parcel);
            int i8 = B2.b.i(n7);
            if (i8 == 1) {
                i7 = B2.b.p(parcel, n7);
            } else if (i8 != 2) {
                B2.b.t(parcel, n7);
            } else {
                arrayList = B2.b.g(parcel, n7, C0326l.CREATOR);
            }
        }
        B2.b.h(parcel, u7);
        return new r(i7, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new r[i7];
    }
}
