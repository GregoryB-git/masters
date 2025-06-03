package c7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        String str = null;
        byte[] bArr = null;
        int i10 = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = n6.b.o(readInt, parcel);
            } else if (c10 == 2) {
                bArr = n6.b.c(readInt, parcel);
            } else if (c10 == 3) {
                str = n6.b.f(readInt, parcel);
            } else if (c10 != 4) {
                n6.b.t(readInt, parcel);
            } else {
                arrayList = n6.b.i(parcel, readInt, Transport.CREATOR);
            }
        }
        n6.b.j(u10, parcel);
        return new b(i10, str, arrayList, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
