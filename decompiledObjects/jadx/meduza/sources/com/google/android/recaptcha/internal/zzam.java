package com.google.android.recaptcha.internal;

import dc.p;
import nc.d0;
import rb.h;
import ub.e;
import wb.i;

/* loaded from: classes.dex */
final class zzam extends i implements p {
    public Object zza;
    public int zzb;
    public final /* synthetic */ zzan zzc;
    public final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzam(zzan zzanVar, zzen zzenVar, e eVar) {
        super(2, eVar);
        this.zzc = zzanVar;
        this.zzd = zzenVar;
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        return new zzam(this.zzc, this.zzd, eVar);
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzam) create((d0) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    @Override // wb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            vb.a r0 = vb.a.f16085a
            int r1 = r8.zzb
            if (r1 == 0) goto L10
            java.lang.Object r0 = r8.zza
            ec.s r0 = (ec.s) r0
            rb.f.b(r9)     // Catch: java.lang.Exception -> Le
            goto L5e
        Le:
            r9 = move-exception
            goto L35
        L10:
            rb.f.b(r9)
            ec.s r9 = new ec.s
            r9.<init>()
            r1 = 60000(0xea60, double:2.9644E-319)
            com.google.android.recaptcha.internal.zzal r3 = new com.google.android.recaptcha.internal.zzal     // Catch: java.lang.Exception -> L31
            com.google.android.recaptcha.internal.zzan r4 = r8.zzc     // Catch: java.lang.Exception -> L31
            com.google.android.recaptcha.internal.zzen r5 = r8.zzd     // Catch: java.lang.Exception -> L31
            r6 = 0
            r3.<init>(r4, r5, r9, r6)     // Catch: java.lang.Exception -> L31
            r8.zza = r9     // Catch: java.lang.Exception -> L31
            r4 = 1
            r8.zzb = r4     // Catch: java.lang.Exception -> L31
            java.lang.Object r9 = b.a0.M(r1, r3, r8)     // Catch: java.lang.Exception -> L31
            if (r9 != r0) goto L5e
            return r0
        L31:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L35:
            com.google.android.recaptcha.internal.zzan r1 = r8.zzc
            nc.r r1 = r1.zzf()
            T r0 = r0.f5272a
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 != 0) goto L42
            r0 = r9
        L42:
            r1.h0(r0)
            com.google.android.recaptcha.internal.zzan r0 = r8.zzc
            com.google.android.recaptcha.internal.zzao r1 = com.google.android.recaptcha.internal.zzao.zza
            com.google.android.recaptcha.internal.zzan.zzh(r0, r1)
            com.google.android.recaptcha.internal.zzen r0 = r8.zzd
            com.google.android.recaptcha.internal.zzbd r1 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r2 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r3 = com.google.android.recaptcha.internal.zzba.zza
            java.lang.String r9 = r9.getMessage()
            r1.<init>(r2, r3, r9)
            r0.zzb(r1)
        L5e:
            rb.h r9 = rb.h.f13851a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzam.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
