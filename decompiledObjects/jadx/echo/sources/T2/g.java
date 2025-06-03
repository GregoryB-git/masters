package T2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class g extends K2.a implements IInterface {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void Z0(j jVar, f fVar) {
        Parcel n7 = n();
        K2.c.c(n7, jVar);
        K2.c.d(n7, fVar);
        o(12, n7);
    }
}
