package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import ub.e;
import x6.b;

/* loaded from: classes.dex */
public final class zzcq {
    private static zzcv zza;

    public static final zzcv zza(Application application) {
        zzcv zzcvVar = zza;
        if (zzcvVar == null) {
            zzcvVar = new zzcv(application);
        }
        if (zza == null) {
            zza = zzcvVar;
        }
        return zzcvVar;
    }

    public static final Object zzb(Application application, String str, long j10, e eVar) {
        return zzcv.zzh(zza(application), str, j10, null, null, null, eVar, 28, null);
    }

    public static final Task zzc(Application application, String str, long j10) {
        return zzas.zza(b.h(zza(application).zzd().zza(), new zzco(application, str, j10, null)));
    }

    public static final Object zzd(Application application, String str, e eVar) {
        Object zzh;
        zzh = zzcv.zzh(r0, str, 0L, null, zza(application).zzf, zzch.zzb, eVar, 2, null);
        return zzh;
    }

    public static final Task zze(Application application, String str) {
        return zzas.zza(b.h(zza(application).zzd().zza(), new zzcp(application, str, null)));
    }
}
