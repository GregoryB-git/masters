package b7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class l1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        r rVar = null;
        a2 a2Var = null;
        e0 e0Var = null;
        g2 g2Var = null;
        j0 j0Var = null;
        l0 l0Var = null;
        c2 c2Var = null;
        o0 o0Var = null;
        s sVar = null;
        q0 q0Var = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    rVar = (r) n6.b.e(parcel, readInt, r.CREATOR);
                    break;
                case 3:
                    a2Var = (a2) n6.b.e(parcel, readInt, a2.CREATOR);
                    break;
                case 4:
                    e0Var = (e0) n6.b.e(parcel, readInt, e0.CREATOR);
                    break;
                case 5:
                    g2Var = (g2) n6.b.e(parcel, readInt, g2.CREATOR);
                    break;
                case 6:
                    j0Var = (j0) n6.b.e(parcel, readInt, j0.CREATOR);
                    break;
                case 7:
                    l0Var = (l0) n6.b.e(parcel, readInt, l0.CREATOR);
                    break;
                case '\b':
                    c2Var = (c2) n6.b.e(parcel, readInt, c2.CREATOR);
                    break;
                case '\t':
                    o0Var = (o0) n6.b.e(parcel, readInt, o0.CREATOR);
                    break;
                case '\n':
                    sVar = (s) n6.b.e(parcel, readInt, s.CREATOR);
                    break;
                case 11:
                    q0Var = (q0) n6.b.e(parcel, readInt, q0.CREATOR);
                    break;
                default:
                    n6.b.t(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new d(rVar, a2Var, e0Var, g2Var, j0Var, l0Var, c2Var, o0Var, sVar, q0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
