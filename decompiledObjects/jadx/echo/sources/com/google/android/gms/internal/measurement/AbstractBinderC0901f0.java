package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.measurement.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0901f0 extends AbstractBinderC0865b0 implements InterfaceC0874c0 {
    public static InterfaceC0874c0 o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof InterfaceC0874c0 ? (InterfaceC0874c0) queryLocalInterface : new C0892e0(iBinder);
    }
}
