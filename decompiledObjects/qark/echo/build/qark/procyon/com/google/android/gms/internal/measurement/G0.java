// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Bundle;
import android.os.IBinder;

public final class G0 extends Y implements E0
{
    public G0(final IBinder binder) {
        super(binder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }
    
    @Override
    public final void L(final String s, final String s2, final Bundle bundle, final long n) {
        final Parcel n2 = this.n();
        n2.writeString(s);
        n2.writeString(s2);
        a0.d(n2, (Parcelable)bundle);
        n2.writeLong(n);
        this.v(1, n2);
    }
    
    @Override
    public final int a() {
        final Parcel o = this.o(2, this.n());
        final int int1 = o.readInt();
        o.recycle();
        return int1;
    }
}
