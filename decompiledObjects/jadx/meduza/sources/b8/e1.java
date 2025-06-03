package b8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaic;

/* loaded from: classes.dex */
public final class e1 implements Parcelable.Creator<c1> {
    @Override // android.os.Parcelable.Creator
    public final c1 createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        zzaic zzaicVar = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
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
                    str3 = n6.b.f(readInt, parcel);
                    break;
                case 4:
                    zzaicVar = (zzaic) n6.b.e(parcel, readInt, zzaic.CREATOR);
                    break;
                case 5:
                    str4 = n6.b.f(readInt, parcel);
                    break;
                case 6:
                    str5 = n6.b.f(readInt, parcel);
                    break;
                case 7:
                    str6 = n6.b.f(readInt, parcel);
                    break;
                default:
                    n6.b.t(readInt, parcel);
                    break;
            }
        }
        n6.b.j(u10, parcel);
        return new c1(str, str2, str3, zzaicVar, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c1[] newArray(int i10) {
        return new c1[i10];
    }
}
