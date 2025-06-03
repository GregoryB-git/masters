package m6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = n6.b.o(readInt, parcel);
                    break;
                case 2:
                    i11 = n6.b.o(readInt, parcel);
                    break;
                case 3:
                    i12 = n6.b.o(readInt, parcel);
                    break;
                case 4:
                    j10 = n6.b.q(readInt, parcel);
                    break;
                case 5:
                    j11 = n6.b.q(readInt, parcel);
                    break;
                case 6:
                    str = n6.b.f(readInt, parcel);
                    break;
                case 7:
                    str2 = n6.b.f(readInt, parcel);
                    break;
                case '\b':
                    i13 = n6.b.o(readInt, parcel);
                    break;
                case '\t':
                    i14 = n6.b.o(readInt, parcel);
                    break;
                default:
                    n6.b.t(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new g(i10, i11, i12, j10, j11, str, str2, i13, i14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
