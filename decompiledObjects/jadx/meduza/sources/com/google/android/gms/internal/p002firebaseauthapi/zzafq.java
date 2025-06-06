package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
final class zzafq extends zzahe {
    private final String zza;
    private final String zzb;

    public zzafq(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzahe) {
            zzahe zzaheVar = (zzahe) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzaheVar.zzb()) : zzaheVar.zzb() == null) {
                String str2 = this.zzb;
                String zza = zzaheVar.zza();
                if (str2 != null ? str2.equals(zza) : zza == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.zzb;
        return hashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "RecaptchaEnforcementState{provider=" + this.zza + ", enforcementState=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahe
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahe
    public final String zzb() {
        return this.zza;
    }
}
