package com.google.android.gms.internal.p002firebaseauthapi;

import a0.j;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzfy extends zzcr {
    private final zza zza;

    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("CRUNCHY");
        public static final zza zzc = new zza("NO_PREFIX");
        private final String zzd;

        private zza(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    private zzfy(zza zzaVar) {
        this.zza = zzaVar;
    }

    public static zzfy zza(zza zzaVar) {
        return new zzfy(zzaVar);
    }

    public static zzfy zzc() {
        return new zzfy(zza.zzc);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzfy) && ((zzfy) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzfy.class, this.zza);
    }

    public final String toString() {
        return j.j("XChaCha20Poly1305 Parameters (variant: ", String.valueOf(this.zza), ")");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcg
    public final boolean zza() {
        return this.zza != zza.zzc;
    }

    public final zza zzb() {
        return this.zza;
    }
}
