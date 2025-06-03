package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import n6.b;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        HashSet hashSet = new HashSet();
        int i10 = 0;
        i iVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            int i11 = 1;
            if (c10 != 1) {
                i11 = 2;
                if (c10 != 2) {
                    i11 = 3;
                    if (c10 != 3) {
                        i11 = 4;
                        if (c10 != 4) {
                            i11 = 5;
                            if (c10 != 5) {
                                n6.b.t(readInt, parcel);
                            } else {
                                str3 = n6.b.f(readInt, parcel);
                            }
                        } else {
                            str2 = n6.b.f(readInt, parcel);
                        }
                    } else {
                        str = n6.b.f(readInt, parcel);
                    }
                } else {
                    iVar = (i) n6.b.e(parcel, readInt, i.CREATOR);
                }
            } else {
                i10 = n6.b.o(readInt, parcel);
            }
            hashSet.add(Integer.valueOf(i11));
        }
        if (parcel.dataPosition() == u10) {
            return new g(hashSet, i10, iVar, str, str2, str3);
        }
        throw new b.a(defpackage.f.h("Overread allowed size end=", u10), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
