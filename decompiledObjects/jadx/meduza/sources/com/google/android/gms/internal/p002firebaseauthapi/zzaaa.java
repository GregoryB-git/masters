package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
final class zzaaa implements zzaew<zzahl> {
    private final /* synthetic */ zzahm zza;
    private final /* synthetic */ zzagl zzb;
    private final /* synthetic */ zzadp zzc;
    private final /* synthetic */ zzagw zzd;
    private final /* synthetic */ zzaet zze;
    private final /* synthetic */ zzzv zzf;

    public zzaaa(zzzv zzzvVar, zzahm zzahmVar, zzagl zzaglVar, zzadp zzadpVar, zzagw zzagwVar, zzaet zzaetVar) {
        this.zza = zzahmVar;
        this.zzb = zzaglVar;
        this.zzc = zzadpVar;
        this.zzd = zzagwVar;
        this.zze = zzaetVar;
        this.zzf = zzzvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaew
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.p002firebaseauthapi.zzahl r7) {
        /*
            r6 = this;
            com.google.android.gms.internal.firebase-auth-api.zzahl r7 = (com.google.android.gms.internal.p002firebaseauthapi.zzahl) r7
            com.google.android.gms.internal.firebase-auth-api.zzahm r0 = r6.zza
            java.lang.String r1 = "EMAIL"
            boolean r0 = r0.zzi(r1)
            r1 = 0
            if (r0 == 0) goto L13
            com.google.android.gms.internal.firebase-auth-api.zzagl r0 = r6.zzb
            r0.zzb(r1)
            goto L26
        L13:
            com.google.android.gms.internal.firebase-auth-api.zzahm r0 = r6.zza
            java.lang.String r0 = r0.zzc()
            if (r0 == 0) goto L26
            com.google.android.gms.internal.firebase-auth-api.zzagl r0 = r6.zzb
            com.google.android.gms.internal.firebase-auth-api.zzahm r2 = r6.zza
            java.lang.String r2 = r2.zzc()
            r0.zzb(r2)
        L26:
            com.google.android.gms.internal.firebase-auth-api.zzahm r0 = r6.zza
            java.lang.String r2 = "DISPLAY_NAME"
            boolean r0 = r0.zzi(r2)
            if (r0 == 0) goto L36
            com.google.android.gms.internal.firebase-auth-api.zzagl r0 = r6.zzb
            r0.zza(r1)
            goto L49
        L36:
            com.google.android.gms.internal.firebase-auth-api.zzahm r0 = r6.zza
            java.lang.String r0 = r0.zzb()
            if (r0 == 0) goto L49
            com.google.android.gms.internal.firebase-auth-api.zzagl r0 = r6.zzb
            com.google.android.gms.internal.firebase-auth-api.zzahm r2 = r6.zza
            java.lang.String r2 = r2.zzb()
            r0.zza(r2)
        L49:
            com.google.android.gms.internal.firebase-auth-api.zzahm r0 = r6.zza
            java.lang.String r2 = "PHOTO_URL"
            boolean r0 = r0.zzi(r2)
            if (r0 == 0) goto L57
            com.google.android.gms.internal.firebase-auth-api.zzagl r0 = r6.zzb
            r2 = r1
            goto L67
        L57:
            com.google.android.gms.internal.firebase-auth-api.zzahm r0 = r6.zza
            java.lang.String r0 = r0.zze()
            if (r0 == 0) goto L6a
            com.google.android.gms.internal.firebase-auth-api.zzagl r0 = r6.zzb
            com.google.android.gms.internal.firebase-auth-api.zzahm r2 = r6.zza
            java.lang.String r2 = r2.zze()
        L67:
            r0.zzc(r2)
        L6a:
            com.google.android.gms.internal.firebase-auth-api.zzahm r0 = r6.zza
            java.lang.String r0 = r0.zzd()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L87
            java.lang.String r0 = "redacted"
            byte[] r0 = r0.getBytes()
            if (r0 != 0) goto L7f
            goto L84
        L7f:
            r1 = 0
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r1)
        L84:
            m6.j.e(r1)
        L87:
            com.google.android.gms.internal.firebase-auth-api.zzahm r0 = r6.zza
            java.lang.String r1 = "delete_passkey"
            boolean r0 = r0.zzi(r1)
            if (r0 == 0) goto L9a
            com.google.android.gms.internal.firebase-auth-api.zzagl r0 = r6.zzb
            com.google.android.gms.internal.firebase-auth-api.zzaj r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaj.zzh()
            r0.zza(r1)
        L9a:
            java.util.List r0 = r7.zze()
            if (r0 == 0) goto La1
            goto La6
        La1:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        La6:
            com.google.android.gms.internal.firebase-auth-api.zzagl r1 = r6.zzb
            r1.zza(r0)
            com.google.android.gms.internal.firebase-auth-api.zzadp r0 = r6.zzc
            com.google.android.gms.internal.firebase-auth-api.zzagw r1 = r6.zzd
            m6.j.i(r1)
            java.lang.String r2 = r7.zzc()
            java.lang.String r3 = r7.zzd()
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto Ld8
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto Ld8
            long r4 = r7.zza()
            com.google.android.gms.internal.firebase-auth-api.zzagw r7 = new com.google.android.gms.internal.firebase-auth-api.zzagw
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r1 = r1.zze()
            r7.<init>(r3, r2, r4, r1)
            r1 = r7
        Ld8:
            com.google.android.gms.internal.firebase-auth-api.zzagl r7 = r6.zzb
            r0.zza(r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzaaa.zza(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zze.zza(str);
    }
}
