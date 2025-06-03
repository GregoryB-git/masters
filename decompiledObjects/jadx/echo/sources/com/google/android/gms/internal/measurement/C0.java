package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class C0 extends AbstractBinderC0865b0 implements E0 {
    public C0() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0865b0
    public final boolean n(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Bundle bundle = (Bundle) AbstractC0856a0.a(parcel, Bundle.CREATOR);
            long readLong = parcel.readLong();
            AbstractC0856a0.f(parcel);
            L(readString, readString2, bundle, readLong);
            parcel2.writeNoException();
        } else {
            if (i7 != 2) {
                return false;
            }
            int a7 = a();
            parcel2.writeNoException();
            parcel2.writeInt(a7);
        }
        return true;
    }
}
