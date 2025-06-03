package z5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.TokenData;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        Long l10 = null;
        ArrayList arrayList = null;
        String str2 = null;
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
                    l10 = n6.b.r(readInt, parcel);
                    break;
                case 4:
                    z10 = n6.b.k(readInt, parcel);
                    break;
                case 5:
                    z11 = n6.b.k(readInt, parcel);
                    break;
                case 6:
                    arrayList = n6.b.g(readInt, parcel);
                    break;
                case 7:
                    str2 = n6.b.f(readInt, parcel);
                    break;
                default:
                    n6.b.t(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new TokenData(i10, str, l10, z10, z11, arrayList, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new TokenData[i10];
    }
}
