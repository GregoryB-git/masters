package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;
import m6.d0;
import m6.e0;

/* loaded from: classes.dex */
public abstract class zzaf extends zzb implements e0 {
    public static e0 zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof e0 ? (e0) queryLocalInterface : new d0(iBinder);
    }
}
