package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class zzhe implements zzgx {
    public static final zzhe zza = new zzhe();

    private zzhe() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i10, zzgd zzgdVar, zzue... zzueVarArr) {
        if (zzueVarArr.length != 1) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof Field)) {
            zza2 = null;
        }
        Field field = (Field) zza2;
        if (field == null) {
            throw new zzce(4, 5, null);
        }
        try {
            zzgdVar.zzc().zze(i10, field.get(null));
        } catch (Exception e10) {
            throw new zzce(6, 16, e10);
        }
    }
}
