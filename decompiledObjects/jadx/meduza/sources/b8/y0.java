package b8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaia;

/* loaded from: classes.dex */
public final class y0 implements Parcelable.Creator<l0> {
    @Override // android.os.Parcelable.Creator
    public final l0 createFromParcel(Parcel parcel) {
        int u10 = n6.b.u(parcel);
        String str = null;
        String str2 = null;
        zzaia zzaiaVar = null;
        long j10 = 0;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = n6.b.f(readInt, parcel);
            } else if (c10 == 2) {
                str2 = n6.b.f(readInt, parcel);
            } else if (c10 == 3) {
                j10 = n6.b.q(readInt, parcel);
            } else if (c10 != 4) {
                n6.b.t(readInt, parcel);
            } else {
                zzaiaVar = (zzaia) n6.b.e(parcel, readInt, zzaia.CREATOR);
            }
        }
        n6.b.j(u10, parcel);
        return new l0(str, str2, j10, zzaiaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l0[] newArray(int i10) {
        return new l0[i10];
    }
}
