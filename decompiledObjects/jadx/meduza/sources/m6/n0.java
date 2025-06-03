package m6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class n0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        l lVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    lVar = (l) n6.b.e(parcel, readInt, l.CREATOR);
                    break;
                case 2:
                    z10 = n6.b.k(readInt, parcel);
                    break;
                case 3:
                    z11 = n6.b.k(readInt, parcel);
                    break;
                case 4:
                    iArr = n6.b.d(readInt, parcel);
                    break;
                case 5:
                    i10 = n6.b.o(readInt, parcel);
                    break;
                case 6:
                    iArr2 = n6.b.d(readInt, parcel);
                    break;
                default:
                    n6.b.t(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new b(lVar, z10, z11, iArr, i10, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
