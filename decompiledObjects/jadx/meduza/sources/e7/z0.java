package e7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes.dex */
public final class z0 extends com.google.android.gms.common.internal.a<n0> {
    public z0(Context context, Looper looper, i5 i5Var, i5 i5Var2) {
        super(context, looper, 93, i5Var, i5Var2, null);
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ n0 createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof n0 ? (n0) queryLocalInterface : new q0(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a, k6.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String getServiceDescriptor() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String getStartServiceAction() {
        return "com.google.android.gms.measurement.START";
    }
}
