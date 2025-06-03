package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.f;

/* loaded from: classes.dex */
final class zzafs extends zzahi {
    private String zza;
    private String zzb;
    private String zzc;
    private zzagh zzd;
    private String zze;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi
    public final zzahf zza() {
        String str;
        zzagh zzaghVar;
        String str2;
        String str3 = this.zza;
        if (str3 != null && (str = this.zzc) != null && (zzaghVar = this.zzd) != null && (str2 = this.zze) != null) {
            return new zzafp(str3, this.zzb, str, zzaghVar, str2);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" providerId");
        }
        if (this.zzc == null) {
            sb2.append(" token");
        }
        if (this.zzd == null) {
            sb2.append(" tokenType");
        }
        if (this.zze == null) {
            sb2.append(" idToken");
        }
        throw new IllegalStateException(f.j("Missing required properties:", String.valueOf(sb2)));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi
    public final zzahi zza(zzagh zzaghVar) {
        if (zzaghVar == null) {
            throw new NullPointerException("Null tokenType");
        }
        this.zzd = zzaghVar;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi
    public final zzahi zza(String str) {
        if (str == null) {
            throw new NullPointerException("Null idToken");
        }
        this.zze = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi
    public final zzahi zzb(String str) {
        if (str == null) {
            throw new NullPointerException("Null providerId");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi
    public final zzahi zzc(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahi
    public final zzahi zzd(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.zzc = str;
        return this;
    }
}
