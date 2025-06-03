package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzqg extends zznd implements zzoj {
    private static final zzqg zzb;
    private static volatile zzoq zzd;
    private int zze;
    private zzml zzf;
    private int zzg;

    static {
        zzqg zzqgVar = new zzqg();
        zzb = zzqgVar;
        zznd.zzI(zzqg.class, zzqgVar);
    }

    private zzqg() {
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zznd.zzF(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzqg();
        }
        zzqf zzqfVar = null;
        if (i11 == 4) {
            return new zzqe(zzqfVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        if (i11 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzqg.class) {
                zzoqVar = zzd;
                if (zzoqVar == null) {
                    zzoqVar = new zzmy(zzb);
                    zzd = zzoqVar;
                }
            }
        }
        return zzoqVar;
    }
}
