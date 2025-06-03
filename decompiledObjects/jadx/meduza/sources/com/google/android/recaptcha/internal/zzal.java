package com.google.android.recaptcha.internal;

import dc.p;
import ec.s;
import nc.d0;
import rb.h;
import ub.e;
import wb.i;

/* loaded from: classes.dex */
final class zzal extends i implements p {
    public long zza;
    public boolean zzb;
    public int zzc;
    public final /* synthetic */ zzan zzd;
    public final /* synthetic */ zzen zze;
    public final /* synthetic */ s zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzal(zzan zzanVar, zzen zzenVar, s sVar, e eVar) {
        super(2, eVar);
        this.zzd = zzanVar;
        this.zze = zzenVar;
        this.zzf = sVar;
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        return new zzal(this.zzd, this.zze, this.zzf, eVar);
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzal) create((d0) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0088  */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r9v2, types: [T, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x004b -> B:6:0x0026). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0083 -> B:5:0x0084). Please report as a decompilation issue!!! */
    @Override // wb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            vb.a r0 = vb.a.f16085a
            int r1 = r8.zzc
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L15
            boolean r1 = r8.zzb
            long r4 = r8.zza
            rb.f.b(r9)
            r9 = r1
            r1 = r8
            goto L84
        L15:
            long r4 = r8.zza
            rb.f.b(r9)     // Catch: java.lang.Exception -> L1c
            r1 = r8
            goto L34
        L1c:
            r9 = move-exception
            r1 = r8
            goto L4f
        L1f:
            rb.f.b(r9)
            r4 = 1000(0x3e8, double:4.94E-321)
            r1 = r8
            r9 = r3
        L26:
            if (r9 == 0) goto L88
            com.google.android.recaptcha.internal.zzan r9 = r1.zzd     // Catch: java.lang.Exception -> L4e
            r1.zza = r4     // Catch: java.lang.Exception -> L4e
            r1.zzc = r3     // Catch: java.lang.Exception -> L4e
            java.lang.Object r9 = com.google.android.recaptcha.internal.zzan.zza(r9, r1)     // Catch: java.lang.Exception -> L4e
            if (r9 == r0) goto L4d
        L34:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r9 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r9     // Catch: java.lang.Exception -> L4e
            com.google.android.recaptcha.internal.zzan r6 = r1.zzd     // Catch: java.lang.Exception -> L4e
            nc.r r6 = r6.zzf()     // Catch: java.lang.Exception -> L4e
            r6.i0(r9)     // Catch: java.lang.Exception -> L4e
            com.google.android.recaptcha.internal.zzan r9 = r1.zzd     // Catch: java.lang.Exception -> L4e
            com.google.android.recaptcha.internal.zzao r6 = com.google.android.recaptcha.internal.zzao.zzc     // Catch: java.lang.Exception -> L4e
            com.google.android.recaptcha.internal.zzan.zzh(r9, r6)     // Catch: java.lang.Exception -> L4e
            com.google.android.recaptcha.internal.zzen r9 = r1.zze     // Catch: java.lang.Exception -> L4e
            r9.zza()     // Catch: java.lang.Exception -> L4e
            r9 = r2
            goto L26
        L4d:
            return r0
        L4e:
            r9 = move-exception
        L4f:
            ec.s r6 = r1.zzf
            r6.f5272a = r9
            boolean r6 = r9 instanceof com.google.android.play.core.integrity.StandardIntegrityException
            if (r6 == 0) goto L73
            r6 = r9
            com.google.android.play.core.integrity.StandardIntegrityException r6 = (com.google.android.play.core.integrity.StandardIntegrityException) r6
            int r6 = r6.getErrorCode()
            r7 = -100
            if (r6 == r7) goto L71
            r7 = -18
            if (r6 == r7) goto L71
            r7 = -12
            if (r6 == r7) goto L71
            r7 = -8
            if (r6 == r7) goto L71
            r7 = -3
            if (r6 == r7) goto L71
            goto L73
        L71:
            r6 = r3
            goto L74
        L73:
            r6 = r2
        L74:
            if (r6 == 0) goto L87
            r1.zza = r4
            r1.zzb = r3
            r9 = 2
            r1.zzc = r9
            java.lang.Object r9 = nc.m0.a(r4, r1)
            if (r9 == r0) goto L86
            r9 = r6
        L84:
            long r4 = r4 + r4
            goto L26
        L86:
            return r0
        L87:
            throw r9
        L88:
            rb.h r9 = rb.h.f13851a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzal.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
