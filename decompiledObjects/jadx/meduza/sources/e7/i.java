package e7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i implements Parcelable.Creator<f> {
    @Override // android.os.Parcelable.Creator
    public final f createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        String str = null;
        String str2 = null;
        q6 q6Var = null;
        String str3 = null;
        f0 f0Var = null;
        f0 f0Var2 = null;
        f0 f0Var3 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = n6.b.f(readInt, parcel);
                    break;
                case 3:
                    str2 = n6.b.f(readInt, parcel);
                    break;
                case 4:
                    q6Var = (q6) n6.b.e(parcel, readInt, q6.CREATOR);
                    break;
                case 5:
                    j10 = n6.b.q(readInt, parcel);
                    break;
                case 6:
                    z10 = n6.b.k(readInt, parcel);
                    break;
                case 7:
                    str3 = n6.b.f(readInt, parcel);
                    break;
                case '\b':
                    f0Var = (f0) n6.b.e(parcel, readInt, f0.CREATOR);
                    break;
                case '\t':
                    j11 = n6.b.q(readInt, parcel);
                    break;
                case '\n':
                    f0Var2 = (f0) n6.b.e(parcel, readInt, f0.CREATOR);
                    break;
                case 11:
                    j12 = n6.b.q(readInt, parcel);
                    break;
                case '\f':
                    f0Var3 = (f0) n6.b.e(parcel, readInt, f0.CREATOR);
                    break;
                default:
                    n6.b.t(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new f(str, str2, q6Var, j10, z10, str3, f0Var, j11, f0Var2, j12, f0Var3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f[] newArray(int i10) {
        return new f[i10];
    }
}
