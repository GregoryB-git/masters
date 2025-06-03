package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e6 implements Parcelable.Creator<f6> {
    @Override // android.os.Parcelable.Creator
    public final f6 createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                n6.b.t(readInt, parcel);
            } else {
                arrayList = n6.b.i(parcel, readInt, b6.CREATOR);
            }
        }
        n6.b.j(u10, parcel);
        return new f6(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f6[] newArray(int i10) {
        return new f6[i10];
    }
}
