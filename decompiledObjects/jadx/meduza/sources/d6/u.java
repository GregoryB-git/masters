package d6;

import android.os.Parcel;
import android.os.Parcelable;
import d6.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z10 = n6.b.k(readInt, parcel);
                    break;
                case 2:
                    str = n6.b.f(readInt, parcel);
                    break;
                case 3:
                    str2 = n6.b.f(readInt, parcel);
                    break;
                case 4:
                    z11 = n6.b.k(readInt, parcel);
                    break;
                case 5:
                    str3 = n6.b.f(readInt, parcel);
                    break;
                case 6:
                    arrayList = n6.b.g(readInt, parcel);
                    break;
                case 7:
                    z12 = n6.b.k(readInt, parcel);
                    break;
                default:
                    n6.b.t(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new b.a(z10, str, str2, z11, str3, arrayList, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b.a[i10];
    }
}
