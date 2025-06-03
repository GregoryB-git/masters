package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class K0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        long j7 = 0;
        long j8 = 0;
        boolean z7 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        while (parcel.dataPosition() < u7) {
            int n7 = B2.b.n(parcel);
            switch (B2.b.i(n7)) {
                case 1:
                    j7 = B2.b.q(parcel, n7);
                    break;
                case 2:
                    j8 = B2.b.q(parcel, n7);
                    break;
                case 3:
                    z7 = B2.b.j(parcel, n7);
                    break;
                case 4:
                    str = B2.b.d(parcel, n7);
                    break;
                case 5:
                    str2 = B2.b.d(parcel, n7);
                    break;
                case 6:
                    str3 = B2.b.d(parcel, n7);
                    break;
                case 7:
                    bundle = B2.b.a(parcel, n7);
                    break;
                case 8:
                    str4 = B2.b.d(parcel, n7);
                    break;
                default:
                    B2.b.t(parcel, n7);
                    break;
            }
        }
        B2.b.h(parcel, u7);
        return new H0(j7, j8, z7, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new H0[i7];
    }
}
