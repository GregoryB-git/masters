package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzef implements zzcn {
    private final zzdt zza;
    private zzcm zzb;
    private zzsc zzc;

    public zzef(zzdt zzdtVar) {
        zzcl zzclVar;
        this.zza = zzdtVar;
        zzclVar = zzcm.zza;
        this.zzb = zzclVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zza(java.lang.String r18, com.google.android.recaptcha.RecaptchaAction r19, long r20, ub.e r22) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzef.zza(java.lang.String, com.google.android.recaptcha.RecaptchaAction, long, ub.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
    
        if (r12 == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.google.android.recaptcha.internal.zzef] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzb(long r11, ub.e r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.google.android.recaptcha.internal.zzee
            if (r0 == 0) goto L13
            r0 = r13
            com.google.android.recaptcha.internal.zzee r0 = (com.google.android.recaptcha.internal.zzee) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzee r0 = new com.google.android.recaptcha.internal.zzee
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.zzb
            vb.a r1 = vb.a.f16085a
            int r2 = r0.zzd
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            com.google.android.recaptcha.internal.zzef r11 = r0.zze
            rb.f.b(r13)     // Catch: com.google.android.recaptcha.internal.zzbd -> L2d
            goto L99
        L2d:
            r12 = move-exception
            goto La6
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            double r11 = r0.zza
            com.google.android.recaptcha.internal.zzef r2 = r0.zze
            rb.f.b(r13)     // Catch: com.google.android.recaptcha.internal.zzbd -> L44
            r9 = r2
            r2 = r13
            r12 = r11
            r11 = r9
            goto L88
        L44:
            r12 = move-exception
            r11 = r2
            goto La6
        L47:
            rb.f.b(r13)
            com.google.android.recaptcha.internal.zzcm r13 = r10.zzb
            com.google.android.recaptcha.internal.zzcj r2 = com.google.android.recaptcha.internal.zzcm.zzb()
            boolean r13 = ec.i.a(r13, r2)
            if (r13 != 0) goto Lad
            com.google.android.recaptcha.internal.zzcm r13 = r10.zzb
            com.google.android.recaptcha.internal.zzci r2 = com.google.android.recaptcha.internal.zzcm.zza()
            boolean r13 = ec.i.a(r13, r2)
            if (r13 == 0) goto L63
            goto Lad
        L63:
            com.google.android.recaptcha.internal.zzck r13 = com.google.android.recaptcha.internal.zzcm.zzc()
            r10.zzb = r13
            double r11 = (double) r11
            com.google.android.recaptcha.internal.zzdt r13 = r10.zza     // Catch: com.google.android.recaptcha.internal.zzbd -> La3
            r5 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            double r5 = r5 * r11
            r0.zze = r10     // Catch: com.google.android.recaptcha.internal.zzbd -> La3
            r7 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r11 = r11 * r7
            r0.zza = r11     // Catch: com.google.android.recaptcha.internal.zzbd -> La3
            r0.zzd = r4     // Catch: com.google.android.recaptcha.internal.zzbd -> La3
            long r4 = (long) r5     // Catch: com.google.android.recaptcha.internal.zzbd -> La3
            java.lang.Object r13 = r13.zzo(r4, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> La3
            if (r13 == r1) goto La2
            r2 = r13
            r12 = r11
            r11 = r10
        L88:
            com.google.android.recaptcha.internal.zzsc r2 = (com.google.android.recaptcha.internal.zzsc) r2     // Catch: com.google.android.recaptcha.internal.zzbd -> L2d
            r11.zzc = r2     // Catch: com.google.android.recaptcha.internal.zzbd -> L2d
            com.google.android.recaptcha.internal.zzdt r4 = r11.zza     // Catch: com.google.android.recaptcha.internal.zzbd -> L2d
            long r12 = (long) r12     // Catch: com.google.android.recaptcha.internal.zzbd -> L2d
            r0.zze = r11     // Catch: com.google.android.recaptcha.internal.zzbd -> L2d
            r0.zzd = r3     // Catch: com.google.android.recaptcha.internal.zzbd -> L2d
            java.lang.Object r12 = r4.zzn(r2, r12, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L2d
            if (r12 == r1) goto La2
        L99:
            com.google.android.recaptcha.internal.zzcj r12 = com.google.android.recaptcha.internal.zzcm.zzb()     // Catch: com.google.android.recaptcha.internal.zzbd -> L2d
            r11.zzb = r12     // Catch: com.google.android.recaptcha.internal.zzbd -> L2d
            rb.h r11 = rb.h.f13851a
            return r11
        La2:
            return r1
        La3:
            r11 = move-exception
            r12 = r11
            r11 = r10
        La6:
            com.google.android.recaptcha.internal.zzci r13 = com.google.android.recaptcha.internal.zzcm.zza()
            r11.zzb = r13
            throw r12
        Lad:
            rb.h r11 = rb.h.f13851a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzef.zzb(long, ub.e):java.lang.Object");
    }
}
