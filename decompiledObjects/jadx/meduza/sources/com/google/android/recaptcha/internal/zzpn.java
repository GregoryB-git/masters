package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
final class zzpn extends zzpl {
    @Override // com.google.android.recaptcha.internal.zzpl
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        if (zzpmVar != zzpm.zzc()) {
            return zzpmVar;
        }
        zzpm zzf = zzpm.zzf();
        zzndVar.zzc = zzf;
        return zzf;
    }

    @Override // com.google.android.recaptcha.internal.zzpl
    public final /* synthetic */ Object zzb() {
        return zzpm.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zzpl
    public final /* synthetic */ Object zzc(Object obj) {
        zzpm zzpmVar = (zzpm) obj;
        zzpmVar.zzh();
        return zzpmVar;
    }

    @Override // com.google.android.recaptcha.internal.zzpl
    public final /* bridge */ /* synthetic */ void zzd(Object obj, int i10, int i11) {
        ((zzpm) obj).zzj((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // com.google.android.recaptcha.internal.zzpl
    public final /* bridge */ /* synthetic */ void zze(Object obj, int i10, long j10) {
        ((zzpm) obj).zzj((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // com.google.android.recaptcha.internal.zzpl
    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i10, Object obj2) {
        ((zzpm) obj).zzj((i10 << 3) | 3, (zzpm) obj2);
    }

    @Override // com.google.android.recaptcha.internal.zzpl
    public final /* bridge */ /* synthetic */ void zzg(Object obj, int i10, zzle zzleVar) {
        ((zzpm) obj).zzj((i10 << 3) | 2, zzleVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpl
    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i10, long j10) {
        ((zzpm) obj).zzj(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.recaptcha.internal.zzpl
    public final void zzi(Object obj) {
        ((zznd) obj).zzc.zzh();
    }

    @Override // com.google.android.recaptcha.internal.zzpl
    public final /* synthetic */ void zzj(Object obj, Object obj2) {
        ((zznd) obj).zzc = (zzpm) obj2;
    }
}
