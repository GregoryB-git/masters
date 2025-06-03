package t6;

import android.os.Parcel;
import android.os.Parcelable;
import t6.a;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        String str = null;
        int i10 = 0;
        a.C0230a c0230a = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = n6.b.o(readInt, parcel);
            } else if (c10 == 2) {
                str = n6.b.f(readInt, parcel);
            } else if (c10 != 3) {
                n6.b.t(readInt, parcel);
            } else {
                c0230a = (a.C0230a) n6.b.e(parcel, readInt, a.C0230a.CREATOR);
            }
        }
        n6.b.j(u10, parcel);
        return new g(c0230a, str, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
