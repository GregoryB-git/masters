package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import m7.r;
import m7.s;

/* loaded from: classes.dex */
public abstract class m extends b implements s {
    public static s b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return queryLocalInterface instanceof s ? (s) queryLocalInterface : new r(iBinder);
    }
}
