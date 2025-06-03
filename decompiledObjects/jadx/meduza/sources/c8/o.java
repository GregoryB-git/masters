package c8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o implements Parcelable.Creator<m> {
    @Override // android.os.Parcelable.Creator
    public final m createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        ArrayList arrayList = null;
        n nVar = null;
        String str = null;
        b8.c1 c1Var = null;
        i iVar = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    arrayList = n6.b.i(parcel, readInt, b8.h0.CREATOR);
                    break;
                case 2:
                    nVar = (n) n6.b.e(parcel, readInt, n.CREATOR);
                    break;
                case 3:
                    str = n6.b.f(readInt, parcel);
                    break;
                case 4:
                    c1Var = (b8.c1) n6.b.e(parcel, readInt, b8.c1.CREATOR);
                    break;
                case 5:
                    iVar = (i) n6.b.e(parcel, readInt, i.CREATOR);
                    break;
                case 6:
                    arrayList2 = n6.b.i(parcel, readInt, b8.l0.CREATOR);
                    break;
                default:
                    n6.b.t(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new m(arrayList, nVar, str, c1Var, iVar, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m[] newArray(int i10) {
        return new m[i10];
    }
}
