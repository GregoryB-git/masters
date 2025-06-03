package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class A0 extends Y implements InterfaceC1071y0 {
    public A0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1071y0
    public final void l(Bundle bundle) {
        Parcel n7 = n();
        AbstractC0856a0.d(n7, bundle);
        v(1, n7);
    }
}
