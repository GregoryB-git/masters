package b7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        y yVar = null;
        a0 a0Var = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        Double d10 = null;
        ArrayList arrayList2 = null;
        k kVar = null;
        Integer num = null;
        d0 d0Var = null;
        String str = null;
        d dVar = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    yVar = (y) n6.b.e(parcel, readInt, y.CREATOR);
                    break;
                case 3:
                    a0Var = (a0) n6.b.e(parcel, readInt, a0.CREATOR);
                    break;
                case 4:
                    bArr = n6.b.c(readInt, parcel);
                    break;
                case 5:
                    arrayList = n6.b.i(parcel, readInt, w.CREATOR);
                    break;
                case 6:
                    d10 = n6.b.m(readInt, parcel);
                    break;
                case 7:
                    arrayList2 = n6.b.i(parcel, readInt, v.CREATOR);
                    break;
                case '\b':
                    kVar = (k) n6.b.e(parcel, readInt, k.CREATOR);
                    break;
                case '\t':
                    num = n6.b.p(readInt, parcel);
                    break;
                case '\n':
                    d0Var = (d0) n6.b.e(parcel, readInt, d0.CREATOR);
                    break;
                case 11:
                    str = n6.b.f(readInt, parcel);
                    break;
                case '\f':
                    dVar = (d) n6.b.e(parcel, readInt, d.CREATOR);
                    break;
                default:
                    n6.b.t(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new u(yVar, a0Var, bArr, arrayList, d10, arrayList2, kVar, num, d0Var, str, dVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new u[i10];
    }
}
