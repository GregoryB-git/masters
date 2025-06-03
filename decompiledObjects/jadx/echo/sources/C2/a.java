package C2;

import A2.r;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class a extends K2.a implements IInterface {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void Z0(r rVar) {
        Parcel n7 = n();
        K2.c.c(n7, rVar);
        v(1, n7);
    }
}
