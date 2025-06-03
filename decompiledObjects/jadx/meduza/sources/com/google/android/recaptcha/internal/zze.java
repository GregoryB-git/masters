package com.google.android.recaptcha.internal;

import rb.h;
import ub.e;

/* loaded from: classes.dex */
public abstract class zze {
    private boolean zza;

    public zzen zza(String str) {
        throw null;
    }

    public zzen zzb() {
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|(1:(1:(1:(2:11|12)(2:14|15))(3:16|17|(1:19)(1:12)))(4:20|21|22|23))(4:41|42|43|(1:45)(1:46))|24|25|(1:27)|12))|50|6|(0)(0)|24|25|(0)|12) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        r10 = r0;
        r16 = r3;
        r4 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d3 A[PHI: r0
      0x00d3: PHI (r0v14 java.lang.Object) = (r0v12 java.lang.Object), (r0v12 java.lang.Object), (r0v13 java.lang.Object), (r0v1 java.lang.Object) binds: [B:26:0x008d, B:27:0x008f, B:18:0x00d0, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f A[Catch: Exception -> 0x0093, TRY_LEAVE, TryCatch #2 {Exception -> 0x0093, blocks: (B:25:0x0084, B:27:0x008f), top: B:24:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzc(java.lang.String r19, long r20, ub.e r22) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zzc(java.lang.String, long, ub.e):java.lang.Object");
    }

    public abstract Object zzd(String str, e eVar);

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0099, code lost:
    
        if (r12 != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[Catch: Exception -> 0x004f, TRY_LEAVE, TryCatch #0 {Exception -> 0x004f, blocks: (B:27:0x004b, B:28:0x0077, B:30:0x0084), top: B:26:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zze(long r9, com.google.android.recaptcha.internal.zzsc r11, ub.e r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.google.android.recaptcha.internal.zzc
            if (r0 == 0) goto L13
            r0 = r12
            com.google.android.recaptcha.internal.zzc r0 = (com.google.android.recaptcha.internal.zzc) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzc r0 = new com.google.android.recaptcha.internal.zzc
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.zzb
            vb.a r1 = vb.a.f16085a
            int r2 = r0.zzd
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L51
            if (r2 == r6) goto L45
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r9 = r0.zza
            com.google.android.recaptcha.internal.zzbd r9 = (com.google.android.recaptcha.internal.zzbd) r9
            rb.f.b(r12)
            goto Lb0
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            com.google.android.recaptcha.internal.zzen r9 = r0.zze
            java.lang.Object r10 = r0.zza
            com.google.android.recaptcha.internal.zze r10 = (com.google.android.recaptcha.internal.zze) r10
            rb.f.b(r12)
            goto L9b
        L45:
            com.google.android.recaptcha.internal.zzen r9 = r0.zze
            java.lang.Object r10 = r0.zza
            com.google.android.recaptcha.internal.zze r10 = (com.google.android.recaptcha.internal.zze) r10
            rb.f.b(r12)     // Catch: java.lang.Exception -> L4f
            goto L77
        L4f:
            r11 = move-exception
            goto L8c
        L51:
            rb.f.b(r12)
            com.google.android.recaptcha.internal.zzen r12 = r8.zzb()
            boolean r2 = r8.zza
            if (r2 == 0) goto L62
            r12.zza()
            rb.h r9 = rb.h.f13851a
            return r9
        L62:
            com.google.android.recaptcha.internal.zzd r2 = new com.google.android.recaptcha.internal.zzd     // Catch: java.lang.Exception -> L88
            r2.<init>(r8, r11, r3)     // Catch: java.lang.Exception -> L88
            r0.zza = r8     // Catch: java.lang.Exception -> L88
            r0.zze = r12     // Catch: java.lang.Exception -> L88
            r0.zzd = r6     // Catch: java.lang.Exception -> L88
            java.lang.Object r9 = b.a0.M(r9, r2, r0)     // Catch: java.lang.Exception -> L88
            if (r9 == r1) goto Lb5
            r10 = r8
            r7 = r12
            r12 = r9
            r9 = r7
        L77:
            rb.e r12 = (rb.e) r12     // Catch: java.lang.Exception -> L4f
            java.lang.Object r11 = r12.f13846a     // Catch: java.lang.Exception -> L4f
            rb.f.b(r11)     // Catch: java.lang.Exception -> L4f
            rb.h r11 = rb.h.f13851a     // Catch: java.lang.Exception -> L4f
            r10.zza = r6     // Catch: java.lang.Exception -> L4f
            if (r9 == 0) goto L87
            r9.zza()     // Catch: java.lang.Exception -> L4f
        L87:
            return r11
        L88:
            r9 = move-exception
            r11 = r9
            r10 = r8
            r9 = r12
        L8c:
            r12 = 0
            r10.zza = r12
            r0.zza = r10
            r0.zze = r9
            r0.zzd = r5
            java.lang.Object r12 = r10.zzj(r11, r0)
            if (r12 == r1) goto Lb5
        L9b:
            r11 = r12
            com.google.android.recaptcha.internal.zzbd r11 = (com.google.android.recaptcha.internal.zzbd) r11
            if (r9 == 0) goto La3
            r9.zzb(r11)
        La3:
            r0.zza = r11
            r0.zze = r3
            r0.zzd = r4
            java.lang.Object r9 = r10.zzg(r11, r0)
            if (r9 == r1) goto Lb5
            r9 = r11
        Lb0:
            rb.e$a r9 = rb.f.a(r9)
            return r9
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zze(long, com.google.android.recaptcha.internal.zzsc, ub.e):java.lang.Object");
    }

    public abstract Object zzf(String str, e eVar);

    public Object zzg(zzbd zzbdVar, e eVar) {
        return h.f13851a;
    }

    public abstract Object zzh(zzsc zzscVar, e eVar);

    public Object zzi(String str, long j10, Exception exc, e eVar) {
        return h.f13851a;
    }

    public Object zzj(Exception exc, e eVar) {
        return zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzap, exc.getMessage()));
    }

    public void zzk(zzsr zzsrVar) {
    }

    public final boolean zzl() {
        return this.zza;
    }
}
