// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

public abstract class B0 extends b0 implements y0
{
    public B0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }
    
    @Override
    public final boolean n(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n == 1) {
            final Bundle bundle = (Bundle)a0.a(parcel, Bundle.CREATOR);
            a0.f(parcel);
            this.l(bundle);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
