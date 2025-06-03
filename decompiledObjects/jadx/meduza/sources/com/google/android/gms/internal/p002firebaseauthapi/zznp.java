package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zznp extends zzcg {
    private final zzpm zza;

    public zznp(zzpm zzpmVar) {
        this.zza = zzpmVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zznp)) {
            return false;
        }
        zzpm zzpmVar = ((zznp) obj).zza;
        return this.zza.zza().zzd().equals(zzpmVar.zza().zzd()) && this.zza.zza().zzf().equals(zzpmVar.zza().zzf()) && this.zza.zza().zze().equals(zzpmVar.zza().zze());
    }

    public final int hashCode() {
        return Objects.hash(this.zza.zza(), this.zza.zzb());
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.zza.zza().zzf();
        int i10 = zzno.zza[this.zza.zza().zzd().ordinal()];
        objArr[1] = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcg
    public final boolean zza() {
        return this.zza.zza().zzd() != zzxd.RAW;
    }

    public final zzpm zzb() {
        return this.zza;
    }
}
