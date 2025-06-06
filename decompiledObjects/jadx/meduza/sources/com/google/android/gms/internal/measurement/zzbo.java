package com.google.android.gms.internal.measurement;

import defpackage.g;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbo extends zzay {
    public zzbo() {
        this.zza.add(zzbv.ADD);
        this.zza.add(zzbv.DIVIDE);
        this.zza.add(zzbv.MODULUS);
        this.zza.add(zzbv.MULTIPLY);
        this.zza.add(zzbv.NEGATE);
        this.zza.add(zzbv.POST_DECREMENT);
        this.zza.add(zzbv.POST_INCREMENT);
        this.zza.add(zzbv.PRE_DECREMENT);
        this.zza.add(zzbv.PRE_INCREMENT);
        this.zza.add(zzbv.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        switch (zzbr.zza[zzg.zza(str).ordinal()]) {
            case 1:
                zzg.zza(zzbv.ADD, 2, list);
                zzaq zza = zzhVar.zza(list.get(0));
                zzaq zza2 = zzhVar.zza(list.get(1));
                if ((zza instanceof zzak) || (zza instanceof zzas) || (zza2 instanceof zzak) || (zza2 instanceof zzas)) {
                    return new zzas(g.d(zza.zzf(), zza2.zzf()));
                }
                return new zzai(Double.valueOf(zza2.zze().doubleValue() + zza.zze().doubleValue()));
            case 2:
                zzg.zza(zzbv.DIVIDE, 2, list);
                return new zzai(Double.valueOf(zzhVar.zza(list.get(0)).zze().doubleValue() / zzhVar.zza(list.get(1)).zze().doubleValue()));
            case 3:
                zzg.zza(zzbv.MODULUS, 2, list);
                return new zzai(Double.valueOf(zzhVar.zza(list.get(0)).zze().doubleValue() % zzhVar.zza(list.get(1)).zze().doubleValue()));
            case 4:
                zzg.zza(zzbv.MULTIPLY, 2, list);
                return new zzai(Double.valueOf(zzhVar.zza(list.get(0)).zze().doubleValue() * zzhVar.zza(list.get(1)).zze().doubleValue()));
            case 5:
                zzg.zza(zzbv.NEGATE, 1, list);
                return new zzai(Double.valueOf(zzhVar.zza(list.get(0)).zze().doubleValue() * (-1.0d)));
            case 6:
            case 7:
                zzg.zza(str, 2, list);
                zzaq zza3 = zzhVar.zza(list.get(0));
                zzhVar.zza(list.get(1));
                return zza3;
            case 8:
            case 9:
                zzg.zza(str, 1, list);
                return zzhVar.zza(list.get(0));
            case 10:
                zzg.zza(zzbv.SUBTRACT, 2, list);
                zzaq zza4 = zzhVar.zza(list.get(0));
                zzai zzaiVar = new zzai(Double.valueOf(zzhVar.zza(list.get(1)).zze().doubleValue() * (-1.0d)));
                return new zzai(Double.valueOf(zzaiVar.zze().doubleValue() + zza4.zze().doubleValue()));
            default:
                return super.zza(str);
        }
    }
}
