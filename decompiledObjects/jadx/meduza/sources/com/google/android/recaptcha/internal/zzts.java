package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzts extends zznd implements zzoj {
    private static final zzts zzb;
    private static volatile zzoq zzd;
    private int zze;

    static {
        zzts zztsVar = new zzts();
        zzb = zztsVar;
        zznd.zzI(zzts.class, zztsVar);
    }

    private zzts() {
    }

    public static zzts zzg(byte[] bArr) {
        return (zzts) zznd.zzx(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zznd.zzF(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zze"});
        }
        if (i11 == 3) {
            return new zzts();
        }
        zzug zzugVar = null;
        if (i11 == 4) {
            return new zztr(zzugVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        if (i11 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzts.class) {
                zzoqVar = zzd;
                if (zzoqVar == null) {
                    zzoqVar = new zzmy(zzb);
                    zzd = zzoqVar;
                }
            }
        }
        return zzoqVar;
    }

    public final zztv zzi() {
        zztv zzb2 = zztv.zzb(this.zze);
        return zzb2 == null ? zztv.UNRECOGNIZED : zzb2;
    }
}
