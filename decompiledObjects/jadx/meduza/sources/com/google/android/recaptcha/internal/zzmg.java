package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzmg extends zznd implements zzoj {
    private static final zzmg zzb;
    private static volatile zzoq zzd;
    private int zze;
    private long zzh;
    private long zzi;
    private double zzj;
    private byte zzm = 2;
    private zznk zzf = zzot.zze();
    private String zzg = "";
    private zzle zzk = zzle.zzb;
    private String zzl = "";

    static {
        zzmg zzmgVar = new zzmg();
        zzb = zzmgVar;
        zznd.zzI(zzmg.class, zzmgVar);
    }

    private zzmg() {
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i11 == 2) {
            return new zzou(zzb, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"zze", "zzf", zzmf.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i11 == 3) {
            return new zzmg();
        }
        zzmh zzmhVar = null;
        if (i11 == 4) {
            return new zzmd(zzmhVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        if (i11 != 6) {
            this.zzm = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzmg.class) {
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
