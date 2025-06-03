package R2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: R2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0553m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < u7) {
            int n7 = B2.b.n(parcel);
            if (B2.b.i(n7) != 1) {
                B2.b.t(parcel, n7);
            } else {
                bundle = B2.b.a(parcel, n7);
            }
        }
        B2.b.h(parcel, u7);
        return new C0560n(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C0560n[i7];
    }
}
