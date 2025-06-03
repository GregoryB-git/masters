package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0892e0 extends Y implements InterfaceC0874c0 {
    public C0892e0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0874c0
    public final Bundle l(Bundle bundle) {
        Parcel n7 = n();
        AbstractC0856a0.d(n7, bundle);
        Parcel o7 = o(1, n7);
        Bundle bundle2 = (Bundle) AbstractC0856a0.a(o7, Bundle.CREATOR);
        o7.recycle();
        return bundle2;
    }
}
