package b7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class t0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        h hVar = null;
        g gVar = null;
        i iVar = null;
        e eVar = null;
        String str3 = null;
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
                    bArr = n6.b.c(readInt, parcel);
                    break;
                case 4:
                    hVar = (h) n6.b.e(parcel, readInt, h.CREATOR);
                    break;
                case 5:
                    gVar = (g) n6.b.e(parcel, readInt, g.CREATOR);
                    break;
                case 6:
                    iVar = (i) n6.b.e(parcel, readInt, i.CREATOR);
                    break;
                case 7:
                    eVar = (e) n6.b.e(parcel, readInt, e.CREATOR);
                    break;
                case '\b':
                    str3 = n6.b.f(readInt, parcel);
                    break;
                default:
                    n6.b.t(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new t(str, str2, bArr, hVar, gVar, iVar, eVar, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new t[i10];
    }
}
