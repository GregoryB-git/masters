package c8;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator<e> {
    @Override // android.os.Parcelable.Creator
    public final e createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = n6.b.f(readInt, parcel);
                    break;
                case 2:
                    str2 = n6.b.f(readInt, parcel);
                    break;
                case 3:
                    str5 = n6.b.f(readInt, parcel);
                    break;
                case 4:
                    str4 = n6.b.f(readInt, parcel);
                    break;
                case 5:
                    str3 = n6.b.f(readInt, parcel);
                    break;
                case 6:
                    str6 = n6.b.f(readInt, parcel);
                    break;
                case 7:
                    z10 = n6.b.k(readInt, parcel);
                    break;
                case '\b':
                    str7 = n6.b.f(readInt, parcel);
                    break;
                default:
                    n6.b.t(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new e(str, str2, str3, str4, str5, str6, z10, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e[] newArray(int i10) {
        return new e[i10];
    }
}
