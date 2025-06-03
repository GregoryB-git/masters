package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import m7.p;

/* loaded from: classes.dex */
public abstract class h extends b implements p {
    public static p b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        return queryLocalInterface instanceof p ? (p) queryLocalInterface : new m7.o(iBinder);
    }
}
