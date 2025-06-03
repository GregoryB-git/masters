package c8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzagw;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator<i> {
    @Override // android.os.Parcelable.Creator
    public final i createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        zzagw zzagwVar = null;
        e eVar = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        Boolean bool = null;
        k kVar = null;
        b8.c1 c1Var = null;
        e0 e0Var = null;
        ArrayList arrayList3 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    zzagwVar = (zzagw) n6.b.e(parcel, readInt, zzagw.CREATOR);
                    break;
                case 2:
                    eVar = (e) n6.b.e(parcel, readInt, e.CREATOR);
                    break;
                case 3:
                    str = n6.b.f(readInt, parcel);
                    break;
                case 4:
                    str2 = n6.b.f(readInt, parcel);
                    break;
                case 5:
                    arrayList = n6.b.i(parcel, readInt, e.CREATOR);
                    break;
                case 6:
                    arrayList2 = n6.b.g(readInt, parcel);
                    break;
                case 7:
                    str3 = n6.b.f(readInt, parcel);
                    break;
                case '\b':
                    bool = n6.b.l(readInt, parcel);
                    break;
                case '\t':
                    kVar = (k) n6.b.e(parcel, readInt, k.CREATOR);
                    break;
                case '\n':
                    z10 = n6.b.k(readInt, parcel);
                    break;
                case 11:
                    c1Var = (b8.c1) n6.b.e(parcel, readInt, b8.c1.CREATOR);
                    break;
                case '\f':
                    e0Var = (e0) n6.b.e(parcel, readInt, e0.CREATOR);
                    break;
                case '\r':
                    arrayList3 = n6.b.i(parcel, readInt, b8.t0.CREATOR);
                    break;
                default:
                    n6.b.t(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new i(zzagwVar, eVar, str, str2, arrayList, arrayList2, str3, bool, kVar, z10, c1Var, e0Var, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i[] newArray(int i10) {
        return new i[i10];
    }
}
