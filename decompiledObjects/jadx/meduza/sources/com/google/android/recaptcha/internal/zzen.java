package com.google.android.recaptcha.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzen {
    private static zzqk zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final zzeo zzf;
    private final Context zzg;
    private final Integer zzh;
    private final String zzi = zzqb.zzc(zzqb.zzb(System.currentTimeMillis()));
    private final long zzj = System.currentTimeMillis();
    private final int zzk;
    private final int zzl;

    public zzen(int i10, String str, int i11, String str2, String str3, String str4, String str5, zzeo zzeoVar, zzcc zzccVar, Context context, Integer num) {
        this.zzk = i10;
        this.zzb = str;
        this.zzl = i11;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = zzeoVar;
        this.zzg = context;
        this.zzh = num;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:27|28|(2:30|(8:32|33|34|35|36|(1:38)(2:41|(1:43)(2:44|40))|39|40))(2:48|(8:50|33|34|35|36|(0)(0)|39|40))|46|34|35|36|(0)(0)|39|40) */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0115 A[Catch: NameNotFoundException -> 0x0157, TryCatch #1 {NameNotFoundException -> 0x0157, blocks: (B:36:0x0111, B:38:0x0115, B:39:0x0140, B:43:0x0130, B:44:0x0145), top: B:35:0x0111 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzc(int r13, com.google.android.recaptcha.internal.zzqq r14) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzen.zzc(int, com.google.android.recaptcha.internal.zzqq):void");
    }

    public final void zza() {
        zzc(3, null);
    }

    public final void zzb(zzbd zzbdVar) {
        zzqo zzg = zzqq.zzg();
        zzg.zzr(String.valueOf(zzbdVar.zzb().zza()));
        zzg.zze(zzbdVar.zza().zza());
        zzg.zzq(zzbdVar.zzc().getErrorCode().getErrorCode());
        String zzd = zzbdVar.zzd();
        if (zzd != null) {
            zzg.zzf(zzd);
        }
        zzc(4, (zzqq) zzg.zzk());
    }
}
