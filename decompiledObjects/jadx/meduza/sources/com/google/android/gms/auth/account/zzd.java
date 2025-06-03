package com.google.android.gms.auth.account;

import a6.c;
import a6.d;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.auth.zzb;

/* loaded from: classes.dex */
public abstract class zzd extends zzb implements d {
    public static d zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new c(iBinder);
    }
}
