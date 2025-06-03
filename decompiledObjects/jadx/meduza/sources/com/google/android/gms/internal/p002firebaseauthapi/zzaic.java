package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b.z;
import c8.d1;
import defpackage.f;
import m6.j;
import n6.a;

/* loaded from: classes.dex */
public final class zzaic extends a implements zzaeb {
    public static final Parcelable.Creator<zzaic> CREATOR = new zzaib();
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private boolean zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private boolean zzo;
    private String zzp;

    public zzaic() {
        this.zzi = true;
        this.zzj = true;
    }

    public zzaic(d1 d1Var, String str) {
        j.i(d1Var);
        String str2 = d1Var.f2425a;
        j.e(str2);
        this.zzl = str2;
        j.e(str);
        this.zzm = str;
        String str3 = d1Var.f2427c;
        j.e(str3);
        this.zze = str3;
        this.zzi = true;
        StringBuilder l10 = f.l("providerId=");
        l10.append(this.zze);
        this.zzg = l10.toString();
    }

    public zzaic(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.zza = "http://localhost";
        this.zzc = str;
        this.zzd = str2;
        this.zzh = str5;
        this.zzk = str6;
        this.zzn = str7;
        this.zzp = str8;
        this.zzi = true;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(this.zzd) && TextUtils.isEmpty(this.zzk)) {
            throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
        }
        j.e(str3);
        this.zze = str3;
        this.zzf = null;
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(this.zzc)) {
            sb2.append("id_token=");
            sb2.append(this.zzc);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            sb2.append("access_token=");
            sb2.append(this.zzd);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzf)) {
            sb2.append("identifier=");
            sb2.append(this.zzf);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            sb2.append("oauth_token_secret=");
            sb2.append(this.zzh);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzk)) {
            sb2.append("code=");
            sb2.append(this.zzk);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(str9)) {
            sb2.append("nonce=");
            sb2.append(str9);
            sb2.append("&");
        }
        sb2.append("providerId=");
        sb2.append(this.zze);
        this.zzg = sb2.toString();
        this.zzj = true;
    }

    public zzaic(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z10, boolean z11, String str9, String str10, String str11, String str12, boolean z12, String str13) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = z10;
        this.zzj = z11;
        this.zzk = str9;
        this.zzl = str10;
        this.zzm = str11;
        this.zzn = str12;
        this.zzo = z12;
        this.zzp = str13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.F(parcel, 2, this.zza, false);
        z.F(parcel, 3, this.zzb, false);
        z.F(parcel, 4, this.zzc, false);
        z.F(parcel, 5, this.zzd, false);
        z.F(parcel, 6, this.zze, false);
        z.F(parcel, 7, this.zzf, false);
        z.F(parcel, 8, this.zzg, false);
        z.F(parcel, 9, this.zzh, false);
        z.t(parcel, 10, this.zzi);
        z.t(parcel, 11, this.zzj);
        z.F(parcel, 12, this.zzk, false);
        z.F(parcel, 13, this.zzl, false);
        z.F(parcel, 14, this.zzm, false);
        z.F(parcel, 15, this.zzn, false);
        z.t(parcel, 16, this.zzo);
        z.F(parcel, 17, this.zzp, false);
        z.L(J, parcel);
    }

    public final zzaic zza(String str) {
        j.e(str);
        this.zzb = str;
        return this;
    }

    public final zzaic zza(boolean z10) {
        this.zzj = false;
        return this;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v10 java.lang.String, still in use, count: 2, list:
          (r1v10 java.lang.String) from 0x0058: IF  (r1v10 java.lang.String) != (null java.lang.String)  -> B:19:0x0052 A[HIDDEN]
          (r1v10 java.lang.String) from 0x0052: PHI (r1v12 java.lang.String) = (r1v10 java.lang.String) binds: [B:24:0x0058] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final java.lang.String zza() {
        /*
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            boolean r1 = r3.zzj
            java.lang.String r2 = "autoCreate"
            r0.put(r2, r1)
            boolean r1 = r3.zzi
            java.lang.String r2 = "returnSecureToken"
            r0.put(r2, r1)
            java.lang.String r1 = r3.zzb
            if (r1 == 0) goto L1c
            java.lang.String r2 = "idToken"
            r0.put(r2, r1)
        L1c:
            java.lang.String r1 = r3.zzg
            if (r1 == 0) goto L25
            java.lang.String r2 = "postBody"
            r0.put(r2, r1)
        L25:
            java.lang.String r1 = r3.zzn
            if (r1 == 0) goto L2e
            java.lang.String r2 = "tenantId"
            r0.put(r2, r1)
        L2e:
            java.lang.String r1 = r3.zzp
            if (r1 == 0) goto L37
            java.lang.String r2 = "pendingToken"
            r0.put(r2, r1)
        L37:
            java.lang.String r1 = r3.zzl
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = r3.zzl
            java.lang.String r2 = "sessionId"
            r0.put(r2, r1)
        L46:
            java.lang.String r1 = r3.zzm
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r2 = "requestUri"
            if (r1 != 0) goto L56
            java.lang.String r1 = r3.zzm
        L52:
            r0.put(r2, r1)
            goto L5b
        L56:
            java.lang.String r1 = r3.zza
            if (r1 == 0) goto L5b
            goto L52
        L5b:
            boolean r1 = r3.zzo
            java.lang.String r2 = "returnIdpCredential"
            r0.put(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzaic.zza():java.lang.String");
    }

    public final zzaic zzb(String str) {
        this.zzn = str;
        return this;
    }

    public final zzaic zzb(boolean z10) {
        this.zzo = true;
        return this;
    }

    public final zzaic zzc(boolean z10) {
        this.zzi = true;
        return this;
    }
}
