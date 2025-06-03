package t6;

import android.os.Parcel;
import android.os.Parcelable;
import t6.a;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        String str = null;
        String str2 = null;
        s6.b bVar = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        boolean z11 = false;
        int i13 = 0;
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
                    z10 = n6.b.k(readInt, parcel);
                    break;
                case 4:
                    i12 = n6.b.o(readInt, parcel);
                    break;
                case 5:
                    z11 = n6.b.k(readInt, parcel);
                    break;
                case 6:
                    str = n6.b.f(readInt, parcel);
                    break;
                case 7:
                    i13 = n6.b.o(readInt, parcel);
                    break;
                case '\b':
                    str2 = n6.b.f(readInt, parcel);
                    break;
                case '\t':
                    bVar = (s6.b) n6.b.e(parcel, readInt, s6.b.CREATOR);
                    break;
                default:
                    n6.b.t(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new a.C0230a(i10, i11, z10, i12, z11, str, i13, str2, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a.C0230a[i10];
    }
}
