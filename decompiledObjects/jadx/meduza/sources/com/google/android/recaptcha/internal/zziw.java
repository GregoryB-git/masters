package com.google.android.recaptcha.internal;

import android.app.Application;
import ec.j;

/* loaded from: classes.dex */
public final class zziw extends j implements dc.a {
    public static final zziw zza = new zziw();

    public zziw() {
        super(0);
    }

    @Override // dc.a
    public final Object invoke() {
        int i10 = zzav.zza;
        Object zzb = zzau.zza().zzb(Application.class.getName().hashCode());
        if (zzb != null) {
            return (Application) zzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
