package x2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: x2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2205s implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        int i7 = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i8 = 0;
        while (parcel.dataPosition() < u7) {
            int n7 = B2.b.n(parcel);
            int i9 = B2.b.i(n7);
            if (i9 == 1) {
                i7 = B2.b.p(parcel, n7);
            } else if (i9 == 2) {
                i8 = B2.b.p(parcel, n7);
            } else if (i9 == 3) {
                pendingIntent = (PendingIntent) B2.b.c(parcel, n7, PendingIntent.CREATOR);
            } else if (i9 != 4) {
                B2.b.t(parcel, n7);
            } else {
                str = B2.b.d(parcel, n7);
            }
        }
        B2.b.h(parcel, u7);
        return new C2188b(i7, i8, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C2188b[i7];
    }
}
