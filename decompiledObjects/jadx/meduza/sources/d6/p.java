package d6;

import android.os.Parcel;
import android.os.Parcelable;
import d6.b;

/* loaded from: classes.dex */
public final class p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        boolean z10 = false;
        int i10 = 0;
        b.d dVar = null;
        b.a aVar = null;
        String str = null;
        b.c cVar = null;
        b.C0063b c0063b = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    dVar = (b.d) n6.b.e(parcel, readInt, b.d.CREATOR);
                    break;
                case 2:
                    aVar = (b.a) n6.b.e(parcel, readInt, b.a.CREATOR);
                    break;
                case 3:
                    str = n6.b.f(readInt, parcel);
                    break;
                case 4:
                    z10 = n6.b.k(readInt, parcel);
                    break;
                case 5:
                    i10 = n6.b.o(readInt, parcel);
                    break;
                case 6:
                    cVar = (b.c) n6.b.e(parcel, readInt, b.c.CREATOR);
                    break;
                case 7:
                    c0063b = (b.C0063b) n6.b.e(parcel, readInt, b.C0063b.CREATOR);
                    break;
                default:
                    n6.b.t(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new b(dVar, aVar, str, z10, i10, cVar, c0063b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
