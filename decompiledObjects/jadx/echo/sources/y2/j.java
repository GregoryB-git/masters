package y2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import x2.C2188b;

/* loaded from: classes.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u7 = B2.b.u(parcel);
        int i7 = 0;
        int i8 = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        C2188b c2188b = null;
        while (parcel.dataPosition() < u7) {
            int n7 = B2.b.n(parcel);
            int i9 = B2.b.i(n7);
            if (i9 == 1) {
                i8 = B2.b.p(parcel, n7);
            } else if (i9 == 2) {
                str = B2.b.d(parcel, n7);
            } else if (i9 == 3) {
                pendingIntent = (PendingIntent) B2.b.c(parcel, n7, PendingIntent.CREATOR);
            } else if (i9 == 4) {
                c2188b = (C2188b) B2.b.c(parcel, n7, C2188b.CREATOR);
            } else if (i9 != 1000) {
                B2.b.t(parcel, n7);
            } else {
                i7 = B2.b.p(parcel, n7);
            }
        }
        B2.b.h(parcel, u7);
        return new Status(i7, i8, str, pendingIntent, c2188b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new Status[i7];
    }
}
