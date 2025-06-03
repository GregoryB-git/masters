package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c6 implements Parcelable.Creator<d6> {
    @Override // android.os.Parcelable.Creator
    public final d6 createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        while (true) {
            ArrayList arrayList = null;
            while (parcel.dataPosition() < u10) {
                int readInt = parcel.readInt();
                if (((char) readInt) != 1) {
                    n6.b.t(readInt, parcel);
                } else {
                    int s10 = n6.b.s(readInt, parcel);
                    int dataPosition = parcel.dataPosition();
                    if (s10 == 0) {
                        break;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int readInt2 = parcel.readInt();
                    for (int i10 = 0; i10 < readInt2; i10++) {
                        arrayList2.add(Integer.valueOf(parcel.readInt()));
                    }
                    parcel.setDataPosition(dataPosition + s10);
                    arrayList = arrayList2;
                }
            }
            n6.b.j(u10, parcel);
            return new d6(arrayList);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d6[] newArray(int i10) {
        return new d6[i10];
    }
}
