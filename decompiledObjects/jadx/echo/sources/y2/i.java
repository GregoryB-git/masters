package y2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        int i7 = 0;
        String str = null;
        while (parcel.dataPosition() < u7) {
            int n7 = B2.b.n(parcel);
            int i8 = B2.b.i(n7);
            if (i8 == 1) {
                i7 = B2.b.p(parcel, n7);
            } else if (i8 != 2) {
                B2.b.t(parcel, n7);
            } else {
                str = B2.b.d(parcel, n7);
            }
        }
        B2.b.h(parcel, u7);
        return new Scope(i7, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new Scope[i7];
    }
}
