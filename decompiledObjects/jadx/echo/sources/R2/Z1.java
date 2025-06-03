package R2;

import A2.AbstractC0317c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import x2.AbstractC2200n;

/* loaded from: classes.dex */
public final class Z1 extends AbstractC0317c {
    public Z1(Context context, Looper looper, AbstractC0317c.a aVar, AbstractC0317c.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // A2.AbstractC0317c
    public final String E() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // A2.AbstractC0317c
    public final String F() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // A2.AbstractC0317c, y2.C2270a.f
    public final int h() {
        return AbstractC2200n.f21186a;
    }

    @Override // A2.AbstractC0317c
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof R1 ? (R1) queryLocalInterface : new T1(iBinder);
    }
}
