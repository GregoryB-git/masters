package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzgz implements zzgx {
    public static final zzgz zza = new zzgz();

    private zzgz() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i10, zzgd zzgdVar, zzue... zzueVarArr) {
        if (zzueVarArr.length != 1) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof Object)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzce(4, 5, null);
        }
        try {
            if (zza2 instanceof String) {
                zza2 = zzgdVar.zzh().zza((String) zza2);
            }
            zzgdVar.zzc().zze(i10, zzgc.zza(zza2));
        } catch (zzce e10) {
            throw e10;
        } catch (Exception e11) {
            throw new zzce(6, 8, e11);
        }
    }
}
