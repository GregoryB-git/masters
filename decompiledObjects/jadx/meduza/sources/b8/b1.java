package b8;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b1 implements Parcelable.Creator<c> {
    @Override // android.os.Parcelable.Creator
    public final c createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
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
                    str3 = n6.b.f(readInt, parcel);
                    break;
                case 4:
                    str4 = n6.b.f(readInt, parcel);
                    break;
                case 5:
                    z10 = n6.b.k(readInt, parcel);
                    break;
                case 6:
                    str5 = n6.b.f(readInt, parcel);
                    break;
                case 7:
                    z11 = n6.b.k(readInt, parcel);
                    break;
                case '\b':
                    str6 = n6.b.f(readInt, parcel);
                    break;
                case '\t':
                    i10 = n6.b.o(readInt, parcel);
                    break;
                case '\n':
                    str7 = n6.b.f(readInt, parcel);
                    break;
                case 11:
                    str8 = n6.b.f(readInt, parcel);
                    break;
                default:
                    n6.b.t(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new c(str, str2, str3, str4, z10, str5, z11, str6, i10, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c[] newArray(int i10) {
        return new c[i10];
    }
}
