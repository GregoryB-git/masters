// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.os.IInterface;
import android.os.IBinder;

public abstract class f0 extends b0 implements c0
{
    public static c0 o(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof c0) {
            return (c0)queryLocalInterface;
        }
        return new e0(binder);
    }
}
