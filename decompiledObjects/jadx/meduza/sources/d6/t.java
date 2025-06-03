package d6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        boolean z10 = false;
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = n6.b.f(readInt, parcel);
                    break;
                case 2:
                    str2 = n6.b.f(readInt, parcel);
                    break;
                case 3:
                    str3 = n6.b.f(readInt, parcel);
                    break;
                case 4:
                    str4 = n6.b.f(readInt, parcel);
                    break;
                case 5:
                    z10 = n6.b.k(readInt, parcel);
                    break;
                case 6:
                    i10 = n6.b.o(readInt, parcel);
                    break;
                default:
                    n6.b.t(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new f(str, str2, str3, str4, z10, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
