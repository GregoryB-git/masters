package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class G0 extends Y implements E0 {
    public G0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.E0
    public final void L(String str, String str2, Bundle bundle, long j7) {
        Parcel n7 = n();
        n7.writeString(str);
        n7.writeString(str2);
        AbstractC0856a0.d(n7, bundle);
        n7.writeLong(j7);
        v(1, n7);
    }

    @Override // com.google.android.gms.internal.measurement.E0
    public final int a() {
        Parcel o7 = o(2, n());
        int readInt = o7.readInt();
        o7.recycle();
        return readInt;
    }
}
