package com.google.android.recaptcha.internal;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
final class zzoa implements zzox {
    private static final zzog zza = new zzny();
    private final zzog zzb;

    public zzoa() {
        zzog zzogVar = zza;
        int i10 = zzos.zza;
        zznz zznzVar = new zznz(zzmw.zza(), zzogVar);
        Charset charset = zznl.zza;
        this.zzb = zznzVar;
    }

    @Override // com.google.android.recaptcha.internal.zzox
    public final zzow zza(Class cls) {
        int i10 = zzoy.zza;
        if (!zznd.class.isAssignableFrom(cls)) {
            int i11 = zzos.zza;
        }
        zzof zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            int i12 = zzos.zza;
            return zzom.zzc(zzoy.zzm(), zzmr.zza(), zzb.zza());
        }
        int i13 = zzos.zza;
        return zzol.zzm(cls, zzb, zzop.zza(), zznw.zza(), zzoy.zzm(), zzb.zzc() + (-1) != 1 ? zzmr.zza() : null, zzoe.zza());
    }
}
