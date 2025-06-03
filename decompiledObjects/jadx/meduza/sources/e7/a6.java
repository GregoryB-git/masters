package e7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a6 implements Parcelable.Creator<b6> {
    @Override // android.os.Parcelable.Creator
    public final b6 createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        long j10 = 0;
        long j11 = 0;
        byte[] bArr = null;
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        int i10 = 0;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j10 = n6.b.q(readInt, parcel);
                    break;
                case 2:
                    bArr = n6.b.c(readInt, parcel);
                    break;
                case 3:
                    str = n6.b.f(readInt, parcel);
                    break;
                case 4:
                    bundle = n6.b.b(readInt, parcel);
                    break;
                case 5:
                    i10 = n6.b.o(readInt, parcel);
                    break;
                case 6:
                    j11 = n6.b.q(readInt, parcel);
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
        return new b6(j10, bArr, str, bundle, i10, j11, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b6[] newArray(int i10) {
        return new b6[i10];
    }
}
