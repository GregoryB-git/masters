package e7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class p6 implements Parcelable.Creator<q6> {
    @Override // android.os.Parcelable.Creator
    public final q6 createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        String str = null;
        Long l10 = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d10 = null;
        int i10 = 0;
        long j10 = 0;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = n6.b.o(readInt, parcel);
                    break;
                case 2:
                    str = n6.b.f(readInt, parcel);
                    break;
                case 3:
                    j10 = n6.b.q(readInt, parcel);
                    break;
                case 4:
                    l10 = n6.b.r(readInt, parcel);
                    break;
                case 5:
                    int s10 = n6.b.s(readInt, parcel);
                    if (s10 != 0) {
                        n6.b.v(parcel, s10, 4);
                        f = Float.valueOf(parcel.readFloat());
                        break;
                    } else {
                        f = null;
                        break;
                    }
                case 6:
                    str2 = n6.b.f(readInt, parcel);
                    break;
                case 7:
                    str3 = n6.b.f(readInt, parcel);
                    break;
                case '\b':
                    d10 = n6.b.m(readInt, parcel);
                    break;
                default:
                    n6.b.t(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new q6(i10, str, j10, l10, f, str2, str3, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ q6[] newArray(int i10) {
        return new q6[i10];
    }
}
