package A2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class L extends M2.b implements InterfaceC0324j {
    public L() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // M2.b
    public final boolean n(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) M2.c.a(parcel, Bundle.CREATOR);
            M2.c.b(parcel);
            W0(readInt, readStrongBinder, bundle);
        } else if (i7 == 2) {
            int readInt2 = parcel.readInt();
            Bundle bundle2 = (Bundle) M2.c.a(parcel, Bundle.CREATOR);
            M2.c.b(parcel);
            q0(readInt2, bundle2);
        } else {
            if (i7 != 3) {
                return false;
            }
            int readInt3 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            a0 a0Var = (a0) M2.c.a(parcel, a0.CREATOR);
            M2.c.b(parcel);
            F0(readInt3, readStrongBinder2, a0Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
