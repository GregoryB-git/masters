package z5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        String str = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        long j10 = 0;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = n6.b.o(readInt, parcel);
                    break;
                case 2:
                    j10 = n6.b.q(readInt, parcel);
                    break;
                case 3:
                    str = n6.b.f(readInt, parcel);
                    break;
                case 4:
                    i11 = n6.b.o(readInt, parcel);
                    break;
                case 5:
                    i12 = n6.b.o(readInt, parcel);
                    break;
                case 6:
                    str2 = n6.b.f(readInt, parcel);
                    break;
                default:
                    n6.b.t(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new a(i10, j10, str, i11, i12, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
