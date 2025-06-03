package b7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class u1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        String str = null;
        Boolean bool = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                str = n6.b.f(readInt, parcel);
            } else if (c10 == 3) {
                bool = n6.b.l(readInt, parcel);
            } else if (c10 == 4) {
                str2 = n6.b.f(readInt, parcel);
            } else if (c10 != 5) {
                n6.b.t(readInt, parcel);
            } else {
                str3 = n6.b.f(readInt, parcel);
            }
        }
        n6.b.j(u10, parcel);
        return new k(str, bool, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new k[i10];
    }
}
