package c6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import n6.b;

/* loaded from: classes.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i10;
        int u10 = n6.b.u(parcel);
        HashSet hashSet = new HashSet();
        int i11 = 0;
        String str = null;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        a aVar = null;
        int i12 = 0;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i12 = n6.b.o(readInt, parcel);
                    i10 = 1;
                    break;
                case 2:
                    str = n6.b.f(readInt, parcel);
                    i10 = 2;
                    break;
                case 3:
                    i11 = n6.b.o(readInt, parcel);
                    i10 = 3;
                    break;
                case 4:
                    bArr = n6.b.c(readInt, parcel);
                    i10 = 4;
                    break;
                case 5:
                    pendingIntent = (PendingIntent) n6.b.e(parcel, readInt, PendingIntent.CREATOR);
                    i10 = 5;
                    break;
                case 6:
                    aVar = (a) n6.b.e(parcel, readInt, a.CREATOR);
                    i10 = 6;
                    break;
                default:
                    n6.b.t(readInt, parcel);
                    continue;
            }
            hashSet.add(Integer.valueOf(i10));
        }
        if (parcel.dataPosition() == u10) {
            return new i(hashSet, i12, str, i11, bArr, pendingIntent, aVar);
        }
        throw new b.a(defpackage.f.h("Overread allowed size end=", u10), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new i[i10];
    }
}
