package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzsi extends zznd implements zzoj {
    private static final zzsi zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private zzsm zzk;
    private zzsg zzl;
    private zzsk zzm;
    private zzry zzn;

    static {
        zzsi zzsiVar = new zzsi();
        zzb = zzsiVar;
        zznd.zzI(zzsi.class, zzsiVar);
    }

    private zzsi() {
    }

    public static /* synthetic */ void zzN(zzsi zzsiVar, String str) {
        str.getClass();
        zzsiVar.zze |= 1;
        zzsiVar.zzf = str;
    }

    public static /* synthetic */ void zzO(zzsi zzsiVar, zzsg zzsgVar) {
        zzsgVar.getClass();
        zzsiVar.zzl = zzsgVar;
        zzsiVar.zze |= 64;
    }

    public static /* synthetic */ void zzP(zzsi zzsiVar, zzsm zzsmVar) {
        zzsmVar.getClass();
        zzsiVar.zzk = zzsmVar;
        zzsiVar.zze |= 32;
    }

    public static /* synthetic */ void zzQ(zzsi zzsiVar, zzsk zzskVar) {
        zzskVar.getClass();
        zzsiVar.zzm = zzskVar;
        zzsiVar.zze |= 128;
    }

    public static zzsh zzf() {
        return (zzsh) zzb.zzq();
    }

    public static zzsi zzi(byte[] bArr) {
        return (zzsi) zznd.zzx(zzb, bArr);
    }

    @Deprecated
    public final String zzM() {
        return this.zzh;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zznd.zzF(zzb, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i11 == 3) {
            return new zzsi();
        }
        zzsn zzsnVar = null;
        if (i11 == 4) {
            return new zzsh(zzsnVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        if (i11 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzsi.class) {
                zzoqVar = zzd;
                if (zzoqVar == null) {
                    zzoqVar = new zzmy(zzb);
                    zzd = zzoqVar;
                }
            }
        }
        return zzoqVar;
    }

    @Deprecated
    public final String zzj() {
        return this.zzi;
    }

    public final String zzk() {
        return this.zzf;
    }

    @Deprecated
    public final String zzl() {
        return this.zzg;
    }
}
