package com.google.android.recaptcha.internal;

import dc.p;
import nc.d0;
import rb.h;
import ub.e;
import wb.i;

/* loaded from: classes.dex */
final class zzfs extends i implements p {
    public Object zza;
    public Object zzb;
    public int zzc;
    public final /* synthetic */ zzgd zzd;
    public final /* synthetic */ zzft zze;
    public final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfs(zzgd zzgdVar, zzft zzftVar, String str, e eVar) {
        super(2, eVar);
        this.zzd = zzgdVar;
        this.zze = zzftVar;
        this.zzf = str;
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        return new zzfs(this.zzd, this.zze, this.zzf, eVar);
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfs) create((d0) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (r7 != r0) goto L19;
     */
    @Override // wb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            vb.a r0 = vb.a.f16085a
            int r1 = r6.zzc
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 == r2) goto Le
            rb.f.b(r7)
            goto L81
        Le:
            java.lang.Object r1 = r6.zzb
            com.google.android.recaptcha.internal.zzjh r1 = (com.google.android.recaptcha.internal.zzjh) r1
            java.lang.Object r2 = r6.zza
            com.google.android.recaptcha.internal.zzub r2 = (com.google.android.recaptcha.internal.zzub) r2
            rb.f.b(r7)     // Catch: java.lang.Exception -> L6d
            goto L5b
        L1a:
            rb.f.b(r7)
            com.google.android.recaptcha.internal.zzgd r7 = r6.zzd
            com.google.android.recaptcha.internal.zzbn r1 = new com.google.android.recaptcha.internal.zzbn
            r1.<init>()
            r7.zza = r1
            java.lang.String r7 = r6.zzf     // Catch: java.lang.Exception -> L6d
            com.google.android.recaptcha.internal.zzkh r1 = com.google.android.recaptcha.internal.zzkh.zzh()     // Catch: java.lang.Exception -> L6d
            byte[] r7 = r1.zzj(r7)     // Catch: java.lang.Exception -> L6d
            com.google.android.recaptcha.internal.zzub r7 = com.google.android.recaptcha.internal.zzub.zzi(r7)     // Catch: java.lang.Exception -> L6d
            r7.zzf()     // Catch: java.lang.Exception -> L6d
            com.google.android.recaptcha.internal.zzft r1 = r6.zze     // Catch: java.lang.Exception -> L6d
            com.google.android.recaptcha.internal.zzhx r1 = com.google.android.recaptcha.internal.zzft.zzb(r1)     // Catch: java.lang.Exception -> L6d
            com.google.android.recaptcha.internal.zztz r1 = r1.zza(r7)     // Catch: java.lang.Exception -> L6d
            com.google.android.recaptcha.internal.zzjh r3 = com.google.android.recaptcha.internal.zzjh.zzb()     // Catch: java.lang.Exception -> L6d
            com.google.android.recaptcha.internal.zzft r4 = r6.zze     // Catch: java.lang.Exception -> L6d
            java.util.List r1 = r1.zzi()     // Catch: java.lang.Exception -> L6d
            com.google.android.recaptcha.internal.zzgd r5 = r6.zzd     // Catch: java.lang.Exception -> L6d
            r6.zza = r7     // Catch: java.lang.Exception -> L6d
            r6.zzb = r3     // Catch: java.lang.Exception -> L6d
            r6.zzc = r2     // Catch: java.lang.Exception -> L6d
            java.lang.Object r1 = com.google.android.recaptcha.internal.zzft.zzc(r4, r1, r5, r6)     // Catch: java.lang.Exception -> L6d
            if (r1 == r0) goto L80
            r2 = r7
            r1 = r3
        L5b:
            r1.zzf()     // Catch: java.lang.Exception -> L6d
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch: java.lang.Exception -> L6d
            long r3 = r1.zza(r7)     // Catch: java.lang.Exception -> L6d
            java.lang.Long r7 = new java.lang.Long     // Catch: java.lang.Exception -> L6d
            r7.<init>(r3)     // Catch: java.lang.Exception -> L6d
            r2.zzf()     // Catch: java.lang.Exception -> L6d
            goto L81
        L6d:
            r7 = move-exception
            com.google.android.recaptcha.internal.zzft r1 = r6.zze
            com.google.android.recaptcha.internal.zzgd r2 = r6.zzd
            r3 = 0
            r6.zza = r3
            r6.zzb = r3
            r3 = 2
            r6.zzc = r3
            java.lang.Object r7 = com.google.android.recaptcha.internal.zzft.zzd(r1, r7, r2, r6)
            if (r7 != r0) goto L81
        L80:
            return r0
        L81:
            rb.h r7 = rb.h.f13851a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzfs.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
