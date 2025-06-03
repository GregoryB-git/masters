package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import n6.b;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        HashSet hashSet = new HashSet();
        int i10 = 0;
        ArrayList arrayList = null;
        e eVar = null;
        int i11 = 0;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            int i12 = 1;
            if (c10 != 1) {
                i12 = 2;
                if (c10 != 2) {
                    i12 = 3;
                    if (c10 != 3) {
                        i12 = 4;
                        if (c10 != 4) {
                            n6.b.t(readInt, parcel);
                        } else {
                            eVar = (e) n6.b.e(parcel, readInt, e.CREATOR);
                        }
                    } else {
                        i10 = n6.b.o(readInt, parcel);
                    }
                } else {
                    arrayList = n6.b.i(parcel, readInt, g.CREATOR);
                }
            } else {
                i11 = n6.b.o(readInt, parcel);
            }
            hashSet.add(Integer.valueOf(i12));
        }
        if (parcel.dataPosition() == u10) {
            return new b(hashSet, i11, arrayList, i10, eVar);
        }
        throw new b.a(defpackage.f.h("Overread allowed size end=", u10), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
