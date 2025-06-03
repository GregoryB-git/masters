// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

public abstract class C0 extends b0 implements E0
{
    public C0() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }
    
    @Override
    public final boolean n(int a, final Parcel parcel, final Parcel parcel2, final int n) {
        if (a == 1) {
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final Bundle bundle = (Bundle)a0.a(parcel, Bundle.CREATOR);
            final long long1 = parcel.readLong();
            a0.f(parcel);
            this.L(string, string2, bundle, long1);
            parcel2.writeNoException();
            return true;
        }
        if (a != 2) {
            return false;
        }
        a = this.a();
        parcel2.writeNoException();
        parcel2.writeInt(a);
        return true;
    }
}
