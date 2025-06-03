package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class B0 extends AbstractBinderC0865b0 implements InterfaceC1071y0 {
    public B0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0865b0
    public final boolean n(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC0856a0.a(parcel, Bundle.CREATOR);
        AbstractC0856a0.f(parcel);
        l(bundle);
        parcel2.writeNoException();
        return true;
    }
}
