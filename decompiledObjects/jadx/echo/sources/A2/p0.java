package A2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class p0 extends M2.b implements q0 {
    public p0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static q0 o(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof q0 ? (q0) queryLocalInterface : new o0(iBinder);
    }

    @Override // M2.b
    public final boolean n(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            H2.a d7 = d();
            parcel2.writeNoException();
            M2.c.e(parcel2, d7);
        } else {
            if (i7 != 2) {
                return false;
            }
            int c7 = c();
            parcel2.writeNoException();
            parcel2.writeInt(c7);
        }
        return true;
    }
}
