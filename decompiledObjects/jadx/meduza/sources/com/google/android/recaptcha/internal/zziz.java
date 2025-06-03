package com.google.android.recaptcha.internal;

import dc.p;
import nc.d0;
import rb.h;
import ub.e;
import wb.i;

/* loaded from: classes.dex */
final class zziz extends i implements p {
    public Object zza;
    public int zzb;
    public final /* synthetic */ zzja zzc;
    public final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziz(zzja zzjaVar, zzen zzenVar, e eVar) {
        super(2, eVar);
        this.zzc = zzjaVar;
        this.zzd = zzenVar;
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        return new zziz(this.zzc, this.zzd, eVar);
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zziz) create((d0) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (b.a0.M(20000, r8, r7) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        if (r8.zzx(r7) != r0) goto L15;
     */
    @Override // wb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            vb.a r0 = vb.a.f16085a
            int r1 = r7.zzb
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L18
            if (r1 == r2) goto L14
            java.lang.Object r0 = r7.zza
            com.google.android.recaptcha.internal.zzbd r0 = (com.google.android.recaptcha.internal.zzbd) r0
            rb.f.b(r8)
            goto L69
        L14:
            rb.f.b(r8)     // Catch: java.lang.Exception -> L1c
            goto L6e
        L18:
            rb.f.b(r8)     // Catch: java.lang.Exception -> L1c
            goto L2b
        L1c:
            r8 = move-exception
            goto L40
        L1e:
            rb.f.b(r8)
            com.google.android.recaptcha.internal.zzja r8 = r7.zzc     // Catch: java.lang.Exception -> L1c
            r7.zzb = r3     // Catch: java.lang.Exception -> L1c
            java.lang.Object r8 = r8.zzx(r7)     // Catch: java.lang.Exception -> L1c
            if (r8 == r0) goto L67
        L2b:
            r3 = 20000(0x4e20, double:9.8813E-320)
            com.google.android.recaptcha.internal.zziy r8 = new com.google.android.recaptcha.internal.zziy     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzja r1 = r7.zzc     // Catch: java.lang.Exception -> L1c
            com.google.android.recaptcha.internal.zzen r5 = r7.zzd     // Catch: java.lang.Exception -> L1c
            r6 = 0
            r8.<init>(r1, r5, r6)     // Catch: java.lang.Exception -> L1c
            r7.zzb = r2     // Catch: java.lang.Exception -> L1c
            java.lang.Object r8 = b.a0.M(r3, r8, r7)     // Catch: java.lang.Exception -> L1c
            if (r8 != r0) goto L6e
            goto L67
        L40:
            r8.getMessage()
            com.google.android.recaptcha.internal.zzbd r1 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r2 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r3 = com.google.android.recaptcha.internal.zzba.zzV
            java.lang.String r4 = r8.getMessage()
            r1.<init>(r2, r3, r4)
            com.google.android.recaptcha.internal.zzbd r8 = com.google.android.recaptcha.internal.zzf.zza(r8, r1)
            com.google.android.recaptcha.internal.zzja r1 = r7.zzc
            com.google.android.recaptcha.internal.zzcb r1 = r1.zzm()
            com.google.android.recaptcha.internal.zzje r2 = com.google.android.recaptcha.internal.zzje.zza
            r7.zza = r8
            r3 = 3
            r7.zzb = r3
            java.lang.Object r1 = r1.zzc(r2, r7)
            if (r1 != r0) goto L68
        L67:
            return r0
        L68:
            r0 = r8
        L69:
            com.google.android.recaptcha.internal.zzen r8 = r7.zzd
            r8.zzb(r0)
        L6e:
            rb.h r8 = rb.h.f13851a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zziz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
