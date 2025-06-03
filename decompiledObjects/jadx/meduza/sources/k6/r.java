package k6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        String str = null;
        j6.b bVar = null;
        int i10 = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = n6.b.o(readInt, parcel);
            } else if (c10 == 2) {
                str = n6.b.f(readInt, parcel);
            } else if (c10 == 3) {
                pendingIntent = (PendingIntent) n6.b.e(parcel, readInt, PendingIntent.CREATOR);
            } else if (c10 != 4) {
                n6.b.t(readInt, parcel);
            } else {
                bVar = (j6.b) n6.b.e(parcel, readInt, j6.b.CREATOR);
            }
        }
        n6.b.j(u10, parcel);
        return new Status(i10, str, pendingIntent, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
