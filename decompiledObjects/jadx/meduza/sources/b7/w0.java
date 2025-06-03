package b7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class w0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        byte[] bArr = null;
        Double d10 = null;
        String str = null;
        ArrayList arrayList = null;
        Integer num = null;
        d0 d0Var = null;
        String str2 = null;
        d dVar = null;
        Long l10 = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    bArr = n6.b.c(readInt, parcel);
                    break;
                case 3:
                    d10 = n6.b.m(readInt, parcel);
                    break;
                case 4:
                    str = n6.b.f(readInt, parcel);
                    break;
                case 5:
                    arrayList = n6.b.i(parcel, readInt, v.CREATOR);
                    break;
                case 6:
                    num = n6.b.p(readInt, parcel);
                    break;
                case 7:
                    d0Var = (d0) n6.b.e(parcel, readInt, d0.CREATOR);
                    break;
                case '\b':
                    str2 = n6.b.f(readInt, parcel);
                    break;
                case '\t':
                    dVar = (d) n6.b.e(parcel, readInt, d.CREATOR);
                    break;
                case '\n':
                    l10 = n6.b.r(readInt, parcel);
                    break;
                default:
                    n6.b.t(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new x(bArr, d10, str, arrayList, num, d0Var, str2, dVar, l10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new x[i10];
    }
}
