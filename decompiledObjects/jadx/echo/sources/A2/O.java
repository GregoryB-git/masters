package A2;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class O extends M2.b implements P {
    public static P o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof P ? (P) queryLocalInterface : new N(iBinder);
    }
}
