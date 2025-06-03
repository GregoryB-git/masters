package com.google.android.recaptcha.internal;

import android.content.Context;
import b.a0;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import nc.d0;
import nc.r;
import rb.h;
import ub.e;

/* loaded from: classes.dex */
public final class zzan {
    public r zza;
    private final d0 zzb;
    private final zzek zzc;
    private final StandardIntegrityManager zzd;
    private long zzf;
    private boolean zzh;
    private zzao zze = zzao.zza;
    private final vc.a zzg = a0.e();

    public zzan(Context context, d0 d0Var, zzek zzekVar, StandardIntegrityManager standardIntegrityManager, long j10) {
        this.zzb = d0Var;
        this.zzc = zzekVar;
        this.zzd = standardIntegrityManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzi(ub.e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzag
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzag r0 = (com.google.android.recaptcha.internal.zzag) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzag r0 = new com.google.android.recaptcha.internal.zzag
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.zza
            vb.a r1 = vb.a.f16085a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            rb.f.b(r7)
            goto L53
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            rb.f.b(r7)
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder r7 = com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.builder()
            long r4 = r6.zzf
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder r7 = r7.setCloudProjectNumber(r4)
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest r7 = r7.build()
            com.google.android.play.core.integrity.StandardIntegrityManager r2 = r6.zzd
            com.google.android.gms.tasks.Task r7 = r2.prepareIntegrityToken(r7)
            nc.j0 r7 = com.google.android.recaptcha.internal.zzbx.zza(r7)
            r0.zzc = r3
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzi(ub.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if (r7 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r7 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzj(java.lang.String r6, ub.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzah
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzah r0 = (com.google.android.recaptcha.internal.zzah) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzah r0 = new com.google.android.recaptcha.internal.zzah
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.zza
            vb.a r1 = vb.a.f16085a
            int r2 = r0.zzc
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            rb.f.b(r7)
            goto L6b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.zzd
            rb.f.b(r7)
            goto L49
        L38:
            rb.f.b(r7)
            nc.r r7 = r5.zzf()
            r0.zzd = r6
            r0.zzc = r4
            java.lang.Object r7 = r7.await(r0)
            if (r7 == r1) goto L72
        L49:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r7 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r7
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r2 = com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.builder()
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r6 = r2.setRequestHash(r6)
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest r6 = r6.build()
            com.google.android.gms.tasks.Task r6 = r7.request(r6)
            nc.j0 r6 = com.google.android.recaptcha.internal.zzbx.zza(r6)
            r7 = 0
            r0.zzd = r7
            r0.zzc = r3
            java.lang.Object r7 = r6.await(r0)
            if (r7 != r1) goto L6b
            goto L72
        L6b:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityToken r7 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken) r7
            java.lang.String r6 = r7.token()
            return r6
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzj(java.lang.String, ub.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzc(java.lang.String r7, ub.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzaf
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.internal.zzaf r0 = (com.google.android.recaptcha.internal.zzaf) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzaf r0 = new com.google.android.recaptcha.internal.zzaf
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.zza
            vb.a r1 = vb.a.f16085a
            int r2 = r0.zzc
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            rb.f.b(r8)
            goto L74
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.String r7 = r0.zze
            com.google.android.recaptcha.internal.zzan r2 = r0.zzd
            rb.f.b(r8)
            goto L67
        L3d:
            java.lang.String r7 = r0.zze
            com.google.android.recaptcha.internal.zzan r2 = r0.zzd
            rb.f.b(r8)     // Catch: java.lang.Exception -> L5a
            goto L56
        L45:
            rb.f.b(r8)
            r0.zzd = r6     // Catch: java.lang.Exception -> L59
            r0.zze = r7     // Catch: java.lang.Exception -> L59
            r0.zzc = r5     // Catch: java.lang.Exception -> L59
            java.lang.Object r8 = r6.zzj(r7, r0)     // Catch: java.lang.Exception -> L59
            if (r8 != r1) goto L55
            return r1
        L55:
            r2 = r6
        L56:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L5a
            goto L76
        L59:
            r2 = r6
        L5a:
            r0.zzd = r2
            r0.zze = r7
            r0.zzc = r4
            java.lang.Object r8 = r2.zze(r0)
            if (r8 != r1) goto L67
            return r1
        L67:
            r8 = 0
            r0.zzd = r8
            r0.zze = r8
            r0.zzc = r3
            java.lang.Object r8 = r2.zzj(r7, r0)
            if (r8 == r1) goto L77
        L74:
            java.lang.String r8 = (java.lang.String) r8
        L76:
            return r8
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzc(java.lang.String, ub.e):java.lang.Object");
    }

    public final Object zzd(long j10, e eVar) {
        this.zzf = j10;
        return h.f13851a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
    
        if (rb.h.f13851a == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a A[Catch: all -> 0x00b1, TRY_LEAVE, TryCatch #0 {all -> 0x00b1, blocks: (B:19:0x0050, B:21:0x005a, B:24:0x0060), top: B:18:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060 A[Catch: all -> 0x00b1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b1, blocks: (B:19:0x0050, B:21:0x005a, B:24:0x0060), top: B:18:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zze(ub.e r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.google.android.recaptcha.internal.zzak
            if (r0 == 0) goto L13
            r0 = r13
            com.google.android.recaptcha.internal.zzak r0 = (com.google.android.recaptcha.internal.zzak) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzak r0 = new com.google.android.recaptcha.internal.zzak
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.zzb
            vb.a r1 = vb.a.f16085a
            int r2 = r0.zzd
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            rb.f.b(r13)
            goto Lae
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L33:
            java.lang.Object r2 = r0.zza
            vc.a r2 = (vc.a) r2
            com.google.android.recaptcha.internal.zzan r5 = r0.zze
            rb.f.b(r13)
            goto L4f
        L3d:
            rb.f.b(r13)
            vc.a r2 = r12.zzg
            r0.zze = r12
            r0.zza = r2
            r0.zzd = r4
            java.lang.Object r13 = r2.b(r0)
            if (r13 == r1) goto Lb6
            r5 = r12
        L4f:
            r13 = 0
            com.google.android.recaptcha.internal.zzao r6 = r5.zze     // Catch: java.lang.Throwable -> Lb1
            com.google.android.recaptcha.internal.zzao r7 = com.google.android.recaptcha.internal.zzao.zza     // Catch: java.lang.Throwable -> Lb1
            boolean r6 = ec.i.a(r6, r7)     // Catch: java.lang.Throwable -> Lb1
            if (r6 != 0) goto L60
            rb.h r0 = rb.h.f13851a     // Catch: java.lang.Throwable -> Lb1
            r2.a(r13)
            return r0
        L60:
            com.google.android.recaptcha.internal.zzao r6 = com.google.android.recaptcha.internal.zzao.zzb     // Catch: java.lang.Throwable -> Lb1
            r5.zze = r6     // Catch: java.lang.Throwable -> Lb1
            rb.h r6 = rb.h.f13851a     // Catch: java.lang.Throwable -> Lb1
            r2.a(r13)
            com.google.android.recaptcha.internal.zzek r2 = r5.zzc
            java.lang.String r6 = r2.zzd()
            r2.zzc(r6)
            r2.zzb(r3)
            r6 = 38
            com.google.android.recaptcha.internal.zzen r2 = r2.zzf(r6)
            nc.s r6 = b.z.b()
            r5.zza = r6
            nc.d0 r6 = r5.zzb
            com.google.android.recaptcha.internal.zzam r7 = new com.google.android.recaptcha.internal.zzam
            r7.<init>(r5, r2, r13)
            r2 = 3
            x6.b.g0(r6, r13, r7, r2)
            r0.zze = r13
            r0.zza = r13
            r0.zzd = r3
            boolean r13 = r5.zzh
            if (r13 != 0) goto La9
            java.util.Timer r6 = new java.util.Timer
            r6.<init>()
            com.google.android.recaptcha.internal.zzai r7 = new com.google.android.recaptcha.internal.zzai
            r7.<init>(r5)
            r10 = 28800000(0x1b77400, double:1.42290906E-316)
            r8 = r10
            r6.schedule(r7, r8, r10)
            r5.zzh = r4
        La9:
            rb.h r13 = rb.h.f13851a
            if (r13 != r1) goto Lae
            goto Lb6
        Lae:
            rb.h r13 = rb.h.f13851a
            return r13
        Lb1:
            r0 = move-exception
            r2.a(r13)
            throw r0
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zze(ub.e):java.lang.Object");
    }

    public final r zzf() {
        r rVar = this.zza;
        if (rVar != null) {
            return rVar;
        }
        return null;
    }
}
